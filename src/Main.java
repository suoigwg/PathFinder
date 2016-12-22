import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.pushingpixels.substance.api.SubstanceLookAndFeel;

import javax.swing.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yingyue on 2016/12/22.
 */
public class Main {

    public static void main(String [] args){

        try
        {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.osLookAndFeelDecorated;
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
        }
        catch(Exception e)
        {

        }

        MainFrame main =   new MainFrame();


    }
}
