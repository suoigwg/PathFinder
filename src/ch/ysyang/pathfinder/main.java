package ch.ysyang.pathfinder;

import ch.ysyang.gen.CPP14Lexer;
import ch.ysyang.gen.CPP14Parser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.LineNumberReader;
import java.util.ArrayList;

/**
 * Created by ysyang on 20/12/2016.
 */
public class main {

    public static int getFileLineNumber(String filePath) throws Exception{
        LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(filePath));
        // it will return the number of characters actually skipped
        lineNumberReader.skip(Long.MAX_VALUE);

        int lineNumber = lineNumberReader.getLineNumber();

        lineNumber++;

        lineNumberReader.close();

        return lineNumber;
    }

    public static int getFirstParenLineno(String filePath) throws Exception{
        LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(filePath));
        String s = lineNumberReader.readLine();
        int FirstParenLineno = 0;

        while (s != null){
            boolean found = false;
            for (int i=0; i<s.length();i++){
                if (s.charAt(i) == '('){
                    found = true;
                    FirstParenLineno = lineNumberReader.getLineNumber();
                }
            }
            if (found){
                break;
            }
            s = lineNumberReader.readLine();
        }

        lineNumberReader.close();
        System.out.println("First ( occurs in line "+FirstParenLineno);
        return FirstParenLineno;
    }

    public static ArrayList<String> getIncludeHeader(String filePath) throws Exception{
        ArrayList<String> headers = new ArrayList<String>();
        LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(filePath));
        String s = lineNumberReader.readLine();

        while (s != null){
            boolean end = false;
            for (int i=0; i<s.length();i++){
                if (s.charAt(i) == ' '){
                    continue;
                }
                else if (s.charAt(i) == '#'){
                    headers.add(s);
                    break;
                }
                    else {
                        end = true;
                        break;
                }
            }
            if (end){
                break;
            }
            s = lineNumberReader.readLine();
        }

        lineNumberReader.close();
        return headers;

    }

    public static int getMainLineNo(String filePath) throws Exception{
        ArrayList<String> headers = new ArrayList<String>();
        LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(filePath));
        String s = lineNumberReader.readLine();
        int mainLineNo = 0;
        while (s != null){
            if (s.indexOf("main") >=0 && s.indexOf("int") >=0){
                mainLineNo = lineNumberReader.getLineNumber();
                break;
            }
            s = lineNumberReader.readLine();
        }
        lineNumberReader.close();
        return mainLineNo;
    }

    public static void main(String args[]) throws Exception {
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
//         if (inputFile != null){
//            is = new FileInputStream(inputFile);
//        }
//
        String filePath = "test/test1.cpp";
        int maxLine = getFileLineNumber(filePath);
        int firstFuncDef = getFirstParenLineno(filePath);
        int mainLineNo = getMainLineNo(filePath);
        ArrayList<String> headers = getIncludeHeader(filePath);
        is  = new FileInputStream(filePath);


        ANTLRInputStream input = new ANTLRInputStream(is);
        CPP14Lexer lexer = new CPP14Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CPP14Parser parser = new CPP14Parser(tokens);
        ParseTree tree = parser.translationunit();
        ParseTreeWalker walker = new ParseTreeWalker();
        PathFinder pf = new PathFinder(maxLine,firstFuncDef, mainLineNo , headers);
        walker.walk(pf, tree);
    }
}
