package ch.ysyang.pathfinder;

import ch.ysyang.gen.CPP14BaseListener;
import ch.ysyang.gen.CPP14Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by ysyang on 20/12/2016.
 */
public class PathFinder extends CPP14BaseListener {
    OutputStream os;
    PrintStream printStream ;
    String toPrint;
    int currentLineNo = 0;
    int maxLineNo;
    int mainLineNo = 0;
    int firstFundef = 0;
    ArrayList<String> headerinfo = null;
    HashSet<Integer> printedLine = null;
    HashSet<Integer> ifLineNo = null;
    HashSet<Integer> elseLineNo = null;
    HashSet<Integer> whileLineNo = null;
    HashSet<Integer> forLineNo = null;
    HashSet<Integer> caseLineNo = null;

    public PathFinder(int ml, int ff,int mainlineno, ArrayList<String> h) throws FileNotFoundException {
         os = new FileOutputStream("ir/ir.cpp");
         printStream = new PrintStream(os);
         toPrint = "print(\" *** \";)";
         firstFundef = ff;
         headerinfo = h;
         maxLineNo = ml;
         mainLineNo = mainlineno;
         printedLine = new HashSet<Integer>();
         ifLineNo = new HashSet<Integer>();
         elseLineNo = new HashSet<Integer>();
         whileLineNo = new HashSet<Integer>();
         forLineNo = new HashSet<Integer>();
         caseLineNo = new HashSet<Integer>();
         for (String s:headerinfo){
             printStream.println(s);
         }

     }

    public  void printLeftBrack(){
        printStream.print("{");
    }

    public void printRightBrack(ParserRuleContext ctx){
        Token startNode = ctx.getStart();
        if (!printedLine.contains(startNode.getLine())){
            printStream.println(" printf(\"%d \", " + startNode.getLine() + ");");
            printedLine.add(startNode.getLine());
        }
        printStream.println("}");
    }


    @Override
    public void enterSingleexprcase(CPP14Parser.SingleexprcaseContext ctx) {

    }

    @Override
    public void exitSingleexprcase(CPP14Parser.SingleexprcaseContext ctx) {
//        printStream.print(toPrint);
    }

    @Override
    public void enterIfstmt(CPP14Parser.IfstmtContext ctx) {
        super.enterIfstmt(ctx);
    }

    @Override
    public void exitIfstmt(CPP14Parser.IfstmtContext ctx) {
        super.exitIfstmt(ctx);
    }

    @Override
    public void enterSwitchblockstatement(CPP14Parser.SwitchblockstatementContext ctx) {
//        printStream.print(toPrint);
    }

    @Override
    public void exitSwitchblockstatement(CPP14Parser.SwitchblockstatementContext ctx) {
        super.exitSwitchblockstatement(ctx);
    }

    @Override
    public void enterIfblockstatement(CPP14Parser.IfblockstatementContext ctx) {
        printLeftBrack();
    }

    @Override
    public void exitIfblockstatement(CPP14Parser.IfblockstatementContext ctx) {
        printRightBrack(ctx);
    }

    @Override
    public void enterElseblockstatement(CPP14Parser.ElseblockstatementContext ctx) {
        printLeftBrack();
    }

    @Override
    public void exitElseblockstatement(CPP14Parser.ElseblockstatementContext ctx) {
        printRightBrack(ctx);
    }

    @Override
    public void enterWhileblockstatement(CPP14Parser.WhileblockstatementContext ctx) {
//        printStream.print(toPrint);
        super.enterWhileblockstatement(ctx);
    }

    @Override
    public void exitWhileblockstatement(CPP14Parser.WhileblockstatementContext ctx) {
        super.exitWhileblockstatement(ctx);
    }

    @Override
    public void enterForblockstatement(CPP14Parser.ForblockstatementContext ctx) {
        printLeftBrack();
        super.enterForblockstatement(ctx);
    }

    @Override
    public void exitForblockstatement(CPP14Parser.ForblockstatementContext ctx) {
        printRightBrack(ctx);
        super.exitForblockstatement(ctx);
    }

    @Override
    public void enterTranslationunit(CPP14Parser.TranslationunitContext ctx) {


        super.enterTranslationunit(ctx);
    }

    @Override
    public void exitTranslationunit(CPP14Parser.TranslationunitContext ctx) {

        printStream.close();
        try {
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("There are "+ifLineNo.size()+" ifs");

        System.out.println("There are "+elseLineNo.size()+" else");

        super.exitTranslationunit(ctx);
    }

    @Override
    public void enterPrimaryexpression(CPP14Parser.PrimaryexpressionContext ctx) {
        super.enterPrimaryexpression(ctx);
    }

    @Override
    public void exitPrimaryexpression(CPP14Parser.PrimaryexpressionContext ctx) {
        super.exitPrimaryexpression(ctx);
    }

    @Override
    public void enterIdexpression(CPP14Parser.IdexpressionContext ctx) {
        super.enterIdexpression(ctx);
    }

    @Override
    public void exitIdexpression(CPP14Parser.IdexpressionContext ctx) {
        super.exitIdexpression(ctx);
    }

    @Override
    public void enterUnqualifiedid(CPP14Parser.UnqualifiedidContext ctx) {
        super.enterUnqualifiedid(ctx);
    }

    @Override
    public void exitUnqualifiedid(CPP14Parser.UnqualifiedidContext ctx) {
        super.exitUnqualifiedid(ctx);
    }

    @Override
    public void enterQualifiedid(CPP14Parser.QualifiedidContext ctx) {
        super.enterQualifiedid(ctx);
    }

    @Override
    public void exitQualifiedid(CPP14Parser.QualifiedidContext ctx) {
        super.exitQualifiedid(ctx);
    }

    @Override
    public void enterNestednamespecifier(CPP14Parser.NestednamespecifierContext ctx) {
        super.enterNestednamespecifier(ctx);
    }

    @Override
    public void exitNestednamespecifier(CPP14Parser.NestednamespecifierContext ctx) {
        super.exitNestednamespecifier(ctx);
    }

    @Override
    public void enterLambdaexpression(CPP14Parser.LambdaexpressionContext ctx) {
        super.enterLambdaexpression(ctx);
    }

    @Override
    public void exitLambdaexpression(CPP14Parser.LambdaexpressionContext ctx) {
        super.exitLambdaexpression(ctx);
    }

    @Override
    public void enterLambdaintroducer(CPP14Parser.LambdaintroducerContext ctx) {
        super.enterLambdaintroducer(ctx);
    }

    @Override
    public void exitLambdaintroducer(CPP14Parser.LambdaintroducerContext ctx) {
        super.exitLambdaintroducer(ctx);
    }

    @Override
    public void enterLambdacapture(CPP14Parser.LambdacaptureContext ctx) {
        super.enterLambdacapture(ctx);
    }

    @Override
    public void exitLambdacapture(CPP14Parser.LambdacaptureContext ctx) {
        super.exitLambdacapture(ctx);
    }

    @Override
    public void enterCapturedefault(CPP14Parser.CapturedefaultContext ctx) {
        super.enterCapturedefault(ctx);
    }

    @Override
    public void exitCapturedefault(CPP14Parser.CapturedefaultContext ctx) {
        super.exitCapturedefault(ctx);
    }

    @Override
    public void enterCapturelist(CPP14Parser.CapturelistContext ctx) {
        super.enterCapturelist(ctx);
    }

    @Override
    public void exitCapturelist(CPP14Parser.CapturelistContext ctx) {
        super.exitCapturelist(ctx);
    }

    @Override
    public void enterCapture(CPP14Parser.CaptureContext ctx) {
        super.enterCapture(ctx);
    }

    @Override
    public void exitCapture(CPP14Parser.CaptureContext ctx) {
        super.exitCapture(ctx);
    }

    @Override
    public void enterSimplecapture(CPP14Parser.SimplecaptureContext ctx) {
        super.enterSimplecapture(ctx);
    }

    @Override
    public void exitSimplecapture(CPP14Parser.SimplecaptureContext ctx) {
        super.exitSimplecapture(ctx);
    }

    @Override
    public void enterInitcapture(CPP14Parser.InitcaptureContext ctx) {
        super.enterInitcapture(ctx);
    }

    @Override
    public void exitInitcapture(CPP14Parser.InitcaptureContext ctx) {
        super.exitInitcapture(ctx);
    }

    @Override
    public void enterLambdadeclarator(CPP14Parser.LambdadeclaratorContext ctx) {
        super.enterLambdadeclarator(ctx);
    }

    @Override
    public void exitLambdadeclarator(CPP14Parser.LambdadeclaratorContext ctx) {
        super.exitLambdadeclarator(ctx);
    }

    @Override
    public void enterPostfixexpression(CPP14Parser.PostfixexpressionContext ctx) {
        super.enterPostfixexpression(ctx);
    }

    @Override
    public void exitPostfixexpression(CPP14Parser.PostfixexpressionContext ctx) {
        super.exitPostfixexpression(ctx);
    }

    @Override
    public void enterExpressionlist(CPP14Parser.ExpressionlistContext ctx) {
        super.enterExpressionlist(ctx);
    }

    @Override
    public void exitExpressionlist(CPP14Parser.ExpressionlistContext ctx) {
        super.exitExpressionlist(ctx);
    }

    @Override
    public void enterPseudodestructorname(CPP14Parser.PseudodestructornameContext ctx) {
        super.enterPseudodestructorname(ctx);
    }

    @Override
    public void exitPseudodestructorname(CPP14Parser.PseudodestructornameContext ctx) {
        super.exitPseudodestructorname(ctx);
    }

    @Override
    public void enterUnaryexpression(CPP14Parser.UnaryexpressionContext ctx) {
        super.enterUnaryexpression(ctx);
    }

    @Override
    public void exitUnaryexpression(CPP14Parser.UnaryexpressionContext ctx) {
        super.exitUnaryexpression(ctx);
    }

    @Override
    public void enterUnaryoperator(CPP14Parser.UnaryoperatorContext ctx) {
        super.enterUnaryoperator(ctx);
    }

    @Override
    public void exitUnaryoperator(CPP14Parser.UnaryoperatorContext ctx) {
        super.exitUnaryoperator(ctx);
    }

    @Override
    public void enterNewexpression(CPP14Parser.NewexpressionContext ctx) {
        super.enterNewexpression(ctx);
    }

    @Override
    public void exitNewexpression(CPP14Parser.NewexpressionContext ctx) {
        super.exitNewexpression(ctx);
    }

    @Override
    public void enterNewplacement(CPP14Parser.NewplacementContext ctx) {
        super.enterNewplacement(ctx);
    }

    @Override
    public void exitNewplacement(CPP14Parser.NewplacementContext ctx) {
        super.exitNewplacement(ctx);
    }

    @Override
    public void enterNewtypeid(CPP14Parser.NewtypeidContext ctx) {
        super.enterNewtypeid(ctx);
    }

    @Override
    public void exitNewtypeid(CPP14Parser.NewtypeidContext ctx) {
        super.exitNewtypeid(ctx);
    }

    @Override
    public void enterNewdeclarator(CPP14Parser.NewdeclaratorContext ctx) {
        super.enterNewdeclarator(ctx);
    }

    @Override
    public void exitNewdeclarator(CPP14Parser.NewdeclaratorContext ctx) {
        super.exitNewdeclarator(ctx);
    }

    @Override
    public void enterNoptrnewdeclarator(CPP14Parser.NoptrnewdeclaratorContext ctx) {
        super.enterNoptrnewdeclarator(ctx);
    }

    @Override
    public void exitNoptrnewdeclarator(CPP14Parser.NoptrnewdeclaratorContext ctx) {
        super.exitNoptrnewdeclarator(ctx);
    }

    @Override
    public void enterNewinitializer(CPP14Parser.NewinitializerContext ctx) {
        super.enterNewinitializer(ctx);
    }

    @Override
    public void exitNewinitializer(CPP14Parser.NewinitializerContext ctx) {
        super.exitNewinitializer(ctx);
    }

    @Override
    public void enterDeleteexpression(CPP14Parser.DeleteexpressionContext ctx) {
        super.enterDeleteexpression(ctx);
    }

    @Override
    public void exitDeleteexpression(CPP14Parser.DeleteexpressionContext ctx) {
        super.exitDeleteexpression(ctx);
    }

    @Override
    public void enterNoexceptexpression(CPP14Parser.NoexceptexpressionContext ctx) {
        super.enterNoexceptexpression(ctx);
    }

    @Override
    public void exitNoexceptexpression(CPP14Parser.NoexceptexpressionContext ctx) {
        super.exitNoexceptexpression(ctx);
    }

    @Override
    public void enterCastexpression(CPP14Parser.CastexpressionContext ctx) {
        super.enterCastexpression(ctx);
    }

    @Override
    public void exitCastexpression(CPP14Parser.CastexpressionContext ctx) {
        super.exitCastexpression(ctx);
    }

    @Override
    public void enterPmexpression(CPP14Parser.PmexpressionContext ctx) {
        super.enterPmexpression(ctx);
    }

    @Override
    public void exitPmexpression(CPP14Parser.PmexpressionContext ctx) {
        super.exitPmexpression(ctx);
    }

    @Override
    public void enterMultiplicativeexpression(CPP14Parser.MultiplicativeexpressionContext ctx) {
        super.enterMultiplicativeexpression(ctx);
    }

    @Override
    public void exitMultiplicativeexpression(CPP14Parser.MultiplicativeexpressionContext ctx) {
        super.exitMultiplicativeexpression(ctx);
    }

    @Override
    public void enterAdditiveexpression(CPP14Parser.AdditiveexpressionContext ctx) {
        super.enterAdditiveexpression(ctx);
    }

    @Override
    public void exitAdditiveexpression(CPP14Parser.AdditiveexpressionContext ctx) {
        super.exitAdditiveexpression(ctx);
    }

    @Override
    public void enterShiftexpression(CPP14Parser.ShiftexpressionContext ctx) {
        super.enterShiftexpression(ctx);
    }

    @Override
    public void exitShiftexpression(CPP14Parser.ShiftexpressionContext ctx) {
        super.exitShiftexpression(ctx);
    }

    @Override
    public void enterRelationalexpression(CPP14Parser.RelationalexpressionContext ctx) {
        super.enterRelationalexpression(ctx);
    }

    @Override
    public void exitRelationalexpression(CPP14Parser.RelationalexpressionContext ctx) {
        super.exitRelationalexpression(ctx);
    }

    @Override
    public void enterEqualityexpression(CPP14Parser.EqualityexpressionContext ctx) {
        super.enterEqualityexpression(ctx);
    }

    @Override
    public void exitEqualityexpression(CPP14Parser.EqualityexpressionContext ctx) {
        super.exitEqualityexpression(ctx);
    }

    @Override
    public void enterAndexpression(CPP14Parser.AndexpressionContext ctx) {
        super.enterAndexpression(ctx);
    }

    @Override
    public void exitAndexpression(CPP14Parser.AndexpressionContext ctx) {
        super.exitAndexpression(ctx);
    }

    @Override
    public void enterExclusiveorexpression(CPP14Parser.ExclusiveorexpressionContext ctx) {
        super.enterExclusiveorexpression(ctx);
    }

    @Override
    public void exitExclusiveorexpression(CPP14Parser.ExclusiveorexpressionContext ctx) {
        super.exitExclusiveorexpression(ctx);
    }

    @Override
    public void enterInclusiveorexpression(CPP14Parser.InclusiveorexpressionContext ctx) {
        super.enterInclusiveorexpression(ctx);
    }

    @Override
    public void exitInclusiveorexpression(CPP14Parser.InclusiveorexpressionContext ctx) {
        super.exitInclusiveorexpression(ctx);
    }

    @Override
    public void enterLogicalandexpression(CPP14Parser.LogicalandexpressionContext ctx) {
        super.enterLogicalandexpression(ctx);
    }

    @Override
    public void exitLogicalandexpression(CPP14Parser.LogicalandexpressionContext ctx) {
        super.exitLogicalandexpression(ctx);
    }

    @Override
    public void enterLogicalorexpression(CPP14Parser.LogicalorexpressionContext ctx) {
        super.enterLogicalorexpression(ctx);
    }

    @Override
    public void exitLogicalorexpression(CPP14Parser.LogicalorexpressionContext ctx) {
        super.exitLogicalorexpression(ctx);
    }

    @Override
    public void enterConditionalexpression(CPP14Parser.ConditionalexpressionContext ctx) {
        super.enterConditionalexpression(ctx);
    }

    @Override
    public void exitConditionalexpression(CPP14Parser.ConditionalexpressionContext ctx) {
        super.exitConditionalexpression(ctx);
    }

    @Override
    public void enterAssignmentexpression(CPP14Parser.AssignmentexpressionContext ctx) {
        super.enterAssignmentexpression(ctx);
    }

    @Override
    public void exitAssignmentexpression(CPP14Parser.AssignmentexpressionContext ctx) {
        super.exitAssignmentexpression(ctx);
    }

    @Override
    public void enterAssignmentoperator(CPP14Parser.AssignmentoperatorContext ctx) {
        super.enterAssignmentoperator(ctx);
    }

    @Override
    public void exitAssignmentoperator(CPP14Parser.AssignmentoperatorContext ctx) {
        super.exitAssignmentoperator(ctx);
    }

    @Override
    public void enterExpression(CPP14Parser.ExpressionContext ctx) {
        super.enterExpression(ctx);
    }

    @Override
    public void exitExpression(CPP14Parser.ExpressionContext ctx) {
        super.exitExpression(ctx);
    }

    @Override
    public void enterConstantexpression(CPP14Parser.ConstantexpressionContext ctx) {
        super.enterConstantexpression(ctx);
    }

    @Override
    public void exitConstantexpression(CPP14Parser.ConstantexpressionContext ctx) {
        super.exitConstantexpression(ctx);
    }

    @Override
    public void enterStatement(CPP14Parser.StatementContext ctx) {
        super.enterStatement(ctx);
    }

    @Override
    public void exitStatement(CPP14Parser.StatementContext ctx) {
        super.exitStatement(ctx);
    }

    @Override
    public void enterLabeledstatement(CPP14Parser.LabeledstatementContext ctx) {
        super.enterLabeledstatement(ctx);
    }

    @Override
    public void exitLabeledstatement(CPP14Parser.LabeledstatementContext ctx) {
        super.exitLabeledstatement(ctx);
    }

    @Override
    public void enterExpressionstatement(CPP14Parser.ExpressionstatementContext ctx) {
        super.enterExpressionstatement(ctx);
    }

    @Override
    public void exitExpressionstatement(CPP14Parser.ExpressionstatementContext ctx) {
        super.exitExpressionstatement(ctx);
    }

    @Override
    public void enterCompoundstatement(CPP14Parser.CompoundstatementContext ctx) {

         super.enterCompoundstatement(ctx);
    }

    @Override
    public void exitCompoundstatement(CPP14Parser.CompoundstatementContext ctx) {
        super.exitCompoundstatement(ctx);
    }

    @Override
    public void enterStatementseq(CPP14Parser.StatementseqContext ctx) {
//        printStream.print(toPrint);
        super.enterStatementseq(ctx);
    }

    @Override
    public void exitStatementseq(CPP14Parser.StatementseqContext ctx) {
        super.exitStatementseq(ctx);
    }

    @Override
    public void enterSelectionstatement(CPP14Parser.SelectionstatementContext ctx) {
        // printStream.print(" ");

        super.enterSelectionstatement(ctx);
    }

    @Override
    public void exitSelectionstatement(CPP14Parser.SelectionstatementContext ctx) {


//        printStream.print(" print(\"hello\") ");
//         super.exitSelectionstatement(ctx);
    }

    @Override
    public void enterCondition(CPP14Parser.ConditionContext ctx) {
        super.enterCondition(ctx);
    }

    @Override
    public void exitCondition(CPP14Parser.ConditionContext ctx) {
        super.exitCondition(ctx);
    }

    @Override
    public void enterIterationstatement(CPP14Parser.IterationstatementContext ctx) {
        super.enterIterationstatement(ctx);
    }

    @Override
    public void exitIterationstatement(CPP14Parser.IterationstatementContext ctx) {
        super.exitIterationstatement(ctx);
    }

    @Override
    public void enterForinitstatement(CPP14Parser.ForinitstatementContext ctx) {
        super.enterForinitstatement(ctx);
    }

    @Override
    public void exitForinitstatement(CPP14Parser.ForinitstatementContext ctx) {
        super.exitForinitstatement(ctx);
    }

    @Override
    public void enterForrangedeclaration(CPP14Parser.ForrangedeclarationContext ctx) {
        super.enterForrangedeclaration(ctx);
    }

    @Override
    public void exitForrangedeclaration(CPP14Parser.ForrangedeclarationContext ctx) {
        super.exitForrangedeclaration(ctx);
    }

    @Override
    public void enterForrangeinitializer(CPP14Parser.ForrangeinitializerContext ctx) {
        super.enterForrangeinitializer(ctx);
    }

    @Override
    public void exitForrangeinitializer(CPP14Parser.ForrangeinitializerContext ctx) {
        super.exitForrangeinitializer(ctx);
    }

    @Override
    public void enterJumpstatement(CPP14Parser.JumpstatementContext ctx) {
        super.enterJumpstatement(ctx);
    }

    @Override
    public void exitJumpstatement(CPP14Parser.JumpstatementContext ctx) {
        super.exitJumpstatement(ctx);
    }

    @Override
    public void enterDeclarationstatement(CPP14Parser.DeclarationstatementContext ctx) {
        super.enterDeclarationstatement(ctx);
    }

    @Override
    public void exitDeclarationstatement(CPP14Parser.DeclarationstatementContext ctx) {
        super.exitDeclarationstatement(ctx);
    }

    @Override
    public void enterDeclarationseq(CPP14Parser.DeclarationseqContext ctx) {
        super.enterDeclarationseq(ctx);
    }

    @Override
    public void exitDeclarationseq(CPP14Parser.DeclarationseqContext ctx) {
        super.exitDeclarationseq(ctx);
    }

    @Override
    public void enterDeclaration(CPP14Parser.DeclarationContext ctx) {
        super.enterDeclaration(ctx);
    }

    @Override
    public void exitDeclaration(CPP14Parser.DeclarationContext ctx) {
        super.exitDeclaration(ctx);
    }

    @Override
    public void enterBlockdeclaration(CPP14Parser.BlockdeclarationContext ctx) {
        super.enterBlockdeclaration(ctx);
    }

    @Override
    public void exitBlockdeclaration(CPP14Parser.BlockdeclarationContext ctx) {
        super.exitBlockdeclaration(ctx);
    }

    @Override
    public void enterAliasdeclaration(CPP14Parser.AliasdeclarationContext ctx) {
        super.enterAliasdeclaration(ctx);
    }

    @Override
    public void exitAliasdeclaration(CPP14Parser.AliasdeclarationContext ctx) {
        super.exitAliasdeclaration(ctx);
    }

    @Override
    public void enterSimpledeclaration(CPP14Parser.SimpledeclarationContext ctx) {
        super.enterSimpledeclaration(ctx);
    }

    @Override
    public void exitSimpledeclaration(CPP14Parser.SimpledeclarationContext ctx) {
        super.exitSimpledeclaration(ctx);
    }

    @Override
    public void enterStatic_assertdeclaration(CPP14Parser.Static_assertdeclarationContext ctx) {
        super.enterStatic_assertdeclaration(ctx);
    }

    @Override
    public void exitStatic_assertdeclaration(CPP14Parser.Static_assertdeclarationContext ctx) {
        super.exitStatic_assertdeclaration(ctx);
    }

    @Override
    public void enterEmptydeclaration(CPP14Parser.EmptydeclarationContext ctx) {
        super.enterEmptydeclaration(ctx);
    }

    @Override
    public void exitEmptydeclaration(CPP14Parser.EmptydeclarationContext ctx) {
        super.exitEmptydeclaration(ctx);
    }

    @Override
    public void enterAttributedeclaration(CPP14Parser.AttributedeclarationContext ctx) {
        super.enterAttributedeclaration(ctx);
    }

    @Override
    public void exitAttributedeclaration(CPP14Parser.AttributedeclarationContext ctx) {
        super.exitAttributedeclaration(ctx);
    }

    @Override
    public void enterDeclspecifier(CPP14Parser.DeclspecifierContext ctx) {
        super.enterDeclspecifier(ctx);
    }

    @Override
    public void exitDeclspecifier(CPP14Parser.DeclspecifierContext ctx) {
        super.exitDeclspecifier(ctx);
    }

    @Override
    public void enterDeclspecifierseq(CPP14Parser.DeclspecifierseqContext ctx) {
        super.enterDeclspecifierseq(ctx);
    }

    @Override
    public void exitDeclspecifierseq(CPP14Parser.DeclspecifierseqContext ctx) {
        super.exitDeclspecifierseq(ctx);
    }

    @Override
    public void enterStorageclassspecifier(CPP14Parser.StorageclassspecifierContext ctx) {
        super.enterStorageclassspecifier(ctx);
    }

    @Override
    public void exitStorageclassspecifier(CPP14Parser.StorageclassspecifierContext ctx) {
        super.exitStorageclassspecifier(ctx);
    }

    @Override
    public void enterFunctionspecifier(CPP14Parser.FunctionspecifierContext ctx) {
        super.enterFunctionspecifier(ctx);
    }

    @Override
    public void exitFunctionspecifier(CPP14Parser.FunctionspecifierContext ctx) {
        super.exitFunctionspecifier(ctx);
    }

    @Override
    public void enterTypedefname(CPP14Parser.TypedefnameContext ctx) {
        super.enterTypedefname(ctx);
    }

    @Override
    public void exitTypedefname(CPP14Parser.TypedefnameContext ctx) {
        super.exitTypedefname(ctx);
    }

    @Override
    public void enterTypespecifier(CPP14Parser.TypespecifierContext ctx) {
        super.enterTypespecifier(ctx);
    }

    @Override
    public void exitTypespecifier(CPP14Parser.TypespecifierContext ctx) {
        super.exitTypespecifier(ctx);
    }

    @Override
    public void enterTrailingtypespecifier(CPP14Parser.TrailingtypespecifierContext ctx) {
        super.enterTrailingtypespecifier(ctx);
    }

    @Override
    public void exitTrailingtypespecifier(CPP14Parser.TrailingtypespecifierContext ctx) {
        super.exitTrailingtypespecifier(ctx);
    }

    @Override
    public void enterTypespecifierseq(CPP14Parser.TypespecifierseqContext ctx) {
        super.enterTypespecifierseq(ctx);
    }

    @Override
    public void exitTypespecifierseq(CPP14Parser.TypespecifierseqContext ctx) {
        super.exitTypespecifierseq(ctx);
    }

    @Override
    public void enterTrailingtypespecifierseq(CPP14Parser.TrailingtypespecifierseqContext ctx) {
        super.enterTrailingtypespecifierseq(ctx);
    }

    @Override
    public void exitTrailingtypespecifierseq(CPP14Parser.TrailingtypespecifierseqContext ctx) {
        super.exitTrailingtypespecifierseq(ctx);
    }

    @Override
    public void enterSimpletypespecifier(CPP14Parser.SimpletypespecifierContext ctx) {
        super.enterSimpletypespecifier(ctx);
    }

    @Override
    public void exitSimpletypespecifier(CPP14Parser.SimpletypespecifierContext ctx) {
        super.exitSimpletypespecifier(ctx);
    }

    @Override
    public void enterTypename(CPP14Parser.TypenameContext ctx) {
        super.enterTypename(ctx);
    }

    @Override
    public void exitTypename(CPP14Parser.TypenameContext ctx) {
        super.exitTypename(ctx);
    }

    @Override
    public void enterDecltypespecifier(CPP14Parser.DecltypespecifierContext ctx) {
        super.enterDecltypespecifier(ctx);
    }

    @Override
    public void exitDecltypespecifier(CPP14Parser.DecltypespecifierContext ctx) {
        super.exitDecltypespecifier(ctx);
    }

    @Override
    public void enterElaboratedtypespecifier(CPP14Parser.ElaboratedtypespecifierContext ctx) {
        super.enterElaboratedtypespecifier(ctx);
    }

    @Override
    public void exitElaboratedtypespecifier(CPP14Parser.ElaboratedtypespecifierContext ctx) {
        super.exitElaboratedtypespecifier(ctx);
    }

    @Override
    public void enterEnumname(CPP14Parser.EnumnameContext ctx) {
        super.enterEnumname(ctx);
    }

    @Override
    public void exitEnumname(CPP14Parser.EnumnameContext ctx) {
        super.exitEnumname(ctx);
    }

    @Override
    public void enterEnumspecifier(CPP14Parser.EnumspecifierContext ctx) {
        super.enterEnumspecifier(ctx);
    }

    @Override
    public void exitEnumspecifier(CPP14Parser.EnumspecifierContext ctx) {
        super.exitEnumspecifier(ctx);
    }

    @Override
    public void enterEnumhead(CPP14Parser.EnumheadContext ctx) {
        super.enterEnumhead(ctx);
    }

    @Override
    public void exitEnumhead(CPP14Parser.EnumheadContext ctx) {
        super.exitEnumhead(ctx);
    }

    @Override
    public void enterOpaqueenumdeclaration(CPP14Parser.OpaqueenumdeclarationContext ctx) {
        super.enterOpaqueenumdeclaration(ctx);
    }

    @Override
    public void exitOpaqueenumdeclaration(CPP14Parser.OpaqueenumdeclarationContext ctx) {
        super.exitOpaqueenumdeclaration(ctx);
    }

    @Override
    public void enterEnumkey(CPP14Parser.EnumkeyContext ctx) {
        super.enterEnumkey(ctx);
    }

    @Override
    public void exitEnumkey(CPP14Parser.EnumkeyContext ctx) {
        super.exitEnumkey(ctx);
    }

    @Override
    public void enterEnumbase(CPP14Parser.EnumbaseContext ctx) {
        super.enterEnumbase(ctx);
    }

    @Override
    public void exitEnumbase(CPP14Parser.EnumbaseContext ctx) {
        super.exitEnumbase(ctx);
    }

    @Override
    public void enterEnumeratorlist(CPP14Parser.EnumeratorlistContext ctx) {
        super.enterEnumeratorlist(ctx);
    }

    @Override
    public void exitEnumeratorlist(CPP14Parser.EnumeratorlistContext ctx) {
        super.exitEnumeratorlist(ctx);
    }

    @Override
    public void enterEnumeratordefinition(CPP14Parser.EnumeratordefinitionContext ctx) {
        super.enterEnumeratordefinition(ctx);
    }

    @Override
    public void exitEnumeratordefinition(CPP14Parser.EnumeratordefinitionContext ctx) {
        super.exitEnumeratordefinition(ctx);
    }

    @Override
    public void enterEnumerator(CPP14Parser.EnumeratorContext ctx) {
        super.enterEnumerator(ctx);
    }

    @Override
    public void exitEnumerator(CPP14Parser.EnumeratorContext ctx) {
        super.exitEnumerator(ctx);
    }

    @Override
    public void enterNamespacename(CPP14Parser.NamespacenameContext ctx) {
        super.enterNamespacename(ctx);
    }

    @Override
    public void exitNamespacename(CPP14Parser.NamespacenameContext ctx) {
        super.exitNamespacename(ctx);
    }

    @Override
    public void enterOriginalnamespacename(CPP14Parser.OriginalnamespacenameContext ctx) {
        super.enterOriginalnamespacename(ctx);
    }

    @Override
    public void exitOriginalnamespacename(CPP14Parser.OriginalnamespacenameContext ctx) {
        super.exitOriginalnamespacename(ctx);
    }

    @Override
    public void enterNamespacedefinition(CPP14Parser.NamespacedefinitionContext ctx) {
        super.enterNamespacedefinition(ctx);
    }

    @Override
    public void exitNamespacedefinition(CPP14Parser.NamespacedefinitionContext ctx) {
        super.exitNamespacedefinition(ctx);
    }

    @Override
    public void enterNamednamespacedefinition(CPP14Parser.NamednamespacedefinitionContext ctx) {
        super.enterNamednamespacedefinition(ctx);
    }

    @Override
    public void exitNamednamespacedefinition(CPP14Parser.NamednamespacedefinitionContext ctx) {
        super.exitNamednamespacedefinition(ctx);
    }

    @Override
    public void enterOriginalnamespacedefinition(CPP14Parser.OriginalnamespacedefinitionContext ctx) {
        super.enterOriginalnamespacedefinition(ctx);
    }

    @Override
    public void exitOriginalnamespacedefinition(CPP14Parser.OriginalnamespacedefinitionContext ctx) {
        super.exitOriginalnamespacedefinition(ctx);
    }

    @Override
    public void enterExtensionnamespacedefinition(CPP14Parser.ExtensionnamespacedefinitionContext ctx) {
        super.enterExtensionnamespacedefinition(ctx);
    }

    @Override
    public void exitExtensionnamespacedefinition(CPP14Parser.ExtensionnamespacedefinitionContext ctx) {
        super.exitExtensionnamespacedefinition(ctx);
    }

    @Override
    public void enterUnnamednamespacedefinition(CPP14Parser.UnnamednamespacedefinitionContext ctx) {
        super.enterUnnamednamespacedefinition(ctx);
    }

    @Override
    public void exitUnnamednamespacedefinition(CPP14Parser.UnnamednamespacedefinitionContext ctx) {
        super.exitUnnamednamespacedefinition(ctx);
    }

    @Override
    public void enterNamespacebody(CPP14Parser.NamespacebodyContext ctx) {
        super.enterNamespacebody(ctx);
    }

    @Override
    public void exitNamespacebody(CPP14Parser.NamespacebodyContext ctx) {
        super.exitNamespacebody(ctx);
    }

    @Override
    public void enterNamespacealias(CPP14Parser.NamespacealiasContext ctx) {
        super.enterNamespacealias(ctx);
    }

    @Override
    public void exitNamespacealias(CPP14Parser.NamespacealiasContext ctx) {
        super.exitNamespacealias(ctx);
    }

    @Override
    public void enterNamespacealiasdefinition(CPP14Parser.NamespacealiasdefinitionContext ctx) {
        super.enterNamespacealiasdefinition(ctx);
    }

    @Override
    public void exitNamespacealiasdefinition(CPP14Parser.NamespacealiasdefinitionContext ctx) {
        super.exitNamespacealiasdefinition(ctx);
    }

    @Override
    public void enterQualifiednamespacespecifier(CPP14Parser.QualifiednamespacespecifierContext ctx) {
        super.enterQualifiednamespacespecifier(ctx);
    }

    @Override
    public void exitQualifiednamespacespecifier(CPP14Parser.QualifiednamespacespecifierContext ctx) {
        super.exitQualifiednamespacespecifier(ctx);
    }

    @Override
    public void enterUsingdeclaration(CPP14Parser.UsingdeclarationContext ctx) {
        super.enterUsingdeclaration(ctx);
    }

    @Override
    public void exitUsingdeclaration(CPP14Parser.UsingdeclarationContext ctx) {
        super.exitUsingdeclaration(ctx);
    }

    @Override
    public void enterUsingdirective(CPP14Parser.UsingdirectiveContext ctx) {
        super.enterUsingdirective(ctx);
    }

    @Override
    public void exitUsingdirective(CPP14Parser.UsingdirectiveContext ctx) {
        super.exitUsingdirective(ctx);
    }

    @Override
    public void enterAsmdefinition(CPP14Parser.AsmdefinitionContext ctx) {
        super.enterAsmdefinition(ctx);
    }

    @Override
    public void exitAsmdefinition(CPP14Parser.AsmdefinitionContext ctx) {
        super.exitAsmdefinition(ctx);
    }

    @Override
    public void enterLinkagespecification(CPP14Parser.LinkagespecificationContext ctx) {
        super.enterLinkagespecification(ctx);
    }

    @Override
    public void exitLinkagespecification(CPP14Parser.LinkagespecificationContext ctx) {
        super.exitLinkagespecification(ctx);
    }

    @Override
    public void enterAttributespecifierseq(CPP14Parser.AttributespecifierseqContext ctx) {
        super.enterAttributespecifierseq(ctx);
    }

    @Override
    public void exitAttributespecifierseq(CPP14Parser.AttributespecifierseqContext ctx) {
        super.exitAttributespecifierseq(ctx);
    }

    @Override
    public void enterAttributespecifier(CPP14Parser.AttributespecifierContext ctx) {
        super.enterAttributespecifier(ctx);
    }

    @Override
    public void exitAttributespecifier(CPP14Parser.AttributespecifierContext ctx) {
        super.exitAttributespecifier(ctx);
    }

    @Override
    public void enterAlignmentspecifier(CPP14Parser.AlignmentspecifierContext ctx) {
        super.enterAlignmentspecifier(ctx);
    }

    @Override
    public void exitAlignmentspecifier(CPP14Parser.AlignmentspecifierContext ctx) {
        super.exitAlignmentspecifier(ctx);
    }

    @Override
    public void enterAttributelist(CPP14Parser.AttributelistContext ctx) {
        super.enterAttributelist(ctx);
    }

    @Override
    public void exitAttributelist(CPP14Parser.AttributelistContext ctx) {
        super.exitAttributelist(ctx);
    }

    @Override
    public void enterAttribute(CPP14Parser.AttributeContext ctx) {
        super.enterAttribute(ctx);
    }

    @Override
    public void exitAttribute(CPP14Parser.AttributeContext ctx) {
        super.exitAttribute(ctx);
    }

    @Override
    public void enterAttributetoken(CPP14Parser.AttributetokenContext ctx) {
        super.enterAttributetoken(ctx);
    }

    @Override
    public void exitAttributetoken(CPP14Parser.AttributetokenContext ctx) {
        super.exitAttributetoken(ctx);
    }

    @Override
    public void enterAttributescopedtoken(CPP14Parser.AttributescopedtokenContext ctx) {
        super.enterAttributescopedtoken(ctx);
    }

    @Override
    public void exitAttributescopedtoken(CPP14Parser.AttributescopedtokenContext ctx) {
        super.exitAttributescopedtoken(ctx);
    }

    @Override
    public void enterAttributenamespace(CPP14Parser.AttributenamespaceContext ctx) {
        super.enterAttributenamespace(ctx);
    }

    @Override
    public void exitAttributenamespace(CPP14Parser.AttributenamespaceContext ctx) {
        super.exitAttributenamespace(ctx);
    }

    @Override
    public void enterAttributeargumentclause(CPP14Parser.AttributeargumentclauseContext ctx) {
        super.enterAttributeargumentclause(ctx);
    }

    @Override
    public void exitAttributeargumentclause(CPP14Parser.AttributeargumentclauseContext ctx) {
        super.exitAttributeargumentclause(ctx);
    }

    @Override
    public void enterBalancedtokenseq(CPP14Parser.BalancedtokenseqContext ctx) {
        super.enterBalancedtokenseq(ctx);
    }

    @Override
    public void exitBalancedtokenseq(CPP14Parser.BalancedtokenseqContext ctx) {
        super.exitBalancedtokenseq(ctx);
    }

    @Override
    public void enterBalancedtoken(CPP14Parser.BalancedtokenContext ctx) {
        super.enterBalancedtoken(ctx);
    }

    @Override
    public void exitBalancedtoken(CPP14Parser.BalancedtokenContext ctx) {
        super.exitBalancedtoken(ctx);
    }

    @Override
    public void enterInitdeclaratorlist(CPP14Parser.InitdeclaratorlistContext ctx) {
        super.enterInitdeclaratorlist(ctx);
    }

    @Override
    public void exitInitdeclaratorlist(CPP14Parser.InitdeclaratorlistContext ctx) {
        super.exitInitdeclaratorlist(ctx);
    }

    @Override
    public void enterInitdeclarator(CPP14Parser.InitdeclaratorContext ctx) {
        super.enterInitdeclarator(ctx);
    }

    @Override
    public void exitInitdeclarator(CPP14Parser.InitdeclaratorContext ctx) {
        super.exitInitdeclarator(ctx);
    }

    @Override
    public void enterDeclarator(CPP14Parser.DeclaratorContext ctx) {
        super.enterDeclarator(ctx);
    }

    @Override
    public void exitDeclarator(CPP14Parser.DeclaratorContext ctx) {
        super.exitDeclarator(ctx);
    }

    @Override
    public void enterPtrdeclarator(CPP14Parser.PtrdeclaratorContext ctx) {
        super.enterPtrdeclarator(ctx);
    }

    @Override
    public void exitPtrdeclarator(CPP14Parser.PtrdeclaratorContext ctx) {
        super.exitPtrdeclarator(ctx);
    }

    @Override
    public void enterNoptrdeclarator(CPP14Parser.NoptrdeclaratorContext ctx) {
        super.enterNoptrdeclarator(ctx);
    }

    @Override
    public void exitNoptrdeclarator(CPP14Parser.NoptrdeclaratorContext ctx) {
        super.exitNoptrdeclarator(ctx);
    }

    @Override
    public void enterParametersandqualifiers(CPP14Parser.ParametersandqualifiersContext ctx) {
        super.enterParametersandqualifiers(ctx);
    }

    @Override
    public void exitParametersandqualifiers(CPP14Parser.ParametersandqualifiersContext ctx) {
        super.exitParametersandqualifiers(ctx);
    }

    @Override
    public void enterTrailingreturntype(CPP14Parser.TrailingreturntypeContext ctx) {
        super.enterTrailingreturntype(ctx);
    }

    @Override
    public void exitTrailingreturntype(CPP14Parser.TrailingreturntypeContext ctx) {
        super.exitTrailingreturntype(ctx);
    }

    @Override
    public void enterPtroperator(CPP14Parser.PtroperatorContext ctx) {
        super.enterPtroperator(ctx);
    }

    @Override
    public void exitPtroperator(CPP14Parser.PtroperatorContext ctx) {
        super.exitPtroperator(ctx);
    }

    @Override
    public void enterCvqualifierseq(CPP14Parser.CvqualifierseqContext ctx) {
        super.enterCvqualifierseq(ctx);
    }

    @Override
    public void exitCvqualifierseq(CPP14Parser.CvqualifierseqContext ctx) {
        super.exitCvqualifierseq(ctx);
    }

    @Override
    public void enterCvqualifier(CPP14Parser.CvqualifierContext ctx) {
        super.enterCvqualifier(ctx);
    }

    @Override
    public void exitCvqualifier(CPP14Parser.CvqualifierContext ctx) {
        super.exitCvqualifier(ctx);
    }

    @Override
    public void enterRefqualifier(CPP14Parser.RefqualifierContext ctx) {
        super.enterRefqualifier(ctx);
    }

    @Override
    public void exitRefqualifier(CPP14Parser.RefqualifierContext ctx) {
        super.exitRefqualifier(ctx);
    }

    @Override
    public void enterDeclaratorid(CPP14Parser.DeclaratoridContext ctx) {
        super.enterDeclaratorid(ctx);
    }

    @Override
    public void exitDeclaratorid(CPP14Parser.DeclaratoridContext ctx) {
        super.exitDeclaratorid(ctx);
    }

    @Override
    public void enterTypeid(CPP14Parser.TypeidContext ctx) {
        super.enterTypeid(ctx);
    }

    @Override
    public void exitTypeid(CPP14Parser.TypeidContext ctx) {
        super.exitTypeid(ctx);
    }

    @Override
    public void enterAbstractdeclarator(CPP14Parser.AbstractdeclaratorContext ctx) {
        super.enterAbstractdeclarator(ctx);
    }

    @Override
    public void exitAbstractdeclarator(CPP14Parser.AbstractdeclaratorContext ctx) {
        super.exitAbstractdeclarator(ctx);
    }

    @Override
    public void enterPtrabstractdeclarator(CPP14Parser.PtrabstractdeclaratorContext ctx) {
        super.enterPtrabstractdeclarator(ctx);
    }

    @Override
    public void exitPtrabstractdeclarator(CPP14Parser.PtrabstractdeclaratorContext ctx) {
        super.exitPtrabstractdeclarator(ctx);
    }

    @Override
    public void enterNoptrabstractdeclarator(CPP14Parser.NoptrabstractdeclaratorContext ctx) {
        super.enterNoptrabstractdeclarator(ctx);
    }

    @Override
    public void exitNoptrabstractdeclarator(CPP14Parser.NoptrabstractdeclaratorContext ctx) {
        super.exitNoptrabstractdeclarator(ctx);
    }

    @Override
    public void enterAbstractpackdeclarator(CPP14Parser.AbstractpackdeclaratorContext ctx) {
        super.enterAbstractpackdeclarator(ctx);
    }

    @Override
    public void exitAbstractpackdeclarator(CPP14Parser.AbstractpackdeclaratorContext ctx) {
        super.exitAbstractpackdeclarator(ctx);
    }

    @Override
    public void enterNoptrabstractpackdeclarator(CPP14Parser.NoptrabstractpackdeclaratorContext ctx) {
        super.enterNoptrabstractpackdeclarator(ctx);
    }

    @Override
    public void exitNoptrabstractpackdeclarator(CPP14Parser.NoptrabstractpackdeclaratorContext ctx) {
        super.exitNoptrabstractpackdeclarator(ctx);
    }

    @Override
    public void enterParameterdeclarationclause(CPP14Parser.ParameterdeclarationclauseContext ctx) {
        super.enterParameterdeclarationclause(ctx);
    }

    @Override
    public void exitParameterdeclarationclause(CPP14Parser.ParameterdeclarationclauseContext ctx) {
        super.exitParameterdeclarationclause(ctx);
    }

    @Override
    public void enterParameterdeclarationlist(CPP14Parser.ParameterdeclarationlistContext ctx) {
        super.enterParameterdeclarationlist(ctx);
    }

    @Override
    public void exitParameterdeclarationlist(CPP14Parser.ParameterdeclarationlistContext ctx) {
        super.exitParameterdeclarationlist(ctx);
    }

    @Override
    public void enterParameterdeclaration(CPP14Parser.ParameterdeclarationContext ctx) {
        super.enterParameterdeclaration(ctx);
    }

    @Override
    public void exitParameterdeclaration(CPP14Parser.ParameterdeclarationContext ctx) {
        super.exitParameterdeclaration(ctx);
    }

    @Override
    public void enterFunctiondefinition(CPP14Parser.FunctiondefinitionContext ctx) {
        super.enterFunctiondefinition(ctx);
    }

    @Override
    public void exitFunctiondefinition(CPP14Parser.FunctiondefinitionContext ctx) {
        super.exitFunctiondefinition(ctx);
    }

    @Override
    public void enterFunctionbody(CPP14Parser.FunctionbodyContext ctx) {
        super.enterFunctionbody(ctx);
    }

    @Override
    public void exitFunctionbody(CPP14Parser.FunctionbodyContext ctx) {
        super.exitFunctionbody(ctx);
    }

    @Override
    public void enterInitializer(CPP14Parser.InitializerContext ctx) {
        super.enterInitializer(ctx);
    }

    @Override
    public void exitInitializer(CPP14Parser.InitializerContext ctx) {
        super.exitInitializer(ctx);
    }

    @Override
    public void enterBraceorequalinitializer(CPP14Parser.BraceorequalinitializerContext ctx) {
        super.enterBraceorequalinitializer(ctx);
    }

    @Override
    public void exitBraceorequalinitializer(CPP14Parser.BraceorequalinitializerContext ctx) {
        super.exitBraceorequalinitializer(ctx);
    }

    @Override
    public void enterInitializerclause(CPP14Parser.InitializerclauseContext ctx) {
        super.enterInitializerclause(ctx);
    }

    @Override
    public void exitInitializerclause(CPP14Parser.InitializerclauseContext ctx) {
        super.exitInitializerclause(ctx);
    }

    @Override
    public void enterInitializerlist(CPP14Parser.InitializerlistContext ctx) {
        super.enterInitializerlist(ctx);
    }

    @Override
    public void exitInitializerlist(CPP14Parser.InitializerlistContext ctx) {
        super.exitInitializerlist(ctx);
    }

    @Override
    public void enterBracedinitlist(CPP14Parser.BracedinitlistContext ctx) {
        super.enterBracedinitlist(ctx);
    }

    @Override
    public void exitBracedinitlist(CPP14Parser.BracedinitlistContext ctx) {
        super.exitBracedinitlist(ctx);
    }

    @Override
    public void enterClassname(CPP14Parser.ClassnameContext ctx) {
        super.enterClassname(ctx);
    }

    @Override
    public void exitClassname(CPP14Parser.ClassnameContext ctx) {
        super.exitClassname(ctx);
    }

    @Override
    public void enterClassspecifier(CPP14Parser.ClassspecifierContext ctx) {
        super.enterClassspecifier(ctx);
    }

    @Override
    public void exitClassspecifier(CPP14Parser.ClassspecifierContext ctx) {
        super.exitClassspecifier(ctx);
    }

    @Override
    public void enterClasshead(CPP14Parser.ClassheadContext ctx) {
        super.enterClasshead(ctx);
    }

    @Override
    public void exitClasshead(CPP14Parser.ClassheadContext ctx) {
        super.exitClasshead(ctx);
    }

    @Override
    public void enterClassheadname(CPP14Parser.ClassheadnameContext ctx) {
        super.enterClassheadname(ctx);
    }

    @Override
    public void exitClassheadname(CPP14Parser.ClassheadnameContext ctx) {
        super.exitClassheadname(ctx);
    }

    @Override
    public void enterClassvirtspecifier(CPP14Parser.ClassvirtspecifierContext ctx) {
        super.enterClassvirtspecifier(ctx);
    }

    @Override
    public void exitClassvirtspecifier(CPP14Parser.ClassvirtspecifierContext ctx) {
        super.exitClassvirtspecifier(ctx);
    }

    @Override
    public void enterClasskey(CPP14Parser.ClasskeyContext ctx) {
        super.enterClasskey(ctx);
    }

    @Override
    public void exitClasskey(CPP14Parser.ClasskeyContext ctx) {
        super.exitClasskey(ctx);
    }

    @Override
    public void enterMemberspecification(CPP14Parser.MemberspecificationContext ctx) {
        super.enterMemberspecification(ctx);
    }

    @Override
    public void exitMemberspecification(CPP14Parser.MemberspecificationContext ctx) {
        super.exitMemberspecification(ctx);
    }

    @Override
    public void enterMemberdeclaration(CPP14Parser.MemberdeclarationContext ctx) {
        super.enterMemberdeclaration(ctx);
    }

    @Override
    public void exitMemberdeclaration(CPP14Parser.MemberdeclarationContext ctx) {
        super.exitMemberdeclaration(ctx);
    }

    @Override
    public void enterMemberdeclaratorlist(CPP14Parser.MemberdeclaratorlistContext ctx) {
        super.enterMemberdeclaratorlist(ctx);
    }

    @Override
    public void exitMemberdeclaratorlist(CPP14Parser.MemberdeclaratorlistContext ctx) {
        super.exitMemberdeclaratorlist(ctx);
    }

    @Override
    public void enterMemberdeclarator(CPP14Parser.MemberdeclaratorContext ctx) {
        super.enterMemberdeclarator(ctx);
    }

    @Override
    public void exitMemberdeclarator(CPP14Parser.MemberdeclaratorContext ctx) {
        super.exitMemberdeclarator(ctx);
    }

    @Override
    public void enterVirtspecifierseq(CPP14Parser.VirtspecifierseqContext ctx) {
        super.enterVirtspecifierseq(ctx);
    }

    @Override
    public void exitVirtspecifierseq(CPP14Parser.VirtspecifierseqContext ctx) {
        super.exitVirtspecifierseq(ctx);
    }

    @Override
    public void enterVirtspecifier(CPP14Parser.VirtspecifierContext ctx) {
        super.enterVirtspecifier(ctx);
    }

    @Override
    public void exitVirtspecifier(CPP14Parser.VirtspecifierContext ctx) {
        super.exitVirtspecifier(ctx);
    }

    @Override
    public void enterPurespecifier(CPP14Parser.PurespecifierContext ctx) {
        super.enterPurespecifier(ctx);
    }

    @Override
    public void exitPurespecifier(CPP14Parser.PurespecifierContext ctx) {
        super.exitPurespecifier(ctx);
    }

    @Override
    public void enterBaseclause(CPP14Parser.BaseclauseContext ctx) {
        super.enterBaseclause(ctx);
    }

    @Override
    public void exitBaseclause(CPP14Parser.BaseclauseContext ctx) {
        super.exitBaseclause(ctx);
    }

    @Override
    public void enterBasespecifierlist(CPP14Parser.BasespecifierlistContext ctx) {
        super.enterBasespecifierlist(ctx);
    }

    @Override
    public void exitBasespecifierlist(CPP14Parser.BasespecifierlistContext ctx) {
        super.exitBasespecifierlist(ctx);
    }

    @Override
    public void enterBasespecifier(CPP14Parser.BasespecifierContext ctx) {
        super.enterBasespecifier(ctx);
    }

    @Override
    public void exitBasespecifier(CPP14Parser.BasespecifierContext ctx) {
        super.exitBasespecifier(ctx);
    }

    @Override
    public void enterClassordecltype(CPP14Parser.ClassordecltypeContext ctx) {
        super.enterClassordecltype(ctx);
    }

    @Override
    public void exitClassordecltype(CPP14Parser.ClassordecltypeContext ctx) {
        super.exitClassordecltype(ctx);
    }

    @Override
    public void enterBasetypespecifier(CPP14Parser.BasetypespecifierContext ctx) {
        super.enterBasetypespecifier(ctx);
    }

    @Override
    public void exitBasetypespecifier(CPP14Parser.BasetypespecifierContext ctx) {
        super.exitBasetypespecifier(ctx);
    }

    @Override
    public void enterAccessspecifier(CPP14Parser.AccessspecifierContext ctx) {
        super.enterAccessspecifier(ctx);
    }

    @Override
    public void exitAccessspecifier(CPP14Parser.AccessspecifierContext ctx) {
        super.exitAccessspecifier(ctx);
    }

    @Override
    public void enterConversionfunctionid(CPP14Parser.ConversionfunctionidContext ctx) {
        super.enterConversionfunctionid(ctx);
    }

    @Override
    public void exitConversionfunctionid(CPP14Parser.ConversionfunctionidContext ctx) {
        super.exitConversionfunctionid(ctx);
    }

    @Override
    public void enterConversiontypeid(CPP14Parser.ConversiontypeidContext ctx) {
        super.enterConversiontypeid(ctx);
    }

    @Override
    public void exitConversiontypeid(CPP14Parser.ConversiontypeidContext ctx) {
        super.exitConversiontypeid(ctx);
    }

    @Override
    public void enterConversiondeclarator(CPP14Parser.ConversiondeclaratorContext ctx) {
        super.enterConversiondeclarator(ctx);
    }

    @Override
    public void exitConversiondeclarator(CPP14Parser.ConversiondeclaratorContext ctx) {
        super.exitConversiondeclarator(ctx);
    }

    @Override
    public void enterCtorinitializer(CPP14Parser.CtorinitializerContext ctx) {
        super.enterCtorinitializer(ctx);
    }

    @Override
    public void exitCtorinitializer(CPP14Parser.CtorinitializerContext ctx) {
        super.exitCtorinitializer(ctx);
    }

    @Override
    public void enterMeminitializerlist(CPP14Parser.MeminitializerlistContext ctx) {
        super.enterMeminitializerlist(ctx);
    }

    @Override
    public void exitMeminitializerlist(CPP14Parser.MeminitializerlistContext ctx) {
        super.exitMeminitializerlist(ctx);
    }

    @Override
    public void enterMeminitializer(CPP14Parser.MeminitializerContext ctx) {
        super.enterMeminitializer(ctx);
    }

    @Override
    public void exitMeminitializer(CPP14Parser.MeminitializerContext ctx) {
        super.exitMeminitializer(ctx);
    }

    @Override
    public void enterMeminitializerid(CPP14Parser.MeminitializeridContext ctx) {
        super.enterMeminitializerid(ctx);
    }

    @Override
    public void exitMeminitializerid(CPP14Parser.MeminitializeridContext ctx) {
        super.exitMeminitializerid(ctx);
    }

    @Override
    public void enterOperatorfunctionid(CPP14Parser.OperatorfunctionidContext ctx) {
        super.enterOperatorfunctionid(ctx);
    }

    @Override
    public void exitOperatorfunctionid(CPP14Parser.OperatorfunctionidContext ctx) {
        super.exitOperatorfunctionid(ctx);
    }

    @Override
    public void enterLiteraloperatorid(CPP14Parser.LiteraloperatoridContext ctx) {
        super.enterLiteraloperatorid(ctx);
    }

    @Override
    public void exitLiteraloperatorid(CPP14Parser.LiteraloperatoridContext ctx) {
        super.exitLiteraloperatorid(ctx);
    }

    @Override
    public void enterTemplatedeclaration(CPP14Parser.TemplatedeclarationContext ctx) {
        super.enterTemplatedeclaration(ctx);
    }

    @Override
    public void exitTemplatedeclaration(CPP14Parser.TemplatedeclarationContext ctx) {
        super.exitTemplatedeclaration(ctx);
    }

    @Override
    public void enterTemplateparameterlist(CPP14Parser.TemplateparameterlistContext ctx) {
        super.enterTemplateparameterlist(ctx);
    }

    @Override
    public void exitTemplateparameterlist(CPP14Parser.TemplateparameterlistContext ctx) {
        super.exitTemplateparameterlist(ctx);
    }

    @Override
    public void enterTemplateparameter(CPP14Parser.TemplateparameterContext ctx) {
        super.enterTemplateparameter(ctx);
    }

    @Override
    public void exitTemplateparameter(CPP14Parser.TemplateparameterContext ctx) {
        super.exitTemplateparameter(ctx);
    }

    @Override
    public void enterTypeparameter(CPP14Parser.TypeparameterContext ctx) {
        super.enterTypeparameter(ctx);
    }

    @Override
    public void exitTypeparameter(CPP14Parser.TypeparameterContext ctx) {
        super.exitTypeparameter(ctx);
    }

    @Override
    public void enterSimpletemplateid(CPP14Parser.SimpletemplateidContext ctx) {
        super.enterSimpletemplateid(ctx);
    }

    @Override
    public void exitSimpletemplateid(CPP14Parser.SimpletemplateidContext ctx) {
        super.exitSimpletemplateid(ctx);
    }

    @Override
    public void enterTemplateid(CPP14Parser.TemplateidContext ctx) {
        super.enterTemplateid(ctx);
    }

    @Override
    public void exitTemplateid(CPP14Parser.TemplateidContext ctx) {
        super.exitTemplateid(ctx);
    }

    @Override
    public void enterTemplatename(CPP14Parser.TemplatenameContext ctx) {
        super.enterTemplatename(ctx);
    }

    @Override
    public void exitTemplatename(CPP14Parser.TemplatenameContext ctx) {
        super.exitTemplatename(ctx);
    }

    @Override
    public void enterTemplateargumentlist(CPP14Parser.TemplateargumentlistContext ctx) {
        super.enterTemplateargumentlist(ctx);
    }

    @Override
    public void exitTemplateargumentlist(CPP14Parser.TemplateargumentlistContext ctx) {
        super.exitTemplateargumentlist(ctx);
    }

    @Override
    public void enterTemplateargument(CPP14Parser.TemplateargumentContext ctx) {
        super.enterTemplateargument(ctx);
    }

    @Override
    public void exitTemplateargument(CPP14Parser.TemplateargumentContext ctx) {
        super.exitTemplateargument(ctx);
    }

    @Override
    public void enterTypenamespecifier(CPP14Parser.TypenamespecifierContext ctx) {
        super.enterTypenamespecifier(ctx);
    }

    @Override
    public void exitTypenamespecifier(CPP14Parser.TypenamespecifierContext ctx) {
        super.exitTypenamespecifier(ctx);
    }

    @Override
    public void enterExplicitinstantiation(CPP14Parser.ExplicitinstantiationContext ctx) {
        super.enterExplicitinstantiation(ctx);
    }

    @Override
    public void exitExplicitinstantiation(CPP14Parser.ExplicitinstantiationContext ctx) {
        super.exitExplicitinstantiation(ctx);
    }

    @Override
    public void enterExplicitspecialization(CPP14Parser.ExplicitspecializationContext ctx) {
        super.enterExplicitspecialization(ctx);
    }

    @Override
    public void exitExplicitspecialization(CPP14Parser.ExplicitspecializationContext ctx) {
        super.exitExplicitspecialization(ctx);
    }

    @Override
    public void enterTryblock(CPP14Parser.TryblockContext ctx) {
        super.enterTryblock(ctx);
    }

    @Override
    public void exitTryblock(CPP14Parser.TryblockContext ctx) {
        super.exitTryblock(ctx);
    }

    @Override
    public void enterFunctiontryblock(CPP14Parser.FunctiontryblockContext ctx) {
        super.enterFunctiontryblock(ctx);
    }

    @Override
    public void exitFunctiontryblock(CPP14Parser.FunctiontryblockContext ctx) {
        super.exitFunctiontryblock(ctx);
    }

    @Override
    public void enterHandlerseq(CPP14Parser.HandlerseqContext ctx) {
        super.enterHandlerseq(ctx);
    }

    @Override
    public void exitHandlerseq(CPP14Parser.HandlerseqContext ctx) {
        super.exitHandlerseq(ctx);
    }

    @Override
    public void enterHandler(CPP14Parser.HandlerContext ctx) {
        super.enterHandler(ctx);
    }

    @Override
    public void exitHandler(CPP14Parser.HandlerContext ctx) {
        super.exitHandler(ctx);
    }

    @Override
    public void enterExceptiondeclaration(CPP14Parser.ExceptiondeclarationContext ctx) {
        super.enterExceptiondeclaration(ctx);
    }

    @Override
    public void exitExceptiondeclaration(CPP14Parser.ExceptiondeclarationContext ctx) {
        super.exitExceptiondeclaration(ctx);
    }

    @Override
    public void enterThrowexpression(CPP14Parser.ThrowexpressionContext ctx) {
        super.enterThrowexpression(ctx);
    }

    @Override
    public void exitThrowexpression(CPP14Parser.ThrowexpressionContext ctx) {
        super.exitThrowexpression(ctx);
    }

    @Override
    public void enterExceptionspecification(CPP14Parser.ExceptionspecificationContext ctx) {
        super.enterExceptionspecification(ctx);
    }

    @Override
    public void exitExceptionspecification(CPP14Parser.ExceptionspecificationContext ctx) {
        super.exitExceptionspecification(ctx);
    }

    @Override
    public void enterDynamicexceptionspecification(CPP14Parser.DynamicexceptionspecificationContext ctx) {
        super.enterDynamicexceptionspecification(ctx);
    }

    @Override
    public void exitDynamicexceptionspecification(CPP14Parser.DynamicexceptionspecificationContext ctx) {
        super.exitDynamicexceptionspecification(ctx);
    }

    @Override
    public void enterTypeidlist(CPP14Parser.TypeidlistContext ctx) {
        super.enterTypeidlist(ctx);
    }

    @Override
    public void exitTypeidlist(CPP14Parser.TypeidlistContext ctx) {
        super.exitTypeidlist(ctx);
    }

    @Override
    public void enterNoexceptspecification(CPP14Parser.NoexceptspecificationContext ctx) {
        super.enterNoexceptspecification(ctx);
    }

    @Override
    public void exitNoexceptspecification(CPP14Parser.NoexceptspecificationContext ctx) {
        super.exitNoexceptspecification(ctx);
    }

    @Override
    public void enterRightShift(CPP14Parser.RightShiftContext ctx) {
        super.enterRightShift(ctx);
    }

    @Override
    public void exitRightShift(CPP14Parser.RightShiftContext ctx) {
        super.exitRightShift(ctx);
    }

    @Override
    public void enterRightShiftAssign(CPP14Parser.RightShiftAssignContext ctx) {
        super.enterRightShiftAssign(ctx);
    }

    @Override
    public void exitRightShiftAssign(CPP14Parser.RightShiftAssignContext ctx) {
        super.exitRightShiftAssign(ctx);
    }

    @Override
    public void enterOperator(CPP14Parser.OperatorContext ctx) {
        super.enterOperator(ctx);
    }

    @Override
    public void exitOperator(CPP14Parser.OperatorContext ctx) {
        super.exitOperator(ctx);
    }

    @Override
    public void enterLiteral(CPP14Parser.LiteralContext ctx) {
        super.enterLiteral(ctx);
    }

    @Override
    public void exitLiteral(CPP14Parser.LiteralContext ctx) {
        super.exitLiteral(ctx);
    }

    @Override
    public void enterBooleanliteral(CPP14Parser.BooleanliteralContext ctx) {
        super.enterBooleanliteral(ctx);
    }

    @Override
    public void exitBooleanliteral(CPP14Parser.BooleanliteralContext ctx) {
        super.exitBooleanliteral(ctx);
    }

    @Override
    public void enterPointerliteral(CPP14Parser.PointerliteralContext ctx) {
        super.enterPointerliteral(ctx);
    }

    @Override
    public void exitPointerliteral(CPP14Parser.PointerliteralContext ctx) {
        super.exitPointerliteral(ctx);
    }

    @Override
    public void enterUserdefinedliteral(CPP14Parser.UserdefinedliteralContext ctx) {
        super.enterUserdefinedliteral(ctx);
    }

    @Override
    public void exitUserdefinedliteral(CPP14Parser.UserdefinedliteralContext ctx) {
        super.exitUserdefinedliteral(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
     //  System.out.println(ctx.getText());
//        int i = ctx.getChildCount();
//        for(int j =0 ; j<i;j++)
//        printStream.print(ctx.getChild(j).toString());
     }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        Token tk= node.getSymbol();
        if (currentLineNo < tk.getLine()) {
//            if (currentLineNo == mainLineNo){
//                printStream.println("freopen(\".\\ir.c\",\"w\",stdout);");
//            }
            if (tk.getLine() > firstFundef && tk.getLine() < maxLineNo && !printedLine.contains(currentLineNo)){
                printStream.println(" printf(\"%d \", " + currentLineNo + ");");
                printedLine.add(currentLineNo);
            }

            currentLineNo = tk.getLine();
        }

        if (tk.getText().equals("if")) {
            ifLineNo.add(tk.getLine());
        }

        if(tk.getText().equals("else")){
            elseLineNo.add(tk.getLine());
        }

        if (tk.getText().equals("while")){
            whileLineNo.add(tk.getLine());
        }

        if (tk.getText().equals("for")){
            forLineNo.add(tk.getLine());
        }

        if (tk.getText().equals("case")){
            caseLineNo.add(tk.getLine());
        }

        if (tk.getText() != "<EOF>"){
            if(tk.getText().equals("<") || tk.getText().equals(">")){
                printStream.print(tk.getText());
            }
            else{
                printStream.print(tk.getText()+" ");

            }
        }


//        printStream.print(tk.getLine()+" ");

        //  super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


}
