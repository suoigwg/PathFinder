package ch.ysyang.pathfinder;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.Trees;
import ch.ysyang.gen.*;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by ysyang on 20/12/2016.
 */
public class main {
    public static void main(String args[]) throws Exception {
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null){
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);
        CPP14Lexer lexer = new CPP14Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CPP14Parser parser = new CPP14Parser(tokens);
        ParseTree tree = parser.translationunit();
        ParseTreeWalker walker = new ParseTreeWalker();
        PathFinder pf = new PathFinder();
        walker.walk(pf, tree);
    }
}
