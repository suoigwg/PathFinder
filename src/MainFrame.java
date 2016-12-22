import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yingyue on 2016/12/16.
 */
public class MainFrame extends JFrame {
    String current_open_path;
    String current_run_path;
    String current_compile_path;
    String codesToRun;
    List testDataList;
    JTextArea textArea;
    JTextArea outputArea;
    UsePathFinder upf;
    boolean isSetTestData;
    //BayesHandle bayesHandle;
    public MainFrame() throws HeadlessException {
      //  bayesHandle = new BayesHandle();
        testDataList = new ArrayList<String>();
        isSetTestData =false;
        current_open_path = null;
        upf = new UsePathFinder();
        JPanel jpanel  = new JPanel();
        textArea  = new JTextArea(30,50);
        outputArea  =new JTextArea(10,50);
        jpanel.setLayout(new BorderLayout());
        JScrollPane textPanel =  new JScrollPane(textArea);
        //textPanel.setRowHeaderView(new LineNumberHeaderView());
        jpanel.add(textPanel,BorderLayout.CENTER);
        jpanel.add(new JScrollPane(outputArea),BorderLayout.SOUTH);
        this.add(jpanel);

        JPanel NorthPanel =  new JPanel();
        JButton compileandRun =  new JButton("Compile&run");
        compileandRun.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getCodesSelected();
                //String type =  bayesHandle.suspectType(codesToRun);
               // outputArea.append("判断类型： "+type+"\n"+"output:\n");
                String type = "C++";
                writeTempFiles(type);
                compileProgram(type);


                try {
                    Thread.sleep(500);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }

                runProgram(type);
            }
        });
        JButton open =  new JButton("open");
        open.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String path =  openJFileChooser("open",0);
              if(path!= null){

                  try {
                      InputStream is  = new FileInputStream(path);
                      BufferedReader br = new BufferedReader(new InputStreamReader(is));
                      String line = null;
                      StringBuffer buffer = new StringBuffer();
                      while((line = br.readLine())!=null){
                          buffer.append(line+"\n");
                      }

                      textArea.setText(buffer.toString());
                      br.close();
                      is.close();

                  } catch (IOException e1) {
                      e1.printStackTrace();
                  }

                  current_open_path = path;



              }
            }
        });
        JButton test = new JButton("test");
        test.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if(isSetTestData ==false){
                        JOptionPane.showMessageDialog(null,"Not Found TestData");
                        return;
                    }


                try {

                    upf.processsFile(current_open_path);
                    File file= new File("ir/ir.cpp");
                    current_open_path =  file.getAbsolutePath();
                    compileProgram("C++");
                    HashSet<Integer> h = new HashSet<Integer>();
                    for(int i =0 ;i<testDataList.size();i++) {
                        HashSet<Integer> temp =testRunProgram((String)testDataList.get(i), "C++");
                        h.addAll(temp);
                        upf.computeBranchCoverage(temp);
                    }
                    highLight(h);
                    double branchCoverageRate = upf.getBranchCoverage();
                    outputArea.append("分支覆盖率:  "+branchCoverageRate*100+"%\n");

                    testDataList.clear();
                    isSetTestData =false;

                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });
        JButton setTestData = new JButton("setTestData");
        setTestData.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List filepathList  = openTestDate("open",0);
                if(filepathList.size()==0)
                    return;
                isSetTestData = true;
                for(int i=0; i<filepathList.size();i++){
                  String filePath = (String) filepathList.get(i);
                    try {
                        InputStream is  = new FileInputStream(filePath);
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        String line = null;
                        StringBuffer buffer = new StringBuffer();
                        while((line = br.readLine())!=null){
                            buffer.append(line+"\n");
                        }
                        testDataList.add(buffer.toString());

                        br.close();
                        is.close();

                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }


            }
        });
        NorthPanel.add(compileandRun);
        NorthPanel.add(test);
        NorthPanel.add(setTestData);
        NorthPanel.add(open);

        jpanel.add(NorthPanel,BorderLayout.NORTH);
        this.setSize(800,600);
        this.setVisible(true);
    }
    private boolean compileProgram(String type){

        if(current_open_path == null)
            return false;
        int count =  current_open_path.length();
        for(int i = count-1; i >0 ;i--){
         char a = current_open_path.charAt(i);
            if(a=='.'){
                current_compile_path = current_open_path.substring(0,i);
                break;
            }
        }
        if(current_compile_path!=null){
            String compileCommand = null;
            switch (type){

                case"C++":
                    compileCommand =  "g++ "+current_open_path+" -o "+current_compile_path;
                    break;
                case "Java":
                    compileCommand = "javac "+current_open_path;
                    break;
                case "Python":
                    current_compile_path = current_open_path;
                    compileCommand = null;
                    break;
                default:
                    compileCommand = "g++ "+current_open_path+" -o "+current_compile_path;
            }


            try {
                if(compileCommand==null){
                    current_run_path = current_compile_path;
                    current_compile_path  = null;
                    return  true;
                }
                Process sProgress =  Runtime.getRuntime().exec(compileCommand);
                current_run_path = current_compile_path;
                current_compile_path  = null;
                InputStream in =  sProgress.getErrorStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String line = null;
                StringBuffer buffer = new StringBuffer();
                while((line = br.readLine())!=null){
                    buffer.append(line+"\n");
                }
                outputArea.append(buffer.toString());
                in.close();
                br.close();
                sProgress.destroy();

            } catch (IOException e) {
                e.printStackTrace();
            }

            return true;
        }

        return false;
    }
    public void highLight(HashSet<Integer> hs) throws BadLocationException {
        int lineNumber;
        DefaultHighlighter h  = (DefaultHighlighter) textArea.getHighlighter();
        MyHighLightPainter myHighLightPainter = new MyHighLightPainter(new Color(255, 247, 104));
        h.removeAllHighlights();

        if(hs==null)
            return;
        Iterator iterator = hs.iterator();
        while (iterator.hasNext()){
            lineNumber = (int)iterator.next();
            lineNumber = lineNumber>0?lineNumber:-lineNumber;
            lineNumber -=1;
           int start = textArea.getLineStartOffset(lineNumber);
           int end = textArea.getLineEndOffset(lineNumber);
           System.out.println("start "+start+" end "+end);
           h.addHighlight(start,end,myHighLightPainter);
        }

    }
    public String getCodesSelected(){

        codesToRun  =  textArea.getSelectedText();
        if(codesToRun==null){
            codesToRun  = textArea.getText();
        }

        return codesToRun;
    }
    public String getCodesToRun(){
        return codesToRun;
    }


    public void writeTempFiles(String type){

        String postfix = null;
        String fileName  = "temp1";

        switch (type){
            case "C++":
                postfix = "cpp";
                break;
            case "Java":
                fileName = getJavaClassName();
                postfix = "java";
                break;
            case "Python":
                postfix  = "py";
                break;
            default:
                postfix = "cpp";
        }

        String fileAddress  = "codes/"+fileName+"." + postfix;

        try {
            File file = new File(fileAddress);
            OutputStream os = new FileOutputStream(file);
            PrintStream printStream = new PrintStream(os);
            printStream.print(codesToRun);
            printStream.close();
            os.close();
            codesToRun = null;

            current_open_path = file.getAbsolutePath();
            System.out.println(current_open_path);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public String getJavaClassName(){
        if(codesToRun!=null){
            String temp = new String(codesToRun);
            Pattern p  = Pattern.compile("(public class\\s[^\\s{]*)");
            Matcher m = p.matcher(codesToRun);
            String result = null;

            m.find();
            result =  m.group();
            result = result.substring(13,result.length());
            System.out.println(result);
            return result;
        }
        return null;
    }
    private void runProgram(String type){
        try {
            String runCommand;
            String name = null;
            String classPath = null;
            for(int i=current_run_path.length()-1;i>0;i--){
             char  ch  = current_run_path.charAt(i);
             if(ch=='/'){
                 name = current_run_path.substring(i+1,current_run_path.length());
                 classPath = current_run_path.substring(0,i+1);
                 break;
             }
            }
            switch (type){

                case"C++":
                    runCommand =  current_run_path;
                    break;
                case "Java":
                    //java -cp /Users/yingyue/Documents/JAVA/Executer/codes/ JHello
                    runCommand = "java -cp "+classPath+" "+name;
                    break;
                case "Python":
                    runCommand = "python "+current_run_path;
                    break;
                default:
                    runCommand =  current_run_path;

            }
            Process sProgress =  Runtime.getRuntime().exec(runCommand);
            InputStream in =  sProgress.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String line = null;
            StringBuffer buffer = new StringBuffer();
            while((line = br.readLine())!=null){
                buffer.append(line+"\n");
            }
            outputArea.append(buffer.toString());
            in.close();
            br.close();
            sProgress.destroy();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public HashSet<Integer> testRunProgram(String input,String type){


        try {
            String runCommand;
            String name = null;
            String classPath = null;
            for(int i=current_run_path.length()-1;i>0;i--){
                char  ch  = current_run_path.charAt(i);
                if(ch=='/'){
                    name = current_run_path.substring(i+1,current_run_path.length());
                    classPath = current_run_path.substring(0,i+1);
                    break;
                }
            }
            switch (type){

                case"C++":
                    runCommand =  current_run_path;
                    break;
                case "Java":
                    //java -cp /Users/yingyue/Documents/JAVA/Executer/codes/ JHello
                    runCommand = "java -cp "+classPath+" "+name;
                    break;
                case "Python":
                    runCommand = "python "+current_run_path;
                    break;
                default:
                    runCommand =  current_run_path;

            }
            Process sProgress =  Runtime.getRuntime().exec(runCommand);
            OutputStream os = sProgress.getOutputStream();
            PrintStream ps = new PrintStream(os);
            ps.print(input);
            os.close();
            ps.close();
            InputStream in =  sProgress.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String line = null;
            StringBuffer buffer = new StringBuffer();
            while((line = br.readLine())!=null){
                buffer.append(line+"\n");
            }
           
            in.close();
            br.close();
            sProgress.destroy();

            HashSet<Integer> h = getHighLightLineNumbers(buffer.toString());

            return h;


    } catch (IOException e) {
        e.printStackTrace();
    }
            return null;
    }
    //assume numbers in put are all lineNumbers.
    public HashSet<Integer> getHighLightLineNumbers(String output){

        HashSet<Integer> h = new HashSet<Integer>();
        int num_start;
        int num_end;
        Pattern p  = Pattern.compile("\\s*?-?[0-9]+");
        Matcher m = p.matcher(output);
        String result = null;
        int num;
        while(m.find())
        {
            result  = m.group();
            result = result.trim();
            System.out.println(result);
            num = Integer.parseInt(result);
            h.add(num);
        }

        return  h;

    }
    private String openJFileChooser(String name,int  type){
        //String current_directory="src/record/";
        String current_directory   = "/Users/yingyue/Desktop/testData";
        JFileChooser jFileChooser=new JFileChooser();
        File current_directory_file=new File(current_directory);
        jFileChooser.setCurrentDirectory(null);
        if(current_directory_file.exists()){
            jFileChooser.setCurrentDirectory(new File(current_directory));
        }

        jFileChooser.setFileSelectionMode(type);
        jFileChooser.showDialog(new JLabel(), name);

        File file=jFileChooser.getSelectedFile();
        if(file==null){
            return null;
        }
        String temp=file.getAbsolutePath();
        return temp;
    }
    private List openTestDate (String name, int  type){
        //String current_directory="src/record/";
        String current_directory   = "/Users/yingyue/Desktop/testData/";
        JFileChooser jFileChooser=new JFileChooser();
        jFileChooser.setMultiSelectionEnabled(true);
        File current_directory_file=new File(current_directory);
        jFileChooser.setCurrentDirectory(null);
        if(current_directory_file.exists()){
            jFileChooser.setCurrentDirectory(new File(current_directory));
        }

        jFileChooser.setFileSelectionMode(type);
        jFileChooser.showDialog(new JLabel(), name);

        File[] files=jFileChooser.getSelectedFiles();
        if(files==null){
            return null;
        }
        List list = new ArrayList<String>();
        for(File f : files)
        list.add(f.getAbsolutePath());

        return list;
    }
}
