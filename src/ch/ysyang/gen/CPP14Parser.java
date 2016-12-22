// Generated from /Users/ysyang/WorkSpace/PathFinder/grammar/CPP14.g4 by ANTLR 4.6
package ch.ysyang.gen;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CPP14Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MultiLineMacro=1, Directive=2, Alignas=3, Alignof=4, Asm=5, Auto=6, Bool=7, 
		Break=8, Case=9, Catch=10, Char=11, Char16=12, Char32=13, Class=14, Const=15, 
		Constexpr=16, Const_cast=17, Continue=18, Decltype=19, Default=20, Delete=21, 
		Do=22, Double=23, Dynamic_cast=24, Else=25, Enum=26, Explicit=27, Export=28, 
		Extern=29, False=30, Final=31, Float=32, For=33, Friend=34, Goto=35, If=36, 
		Inline=37, Int=38, Long=39, Mutable=40, Namespace=41, New=42, Noexcept=43, 
		Nullptr=44, Operator=45, Override=46, Private=47, Protected=48, Public=49, 
		Register=50, Reinterpret_cast=51, Return=52, Short=53, Signed=54, Sizeof=55, 
		Static=56, Static_assert=57, Static_cast=58, Struct=59, Switch=60, Template=61, 
		This=62, Thread_local=63, Throw=64, True=65, Try=66, Typedef=67, Typeid=68, 
		Typename=69, Union=70, Unsigned=71, Using=72, Virtual=73, Void=74, Volatile=75, 
		Wchar=76, While=77, LeftParen=78, RightParen=79, LeftBracket=80, RightBracket=81, 
		LeftBrace=82, RightBrace=83, Plus=84, Minus=85, Star=86, Div=87, Mod=88, 
		Caret=89, And=90, Or=91, Tilde=92, Not=93, Assign=94, Less=95, Greater=96, 
		PlusAssign=97, MinusAssign=98, StarAssign=99, DivAssign=100, ModAssign=101, 
		XorAssign=102, AndAssign=103, OrAssign=104, LeftShift=105, LeftShiftAssign=106, 
		Equal=107, NotEqual=108, LessEqual=109, GreaterEqual=110, AndAnd=111, 
		OrOr=112, PlusPlus=113, MinusMinus=114, Comma=115, ArrowStar=116, Arrow=117, 
		Question=118, Colon=119, Doublecolon=120, Semi=121, Dot=122, DotStar=123, 
		Ellipsis=124, Identifier=125, Integerliteral=126, Decimalliteral=127, 
		Octalliteral=128, Hexadecimalliteral=129, Binaryliteral=130, Integersuffix=131, 
		Characterliteral=132, Floatingliteral=133, Stringliteral=134, Userdefinedintegerliteral=135, 
		Userdefinedfloatingliteral=136, Userdefinedstringliteral=137, Userdefinedcharacterliteral=138, 
		Whitespace=139, Newline=140, BlockComment=141, LineComment=142;
	public static final int
		RULE_translationunit = 0, RULE_primaryexpression = 1, RULE_idexpression = 2, 
		RULE_unqualifiedid = 3, RULE_qualifiedid = 4, RULE_nestednamespecifier = 5, 
		RULE_lambdaexpression = 6, RULE_lambdaintroducer = 7, RULE_lambdacapture = 8, 
		RULE_capturedefault = 9, RULE_capturelist = 10, RULE_capture = 11, RULE_simplecapture = 12, 
		RULE_initcapture = 13, RULE_lambdadeclarator = 14, RULE_postfixexpression = 15, 
		RULE_expressionlist = 16, RULE_pseudodestructorname = 17, RULE_unaryexpression = 18, 
		RULE_unaryoperator = 19, RULE_newexpression = 20, RULE_newplacement = 21, 
		RULE_newtypeid = 22, RULE_newdeclarator = 23, RULE_noptrnewdeclarator = 24, 
		RULE_newinitializer = 25, RULE_deleteexpression = 26, RULE_noexceptexpression = 27, 
		RULE_castexpression = 28, RULE_pmexpression = 29, RULE_multiplicativeexpression = 30, 
		RULE_additiveexpression = 31, RULE_shiftexpression = 32, RULE_relationalexpression = 33, 
		RULE_equalityexpression = 34, RULE_andexpression = 35, RULE_exclusiveorexpression = 36, 
		RULE_inclusiveorexpression = 37, RULE_logicalandexpression = 38, RULE_logicalorexpression = 39, 
		RULE_conditionalexpression = 40, RULE_assignmentexpression = 41, RULE_assignmentoperator = 42, 
		RULE_expression = 43, RULE_constantexpression = 44, RULE_statement = 45, 
		RULE_labeledstatement = 46, RULE_singleexprcase = 47, RULE_expressionstatement = 48, 
		RULE_compoundstatement = 49, RULE_statementseq = 50, RULE_selectionstatement = 51, 
		RULE_switchblockstatement = 52, RULE_ifblockstatement = 53, RULE_elseblockstatement = 54, 
		RULE_condition = 55, RULE_iterationstatement = 56, RULE_whileblockstatement = 57, 
		RULE_forblockstatement = 58, RULE_forinitstatement = 59, RULE_forrangedeclaration = 60, 
		RULE_forrangeinitializer = 61, RULE_jumpstatement = 62, RULE_declarationstatement = 63, 
		RULE_declarationseq = 64, RULE_declaration = 65, RULE_blockdeclaration = 66, 
		RULE_aliasdeclaration = 67, RULE_simpledeclaration = 68, RULE_static_assertdeclaration = 69, 
		RULE_emptydeclaration = 70, RULE_attributedeclaration = 71, RULE_declspecifier = 72, 
		RULE_declspecifierseq = 73, RULE_storageclassspecifier = 74, RULE_functionspecifier = 75, 
		RULE_typedefname = 76, RULE_typespecifier = 77, RULE_trailingtypespecifier = 78, 
		RULE_typespecifierseq = 79, RULE_trailingtypespecifierseq = 80, RULE_simpletypespecifier = 81, 
		RULE_typename = 82, RULE_decltypespecifier = 83, RULE_elaboratedtypespecifier = 84, 
		RULE_enumname = 85, RULE_enumspecifier = 86, RULE_enumhead = 87, RULE_opaqueenumdeclaration = 88, 
		RULE_enumkey = 89, RULE_enumbase = 90, RULE_enumeratorlist = 91, RULE_enumeratordefinition = 92, 
		RULE_enumerator = 93, RULE_namespacename = 94, RULE_originalnamespacename = 95, 
		RULE_namespacedefinition = 96, RULE_namednamespacedefinition = 97, RULE_originalnamespacedefinition = 98, 
		RULE_extensionnamespacedefinition = 99, RULE_unnamednamespacedefinition = 100, 
		RULE_namespacebody = 101, RULE_namespacealias = 102, RULE_namespacealiasdefinition = 103, 
		RULE_qualifiednamespacespecifier = 104, RULE_usingdeclaration = 105, RULE_usingdirective = 106, 
		RULE_asmdefinition = 107, RULE_linkagespecification = 108, RULE_attributespecifierseq = 109, 
		RULE_attributespecifier = 110, RULE_alignmentspecifier = 111, RULE_attributelist = 112, 
		RULE_attribute = 113, RULE_attributetoken = 114, RULE_attributescopedtoken = 115, 
		RULE_attributenamespace = 116, RULE_attributeargumentclause = 117, RULE_balancedtokenseq = 118, 
		RULE_balancedtoken = 119, RULE_initdeclaratorlist = 120, RULE_initdeclarator = 121, 
		RULE_declarator = 122, RULE_ptrdeclarator = 123, RULE_noptrdeclarator = 124, 
		RULE_parametersandqualifiers = 125, RULE_trailingreturntype = 126, RULE_ptroperator = 127, 
		RULE_cvqualifierseq = 128, RULE_cvqualifier = 129, RULE_refqualifier = 130, 
		RULE_declaratorid = 131, RULE_typeid = 132, RULE_abstractdeclarator = 133, 
		RULE_ptrabstractdeclarator = 134, RULE_noptrabstractdeclarator = 135, 
		RULE_abstractpackdeclarator = 136, RULE_noptrabstractpackdeclarator = 137, 
		RULE_parameterdeclarationclause = 138, RULE_parameterdeclarationlist = 139, 
		RULE_parameterdeclaration = 140, RULE_functiondefinition = 141, RULE_functionbody = 142, 
		RULE_initializer = 143, RULE_braceorequalinitializer = 144, RULE_initializerclause = 145, 
		RULE_initializerlist = 146, RULE_bracedinitlist = 147, RULE_classname = 148, 
		RULE_classspecifier = 149, RULE_classhead = 150, RULE_classheadname = 151, 
		RULE_classvirtspecifier = 152, RULE_classkey = 153, RULE_memberspecification = 154, 
		RULE_memberdeclaration = 155, RULE_memberdeclaratorlist = 156, RULE_memberdeclarator = 157, 
		RULE_virtspecifierseq = 158, RULE_virtspecifier = 159, RULE_purespecifier = 160, 
		RULE_baseclause = 161, RULE_basespecifierlist = 162, RULE_basespecifier = 163, 
		RULE_classordecltype = 164, RULE_basetypespecifier = 165, RULE_accessspecifier = 166, 
		RULE_conversionfunctionid = 167, RULE_conversiontypeid = 168, RULE_conversiondeclarator = 169, 
		RULE_ctorinitializer = 170, RULE_meminitializerlist = 171, RULE_meminitializer = 172, 
		RULE_meminitializerid = 173, RULE_operatorfunctionid = 174, RULE_literaloperatorid = 175, 
		RULE_templatedeclaration = 176, RULE_templateparameterlist = 177, RULE_templateparameter = 178, 
		RULE_typeparameter = 179, RULE_simpletemplateid = 180, RULE_templateid = 181, 
		RULE_templatename = 182, RULE_templateargumentlist = 183, RULE_templateargument = 184, 
		RULE_typenamespecifier = 185, RULE_explicitinstantiation = 186, RULE_explicitspecialization = 187, 
		RULE_tryblock = 188, RULE_functiontryblock = 189, RULE_handlerseq = 190, 
		RULE_handler = 191, RULE_exceptiondeclaration = 192, RULE_throwexpression = 193, 
		RULE_exceptionspecification = 194, RULE_dynamicexceptionspecification = 195, 
		RULE_typeidlist = 196, RULE_noexceptspecification = 197, RULE_rightShift = 198, 
		RULE_rightShiftAssign = 199, RULE_operator = 200, RULE_literal = 201, 
		RULE_booleanliteral = 202, RULE_pointerliteral = 203, RULE_userdefinedliteral = 204;
	public static final String[] ruleNames = {
		"translationunit", "primaryexpression", "idexpression", "unqualifiedid", 
		"qualifiedid", "nestednamespecifier", "lambdaexpression", "lambdaintroducer", 
		"lambdacapture", "capturedefault", "capturelist", "capture", "simplecapture", 
		"initcapture", "lambdadeclarator", "postfixexpression", "expressionlist", 
		"pseudodestructorname", "unaryexpression", "unaryoperator", "newexpression", 
		"newplacement", "newtypeid", "newdeclarator", "noptrnewdeclarator", "newinitializer", 
		"deleteexpression", "noexceptexpression", "castexpression", "pmexpression", 
		"multiplicativeexpression", "additiveexpression", "shiftexpression", "relationalexpression", 
		"equalityexpression", "andexpression", "exclusiveorexpression", "inclusiveorexpression", 
		"logicalandexpression", "logicalorexpression", "conditionalexpression", 
		"assignmentexpression", "assignmentoperator", "expression", "constantexpression", 
		"statement", "labeledstatement", "singleexprcase", "expressionstatement", 
		"compoundstatement", "statementseq", "selectionstatement", "switchblockstatement", 
		"ifblockstatement", "elseblockstatement", "condition", "iterationstatement", 
		"whileblockstatement", "forblockstatement", "forinitstatement", "forrangedeclaration", 
		"forrangeinitializer", "jumpstatement", "declarationstatement", "declarationseq", 
		"declaration", "blockdeclaration", "aliasdeclaration", "simpledeclaration", 
		"static_assertdeclaration", "emptydeclaration", "attributedeclaration", 
		"declspecifier", "declspecifierseq", "storageclassspecifier", "functionspecifier", 
		"typedefname", "typespecifier", "trailingtypespecifier", "typespecifierseq", 
		"trailingtypespecifierseq", "simpletypespecifier", "typename", "decltypespecifier", 
		"elaboratedtypespecifier", "enumname", "enumspecifier", "enumhead", "opaqueenumdeclaration", 
		"enumkey", "enumbase", "enumeratorlist", "enumeratordefinition", "enumerator", 
		"namespacename", "originalnamespacename", "namespacedefinition", "namednamespacedefinition", 
		"originalnamespacedefinition", "extensionnamespacedefinition", "unnamednamespacedefinition", 
		"namespacebody", "namespacealias", "namespacealiasdefinition", "qualifiednamespacespecifier", 
		"usingdeclaration", "usingdirective", "asmdefinition", "linkagespecification", 
		"attributespecifierseq", "attributespecifier", "alignmentspecifier", "attributelist", 
		"attribute", "attributetoken", "attributescopedtoken", "attributenamespace", 
		"attributeargumentclause", "balancedtokenseq", "balancedtoken", "initdeclaratorlist", 
		"initdeclarator", "declarator", "ptrdeclarator", "noptrdeclarator", "parametersandqualifiers", 
		"trailingreturntype", "ptroperator", "cvqualifierseq", "cvqualifier", 
		"refqualifier", "declaratorid", "typeid", "abstractdeclarator", "ptrabstractdeclarator", 
		"noptrabstractdeclarator", "abstractpackdeclarator", "noptrabstractpackdeclarator", 
		"parameterdeclarationclause", "parameterdeclarationlist", "parameterdeclaration", 
		"functiondefinition", "functionbody", "initializer", "braceorequalinitializer", 
		"initializerclause", "initializerlist", "bracedinitlist", "classname", 
		"classspecifier", "classhead", "classheadname", "classvirtspecifier", 
		"classkey", "memberspecification", "memberdeclaration", "memberdeclaratorlist", 
		"memberdeclarator", "virtspecifierseq", "virtspecifier", "purespecifier", 
		"baseclause", "basespecifierlist", "basespecifier", "classordecltype", 
		"basetypespecifier", "accessspecifier", "conversionfunctionid", "conversiontypeid", 
		"conversiondeclarator", "ctorinitializer", "meminitializerlist", "meminitializer", 
		"meminitializerid", "operatorfunctionid", "literaloperatorid", "templatedeclaration", 
		"templateparameterlist", "templateparameter", "typeparameter", "simpletemplateid", 
		"templateid", "templatename", "templateargumentlist", "templateargument", 
		"typenamespecifier", "explicitinstantiation", "explicitspecialization", 
		"tryblock", "functiontryblock", "handlerseq", "handler", "exceptiondeclaration", 
		"throwexpression", "exceptionspecification", "dynamicexceptionspecification", 
		"typeidlist", "noexceptspecification", "rightShift", "rightShiftAssign", 
		"operator", "literal", "booleanliteral", "pointerliteral", "userdefinedliteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'alignas'", "'alignof'", "'asm'", "'auto'", "'bool'", 
		"'break'", "'case'", "'catch'", "'char'", "'char16_t'", "'char32_t'", 
		"'class'", "'const'", "'constexpr'", "'const_cast'", "'continue'", "'decltype'", 
		"'default'", "'delete'", "'do'", "'double'", "'dynamic_cast'", "'else'", 
		"'enum'", "'explicit'", "'export'", "'extern'", "'false'", "'final'", 
		"'float'", "'for'", "'friend'", "'goto'", "'if'", "'inline'", "'int'", 
		"'long'", "'mutable'", "'namespace'", "'new'", "'noexcept'", "'nullptr'", 
		"'operator'", "'override'", "'private'", "'protected'", "'public'", "'register'", 
		"'reinterpret_cast'", "'return'", "'short'", "'signed'", "'sizeof'", "'static'", 
		"'static_assert'", "'static_cast'", "'struct'", "'switch'", "'template'", 
		"'this'", "'thread_local'", "'throw'", "'true'", "'try'", "'typedef'", 
		"'typeid'", "'typename'", "'union'", "'unsigned'", "'using'", "'virtual'", 
		"'void'", "'volatile'", "'wchar_t'", "'while'", "'('", "')'", "'['", "']'", 
		"'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", 
		"'~'", "'!'", "'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", 
		"'^='", "'&='", "'|='", "'<<'", "'<<='", "'=='", "'!='", "'<='", "'>='", 
		"'&&'", "'||'", "'++'", "'--'", "','", "'->*'", "'->'", "'?'", "':'", 
		"'::'", "';'", "'.'", "'.*'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MultiLineMacro", "Directive", "Alignas", "Alignof", "Asm", "Auto", 
		"Bool", "Break", "Case", "Catch", "Char", "Char16", "Char32", "Class", 
		"Const", "Constexpr", "Const_cast", "Continue", "Decltype", "Default", 
		"Delete", "Do", "Double", "Dynamic_cast", "Else", "Enum", "Explicit", 
		"Export", "Extern", "False", "Final", "Float", "For", "Friend", "Goto", 
		"If", "Inline", "Int", "Long", "Mutable", "Namespace", "New", "Noexcept", 
		"Nullptr", "Operator", "Override", "Private", "Protected", "Public", "Register", 
		"Reinterpret_cast", "Return", "Short", "Signed", "Sizeof", "Static", "Static_assert", 
		"Static_cast", "Struct", "Switch", "Template", "This", "Thread_local", 
		"Throw", "True", "Try", "Typedef", "Typeid", "Typename", "Union", "Unsigned", 
		"Using", "Virtual", "Void", "Volatile", "Wchar", "While", "LeftParen", 
		"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
		"Plus", "Minus", "Star", "Div", "Mod", "Caret", "And", "Or", "Tilde", 
		"Not", "Assign", "Less", "Greater", "PlusAssign", "MinusAssign", "StarAssign", 
		"DivAssign", "ModAssign", "XorAssign", "AndAssign", "OrAssign", "LeftShift", 
		"LeftShiftAssign", "Equal", "NotEqual", "LessEqual", "GreaterEqual", "AndAnd", 
		"OrOr", "PlusPlus", "MinusMinus", "Comma", "ArrowStar", "Arrow", "Question", 
		"Colon", "Doublecolon", "Semi", "Dot", "DotStar", "Ellipsis", "Identifier", 
		"Integerliteral", "Decimalliteral", "Octalliteral", "Hexadecimalliteral", 
		"Binaryliteral", "Integersuffix", "Characterliteral", "Floatingliteral", 
		"Stringliteral", "Userdefinedintegerliteral", "Userdefinedfloatingliteral", 
		"Userdefinedstringliteral", "Userdefinedcharacterliteral", "Whitespace", 
		"Newline", "BlockComment", "LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CPP14.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CPP14Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TranslationunitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CPP14Parser.EOF, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public TranslationunitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationunit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTranslationunit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTranslationunit(this);
		}
	}

	public final TranslationunitContext translationunit() throws RecognitionException {
		TranslationunitContext _localctx = new TranslationunitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationunit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typedef - 67)) | (1L << (Typename - 67)) | (1L << (Union - 67)) | (1L << (Unsigned - 67)) | (1L << (Using - 67)) | (1L << (Virtual - 67)) | (1L << (Void - 67)) | (1L << (Volatile - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Tilde - 67)) | (1L << (AndAnd - 67)) | (1L << (Doublecolon - 67)) | (1L << (Semi - 67)) | (1L << (Ellipsis - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(410);
				declarationseq(0);
				}
			}

			setState(413);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryexpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode This() { return getToken(CPP14Parser.This, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public LambdaexpressionContext lambdaexpression() {
			return getRuleContext(LambdaexpressionContext.class,0);
		}
		public PrimaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPrimaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPrimaryexpression(this);
		}
	}

	public final PrimaryexpressionContext primaryexpression() throws RecognitionException {
		PrimaryexpressionContext _localctx = new PrimaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryexpression);
		try {
			setState(423);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case False:
			case Nullptr:
			case True:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(415);
				literal();
				}
				break;
			case This:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(This);
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(417);
				match(LeftParen);
				setState(418);
				expression(0);
				setState(419);
				match(RightParen);
				}
				break;
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
				idexpression();
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 5);
				{
				setState(422);
				lambdaexpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdexpressionContext extends ParserRuleContext {
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public QualifiedidContext qualifiedid() {
			return getRuleContext(QualifiedidContext.class,0);
		}
		public IdexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterIdexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitIdexpression(this);
		}
	}

	public final IdexpressionContext idexpression() throws RecognitionException {
		IdexpressionContext _localctx = new IdexpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idexpression);
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				unqualifiedid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				qualifiedid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnqualifiedidContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public OperatorfunctionidContext operatorfunctionid() {
			return getRuleContext(OperatorfunctionidContext.class,0);
		}
		public ConversionfunctionidContext conversionfunctionid() {
			return getRuleContext(ConversionfunctionidContext.class,0);
		}
		public LiteraloperatoridContext literaloperatorid() {
			return getRuleContext(LiteraloperatoridContext.class,0);
		}
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public TemplateidContext templateid() {
			return getRuleContext(TemplateidContext.class,0);
		}
		public UnqualifiedidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unqualifiedid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnqualifiedid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnqualifiedid(this);
		}
	}

	public final UnqualifiedidContext unqualifiedid() throws RecognitionException {
		UnqualifiedidContext _localctx = new UnqualifiedidContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_unqualifiedid);
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				operatorfunctionid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				conversionfunctionid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(432);
				literaloperatorid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(433);
				match(Tilde);
				setState(434);
				classname();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(435);
				match(Tilde);
				setState(436);
				decltypespecifier();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(437);
				templateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedidContext extends ParserRuleContext {
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public QualifiedidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterQualifiedid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitQualifiedid(this);
		}
	}

	public final QualifiedidContext qualifiedid() throws RecognitionException {
		QualifiedidContext _localctx = new QualifiedidContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_qualifiedid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			nestednamespecifier(0);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Template) {
				{
				setState(441);
				match(Template);
				}
			}

			setState(444);
			unqualifiedid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestednamespecifierContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public NestednamespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestednamespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNestednamespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNestednamespecifier(this);
		}
	}

	public final NestednamespecifierContext nestednamespecifier() throws RecognitionException {
		return nestednamespecifier(0);
	}

	private NestednamespecifierContext nestednamespecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NestednamespecifierContext _localctx = new NestednamespecifierContext(_ctx, _parentState);
		NestednamespecifierContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_nestednamespecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(447);
				match(Doublecolon);
				}
				break;
			case 2:
				{
				setState(448);
				typename();
				setState(449);
				match(Doublecolon);
				}
				break;
			case 3:
				{
				setState(451);
				namespacename();
				setState(452);
				match(Doublecolon);
				}
				break;
			case 4:
				{
				setState(454);
				decltypespecifier();
				setState(455);
				match(Doublecolon);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(471);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(469);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(459);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(460);
						match(Identifier);
						setState(461);
						match(Doublecolon);
						}
						break;
					case 2:
						{
						_localctx = new NestednamespecifierContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_nestednamespecifier);
						setState(462);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(464);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(463);
							match(Template);
							}
						}

						setState(466);
						simpletemplateid();
						setState(467);
						match(Doublecolon);
						}
						break;
					}
					} 
				}
				setState(473);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LambdaexpressionContext extends ParserRuleContext {
		public LambdaintroducerContext lambdaintroducer() {
			return getRuleContext(LambdaintroducerContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public LambdadeclaratorContext lambdadeclarator() {
			return getRuleContext(LambdadeclaratorContext.class,0);
		}
		public LambdaexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLambdaexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLambdaexpression(this);
		}
	}

	public final LambdaexpressionContext lambdaexpression() throws RecognitionException {
		LambdaexpressionContext _localctx = new LambdaexpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lambdaexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			lambdaintroducer();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftParen) {
				{
				setState(475);
				lambdadeclarator();
				}
			}

			setState(478);
			compoundstatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaintroducerContext extends ParserRuleContext {
		public LambdacaptureContext lambdacapture() {
			return getRuleContext(LambdacaptureContext.class,0);
		}
		public LambdaintroducerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaintroducer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLambdaintroducer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLambdaintroducer(this);
		}
	}

	public final LambdaintroducerContext lambdaintroducer() throws RecognitionException {
		LambdaintroducerContext _localctx = new LambdaintroducerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lambdaintroducer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(LeftBracket);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (This - 62)) | (1L << (And - 62)) | (1L << (Assign - 62)) | (1L << (Identifier - 62)))) != 0)) {
				{
				setState(481);
				lambdacapture();
				}
			}

			setState(484);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdacaptureContext extends ParserRuleContext {
		public CapturedefaultContext capturedefault() {
			return getRuleContext(CapturedefaultContext.class,0);
		}
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public LambdacaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdacapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLambdacapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLambdacapture(this);
		}
	}

	public final LambdacaptureContext lambdacapture() throws RecognitionException {
		LambdacaptureContext _localctx = new LambdacaptureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lambdacapture);
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				capturedefault();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				capturelist(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				capturedefault();
				setState(489);
				match(Comma);
				setState(490);
				capturelist(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CapturedefaultContext extends ParserRuleContext {
		public CapturedefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturedefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCapturedefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCapturedefault(this);
		}
	}

	public final CapturedefaultContext capturedefault() throws RecognitionException {
		CapturedefaultContext _localctx = new CapturedefaultContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_capturedefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_la = _input.LA(1);
			if ( !(_la==And || _la==Assign) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CapturelistContext extends ParserRuleContext {
		public CaptureContext capture() {
			return getRuleContext(CaptureContext.class,0);
		}
		public CapturelistContext capturelist() {
			return getRuleContext(CapturelistContext.class,0);
		}
		public CapturelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capturelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCapturelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCapturelist(this);
		}
	}

	public final CapturelistContext capturelist() throws RecognitionException {
		return capturelist(0);
	}

	private CapturelistContext capturelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CapturelistContext _localctx = new CapturelistContext(_ctx, _parentState);
		CapturelistContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_capturelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(497);
			capture();
			setState(499);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(498);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(509);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CapturelistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_capturelist);
					setState(501);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(502);
					match(Comma);
					setState(503);
					capture();
					setState(505);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						setState(504);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(511);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CaptureContext extends ParserRuleContext {
		public SimplecaptureContext simplecapture() {
			return getRuleContext(SimplecaptureContext.class,0);
		}
		public InitcaptureContext initcapture() {
			return getRuleContext(InitcaptureContext.class,0);
		}
		public CaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCapture(this);
		}
	}

	public final CaptureContext capture() throws RecognitionException {
		CaptureContext _localctx = new CaptureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_capture);
		try {
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				simplecapture();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				initcapture();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimplecaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode This() { return getToken(CPP14Parser.This, 0); }
		public SimplecaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simplecapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSimplecapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSimplecapture(this);
		}
	}

	public final SimplecaptureContext simplecapture() throws RecognitionException {
		SimplecaptureContext _localctx = new SimplecaptureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simplecapture);
		try {
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				match(Identifier);
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				match(And);
				setState(518);
				match(Identifier);
				}
				break;
			case This:
				enterOuterAlt(_localctx, 3);
				{
				setState(519);
				match(This);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitcaptureContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitcaptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initcapture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitcapture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitcapture(this);
		}
	}

	public final InitcaptureContext initcapture() throws RecognitionException {
		InitcaptureContext _localctx = new InitcaptureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initcapture);
		try {
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				match(Identifier);
				setState(523);
				initializer();
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				match(And);
				setState(525);
				match(Identifier);
				setState(526);
				initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdadeclaratorContext extends ParserRuleContext {
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public TerminalNode Mutable() { return getToken(CPP14Parser.Mutable, 0); }
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public LambdadeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdadeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLambdadeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLambdadeclarator(this);
		}
	}

	public final LambdadeclaratorContext lambdadeclarator() throws RecognitionException {
		LambdadeclaratorContext _localctx = new LambdadeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lambdadeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(LeftParen);
			setState(530);
			parameterdeclarationclause();
			setState(531);
			match(RightParen);
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Mutable) {
				{
				setState(532);
				match(Mutable);
				}
			}

			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Noexcept || _la==Throw) {
				{
				setState(535);
				exceptionspecification();
				}
			}

			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(538);
				attributespecifierseq(0);
				}
			}

			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Arrow) {
				{
				setState(541);
				trailingreturntype();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixexpressionContext extends ParserRuleContext {
		public PrimaryexpressionContext primaryexpression() {
			return getRuleContext(PrimaryexpressionContext.class,0);
		}
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public TerminalNode Dynamic_cast() { return getToken(CPP14Parser.Dynamic_cast, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Static_cast() { return getToken(CPP14Parser.Static_cast, 0); }
		public TerminalNode Reinterpret_cast() { return getToken(CPP14Parser.Reinterpret_cast, 0); }
		public TerminalNode Const_cast() { return getToken(CPP14Parser.Const_cast, 0); }
		public TerminalNode Typeid() { return getToken(CPP14Parser.Typeid, 0); }
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public PseudodestructornameContext pseudodestructorname() {
			return getRuleContext(PseudodestructornameContext.class,0);
		}
		public PostfixexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPostfixexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPostfixexpression(this);
		}
	}

	public final PostfixexpressionContext postfixexpression() throws RecognitionException {
		return postfixexpression(0);
	}

	private PostfixexpressionContext postfixexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixexpressionContext _localctx = new PostfixexpressionContext(_ctx, _parentState);
		PostfixexpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_postfixexpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(545);
				primaryexpression();
				}
				break;
			case 2:
				{
				setState(546);
				simpletypespecifier();
				setState(547);
				match(LeftParen);
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Characterliteral - 132)) | (1L << (Floatingliteral - 132)) | (1L << (Stringliteral - 132)) | (1L << (Userdefinedintegerliteral - 132)) | (1L << (Userdefinedfloatingliteral - 132)) | (1L << (Userdefinedstringliteral - 132)) | (1L << (Userdefinedcharacterliteral - 132)))) != 0)) {
					{
					setState(548);
					expressionlist();
					}
				}

				setState(551);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(553);
				typenamespecifier();
				setState(554);
				match(LeftParen);
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Characterliteral - 132)) | (1L << (Floatingliteral - 132)) | (1L << (Stringliteral - 132)) | (1L << (Userdefinedintegerliteral - 132)) | (1L << (Userdefinedfloatingliteral - 132)) | (1L << (Userdefinedstringliteral - 132)) | (1L << (Userdefinedcharacterliteral - 132)))) != 0)) {
					{
					setState(555);
					expressionlist();
					}
				}

				setState(558);
				match(RightParen);
				}
				break;
			case 4:
				{
				setState(560);
				simpletypespecifier();
				setState(561);
				bracedinitlist();
				}
				break;
			case 5:
				{
				setState(563);
				typenamespecifier();
				setState(564);
				bracedinitlist();
				}
				break;
			case 6:
				{
				setState(566);
				match(Dynamic_cast);
				setState(567);
				match(Less);
				setState(568);
				typeid();
				setState(569);
				match(Greater);
				setState(570);
				match(LeftParen);
				setState(571);
				expression(0);
				setState(572);
				match(RightParen);
				}
				break;
			case 7:
				{
				setState(574);
				match(Static_cast);
				setState(575);
				match(Less);
				setState(576);
				typeid();
				setState(577);
				match(Greater);
				setState(578);
				match(LeftParen);
				setState(579);
				expression(0);
				setState(580);
				match(RightParen);
				}
				break;
			case 8:
				{
				setState(582);
				match(Reinterpret_cast);
				setState(583);
				match(Less);
				setState(584);
				typeid();
				setState(585);
				match(Greater);
				setState(586);
				match(LeftParen);
				setState(587);
				expression(0);
				setState(588);
				match(RightParen);
				}
				break;
			case 9:
				{
				setState(590);
				match(Const_cast);
				setState(591);
				match(Less);
				setState(592);
				typeid();
				setState(593);
				match(Greater);
				setState(594);
				match(LeftParen);
				setState(595);
				expression(0);
				setState(596);
				match(RightParen);
				}
				break;
			case 10:
				{
				setState(598);
				match(Typeid);
				setState(599);
				match(LeftParen);
				setState(600);
				expression(0);
				setState(601);
				match(RightParen);
				}
				break;
			case 11:
				{
				setState(603);
				match(Typeid);
				setState(604);
				match(LeftParen);
				setState(605);
				typeid();
				setState(606);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(650);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(648);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(610);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(611);
						match(LeftBracket);
						setState(612);
						expression(0);
						setState(613);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(615);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(616);
						match(LeftBracket);
						setState(617);
						bracedinitlist();
						setState(618);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(620);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(621);
						match(LeftParen);
						setState(623);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Characterliteral - 132)) | (1L << (Floatingliteral - 132)) | (1L << (Stringliteral - 132)) | (1L << (Userdefinedintegerliteral - 132)) | (1L << (Userdefinedfloatingliteral - 132)) | (1L << (Userdefinedstringliteral - 132)) | (1L << (Userdefinedcharacterliteral - 132)))) != 0)) {
							{
							setState(622);
							expressionlist();
							}
						}

						setState(625);
						match(RightParen);
						}
						break;
					case 4:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(626);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(627);
						match(Dot);
						setState(629);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(628);
							match(Template);
							}
						}

						setState(631);
						idexpression();
						}
						break;
					case 5:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(632);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(633);
						match(Arrow);
						setState(635);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Template) {
							{
							setState(634);
							match(Template);
							}
						}

						setState(637);
						idexpression();
						}
						break;
					case 6:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(638);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(639);
						match(Dot);
						setState(640);
						pseudodestructorname();
						}
						break;
					case 7:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(641);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(642);
						match(Arrow);
						setState(643);
						pseudodestructorname();
						}
						break;
					case 8:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(644);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(645);
						match(PlusPlus);
						}
						break;
					case 9:
						{
						_localctx = new PostfixexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixexpression);
						setState(646);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(647);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(652);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionlistContext extends ParserRuleContext {
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public ExpressionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExpressionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExpressionlist(this);
		}
	}

	public final ExpressionlistContext expressionlist() throws RecognitionException {
		ExpressionlistContext _localctx = new ExpressionlistContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressionlist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			initializerlist(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PseudodestructornameContext extends ParserRuleContext {
		public List<TypenameContext> typename() {
			return getRuleContexts(TypenameContext.class);
		}
		public TypenameContext typename(int i) {
			return getRuleContext(TypenameContext.class,i);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public PseudodestructornameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudodestructorname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPseudodestructorname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPseudodestructorname(this);
		}
	}

	public final PseudodestructornameContext pseudodestructorname() throws RecognitionException {
		PseudodestructornameContext _localctx = new PseudodestructornameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pseudodestructorname);
		int _la;
		try {
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(655);
					nestednamespecifier(0);
					}
					break;
				}
				setState(658);
				typename();
				setState(659);
				match(Doublecolon);
				setState(660);
				match(Tilde);
				setState(661);
				typename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				nestednamespecifier(0);
				setState(664);
				match(Template);
				setState(665);
				simpletemplateid();
				setState(666);
				match(Doublecolon);
				setState(667);
				match(Tilde);
				setState(668);
				typename();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Doublecolon || _la==Identifier) {
					{
					setState(670);
					nestednamespecifier(0);
					}
				}

				setState(673);
				match(Tilde);
				setState(674);
				typename();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(675);
				match(Tilde);
				setState(676);
				decltypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryexpressionContext extends ParserRuleContext {
		public PostfixexpressionContext postfixexpression() {
			return getRuleContext(PostfixexpressionContext.class,0);
		}
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public UnaryoperatorContext unaryoperator() {
			return getRuleContext(UnaryoperatorContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(CPP14Parser.Sizeof, 0); }
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Alignof() { return getToken(CPP14Parser.Alignof, 0); }
		public NoexceptexpressionContext noexceptexpression() {
			return getRuleContext(NoexceptexpressionContext.class,0);
		}
		public NewexpressionContext newexpression() {
			return getRuleContext(NewexpressionContext.class,0);
		}
		public DeleteexpressionContext deleteexpression() {
			return getRuleContext(DeleteexpressionContext.class,0);
		}
		public UnaryexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnaryexpression(this);
		}
	}

	public final UnaryexpressionContext unaryexpression() throws RecognitionException {
		UnaryexpressionContext _localctx = new UnaryexpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unaryexpression);
		try {
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				postfixexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				match(PlusPlus);
				setState(681);
				castexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(682);
				match(MinusMinus);
				setState(683);
				castexpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(684);
				unaryoperator();
				setState(685);
				castexpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(687);
				match(Sizeof);
				setState(688);
				unaryexpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(689);
				match(Sizeof);
				setState(690);
				match(LeftParen);
				setState(691);
				typeid();
				setState(692);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(694);
				match(Sizeof);
				setState(695);
				match(Ellipsis);
				setState(696);
				match(LeftParen);
				setState(697);
				match(Identifier);
				setState(698);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(699);
				match(Alignof);
				setState(700);
				match(LeftParen);
				setState(701);
				typeid();
				setState(702);
				match(RightParen);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(704);
				noexceptexpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(705);
				newexpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(706);
				deleteexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryoperatorContext extends ParserRuleContext {
		public UnaryoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnaryoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnaryoperator(this);
		}
	}

	public final UnaryoperatorContext unaryoperator() throws RecognitionException {
		UnaryoperatorContext _localctx = new UnaryoperatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unaryoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			_la = _input.LA(1);
			if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (Plus - 84)) | (1L << (Minus - 84)) | (1L << (Star - 84)) | (1L << (And - 84)) | (1L << (Or - 84)) | (1L << (Tilde - 84)) | (1L << (Not - 84)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewexpressionContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(CPP14Parser.New, 0); }
		public NewtypeidContext newtypeid() {
			return getRuleContext(NewtypeidContext.class,0);
		}
		public NewplacementContext newplacement() {
			return getRuleContext(NewplacementContext.class,0);
		}
		public NewinitializerContext newinitializer() {
			return getRuleContext(NewinitializerContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public NewexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewexpression(this);
		}
	}

	public final NewexpressionContext newexpression() throws RecognitionException {
		NewexpressionContext _localctx = new NewexpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_newexpression);
		int _la;
		try {
			setState(735);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(711);
					match(Doublecolon);
					}
				}

				setState(714);
				match(New);
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(715);
					newplacement();
					}
				}

				setState(718);
				newtypeid();
				setState(720);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(719);
					newinitializer();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(722);
					match(Doublecolon);
					}
				}

				setState(725);
				match(New);
				setState(727);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(726);
					newplacement();
					}
					break;
				}
				setState(729);
				match(LeftParen);
				setState(730);
				typeid();
				setState(731);
				match(RightParen);
				setState(733);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(732);
					newinitializer();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewplacementContext extends ParserRuleContext {
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public NewplacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newplacement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewplacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewplacement(this);
		}
	}

	public final NewplacementContext newplacement() throws RecognitionException {
		NewplacementContext _localctx = new NewplacementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_newplacement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			match(LeftParen);
			setState(738);
			expressionlist();
			setState(739);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewtypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public NewdeclaratorContext newdeclarator() {
			return getRuleContext(NewdeclaratorContext.class,0);
		}
		public NewtypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newtypeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewtypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewtypeid(this);
		}
	}

	public final NewtypeidContext newtypeid() throws RecognitionException {
		NewtypeidContext _localctx = new NewtypeidContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_newtypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			typespecifierseq();
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(742);
				newdeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewdeclaratorContext extends ParserRuleContext {
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public NewdeclaratorContext newdeclarator() {
			return getRuleContext(NewdeclaratorContext.class,0);
		}
		public NoptrnewdeclaratorContext noptrnewdeclarator() {
			return getRuleContext(NoptrnewdeclaratorContext.class,0);
		}
		public NewdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewdeclarator(this);
		}
	}

	public final NewdeclaratorContext newdeclarator() throws RecognitionException {
		NewdeclaratorContext _localctx = new NewdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_newdeclarator);
		try {
			setState(750);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				ptroperator();
				setState(747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(746);
					newdeclarator();
					}
					break;
				}
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				noptrnewdeclarator(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrnewdeclaratorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NoptrnewdeclaratorContext noptrnewdeclarator() {
			return getRuleContext(NoptrnewdeclaratorContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrnewdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrnewdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoptrnewdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoptrnewdeclarator(this);
		}
	}

	public final NoptrnewdeclaratorContext noptrnewdeclarator() throws RecognitionException {
		return noptrnewdeclarator(0);
	}

	private NoptrnewdeclaratorContext noptrnewdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrnewdeclaratorContext _localctx = new NoptrnewdeclaratorContext(_ctx, _parentState);
		NoptrnewdeclaratorContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_noptrnewdeclarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(753);
			match(LeftBracket);
			setState(754);
			expression(0);
			setState(755);
			match(RightBracket);
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(756);
				attributespecifierseq(0);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(768);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new NoptrnewdeclaratorContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_noptrnewdeclarator);
					setState(759);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(760);
					match(LeftBracket);
					setState(761);
					constantexpression();
					setState(762);
					match(RightBracket);
					setState(764);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						setState(763);
						attributespecifierseq(0);
						}
						break;
					}
					}
					} 
				}
				setState(770);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NewinitializerContext extends ParserRuleContext {
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public NewinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNewinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNewinitializer(this);
		}
	}

	public final NewinitializerContext newinitializer() throws RecognitionException {
		NewinitializerContext _localctx = new NewinitializerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_newinitializer);
		int _la;
		try {
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				match(LeftParen);
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Characterliteral - 132)) | (1L << (Floatingliteral - 132)) | (1L << (Stringliteral - 132)) | (1L << (Userdefinedintegerliteral - 132)) | (1L << (Userdefinedfloatingliteral - 132)) | (1L << (Userdefinedstringliteral - 132)) | (1L << (Userdefinedcharacterliteral - 132)))) != 0)) {
					{
					setState(772);
					expressionlist();
					}
				}

				setState(775);
				match(RightParen);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteexpressionContext extends ParserRuleContext {
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public DeleteexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeleteexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeleteexpression(this);
		}
	}

	public final DeleteexpressionContext deleteexpression() throws RecognitionException {
		DeleteexpressionContext _localctx = new DeleteexpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_deleteexpression);
		int _la;
		try {
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(779);
					match(Doublecolon);
					}
				}

				setState(782);
				match(Delete);
				setState(783);
				castexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Doublecolon) {
					{
					setState(784);
					match(Doublecolon);
					}
				}

				setState(787);
				match(Delete);
				setState(788);
				match(LeftBracket);
				setState(789);
				match(RightBracket);
				setState(790);
				castexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoexceptexpressionContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(CPP14Parser.Noexcept, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NoexceptexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoexceptexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoexceptexpression(this);
		}
	}

	public final NoexceptexpressionContext noexceptexpression() throws RecognitionException {
		NoexceptexpressionContext _localctx = new NoexceptexpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_noexceptexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(Noexcept);
			setState(794);
			match(LeftParen);
			setState(795);
			expression(0);
			setState(796);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastexpressionContext extends ParserRuleContext {
		public UnaryexpressionContext unaryexpression() {
			return getRuleContext(UnaryexpressionContext.class,0);
		}
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public CastexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCastexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCastexpression(this);
		}
	}

	public final CastexpressionContext castexpression() throws RecognitionException {
		CastexpressionContext _localctx = new CastexpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_castexpression);
		try {
			setState(804);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				unaryexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				match(LeftParen);
				setState(800);
				typeid();
				setState(801);
				match(RightParen);
				setState(802);
				castexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PmexpressionContext extends ParserRuleContext {
		public CastexpressionContext castexpression() {
			return getRuleContext(CastexpressionContext.class,0);
		}
		public PmexpressionContext pmexpression() {
			return getRuleContext(PmexpressionContext.class,0);
		}
		public PmexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pmexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPmexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPmexpression(this);
		}
	}

	public final PmexpressionContext pmexpression() throws RecognitionException {
		return pmexpression(0);
	}

	private PmexpressionContext pmexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PmexpressionContext _localctx = new PmexpressionContext(_ctx, _parentState);
		PmexpressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_pmexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(807);
			castexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(817);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(815);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(809);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(810);
						match(DotStar);
						setState(811);
						castexpression();
						}
						break;
					case 2:
						{
						_localctx = new PmexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_pmexpression);
						setState(812);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(813);
						match(ArrowStar);
						setState(814);
						castexpression();
						}
						break;
					}
					} 
				}
				setState(819);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeexpressionContext extends ParserRuleContext {
		public PmexpressionContext pmexpression() {
			return getRuleContext(PmexpressionContext.class,0);
		}
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public MultiplicativeexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMultiplicativeexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMultiplicativeexpression(this);
		}
	}

	public final MultiplicativeexpressionContext multiplicativeexpression() throws RecognitionException {
		return multiplicativeexpression(0);
	}

	private MultiplicativeexpressionContext multiplicativeexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeexpressionContext _localctx = new MultiplicativeexpressionContext(_ctx, _parentState);
		MultiplicativeexpressionContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_multiplicativeexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(821);
			pmexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(834);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(832);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(823);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(824);
						match(Star);
						setState(825);
						pmexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(826);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(827);
						match(Div);
						setState(828);
						pmexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeexpression);
						setState(829);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(830);
						match(Mod);
						setState(831);
						pmexpression(0);
						}
						break;
					}
					} 
				}
				setState(836);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveexpressionContext extends ParserRuleContext {
		public MultiplicativeexpressionContext multiplicativeexpression() {
			return getRuleContext(MultiplicativeexpressionContext.class,0);
		}
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public AdditiveexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAdditiveexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAdditiveexpression(this);
		}
	}

	public final AdditiveexpressionContext additiveexpression() throws RecognitionException {
		return additiveexpression(0);
	}

	private AdditiveexpressionContext additiveexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveexpressionContext _localctx = new AdditiveexpressionContext(_ctx, _parentState);
		AdditiveexpressionContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_additiveexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(838);
			multiplicativeexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(848);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(846);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(840);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(841);
						match(Plus);
						setState(842);
						multiplicativeexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveexpression);
						setState(843);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(844);
						match(Minus);
						setState(845);
						multiplicativeexpression(0);
						}
						break;
					}
					} 
				}
				setState(850);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftexpressionContext extends ParserRuleContext {
		public AdditiveexpressionContext additiveexpression() {
			return getRuleContext(AdditiveexpressionContext.class,0);
		}
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public RightShiftContext rightShift() {
			return getRuleContext(RightShiftContext.class,0);
		}
		public ShiftexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterShiftexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitShiftexpression(this);
		}
	}

	public final ShiftexpressionContext shiftexpression() throws RecognitionException {
		return shiftexpression(0);
	}

	private ShiftexpressionContext shiftexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftexpressionContext _localctx = new ShiftexpressionContext(_ctx, _parentState);
		ShiftexpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_shiftexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(852);
			additiveexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(863);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(861);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(854);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(855);
						match(LeftShift);
						setState(856);
						additiveexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftexpression);
						setState(857);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(858);
						rightShift();
						setState(859);
						additiveexpression(0);
						}
						break;
					}
					} 
				}
				setState(865);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalexpressionContext extends ParserRuleContext {
		public ShiftexpressionContext shiftexpression() {
			return getRuleContext(ShiftexpressionContext.class,0);
		}
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public RelationalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterRelationalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitRelationalexpression(this);
		}
	}

	public final RelationalexpressionContext relationalexpression() throws RecognitionException {
		return relationalexpression(0);
	}

	private RelationalexpressionContext relationalexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalexpressionContext _localctx = new RelationalexpressionContext(_ctx, _parentState);
		RelationalexpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_relationalexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(867);
			shiftexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(883);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(881);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(869);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(870);
						match(Less);
						setState(871);
						shiftexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(872);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(873);
						match(Greater);
						setState(874);
						shiftexpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(875);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(876);
						match(LessEqual);
						setState(877);
						shiftexpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalexpression);
						setState(878);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(879);
						match(GreaterEqual);
						setState(880);
						shiftexpression(0);
						}
						break;
					}
					} 
				}
				setState(885);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityexpressionContext extends ParserRuleContext {
		public RelationalexpressionContext relationalexpression() {
			return getRuleContext(RelationalexpressionContext.class,0);
		}
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public EqualityexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEqualityexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEqualityexpression(this);
		}
	}

	public final EqualityexpressionContext equalityexpression() throws RecognitionException {
		return equalityexpression(0);
	}

	private EqualityexpressionContext equalityexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityexpressionContext _localctx = new EqualityexpressionContext(_ctx, _parentState);
		EqualityexpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_equalityexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(887);
			relationalexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(897);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(895);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(889);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(890);
						match(Equal);
						setState(891);
						relationalexpression(0);
						}
						break;
					case 2:
						{
						_localctx = new EqualityexpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityexpression);
						setState(892);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(893);
						match(NotEqual);
						setState(894);
						relationalexpression(0);
						}
						break;
					}
					} 
				}
				setState(899);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndexpressionContext extends ParserRuleContext {
		public EqualityexpressionContext equalityexpression() {
			return getRuleContext(EqualityexpressionContext.class,0);
		}
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public AndexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAndexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAndexpression(this);
		}
	}

	public final AndexpressionContext andexpression() throws RecognitionException {
		return andexpression(0);
	}

	private AndexpressionContext andexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndexpressionContext _localctx = new AndexpressionContext(_ctx, _parentState);
		AndexpressionContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_andexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(901);
			equalityexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(908);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andexpression);
					setState(903);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(904);
					match(And);
					setState(905);
					equalityexpression(0);
					}
					} 
				}
				setState(910);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveorexpressionContext extends ParserRuleContext {
		public AndexpressionContext andexpression() {
			return getRuleContext(AndexpressionContext.class,0);
		}
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public ExclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExclusiveorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExclusiveorexpression(this);
		}
	}

	public final ExclusiveorexpressionContext exclusiveorexpression() throws RecognitionException {
		return exclusiveorexpression(0);
	}

	private ExclusiveorexpressionContext exclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveorexpressionContext _localctx = new ExclusiveorexpressionContext(_ctx, _parentState);
		ExclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_exclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(912);
			andexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(919);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveorexpression);
					setState(914);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(915);
					match(Caret);
					setState(916);
					andexpression(0);
					}
					} 
				}
				setState(921);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveorexpressionContext extends ParserRuleContext {
		public ExclusiveorexpressionContext exclusiveorexpression() {
			return getRuleContext(ExclusiveorexpressionContext.class,0);
		}
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public InclusiveorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInclusiveorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInclusiveorexpression(this);
		}
	}

	public final InclusiveorexpressionContext inclusiveorexpression() throws RecognitionException {
		return inclusiveorexpression(0);
	}

	private InclusiveorexpressionContext inclusiveorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveorexpressionContext _localctx = new InclusiveorexpressionContext(_ctx, _parentState);
		InclusiveorexpressionContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_inclusiveorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(923);
			exclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(930);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveorexpression);
					setState(925);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(926);
					match(Or);
					setState(927);
					exclusiveorexpression(0);
					}
					} 
				}
				setState(932);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalandexpressionContext extends ParserRuleContext {
		public InclusiveorexpressionContext inclusiveorexpression() {
			return getRuleContext(InclusiveorexpressionContext.class,0);
		}
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalandexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalandexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLogicalandexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLogicalandexpression(this);
		}
	}

	public final LogicalandexpressionContext logicalandexpression() throws RecognitionException {
		return logicalandexpression(0);
	}

	private LogicalandexpressionContext logicalandexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalandexpressionContext _localctx = new LogicalandexpressionContext(_ctx, _parentState);
		LogicalandexpressionContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_logicalandexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(934);
			inclusiveorexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(941);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalandexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalandexpression);
					setState(936);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(937);
					match(AndAnd);
					setState(938);
					inclusiveorexpression(0);
					}
					} 
				}
				setState(943);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalorexpressionContext extends ParserRuleContext {
		public LogicalandexpressionContext logicalandexpression() {
			return getRuleContext(LogicalandexpressionContext.class,0);
		}
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public LogicalorexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalorexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLogicalorexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLogicalorexpression(this);
		}
	}

	public final LogicalorexpressionContext logicalorexpression() throws RecognitionException {
		return logicalorexpression(0);
	}

	private LogicalorexpressionContext logicalorexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalorexpressionContext _localctx = new LogicalorexpressionContext(_ctx, _parentState);
		LogicalorexpressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_logicalorexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(945);
			logicalandexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(952);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalorexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalorexpression);
					setState(947);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(948);
					match(OrOr);
					setState(949);
					logicalandexpression(0);
					}
					} 
				}
				setState(954);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalexpressionContext extends ParserRuleContext {
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ConditionalexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConditionalexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConditionalexpression(this);
		}
	}

	public final ConditionalexpressionContext conditionalexpression() throws RecognitionException {
		ConditionalexpressionContext _localctx = new ConditionalexpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_conditionalexpression);
		try {
			setState(962);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(955);
				logicalorexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				logicalorexpression(0);
				setState(957);
				match(Question);
				setState(958);
				expression(0);
				setState(959);
				match(Colon);
				setState(960);
				assignmentexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentexpressionContext extends ParserRuleContext {
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public LogicalorexpressionContext logicalorexpression() {
			return getRuleContext(LogicalorexpressionContext.class,0);
		}
		public AssignmentoperatorContext assignmentoperator() {
			return getRuleContext(AssignmentoperatorContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public ThrowexpressionContext throwexpression() {
			return getRuleContext(ThrowexpressionContext.class,0);
		}
		public AssignmentexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAssignmentexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAssignmentexpression(this);
		}
	}

	public final AssignmentexpressionContext assignmentexpression() throws RecognitionException {
		AssignmentexpressionContext _localctx = new AssignmentexpressionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_assignmentexpression);
		try {
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				conditionalexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				logicalorexpression(0);
				setState(966);
				assignmentoperator();
				setState(967);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(969);
				throwexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentoperatorContext extends ParserRuleContext {
		public RightShiftAssignContext rightShiftAssign() {
			return getRuleContext(RightShiftAssignContext.class,0);
		}
		public AssignmentoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAssignmentoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAssignmentoperator(this);
		}
	}

	public final AssignmentoperatorContext assignmentoperator() throws RecognitionException {
		AssignmentoperatorContext _localctx = new AssignmentoperatorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_assignmentoperator);
		try {
			setState(983);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(972);
				match(Assign);
				}
				break;
			case StarAssign:
				enterOuterAlt(_localctx, 2);
				{
				setState(973);
				match(StarAssign);
				}
				break;
			case DivAssign:
				enterOuterAlt(_localctx, 3);
				{
				setState(974);
				match(DivAssign);
				}
				break;
			case ModAssign:
				enterOuterAlt(_localctx, 4);
				{
				setState(975);
				match(ModAssign);
				}
				break;
			case PlusAssign:
				enterOuterAlt(_localctx, 5);
				{
				setState(976);
				match(PlusAssign);
				}
				break;
			case MinusAssign:
				enterOuterAlt(_localctx, 6);
				{
				setState(977);
				match(MinusAssign);
				}
				break;
			case Greater:
				enterOuterAlt(_localctx, 7);
				{
				setState(978);
				rightShiftAssign();
				}
				break;
			case LeftShiftAssign:
				enterOuterAlt(_localctx, 8);
				{
				setState(979);
				match(LeftShiftAssign);
				}
				break;
			case AndAssign:
				enterOuterAlt(_localctx, 9);
				{
				setState(980);
				match(AndAssign);
				}
				break;
			case XorAssign:
				enterOuterAlt(_localctx, 10);
				{
				setState(981);
				match(XorAssign);
				}
				break;
			case OrAssign:
				enterOuterAlt(_localctx, 11);
				{
				setState(982);
				match(OrAssign);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(986);
			assignmentexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(993);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(988);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(989);
					match(Comma);
					setState(990);
					assignmentexpression();
					}
					} 
				}
				setState(995);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantexpressionContext extends ParserRuleContext {
		public ConditionalexpressionContext conditionalexpression() {
			return getRuleContext(ConditionalexpressionContext.class,0);
		}
		public ConstantexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConstantexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConstantexpression(this);
		}
	}

	public final ConstantexpressionContext constantexpression() throws RecognitionException {
		ConstantexpressionContext _localctx = new ConstantexpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_constantexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			conditionalexpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LabeledstatementContext labeledstatement() {
			return getRuleContext(LabeledstatementContext.class,0);
		}
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public SelectionstatementContext selectionstatement() {
			return getRuleContext(SelectionstatementContext.class,0);
		}
		public IterationstatementContext iterationstatement() {
			return getRuleContext(IterationstatementContext.class,0);
		}
		public JumpstatementContext jumpstatement() {
			return getRuleContext(JumpstatementContext.class,0);
		}
		public DeclarationstatementContext declarationstatement() {
			return getRuleContext(DeclarationstatementContext.class,0);
		}
		public TryblockContext tryblock() {
			return getRuleContext(TryblockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_statement);
		int _la;
		try {
			setState(1024);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(998);
				labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1000);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(999);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1002);
				expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1003);
					attributespecifierseq(0);
					}
				}

				setState(1006);
				compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1008);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1007);
					attributespecifierseq(0);
					}
				}

				setState(1010);
				selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1011);
					attributespecifierseq(0);
					}
				}

				setState(1014);
				iterationstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1015);
					attributespecifierseq(0);
					}
				}

				setState(1018);
				jumpstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1019);
				declarationstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1020);
					attributespecifierseq(0);
					}
				}

				setState(1023);
				tryblock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledstatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public SingleexprcaseContext singleexprcase() {
			return getRuleContext(SingleexprcaseContext.class,0);
		}
		public TerminalNode Default() { return getToken(CPP14Parser.Default, 0); }
		public LabeledstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLabeledstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLabeledstatement(this);
		}
	}

	public final LabeledstatementContext labeledstatement() throws RecognitionException {
		LabeledstatementContext _localctx = new LabeledstatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_labeledstatement);
		int _la;
		try {
			setState(1039);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1026);
					attributespecifierseq(0);
					}
				}

				setState(1029);
				match(Identifier);
				setState(1030);
				match(Colon);
				setState(1031);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1032);
				singleexprcase();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1033);
					attributespecifierseq(0);
					}
				}

				setState(1036);
				match(Default);
				setState(1037);
				match(Colon);
				setState(1038);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleexprcaseContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(CPP14Parser.Case, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public SingleexprcaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleexprcase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSingleexprcase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSingleexprcase(this);
		}
	}

	public final SingleexprcaseContext singleexprcase() throws RecognitionException {
		SingleexprcaseContext _localctx = new SingleexprcaseContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_singleexprcase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1041);
				attributespecifierseq(0);
				}
			}

			setState(1044);
			match(Case);
			setState(1045);
			constantexpression();
			setState(1046);
			match(Colon);
			setState(1047);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionstatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExpressionstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExpressionstatement(this);
		}
	}

	public final ExpressionstatementContext expressionstatement() throws RecognitionException {
		ExpressionstatementContext _localctx = new ExpressionstatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_expressionstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Characterliteral - 132)) | (1L << (Floatingliteral - 132)) | (1L << (Stringliteral - 132)) | (1L << (Userdefinedintegerliteral - 132)) | (1L << (Userdefinedfloatingliteral - 132)) | (1L << (Userdefinedstringliteral - 132)) | (1L << (Userdefinedcharacterliteral - 132)))) != 0)) {
				{
				setState(1049);
				expression(0);
				}
			}

			setState(1052);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundstatementContext extends ParserRuleContext {
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public CompoundstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCompoundstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCompoundstatement(this);
		}
	}

	public final CompoundstatementContext compoundstatement() throws RecognitionException {
		CompoundstatementContext _localctx = new CompoundstatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_compoundstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1054);
			match(LeftBrace);
			setState(1056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Continue) | (1L << Decltype) | (1L << Default) | (1L << Delete) | (1L << Do) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << For) | (1L << Friend) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_assert) | (1L << Static_cast) | (1L << Struct) | (1L << Switch) | (1L << This) | (1L << Thread_local))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Try - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Using - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (While - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (AndAnd - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Semi - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Characterliteral - 132)) | (1L << (Floatingliteral - 132)) | (1L << (Stringliteral - 132)) | (1L << (Userdefinedintegerliteral - 132)) | (1L << (Userdefinedfloatingliteral - 132)) | (1L << (Userdefinedstringliteral - 132)) | (1L << (Userdefinedcharacterliteral - 132)))) != 0)) {
				{
				setState(1055);
				statementseq(0);
				}
			}

			setState(1058);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementseqContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public StatementseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterStatementseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitStatementseq(this);
		}
	}

	public final StatementseqContext statementseq() throws RecognitionException {
		return statementseq(0);
	}

	private StatementseqContext statementseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementseqContext _localctx = new StatementseqContext(_ctx, _parentState);
		StatementseqContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_statementseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1061);
			statement();
			}
			_ctx.stop = _input.LT(-1);
			setState(1067);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_statementseq);
					setState(1063);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1064);
					statement();
					}
					} 
				}
				setState(1069);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SelectionstatementContext extends ParserRuleContext {
		public SelectionstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionstatement; }
	 
		public SelectionstatementContext() { }
		public void copyFrom(SelectionstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseIfContext extends SelectionstatementContext {
		public TerminalNode If() { return getToken(CPP14Parser.If, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IfblockstatementContext ifblockstatement() {
			return getRuleContext(IfblockstatementContext.class,0);
		}
		public TerminalNode Else() { return getToken(CPP14Parser.Else, 0); }
		public ElseblockstatementContext elseblockstatement() {
			return getRuleContext(ElseblockstatementContext.class,0);
		}
		public ElseIfContext(SelectionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitElseIf(this);
		}
	}
	public static class SwichContext extends SelectionstatementContext {
		public TerminalNode Switch() { return getToken(CPP14Parser.Switch, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SwitchblockstatementContext switchblockstatement() {
			return getRuleContext(SwitchblockstatementContext.class,0);
		}
		public SwichContext(SelectionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSwich(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSwich(this);
		}
	}
	public static class NoElseIFContext extends SelectionstatementContext {
		public TerminalNode If() { return getToken(CPP14Parser.If, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IfblockstatementContext ifblockstatement() {
			return getRuleContext(IfblockstatementContext.class,0);
		}
		public NoElseIFContext(SelectionstatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoElseIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoElseIF(this);
		}
	}

	public final SelectionstatementContext selectionstatement() throws RecognitionException {
		SelectionstatementContext _localctx = new SelectionstatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_selectionstatement);
		try {
			setState(1090);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				_localctx = new NoElseIFContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
				match(If);
				setState(1071);
				match(LeftParen);
				setState(1072);
				condition();
				setState(1073);
				match(RightParen);
				setState(1074);
				ifblockstatement();
				}
				break;
			case 2:
				_localctx = new ElseIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1076);
				match(If);
				setState(1077);
				match(LeftParen);
				setState(1078);
				condition();
				setState(1079);
				match(RightParen);
				setState(1080);
				ifblockstatement();
				setState(1081);
				match(Else);
				setState(1082);
				elseblockstatement();
				}
				break;
			case 3:
				_localctx = new SwichContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1084);
				match(Switch);
				setState(1085);
				match(LeftParen);
				setState(1086);
				condition();
				setState(1087);
				match(RightParen);
				setState(1088);
				switchblockstatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchblockstatementContext extends ParserRuleContext {
		public LabeledstatementContext labeledstatement() {
			return getRuleContext(LabeledstatementContext.class,0);
		}
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public SelectionstatementContext selectionstatement() {
			return getRuleContext(SelectionstatementContext.class,0);
		}
		public IterationstatementContext iterationstatement() {
			return getRuleContext(IterationstatementContext.class,0);
		}
		public JumpstatementContext jumpstatement() {
			return getRuleContext(JumpstatementContext.class,0);
		}
		public DeclarationstatementContext declarationstatement() {
			return getRuleContext(DeclarationstatementContext.class,0);
		}
		public TryblockContext tryblock() {
			return getRuleContext(TryblockContext.class,0);
		}
		public SwitchblockstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchblockstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSwitchblockstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSwitchblockstatement(this);
		}
	}

	public final SwitchblockstatementContext switchblockstatement() throws RecognitionException {
		SwitchblockstatementContext _localctx = new SwitchblockstatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_switchblockstatement);
		int _la;
		try {
			setState(1118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1092);
				labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1094);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(1093);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1096);
				expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1098);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1097);
					attributespecifierseq(0);
					}
				}

				setState(1100);
				compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1101);
					attributespecifierseq(0);
					}
				}

				setState(1104);
				selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1105);
					attributespecifierseq(0);
					}
				}

				setState(1108);
				iterationstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1109);
					attributespecifierseq(0);
					}
				}

				setState(1112);
				jumpstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1113);
				declarationstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1114);
					attributespecifierseq(0);
					}
				}

				setState(1117);
				tryblock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfblockstatementContext extends ParserRuleContext {
		public LabeledstatementContext labeledstatement() {
			return getRuleContext(LabeledstatementContext.class,0);
		}
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public SelectionstatementContext selectionstatement() {
			return getRuleContext(SelectionstatementContext.class,0);
		}
		public IterationstatementContext iterationstatement() {
			return getRuleContext(IterationstatementContext.class,0);
		}
		public JumpstatementContext jumpstatement() {
			return getRuleContext(JumpstatementContext.class,0);
		}
		public DeclarationstatementContext declarationstatement() {
			return getRuleContext(DeclarationstatementContext.class,0);
		}
		public TryblockContext tryblock() {
			return getRuleContext(TryblockContext.class,0);
		}
		public IfblockstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifblockstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterIfblockstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitIfblockstatement(this);
		}
	}

	public final IfblockstatementContext ifblockstatement() throws RecognitionException {
		IfblockstatementContext _localctx = new IfblockstatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_ifblockstatement);
		int _la;
		try {
			setState(1146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1120);
				labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(1121);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1124);
				expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1125);
					attributespecifierseq(0);
					}
				}

				setState(1128);
				compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1129);
					attributespecifierseq(0);
					}
				}

				setState(1132);
				selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1133);
					attributespecifierseq(0);
					}
				}

				setState(1136);
				iterationstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1137);
					attributespecifierseq(0);
					}
				}

				setState(1140);
				jumpstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1141);
				declarationstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1142);
					attributespecifierseq(0);
					}
				}

				setState(1145);
				tryblock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseblockstatementContext extends ParserRuleContext {
		public LabeledstatementContext labeledstatement() {
			return getRuleContext(LabeledstatementContext.class,0);
		}
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public SelectionstatementContext selectionstatement() {
			return getRuleContext(SelectionstatementContext.class,0);
		}
		public IterationstatementContext iterationstatement() {
			return getRuleContext(IterationstatementContext.class,0);
		}
		public JumpstatementContext jumpstatement() {
			return getRuleContext(JumpstatementContext.class,0);
		}
		public DeclarationstatementContext declarationstatement() {
			return getRuleContext(DeclarationstatementContext.class,0);
		}
		public TryblockContext tryblock() {
			return getRuleContext(TryblockContext.class,0);
		}
		public ElseblockstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseblockstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterElseblockstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitElseblockstatement(this);
		}
	}

	public final ElseblockstatementContext elseblockstatement() throws RecognitionException {
		ElseblockstatementContext _localctx = new ElseblockstatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_elseblockstatement);
		int _la;
		try {
			setState(1174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1148);
				labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(1149);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1152);
				expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1153);
					attributespecifierseq(0);
					}
				}

				setState(1156);
				compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1157);
					attributespecifierseq(0);
					}
				}

				setState(1160);
				selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1161);
					attributespecifierseq(0);
					}
				}

				setState(1164);
				iterationstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1165);
					attributespecifierseq(0);
					}
				}

				setState(1168);
				jumpstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1169);
				declarationstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1170);
					attributespecifierseq(0);
					}
				}

				setState(1173);
				tryblock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_condition);
		int _la;
		try {
			setState(1192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1176);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1177);
					attributespecifierseq(0);
					}
				}

				setState(1180);
				declspecifierseq();
				setState(1181);
				declarator();
				setState(1182);
				match(Assign);
				setState(1183);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1185);
					attributespecifierseq(0);
					}
				}

				setState(1188);
				declspecifierseq();
				setState(1189);
				declarator();
				setState(1190);
				bracedinitlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationstatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(CPP14Parser.While, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhileblockstatementContext whileblockstatement() {
			return getRuleContext(WhileblockstatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(CPP14Parser.Do, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode For() { return getToken(CPP14Parser.For, 0); }
		public ForinitstatementContext forinitstatement() {
			return getRuleContext(ForinitstatementContext.class,0);
		}
		public ForblockstatementContext forblockstatement() {
			return getRuleContext(ForblockstatementContext.class,0);
		}
		public ForrangedeclarationContext forrangedeclaration() {
			return getRuleContext(ForrangedeclarationContext.class,0);
		}
		public ForrangeinitializerContext forrangeinitializer() {
			return getRuleContext(ForrangeinitializerContext.class,0);
		}
		public IterationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterIterationstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitIterationstatement(this);
		}
	}

	public final IterationstatementContext iterationstatement() throws RecognitionException {
		IterationstatementContext _localctx = new IterationstatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_iterationstatement);
		int _la;
		try {
			setState(1229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1194);
				match(While);
				setState(1195);
				match(LeftParen);
				setState(1196);
				condition();
				setState(1197);
				match(RightParen);
				setState(1198);
				whileblockstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1200);
				match(Do);
				setState(1201);
				whileblockstatement();
				setState(1202);
				match(While);
				setState(1203);
				match(LeftParen);
				setState(1204);
				expression(0);
				setState(1205);
				match(RightParen);
				setState(1206);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1208);
				match(For);
				setState(1209);
				match(LeftParen);
				setState(1210);
				forinitstatement();
				setState(1212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << False) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Register) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Static_cast) | (1L << Struct) | (1L << This) | (1L << Thread_local))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typedef - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Union - 64)) | (1L << (Unsigned - 64)) | (1L << (Virtual - 64)) | (1L << (Void - 64)) | (1L << (Volatile - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Characterliteral - 132)) | (1L << (Floatingliteral - 132)) | (1L << (Stringliteral - 132)) | (1L << (Userdefinedintegerliteral - 132)) | (1L << (Userdefinedfloatingliteral - 132)) | (1L << (Userdefinedstringliteral - 132)) | (1L << (Userdefinedcharacterliteral - 132)))) != 0)) {
					{
					setState(1211);
					condition();
					}
				}

				setState(1214);
				match(Semi);
				setState(1216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Characterliteral - 132)) | (1L << (Floatingliteral - 132)) | (1L << (Stringliteral - 132)) | (1L << (Userdefinedintegerliteral - 132)) | (1L << (Userdefinedfloatingliteral - 132)) | (1L << (Userdefinedstringliteral - 132)) | (1L << (Userdefinedcharacterliteral - 132)))) != 0)) {
					{
					setState(1215);
					expression(0);
					}
				}

				setState(1218);
				match(RightParen);
				setState(1219);
				forblockstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1221);
				match(For);
				setState(1222);
				match(LeftParen);
				setState(1223);
				forrangedeclaration();
				setState(1224);
				match(Colon);
				setState(1225);
				forrangeinitializer();
				setState(1226);
				match(RightParen);
				setState(1227);
				forblockstatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileblockstatementContext extends ParserRuleContext {
		public LabeledstatementContext labeledstatement() {
			return getRuleContext(LabeledstatementContext.class,0);
		}
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public SelectionstatementContext selectionstatement() {
			return getRuleContext(SelectionstatementContext.class,0);
		}
		public IterationstatementContext iterationstatement() {
			return getRuleContext(IterationstatementContext.class,0);
		}
		public JumpstatementContext jumpstatement() {
			return getRuleContext(JumpstatementContext.class,0);
		}
		public DeclarationstatementContext declarationstatement() {
			return getRuleContext(DeclarationstatementContext.class,0);
		}
		public TryblockContext tryblock() {
			return getRuleContext(TryblockContext.class,0);
		}
		public WhileblockstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileblockstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterWhileblockstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitWhileblockstatement(this);
		}
	}

	public final WhileblockstatementContext whileblockstatement() throws RecognitionException {
		WhileblockstatementContext _localctx = new WhileblockstatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_whileblockstatement);
		int _la;
		try {
			setState(1257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1231);
				labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(1232);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1235);
				expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1236);
					attributespecifierseq(0);
					}
				}

				setState(1239);
				compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1240);
					attributespecifierseq(0);
					}
				}

				setState(1243);
				selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1244);
					attributespecifierseq(0);
					}
				}

				setState(1247);
				iterationstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1248);
					attributespecifierseq(0);
					}
				}

				setState(1251);
				jumpstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1252);
				declarationstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1253);
					attributespecifierseq(0);
					}
				}

				setState(1256);
				tryblock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForblockstatementContext extends ParserRuleContext {
		public LabeledstatementContext labeledstatement() {
			return getRuleContext(LabeledstatementContext.class,0);
		}
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public SelectionstatementContext selectionstatement() {
			return getRuleContext(SelectionstatementContext.class,0);
		}
		public IterationstatementContext iterationstatement() {
			return getRuleContext(IterationstatementContext.class,0);
		}
		public JumpstatementContext jumpstatement() {
			return getRuleContext(JumpstatementContext.class,0);
		}
		public DeclarationstatementContext declarationstatement() {
			return getRuleContext(DeclarationstatementContext.class,0);
		}
		public TryblockContext tryblock() {
			return getRuleContext(TryblockContext.class,0);
		}
		public ForblockstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forblockstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterForblockstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitForblockstatement(this);
		}
	}

	public final ForblockstatementContext forblockstatement() throws RecognitionException {
		ForblockstatementContext _localctx = new ForblockstatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_forblockstatement);
		int _la;
		try {
			setState(1285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1259);
				labeledstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1260);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1263);
				expressionstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1264);
					attributespecifierseq(0);
					}
				}

				setState(1267);
				compoundstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1268);
					attributespecifierseq(0);
					}
				}

				setState(1271);
				selectionstatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1272);
					attributespecifierseq(0);
					}
				}

				setState(1275);
				iterationstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1276);
					attributespecifierseq(0);
					}
				}

				setState(1279);
				jumpstatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1280);
				declarationstatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1281);
					attributespecifierseq(0);
					}
				}

				setState(1284);
				tryblock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForinitstatementContext extends ParserRuleContext {
		public ExpressionstatementContext expressionstatement() {
			return getRuleContext(ExpressionstatementContext.class,0);
		}
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public ForinitstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forinitstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterForinitstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitForinitstatement(this);
		}
	}

	public final ForinitstatementContext forinitstatement() throws RecognitionException {
		ForinitstatementContext _localctx = new ForinitstatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_forinitstatement);
		try {
			setState(1289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1287);
				expressionstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1288);
				simpledeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForrangedeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ForrangedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forrangedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterForrangedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitForrangedeclaration(this);
		}
	}

	public final ForrangedeclarationContext forrangedeclaration() throws RecognitionException {
		ForrangedeclarationContext _localctx = new ForrangedeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_forrangedeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1291);
				attributespecifierseq(0);
				}
			}

			setState(1294);
			declspecifierseq();
			setState(1295);
			declarator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForrangeinitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public ForrangeinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forrangeinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterForrangeinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitForrangeinitializer(this);
		}
	}

	public final ForrangeinitializerContext forrangeinitializer() throws RecognitionException {
		ForrangeinitializerContext _localctx = new ForrangeinitializerContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_forrangeinitializer);
		try {
			setState(1299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case False:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case True:
			case Typeid:
			case Typename:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(1297);
				expression(0);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(1298);
				bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpstatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(CPP14Parser.Break, 0); }
		public TerminalNode Continue() { return getToken(CPP14Parser.Continue, 0); }
		public TerminalNode Return() { return getToken(CPP14Parser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public TerminalNode Goto() { return getToken(CPP14Parser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public JumpstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterJumpstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitJumpstatement(this);
		}
	}

	public final JumpstatementContext jumpstatement() throws RecognitionException {
		JumpstatementContext _localctx = new JumpstatementContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_jumpstatement);
		int _la;
		try {
			setState(1317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1301);
				match(Break);
				setState(1302);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1303);
				match(Continue);
				setState(1304);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1305);
				match(Return);
				setState(1307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Characterliteral - 132)) | (1L << (Floatingliteral - 132)) | (1L << (Stringliteral - 132)) | (1L << (Userdefinedintegerliteral - 132)) | (1L << (Userdefinedfloatingliteral - 132)) | (1L << (Userdefinedstringliteral - 132)) | (1L << (Userdefinedcharacterliteral - 132)))) != 0)) {
					{
					setState(1306);
					expression(0);
					}
				}

				setState(1309);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1310);
				match(Return);
				setState(1311);
				bracedinitlist();
				setState(1312);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1314);
				match(Goto);
				setState(1315);
				match(Identifier);
				setState(1316);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationstatementContext extends ParserRuleContext {
		public BlockdeclarationContext blockdeclaration() {
			return getRuleContext(BlockdeclarationContext.class,0);
		}
		public DeclarationstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclarationstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclarationstatement(this);
		}
	}

	public final DeclarationstatementContext declarationstatement() throws RecognitionException {
		DeclarationstatementContext _localctx = new DeclarationstatementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_declarationstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			blockdeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationseqContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public DeclarationseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclarationseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclarationseq(this);
		}
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		return declarationseq(0);
	}

	private DeclarationseqContext declarationseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, _parentState);
		DeclarationseqContext _prevctx = _localctx;
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_declarationseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1322);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationseq);
					setState(1324);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1325);
					declaration();
					}
					} 
				}
				setState(1330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public BlockdeclarationContext blockdeclaration() {
			return getRuleContext(BlockdeclarationContext.class,0);
		}
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public TemplatedeclarationContext templatedeclaration() {
			return getRuleContext(TemplatedeclarationContext.class,0);
		}
		public ExplicitinstantiationContext explicitinstantiation() {
			return getRuleContext(ExplicitinstantiationContext.class,0);
		}
		public ExplicitspecializationContext explicitspecialization() {
			return getRuleContext(ExplicitspecializationContext.class,0);
		}
		public LinkagespecificationContext linkagespecification() {
			return getRuleContext(LinkagespecificationContext.class,0);
		}
		public NamespacedefinitionContext namespacedefinition() {
			return getRuleContext(NamespacedefinitionContext.class,0);
		}
		public EmptydeclarationContext emptydeclaration() {
			return getRuleContext(EmptydeclarationContext.class,0);
		}
		public AttributedeclarationContext attributedeclaration() {
			return getRuleContext(AttributedeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_declaration);
		try {
			setState(1340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1331);
				blockdeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1332);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1333);
				templatedeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1334);
				explicitinstantiation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1335);
				explicitspecialization();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1336);
				linkagespecification();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1337);
				namespacedefinition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1338);
				emptydeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1339);
				attributedeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockdeclarationContext extends ParserRuleContext {
		public SimpledeclarationContext simpledeclaration() {
			return getRuleContext(SimpledeclarationContext.class,0);
		}
		public AsmdefinitionContext asmdefinition() {
			return getRuleContext(AsmdefinitionContext.class,0);
		}
		public NamespacealiasdefinitionContext namespacealiasdefinition() {
			return getRuleContext(NamespacealiasdefinitionContext.class,0);
		}
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public UsingdirectiveContext usingdirective() {
			return getRuleContext(UsingdirectiveContext.class,0);
		}
		public Static_assertdeclarationContext static_assertdeclaration() {
			return getRuleContext(Static_assertdeclarationContext.class,0);
		}
		public AliasdeclarationContext aliasdeclaration() {
			return getRuleContext(AliasdeclarationContext.class,0);
		}
		public OpaqueenumdeclarationContext opaqueenumdeclaration() {
			return getRuleContext(OpaqueenumdeclarationContext.class,0);
		}
		public BlockdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBlockdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBlockdeclaration(this);
		}
	}

	public final BlockdeclarationContext blockdeclaration() throws RecognitionException {
		BlockdeclarationContext _localctx = new BlockdeclarationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_blockdeclaration);
		try {
			setState(1350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1342);
				simpledeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1343);
				asmdefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1344);
				namespacealiasdefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1345);
				usingdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1346);
				usingdirective();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1347);
				static_assertdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1348);
				aliasdeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1349);
				opaqueenumdeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasdeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AliasdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAliasdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAliasdeclaration(this);
		}
	}

	public final AliasdeclarationContext aliasdeclaration() throws RecognitionException {
		AliasdeclarationContext _localctx = new AliasdeclarationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_aliasdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			match(Using);
			setState(1353);
			match(Identifier);
			setState(1355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1354);
				attributespecifierseq(0);
				}
			}

			setState(1357);
			match(Assign);
			setState(1358);
			typeid();
			setState(1359);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpledeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public SimpledeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpledeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSimpledeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSimpledeclaration(this);
		}
	}

	public final SimpledeclarationContext simpledeclaration() throws RecognitionException {
		SimpledeclarationContext _localctx = new SimpledeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_simpledeclaration);
		int _la;
		try {
			setState(1375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Thread_local:
			case Typedef:
			case Typename:
			case Union:
			case Unsigned:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1362);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1361);
					declspecifierseq();
					}
					break;
				}
				setState(1365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || _la==Operator || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (LeftParen - 78)) | (1L << (Star - 78)) | (1L << (And - 78)) | (1L << (Tilde - 78)) | (1L << (AndAnd - 78)) | (1L << (Doublecolon - 78)) | (1L << (Ellipsis - 78)) | (1L << (Identifier - 78)))) != 0)) {
					{
					setState(1364);
					initdeclaratorlist(0);
					}
				}

				setState(1367);
				match(Semi);
				}
				break;
			case Alignas:
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1368);
				attributespecifierseq(0);
				setState(1370);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
				case 1:
					{
					setState(1369);
					declspecifierseq();
					}
					break;
				}
				setState(1372);
				initdeclaratorlist(0);
				setState(1373);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Static_assertdeclarationContext extends ParserRuleContext {
		public TerminalNode Static_assert() { return getToken(CPP14Parser.Static_assert, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public Static_assertdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_static_assertdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterStatic_assertdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitStatic_assertdeclaration(this);
		}
	}

	public final Static_assertdeclarationContext static_assertdeclaration() throws RecognitionException {
		Static_assertdeclarationContext _localctx = new Static_assertdeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_static_assertdeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			match(Static_assert);
			setState(1378);
			match(LeftParen);
			setState(1379);
			constantexpression();
			setState(1380);
			match(Comma);
			setState(1381);
			match(Stringliteral);
			setState(1382);
			match(RightParen);
			setState(1383);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptydeclarationContext extends ParserRuleContext {
		public EmptydeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptydeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEmptydeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEmptydeclaration(this);
		}
	}

	public final EmptydeclarationContext emptydeclaration() throws RecognitionException {
		EmptydeclarationContext _localctx = new EmptydeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_emptydeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributedeclarationContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AttributedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributedeclaration(this);
		}
	}

	public final AttributedeclarationContext attributedeclaration() throws RecognitionException {
		AttributedeclarationContext _localctx = new AttributedeclarationContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_attributedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1387);
			attributespecifierseq(0);
			setState(1388);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclspecifierContext extends ParserRuleContext {
		public StorageclassspecifierContext storageclassspecifier() {
			return getRuleContext(StorageclassspecifierContext.class,0);
		}
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public FunctionspecifierContext functionspecifier() {
			return getRuleContext(FunctionspecifierContext.class,0);
		}
		public TerminalNode Friend() { return getToken(CPP14Parser.Friend, 0); }
		public TerminalNode Typedef() { return getToken(CPP14Parser.Typedef, 0); }
		public TerminalNode Constexpr() { return getToken(CPP14Parser.Constexpr, 0); }
		public DeclspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclspecifier(this);
		}
	}

	public final DeclspecifierContext declspecifier() throws RecognitionException {
		DeclspecifierContext _localctx = new DeclspecifierContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_declspecifier);
		try {
			setState(1396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Extern:
			case Mutable:
			case Register:
			case Static:
			case Thread_local:
				enterOuterAlt(_localctx, 1);
				{
				setState(1390);
				storageclassspecifier();
				}
				break;
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Decltype:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Struct:
			case Typename:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1391);
				typespecifier();
				}
				break;
			case Explicit:
			case Inline:
			case Virtual:
				enterOuterAlt(_localctx, 3);
				{
				setState(1392);
				functionspecifier();
				}
				break;
			case Friend:
				enterOuterAlt(_localctx, 4);
				{
				setState(1393);
				match(Friend);
				}
				break;
			case Typedef:
				enterOuterAlt(_localctx, 5);
				{
				setState(1394);
				match(Typedef);
				}
				break;
			case Constexpr:
				enterOuterAlt(_localctx, 6);
				{
				setState(1395);
				match(Constexpr);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclspecifierseqContext extends ParserRuleContext {
		public DeclspecifierContext declspecifier() {
			return getRuleContext(DeclspecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declspecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclspecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclspecifierseq(this);
		}
	}

	public final DeclspecifierseqContext declspecifierseq() throws RecognitionException {
		DeclspecifierseqContext _localctx = new DeclspecifierseqContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_declspecifierseq);
		try {
			setState(1405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1398);
				declspecifier();
				setState(1400);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1399);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1402);
				declspecifier();
				setState(1403);
				declspecifierseq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageclassspecifierContext extends ParserRuleContext {
		public TerminalNode Register() { return getToken(CPP14Parser.Register, 0); }
		public TerminalNode Static() { return getToken(CPP14Parser.Static, 0); }
		public TerminalNode Thread_local() { return getToken(CPP14Parser.Thread_local, 0); }
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public TerminalNode Mutable() { return getToken(CPP14Parser.Mutable, 0); }
		public StorageclassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageclassspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterStorageclassspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitStorageclassspecifier(this);
		}
	}

	public final StorageclassspecifierContext storageclassspecifier() throws RecognitionException {
		StorageclassspecifierContext _localctx = new StorageclassspecifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_storageclassspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Extern) | (1L << Mutable) | (1L << Register) | (1L << Static) | (1L << Thread_local))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionspecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public TerminalNode Virtual() { return getToken(CPP14Parser.Virtual, 0); }
		public TerminalNode Explicit() { return getToken(CPP14Parser.Explicit, 0); }
		public FunctionspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctionspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctionspecifier(this);
		}
	}

	public final FunctionspecifierContext functionspecifier() throws RecognitionException {
		FunctionspecifierContext _localctx = new FunctionspecifierContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_functionspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409);
			_la = _input.LA(1);
			if ( !(((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (Explicit - 27)) | (1L << (Inline - 27)) | (1L << (Virtual - 27)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypedefnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TypedefnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypedefname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypedefname(this);
		}
	}

	public final TypedefnameContext typedefname() throws RecognitionException {
		TypedefnameContext _localctx = new TypedefnameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_typedefname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1411);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypespecifierContext extends ParserRuleContext {
		public TrailingtypespecifierContext trailingtypespecifier() {
			return getRuleContext(TrailingtypespecifierContext.class,0);
		}
		public ClassspecifierContext classspecifier() {
			return getRuleContext(ClassspecifierContext.class,0);
		}
		public EnumspecifierContext enumspecifier() {
			return getRuleContext(EnumspecifierContext.class,0);
		}
		public TypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypespecifier(this);
		}
	}

	public final TypespecifierContext typespecifier() throws RecognitionException {
		TypespecifierContext _localctx = new TypespecifierContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_typespecifier);
		try {
			setState(1416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1413);
				trailingtypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1414);
				classspecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1415);
				enumspecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingtypespecifierContext extends ParserRuleContext {
		public SimpletypespecifierContext simpletypespecifier() {
			return getRuleContext(SimpletypespecifierContext.class,0);
		}
		public ElaboratedtypespecifierContext elaboratedtypespecifier() {
			return getRuleContext(ElaboratedtypespecifierContext.class,0);
		}
		public TypenamespecifierContext typenamespecifier() {
			return getRuleContext(TypenamespecifierContext.class,0);
		}
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public TrailingtypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingtypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTrailingtypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTrailingtypespecifier(this);
		}
	}

	public final TrailingtypespecifierContext trailingtypespecifier() throws RecognitionException {
		TrailingtypespecifierContext _localctx = new TrailingtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_trailingtypespecifier);
		try {
			setState(1422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Decltype:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Wchar:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1418);
				simpletypespecifier();
				}
				break;
			case Class:
			case Enum:
			case Struct:
			case Union:
				enterOuterAlt(_localctx, 2);
				{
				setState(1419);
				elaboratedtypespecifier();
				}
				break;
			case Typename:
				enterOuterAlt(_localctx, 3);
				{
				setState(1420);
				typenamespecifier();
				}
				break;
			case Const:
			case Volatile:
				enterOuterAlt(_localctx, 4);
				{
				setState(1421);
				cvqualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypespecifierseqContext extends ParserRuleContext {
		public TypespecifierContext typespecifier() {
			return getRuleContext(TypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public TypespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypespecifierseq(this);
		}
	}

	public final TypespecifierseqContext typespecifierseq() throws RecognitionException {
		TypespecifierseqContext _localctx = new TypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_typespecifierseq);
		try {
			setState(1431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1424);
				typespecifier();
				setState(1426);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1425);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1428);
				typespecifier();
				setState(1429);
				typespecifierseq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingtypespecifierseqContext extends ParserRuleContext {
		public TrailingtypespecifierContext trailingtypespecifier() {
			return getRuleContext(TrailingtypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TrailingtypespecifierseqContext trailingtypespecifierseq() {
			return getRuleContext(TrailingtypespecifierseqContext.class,0);
		}
		public TrailingtypespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingtypespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTrailingtypespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTrailingtypespecifierseq(this);
		}
	}

	public final TrailingtypespecifierseqContext trailingtypespecifierseq() throws RecognitionException {
		TrailingtypespecifierseqContext _localctx = new TrailingtypespecifierseqContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_trailingtypespecifierseq);
		try {
			setState(1440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1433);
				trailingtypespecifier();
				setState(1435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1434);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1437);
				trailingtypespecifier();
				setState(1438);
				trailingtypespecifierseq();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpletypespecifierContext extends ParserRuleContext {
		public TypenameContext typename() {
			return getRuleContext(TypenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Char() { return getToken(CPP14Parser.Char, 0); }
		public TerminalNode Char16() { return getToken(CPP14Parser.Char16, 0); }
		public TerminalNode Char32() { return getToken(CPP14Parser.Char32, 0); }
		public TerminalNode Wchar() { return getToken(CPP14Parser.Wchar, 0); }
		public TerminalNode Bool() { return getToken(CPP14Parser.Bool, 0); }
		public TerminalNode Short() { return getToken(CPP14Parser.Short, 0); }
		public TerminalNode Int() { return getToken(CPP14Parser.Int, 0); }
		public TerminalNode Long() { return getToken(CPP14Parser.Long, 0); }
		public TerminalNode Signed() { return getToken(CPP14Parser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(CPP14Parser.Unsigned, 0); }
		public TerminalNode Float() { return getToken(CPP14Parser.Float, 0); }
		public TerminalNode Double() { return getToken(CPP14Parser.Double, 0); }
		public TerminalNode Void() { return getToken(CPP14Parser.Void, 0); }
		public TerminalNode Auto() { return getToken(CPP14Parser.Auto, 0); }
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public SimpletypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSimpletypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSimpletypespecifier(this);
		}
	}

	public final SimpletypespecifierContext simpletypespecifier() throws RecognitionException {
		SimpletypespecifierContext _localctx = new SimpletypespecifierContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_simpletypespecifier);
		try {
			setState(1465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1442);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1445);
				typename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1446);
				nestednamespecifier(0);
				setState(1447);
				match(Template);
				setState(1448);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1450);
				match(Char);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1451);
				match(Char16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1452);
				match(Char32);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1453);
				match(Wchar);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1454);
				match(Bool);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1455);
				match(Short);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1456);
				match(Int);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1457);
				match(Long);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1458);
				match(Signed);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1459);
				match(Unsigned);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1460);
				match(Float);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1461);
				match(Double);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1462);
				match(Void);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1463);
				match(Auto);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1464);
				decltypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypenameContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public EnumnameContext enumname() {
			return getRuleContext(EnumnameContext.class,0);
		}
		public TypedefnameContext typedefname() {
			return getRuleContext(TypedefnameContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TypenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypename(this);
		}
	}

	public final TypenameContext typename() throws RecognitionException {
		TypenameContext _localctx = new TypenameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_typename);
		try {
			setState(1471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1467);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1468);
				enumname();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1469);
				typedefname();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1470);
				simpletemplateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecltypespecifierContext extends ParserRuleContext {
		public TerminalNode Decltype() { return getToken(CPP14Parser.Decltype, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Auto() { return getToken(CPP14Parser.Auto, 0); }
		public DecltypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decltypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDecltypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDecltypespecifier(this);
		}
	}

	public final DecltypespecifierContext decltypespecifier() throws RecognitionException {
		DecltypespecifierContext _localctx = new DecltypespecifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_decltypespecifier);
		try {
			setState(1482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1473);
				match(Decltype);
				setState(1474);
				match(LeftParen);
				setState(1475);
				expression(0);
				setState(1476);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1478);
				match(Decltype);
				setState(1479);
				match(LeftParen);
				setState(1480);
				match(Auto);
				setState(1481);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElaboratedtypespecifierContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TerminalNode Enum() { return getToken(CPP14Parser.Enum, 0); }
		public ElaboratedtypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elaboratedtypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterElaboratedtypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitElaboratedtypespecifier(this);
		}
	}

	public final ElaboratedtypespecifierContext elaboratedtypespecifier() throws RecognitionException {
		ElaboratedtypespecifierContext _localctx = new ElaboratedtypespecifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_elaboratedtypespecifier);
		int _la;
		try {
			setState(1508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1484);
				classkey();
				setState(1486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1485);
					attributespecifierseq(0);
					}
				}

				setState(1489);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
				case 1:
					{
					setState(1488);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1491);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1493);
				classkey();
				setState(1494);
				simpletemplateid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1496);
				classkey();
				setState(1497);
				nestednamespecifier(0);
				setState(1499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(1498);
					match(Template);
					}
				}

				setState(1501);
				simpletemplateid();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1503);
				match(Enum);
				setState(1505);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(1504);
					nestednamespecifier(0);
					}
					break;
				}
				setState(1507);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public EnumnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumname(this);
		}
	}

	public final EnumnameContext enumname() throws RecognitionException {
		EnumnameContext _localctx = new EnumnameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_enumname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumspecifierContext extends ParserRuleContext {
		public EnumheadContext enumhead() {
			return getRuleContext(EnumheadContext.class,0);
		}
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public EnumspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumspecifier(this);
		}
	}

	public final EnumspecifierContext enumspecifier() throws RecognitionException {
		EnumspecifierContext _localctx = new EnumspecifierContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_enumspecifier);
		int _la;
		try {
			setState(1525);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1512);
				enumhead();
				setState(1513);
				match(LeftBrace);
				setState(1515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1514);
					enumeratorlist(0);
					}
				}

				setState(1517);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1519);
				enumhead();
				setState(1520);
				match(LeftBrace);
				setState(1521);
				enumeratorlist(0);
				setState(1522);
				match(Comma);
				setState(1523);
				match(RightBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumheadContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public EnumheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumhead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumhead(this);
		}
	}

	public final EnumheadContext enumhead() throws RecognitionException {
		EnumheadContext _localctx = new EnumheadContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_enumhead);
		int _la;
		try {
			setState(1546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1527);
				enumkey();
				setState(1529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1528);
					attributespecifierseq(0);
					}
				}

				setState(1532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1531);
					match(Identifier);
					}
				}

				setState(1535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1534);
					enumbase();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1537);
				enumkey();
				setState(1539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(1538);
					attributespecifierseq(0);
					}
				}

				setState(1541);
				nestednamespecifier(0);
				setState(1542);
				match(Identifier);
				setState(1544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(1543);
					enumbase();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpaqueenumdeclarationContext extends ParserRuleContext {
		public EnumkeyContext enumkey() {
			return getRuleContext(EnumkeyContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public EnumbaseContext enumbase() {
			return getRuleContext(EnumbaseContext.class,0);
		}
		public OpaqueenumdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opaqueenumdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOpaqueenumdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOpaqueenumdeclaration(this);
		}
	}

	public final OpaqueenumdeclarationContext opaqueenumdeclaration() throws RecognitionException {
		OpaqueenumdeclarationContext _localctx = new OpaqueenumdeclarationContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_opaqueenumdeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1548);
			enumkey();
			setState(1550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1549);
				attributespecifierseq(0);
				}
			}

			setState(1552);
			match(Identifier);
			setState(1554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(1553);
				enumbase();
				}
			}

			setState(1556);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumkeyContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(CPP14Parser.Enum, 0); }
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public TerminalNode Struct() { return getToken(CPP14Parser.Struct, 0); }
		public EnumkeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumkey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumkey(this);
		}
	}

	public final EnumkeyContext enumkey() throws RecognitionException {
		EnumkeyContext _localctx = new EnumkeyContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_enumkey);
		try {
			setState(1563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1558);
				match(Enum);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1559);
				match(Enum);
				setState(1560);
				match(Class);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1561);
				match(Enum);
				setState(1562);
				match(Struct);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumbaseContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public EnumbaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumbase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumbase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumbase(this);
		}
	}

	public final EnumbaseContext enumbase() throws RecognitionException {
		EnumbaseContext _localctx = new EnumbaseContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_enumbase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			match(Colon);
			setState(1566);
			typespecifierseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorlistContext extends ParserRuleContext {
		public EnumeratordefinitionContext enumeratordefinition() {
			return getRuleContext(EnumeratordefinitionContext.class,0);
		}
		public EnumeratorlistContext enumeratorlist() {
			return getRuleContext(EnumeratorlistContext.class,0);
		}
		public EnumeratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumeratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumeratorlist(this);
		}
	}

	public final EnumeratorlistContext enumeratorlist() throws RecognitionException {
		return enumeratorlist(0);
	}

	private EnumeratorlistContext enumeratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorlistContext _localctx = new EnumeratorlistContext(_ctx, _parentState);
		EnumeratorlistContext _prevctx = _localctx;
		int _startState = 182;
		enterRecursionRule(_localctx, 182, RULE_enumeratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1569);
			enumeratordefinition();
			}
			_ctx.stop = _input.LT(-1);
			setState(1576);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorlist);
					setState(1571);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1572);
					match(Comma);
					setState(1573);
					enumeratordefinition();
					}
					} 
				}
				setState(1578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnumeratordefinitionContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public EnumeratordefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratordefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumeratordefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumeratordefinition(this);
		}
	}

	public final EnumeratordefinitionContext enumeratordefinition() throws RecognitionException {
		EnumeratordefinitionContext _localctx = new EnumeratordefinitionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_enumeratordefinition);
		try {
			setState(1584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1579);
				enumerator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1580);
				enumerator();
				setState(1581);
				match(Assign);
				setState(1582);
				constantexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitEnumerator(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_enumerator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacenameContext extends ParserRuleContext {
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public NamespacealiasContext namespacealias() {
			return getRuleContext(NamespacealiasContext.class,0);
		}
		public NamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacename(this);
		}
	}

	public final NamespacenameContext namespacename() throws RecognitionException {
		NamespacenameContext _localctx = new NamespacenameContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_namespacename);
		try {
			setState(1590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1588);
				originalnamespacename();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1589);
				namespacealias();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OriginalnamespacenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public OriginalnamespacenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOriginalnamespacename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOriginalnamespacename(this);
		}
	}

	public final OriginalnamespacenameContext originalnamespacename() throws RecognitionException {
		OriginalnamespacenameContext _localctx = new OriginalnamespacenameContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_originalnamespacename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1592);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacedefinitionContext extends ParserRuleContext {
		public NamednamespacedefinitionContext namednamespacedefinition() {
			return getRuleContext(NamednamespacedefinitionContext.class,0);
		}
		public UnnamednamespacedefinitionContext unnamednamespacedefinition() {
			return getRuleContext(UnnamednamespacedefinitionContext.class,0);
		}
		public NamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacedefinition(this);
		}
	}

	public final NamespacedefinitionContext namespacedefinition() throws RecognitionException {
		NamespacedefinitionContext _localctx = new NamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_namespacedefinition);
		try {
			setState(1596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1594);
				namednamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1595);
				unnamednamespacedefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamednamespacedefinitionContext extends ParserRuleContext {
		public OriginalnamespacedefinitionContext originalnamespacedefinition() {
			return getRuleContext(OriginalnamespacedefinitionContext.class,0);
		}
		public ExtensionnamespacedefinitionContext extensionnamespacedefinition() {
			return getRuleContext(ExtensionnamespacedefinitionContext.class,0);
		}
		public NamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namednamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamednamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamednamespacedefinition(this);
		}
	}

	public final NamednamespacedefinitionContext namednamespacedefinition() throws RecognitionException {
		NamednamespacedefinitionContext _localctx = new NamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_namednamespacedefinition);
		try {
			setState(1600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1598);
				originalnamespacedefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1599);
				extensionnamespacedefinition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OriginalnamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public OriginalnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_originalnamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOriginalnamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOriginalnamespacedefinition(this);
		}
	}

	public final OriginalnamespacedefinitionContext originalnamespacedefinition() throws RecognitionException {
		OriginalnamespacedefinitionContext _localctx = new OriginalnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_originalnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1602);
				match(Inline);
				}
			}

			setState(1605);
			match(Namespace);
			setState(1606);
			match(Identifier);
			setState(1607);
			match(LeftBrace);
			setState(1608);
			namespacebody();
			setState(1609);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionnamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public OriginalnamespacenameContext originalnamespacename() {
			return getRuleContext(OriginalnamespacenameContext.class,0);
		}
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public ExtensionnamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionnamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExtensionnamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExtensionnamespacedefinition(this);
		}
	}

	public final ExtensionnamespacedefinitionContext extensionnamespacedefinition() throws RecognitionException {
		ExtensionnamespacedefinitionContext _localctx = new ExtensionnamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_extensionnamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1611);
				match(Inline);
				}
			}

			setState(1614);
			match(Namespace);
			setState(1615);
			originalnamespacename();
			setState(1616);
			match(LeftBrace);
			setState(1617);
			namespacebody();
			setState(1618);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnnamednamespacedefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public NamespacebodyContext namespacebody() {
			return getRuleContext(NamespacebodyContext.class,0);
		}
		public TerminalNode Inline() { return getToken(CPP14Parser.Inline, 0); }
		public UnnamednamespacedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamednamespacedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUnnamednamespacedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUnnamednamespacedefinition(this);
		}
	}

	public final UnnamednamespacedefinitionContext unnamednamespacedefinition() throws RecognitionException {
		UnnamednamespacedefinitionContext _localctx = new UnnamednamespacedefinitionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_unnamednamespacedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(1620);
				match(Inline);
				}
			}

			setState(1623);
			match(Namespace);
			setState(1624);
			match(LeftBrace);
			setState(1625);
			namespacebody();
			setState(1626);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacebodyContext extends ParserRuleContext {
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public NamespacebodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacebody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacebody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacebody(this);
		}
	}

	public final NamespacebodyContext namespacebody() throws RecognitionException {
		NamespacebodyContext _localctx = new NamespacebodyContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_namespacebody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typedef - 67)) | (1L << (Typename - 67)) | (1L << (Union - 67)) | (1L << (Unsigned - 67)) | (1L << (Using - 67)) | (1L << (Virtual - 67)) | (1L << (Void - 67)) | (1L << (Volatile - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Tilde - 67)) | (1L << (AndAnd - 67)) | (1L << (Doublecolon - 67)) | (1L << (Semi - 67)) | (1L << (Ellipsis - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(1628);
				declarationseq(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacealiasContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public NamespacealiasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacealias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacealias(this);
		}
	}

	public final NamespacealiasContext namespacealias() throws RecognitionException {
		NamespacealiasContext _localctx = new NamespacealiasContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_namespacealias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacealiasdefinitionContext extends ParserRuleContext {
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public QualifiednamespacespecifierContext qualifiednamespacespecifier() {
			return getRuleContext(QualifiednamespacespecifierContext.class,0);
		}
		public NamespacealiasdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacealiasdefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNamespacealiasdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNamespacealiasdefinition(this);
		}
	}

	public final NamespacealiasdefinitionContext namespacealiasdefinition() throws RecognitionException {
		NamespacealiasdefinitionContext _localctx = new NamespacealiasdefinitionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_namespacealiasdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1633);
			match(Namespace);
			setState(1634);
			match(Identifier);
			setState(1635);
			match(Assign);
			setState(1636);
			qualifiednamespacespecifier();
			setState(1637);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiednamespacespecifierContext extends ParserRuleContext {
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public QualifiednamespacespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiednamespacespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterQualifiednamespacespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitQualifiednamespacespecifier(this);
		}
	}

	public final QualifiednamespacespecifierContext qualifiednamespacespecifier() throws RecognitionException {
		QualifiednamespacespecifierContext _localctx = new QualifiednamespacespecifierContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_qualifiednamespacespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1639);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1642);
			namespacename();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingdeclarationContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UnqualifiedidContext unqualifiedid() {
			return getRuleContext(UnqualifiedidContext.class,0);
		}
		public TerminalNode Typename() { return getToken(CPP14Parser.Typename, 0); }
		public UsingdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUsingdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUsingdeclaration(this);
		}
	}

	public final UsingdeclarationContext usingdeclaration() throws RecognitionException {
		UsingdeclarationContext _localctx = new UsingdeclarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_usingdeclaration);
		int _la;
		try {
			setState(1657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1644);
				match(Using);
				setState(1646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Typename) {
					{
					setState(1645);
					match(Typename);
					}
				}

				setState(1648);
				nestednamespecifier(0);
				setState(1649);
				unqualifiedid();
				setState(1650);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1652);
				match(Using);
				setState(1653);
				match(Doublecolon);
				setState(1654);
				unqualifiedid();
				setState(1655);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingdirectiveContext extends ParserRuleContext {
		public TerminalNode Using() { return getToken(CPP14Parser.Using, 0); }
		public TerminalNode Namespace() { return getToken(CPP14Parser.Namespace, 0); }
		public NamespacenameContext namespacename() {
			return getRuleContext(NamespacenameContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public UsingdirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usingdirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUsingdirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUsingdirective(this);
		}
	}

	public final UsingdirectiveContext usingdirective() throws RecognitionException {
		UsingdirectiveContext _localctx = new UsingdirectiveContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_usingdirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(1659);
				attributespecifierseq(0);
				}
			}

			setState(1662);
			match(Using);
			setState(1663);
			match(Namespace);
			setState(1665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
			case 1:
				{
				setState(1664);
				nestednamespecifier(0);
				}
				break;
			}
			setState(1667);
			namespacename();
			setState(1668);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsmdefinitionContext extends ParserRuleContext {
		public TerminalNode Asm() { return getToken(CPP14Parser.Asm, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public AsmdefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmdefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAsmdefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAsmdefinition(this);
		}
	}

	public final AsmdefinitionContext asmdefinition() throws RecognitionException {
		AsmdefinitionContext _localctx = new AsmdefinitionContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_asmdefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			match(Asm);
			setState(1671);
			match(LeftParen);
			setState(1672);
			match(Stringliteral);
			setState(1673);
			match(RightParen);
			setState(1674);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LinkagespecificationContext extends ParserRuleContext {
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LinkagespecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkagespecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLinkagespecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLinkagespecification(this);
		}
	}

	public final LinkagespecificationContext linkagespecification() throws RecognitionException {
		LinkagespecificationContext _localctx = new LinkagespecificationContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_linkagespecification);
		int _la;
		try {
			setState(1686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1676);
				match(Extern);
				setState(1677);
				match(Stringliteral);
				setState(1678);
				match(LeftBrace);
				setState(1680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Asm) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Namespace) | (1L << Operator) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typedef - 67)) | (1L << (Typename - 67)) | (1L << (Union - 67)) | (1L << (Unsigned - 67)) | (1L << (Using - 67)) | (1L << (Virtual - 67)) | (1L << (Void - 67)) | (1L << (Volatile - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Tilde - 67)) | (1L << (AndAnd - 67)) | (1L << (Doublecolon - 67)) | (1L << (Semi - 67)) | (1L << (Ellipsis - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					setState(1679);
					declarationseq(0);
					}
				}

				setState(1682);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1683);
				match(Extern);
				setState(1684);
				match(Stringliteral);
				setState(1685);
				declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributespecifierseqContext extends ParserRuleContext {
		public AttributespecifierContext attributespecifier() {
			return getRuleContext(AttributespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AttributespecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributespecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributespecifierseq(this);
		}
	}

	public final AttributespecifierseqContext attributespecifierseq() throws RecognitionException {
		return attributespecifierseq(0);
	}

	private AttributespecifierseqContext attributespecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributespecifierseqContext _localctx = new AttributespecifierseqContext(_ctx, _parentState);
		AttributespecifierseqContext _prevctx = _localctx;
		int _startState = 218;
		enterRecursionRule(_localctx, 218, RULE_attributespecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1689);
			attributespecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(1695);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AttributespecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_attributespecifierseq);
					setState(1691);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1692);
					attributespecifier();
					}
					} 
				}
				setState(1697);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,188,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AttributespecifierContext extends ParserRuleContext {
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public AlignmentspecifierContext alignmentspecifier() {
			return getRuleContext(AlignmentspecifierContext.class,0);
		}
		public AttributespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributespecifier(this);
		}
	}

	public final AttributespecifierContext attributespecifier() throws RecognitionException {
		AttributespecifierContext _localctx = new AttributespecifierContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_attributespecifier);
		try {
			setState(1705);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1698);
				match(LeftBracket);
				setState(1699);
				match(LeftBracket);
				setState(1700);
				attributelist(0);
				setState(1701);
				match(RightBracket);
				setState(1702);
				match(RightBracket);
				}
				break;
			case Alignas:
				enterOuterAlt(_localctx, 2);
				{
				setState(1704);
				alignmentspecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlignmentspecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(CPP14Parser.Alignas, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AlignmentspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAlignmentspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAlignmentspecifier(this);
		}
	}

	public final AlignmentspecifierContext alignmentspecifier() throws RecognitionException {
		AlignmentspecifierContext _localctx = new AlignmentspecifierContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_alignmentspecifier);
		int _la;
		try {
			setState(1723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1707);
				match(Alignas);
				setState(1708);
				match(LeftParen);
				setState(1709);
				typeid();
				setState(1711);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1710);
					match(Ellipsis);
					}
				}

				setState(1713);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1715);
				match(Alignas);
				setState(1716);
				match(LeftParen);
				setState(1717);
				constantexpression();
				setState(1719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1718);
					match(Ellipsis);
					}
				}

				setState(1721);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributelistContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public AttributelistContext attributelist() {
			return getRuleContext(AttributelistContext.class,0);
		}
		public AttributelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributelist(this);
		}
	}

	public final AttributelistContext attributelist() throws RecognitionException {
		return attributelist(0);
	}

	private AttributelistContext attributelist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AttributelistContext _localctx = new AttributelistContext(_ctx, _parentState);
		AttributelistContext _prevctx = _localctx;
		int _startState = 224;
		enterRecursionRule(_localctx, 224, RULE_attributelist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1727);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1726);
					attribute();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1729);
				attribute();
				setState(1730);
				match(Ellipsis);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1746);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1744);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
					case 1:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1734);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1735);
						match(Comma);
						setState(1737);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
						case 1:
							{
							setState(1736);
							attribute();
							}
							break;
						}
						}
						break;
					case 2:
						{
						_localctx = new AttributelistContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_attributelist);
						setState(1739);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1740);
						match(Comma);
						setState(1741);
						attribute();
						setState(1742);
						match(Ellipsis);
						}
						break;
					}
					} 
				}
				setState(1748);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,197,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public AttributetokenContext attributetoken() {
			return getRuleContext(AttributetokenContext.class,0);
		}
		public AttributeargumentclauseContext attributeargumentclause() {
			return getRuleContext(AttributeargumentclauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1749);
			attributetoken();
			setState(1751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1750);
				attributeargumentclause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributetokenContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributescopedtokenContext attributescopedtoken() {
			return getRuleContext(AttributescopedtokenContext.class,0);
		}
		public AttributetokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributetoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributetoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributetoken(this);
		}
	}

	public final AttributetokenContext attributetoken() throws RecognitionException {
		AttributetokenContext _localctx = new AttributetokenContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_attributetoken);
		try {
			setState(1755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1753);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1754);
				attributescopedtoken();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributescopedtokenContext extends ParserRuleContext {
		public AttributenamespaceContext attributenamespace() {
			return getRuleContext(AttributenamespaceContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributescopedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributescopedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributescopedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributescopedtoken(this);
		}
	}

	public final AttributescopedtokenContext attributescopedtoken() throws RecognitionException {
		AttributescopedtokenContext _localctx = new AttributescopedtokenContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_attributescopedtoken);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1757);
			attributenamespace();
			setState(1758);
			match(Doublecolon);
			setState(1759);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributenamespaceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributenamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributenamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributenamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributenamespace(this);
		}
	}

	public final AttributenamespaceContext attributenamespace() throws RecognitionException {
		AttributenamespaceContext _localctx = new AttributenamespaceContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_attributenamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1761);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeargumentclauseContext extends ParserRuleContext {
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public AttributeargumentclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeargumentclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAttributeargumentclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAttributeargumentclause(this);
		}
	}

	public final AttributeargumentclauseContext attributeargumentclause() throws RecognitionException {
		AttributeargumentclauseContext _localctx = new AttributeargumentclauseContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_attributeargumentclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			match(LeftParen);
			setState(1764);
			balancedtokenseq(0);
			setState(1765);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BalancedtokenseqContext extends ParserRuleContext {
		public BalancedtokenContext balancedtoken() {
			return getRuleContext(BalancedtokenContext.class,0);
		}
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public BalancedtokenseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtokenseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBalancedtokenseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBalancedtokenseq(this);
		}
	}

	public final BalancedtokenseqContext balancedtokenseq() throws RecognitionException {
		return balancedtokenseq(0);
	}

	private BalancedtokenseqContext balancedtokenseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BalancedtokenseqContext _localctx = new BalancedtokenseqContext(_ctx, _parentState);
		BalancedtokenseqContext _prevctx = _localctx;
		int _startState = 236;
		enterRecursionRule(_localctx, 236, RULE_balancedtokenseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1768);
				balancedtoken();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(1775);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BalancedtokenseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_balancedtokenseq);
					setState(1771);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1772);
					balancedtoken();
					}
					} 
				}
				setState(1777);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BalancedtokenContext extends ParserRuleContext {
		public BalancedtokenseqContext balancedtokenseq() {
			return getRuleContext(BalancedtokenseqContext.class,0);
		}
		public BalancedtokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedtoken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBalancedtoken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBalancedtoken(this);
		}
	}

	public final BalancedtokenContext balancedtoken() throws RecognitionException {
		BalancedtokenContext _localctx = new BalancedtokenContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_balancedtoken);
		try {
			setState(1790);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(1778);
				match(LeftParen);
				setState(1779);
				balancedtokenseq(0);
				setState(1780);
				match(RightParen);
				}
				break;
			case LeftBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(1782);
				match(LeftBracket);
				setState(1783);
				balancedtokenseq(0);
				setState(1784);
				match(RightBracket);
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 3);
				{
				setState(1786);
				match(LeftBrace);
				setState(1787);
				balancedtokenseq(0);
				setState(1788);
				match(RightBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitdeclaratorlistContext extends ParserRuleContext {
		public InitdeclaratorContext initdeclarator() {
			return getRuleContext(InitdeclaratorContext.class,0);
		}
		public InitdeclaratorlistContext initdeclaratorlist() {
			return getRuleContext(InitdeclaratorlistContext.class,0);
		}
		public InitdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclaratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitdeclaratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitdeclaratorlist(this);
		}
	}

	public final InitdeclaratorlistContext initdeclaratorlist() throws RecognitionException {
		return initdeclaratorlist(0);
	}

	private InitdeclaratorlistContext initdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitdeclaratorlistContext _localctx = new InitdeclaratorlistContext(_ctx, _parentState);
		InitdeclaratorlistContext _prevctx = _localctx;
		int _startState = 240;
		enterRecursionRule(_localctx, 240, RULE_initdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1793);
			initdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1800);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initdeclaratorlist);
					setState(1795);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1796);
					match(Comma);
					setState(1797);
					initdeclarator();
					}
					} 
				}
				setState(1802);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InitdeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitdeclarator(this);
		}
	}

	public final InitdeclaratorContext initdeclarator() throws RecognitionException {
		InitdeclaratorContext _localctx = new InitdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_initdeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1803);
			declarator();
			setState(1805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1804);
				initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclarator(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_declarator);
		try {
			setState(1812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1807);
				ptrdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1808);
				noptrdeclarator(0);
				setState(1809);
				parametersandqualifiers();
				setState(1810);
				trailingreturntype();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrdeclaratorContext extends ParserRuleContext {
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public PtrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPtrdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPtrdeclarator(this);
		}
	}

	public final PtrdeclaratorContext ptrdeclarator() throws RecognitionException {
		PtrdeclaratorContext _localctx = new PtrdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_ptrdeclarator);
		try {
			setState(1818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1814);
				noptrdeclarator(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1815);
				ptroperator();
				setState(1816);
				ptrdeclarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrdeclaratorContext extends ParserRuleContext {
		public DeclaratoridContext declaratorid() {
			return getRuleContext(DeclaratoridContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public PtrdeclaratorContext ptrdeclarator() {
			return getRuleContext(PtrdeclaratorContext.class,0);
		}
		public NoptrdeclaratorContext noptrdeclarator() {
			return getRuleContext(NoptrdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoptrdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoptrdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoptrdeclarator(this);
		}
	}

	public final NoptrdeclaratorContext noptrdeclarator() throws RecognitionException {
		return noptrdeclarator(0);
	}

	private NoptrdeclaratorContext noptrdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrdeclaratorContext _localctx = new NoptrdeclaratorContext(_ctx, _parentState);
		NoptrdeclaratorContext _prevctx = _localctx;
		int _startState = 248;
		enterRecursionRule(_localctx, 248, RULE_noptrdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decltype:
			case Operator:
			case Tilde:
			case Doublecolon:
			case Ellipsis:
			case Identifier:
				{
				setState(1821);
				declaratorid();
				setState(1823);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1822);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case LeftParen:
				{
				setState(1825);
				match(LeftParen);
				setState(1826);
				ptrdeclarator();
				setState(1827);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1844);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1842);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1831);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1832);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrdeclarator);
						setState(1833);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1834);
						match(LeftBracket);
						setState(1836);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Characterliteral - 132)) | (1L << (Floatingliteral - 132)) | (1L << (Stringliteral - 132)) | (1L << (Userdefinedintegerliteral - 132)) | (1L << (Userdefinedfloatingliteral - 132)) | (1L << (Userdefinedstringliteral - 132)) | (1L << (Userdefinedcharacterliteral - 132)))) != 0)) {
							{
							setState(1835);
							constantexpression();
							}
						}

						setState(1838);
						match(RightBracket);
						setState(1840);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
						case 1:
							{
							setState(1839);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1846);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,212,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParametersandqualifiersContext extends ParserRuleContext {
		public ParameterdeclarationclauseContext parameterdeclarationclause() {
			return getRuleContext(ParameterdeclarationclauseContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public RefqualifierContext refqualifier() {
			return getRuleContext(RefqualifierContext.class,0);
		}
		public ExceptionspecificationContext exceptionspecification() {
			return getRuleContext(ExceptionspecificationContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ParametersandqualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersandqualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterParametersandqualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitParametersandqualifiers(this);
		}
	}

	public final ParametersandqualifiersContext parametersandqualifiers() throws RecognitionException {
		ParametersandqualifiersContext _localctx = new ParametersandqualifiersContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_parametersandqualifiers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			match(LeftParen);
			setState(1848);
			parameterdeclarationclause();
			setState(1849);
			match(RightParen);
			setState(1851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1850);
				cvqualifierseq();
				}
				break;
			}
			setState(1854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1853);
				refqualifier();
				}
				break;
			}
			setState(1857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				setState(1856);
				exceptionspecification();
				}
				break;
			}
			setState(1860);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1859);
				attributespecifierseq(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrailingreturntypeContext extends ParserRuleContext {
		public TrailingtypespecifierseqContext trailingtypespecifierseq() {
			return getRuleContext(TrailingtypespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TrailingreturntypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailingreturntype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTrailingreturntype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTrailingreturntype(this);
		}
	}

	public final TrailingreturntypeContext trailingreturntype() throws RecognitionException {
		TrailingreturntypeContext _localctx = new TrailingreturntypeContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_trailingreturntype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1862);
			match(Arrow);
			setState(1863);
			trailingtypespecifierseq();
			setState(1865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1864);
				abstractdeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtroperatorContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public PtroperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptroperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPtroperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPtroperator(this);
		}
	}

	public final PtroperatorContext ptroperator() throws RecognitionException {
		PtroperatorContext _localctx = new PtroperatorContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_ptroperator);
		try {
			setState(1890);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				enterOuterAlt(_localctx, 1);
				{
				setState(1867);
				match(Star);
				setState(1869);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1868);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1872);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1871);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			case And:
				enterOuterAlt(_localctx, 2);
				{
				setState(1874);
				match(And);
				setState(1876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1875);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case AndAnd:
				enterOuterAlt(_localctx, 3);
				{
				setState(1878);
				match(AndAnd);
				setState(1880);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1879);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case Decltype:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(1882);
				nestednamespecifier(0);
				setState(1883);
				match(Star);
				setState(1885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
				case 1:
					{
					setState(1884);
					attributespecifierseq(0);
					}
					break;
				}
				setState(1888);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
				case 1:
					{
					setState(1887);
					cvqualifierseq();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CvqualifierseqContext extends ParserRuleContext {
		public CvqualifierContext cvqualifier() {
			return getRuleContext(CvqualifierContext.class,0);
		}
		public CvqualifierseqContext cvqualifierseq() {
			return getRuleContext(CvqualifierseqContext.class,0);
		}
		public CvqualifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCvqualifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCvqualifierseq(this);
		}
	}

	public final CvqualifierseqContext cvqualifierseq() throws RecognitionException {
		CvqualifierseqContext _localctx = new CvqualifierseqContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_cvqualifierseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1892);
			cvqualifier();
			setState(1894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				{
				setState(1893);
				cvqualifierseq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CvqualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(CPP14Parser.Const, 0); }
		public TerminalNode Volatile() { return getToken(CPP14Parser.Volatile, 0); }
		public CvqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cvqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCvqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCvqualifier(this);
		}
	}

	public final CvqualifierContext cvqualifier() throws RecognitionException {
		CvqualifierContext _localctx = new CvqualifierContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_cvqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1896);
			_la = _input.LA(1);
			if ( !(_la==Const || _la==Volatile) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefqualifierContext extends ParserRuleContext {
		public RefqualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refqualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterRefqualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitRefqualifier(this);
		}
	}

	public final RefqualifierContext refqualifier() throws RecognitionException {
		RefqualifierContext _localctx = new RefqualifierContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_refqualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1898);
			_la = _input.LA(1);
			if ( !(_la==And || _la==AndAnd) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratoridContext extends ParserRuleContext {
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public DeclaratoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaratorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDeclaratorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDeclaratorid(this);
		}
	}

	public final DeclaratoridContext declaratorid() throws RecognitionException {
		DeclaratoridContext _localctx = new DeclaratoridContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_declaratorid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Ellipsis) {
				{
				setState(1900);
				match(Ellipsis);
				}
			}

			setState(1903);
			idexpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public TypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypeid(this);
		}
	}

	public final TypeidContext typeid() throws RecognitionException {
		TypeidContext _localctx = new TypeidContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_typeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1905);
			typespecifierseq();
			setState(1907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1906);
				abstractdeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractdeclaratorContext extends ParserRuleContext {
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public TrailingreturntypeContext trailingreturntype() {
			return getRuleContext(TrailingreturntypeContext.class,0);
		}
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public AbstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAbstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAbstractdeclarator(this);
		}
	}

	public final AbstractdeclaratorContext abstractdeclarator() throws RecognitionException {
		AbstractdeclaratorContext _localctx = new AbstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_abstractdeclarator);
		try {
			setState(1917);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1909);
				ptrabstractdeclarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1911);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1910);
					noptrabstractdeclarator(0);
					}
					break;
				}
				setState(1913);
				parametersandqualifiers();
				setState(1914);
				trailingreturntype();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1916);
				abstractpackdeclarator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PtrabstractdeclaratorContext extends ParserRuleContext {
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public PtrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptrabstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPtrabstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPtrabstractdeclarator(this);
		}
	}

	public final PtrabstractdeclaratorContext ptrabstractdeclarator() throws RecognitionException {
		PtrabstractdeclaratorContext _localctx = new PtrabstractdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_ptrabstractdeclarator);
		try {
			setState(1924);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1919);
				noptrabstractdeclarator(0);
				}
				break;
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1920);
				ptroperator();
				setState(1922);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1921);
					ptrabstractdeclarator();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrabstractdeclaratorContext extends ParserRuleContext {
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public PtrabstractdeclaratorContext ptrabstractdeclarator() {
			return getRuleContext(PtrabstractdeclaratorContext.class,0);
		}
		public NoptrabstractdeclaratorContext noptrabstractdeclarator() {
			return getRuleContext(NoptrabstractdeclaratorContext.class,0);
		}
		public NoptrabstractdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoptrabstractdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoptrabstractdeclarator(this);
		}
	}

	public final NoptrabstractdeclaratorContext noptrabstractdeclarator() throws RecognitionException {
		return noptrabstractdeclarator(0);
	}

	private NoptrabstractdeclaratorContext noptrabstractdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractdeclaratorContext _localctx = new NoptrabstractdeclaratorContext(_ctx, _parentState);
		NoptrabstractdeclaratorContext _prevctx = _localctx;
		int _startState = 270;
		enterRecursionRule(_localctx, 270, RULE_noptrabstractdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(1927);
				parametersandqualifiers();
				}
				break;
			case 2:
				{
				setState(1928);
				match(LeftBracket);
				setState(1930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Characterliteral - 132)) | (1L << (Floatingliteral - 132)) | (1L << (Stringliteral - 132)) | (1L << (Userdefinedintegerliteral - 132)) | (1L << (Userdefinedfloatingliteral - 132)) | (1L << (Userdefinedstringliteral - 132)) | (1L << (Userdefinedcharacterliteral - 132)))) != 0)) {
					{
					setState(1929);
					constantexpression();
					}
				}

				setState(1932);
				match(RightBracket);
				setState(1934);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
				case 1:
					{
					setState(1933);
					attributespecifierseq(0);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1936);
				match(LeftParen);
				setState(1937);
				ptrabstractdeclarator();
				setState(1938);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1955);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1953);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1942);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1943);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractdeclarator);
						setState(1944);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1945);
						match(LeftBracket);
						setState(1947);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Characterliteral - 132)) | (1L << (Floatingliteral - 132)) | (1L << (Stringliteral - 132)) | (1L << (Userdefinedintegerliteral - 132)) | (1L << (Userdefinedfloatingliteral - 132)) | (1L << (Userdefinedstringliteral - 132)) | (1L << (Userdefinedcharacterliteral - 132)))) != 0)) {
							{
							setState(1946);
							constantexpression();
							}
						}

						setState(1949);
						match(RightBracket);
						setState(1951);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
						case 1:
							{
							setState(1950);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1957);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AbstractpackdeclaratorContext extends ParserRuleContext {
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public AbstractpackdeclaratorContext abstractpackdeclarator() {
			return getRuleContext(AbstractpackdeclaratorContext.class,0);
		}
		public AbstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractpackdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAbstractpackdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAbstractpackdeclarator(this);
		}
	}

	public final AbstractpackdeclaratorContext abstractpackdeclarator() throws RecognitionException {
		AbstractpackdeclaratorContext _localctx = new AbstractpackdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_abstractpackdeclarator);
		try {
			setState(1962);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Ellipsis:
				enterOuterAlt(_localctx, 1);
				{
				setState(1958);
				noptrabstractpackdeclarator(0);
				}
				break;
			case Decltype:
			case Star:
			case And:
			case AndAnd:
			case Doublecolon:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1959);
				ptroperator();
				setState(1960);
				abstractpackdeclarator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoptrabstractpackdeclaratorContext extends ParserRuleContext {
		public NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() {
			return getRuleContext(NoptrabstractpackdeclaratorContext.class,0);
		}
		public ParametersandqualifiersContext parametersandqualifiers() {
			return getRuleContext(ParametersandqualifiersContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public NoptrabstractpackdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noptrabstractpackdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoptrabstractpackdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoptrabstractpackdeclarator(this);
		}
	}

	public final NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator() throws RecognitionException {
		return noptrabstractpackdeclarator(0);
	}

	private NoptrabstractpackdeclaratorContext noptrabstractpackdeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		NoptrabstractpackdeclaratorContext _localctx = new NoptrabstractpackdeclaratorContext(_ctx, _parentState);
		NoptrabstractpackdeclaratorContext _prevctx = _localctx;
		int _startState = 274;
		enterRecursionRule(_localctx, 274, RULE_noptrabstractpackdeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1965);
			match(Ellipsis);
			}
			_ctx.stop = _input.LT(-1);
			setState(1980);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1978);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
					case 1:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1967);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1968);
						parametersandqualifiers();
						}
						break;
					case 2:
						{
						_localctx = new NoptrabstractpackdeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_noptrabstractpackdeclarator);
						setState(1969);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1970);
						match(LeftBracket);
						setState(1972);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Characterliteral - 132)) | (1L << (Floatingliteral - 132)) | (1L << (Stringliteral - 132)) | (1L << (Userdefinedintegerliteral - 132)) | (1L << (Userdefinedfloatingliteral - 132)) | (1L << (Userdefinedstringliteral - 132)) | (1L << (Userdefinedcharacterliteral - 132)))) != 0)) {
							{
							setState(1971);
							constantexpression();
							}
						}

						setState(1974);
						match(RightBracket);
						setState(1976);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
						case 1:
							{
							setState(1975);
							attributespecifierseq(0);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1982);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterdeclarationclauseContext extends ParserRuleContext {
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public ParameterdeclarationclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterParameterdeclarationclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitParameterdeclarationclause(this);
		}
	}

	public final ParameterdeclarationclauseContext parameterdeclarationclause() throws RecognitionException {
		ParameterdeclarationclauseContext _localctx = new ParameterdeclarationclauseContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_parameterdeclarationclause);
		int _la;
		try {
			setState(1993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1984);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Thread_local))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typedef - 67)) | (1L << (Typename - 67)) | (1L << (Union - 67)) | (1L << (Unsigned - 67)) | (1L << (Virtual - 67)) | (1L << (Void - 67)) | (1L << (Volatile - 67)) | (1L << (Wchar - 67)) | (1L << (LeftBracket - 67)) | (1L << (Doublecolon - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					setState(1983);
					parameterdeclarationlist(0);
					}
				}

				setState(1987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(1986);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1989);
				parameterdeclarationlist(0);
				setState(1990);
				match(Comma);
				setState(1991);
				match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterdeclarationlistContext extends ParserRuleContext {
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public ParameterdeclarationlistContext parameterdeclarationlist() {
			return getRuleContext(ParameterdeclarationlistContext.class,0);
		}
		public ParameterdeclarationlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclarationlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterParameterdeclarationlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitParameterdeclarationlist(this);
		}
	}

	public final ParameterdeclarationlistContext parameterdeclarationlist() throws RecognitionException {
		return parameterdeclarationlist(0);
	}

	private ParameterdeclarationlistContext parameterdeclarationlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterdeclarationlistContext _localctx = new ParameterdeclarationlistContext(_ctx, _parentState);
		ParameterdeclarationlistContext _prevctx = _localctx;
		int _startState = 278;
		enterRecursionRule(_localctx, 278, RULE_parameterdeclarationlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1996);
			parameterdeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(2003);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterdeclarationlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterdeclarationlist);
					setState(1998);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1999);
					match(Comma);
					setState(2000);
					parameterdeclaration();
					}
					} 
				}
				setState(2005);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterdeclarationContext extends ParserRuleContext {
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public ParameterdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterParameterdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitParameterdeclaration(this);
		}
	}

	public final ParameterdeclarationContext parameterdeclaration() throws RecognitionException {
		ParameterdeclarationContext _localctx = new ParameterdeclarationContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_parameterdeclaration);
		int _la;
		try {
			setState(2037);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2006);
					attributespecifierseq(0);
					}
				}

				setState(2009);
				declspecifierseq();
				setState(2010);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2012);
					attributespecifierseq(0);
					}
				}

				setState(2015);
				declspecifierseq();
				setState(2016);
				declarator();
				setState(2017);
				match(Assign);
				setState(2018);
				initializerclause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2020);
					attributespecifierseq(0);
					}
				}

				setState(2023);
				declspecifierseq();
				setState(2025);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(2024);
					abstractdeclarator();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2027);
					attributespecifierseq(0);
					}
				}

				setState(2030);
				declspecifierseq();
				setState(2032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (LeftParen - 78)) | (1L << (LeftBracket - 78)) | (1L << (Star - 78)) | (1L << (And - 78)) | (1L << (AndAnd - 78)) | (1L << (Doublecolon - 78)) | (1L << (Ellipsis - 78)) | (1L << (Identifier - 78)))) != 0)) {
					{
					setState(2031);
					abstractdeclarator();
					}
				}

				setState(2034);
				match(Assign);
				setState(2035);
				initializerclause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiondefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public FunctiondefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctiondefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctiondefinition(this);
		}
	}

	public final FunctiondefinitionContext functiondefinition() throws RecognitionException {
		FunctiondefinitionContext _localctx = new FunctiondefinitionContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_functiondefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Alignas || _la==LeftBracket) {
				{
				setState(2039);
				attributespecifierseq(0);
				}
			}

			setState(2043);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(2042);
				declspecifierseq();
				}
				break;
			}
			setState(2045);
			declarator();
			setState(2047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Final || _la==Override) {
				{
				setState(2046);
				virtspecifierseq(0);
				}
			}

			setState(2049);
			functionbody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionbodyContext extends ParserRuleContext {
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctiontryblockContext functiontryblock() {
			return getRuleContext(FunctiontryblockContext.class,0);
		}
		public TerminalNode Default() { return getToken(CPP14Parser.Default, 0); }
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctionbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctionbody(this);
		}
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_functionbody);
		int _la;
		try {
			setState(2062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2051);
					ctorinitializer();
					}
				}

				setState(2054);
				compoundstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2055);
				functiontryblock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2056);
				match(Assign);
				setState(2057);
				match(Default);
				setState(2058);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2059);
				match(Assign);
				setState(2060);
				match(Delete);
				setState(2061);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_initializer);
		try {
			setState(2069);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(2064);
				braceorequalinitializer();
				}
				break;
			case LeftParen:
				enterOuterAlt(_localctx, 2);
				{
				setState(2065);
				match(LeftParen);
				setState(2066);
				expressionlist();
				setState(2067);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BraceorequalinitializerContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public BraceorequalinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_braceorequalinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBraceorequalinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBraceorequalinitializer(this);
		}
	}

	public final BraceorequalinitializerContext braceorequalinitializer() throws RecognitionException {
		BraceorequalinitializerContext _localctx = new BraceorequalinitializerContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_braceorequalinitializer);
		try {
			setState(2074);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(2071);
				match(Assign);
				setState(2072);
				initializerclause();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(2073);
				bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerclauseContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public InitializerclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitializerclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitializerclause(this);
		}
	}

	public final InitializerclauseContext initializerclause() throws RecognitionException {
		InitializerclauseContext _localctx = new InitializerclauseContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_initializerclause);
		try {
			setState(2078);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Alignof:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Const_cast:
			case Decltype:
			case Delete:
			case Double:
			case Dynamic_cast:
			case False:
			case Float:
			case Int:
			case Long:
			case New:
			case Noexcept:
			case Nullptr:
			case Operator:
			case Reinterpret_cast:
			case Short:
			case Signed:
			case Sizeof:
			case Static_cast:
			case This:
			case Throw:
			case True:
			case Typeid:
			case Typename:
			case Unsigned:
			case Void:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Plus:
			case Minus:
			case Star:
			case And:
			case Or:
			case Tilde:
			case Not:
			case PlusPlus:
			case MinusMinus:
			case Doublecolon:
			case Identifier:
			case Integerliteral:
			case Characterliteral:
			case Floatingliteral:
			case Stringliteral:
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2076);
				assignmentexpression();
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(2077);
				bracedinitlist();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerlistContext extends ParserRuleContext {
		public InitializerclauseContext initializerclause() {
			return getRuleContext(InitializerclauseContext.class,0);
		}
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public InitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterInitializerlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitInitializerlist(this);
		}
	}

	public final InitializerlistContext initializerlist() throws RecognitionException {
		return initializerlist(0);
	}

	private InitializerlistContext initializerlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerlistContext _localctx = new InitializerlistContext(_ctx, _parentState);
		InitializerlistContext _prevctx = _localctx;
		int _startState = 292;
		enterRecursionRule(_localctx, 292, RULE_initializerlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2081);
			initializerclause();
			setState(2083);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				{
				setState(2082);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2093);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerlist);
					setState(2085);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2086);
					match(Comma);
					setState(2087);
					initializerclause();
					setState(2089);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
					case 1:
						{
						setState(2088);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2095);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,265,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BracedinitlistContext extends ParserRuleContext {
		public InitializerlistContext initializerlist() {
			return getRuleContext(InitializerlistContext.class,0);
		}
		public BracedinitlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracedinitlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBracedinitlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBracedinitlist(this);
		}
	}

	public final BracedinitlistContext bracedinitlist() throws RecognitionException {
		BracedinitlistContext _localctx = new BracedinitlistContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_bracedinitlist);
		int _la;
		try {
			setState(2105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2096);
				match(LeftBrace);
				setState(2097);
				initializerlist(0);
				setState(2099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(2098);
					match(Comma);
					}
				}

				setState(2101);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2103);
				match(LeftBrace);
				setState(2104);
				match(RightBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassnameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public ClassnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassname(this);
		}
	}

	public final ClassnameContext classname() throws RecognitionException {
		ClassnameContext _localctx = new ClassnameContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_classname);
		try {
			setState(2109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2107);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2108);
				simpletemplateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassspecifierContext extends ParserRuleContext {
		public ClassheadContext classhead() {
			return getRuleContext(ClassheadContext.class,0);
		}
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public ClassspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassspecifier(this);
		}
	}

	public final ClassspecifierContext classspecifier() throws RecognitionException {
		ClassspecifierContext _localctx = new ClassspecifierContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_classspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2111);
			classhead();
			setState(2112);
			match(LeftBrace);
			setState(2114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typedef - 67)) | (1L << (Typename - 67)) | (1L << (Union - 67)) | (1L << (Unsigned - 67)) | (1L << (Using - 67)) | (1L << (Virtual - 67)) | (1L << (Void - 67)) | (1L << (Volatile - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Tilde - 67)) | (1L << (AndAnd - 67)) | (1L << (Colon - 67)) | (1L << (Doublecolon - 67)) | (1L << (Semi - 67)) | (1L << (Ellipsis - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(2113);
				memberspecification();
				}
			}

			setState(2116);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassheadContext extends ParserRuleContext {
		public ClasskeyContext classkey() {
			return getRuleContext(ClasskeyContext.class,0);
		}
		public ClassheadnameContext classheadname() {
			return getRuleContext(ClassheadnameContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public ClassvirtspecifierContext classvirtspecifier() {
			return getRuleContext(ClassvirtspecifierContext.class,0);
		}
		public BaseclauseContext baseclause() {
			return getRuleContext(BaseclauseContext.class,0);
		}
		public ClassheadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classhead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClasshead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClasshead(this);
		}
	}

	public final ClassheadContext classhead() throws RecognitionException {
		ClassheadContext _localctx = new ClassheadContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_classhead);
		int _la;
		try {
			setState(2136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2118);
				classkey();
				setState(2120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2119);
					attributespecifierseq(0);
					}
				}

				setState(2122);
				classheadname();
				setState(2124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Final) {
					{
					setState(2123);
					classvirtspecifier();
					}
				}

				setState(2127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2126);
					baseclause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2129);
				classkey();
				setState(2131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2130);
					attributespecifierseq(0);
					}
				}

				setState(2134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(2133);
					baseclause();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassheadnameContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public ClassheadnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classheadname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassheadname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassheadname(this);
		}
	}

	public final ClassheadnameContext classheadname() throws RecognitionException {
		ClassheadnameContext _localctx = new ClassheadnameContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_classheadname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
			case 1:
				{
				setState(2138);
				nestednamespecifier(0);
				}
				break;
			}
			setState(2141);
			classname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassvirtspecifierContext extends ParserRuleContext {
		public TerminalNode Final() { return getToken(CPP14Parser.Final, 0); }
		public ClassvirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classvirtspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassvirtspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassvirtspecifier(this);
		}
	}

	public final ClassvirtspecifierContext classvirtspecifier() throws RecognitionException {
		ClassvirtspecifierContext _localctx = new ClassvirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_classvirtspecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2143);
			match(Final);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClasskeyContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public TerminalNode Struct() { return getToken(CPP14Parser.Struct, 0); }
		public TerminalNode Union() { return getToken(CPP14Parser.Union, 0); }
		public ClasskeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classkey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClasskey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClasskey(this);
		}
	}

	public final ClasskeyContext classkey() throws RecognitionException {
		ClasskeyContext _localctx = new ClasskeyContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_classkey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2145);
			_la = _input.LA(1);
			if ( !(((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (Class - 14)) | (1L << (Struct - 14)) | (1L << (Union - 14)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberspecificationContext extends ParserRuleContext {
		public MemberdeclarationContext memberdeclaration() {
			return getRuleContext(MemberdeclarationContext.class,0);
		}
		public MemberspecificationContext memberspecification() {
			return getRuleContext(MemberspecificationContext.class,0);
		}
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public MemberspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMemberspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMemberspecification(this);
		}
	}

	public final MemberspecificationContext memberspecification() throws RecognitionException {
		MemberspecificationContext _localctx = new MemberspecificationContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_memberspecification);
		int _la;
		try {
			setState(2156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Alignas:
			case Auto:
			case Bool:
			case Char:
			case Char16:
			case Char32:
			case Class:
			case Const:
			case Constexpr:
			case Decltype:
			case Double:
			case Enum:
			case Explicit:
			case Extern:
			case Float:
			case Friend:
			case Inline:
			case Int:
			case Long:
			case Mutable:
			case Operator:
			case Register:
			case Short:
			case Signed:
			case Static:
			case Static_assert:
			case Struct:
			case Template:
			case Thread_local:
			case Typedef:
			case Typename:
			case Union:
			case Unsigned:
			case Using:
			case Virtual:
			case Void:
			case Volatile:
			case Wchar:
			case LeftParen:
			case LeftBracket:
			case Star:
			case And:
			case Tilde:
			case AndAnd:
			case Colon:
			case Doublecolon:
			case Semi:
			case Ellipsis:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2147);
				memberdeclaration();
				setState(2149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typedef - 67)) | (1L << (Typename - 67)) | (1L << (Union - 67)) | (1L << (Unsigned - 67)) | (1L << (Using - 67)) | (1L << (Virtual - 67)) | (1L << (Void - 67)) | (1L << (Volatile - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Tilde - 67)) | (1L << (AndAnd - 67)) | (1L << (Colon - 67)) | (1L << (Doublecolon - 67)) | (1L << (Semi - 67)) | (1L << (Ellipsis - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					setState(2148);
					memberspecification();
					}
				}

				}
				break;
			case Private:
			case Protected:
			case Public:
				enterOuterAlt(_localctx, 2);
				{
				setState(2151);
				accessspecifier();
				setState(2152);
				match(Colon);
				setState(2154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Constexpr) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Explicit) | (1L << Extern) | (1L << Float) | (1L << Friend) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Mutable) | (1L << Operator) | (1L << Private) | (1L << Protected) | (1L << Public) | (1L << Register) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Static_assert) | (1L << Struct) | (1L << Template) | (1L << Thread_local))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (Typedef - 67)) | (1L << (Typename - 67)) | (1L << (Union - 67)) | (1L << (Unsigned - 67)) | (1L << (Using - 67)) | (1L << (Virtual - 67)) | (1L << (Void - 67)) | (1L << (Volatile - 67)) | (1L << (Wchar - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBracket - 67)) | (1L << (Star - 67)) | (1L << (And - 67)) | (1L << (Tilde - 67)) | (1L << (AndAnd - 67)) | (1L << (Colon - 67)) | (1L << (Doublecolon - 67)) | (1L << (Semi - 67)) | (1L << (Ellipsis - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					setState(2153);
					memberspecification();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberdeclarationContext extends ParserRuleContext {
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public DeclspecifierseqContext declspecifierseq() {
			return getRuleContext(DeclspecifierseqContext.class,0);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public FunctiondefinitionContext functiondefinition() {
			return getRuleContext(FunctiondefinitionContext.class,0);
		}
		public UsingdeclarationContext usingdeclaration() {
			return getRuleContext(UsingdeclarationContext.class,0);
		}
		public Static_assertdeclarationContext static_assertdeclaration() {
			return getRuleContext(Static_assertdeclarationContext.class,0);
		}
		public TemplatedeclarationContext templatedeclaration() {
			return getRuleContext(TemplatedeclarationContext.class,0);
		}
		public AliasdeclarationContext aliasdeclaration() {
			return getRuleContext(AliasdeclarationContext.class,0);
		}
		public EmptydeclarationContext emptydeclaration() {
			return getRuleContext(EmptydeclarationContext.class,0);
		}
		public MemberdeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMemberdeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMemberdeclaration(this);
		}
	}

	public final MemberdeclarationContext memberdeclaration() throws RecognitionException {
		MemberdeclarationContext _localctx = new MemberdeclarationContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_memberdeclaration);
		int _la;
		try {
			setState(2174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2159);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(2158);
					attributespecifierseq(0);
					}
					break;
				}
				setState(2162);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2161);
					declspecifierseq();
					}
					break;
				}
				setState(2165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignas) | (1L << Decltype) | (1L << Operator))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (LeftParen - 78)) | (1L << (LeftBracket - 78)) | (1L << (Star - 78)) | (1L << (And - 78)) | (1L << (Tilde - 78)) | (1L << (AndAnd - 78)) | (1L << (Colon - 78)) | (1L << (Doublecolon - 78)) | (1L << (Ellipsis - 78)) | (1L << (Identifier - 78)))) != 0)) {
					{
					setState(2164);
					memberdeclaratorlist(0);
					}
				}

				setState(2167);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2168);
				functiondefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2169);
				usingdeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2170);
				static_assertdeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2171);
				templatedeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2172);
				aliasdeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2173);
				emptydeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberdeclaratorlistContext extends ParserRuleContext {
		public MemberdeclaratorContext memberdeclarator() {
			return getRuleContext(MemberdeclaratorContext.class,0);
		}
		public MemberdeclaratorlistContext memberdeclaratorlist() {
			return getRuleContext(MemberdeclaratorlistContext.class,0);
		}
		public MemberdeclaratorlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclaratorlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMemberdeclaratorlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMemberdeclaratorlist(this);
		}
	}

	public final MemberdeclaratorlistContext memberdeclaratorlist() throws RecognitionException {
		return memberdeclaratorlist(0);
	}

	private MemberdeclaratorlistContext memberdeclaratorlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MemberdeclaratorlistContext _localctx = new MemberdeclaratorlistContext(_ctx, _parentState);
		MemberdeclaratorlistContext _prevctx = _localctx;
		int _startState = 312;
		enterRecursionRule(_localctx, 312, RULE_memberdeclaratorlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2177);
			memberdeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(2184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MemberdeclaratorlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_memberdeclaratorlist);
					setState(2179);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2180);
					match(Comma);
					setState(2181);
					memberdeclarator();
					}
					} 
				}
				setState(2186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MemberdeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public PurespecifierContext purespecifier() {
			return getRuleContext(PurespecifierContext.class,0);
		}
		public BraceorequalinitializerContext braceorequalinitializer() {
			return getRuleContext(BraceorequalinitializerContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public MemberdeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberdeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMemberdeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMemberdeclarator(this);
		}
	}

	public final MemberdeclaratorContext memberdeclarator() throws RecognitionException {
		MemberdeclaratorContext _localctx = new MemberdeclaratorContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_memberdeclarator);
		int _la;
		try {
			setState(2206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2187);
				declarator();
				setState(2189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2188);
					virtspecifierseq(0);
					}
					break;
				}
				setState(2192);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
				case 1:
					{
					setState(2191);
					purespecifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2194);
				declarator();
				setState(2196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2195);
					braceorequalinitializer();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2198);
					match(Identifier);
					}
				}

				setState(2202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2201);
					attributespecifierseq(0);
					}
				}

				setState(2204);
				match(Colon);
				setState(2205);
				constantexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VirtspecifierseqContext extends ParserRuleContext {
		public VirtspecifierContext virtspecifier() {
			return getRuleContext(VirtspecifierContext.class,0);
		}
		public VirtspecifierseqContext virtspecifierseq() {
			return getRuleContext(VirtspecifierseqContext.class,0);
		}
		public VirtspecifierseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifierseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterVirtspecifierseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitVirtspecifierseq(this);
		}
	}

	public final VirtspecifierseqContext virtspecifierseq() throws RecognitionException {
		return virtspecifierseq(0);
	}

	private VirtspecifierseqContext virtspecifierseq(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VirtspecifierseqContext _localctx = new VirtspecifierseqContext(_ctx, _parentState);
		VirtspecifierseqContext _prevctx = _localctx;
		int _startState = 316;
		enterRecursionRule(_localctx, 316, RULE_virtspecifierseq, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2209);
			virtspecifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(2215);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VirtspecifierseqContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_virtspecifierseq);
					setState(2211);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2212);
					virtspecifier();
					}
					} 
				}
				setState(2217);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,291,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VirtspecifierContext extends ParserRuleContext {
		public TerminalNode Override() { return getToken(CPP14Parser.Override, 0); }
		public TerminalNode Final() { return getToken(CPP14Parser.Final, 0); }
		public VirtspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_virtspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterVirtspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitVirtspecifier(this);
		}
	}

	public final VirtspecifierContext virtspecifier() throws RecognitionException {
		VirtspecifierContext _localctx = new VirtspecifierContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_virtspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2218);
			_la = _input.LA(1);
			if ( !(_la==Final || _la==Override) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PurespecifierContext extends ParserRuleContext {
		public Token val;
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public TerminalNode Octalliteral() { return getToken(CPP14Parser.Octalliteral, 0); }
		public PurespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_purespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPurespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPurespecifier(this);
		}
	}

	public final PurespecifierContext purespecifier() throws RecognitionException {
		PurespecifierContext _localctx = new PurespecifierContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_purespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2220);
			match(Assign);
			setState(2221);
			((PurespecifierContext)_localctx).val = match(Octalliteral);
			if((((PurespecifierContext)_localctx).val!=null?((PurespecifierContext)_localctx).val.getText():null).compareTo("0")!=0) throw new InputMismatchException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseclauseContext extends ParserRuleContext {
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public BaseclauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseclause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBaseclause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBaseclause(this);
		}
	}

	public final BaseclauseContext baseclause() throws RecognitionException {
		BaseclauseContext _localctx = new BaseclauseContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_baseclause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2224);
			match(Colon);
			setState(2225);
			basespecifierlist(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasespecifierlistContext extends ParserRuleContext {
		public BasespecifierContext basespecifier() {
			return getRuleContext(BasespecifierContext.class,0);
		}
		public BasespecifierlistContext basespecifierlist() {
			return getRuleContext(BasespecifierlistContext.class,0);
		}
		public BasespecifierlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifierlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBasespecifierlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBasespecifierlist(this);
		}
	}

	public final BasespecifierlistContext basespecifierlist() throws RecognitionException {
		return basespecifierlist(0);
	}

	private BasespecifierlistContext basespecifierlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BasespecifierlistContext _localctx = new BasespecifierlistContext(_ctx, _parentState);
		BasespecifierlistContext _prevctx = _localctx;
		int _startState = 324;
		enterRecursionRule(_localctx, 324, RULE_basespecifierlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2228);
			basespecifier();
			setState(2230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				{
				setState(2229);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BasespecifierlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_basespecifierlist);
					setState(2232);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2233);
					match(Comma);
					setState(2234);
					basespecifier();
					setState(2236);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
					case 1:
						{
						setState(2235);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,294,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BasespecifierContext extends ParserRuleContext {
		public BasetypespecifierContext basetypespecifier() {
			return getRuleContext(BasetypespecifierContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public TerminalNode Virtual() { return getToken(CPP14Parser.Virtual, 0); }
		public AccessspecifierContext accessspecifier() {
			return getRuleContext(AccessspecifierContext.class,0);
		}
		public BasespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBasespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBasespecifier(this);
		}
	}

	public final BasespecifierContext basespecifier() throws RecognitionException {
		BasespecifierContext _localctx = new BasespecifierContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_basespecifier);
		int _la;
		try {
			setState(2264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2243);
					attributespecifierseq(0);
					}
				}

				setState(2246);
				basetypespecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2247);
					attributespecifierseq(0);
					}
				}

				setState(2250);
				match(Virtual);
				setState(2252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) {
					{
					setState(2251);
					accessspecifier();
					}
				}

				setState(2254);
				basetypespecifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2255);
					attributespecifierseq(0);
					}
				}

				setState(2258);
				accessspecifier();
				setState(2260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Virtual) {
					{
					setState(2259);
					match(Virtual);
					}
				}

				setState(2262);
				basetypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassordecltypeContext extends ParserRuleContext {
		public ClassnameContext classname() {
			return getRuleContext(ClassnameContext.class,0);
		}
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public DecltypespecifierContext decltypespecifier() {
			return getRuleContext(DecltypespecifierContext.class,0);
		}
		public ClassordecltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classordecltype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterClassordecltype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitClassordecltype(this);
		}
	}

	public final ClassordecltypeContext classordecltype() throws RecognitionException {
		ClassordecltypeContext _localctx = new ClassordecltypeContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_classordecltype);
		try {
			setState(2271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,302,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
				case 1:
					{
					setState(2266);
					nestednamespecifier(0);
					}
					break;
				}
				setState(2269);
				classname();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2270);
				decltypespecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasetypespecifierContext extends ParserRuleContext {
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public BasetypespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basetypespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBasetypespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBasetypespecifier(this);
		}
	}

	public final BasetypespecifierContext basetypespecifier() throws RecognitionException {
		BasetypespecifierContext _localctx = new BasetypespecifierContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_basetypespecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2273);
			classordecltype();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessspecifierContext extends ParserRuleContext {
		public TerminalNode Private() { return getToken(CPP14Parser.Private, 0); }
		public TerminalNode Protected() { return getToken(CPP14Parser.Protected, 0); }
		public TerminalNode Public() { return getToken(CPP14Parser.Public, 0); }
		public AccessspecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessspecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterAccessspecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitAccessspecifier(this);
		}
	}

	public final AccessspecifierContext accessspecifier() throws RecognitionException {
		AccessspecifierContext _localctx = new AccessspecifierContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_accessspecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2275);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Private) | (1L << Protected) | (1L << Public))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversionfunctionidContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public ConversiontypeidContext conversiontypeid() {
			return getRuleContext(ConversiontypeidContext.class,0);
		}
		public ConversionfunctionidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversionfunctionid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConversionfunctionid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConversionfunctionid(this);
		}
	}

	public final ConversionfunctionidContext conversionfunctionid() throws RecognitionException {
		ConversionfunctionidContext _localctx = new ConversionfunctionidContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_conversionfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2277);
			match(Operator);
			setState(2278);
			conversiontypeid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversiontypeidContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public ConversiontypeidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiontypeid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConversiontypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConversiontypeid(this);
		}
	}

	public final ConversiontypeidContext conversiontypeid() throws RecognitionException {
		ConversiontypeidContext _localctx = new ConversiontypeidContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_conversiontypeid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2280);
			typespecifierseq();
			setState(2282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				{
				setState(2281);
				conversiondeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversiondeclaratorContext extends ParserRuleContext {
		public PtroperatorContext ptroperator() {
			return getRuleContext(PtroperatorContext.class,0);
		}
		public ConversiondeclaratorContext conversiondeclarator() {
			return getRuleContext(ConversiondeclaratorContext.class,0);
		}
		public ConversiondeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversiondeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterConversiondeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitConversiondeclarator(this);
		}
	}

	public final ConversiondeclaratorContext conversiondeclarator() throws RecognitionException {
		ConversiondeclaratorContext _localctx = new ConversiondeclaratorContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_conversiondeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2284);
			ptroperator();
			setState(2286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				{
				setState(2285);
				conversiondeclarator();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtorinitializerContext extends ParserRuleContext {
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public CtorinitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctorinitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterCtorinitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitCtorinitializer(this);
		}
	}

	public final CtorinitializerContext ctorinitializer() throws RecognitionException {
		CtorinitializerContext _localctx = new CtorinitializerContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_ctorinitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2288);
			match(Colon);
			setState(2289);
			meminitializerlist();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializerlistContext extends ParserRuleContext {
		public MeminitializerContext meminitializer() {
			return getRuleContext(MeminitializerContext.class,0);
		}
		public MeminitializerlistContext meminitializerlist() {
			return getRuleContext(MeminitializerlistContext.class,0);
		}
		public MeminitializerlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMeminitializerlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMeminitializerlist(this);
		}
	}

	public final MeminitializerlistContext meminitializerlist() throws RecognitionException {
		MeminitializerlistContext _localctx = new MeminitializerlistContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_meminitializerlist);
		int _la;
		try {
			setState(2302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2291);
				meminitializer();
				setState(2293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2292);
					match(Ellipsis);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2295);
				meminitializer();
				setState(2297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Ellipsis) {
					{
					setState(2296);
					match(Ellipsis);
					}
				}

				setState(2299);
				match(Comma);
				setState(2300);
				meminitializerlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializerContext extends ParserRuleContext {
		public MeminitializeridContext meminitializerid() {
			return getRuleContext(MeminitializeridContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public BracedinitlistContext bracedinitlist() {
			return getRuleContext(BracedinitlistContext.class,0);
		}
		public MeminitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMeminitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMeminitializer(this);
		}
	}

	public final MeminitializerContext meminitializer() throws RecognitionException {
		MeminitializerContext _localctx = new MeminitializerContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_meminitializer);
		int _la;
		try {
			setState(2314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2304);
				meminitializerid();
				setState(2305);
				match(LeftParen);
				setState(2307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << This))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Throw - 64)) | (1L << (True - 64)) | (1L << (Typeid - 64)) | (1L << (Typename - 64)) | (1L << (Unsigned - 64)) | (1L << (Void - 64)) | (1L << (Wchar - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (Plus - 64)) | (1L << (Minus - 64)) | (1L << (Star - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (Tilde - 64)) | (1L << (Not - 64)) | (1L << (PlusPlus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Doublecolon - 64)) | (1L << (Identifier - 64)) | (1L << (Integerliteral - 64)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Characterliteral - 132)) | (1L << (Floatingliteral - 132)) | (1L << (Stringliteral - 132)) | (1L << (Userdefinedintegerliteral - 132)) | (1L << (Userdefinedfloatingliteral - 132)) | (1L << (Userdefinedstringliteral - 132)) | (1L << (Userdefinedcharacterliteral - 132)))) != 0)) {
					{
					setState(2306);
					expressionlist();
					}
				}

				setState(2309);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2311);
				meminitializerid();
				setState(2312);
				bracedinitlist();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeminitializeridContext extends ParserRuleContext {
		public ClassordecltypeContext classordecltype() {
			return getRuleContext(ClassordecltypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public MeminitializeridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meminitializerid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterMeminitializerid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitMeminitializerid(this);
		}
	}

	public final MeminitializeridContext meminitializerid() throws RecognitionException {
		MeminitializeridContext _localctx = new MeminitializeridContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_meminitializerid);
		try {
			setState(2318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2316);
				classordecltype();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2317);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorfunctionidContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public OperatorfunctionidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorfunctionid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOperatorfunctionid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOperatorfunctionid(this);
		}
	}

	public final OperatorfunctionidContext operatorfunctionid() throws RecognitionException {
		OperatorfunctionidContext _localctx = new OperatorfunctionidContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_operatorfunctionid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2320);
			match(Operator);
			setState(2321);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteraloperatoridContext extends ParserRuleContext {
		public TerminalNode Operator() { return getToken(CPP14Parser.Operator, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TerminalNode Userdefinedstringliteral() { return getToken(CPP14Parser.Userdefinedstringliteral, 0); }
		public LiteraloperatoridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literaloperatorid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLiteraloperatorid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLiteraloperatorid(this);
		}
	}

	public final LiteraloperatoridContext literaloperatorid() throws RecognitionException {
		LiteraloperatoridContext _localctx = new LiteraloperatoridContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_literaloperatorid);
		try {
			setState(2328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2323);
				match(Operator);
				setState(2324);
				match(Stringliteral);
				setState(2325);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2326);
				match(Operator);
				setState(2327);
				match(Userdefinedstringliteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplatedeclarationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TemplatedeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatedeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplatedeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplatedeclaration(this);
		}
	}

	public final TemplatedeclarationContext templatedeclaration() throws RecognitionException {
		TemplatedeclarationContext _localctx = new TemplatedeclarationContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_templatedeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2330);
			match(Template);
			setState(2331);
			match(Less);
			setState(2332);
			templateparameterlist(0);
			setState(2333);
			match(Greater);
			setState(2334);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateparameterlistContext extends ParserRuleContext {
		public TemplateparameterContext templateparameter() {
			return getRuleContext(TemplateparameterContext.class,0);
		}
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public TemplateparameterlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameterlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateparameterlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateparameterlist(this);
		}
	}

	public final TemplateparameterlistContext templateparameterlist() throws RecognitionException {
		return templateparameterlist(0);
	}

	private TemplateparameterlistContext templateparameterlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateparameterlistContext _localctx = new TemplateparameterlistContext(_ctx, _parentState);
		TemplateparameterlistContext _prevctx = _localctx;
		int _startState = 354;
		enterRecursionRule(_localctx, 354, RULE_templateparameterlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2337);
			templateparameter();
			}
			_ctx.stop = _input.LT(-1);
			setState(2344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateparameterlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateparameterlist);
					setState(2339);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2340);
					match(Comma);
					setState(2341);
					templateparameter();
					}
					} 
				}
				setState(2346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TemplateparameterContext extends ParserRuleContext {
		public TypeparameterContext typeparameter() {
			return getRuleContext(TypeparameterContext.class,0);
		}
		public ParameterdeclarationContext parameterdeclaration() {
			return getRuleContext(ParameterdeclarationContext.class,0);
		}
		public TemplateparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateparameter(this);
		}
	}

	public final TemplateparameterContext templateparameter() throws RecognitionException {
		TemplateparameterContext _localctx = new TemplateparameterContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_templateparameter);
		try {
			setState(2349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2347);
				typeparameter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2348);
				parameterdeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeparameterContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(CPP14Parser.Class, 0); }
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TerminalNode Typename() { return getToken(CPP14Parser.Typename, 0); }
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TemplateparameterlistContext templateparameterlist() {
			return getRuleContext(TemplateparameterlistContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TypeparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypeparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypeparameter(this);
		}
	}

	public final TypeparameterContext typeparameter() throws RecognitionException {
		TypeparameterContext _localctx = new TypeparameterContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_typeparameter);
		int _la;
		try {
			setState(2399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2351);
				match(Class);
				setState(2353);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
				case 1:
					{
					setState(2352);
					match(Ellipsis);
					}
					break;
				}
				setState(2356);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
				case 1:
					{
					setState(2355);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2358);
				match(Class);
				setState(2360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2359);
					match(Identifier);
					}
				}

				setState(2362);
				match(Assign);
				setState(2363);
				typeid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2364);
				match(Typename);
				setState(2366);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
				case 1:
					{
					setState(2365);
					match(Ellipsis);
					}
					break;
				}
				setState(2369);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
				case 1:
					{
					setState(2368);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2371);
				match(Typename);
				setState(2373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2372);
					match(Identifier);
					}
				}

				setState(2375);
				match(Assign);
				setState(2376);
				typeid();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2377);
				match(Template);
				setState(2378);
				match(Less);
				setState(2379);
				templateparameterlist(0);
				setState(2380);
				match(Greater);
				setState(2381);
				match(Class);
				setState(2383);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
				case 1:
					{
					setState(2382);
					match(Ellipsis);
					}
					break;
				}
				setState(2386);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
				case 1:
					{
					setState(2385);
					match(Identifier);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2388);
				match(Template);
				setState(2389);
				match(Less);
				setState(2390);
				templateparameterlist(0);
				setState(2391);
				match(Greater);
				setState(2392);
				match(Class);
				setState(2394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(2393);
					match(Identifier);
					}
				}

				setState(2396);
				match(Assign);
				setState(2397);
				idexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpletemplateidContext extends ParserRuleContext {
		public TemplatenameContext templatename() {
			return getRuleContext(TemplatenameContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public SimpletemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletemplateid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterSimpletemplateid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitSimpletemplateid(this);
		}
	}

	public final SimpletemplateidContext simpletemplateid() throws RecognitionException {
		SimpletemplateidContext _localctx = new SimpletemplateidContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_simpletemplateid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2401);
			templatename();
			setState(2402);
			match(Less);
			setState(2404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Characterliteral - 132)) | (1L << (Floatingliteral - 132)) | (1L << (Stringliteral - 132)) | (1L << (Userdefinedintegerliteral - 132)) | (1L << (Userdefinedfloatingliteral - 132)) | (1L << (Userdefinedstringliteral - 132)) | (1L << (Userdefinedcharacterliteral - 132)))) != 0)) {
				{
				setState(2403);
				templateargumentlist(0);
				}
			}

			setState(2406);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateidContext extends ParserRuleContext {
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public OperatorfunctionidContext operatorfunctionid() {
			return getRuleContext(OperatorfunctionidContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public LiteraloperatoridContext literaloperatorid() {
			return getRuleContext(LiteraloperatoridContext.class,0);
		}
		public TemplateidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateid(this);
		}
	}

	public final TemplateidContext templateid() throws RecognitionException {
		TemplateidContext _localctx = new TemplateidContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_templateid);
		int _la;
		try {
			setState(2423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2408);
				simpletemplateid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2409);
				operatorfunctionid();
				setState(2410);
				match(Less);
				setState(2412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Characterliteral - 132)) | (1L << (Floatingliteral - 132)) | (1L << (Stringliteral - 132)) | (1L << (Userdefinedintegerliteral - 132)) | (1L << (Userdefinedfloatingliteral - 132)) | (1L << (Userdefinedstringliteral - 132)) | (1L << (Userdefinedcharacterliteral - 132)))) != 0)) {
					{
					setState(2411);
					templateargumentlist(0);
					}
				}

				setState(2414);
				match(Greater);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2416);
				literaloperatorid();
				setState(2417);
				match(Less);
				setState(2419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Alignof) | (1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Const_cast) | (1L << Decltype) | (1L << Delete) | (1L << Double) | (1L << Dynamic_cast) | (1L << Enum) | (1L << False) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Noexcept) | (1L << Nullptr) | (1L << Operator) | (1L << Reinterpret_cast) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static_cast) | (1L << Struct) | (1L << This))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (True - 65)) | (1L << (Typeid - 65)) | (1L << (Typename - 65)) | (1L << (Union - 65)) | (1L << (Unsigned - 65)) | (1L << (Void - 65)) | (1L << (Volatile - 65)) | (1L << (Wchar - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBracket - 65)) | (1L << (Plus - 65)) | (1L << (Minus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (Or - 65)) | (1L << (Tilde - 65)) | (1L << (Not - 65)) | (1L << (PlusPlus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Doublecolon - 65)) | (1L << (Identifier - 65)) | (1L << (Integerliteral - 65)))) != 0) || ((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (Characterliteral - 132)) | (1L << (Floatingliteral - 132)) | (1L << (Stringliteral - 132)) | (1L << (Userdefinedintegerliteral - 132)) | (1L << (Userdefinedfloatingliteral - 132)) | (1L << (Userdefinedstringliteral - 132)) | (1L << (Userdefinedcharacterliteral - 132)))) != 0)) {
					{
					setState(2418);
					templateargumentlist(0);
					}
				}

				setState(2421);
				match(Greater);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplatenameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public TemplatenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplatename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplatename(this);
		}
	}

	public final TemplatenameContext templatename() throws RecognitionException {
		TemplatenameContext _localctx = new TemplatenameContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_templatename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2425);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateargumentlistContext extends ParserRuleContext {
		public TemplateargumentContext templateargument() {
			return getRuleContext(TemplateargumentContext.class,0);
		}
		public TemplateargumentlistContext templateargumentlist() {
			return getRuleContext(TemplateargumentlistContext.class,0);
		}
		public TemplateargumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargumentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateargumentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateargumentlist(this);
		}
	}

	public final TemplateargumentlistContext templateargumentlist() throws RecognitionException {
		return templateargumentlist(0);
	}

	private TemplateargumentlistContext templateargumentlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TemplateargumentlistContext _localctx = new TemplateargumentlistContext(_ctx, _parentState);
		TemplateargumentlistContext _prevctx = _localctx;
		int _startState = 366;
		enterRecursionRule(_localctx, 366, RULE_templateargumentlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2428);
			templateargument();
			setState(2430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
			case 1:
				{
				setState(2429);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2440);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TemplateargumentlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_templateargumentlist);
					setState(2432);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2433);
					match(Comma);
					setState(2434);
					templateargument();
					setState(2436);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
					case 1:
						{
						setState(2435);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2442);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TemplateargumentContext extends ParserRuleContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public IdexpressionContext idexpression() {
			return getRuleContext(IdexpressionContext.class,0);
		}
		public TemplateargumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateargument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTemplateargument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTemplateargument(this);
		}
	}

	public final TemplateargumentContext templateargument() throws RecognitionException {
		TemplateargumentContext _localctx = new TemplateargumentContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_templateargument);
		try {
			setState(2446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2443);
				typeid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2444);
				constantexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2445);
				idexpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypenamespecifierContext extends ParserRuleContext {
		public TerminalNode Typename() { return getToken(CPP14Parser.Typename, 0); }
		public NestednamespecifierContext nestednamespecifier() {
			return getRuleContext(NestednamespecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CPP14Parser.Identifier, 0); }
		public SimpletemplateidContext simpletemplateid() {
			return getRuleContext(SimpletemplateidContext.class,0);
		}
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public TypenamespecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typenamespecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypenamespecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypenamespecifier(this);
		}
	}

	public final TypenamespecifierContext typenamespecifier() throws RecognitionException {
		TypenamespecifierContext _localctx = new TypenamespecifierContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_typenamespecifier);
		int _la;
		try {
			setState(2459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2448);
				match(Typename);
				setState(2449);
				nestednamespecifier(0);
				setState(2450);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2452);
				match(Typename);
				setState(2453);
				nestednamespecifier(0);
				setState(2455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Template) {
					{
					setState(2454);
					match(Template);
					}
				}

				setState(2457);
				simpletemplateid();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitinstantiationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Extern() { return getToken(CPP14Parser.Extern, 0); }
		public ExplicitinstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitinstantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExplicitinstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExplicitinstantiation(this);
		}
	}

	public final ExplicitinstantiationContext explicitinstantiation() throws RecognitionException {
		ExplicitinstantiationContext _localctx = new ExplicitinstantiationContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_explicitinstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Extern) {
				{
				setState(2461);
				match(Extern);
				}
			}

			setState(2464);
			match(Template);
			setState(2465);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitspecializationContext extends ParserRuleContext {
		public TerminalNode Template() { return getToken(CPP14Parser.Template, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public ExplicitspecializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitspecialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExplicitspecialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExplicitspecialization(this);
		}
	}

	public final ExplicitspecializationContext explicitspecialization() throws RecognitionException {
		ExplicitspecializationContext _localctx = new ExplicitspecializationContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_explicitspecialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2467);
			match(Template);
			setState(2468);
			match(Less);
			setState(2469);
			match(Greater);
			setState(2470);
			declaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryblockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(CPP14Parser.Try, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public TryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTryblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTryblock(this);
		}
	}

	public final TryblockContext tryblock() throws RecognitionException {
		TryblockContext _localctx = new TryblockContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_tryblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2472);
			match(Try);
			setState(2473);
			compoundstatement();
			setState(2474);
			handlerseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiontryblockContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(CPP14Parser.Try, 0); }
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public CtorinitializerContext ctorinitializer() {
			return getRuleContext(CtorinitializerContext.class,0);
		}
		public FunctiontryblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiontryblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterFunctiontryblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitFunctiontryblock(this);
		}
	}

	public final FunctiontryblockContext functiontryblock() throws RecognitionException {
		FunctiontryblockContext _localctx = new FunctiontryblockContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_functiontryblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2476);
			match(Try);
			setState(2478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(2477);
				ctorinitializer();
				}
			}

			setState(2480);
			compoundstatement();
			setState(2481);
			handlerseq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerseqContext extends ParserRuleContext {
		public HandlerContext handler() {
			return getRuleContext(HandlerContext.class,0);
		}
		public HandlerseqContext handlerseq() {
			return getRuleContext(HandlerseqContext.class,0);
		}
		public HandlerseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterHandlerseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitHandlerseq(this);
		}
	}

	public final HandlerseqContext handlerseq() throws RecognitionException {
		HandlerseqContext _localctx = new HandlerseqContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_handlerseq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2483);
			handler();
			setState(2485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,336,_ctx) ) {
			case 1:
				{
				setState(2484);
				handlerseq();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HandlerContext extends ParserRuleContext {
		public TerminalNode Catch() { return getToken(CPP14Parser.Catch, 0); }
		public ExceptiondeclarationContext exceptiondeclaration() {
			return getRuleContext(ExceptiondeclarationContext.class,0);
		}
		public CompoundstatementContext compoundstatement() {
			return getRuleContext(CompoundstatementContext.class,0);
		}
		public HandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitHandler(this);
		}
	}

	public final HandlerContext handler() throws RecognitionException {
		HandlerContext _localctx = new HandlerContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_handler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2487);
			match(Catch);
			setState(2488);
			match(LeftParen);
			setState(2489);
			exceptiondeclaration();
			setState(2490);
			match(RightParen);
			setState(2491);
			compoundstatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptiondeclarationContext extends ParserRuleContext {
		public TypespecifierseqContext typespecifierseq() {
			return getRuleContext(TypespecifierseqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AttributespecifierseqContext attributespecifierseq() {
			return getRuleContext(AttributespecifierseqContext.class,0);
		}
		public AbstractdeclaratorContext abstractdeclarator() {
			return getRuleContext(AbstractdeclaratorContext.class,0);
		}
		public ExceptiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptiondeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExceptiondeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExceptiondeclaration(this);
		}
	}

	public final ExceptiondeclarationContext exceptiondeclaration() throws RecognitionException {
		ExceptiondeclarationContext _localctx = new ExceptiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_exceptiondeclaration);
		int _la;
		try {
			setState(2507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,340,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2493);
					attributespecifierseq(0);
					}
				}

				setState(2496);
				typespecifierseq();
				setState(2497);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Alignas || _la==LeftBracket) {
					{
					setState(2499);
					attributespecifierseq(0);
					}
				}

				setState(2502);
				typespecifierseq();
				setState(2504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Decltype || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (LeftParen - 78)) | (1L << (LeftBracket - 78)) | (1L << (Star - 78)) | (1L << (And - 78)) | (1L << (AndAnd - 78)) | (1L << (Doublecolon - 78)) | (1L << (Ellipsis - 78)) | (1L << (Identifier - 78)))) != 0)) {
					{
					setState(2503);
					abstractdeclarator();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2506);
				match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowexpressionContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(CPP14Parser.Throw, 0); }
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public ThrowexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterThrowexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitThrowexpression(this);
		}
	}

	public final ThrowexpressionContext throwexpression() throws RecognitionException {
		ThrowexpressionContext _localctx = new ThrowexpressionContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_throwexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2509);
			match(Throw);
			setState(2511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,341,_ctx) ) {
			case 1:
				{
				setState(2510);
				assignmentexpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionspecificationContext extends ParserRuleContext {
		public DynamicexceptionspecificationContext dynamicexceptionspecification() {
			return getRuleContext(DynamicexceptionspecificationContext.class,0);
		}
		public NoexceptspecificationContext noexceptspecification() {
			return getRuleContext(NoexceptspecificationContext.class,0);
		}
		public ExceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterExceptionspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitExceptionspecification(this);
		}
	}

	public final ExceptionspecificationContext exceptionspecification() throws RecognitionException {
		ExceptionspecificationContext _localctx = new ExceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_exceptionspecification);
		try {
			setState(2515);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Throw:
				enterOuterAlt(_localctx, 1);
				{
				setState(2513);
				dynamicexceptionspecification();
				}
				break;
			case Noexcept:
				enterOuterAlt(_localctx, 2);
				{
				setState(2514);
				noexceptspecification();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DynamicexceptionspecificationContext extends ParserRuleContext {
		public TerminalNode Throw() { return getToken(CPP14Parser.Throw, 0); }
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public DynamicexceptionspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicexceptionspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterDynamicexceptionspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitDynamicexceptionspecification(this);
		}
	}

	public final DynamicexceptionspecificationContext dynamicexceptionspecification() throws RecognitionException {
		DynamicexceptionspecificationContext _localctx = new DynamicexceptionspecificationContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_dynamicexceptionspecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2517);
			match(Throw);
			setState(2518);
			match(LeftParen);
			setState(2520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Bool) | (1L << Char) | (1L << Char16) | (1L << Char32) | (1L << Class) | (1L << Const) | (1L << Decltype) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Typename - 69)) | (1L << (Union - 69)) | (1L << (Unsigned - 69)) | (1L << (Void - 69)) | (1L << (Volatile - 69)) | (1L << (Wchar - 69)) | (1L << (Doublecolon - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(2519);
				typeidlist(0);
				}
			}

			setState(2522);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeidlistContext extends ParserRuleContext {
		public TypeidContext typeid() {
			return getRuleContext(TypeidContext.class,0);
		}
		public TypeidlistContext typeidlist() {
			return getRuleContext(TypeidlistContext.class,0);
		}
		public TypeidlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeidlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterTypeidlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitTypeidlist(this);
		}
	}

	public final TypeidlistContext typeidlist() throws RecognitionException {
		return typeidlist(0);
	}

	private TypeidlistContext typeidlist(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeidlistContext _localctx = new TypeidlistContext(_ctx, _parentState);
		TypeidlistContext _prevctx = _localctx;
		int _startState = 392;
		enterRecursionRule(_localctx, 392, RULE_typeidlist, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2525);
			typeid();
			setState(2527);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,344,_ctx) ) {
			case 1:
				{
				setState(2526);
				match(Ellipsis);
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(2537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,346,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeidlistContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeidlist);
					setState(2529);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2530);
					match(Comma);
					setState(2531);
					typeid();
					setState(2533);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
					case 1:
						{
						setState(2532);
						match(Ellipsis);
						}
						break;
					}
					}
					} 
				}
				setState(2539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,346,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NoexceptspecificationContext extends ParserRuleContext {
		public TerminalNode Noexcept() { return getToken(CPP14Parser.Noexcept, 0); }
		public ConstantexpressionContext constantexpression() {
			return getRuleContext(ConstantexpressionContext.class,0);
		}
		public NoexceptspecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noexceptspecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterNoexceptspecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitNoexceptspecification(this);
		}
	}

	public final NoexceptspecificationContext noexceptspecification() throws RecognitionException {
		NoexceptspecificationContext _localctx = new NoexceptspecificationContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_noexceptspecification);
		try {
			setState(2546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,347,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2540);
				match(Noexcept);
				setState(2541);
				match(LeftParen);
				setState(2542);
				constantexpression();
				setState(2543);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2545);
				match(Noexcept);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightShiftContext extends ParserRuleContext {
		public List<TerminalNode> Greater() { return getTokens(CPP14Parser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(CPP14Parser.Greater, i);
		}
		public RightShiftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightShift; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterRightShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitRightShift(this);
		}
	}

	public final RightShiftContext rightShift() throws RecognitionException {
		RightShiftContext _localctx = new RightShiftContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_rightShift);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2548);
			match(Greater);
			setState(2549);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RightShiftAssignContext extends ParserRuleContext {
		public List<TerminalNode> Greater() { return getTokens(CPP14Parser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(CPP14Parser.Greater, i);
		}
		public TerminalNode Assign() { return getToken(CPP14Parser.Assign, 0); }
		public RightShiftAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightShiftAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterRightShiftAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitRightShiftAssign(this);
		}
	}

	public final RightShiftAssignContext rightShiftAssign() throws RecognitionException {
		RightShiftAssignContext _localctx = new RightShiftAssignContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_rightShiftAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2551);
			match(Greater);
			setState(2552);
			match(Greater);
			setState(2553);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(CPP14Parser.New, 0); }
		public TerminalNode Delete() { return getToken(CPP14Parser.Delete, 0); }
		public RightShiftContext rightShift() {
			return getRuleContext(RightShiftContext.class,0);
		}
		public RightShiftAssignContext rightShiftAssign() {
			return getRuleContext(RightShiftAssignContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_operator);
		try {
			setState(2603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,348,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2555);
				match(New);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2556);
				match(Delete);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2557);
				match(New);
				setState(2558);
				match(LeftBracket);
				setState(2559);
				match(RightBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2560);
				match(Delete);
				setState(2561);
				match(LeftBracket);
				setState(2562);
				match(RightBracket);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2563);
				match(Plus);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2564);
				match(Minus);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2565);
				match(Star);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2566);
				match(Div);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2567);
				match(Mod);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2568);
				match(Caret);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2569);
				match(And);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2570);
				match(Or);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2571);
				match(Tilde);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2572);
				match(Not);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2573);
				match(Assign);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2574);
				match(Less);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2575);
				match(Greater);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2576);
				match(PlusAssign);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2577);
				match(MinusAssign);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2578);
				match(StarAssign);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2579);
				match(DivAssign);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2580);
				match(ModAssign);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2581);
				match(XorAssign);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2582);
				match(AndAssign);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(2583);
				match(OrAssign);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(2584);
				match(LeftShift);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(2585);
				rightShift();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(2586);
				rightShiftAssign();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(2587);
				match(LeftShiftAssign);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(2588);
				match(Equal);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(2589);
				match(NotEqual);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(2590);
				match(LessEqual);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(2591);
				match(GreaterEqual);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(2592);
				match(AndAnd);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(2593);
				match(OrOr);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(2594);
				match(PlusPlus);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(2595);
				match(MinusMinus);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(2596);
				match(Comma);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(2597);
				match(ArrowStar);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(2598);
				match(Arrow);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(2599);
				match(LeftParen);
				setState(2600);
				match(RightParen);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(2601);
				match(LeftBracket);
				setState(2602);
				match(RightBracket);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode Integerliteral() { return getToken(CPP14Parser.Integerliteral, 0); }
		public TerminalNode Characterliteral() { return getToken(CPP14Parser.Characterliteral, 0); }
		public TerminalNode Floatingliteral() { return getToken(CPP14Parser.Floatingliteral, 0); }
		public TerminalNode Stringliteral() { return getToken(CPP14Parser.Stringliteral, 0); }
		public BooleanliteralContext booleanliteral() {
			return getRuleContext(BooleanliteralContext.class,0);
		}
		public PointerliteralContext pointerliteral() {
			return getRuleContext(PointerliteralContext.class,0);
		}
		public UserdefinedliteralContext userdefinedliteral() {
			return getRuleContext(UserdefinedliteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_literal);
		try {
			setState(2612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Integerliteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2605);
				match(Integerliteral);
				}
				break;
			case Characterliteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2606);
				match(Characterliteral);
				}
				break;
			case Floatingliteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2607);
				match(Floatingliteral);
				}
				break;
			case Stringliteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2608);
				match(Stringliteral);
				}
				break;
			case False:
			case True:
				enterOuterAlt(_localctx, 5);
				{
				setState(2609);
				booleanliteral();
				}
				break;
			case Nullptr:
				enterOuterAlt(_localctx, 6);
				{
				setState(2610);
				pointerliteral();
				}
				break;
			case Userdefinedintegerliteral:
			case Userdefinedfloatingliteral:
			case Userdefinedstringliteral:
			case Userdefinedcharacterliteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(2611);
				userdefinedliteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanliteralContext extends ParserRuleContext {
		public TerminalNode False() { return getToken(CPP14Parser.False, 0); }
		public TerminalNode True() { return getToken(CPP14Parser.True, 0); }
		public BooleanliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterBooleanliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitBooleanliteral(this);
		}
	}

	public final BooleanliteralContext booleanliteral() throws RecognitionException {
		BooleanliteralContext _localctx = new BooleanliteralContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_booleanliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2614);
			_la = _input.LA(1);
			if ( !(_la==False || _la==True) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerliteralContext extends ParserRuleContext {
		public TerminalNode Nullptr() { return getToken(CPP14Parser.Nullptr, 0); }
		public PointerliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterPointerliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitPointerliteral(this);
		}
	}

	public final PointerliteralContext pointerliteral() throws RecognitionException {
		PointerliteralContext _localctx = new PointerliteralContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_pointerliteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2616);
			match(Nullptr);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UserdefinedliteralContext extends ParserRuleContext {
		public TerminalNode Userdefinedintegerliteral() { return getToken(CPP14Parser.Userdefinedintegerliteral, 0); }
		public TerminalNode Userdefinedfloatingliteral() { return getToken(CPP14Parser.Userdefinedfloatingliteral, 0); }
		public TerminalNode Userdefinedstringliteral() { return getToken(CPP14Parser.Userdefinedstringliteral, 0); }
		public TerminalNode Userdefinedcharacterliteral() { return getToken(CPP14Parser.Userdefinedcharacterliteral, 0); }
		public UserdefinedliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userdefinedliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).enterUserdefinedliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CPP14Listener ) ((CPP14Listener)listener).exitUserdefinedliteral(this);
		}
	}

	public final UserdefinedliteralContext userdefinedliteral() throws RecognitionException {
		UserdefinedliteralContext _localctx = new UserdefinedliteralContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_userdefinedliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2618);
			_la = _input.LA(1);
			if ( !(((((_la - 135)) & ~0x3f) == 0 && ((1L << (_la - 135)) & ((1L << (Userdefinedintegerliteral - 135)) | (1L << (Userdefinedfloatingliteral - 135)) | (1L << (Userdefinedstringliteral - 135)) | (1L << (Userdefinedcharacterliteral - 135)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return nestednamespecifier_sempred((NestednamespecifierContext)_localctx, predIndex);
		case 10:
			return capturelist_sempred((CapturelistContext)_localctx, predIndex);
		case 15:
			return postfixexpression_sempred((PostfixexpressionContext)_localctx, predIndex);
		case 24:
			return noptrnewdeclarator_sempred((NoptrnewdeclaratorContext)_localctx, predIndex);
		case 29:
			return pmexpression_sempred((PmexpressionContext)_localctx, predIndex);
		case 30:
			return multiplicativeexpression_sempred((MultiplicativeexpressionContext)_localctx, predIndex);
		case 31:
			return additiveexpression_sempred((AdditiveexpressionContext)_localctx, predIndex);
		case 32:
			return shiftexpression_sempred((ShiftexpressionContext)_localctx, predIndex);
		case 33:
			return relationalexpression_sempred((RelationalexpressionContext)_localctx, predIndex);
		case 34:
			return equalityexpression_sempred((EqualityexpressionContext)_localctx, predIndex);
		case 35:
			return andexpression_sempred((AndexpressionContext)_localctx, predIndex);
		case 36:
			return exclusiveorexpression_sempred((ExclusiveorexpressionContext)_localctx, predIndex);
		case 37:
			return inclusiveorexpression_sempred((InclusiveorexpressionContext)_localctx, predIndex);
		case 38:
			return logicalandexpression_sempred((LogicalandexpressionContext)_localctx, predIndex);
		case 39:
			return logicalorexpression_sempred((LogicalorexpressionContext)_localctx, predIndex);
		case 43:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 50:
			return statementseq_sempred((StatementseqContext)_localctx, predIndex);
		case 64:
			return declarationseq_sempred((DeclarationseqContext)_localctx, predIndex);
		case 91:
			return enumeratorlist_sempred((EnumeratorlistContext)_localctx, predIndex);
		case 109:
			return attributespecifierseq_sempred((AttributespecifierseqContext)_localctx, predIndex);
		case 112:
			return attributelist_sempred((AttributelistContext)_localctx, predIndex);
		case 118:
			return balancedtokenseq_sempred((BalancedtokenseqContext)_localctx, predIndex);
		case 120:
			return initdeclaratorlist_sempred((InitdeclaratorlistContext)_localctx, predIndex);
		case 124:
			return noptrdeclarator_sempred((NoptrdeclaratorContext)_localctx, predIndex);
		case 135:
			return noptrabstractdeclarator_sempred((NoptrabstractdeclaratorContext)_localctx, predIndex);
		case 137:
			return noptrabstractpackdeclarator_sempred((NoptrabstractpackdeclaratorContext)_localctx, predIndex);
		case 139:
			return parameterdeclarationlist_sempred((ParameterdeclarationlistContext)_localctx, predIndex);
		case 146:
			return initializerlist_sempred((InitializerlistContext)_localctx, predIndex);
		case 156:
			return memberdeclaratorlist_sempred((MemberdeclaratorlistContext)_localctx, predIndex);
		case 158:
			return virtspecifierseq_sempred((VirtspecifierseqContext)_localctx, predIndex);
		case 162:
			return basespecifierlist_sempred((BasespecifierlistContext)_localctx, predIndex);
		case 177:
			return templateparameterlist_sempred((TemplateparameterlistContext)_localctx, predIndex);
		case 183:
			return templateargumentlist_sempred((TemplateargumentlistContext)_localctx, predIndex);
		case 196:
			return typeidlist_sempred((TypeidlistContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean nestednamespecifier_sempred(NestednamespecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean capturelist_sempred(CapturelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixexpression_sempred(PostfixexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 12);
		case 7:
			return precpred(_ctx, 11);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 8);
		case 11:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean noptrnewdeclarator_sempred(NoptrnewdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pmexpression_sempred(PmexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeexpression_sempred(MultiplicativeexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveexpression_sempred(AdditiveexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftexpression_sempred(ShiftexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 2);
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalexpression_sempred(RelationalexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 4);
		case 23:
			return precpred(_ctx, 3);
		case 24:
			return precpred(_ctx, 2);
		case 25:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityexpression_sempred(EqualityexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 26:
			return precpred(_ctx, 2);
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andexpression_sempred(AndexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveorexpression_sempred(ExclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveorexpression_sempred(InclusiveorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalandexpression_sempred(LogicalandexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalorexpression_sempred(LogicalorexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statementseq_sempred(StatementseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationseq_sempred(DeclarationseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorlist_sempred(EnumeratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributespecifierseq_sempred(AttributespecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean attributelist_sempred(AttributelistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 3);
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean balancedtokenseq_sempred(BalancedtokenseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initdeclaratorlist_sempred(InitdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean noptrdeclarator_sempred(NoptrdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return precpred(_ctx, 3);
		case 43:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean noptrabstractdeclarator_sempred(NoptrabstractdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44:
			return precpred(_ctx, 5);
		case 45:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean noptrabstractpackdeclarator_sempred(NoptrabstractpackdeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 3);
		case 47:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean parameterdeclarationlist_sempred(ParameterdeclarationlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerlist_sempred(InitializerlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean memberdeclaratorlist_sempred(MemberdeclaratorlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 50:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean virtspecifierseq_sempred(VirtspecifierseqContext _localctx, int predIndex) {
		switch (predIndex) {
		case 51:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean basespecifierlist_sempred(BasespecifierlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 52:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateparameterlist_sempred(TemplateparameterlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 53:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean templateargumentlist_sempred(TemplateargumentlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 54:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeidlist_sempred(TypeidlistContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0090\u0a3f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\3\2\5\2\u019e\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\u01aa\n\3\3\4\3\4\5\4\u01ae\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u01b9\n\5\3\6\3\6\5\6\u01bd\n\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u01cc\n\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u01d3\n\7\3\7\3\7\3\7\7\7\u01d8\n\7\f\7\16\7\u01db\13\7\3\b\3\b\5\b\u01df"+
		"\n\b\3\b\3\b\3\t\3\t\5\t\u01e5\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u01ef\n\n\3\13\3\13\3\f\3\f\3\f\5\f\u01f6\n\f\3\f\3\f\3\f\3\f\5\f\u01fc"+
		"\n\f\7\f\u01fe\n\f\f\f\16\f\u0201\13\f\3\r\3\r\5\r\u0205\n\r\3\16\3\16"+
		"\3\16\3\16\5\16\u020b\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u0212\n\17\3"+
		"\20\3\20\3\20\3\20\5\20\u0218\n\20\3\20\5\20\u021b\n\20\3\20\5\20\u021e"+
		"\n\20\3\20\5\20\u0221\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u0228\n\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u022f\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0263\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0272\n\21\3\21\3\21\3\21\3\21\5\21\u0278\n"+
		"\21\3\21\3\21\3\21\3\21\5\21\u027e\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u028b\n\21\f\21\16\21\u028e\13\21\3\22"+
		"\3\22\3\23\5\23\u0293\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u02a2\n\23\3\23\3\23\3\23\3\23\5\23\u02a8\n"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u02c6\n\24\3\25\3\25\3\26\5\26\u02cb\n\26\3\26\3\26\5\26\u02cf"+
		"\n\26\3\26\3\26\5\26\u02d3\n\26\3\26\5\26\u02d6\n\26\3\26\3\26\5\26\u02da"+
		"\n\26\3\26\3\26\3\26\3\26\5\26\u02e0\n\26\5\26\u02e2\n\26\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\5\30\u02ea\n\30\3\31\3\31\5\31\u02ee\n\31\3\31\5\31"+
		"\u02f1\n\31\3\32\3\32\3\32\3\32\3\32\5\32\u02f8\n\32\3\32\3\32\3\32\3"+
		"\32\3\32\5\32\u02ff\n\32\7\32\u0301\n\32\f\32\16\32\u0304\13\32\3\33\3"+
		"\33\5\33\u0308\n\33\3\33\3\33\5\33\u030c\n\33\3\34\5\34\u030f\n\34\3\34"+
		"\3\34\3\34\5\34\u0314\n\34\3\34\3\34\3\34\3\34\5\34\u031a\n\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0327\n\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0332\n\37\f\37\16\37\u0335"+
		"\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u0343\n \f \16 \u0346\13"+
		" \3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u0351\n!\f!\16!\u0354\13!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0360\n\"\f\"\16\"\u0363\13\"\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u0374\n#\f#\16#\u0377\13#\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\7$\u0382\n$\f$\16$\u0385\13$\3%\3%\3%\3%\3%\3"+
		"%\7%\u038d\n%\f%\16%\u0390\13%\3&\3&\3&\3&\3&\3&\7&\u0398\n&\f&\16&\u039b"+
		"\13&\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u03a3\n\'\f\'\16\'\u03a6\13\'\3(\3(\3"+
		"(\3(\3(\3(\7(\u03ae\n(\f(\16(\u03b1\13(\3)\3)\3)\3)\3)\3)\7)\u03b9\n)"+
		"\f)\16)\u03bc\13)\3*\3*\3*\3*\3*\3*\3*\5*\u03c5\n*\3+\3+\3+\3+\3+\3+\5"+
		"+\u03cd\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u03da\n,\3-\3-\3-\3-\3"+
		"-\3-\7-\u03e2\n-\f-\16-\u03e5\13-\3.\3.\3/\3/\5/\u03eb\n/\3/\3/\5/\u03ef"+
		"\n/\3/\3/\5/\u03f3\n/\3/\3/\5/\u03f7\n/\3/\3/\5/\u03fb\n/\3/\3/\3/\5/"+
		"\u0400\n/\3/\5/\u0403\n/\3\60\5\60\u0406\n\60\3\60\3\60\3\60\3\60\3\60"+
		"\5\60\u040d\n\60\3\60\3\60\3\60\5\60\u0412\n\60\3\61\5\61\u0415\n\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\62\5\62\u041d\n\62\3\62\3\62\3\63\3\63\5\63"+
		"\u0423\n\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\7\64\u042c\n\64\f\64\16"+
		"\64\u042f\13\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u0445\n\65\3\66\3\66"+
		"\5\66\u0449\n\66\3\66\3\66\5\66\u044d\n\66\3\66\3\66\5\66\u0451\n\66\3"+
		"\66\3\66\5\66\u0455\n\66\3\66\3\66\5\66\u0459\n\66\3\66\3\66\3\66\5\66"+
		"\u045e\n\66\3\66\5\66\u0461\n\66\3\67\3\67\5\67\u0465\n\67\3\67\3\67\5"+
		"\67\u0469\n\67\3\67\3\67\5\67\u046d\n\67\3\67\3\67\5\67\u0471\n\67\3\67"+
		"\3\67\5\67\u0475\n\67\3\67\3\67\3\67\5\67\u047a\n\67\3\67\5\67\u047d\n"+
		"\67\38\38\58\u0481\n8\38\38\58\u0485\n8\38\38\58\u0489\n8\38\38\58\u048d"+
		"\n8\38\38\58\u0491\n8\38\38\38\58\u0496\n8\38\58\u0499\n8\39\39\59\u049d"+
		"\n9\39\39\39\39\39\39\59\u04a5\n9\39\39\39\39\59\u04ab\n9\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u04bf\n:\3:\3:\5:\u04c3"+
		"\n:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u04d0\n:\3;\3;\5;\u04d4\n;\3;"+
		"\3;\5;\u04d8\n;\3;\3;\5;\u04dc\n;\3;\3;\5;\u04e0\n;\3;\3;\5;\u04e4\n;"+
		"\3;\3;\3;\5;\u04e9\n;\3;\5;\u04ec\n;\3<\3<\5<\u04f0\n<\3<\3<\5<\u04f4"+
		"\n<\3<\3<\5<\u04f8\n<\3<\3<\5<\u04fc\n<\3<\3<\5<\u0500\n<\3<\3<\3<\5<"+
		"\u0505\n<\3<\5<\u0508\n<\3=\3=\5=\u050c\n=\3>\5>\u050f\n>\3>\3>\3>\3?"+
		"\3?\5?\u0516\n?\3@\3@\3@\3@\3@\3@\5@\u051e\n@\3@\3@\3@\3@\3@\3@\3@\3@"+
		"\5@\u0528\n@\3A\3A\3B\3B\3B\3B\3B\7B\u0531\nB\fB\16B\u0534\13B\3C\3C\3"+
		"C\3C\3C\3C\3C\3C\3C\5C\u053f\nC\3D\3D\3D\3D\3D\3D\3D\3D\5D\u0549\nD\3"+
		"E\3E\3E\5E\u054e\nE\3E\3E\3E\3E\3F\5F\u0555\nF\3F\5F\u0558\nF\3F\3F\3"+
		"F\5F\u055d\nF\3F\3F\3F\5F\u0562\nF\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3I\3"+
		"I\3I\3J\3J\3J\3J\3J\3J\5J\u0577\nJ\3K\3K\5K\u057b\nK\3K\3K\3K\5K\u0580"+
		"\nK\3L\3L\3M\3M\3N\3N\3O\3O\3O\5O\u058b\nO\3P\3P\3P\3P\5P\u0591\nP\3Q"+
		"\3Q\5Q\u0595\nQ\3Q\3Q\3Q\5Q\u059a\nQ\3R\3R\5R\u059e\nR\3R\3R\3R\5R\u05a3"+
		"\nR\3S\5S\u05a6\nS\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S"+
		"\3S\3S\3S\5S\u05bc\nS\3T\3T\3T\3T\5T\u05c2\nT\3U\3U\3U\3U\3U\3U\3U\3U"+
		"\3U\5U\u05cd\nU\3V\3V\5V\u05d1\nV\3V\5V\u05d4\nV\3V\3V\3V\3V\3V\3V\3V"+
		"\3V\5V\u05de\nV\3V\3V\3V\3V\5V\u05e4\nV\3V\5V\u05e7\nV\3W\3W\3X\3X\3X"+
		"\5X\u05ee\nX\3X\3X\3X\3X\3X\3X\3X\3X\5X\u05f8\nX\3Y\3Y\5Y\u05fc\nY\3Y"+
		"\5Y\u05ff\nY\3Y\5Y\u0602\nY\3Y\3Y\5Y\u0606\nY\3Y\3Y\3Y\5Y\u060b\nY\5Y"+
		"\u060d\nY\3Z\3Z\5Z\u0611\nZ\3Z\3Z\5Z\u0615\nZ\3Z\3Z\3[\3[\3[\3[\3[\5["+
		"\u061e\n[\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\7]\u0629\n]\f]\16]\u062c\13]\3"+
		"^\3^\3^\3^\3^\5^\u0633\n^\3_\3_\3`\3`\5`\u0639\n`\3a\3a\3b\3b\5b\u063f"+
		"\nb\3c\3c\5c\u0643\nc\3d\5d\u0646\nd\3d\3d\3d\3d\3d\3d\3e\5e\u064f\ne"+
		"\3e\3e\3e\3e\3e\3e\3f\5f\u0658\nf\3f\3f\3f\3f\3f\3g\5g\u0660\ng\3h\3h"+
		"\3i\3i\3i\3i\3i\3i\3j\5j\u066b\nj\3j\3j\3k\3k\5k\u0671\nk\3k\3k\3k\3k"+
		"\3k\3k\3k\3k\3k\5k\u067c\nk\3l\5l\u067f\nl\3l\3l\3l\5l\u0684\nl\3l\3l"+
		"\3l\3m\3m\3m\3m\3m\3m\3n\3n\3n\3n\5n\u0693\nn\3n\3n\3n\3n\5n\u0699\nn"+
		"\3o\3o\3o\3o\3o\7o\u06a0\no\fo\16o\u06a3\13o\3p\3p\3p\3p\3p\3p\3p\5p\u06ac"+
		"\np\3q\3q\3q\3q\5q\u06b2\nq\3q\3q\3q\3q\3q\3q\5q\u06ba\nq\3q\3q\5q\u06be"+
		"\nq\3r\3r\5r\u06c2\nr\3r\3r\3r\5r\u06c7\nr\3r\3r\3r\5r\u06cc\nr\3r\3r"+
		"\3r\3r\3r\7r\u06d3\nr\fr\16r\u06d6\13r\3s\3s\5s\u06da\ns\3t\3t\5t\u06de"+
		"\nt\3u\3u\3u\3u\3v\3v\3w\3w\3w\3w\3x\3x\5x\u06ec\nx\3x\3x\7x\u06f0\nx"+
		"\fx\16x\u06f3\13x\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\3y\5y\u0701\ny\3z\3"+
		"z\3z\3z\3z\3z\7z\u0709\nz\fz\16z\u070c\13z\3{\3{\5{\u0710\n{\3|\3|\3|"+
		"\3|\3|\5|\u0717\n|\3}\3}\3}\3}\5}\u071d\n}\3~\3~\3~\5~\u0722\n~\3~\3~"+
		"\3~\3~\5~\u0728\n~\3~\3~\3~\3~\3~\5~\u072f\n~\3~\3~\5~\u0733\n~\7~\u0735"+
		"\n~\f~\16~\u0738\13~\3\177\3\177\3\177\3\177\5\177\u073e\n\177\3\177\5"+
		"\177\u0741\n\177\3\177\5\177\u0744\n\177\3\177\5\177\u0747\n\177\3\u0080"+
		"\3\u0080\3\u0080\5\u0080\u074c\n\u0080\3\u0081\3\u0081\5\u0081\u0750\n"+
		"\u0081\3\u0081\5\u0081\u0753\n\u0081\3\u0081\3\u0081\5\u0081\u0757\n\u0081"+
		"\3\u0081\3\u0081\5\u0081\u075b\n\u0081\3\u0081\3\u0081\3\u0081\5\u0081"+
		"\u0760\n\u0081\3\u0081\5\u0081\u0763\n\u0081\5\u0081\u0765\n\u0081\3\u0082"+
		"\3\u0082\5\u0082\u0769\n\u0082\3\u0083\3\u0083\3\u0084\3\u0084\3\u0085"+
		"\5\u0085\u0770\n\u0085\3\u0085\3\u0085\3\u0086\3\u0086\5\u0086\u0776\n"+
		"\u0086\3\u0087\3\u0087\5\u0087\u077a\n\u0087\3\u0087\3\u0087\3\u0087\3"+
		"\u0087\5\u0087\u0780\n\u0087\3\u0088\3\u0088\3\u0088\5\u0088\u0785\n\u0088"+
		"\5\u0088\u0787\n\u0088\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u078d\n"+
		"\u0089\3\u0089\3\u0089\5\u0089\u0791\n\u0089\3\u0089\3\u0089\3\u0089\3"+
		"\u0089\5\u0089\u0797\n\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5"+
		"\u0089\u079e\n\u0089\3\u0089\3\u0089\5\u0089\u07a2\n\u0089\7\u0089\u07a4"+
		"\n\u0089\f\u0089\16\u0089\u07a7\13\u0089\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\5\u008a\u07ad\n\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\5\u008b\u07b7\n\u008b\3\u008b\3\u008b\5\u008b\u07bb\n"+
		"\u008b\7\u008b\u07bd\n\u008b\f\u008b\16\u008b\u07c0\13\u008b\3\u008c\5"+
		"\u008c\u07c3\n\u008c\3\u008c\5\u008c\u07c6\n\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\5\u008c\u07cc\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\7\u008d\u07d4\n\u008d\f\u008d\16\u008d\u07d7\13\u008d\3\u008e"+
		"\5\u008e\u07da\n\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u07e0\n"+
		"\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u07e8\n"+
		"\u008e\3\u008e\3\u008e\5\u008e\u07ec\n\u008e\3\u008e\5\u008e\u07ef\n\u008e"+
		"\3\u008e\3\u008e\5\u008e\u07f3\n\u008e\3\u008e\3\u008e\3\u008e\5\u008e"+
		"\u07f8\n\u008e\3\u008f\5\u008f\u07fb\n\u008f\3\u008f\5\u008f\u07fe\n\u008f"+
		"\3\u008f\3\u008f\5\u008f\u0802\n\u008f\3\u008f\3\u008f\3\u0090\5\u0090"+
		"\u0807\n\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\5\u0090\u0811\n\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\5\u0091\u0818\n\u0091\3\u0092\3\u0092\3\u0092\5\u0092\u081d\n\u0092\3"+
		"\u0093\3\u0093\5\u0093\u0821\n\u0093\3\u0094\3\u0094\3\u0094\5\u0094\u0826"+
		"\n\u0094\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u082c\n\u0094\7\u0094"+
		"\u082e\n\u0094\f\u0094\16\u0094\u0831\13\u0094\3\u0095\3\u0095\3\u0095"+
		"\5\u0095\u0836\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u083c\n"+
		"\u0095\3\u0096\3\u0096\5\u0096\u0840\n\u0096\3\u0097\3\u0097\3\u0097\5"+
		"\u0097\u0845\n\u0097\3\u0097\3\u0097\3\u0098\3\u0098\5\u0098\u084b\n\u0098"+
		"\3\u0098\3\u0098\5\u0098\u084f\n\u0098\3\u0098\5\u0098\u0852\n\u0098\3"+
		"\u0098\3\u0098\5\u0098\u0856\n\u0098\3\u0098\5\u0098\u0859\n\u0098\5\u0098"+
		"\u085b\n\u0098\3\u0099\5\u0099\u085e\n\u0099\3\u0099\3\u0099\3\u009a\3"+
		"\u009a\3\u009b\3\u009b\3\u009c\3\u009c\5\u009c\u0868\n\u009c\3\u009c\3"+
		"\u009c\3\u009c\5\u009c\u086d\n\u009c\5\u009c\u086f\n\u009c\3\u009d\5\u009d"+
		"\u0872\n\u009d\3\u009d\5\u009d\u0875\n\u009d\3\u009d\5\u009d\u0878\n\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\5\u009d\u0881"+
		"\n\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\7\u009e\u0889"+
		"\n\u009e\f\u009e\16\u009e\u088c\13\u009e\3\u009f\3\u009f\5\u009f\u0890"+
		"\n\u009f\3\u009f\5\u009f\u0893\n\u009f\3\u009f\3\u009f\5\u009f\u0897\n"+
		"\u009f\3\u009f\5\u009f\u089a\n\u009f\3\u009f\5\u009f\u089d\n\u009f\3\u009f"+
		"\3\u009f\5\u009f\u08a1\n\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\7\u00a0\u08a8\n\u00a0\f\u00a0\16\u00a0\u08ab\13\u00a0\3\u00a1\3\u00a1"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\3\u00a4\3\u00a4"+
		"\3\u00a4\5\u00a4\u08b9\n\u00a4\3\u00a4\3\u00a4\3\u00a4\3\u00a4\5\u00a4"+
		"\u08bf\n\u00a4\7\u00a4\u08c1\n\u00a4\f\u00a4\16\u00a4\u08c4\13\u00a4\3"+
		"\u00a5\5\u00a5\u08c7\n\u00a5\3\u00a5\3\u00a5\5\u00a5\u08cb\n\u00a5\3\u00a5"+
		"\3\u00a5\5\u00a5\u08cf\n\u00a5\3\u00a5\3\u00a5\5\u00a5\u08d3\n\u00a5\3"+
		"\u00a5\3\u00a5\5\u00a5\u08d7\n\u00a5\3\u00a5\3\u00a5\5\u00a5\u08db\n\u00a5"+
		"\3\u00a6\5\u00a6\u08de\n\u00a6\3\u00a6\3\u00a6\5\u00a6\u08e2\n\u00a6\3"+
		"\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3\u00aa\3\u00aa"+
		"\5\u00aa\u08ed\n\u00aa\3\u00ab\3\u00ab\5\u00ab\u08f1\n\u00ab\3\u00ac\3"+
		"\u00ac\3\u00ac\3\u00ad\3\u00ad\5\u00ad\u08f8\n\u00ad\3\u00ad\3\u00ad\5"+
		"\u00ad\u08fc\n\u00ad\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u0901\n\u00ad\3\u00ae"+
		"\3\u00ae\3\u00ae\5\u00ae\u0906\n\u00ae\3\u00ae\3\u00ae\3\u00ae\3\u00ae"+
		"\3\u00ae\5\u00ae\u090d\n\u00ae\3\u00af\3\u00af\5\u00af\u0911\n\u00af\3"+
		"\u00b0\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1"+
		"\u091b\n\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b2\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\7\u00b3\u0929\n\u00b3\f\u00b3"+
		"\16\u00b3\u092c\13\u00b3\3\u00b4\3\u00b4\5\u00b4\u0930\n\u00b4\3\u00b5"+
		"\3\u00b5\5\u00b5\u0934\n\u00b5\3\u00b5\5\u00b5\u0937\n\u00b5\3\u00b5\3"+
		"\u00b5\5\u00b5\u093b\n\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0941"+
		"\n\u00b5\3\u00b5\5\u00b5\u0944\n\u00b5\3\u00b5\3\u00b5\5\u00b5\u0948\n"+
		"\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\5\u00b5\u0952\n\u00b5\3\u00b5\5\u00b5\u0955\n\u00b5\3\u00b5\3\u00b5\3"+
		"\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u095d\n\u00b5\3\u00b5\3\u00b5\3"+
		"\u00b5\5\u00b5\u0962\n\u00b5\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0967\n\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u096f\n\u00b7"+
		"\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\5\u00b7\u0976\n\u00b7\3\u00b7"+
		"\3\u00b7\5\u00b7\u097a\n\u00b7\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9"+
		"\5\u00b9\u0981\n\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u0987\n"+
		"\u00b9\7\u00b9\u0989\n\u00b9\f\u00b9\16\u00b9\u098c\13\u00b9\3\u00ba\3"+
		"\u00ba\3\u00ba\5\u00ba\u0991\n\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3"+
		"\u00bb\3\u00bb\3\u00bb\5\u00bb\u099a\n\u00bb\3\u00bb\3\u00bb\5\u00bb\u099e"+
		"\n\u00bb\3\u00bc\5\u00bc\u09a1\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00bf"+
		"\3\u00bf\5\u00bf\u09b1\n\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0"+
		"\5\u00c0\u09b8\n\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1"+
		"\3\u00c2\5\u00c2\u09c1\n\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2"+
		"\u09c7\n\u00c2\3\u00c2\3\u00c2\5\u00c2\u09cb\n\u00c2\3\u00c2\5\u00c2\u09ce"+
		"\n\u00c2\3\u00c3\3\u00c3\5\u00c3\u09d2\n\u00c3\3\u00c4\3\u00c4\5\u00c4"+
		"\u09d6\n\u00c4\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u09db\n\u00c5\3\u00c5\3"+
		"\u00c5\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u09e2\n\u00c6\3\u00c6\3\u00c6\3"+
		"\u00c6\3\u00c6\5\u00c6\u09e8\n\u00c6\7\u00c6\u09ea\n\u00c6\f\u00c6\16"+
		"\u00c6\u09ed\13\u00c6\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7\3\u00c7"+
		"\5\u00c7\u09f5\n\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00c9"+
		"\3\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0a2e\n\u00ca\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb\5\u00cb\u0a37\n\u00cb\3\u00cc"+
		"\3\u00cc\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00ce\2$\f\26 \62<>@BDFHJL"+
		"NPXf\u0082\u00b8\u00dc\u00e2\u00ee\u00f2\u00fa\u0110\u0114\u0118\u0126"+
		"\u013a\u013e\u0146\u0164\u0170\u018a\u00cf\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e"+
		"\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126"+
		"\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e"+
		"\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156"+
		"\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e"+
		"\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186"+
		"\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\2\r\4\2\\"+
		"\\``\4\2VX\\_\7\2\37\37**\64\64::AA\5\2\35\35\'\'KK\4\2\21\21MM\4\2\\"+
		"\\qq\5\2\20\20==HH\4\2!!\60\60\3\2\61\63\4\2  CC\3\2\u0089\u008c\u0b9b"+
		"\2\u019d\3\2\2\2\4\u01a9\3\2\2\2\6\u01ad\3\2\2\2\b\u01b8\3\2\2\2\n\u01ba"+
		"\3\2\2\2\f\u01cb\3\2\2\2\16\u01dc\3\2\2\2\20\u01e2\3\2\2\2\22\u01ee\3"+
		"\2\2\2\24\u01f0\3\2\2\2\26\u01f2\3\2\2\2\30\u0204\3\2\2\2\32\u020a\3\2"+
		"\2\2\34\u0211\3\2\2\2\36\u0213\3\2\2\2 \u0262\3\2\2\2\"\u028f\3\2\2\2"+
		"$\u02a7\3\2\2\2&\u02c5\3\2\2\2(\u02c7\3\2\2\2*\u02e1\3\2\2\2,\u02e3\3"+
		"\2\2\2.\u02e7\3\2\2\2\60\u02f0\3\2\2\2\62\u02f2\3\2\2\2\64\u030b\3\2\2"+
		"\2\66\u0319\3\2\2\28\u031b\3\2\2\2:\u0326\3\2\2\2<\u0328\3\2\2\2>\u0336"+
		"\3\2\2\2@\u0347\3\2\2\2B\u0355\3\2\2\2D\u0364\3\2\2\2F\u0378\3\2\2\2H"+
		"\u0386\3\2\2\2J\u0391\3\2\2\2L\u039c\3\2\2\2N\u03a7\3\2\2\2P\u03b2\3\2"+
		"\2\2R\u03c4\3\2\2\2T\u03cc\3\2\2\2V\u03d9\3\2\2\2X\u03db\3\2\2\2Z\u03e6"+
		"\3\2\2\2\\\u0402\3\2\2\2^\u0411\3\2\2\2`\u0414\3\2\2\2b\u041c\3\2\2\2"+
		"d\u0420\3\2\2\2f\u0426\3\2\2\2h\u0444\3\2\2\2j\u0460\3\2\2\2l\u047c\3"+
		"\2\2\2n\u0498\3\2\2\2p\u04aa\3\2\2\2r\u04cf\3\2\2\2t\u04eb\3\2\2\2v\u0507"+
		"\3\2\2\2x\u050b\3\2\2\2z\u050e\3\2\2\2|\u0515\3\2\2\2~\u0527\3\2\2\2\u0080"+
		"\u0529\3\2\2\2\u0082\u052b\3\2\2\2\u0084\u053e\3\2\2\2\u0086\u0548\3\2"+
		"\2\2\u0088\u054a\3\2\2\2\u008a\u0561\3\2\2\2\u008c\u0563\3\2\2\2\u008e"+
		"\u056b\3\2\2\2\u0090\u056d\3\2\2\2\u0092\u0576\3\2\2\2\u0094\u057f\3\2"+
		"\2\2\u0096\u0581\3\2\2\2\u0098\u0583\3\2\2\2\u009a\u0585\3\2\2\2\u009c"+
		"\u058a\3\2\2\2\u009e\u0590\3\2\2\2\u00a0\u0599\3\2\2\2\u00a2\u05a2\3\2"+
		"\2\2\u00a4\u05bb\3\2\2\2\u00a6\u05c1\3\2\2\2\u00a8\u05cc\3\2\2\2\u00aa"+
		"\u05e6\3\2\2\2\u00ac\u05e8\3\2\2\2\u00ae\u05f7\3\2\2\2\u00b0\u060c\3\2"+
		"\2\2\u00b2\u060e\3\2\2\2\u00b4\u061d\3\2\2\2\u00b6\u061f\3\2\2\2\u00b8"+
		"\u0622\3\2\2\2\u00ba\u0632\3\2\2\2\u00bc\u0634\3\2\2\2\u00be\u0638\3\2"+
		"\2\2\u00c0\u063a\3\2\2\2\u00c2\u063e\3\2\2\2\u00c4\u0642\3\2\2\2\u00c6"+
		"\u0645\3\2\2\2\u00c8\u064e\3\2\2\2\u00ca\u0657\3\2\2\2\u00cc\u065f\3\2"+
		"\2\2\u00ce\u0661\3\2\2\2\u00d0\u0663\3\2\2\2\u00d2\u066a\3\2\2\2\u00d4"+
		"\u067b\3\2\2\2\u00d6\u067e\3\2\2\2\u00d8\u0688\3\2\2\2\u00da\u0698\3\2"+
		"\2\2\u00dc\u069a\3\2\2\2\u00de\u06ab\3\2\2\2\u00e0\u06bd\3\2\2\2\u00e2"+
		"\u06c6\3\2\2\2\u00e4\u06d7\3\2\2\2\u00e6\u06dd\3\2\2\2\u00e8\u06df\3\2"+
		"\2\2\u00ea\u06e3\3\2\2\2\u00ec\u06e5\3\2\2\2\u00ee\u06e9\3\2\2\2\u00f0"+
		"\u0700\3\2\2\2\u00f2\u0702\3\2\2\2\u00f4\u070d\3\2\2\2\u00f6\u0716\3\2"+
		"\2\2\u00f8\u071c\3\2\2\2\u00fa\u0727\3\2\2\2\u00fc\u0739\3\2\2\2\u00fe"+
		"\u0748\3\2\2\2\u0100\u0764\3\2\2\2\u0102\u0766\3\2\2\2\u0104\u076a\3\2"+
		"\2\2\u0106\u076c\3\2\2\2\u0108\u076f\3\2\2\2\u010a\u0773\3\2\2\2\u010c"+
		"\u077f\3\2\2\2\u010e\u0786\3\2\2\2\u0110\u0796\3\2\2\2\u0112\u07ac\3\2"+
		"\2\2\u0114\u07ae\3\2\2\2\u0116\u07cb\3\2\2\2\u0118\u07cd\3\2\2\2\u011a"+
		"\u07f7\3\2\2\2\u011c\u07fa\3\2\2\2\u011e\u0810\3\2\2\2\u0120\u0817\3\2"+
		"\2\2\u0122\u081c\3\2\2\2\u0124\u0820\3\2\2\2\u0126\u0822\3\2\2\2\u0128"+
		"\u083b\3\2\2\2\u012a\u083f\3\2\2\2\u012c\u0841\3\2\2\2\u012e\u085a\3\2"+
		"\2\2\u0130\u085d\3\2\2\2\u0132\u0861\3\2\2\2\u0134\u0863\3\2\2\2\u0136"+
		"\u086e\3\2\2\2\u0138\u0880\3\2\2\2\u013a\u0882\3\2\2\2\u013c\u08a0\3\2"+
		"\2\2\u013e\u08a2\3\2\2\2\u0140\u08ac\3\2\2\2\u0142\u08ae\3\2\2\2\u0144"+
		"\u08b2\3\2\2\2\u0146\u08b5\3\2\2\2\u0148\u08da\3\2\2\2\u014a\u08e1\3\2"+
		"\2\2\u014c\u08e3\3\2\2\2\u014e\u08e5\3\2\2\2\u0150\u08e7\3\2\2\2\u0152"+
		"\u08ea\3\2\2\2\u0154\u08ee\3\2\2\2\u0156\u08f2\3\2\2\2\u0158\u0900\3\2"+
		"\2\2\u015a\u090c\3\2\2\2\u015c\u0910\3\2\2\2\u015e\u0912\3\2\2\2\u0160"+
		"\u091a\3\2\2\2\u0162\u091c\3\2\2\2\u0164\u0922\3\2\2\2\u0166\u092f\3\2"+
		"\2\2\u0168\u0961\3\2\2\2\u016a\u0963\3\2\2\2\u016c\u0979\3\2\2\2\u016e"+
		"\u097b\3\2\2\2\u0170\u097d\3\2\2\2\u0172\u0990\3\2\2\2\u0174\u099d\3\2"+
		"\2\2\u0176\u09a0\3\2\2\2\u0178\u09a5\3\2\2\2\u017a\u09aa\3\2\2\2\u017c"+
		"\u09ae\3\2\2\2\u017e\u09b5\3\2\2\2\u0180\u09b9\3\2\2\2\u0182\u09cd\3\2"+
		"\2\2\u0184\u09cf\3\2\2\2\u0186\u09d5\3\2\2\2\u0188\u09d7\3\2\2\2\u018a"+
		"\u09de\3\2\2\2\u018c\u09f4\3\2\2\2\u018e\u09f6\3\2\2\2\u0190\u09f9\3\2"+
		"\2\2\u0192\u0a2d\3\2\2\2\u0194\u0a36\3\2\2\2\u0196\u0a38\3\2\2\2\u0198"+
		"\u0a3a\3\2\2\2\u019a\u0a3c\3\2\2\2\u019c\u019e\5\u0082B\2\u019d\u019c"+
		"\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\7\2\2\3\u01a0"+
		"\3\3\2\2\2\u01a1\u01aa\5\u0194\u00cb\2\u01a2\u01aa\7@\2\2\u01a3\u01a4"+
		"\7P\2\2\u01a4\u01a5\5X-\2\u01a5\u01a6\7Q\2\2\u01a6\u01aa\3\2\2\2\u01a7"+
		"\u01aa\5\6\4\2\u01a8\u01aa\5\16\b\2\u01a9\u01a1\3\2\2\2\u01a9\u01a2\3"+
		"\2\2\2\u01a9\u01a3\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa"+
		"\5\3\2\2\2\u01ab\u01ae\5\b\5\2\u01ac\u01ae\5\n\6\2\u01ad\u01ab\3\2\2\2"+
		"\u01ad\u01ac\3\2\2\2\u01ae\7\3\2\2\2\u01af\u01b9\7\177\2\2\u01b0\u01b9"+
		"\5\u015e\u00b0\2\u01b1\u01b9\5\u0150\u00a9\2\u01b2\u01b9\5\u0160\u00b1"+
		"\2\u01b3\u01b4\7^\2\2\u01b4\u01b9\5\u012a\u0096\2\u01b5\u01b6\7^\2\2\u01b6"+
		"\u01b9\5\u00a8U\2\u01b7\u01b9\5\u016c\u00b7\2\u01b8\u01af\3\2\2\2\u01b8"+
		"\u01b0\3\2\2\2\u01b8\u01b1\3\2\2\2\u01b8\u01b2\3\2\2\2\u01b8\u01b3\3\2"+
		"\2\2\u01b8\u01b5\3\2\2\2\u01b8\u01b7\3\2\2\2\u01b9\t\3\2\2\2\u01ba\u01bc"+
		"\5\f\7\2\u01bb\u01bd\7?\2\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01bf\5\b\5\2\u01bf\13\3\2\2\2\u01c0\u01c1\b\7\1"+
		"\2\u01c1\u01cc\7z\2\2\u01c2\u01c3\5\u00a6T\2\u01c3\u01c4\7z\2\2\u01c4"+
		"\u01cc\3\2\2\2\u01c5\u01c6\5\u00be`\2\u01c6\u01c7\7z\2\2\u01c7\u01cc\3"+
		"\2\2\2\u01c8\u01c9\5\u00a8U\2\u01c9\u01ca\7z\2\2\u01ca\u01cc\3\2\2\2\u01cb"+
		"\u01c0\3\2\2\2\u01cb\u01c2\3\2\2\2\u01cb\u01c5\3\2\2\2\u01cb\u01c8\3\2"+
		"\2\2\u01cc\u01d9\3\2\2\2\u01cd\u01ce\f\4\2\2\u01ce\u01cf\7\177\2\2\u01cf"+
		"\u01d8\7z\2\2\u01d0\u01d2\f\3\2\2\u01d1\u01d3\7?\2\2\u01d2\u01d1\3\2\2"+
		"\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\5\u016a\u00b6\2"+
		"\u01d5\u01d6\7z\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01cd\3\2\2\2\u01d7\u01d0"+
		"\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\r\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01de\5\20\t\2\u01dd\u01df\5\36\20"+
		"\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1"+
		"\5d\63\2\u01e1\17\3\2\2\2\u01e2\u01e4\7R\2\2\u01e3\u01e5\5\22\n\2\u01e4"+
		"\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\7S"+
		"\2\2\u01e7\21\3\2\2\2\u01e8\u01ef\5\24\13\2\u01e9\u01ef\5\26\f\2\u01ea"+
		"\u01eb\5\24\13\2\u01eb\u01ec\7u\2\2\u01ec\u01ed\5\26\f\2\u01ed\u01ef\3"+
		"\2\2\2\u01ee\u01e8\3\2\2\2\u01ee\u01e9\3\2\2\2\u01ee\u01ea\3\2\2\2\u01ef"+
		"\23\3\2\2\2\u01f0\u01f1\t\2\2\2\u01f1\25\3\2\2\2\u01f2\u01f3\b\f\1\2\u01f3"+
		"\u01f5\5\30\r\2\u01f4\u01f6\7~\2\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2"+
		"\2\2\u01f6\u01ff\3\2\2\2\u01f7\u01f8\f\3\2\2\u01f8\u01f9\7u\2\2\u01f9"+
		"\u01fb\5\30\r\2\u01fa\u01fc\7~\2\2\u01fb\u01fa\3\2\2\2\u01fb\u01fc\3\2"+
		"\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01f7\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff"+
		"\u01fd\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\27\3\2\2\2\u0201\u01ff\3\2\2"+
		"\2\u0202\u0205\5\32\16\2\u0203\u0205\5\34\17\2\u0204\u0202\3\2\2\2\u0204"+
		"\u0203\3\2\2\2\u0205\31\3\2\2\2\u0206\u020b\7\177\2\2\u0207\u0208\7\\"+
		"\2\2\u0208\u020b\7\177\2\2\u0209\u020b\7@\2\2\u020a\u0206\3\2\2\2\u020a"+
		"\u0207\3\2\2\2\u020a\u0209\3\2\2\2\u020b\33\3\2\2\2\u020c\u020d\7\177"+
		"\2\2\u020d\u0212\5\u0120\u0091\2\u020e\u020f\7\\\2\2\u020f\u0210\7\177"+
		"\2\2\u0210\u0212\5\u0120\u0091\2\u0211\u020c\3\2\2\2\u0211\u020e\3\2\2"+
		"\2\u0212\35\3\2\2\2\u0213\u0214\7P\2\2\u0214\u0215\5\u0116\u008c\2\u0215"+
		"\u0217\7Q\2\2\u0216\u0218\7*\2\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2"+
		"\2\u0218\u021a\3\2\2\2\u0219\u021b\5\u0186\u00c4\2\u021a\u0219\3\2\2\2"+
		"\u021a\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u021e\5\u00dco\2\u021d"+
		"\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2\2\2\u021f\u0221\5\u00fe"+
		"\u0080\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221\37\3\2\2\2\u0222"+
		"\u0223\b\21\1\2\u0223\u0263\5\4\3\2\u0224\u0225\5\u00a4S\2\u0225\u0227"+
		"\7P\2\2\u0226\u0228\5\"\22\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u0229\3\2\2\2\u0229\u022a\7Q\2\2\u022a\u0263\3\2\2\2\u022b\u022c\5\u0174"+
		"\u00bb\2\u022c\u022e\7P\2\2\u022d\u022f\5\"\22\2\u022e\u022d\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\7Q\2\2\u0231\u0263\3\2"+
		"\2\2\u0232\u0233\5\u00a4S\2\u0233\u0234\5\u0128\u0095\2\u0234\u0263\3"+
		"\2\2\2\u0235\u0236\5\u0174\u00bb\2\u0236\u0237\5\u0128\u0095\2\u0237\u0263"+
		"\3\2\2\2\u0238\u0239\7\32\2\2\u0239\u023a\7a\2\2\u023a\u023b\5\u010a\u0086"+
		"\2\u023b\u023c\7b\2\2\u023c\u023d\7P\2\2\u023d\u023e\5X-\2\u023e\u023f"+
		"\7Q\2\2\u023f\u0263\3\2\2\2\u0240\u0241\7<\2\2\u0241\u0242\7a\2\2\u0242"+
		"\u0243\5\u010a\u0086\2\u0243\u0244\7b\2\2\u0244\u0245\7P\2\2\u0245\u0246"+
		"\5X-\2\u0246\u0247\7Q\2\2\u0247\u0263\3\2\2\2\u0248\u0249\7\65\2\2\u0249"+
		"\u024a\7a\2\2\u024a\u024b\5\u010a\u0086\2\u024b\u024c\7b\2\2\u024c\u024d"+
		"\7P\2\2\u024d\u024e\5X-\2\u024e\u024f\7Q\2\2\u024f\u0263\3\2\2\2\u0250"+
		"\u0251\7\23\2\2\u0251\u0252\7a\2\2\u0252\u0253\5\u010a\u0086\2\u0253\u0254"+
		"\7b\2\2\u0254\u0255\7P\2\2\u0255\u0256\5X-\2\u0256\u0257\7Q\2\2\u0257"+
		"\u0263\3\2\2\2\u0258\u0259\7F\2\2\u0259\u025a\7P\2\2\u025a\u025b\5X-\2"+
		"\u025b\u025c\7Q\2\2\u025c\u0263\3\2\2\2\u025d\u025e\7F\2\2\u025e\u025f"+
		"\7P\2\2\u025f\u0260\5\u010a\u0086\2\u0260\u0261\7Q\2\2\u0261\u0263\3\2"+
		"\2\2\u0262\u0222\3\2\2\2\u0262\u0224\3\2\2\2\u0262\u022b\3\2\2\2\u0262"+
		"\u0232\3\2\2\2\u0262\u0235\3\2\2\2\u0262\u0238\3\2\2\2\u0262\u0240\3\2"+
		"\2\2\u0262\u0248\3\2\2\2\u0262\u0250\3\2\2\2\u0262\u0258\3\2\2\2\u0262"+
		"\u025d\3\2\2\2\u0263\u028c\3\2\2\2\u0264\u0265\f\25\2\2\u0265\u0266\7"+
		"R\2\2\u0266\u0267\5X-\2\u0267\u0268\7S\2\2\u0268\u028b\3\2\2\2\u0269\u026a"+
		"\f\24\2\2\u026a\u026b\7R\2\2\u026b\u026c\5\u0128\u0095\2\u026c\u026d\7"+
		"S\2\2\u026d\u028b\3\2\2\2\u026e\u026f\f\23\2\2\u026f\u0271\7P\2\2\u0270"+
		"\u0272\5\"\22\2\u0271\u0270\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\3"+
		"\2\2\2\u0273\u028b\7Q\2\2\u0274\u0275\f\16\2\2\u0275\u0277\7|\2\2\u0276"+
		"\u0278\7?\2\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2"+
		"\2\2\u0279\u028b\5\6\4\2\u027a\u027b\f\r\2\2\u027b\u027d\7w\2\2\u027c"+
		"\u027e\7?\2\2\u027d\u027c\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\3\2"+
		"\2\2\u027f\u028b\5\6\4\2\u0280\u0281\f\f\2\2\u0281\u0282\7|\2\2\u0282"+
		"\u028b\5$\23\2\u0283\u0284\f\13\2\2\u0284\u0285\7w\2\2\u0285\u028b\5$"+
		"\23\2\u0286\u0287\f\n\2\2\u0287\u028b\7s\2\2\u0288\u0289\f\t\2\2\u0289"+
		"\u028b\7t\2\2\u028a\u0264\3\2\2\2\u028a\u0269\3\2\2\2\u028a\u026e\3\2"+
		"\2\2\u028a\u0274\3\2\2\2\u028a\u027a\3\2\2\2\u028a\u0280\3\2\2\2\u028a"+
		"\u0283\3\2\2\2\u028a\u0286\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028e\3\2"+
		"\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d!\3\2\2\2\u028e\u028c"+
		"\3\2\2\2\u028f\u0290\5\u0126\u0094\2\u0290#\3\2\2\2\u0291\u0293\5\f\7"+
		"\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295"+
		"\5\u00a6T\2\u0295\u0296\7z\2\2\u0296\u0297\7^\2\2\u0297\u0298\5\u00a6"+
		"T\2\u0298\u02a8\3\2\2\2\u0299\u029a\5\f\7\2\u029a\u029b\7?\2\2\u029b\u029c"+
		"\5\u016a\u00b6\2\u029c\u029d\7z\2\2\u029d\u029e\7^\2\2\u029e\u029f\5\u00a6"+
		"T\2\u029f\u02a8\3\2\2\2\u02a0\u02a2\5\f\7\2\u02a1\u02a0\3\2\2\2\u02a1"+
		"\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\7^\2\2\u02a4\u02a8\5\u00a6"+
		"T\2\u02a5\u02a6\7^\2\2\u02a6\u02a8\5\u00a8U\2\u02a7\u0292\3\2\2\2\u02a7"+
		"\u0299\3\2\2\2\u02a7\u02a1\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8%\3\2\2\2"+
		"\u02a9\u02c6\5 \21\2\u02aa\u02ab\7s\2\2\u02ab\u02c6\5:\36\2\u02ac\u02ad"+
		"\7t\2\2\u02ad\u02c6\5:\36\2\u02ae\u02af\5(\25\2\u02af\u02b0\5:\36\2\u02b0"+
		"\u02c6\3\2\2\2\u02b1\u02b2\79\2\2\u02b2\u02c6\5&\24\2\u02b3\u02b4\79\2"+
		"\2\u02b4\u02b5\7P\2\2\u02b5\u02b6\5\u010a\u0086\2\u02b6\u02b7\7Q\2\2\u02b7"+
		"\u02c6\3\2\2\2\u02b8\u02b9\79\2\2\u02b9\u02ba\7~\2\2\u02ba\u02bb\7P\2"+
		"\2\u02bb\u02bc\7\177\2\2\u02bc\u02c6\7Q\2\2\u02bd\u02be\7\6\2\2\u02be"+
		"\u02bf\7P\2\2\u02bf\u02c0\5\u010a\u0086\2\u02c0\u02c1\7Q\2\2\u02c1\u02c6"+
		"\3\2\2\2\u02c2\u02c6\58\35\2\u02c3\u02c6\5*\26\2\u02c4\u02c6\5\66\34\2"+
		"\u02c5\u02a9\3\2\2\2\u02c5\u02aa\3\2\2\2\u02c5\u02ac\3\2\2\2\u02c5\u02ae"+
		"\3\2\2\2\u02c5\u02b1\3\2\2\2\u02c5\u02b3\3\2\2\2\u02c5\u02b8\3\2\2\2\u02c5"+
		"\u02bd\3\2\2\2\u02c5\u02c2\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c4\3\2"+
		"\2\2\u02c6\'\3\2\2\2\u02c7\u02c8\t\3\2\2\u02c8)\3\2\2\2\u02c9\u02cb\7"+
		"z\2\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc"+
		"\u02ce\7,\2\2\u02cd\u02cf\5,\27\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2"+
		"\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\5.\30\2\u02d1\u02d3\5\64\33\2\u02d2"+
		"\u02d1\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02e2\3\2\2\2\u02d4\u02d6\7z"+
		"\2\2\u02d5\u02d4\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7"+
		"\u02d9\7,\2\2\u02d8\u02da\5,\27\2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2"+
		"\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\7P\2\2\u02dc\u02dd\5\u010a\u0086"+
		"\2\u02dd\u02df\7Q\2\2\u02de\u02e0\5\64\33\2\u02df\u02de\3\2\2\2\u02df"+
		"\u02e0\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02ca\3\2\2\2\u02e1\u02d5\3\2"+
		"\2\2\u02e2+\3\2\2\2\u02e3\u02e4\7P\2\2\u02e4\u02e5\5\"\22\2\u02e5\u02e6"+
		"\7Q\2\2\u02e6-\3\2\2\2\u02e7\u02e9\5\u00a0Q\2\u02e8\u02ea\5\60\31\2\u02e9"+
		"\u02e8\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea/\3\2\2\2\u02eb\u02ed\5\u0100"+
		"\u0081\2\u02ec\u02ee\5\60\31\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2"+
		"\u02ee\u02f1\3\2\2\2\u02ef\u02f1\5\62\32\2\u02f0\u02eb\3\2\2\2\u02f0\u02ef"+
		"\3\2\2\2\u02f1\61\3\2\2\2\u02f2\u02f3\b\32\1\2\u02f3\u02f4\7R\2\2\u02f4"+
		"\u02f5\5X-\2\u02f5\u02f7\7S\2\2\u02f6\u02f8\5\u00dco\2\u02f7\u02f6\3\2"+
		"\2\2\u02f7\u02f8\3\2\2\2\u02f8\u0302\3\2\2\2\u02f9\u02fa\f\3\2\2\u02fa"+
		"\u02fb\7R\2\2\u02fb\u02fc\5Z.\2\u02fc\u02fe\7S\2\2\u02fd\u02ff\5\u00dc"+
		"o\2\u02fe\u02fd\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0301\3\2\2\2\u0300"+
		"\u02f9\3\2\2\2\u0301\u0304\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2"+
		"\2\2\u0303\63\3\2\2\2\u0304\u0302\3\2\2\2\u0305\u0307\7P\2\2\u0306\u0308"+
		"\5\"\22\2\u0307\u0306\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u0309\3\2\2\2"+
		"\u0309\u030c\7Q\2\2\u030a\u030c\5\u0128\u0095\2\u030b\u0305\3\2\2\2\u030b"+
		"\u030a\3\2\2\2\u030c\65\3\2\2\2\u030d\u030f\7z\2\2\u030e\u030d\3\2\2\2"+
		"\u030e\u030f\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0311\7\27\2\2\u0311\u031a"+
		"\5:\36\2\u0312\u0314\7z\2\2\u0313\u0312\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"\u0315\3\2\2\2\u0315\u0316\7\27\2\2\u0316\u0317\7R\2\2\u0317\u0318\7S"+
		"\2\2\u0318\u031a\5:\36\2\u0319\u030e\3\2\2\2\u0319\u0313\3\2\2\2\u031a"+
		"\67\3\2\2\2\u031b\u031c\7-\2\2\u031c\u031d\7P\2\2\u031d\u031e\5X-\2\u031e"+
		"\u031f\7Q\2\2\u031f9\3\2\2\2\u0320\u0327\5&\24\2\u0321\u0322\7P\2\2\u0322"+
		"\u0323\5\u010a\u0086\2\u0323\u0324\7Q\2\2\u0324\u0325\5:\36\2\u0325\u0327"+
		"\3\2\2\2\u0326\u0320\3\2\2\2\u0326\u0321\3\2\2\2\u0327;\3\2\2\2\u0328"+
		"\u0329\b\37\1\2\u0329\u032a\5:\36\2\u032a\u0333\3\2\2\2\u032b\u032c\f"+
		"\4\2\2\u032c\u032d\7}\2\2\u032d\u0332\5:\36\2\u032e\u032f\f\3\2\2\u032f"+
		"\u0330\7v\2\2\u0330\u0332\5:\36\2\u0331\u032b\3\2\2\2\u0331\u032e\3\2"+
		"\2\2\u0332\u0335\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334"+
		"=\3\2\2\2\u0335\u0333\3\2\2\2\u0336\u0337\b \1\2\u0337\u0338\5<\37\2\u0338"+
		"\u0344\3\2\2\2\u0339\u033a\f\5\2\2\u033a\u033b\7X\2\2\u033b\u0343\5<\37"+
		"\2\u033c\u033d\f\4\2\2\u033d\u033e\7Y\2\2\u033e\u0343\5<\37\2\u033f\u0340"+
		"\f\3\2\2\u0340\u0341\7Z\2\2\u0341\u0343\5<\37\2\u0342\u0339\3\2\2\2\u0342"+
		"\u033c\3\2\2\2\u0342\u033f\3\2\2\2\u0343\u0346\3\2\2\2\u0344\u0342\3\2"+
		"\2\2\u0344\u0345\3\2\2\2\u0345?\3\2\2\2\u0346\u0344\3\2\2\2\u0347\u0348"+
		"\b!\1\2\u0348\u0349\5> \2\u0349\u0352\3\2\2\2\u034a\u034b\f\4\2\2\u034b"+
		"\u034c\7V\2\2\u034c\u0351\5> \2\u034d\u034e\f\3\2\2\u034e\u034f\7W\2\2"+
		"\u034f\u0351\5> \2\u0350\u034a\3\2\2\2\u0350\u034d\3\2\2\2\u0351\u0354"+
		"\3\2\2\2\u0352\u0350\3\2\2\2\u0352\u0353\3\2\2\2\u0353A\3\2\2\2\u0354"+
		"\u0352\3\2\2\2\u0355\u0356\b\"\1\2\u0356\u0357\5@!\2\u0357\u0361\3\2\2"+
		"\2\u0358\u0359\f\4\2\2\u0359\u035a\7k\2\2\u035a\u0360\5@!\2\u035b\u035c"+
		"\f\3\2\2\u035c\u035d\5\u018e\u00c8\2\u035d\u035e\5@!\2\u035e\u0360\3\2"+
		"\2\2\u035f\u0358\3\2\2\2\u035f\u035b\3\2\2\2\u0360\u0363\3\2\2\2\u0361"+
		"\u035f\3\2\2\2\u0361\u0362\3\2\2\2\u0362C\3\2\2\2\u0363\u0361\3\2\2\2"+
		"\u0364\u0365\b#\1\2\u0365\u0366\5B\"\2\u0366\u0375\3\2\2\2\u0367\u0368"+
		"\f\6\2\2\u0368\u0369\7a\2\2\u0369\u0374\5B\"\2\u036a\u036b\f\5\2\2\u036b"+
		"\u036c\7b\2\2\u036c\u0374\5B\"\2\u036d\u036e\f\4\2\2\u036e\u036f\7o\2"+
		"\2\u036f\u0374\5B\"\2\u0370\u0371\f\3\2\2\u0371\u0372\7p\2\2\u0372\u0374"+
		"\5B\"\2\u0373\u0367\3\2\2\2\u0373\u036a\3\2\2\2\u0373\u036d\3\2\2\2\u0373"+
		"\u0370\3\2\2\2\u0374\u0377\3\2\2\2\u0375\u0373\3\2\2\2\u0375\u0376\3\2"+
		"\2\2\u0376E\3\2\2\2\u0377\u0375\3\2\2\2\u0378\u0379\b$\1\2\u0379\u037a"+
		"\5D#\2\u037a\u0383\3\2\2\2\u037b\u037c\f\4\2\2\u037c\u037d\7m\2\2\u037d"+
		"\u0382\5D#\2\u037e\u037f\f\3\2\2\u037f\u0380\7n\2\2\u0380\u0382\5D#\2"+
		"\u0381\u037b\3\2\2\2\u0381\u037e\3\2\2\2\u0382\u0385\3\2\2\2\u0383\u0381"+
		"\3\2\2\2\u0383\u0384\3\2\2\2\u0384G\3\2\2\2\u0385\u0383\3\2\2\2\u0386"+
		"\u0387\b%\1\2\u0387\u0388\5F$\2\u0388\u038e\3\2\2\2\u0389\u038a\f\3\2"+
		"\2\u038a\u038b\7\\\2\2\u038b\u038d\5F$\2\u038c\u0389\3\2\2\2\u038d\u0390"+
		"\3\2\2\2\u038e\u038c\3\2\2\2\u038e\u038f\3\2\2\2\u038fI\3\2\2\2\u0390"+
		"\u038e\3\2\2\2\u0391\u0392\b&\1\2\u0392\u0393\5H%\2\u0393\u0399\3\2\2"+
		"\2\u0394\u0395\f\3\2\2\u0395\u0396\7[\2\2\u0396\u0398\5H%\2\u0397\u0394"+
		"\3\2\2\2\u0398\u039b\3\2\2\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a"+
		"K\3\2\2\2\u039b\u0399\3\2\2\2\u039c\u039d\b\'\1\2\u039d\u039e\5J&\2\u039e"+
		"\u03a4\3\2\2\2\u039f\u03a0\f\3\2\2\u03a0\u03a1\7]\2\2\u03a1\u03a3\5J&"+
		"\2\u03a2\u039f\3\2\2\2\u03a3\u03a6\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a4\u03a5"+
		"\3\2\2\2\u03a5M\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a7\u03a8\b(\1\2\u03a8\u03a9"+
		"\5L\'\2\u03a9\u03af\3\2\2\2\u03aa\u03ab\f\3\2\2\u03ab\u03ac\7q\2\2\u03ac"+
		"\u03ae\5L\'\2\u03ad\u03aa\3\2\2\2\u03ae\u03b1\3\2\2\2\u03af\u03ad\3\2"+
		"\2\2\u03af\u03b0\3\2\2\2\u03b0O\3\2\2\2\u03b1\u03af\3\2\2\2\u03b2\u03b3"+
		"\b)\1\2\u03b3\u03b4\5N(\2\u03b4\u03ba\3\2\2\2\u03b5\u03b6\f\3\2\2\u03b6"+
		"\u03b7\7r\2\2\u03b7\u03b9\5N(\2\u03b8\u03b5\3\2\2\2\u03b9\u03bc\3\2\2"+
		"\2\u03ba\u03b8\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bbQ\3\2\2\2\u03bc\u03ba"+
		"\3\2\2\2\u03bd\u03c5\5P)\2\u03be\u03bf\5P)\2\u03bf\u03c0\7x\2\2\u03c0"+
		"\u03c1\5X-\2\u03c1\u03c2\7y\2\2\u03c2\u03c3\5T+\2\u03c3\u03c5\3\2\2\2"+
		"\u03c4\u03bd\3\2\2\2\u03c4\u03be\3\2\2\2\u03c5S\3\2\2\2\u03c6\u03cd\5"+
		"R*\2\u03c7\u03c8\5P)\2\u03c8\u03c9\5V,\2\u03c9\u03ca\5\u0124\u0093\2\u03ca"+
		"\u03cd\3\2\2\2\u03cb\u03cd\5\u0184\u00c3\2\u03cc\u03c6\3\2\2\2\u03cc\u03c7"+
		"\3\2\2\2\u03cc\u03cb\3\2\2\2\u03cdU\3\2\2\2\u03ce\u03da\7`\2\2\u03cf\u03da"+
		"\7e\2\2\u03d0\u03da\7f\2\2\u03d1\u03da\7g\2\2\u03d2\u03da\7c\2\2\u03d3"+
		"\u03da\7d\2\2\u03d4\u03da\5\u0190\u00c9\2\u03d5\u03da\7l\2\2\u03d6\u03da"+
		"\7i\2\2\u03d7\u03da\7h\2\2\u03d8\u03da\7j\2\2\u03d9\u03ce\3\2\2\2\u03d9"+
		"\u03cf\3\2\2\2\u03d9\u03d0\3\2\2\2\u03d9\u03d1\3\2\2\2\u03d9\u03d2\3\2"+
		"\2\2\u03d9\u03d3\3\2\2\2\u03d9\u03d4\3\2\2\2\u03d9\u03d5\3\2\2\2\u03d9"+
		"\u03d6\3\2\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03d8\3\2\2\2\u03daW\3\2\2\2"+
		"\u03db\u03dc\b-\1\2\u03dc\u03dd\5T+\2\u03dd\u03e3\3\2\2\2\u03de\u03df"+
		"\f\3\2\2\u03df\u03e0\7u\2\2\u03e0\u03e2\5T+\2\u03e1\u03de\3\2\2\2\u03e2"+
		"\u03e5\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4Y\3\2\2\2"+
		"\u03e5\u03e3\3\2\2\2\u03e6\u03e7\5R*\2\u03e7[\3\2\2\2\u03e8\u0403\5^\60"+
		"\2\u03e9\u03eb\5\u00dco\2\u03ea\u03e9\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb"+
		"\u03ec\3\2\2\2\u03ec\u0403\5b\62\2\u03ed\u03ef\5\u00dco\2\u03ee\u03ed"+
		"\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u0403\5d\63\2\u03f1"+
		"\u03f3\5\u00dco\2\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4"+
		"\3\2\2\2\u03f4\u0403\5h\65\2\u03f5\u03f7\5\u00dco\2\u03f6\u03f5\3\2\2"+
		"\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u0403\5r:\2\u03f9\u03fb"+
		"\5\u00dco\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc\3\2\2"+
		"\2\u03fc\u0403\5~@\2\u03fd\u0403\5\u0080A\2\u03fe\u0400\5\u00dco\2\u03ff"+
		"\u03fe\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0403\5\u017a"+
		"\u00be\2\u0402\u03e8\3\2\2\2\u0402\u03ea\3\2\2\2\u0402\u03ee\3\2\2\2\u0402"+
		"\u03f2\3\2\2\2\u0402\u03f6\3\2\2\2\u0402\u03fa\3\2\2\2\u0402\u03fd\3\2"+
		"\2\2\u0402\u03ff\3\2\2\2\u0403]\3\2\2\2\u0404\u0406\5\u00dco\2\u0405\u0404"+
		"\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\7\177\2\2"+
		"\u0408\u0409\7y\2\2\u0409\u0412\5\\/\2\u040a\u0412\5`\61\2\u040b\u040d"+
		"\5\u00dco\2\u040c\u040b\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e\3\2\2"+
		"\2\u040e\u040f\7\26\2\2\u040f\u0410\7y\2\2\u0410\u0412\5\\/\2\u0411\u0405"+
		"\3\2\2\2\u0411\u040a\3\2\2\2\u0411\u040c\3\2\2\2\u0412_\3\2\2\2\u0413"+
		"\u0415\5\u00dco\2\u0414\u0413\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0416"+
		"\3\2\2\2\u0416\u0417\7\13\2\2\u0417\u0418\5Z.\2\u0418\u0419\7y\2\2\u0419"+
		"\u041a\5\\/\2\u041aa\3\2\2\2\u041b\u041d\5X-\2\u041c\u041b\3\2\2\2\u041c"+
		"\u041d\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041f\7{\2\2\u041fc\3\2\2\2\u0420"+
		"\u0422\7T\2\2\u0421\u0423\5f\64\2\u0422\u0421\3\2\2\2\u0422\u0423\3\2"+
		"\2\2\u0423\u0424\3\2\2\2\u0424\u0425\7U\2\2\u0425e\3\2\2\2\u0426\u0427"+
		"\b\64\1\2\u0427\u0428\5\\/\2\u0428\u042d\3\2\2\2\u0429\u042a\f\3\2\2\u042a"+
		"\u042c\5\\/\2\u042b\u0429\3\2\2\2\u042c\u042f\3\2\2\2\u042d\u042b\3\2"+
		"\2\2\u042d\u042e\3\2\2\2\u042eg\3\2\2\2\u042f\u042d\3\2\2\2\u0430\u0431"+
		"\7&\2\2\u0431\u0432\7P\2\2\u0432\u0433\5p9\2\u0433\u0434\7Q\2\2\u0434"+
		"\u0435\5l\67\2\u0435\u0445\3\2\2\2\u0436\u0437\7&\2\2\u0437\u0438\7P\2"+
		"\2\u0438\u0439\5p9\2\u0439\u043a\7Q\2\2\u043a\u043b\5l\67\2\u043b\u043c"+
		"\7\33\2\2\u043c\u043d\5n8\2\u043d\u0445\3\2\2\2\u043e\u043f\7>\2\2\u043f"+
		"\u0440\7P\2\2\u0440\u0441\5p9\2\u0441\u0442\7Q\2\2\u0442\u0443\5j\66\2"+
		"\u0443\u0445\3\2\2\2\u0444\u0430\3\2\2\2\u0444\u0436\3\2\2\2\u0444\u043e"+
		"\3\2\2\2\u0445i\3\2\2\2\u0446\u0461\5^\60\2\u0447\u0449\5\u00dco\2\u0448"+
		"\u0447\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u0461\5b"+
		"\62\2\u044b\u044d\5\u00dco\2\u044c\u044b\3\2\2\2\u044c\u044d\3\2\2\2\u044d"+
		"\u044e\3\2\2\2\u044e\u0461\5d\63\2\u044f\u0451\5\u00dco\2\u0450\u044f"+
		"\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0461\5h\65\2\u0453"+
		"\u0455\5\u00dco\2\u0454\u0453\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0456"+
		"\3\2\2\2\u0456\u0461\5r:\2\u0457\u0459\5\u00dco\2\u0458\u0457\3\2\2\2"+
		"\u0458\u0459\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u0461\5~@\2\u045b\u0461"+
		"\5\u0080A\2\u045c\u045e\5\u00dco\2\u045d\u045c\3\2\2\2\u045d\u045e\3\2"+
		"\2\2\u045e\u045f\3\2\2\2\u045f\u0461\5\u017a\u00be\2\u0460\u0446\3\2\2"+
		"\2\u0460\u0448\3\2\2\2\u0460\u044c\3\2\2\2\u0460\u0450\3\2\2\2\u0460\u0454"+
		"\3\2\2\2\u0460\u0458\3\2\2\2\u0460\u045b\3\2\2\2\u0460\u045d\3\2\2\2\u0461"+
		"k\3\2\2\2\u0462\u047d\5^\60\2\u0463\u0465\5\u00dco\2\u0464\u0463\3\2\2"+
		"\2\u0464\u0465\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u047d\5b\62\2\u0467\u0469"+
		"\5\u00dco\2\u0468\u0467\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046a\3\2\2"+
		"\2\u046a\u047d\5d\63\2\u046b\u046d\5\u00dco\2\u046c\u046b\3\2\2\2\u046c"+
		"\u046d\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u047d\5h\65\2\u046f\u0471\5\u00dc"+
		"o\2\u0470\u046f\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0472\3\2\2\2\u0472"+
		"\u047d\5r:\2\u0473\u0475\5\u00dco\2\u0474\u0473\3\2\2\2\u0474\u0475\3"+
		"\2\2\2\u0475\u0476\3\2\2\2\u0476\u047d\5~@\2\u0477\u047d\5\u0080A\2\u0478"+
		"\u047a\5\u00dco\2\u0479\u0478\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047b"+
		"\3\2\2\2\u047b\u047d\5\u017a\u00be\2\u047c\u0462\3\2\2\2\u047c\u0464\3"+
		"\2\2\2\u047c\u0468\3\2\2\2\u047c\u046c\3\2\2\2\u047c\u0470\3\2\2\2\u047c"+
		"\u0474\3\2\2\2\u047c\u0477\3\2\2\2\u047c\u0479\3\2\2\2\u047dm\3\2\2\2"+
		"\u047e\u0499\5^\60\2\u047f\u0481\5\u00dco\2\u0480\u047f\3\2\2\2\u0480"+
		"\u0481\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0499\5b\62\2\u0483\u0485\5\u00dc"+
		"o\2\u0484\u0483\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0486\3\2\2\2\u0486"+
		"\u0499\5d\63\2\u0487\u0489\5\u00dco\2\u0488\u0487\3\2\2\2\u0488\u0489"+
		"\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u0499\5h\65\2\u048b\u048d\5\u00dco"+
		"\2\u048c\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u0499"+
		"\5r:\2\u048f\u0491\5\u00dco\2\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2\2"+
		"\u0491\u0492\3\2\2\2\u0492\u0499\5~@\2\u0493\u0499\5\u0080A\2\u0494\u0496"+
		"\5\u00dco\2\u0495\u0494\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u0497\3\2\2"+
		"\2\u0497\u0499\5\u017a\u00be\2\u0498\u047e\3\2\2\2\u0498\u0480\3\2\2\2"+
		"\u0498\u0484\3\2\2\2\u0498\u0488\3\2\2\2\u0498\u048c\3\2\2\2\u0498\u0490"+
		"\3\2\2\2\u0498\u0493\3\2\2\2\u0498\u0495\3\2\2\2\u0499o\3\2\2\2\u049a"+
		"\u04ab\5X-\2\u049b\u049d\5\u00dco\2\u049c\u049b\3\2\2\2\u049c\u049d\3"+
		"\2\2\2\u049d\u049e\3\2\2\2\u049e\u049f\5\u0094K\2\u049f\u04a0\5\u00f6"+
		"|\2\u04a0\u04a1\7`\2\2\u04a1\u04a2\5\u0124\u0093\2\u04a2\u04ab\3\2\2\2"+
		"\u04a3\u04a5\5\u00dco\2\u04a4\u04a3\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5"+
		"\u04a6\3\2\2\2\u04a6\u04a7\5\u0094K\2\u04a7\u04a8\5\u00f6|\2\u04a8\u04a9"+
		"\5\u0128\u0095\2\u04a9\u04ab\3\2\2\2\u04aa\u049a\3\2\2\2\u04aa\u049c\3"+
		"\2\2\2\u04aa\u04a4\3\2\2\2\u04abq\3\2\2\2\u04ac\u04ad\7O\2\2\u04ad\u04ae"+
		"\7P\2\2\u04ae\u04af\5p9\2\u04af\u04b0\7Q\2\2\u04b0\u04b1\5t;\2\u04b1\u04d0"+
		"\3\2\2\2\u04b2\u04b3\7\30\2\2\u04b3\u04b4\5t;\2\u04b4\u04b5\7O\2\2\u04b5"+
		"\u04b6\7P\2\2\u04b6\u04b7\5X-\2\u04b7\u04b8\7Q\2\2\u04b8\u04b9\7{\2\2"+
		"\u04b9\u04d0\3\2\2\2\u04ba\u04bb\7#\2\2\u04bb\u04bc\7P\2\2\u04bc\u04be"+
		"\5x=\2\u04bd\u04bf\5p9\2\u04be\u04bd\3\2\2\2\u04be\u04bf\3\2\2\2\u04bf"+
		"\u04c0\3\2\2\2\u04c0\u04c2\7{\2\2\u04c1\u04c3\5X-\2\u04c2\u04c1\3\2\2"+
		"\2\u04c2\u04c3\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c5\7Q\2\2\u04c5\u04c6"+
		"\5v<\2\u04c6\u04d0\3\2\2\2\u04c7\u04c8\7#\2\2\u04c8\u04c9\7P\2\2\u04c9"+
		"\u04ca\5z>\2\u04ca\u04cb\7y\2\2\u04cb\u04cc\5|?\2\u04cc\u04cd\7Q\2\2\u04cd"+
		"\u04ce\5v<\2\u04ce\u04d0\3\2\2\2\u04cf\u04ac\3\2\2\2\u04cf\u04b2\3\2\2"+
		"\2\u04cf\u04ba\3\2\2\2\u04cf\u04c7\3\2\2\2\u04d0s\3\2\2\2\u04d1\u04ec"+
		"\5^\60\2\u04d2\u04d4\5\u00dco\2\u04d3\u04d2\3\2\2\2\u04d3\u04d4\3\2\2"+
		"\2\u04d4\u04d5\3\2\2\2\u04d5\u04ec\5b\62\2\u04d6\u04d8\5\u00dco\2\u04d7"+
		"\u04d6\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04ec\5d"+
		"\63\2\u04da\u04dc\5\u00dco\2\u04db\u04da\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc"+
		"\u04dd\3\2\2\2\u04dd\u04ec\5h\65\2\u04de\u04e0\5\u00dco\2\u04df\u04de"+
		"\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04ec\5r:\2\u04e2"+
		"\u04e4\5\u00dco\2\u04e3\u04e2\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5"+
		"\3\2\2\2\u04e5\u04ec\5~@\2\u04e6\u04ec\5\u0080A\2\u04e7\u04e9\5\u00dc"+
		"o\2\u04e8\u04e7\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea"+
		"\u04ec\5\u017a\u00be\2\u04eb\u04d1\3\2\2\2\u04eb\u04d3\3\2\2\2\u04eb\u04d7"+
		"\3\2\2\2\u04eb\u04db\3\2\2\2\u04eb\u04df\3\2\2\2\u04eb\u04e3\3\2\2\2\u04eb"+
		"\u04e6\3\2\2\2\u04eb\u04e8\3\2\2\2\u04ecu\3\2\2\2\u04ed\u0508\5^\60\2"+
		"\u04ee\u04f0\5\u00dco\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0"+
		"\u04f1\3\2\2\2\u04f1\u0508\5b\62\2\u04f2\u04f4\5\u00dco\2\u04f3\u04f2"+
		"\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u0508\5d\63\2\u04f6"+
		"\u04f8\5\u00dco\2\u04f7\u04f6\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f9"+
		"\3\2\2\2\u04f9\u0508\5h\65\2\u04fa\u04fc\5\u00dco\2\u04fb\u04fa\3\2\2"+
		"\2\u04fb\u04fc\3\2\2\2\u04fc\u04fd\3\2\2\2\u04fd\u0508\5r:\2\u04fe\u0500"+
		"\5\u00dco\2\u04ff\u04fe\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0501\3\2\2"+
		"\2\u0501\u0508\5~@\2\u0502\u0508\5\u0080A\2\u0503\u0505\5\u00dco\2\u0504"+
		"\u0503\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0508\5\u017a"+
		"\u00be\2\u0507\u04ed\3\2\2\2\u0507\u04ef\3\2\2\2\u0507\u04f3\3\2\2\2\u0507"+
		"\u04f7\3\2\2\2\u0507\u04fb\3\2\2\2\u0507\u04ff\3\2\2\2\u0507\u0502\3\2"+
		"\2\2\u0507\u0504\3\2\2\2\u0508w\3\2\2\2\u0509\u050c\5b\62\2\u050a\u050c"+
		"\5\u008aF\2\u050b\u0509\3\2\2\2\u050b\u050a\3\2\2\2\u050cy\3\2\2\2\u050d"+
		"\u050f\5\u00dco\2\u050e\u050d\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0510"+
		"\3\2\2\2\u0510\u0511\5\u0094K\2\u0511\u0512\5\u00f6|\2\u0512{\3\2\2\2"+
		"\u0513\u0516\5X-\2\u0514\u0516\5\u0128\u0095\2\u0515\u0513\3\2\2\2\u0515"+
		"\u0514\3\2\2\2\u0516}\3\2\2\2\u0517\u0518\7\n\2\2\u0518\u0528\7{\2\2\u0519"+
		"\u051a\7\24\2\2\u051a\u0528\7{\2\2\u051b\u051d\7\66\2\2\u051c\u051e\5"+
		"X-\2\u051d\u051c\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u051f\3\2\2\2\u051f"+
		"\u0528\7{\2\2\u0520\u0521\7\66\2\2\u0521\u0522\5\u0128\u0095\2\u0522\u0523"+
		"\7{\2\2\u0523\u0528\3\2\2\2\u0524\u0525\7%\2\2\u0525\u0526\7\177\2\2\u0526"+
		"\u0528\7{\2\2\u0527\u0517\3\2\2\2\u0527\u0519\3\2\2\2\u0527\u051b\3\2"+
		"\2\2\u0527\u0520\3\2\2\2\u0527\u0524\3\2\2\2\u0528\177\3\2\2\2\u0529\u052a"+
		"\5\u0086D\2\u052a\u0081\3\2\2\2\u052b\u052c\bB\1\2\u052c\u052d\5\u0084"+
		"C\2\u052d\u0532\3\2\2\2\u052e\u052f\f\3\2\2\u052f\u0531\5\u0084C\2\u0530"+
		"\u052e\3\2\2\2\u0531\u0534\3\2\2\2\u0532\u0530\3\2\2\2\u0532\u0533\3\2"+
		"\2\2\u0533\u0083\3\2\2\2\u0534\u0532\3\2\2\2\u0535\u053f\5\u0086D\2\u0536"+
		"\u053f\5\u011c\u008f\2\u0537\u053f\5\u0162\u00b2\2\u0538\u053f\5\u0176"+
		"\u00bc\2\u0539\u053f\5\u0178\u00bd\2\u053a\u053f\5\u00dan\2\u053b\u053f"+
		"\5\u00c2b\2\u053c\u053f\5\u008eH\2\u053d\u053f\5\u0090I\2\u053e\u0535"+
		"\3\2\2\2\u053e\u0536\3\2\2\2\u053e\u0537\3\2\2\2\u053e\u0538\3\2\2\2\u053e"+
		"\u0539\3\2\2\2\u053e\u053a\3\2\2\2\u053e\u053b\3\2\2\2\u053e\u053c\3\2"+
		"\2\2\u053e\u053d\3\2\2\2\u053f\u0085\3\2\2\2\u0540\u0549\5\u008aF\2\u0541"+
		"\u0549\5\u00d8m\2\u0542\u0549\5\u00d0i\2\u0543\u0549\5\u00d4k\2\u0544"+
		"\u0549\5\u00d6l\2\u0545\u0549\5\u008cG\2\u0546\u0549\5\u0088E\2\u0547"+
		"\u0549\5\u00b2Z\2\u0548\u0540\3\2\2\2\u0548\u0541\3\2\2\2\u0548\u0542"+
		"\3\2\2\2\u0548\u0543\3\2\2\2\u0548\u0544\3\2\2\2\u0548\u0545\3\2\2\2\u0548"+
		"\u0546\3\2\2\2\u0548\u0547\3\2\2\2\u0549\u0087\3\2\2\2\u054a\u054b\7J"+
		"\2\2\u054b\u054d\7\177\2\2\u054c\u054e\5\u00dco\2\u054d\u054c\3\2\2\2"+
		"\u054d\u054e\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0550\7`\2\2\u0550\u0551"+
		"\5\u010a\u0086\2\u0551\u0552\7{\2\2\u0552\u0089\3\2\2\2\u0553\u0555\5"+
		"\u0094K\2\u0554\u0553\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u0557\3\2\2\2"+
		"\u0556\u0558\5\u00f2z\2\u0557\u0556\3\2\2\2\u0557\u0558\3\2\2\2\u0558"+
		"\u0559\3\2\2\2\u0559\u0562\7{\2\2\u055a\u055c\5\u00dco\2\u055b\u055d\5"+
		"\u0094K\2\u055c\u055b\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055e\3\2\2\2"+
		"\u055e\u055f\5\u00f2z\2\u055f\u0560\7{\2\2\u0560\u0562\3\2\2\2\u0561\u0554"+
		"\3\2\2\2\u0561\u055a\3\2\2\2\u0562\u008b\3\2\2\2\u0563\u0564\7;\2\2\u0564"+
		"\u0565\7P\2\2\u0565\u0566\5Z.\2\u0566\u0567\7u\2\2\u0567\u0568\7\u0088"+
		"\2\2\u0568\u0569\7Q\2\2\u0569\u056a\7{\2\2\u056a\u008d\3\2\2\2\u056b\u056c"+
		"\7{\2\2\u056c\u008f\3\2\2\2\u056d\u056e\5\u00dco\2\u056e\u056f\7{\2\2"+
		"\u056f\u0091\3\2\2\2\u0570\u0577\5\u0096L\2\u0571\u0577\5\u009cO\2\u0572"+
		"\u0577\5\u0098M\2\u0573\u0577\7$\2\2\u0574\u0577\7E\2\2\u0575\u0577\7"+
		"\22\2\2\u0576\u0570\3\2\2\2\u0576\u0571\3\2\2\2\u0576\u0572\3\2\2\2\u0576"+
		"\u0573\3\2\2\2\u0576\u0574\3\2\2\2\u0576\u0575\3\2\2\2\u0577\u0093\3\2"+
		"\2\2\u0578\u057a\5\u0092J\2\u0579\u057b\5\u00dco\2\u057a\u0579\3\2\2\2"+
		"\u057a\u057b\3\2\2\2\u057b\u0580\3\2\2\2\u057c\u057d\5\u0092J\2\u057d"+
		"\u057e\5\u0094K\2\u057e\u0580\3\2\2\2\u057f\u0578\3\2\2\2\u057f\u057c"+
		"\3\2\2\2\u0580\u0095\3\2\2\2\u0581\u0582\t\4\2\2\u0582\u0097\3\2\2\2\u0583"+
		"\u0584\t\5\2\2\u0584\u0099\3\2\2\2\u0585\u0586\7\177\2\2\u0586\u009b\3"+
		"\2\2\2\u0587\u058b\5\u009eP\2\u0588\u058b\5\u012c\u0097\2\u0589\u058b"+
		"\5\u00aeX\2\u058a\u0587\3\2\2\2\u058a\u0588\3\2\2\2\u058a\u0589\3\2\2"+
		"\2\u058b\u009d\3\2\2\2\u058c\u0591\5\u00a4S\2\u058d\u0591\5\u00aaV\2\u058e"+
		"\u0591\5\u0174\u00bb\2\u058f\u0591\5\u0104\u0083\2\u0590\u058c\3\2\2\2"+
		"\u0590\u058d\3\2\2\2\u0590\u058e\3\2\2\2\u0590\u058f\3\2\2\2\u0591\u009f"+
		"\3\2\2\2\u0592\u0594\5\u009cO\2\u0593\u0595\5\u00dco\2\u0594\u0593\3\2"+
		"\2\2\u0594\u0595\3\2\2\2\u0595\u059a\3\2\2\2\u0596\u0597\5\u009cO\2\u0597"+
		"\u0598\5\u00a0Q\2\u0598\u059a\3\2\2\2\u0599\u0592\3\2\2\2\u0599\u0596"+
		"\3\2\2\2\u059a\u00a1\3\2\2\2\u059b\u059d\5\u009eP\2\u059c\u059e\5\u00dc"+
		"o\2\u059d\u059c\3\2\2\2\u059d\u059e\3\2\2\2\u059e\u05a3\3\2\2\2\u059f"+
		"\u05a0\5\u009eP\2\u05a0\u05a1\5\u00a2R\2\u05a1\u05a3\3\2\2\2\u05a2\u059b"+
		"\3\2\2\2\u05a2\u059f\3\2\2\2\u05a3\u00a3\3\2\2\2\u05a4\u05a6\5\f\7\2\u05a5"+
		"\u05a4\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05bc\5\u00a6"+
		"T\2\u05a8\u05a9\5\f\7\2\u05a9\u05aa\7?\2\2\u05aa\u05ab\5\u016a\u00b6\2"+
		"\u05ab\u05bc\3\2\2\2\u05ac\u05bc\7\r\2\2\u05ad\u05bc\7\16\2\2\u05ae\u05bc"+
		"\7\17\2\2\u05af\u05bc\7N\2\2\u05b0\u05bc\7\t\2\2\u05b1\u05bc\7\67\2\2"+
		"\u05b2\u05bc\7(\2\2\u05b3\u05bc\7)\2\2\u05b4\u05bc\78\2\2\u05b5\u05bc"+
		"\7I\2\2\u05b6\u05bc\7\"\2\2\u05b7\u05bc\7\31\2\2\u05b8\u05bc\7L\2\2\u05b9"+
		"\u05bc\7\b\2\2\u05ba\u05bc\5\u00a8U\2\u05bb\u05a5\3\2\2\2\u05bb\u05a8"+
		"\3\2\2\2\u05bb\u05ac\3\2\2\2\u05bb\u05ad\3\2\2\2\u05bb\u05ae\3\2\2\2\u05bb"+
		"\u05af\3\2\2\2\u05bb\u05b0\3\2\2\2\u05bb\u05b1\3\2\2\2\u05bb\u05b2\3\2"+
		"\2\2\u05bb\u05b3\3\2\2\2\u05bb\u05b4\3\2\2\2\u05bb\u05b5\3\2\2\2\u05bb"+
		"\u05b6\3\2\2\2\u05bb\u05b7\3\2\2\2\u05bb\u05b8\3\2\2\2\u05bb\u05b9\3\2"+
		"\2\2\u05bb\u05ba\3\2\2\2\u05bc\u00a5\3\2\2\2\u05bd\u05c2\5\u012a\u0096"+
		"\2\u05be\u05c2\5\u00acW\2\u05bf\u05c2\5\u009aN\2\u05c0\u05c2\5\u016a\u00b6"+
		"\2\u05c1\u05bd\3\2\2\2\u05c1\u05be\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c1\u05c0"+
		"\3\2\2\2\u05c2\u00a7\3\2\2\2\u05c3\u05c4\7\25\2\2\u05c4\u05c5\7P\2\2\u05c5"+
		"\u05c6\5X-\2\u05c6\u05c7\7Q\2\2\u05c7\u05cd\3\2\2\2\u05c8\u05c9\7\25\2"+
		"\2\u05c9\u05ca\7P\2\2\u05ca\u05cb\7\b\2\2\u05cb\u05cd\7Q\2\2\u05cc\u05c3"+
		"\3\2\2\2\u05cc\u05c8\3\2\2\2\u05cd\u00a9\3\2\2\2\u05ce\u05d0\5\u0134\u009b"+
		"\2\u05cf\u05d1\5\u00dco\2\u05d0\u05cf\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1"+
		"\u05d3\3\2\2\2\u05d2\u05d4\5\f\7\2\u05d3\u05d2\3\2\2\2\u05d3\u05d4\3\2"+
		"\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d6\7\177\2\2\u05d6\u05e7\3\2\2\2\u05d7"+
		"\u05d8\5\u0134\u009b\2\u05d8\u05d9\5\u016a\u00b6\2\u05d9\u05e7\3\2\2\2"+
		"\u05da\u05db\5\u0134\u009b\2\u05db\u05dd\5\f\7\2\u05dc\u05de\7?\2\2\u05dd"+
		"\u05dc\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e0\5\u016a"+
		"\u00b6\2\u05e0\u05e7\3\2\2\2\u05e1\u05e3\7\34\2\2\u05e2\u05e4\5\f\7\2"+
		"\u05e3\u05e2\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e7"+
		"\7\177\2\2\u05e6\u05ce\3\2\2\2\u05e6\u05d7\3\2\2\2\u05e6\u05da\3\2\2\2"+
		"\u05e6\u05e1\3\2\2\2\u05e7\u00ab\3\2\2\2\u05e8\u05e9\7\177\2\2\u05e9\u00ad"+
		"\3\2\2\2\u05ea\u05eb\5\u00b0Y\2\u05eb\u05ed\7T\2\2\u05ec\u05ee\5\u00b8"+
		"]\2\u05ed\u05ec\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef"+
		"\u05f0\7U\2\2\u05f0\u05f8\3\2\2\2\u05f1\u05f2\5\u00b0Y\2\u05f2\u05f3\7"+
		"T\2\2\u05f3\u05f4\5\u00b8]\2\u05f4\u05f5\7u\2\2\u05f5\u05f6\7U\2\2\u05f6"+
		"\u05f8\3\2\2\2\u05f7\u05ea\3\2\2\2\u05f7\u05f1\3\2\2\2\u05f8\u00af\3\2"+
		"\2\2\u05f9\u05fb\5\u00b4[\2\u05fa\u05fc\5\u00dco\2\u05fb\u05fa\3\2\2\2"+
		"\u05fb\u05fc\3\2\2\2\u05fc\u05fe\3\2\2\2\u05fd\u05ff\7\177\2\2\u05fe\u05fd"+
		"\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0601\3\2\2\2\u0600\u0602\5\u00b6\\"+
		"\2\u0601\u0600\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u060d\3\2\2\2\u0603\u0605"+
		"\5\u00b4[\2\u0604\u0606\5\u00dco\2\u0605\u0604\3\2\2\2\u0605\u0606\3\2"+
		"\2\2\u0606\u0607\3\2\2\2\u0607\u0608\5\f\7\2\u0608\u060a\7\177\2\2\u0609"+
		"\u060b\5\u00b6\\\2\u060a\u0609\3\2\2\2\u060a\u060b\3\2\2\2\u060b\u060d"+
		"\3\2\2\2\u060c\u05f9\3\2\2\2\u060c\u0603\3\2\2\2\u060d\u00b1\3\2\2\2\u060e"+
		"\u0610\5\u00b4[\2\u060f\u0611\5\u00dco\2\u0610\u060f\3\2\2\2\u0610\u0611"+
		"\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0614\7\177\2\2\u0613\u0615\5\u00b6"+
		"\\\2\u0614\u0613\3\2\2\2\u0614\u0615\3\2\2\2\u0615\u0616\3\2\2\2\u0616"+
		"\u0617\7{\2\2\u0617\u00b3\3\2\2\2\u0618\u061e\7\34\2\2\u0619\u061a\7\34"+
		"\2\2\u061a\u061e\7\20\2\2\u061b\u061c\7\34\2\2\u061c\u061e\7=\2\2\u061d"+
		"\u0618\3\2\2\2\u061d\u0619\3\2\2\2\u061d\u061b\3\2\2\2\u061e\u00b5\3\2"+
		"\2\2\u061f\u0620\7y\2\2\u0620\u0621\5\u00a0Q\2\u0621\u00b7\3\2\2\2\u0622"+
		"\u0623\b]\1\2\u0623\u0624\5\u00ba^\2\u0624\u062a\3\2\2\2\u0625\u0626\f"+
		"\3\2\2\u0626\u0627\7u\2\2\u0627\u0629\5\u00ba^\2\u0628\u0625\3\2\2\2\u0629"+
		"\u062c\3\2\2\2\u062a\u0628\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u00b9\3\2"+
		"\2\2\u062c\u062a\3\2\2\2\u062d\u0633\5\u00bc_\2\u062e\u062f\5\u00bc_\2"+
		"\u062f\u0630\7`\2\2\u0630\u0631\5Z.\2\u0631\u0633\3\2\2\2\u0632\u062d"+
		"\3\2\2\2\u0632\u062e\3\2\2\2\u0633\u00bb\3\2\2\2\u0634\u0635\7\177\2\2"+
		"\u0635\u00bd\3\2\2\2\u0636\u0639\5\u00c0a\2\u0637\u0639\5\u00ceh\2\u0638"+
		"\u0636\3\2\2\2\u0638\u0637\3\2\2\2\u0639\u00bf\3\2\2\2\u063a\u063b\7\177"+
		"\2\2\u063b\u00c1\3\2\2\2\u063c\u063f\5\u00c4c\2\u063d\u063f\5\u00caf\2"+
		"\u063e\u063c\3\2\2\2\u063e\u063d\3\2\2\2\u063f\u00c3\3\2\2\2\u0640\u0643"+
		"\5\u00c6d\2\u0641\u0643\5\u00c8e\2\u0642\u0640\3\2\2\2\u0642\u0641\3\2"+
		"\2\2\u0643\u00c5\3\2\2\2\u0644\u0646\7\'\2\2\u0645\u0644\3\2\2\2\u0645"+
		"\u0646\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0648\7+\2\2\u0648\u0649\7\177"+
		"\2\2\u0649\u064a\7T\2\2\u064a\u064b\5\u00ccg\2\u064b\u064c\7U\2\2\u064c"+
		"\u00c7\3\2\2\2\u064d\u064f\7\'\2\2\u064e\u064d\3\2\2\2\u064e\u064f\3\2"+
		"\2\2\u064f\u0650\3\2\2\2\u0650\u0651\7+\2\2\u0651\u0652\5\u00c0a\2\u0652"+
		"\u0653\7T\2\2\u0653\u0654\5\u00ccg\2\u0654\u0655\7U\2\2\u0655\u00c9\3"+
		"\2\2\2\u0656\u0658\7\'\2\2\u0657\u0656\3\2\2\2\u0657\u0658\3\2\2\2\u0658"+
		"\u0659\3\2\2\2\u0659\u065a\7+\2\2\u065a\u065b\7T\2\2\u065b\u065c\5\u00cc"+
		"g\2\u065c\u065d\7U\2\2\u065d\u00cb\3\2\2\2\u065e\u0660\5\u0082B\2\u065f"+
		"\u065e\3\2\2\2\u065f\u0660\3\2\2\2\u0660\u00cd\3\2\2\2\u0661\u0662\7\177"+
		"\2\2\u0662\u00cf\3\2\2\2\u0663\u0664\7+\2\2\u0664\u0665\7\177\2\2\u0665"+
		"\u0666\7`\2\2\u0666\u0667\5\u00d2j\2\u0667\u0668\7{\2\2\u0668\u00d1\3"+
		"\2\2\2\u0669\u066b\5\f\7\2\u066a\u0669\3\2\2\2\u066a\u066b\3\2\2\2\u066b"+
		"\u066c\3\2\2\2\u066c\u066d\5\u00be`\2\u066d\u00d3\3\2\2\2\u066e\u0670"+
		"\7J\2\2\u066f\u0671\7G\2\2\u0670\u066f\3\2\2\2\u0670\u0671\3\2\2\2\u0671"+
		"\u0672\3\2\2\2\u0672\u0673\5\f\7\2\u0673\u0674\5\b\5\2\u0674\u0675\7{"+
		"\2\2\u0675\u067c\3\2\2\2\u0676\u0677\7J\2\2\u0677\u0678\7z\2\2\u0678\u0679"+
		"\5\b\5\2\u0679\u067a\7{\2\2\u067a\u067c\3\2\2\2\u067b\u066e\3\2\2\2\u067b"+
		"\u0676\3\2\2\2\u067c\u00d5\3\2\2\2\u067d\u067f\5\u00dco\2\u067e\u067d"+
		"\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u0681\7J\2\2\u0681"+
		"\u0683\7+\2\2\u0682\u0684\5\f\7\2\u0683\u0682\3\2\2\2\u0683\u0684\3\2"+
		"\2\2\u0684\u0685\3\2\2\2\u0685\u0686\5\u00be`\2\u0686\u0687\7{\2\2\u0687"+
		"\u00d7\3\2\2\2\u0688\u0689\7\7\2\2\u0689\u068a\7P\2\2\u068a\u068b\7\u0088"+
		"\2\2\u068b\u068c\7Q\2\2\u068c\u068d\7{\2\2\u068d\u00d9\3\2\2\2\u068e\u068f"+
		"\7\37\2\2\u068f\u0690\7\u0088\2\2\u0690\u0692\7T\2\2\u0691\u0693\5\u0082"+
		"B\2\u0692\u0691\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u0694\3\2\2\2\u0694"+
		"\u0699\7U\2\2\u0695\u0696\7\37\2\2\u0696\u0697\7\u0088\2\2\u0697\u0699"+
		"\5\u0084C\2\u0698\u068e\3\2\2\2\u0698\u0695\3\2\2\2\u0699\u00db\3\2\2"+
		"\2\u069a\u069b\bo\1\2\u069b\u069c\5\u00dep\2\u069c\u06a1\3\2\2\2\u069d"+
		"\u069e\f\3\2\2\u069e\u06a0\5\u00dep\2\u069f\u069d\3\2\2\2\u06a0\u06a3"+
		"\3\2\2\2\u06a1\u069f\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u00dd\3\2\2\2\u06a3"+
		"\u06a1\3\2\2\2\u06a4\u06a5\7R\2\2\u06a5\u06a6\7R\2\2\u06a6\u06a7\5\u00e2"+
		"r\2\u06a7\u06a8\7S\2\2\u06a8\u06a9\7S\2\2\u06a9\u06ac\3\2\2\2\u06aa\u06ac"+
		"\5\u00e0q\2\u06ab\u06a4\3\2\2\2\u06ab\u06aa\3\2\2\2\u06ac\u00df\3\2\2"+
		"\2\u06ad\u06ae\7\5\2\2\u06ae\u06af\7P\2\2\u06af\u06b1\5\u010a\u0086\2"+
		"\u06b0\u06b2\7~\2\2\u06b1\u06b0\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b3"+
		"\3\2\2\2\u06b3\u06b4\7Q\2\2\u06b4\u06be\3\2\2\2\u06b5\u06b6\7\5\2\2\u06b6"+
		"\u06b7\7P\2\2\u06b7\u06b9\5Z.\2\u06b8\u06ba\7~\2\2\u06b9\u06b8\3\2\2\2"+
		"\u06b9\u06ba\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06bc\7Q\2\2\u06bc\u06be"+
		"\3\2\2\2\u06bd\u06ad\3\2\2\2\u06bd\u06b5\3\2\2\2\u06be\u00e1\3\2\2\2\u06bf"+
		"\u06c1\br\1\2\u06c0\u06c2\5\u00e4s\2\u06c1\u06c0\3\2\2\2\u06c1\u06c2\3"+
		"\2\2\2\u06c2\u06c7\3\2\2\2\u06c3\u06c4\5\u00e4s\2\u06c4\u06c5\7~\2\2\u06c5"+
		"\u06c7\3\2\2\2\u06c6\u06bf\3\2\2\2\u06c6\u06c3\3\2\2\2\u06c7\u06d4\3\2"+
		"\2\2\u06c8\u06c9\f\5\2\2\u06c9\u06cb\7u\2\2\u06ca\u06cc\5\u00e4s\2\u06cb"+
		"\u06ca\3\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u06d3\3\2\2\2\u06cd\u06ce\f\3"+
		"\2\2\u06ce\u06cf\7u\2\2\u06cf\u06d0\5\u00e4s\2\u06d0\u06d1\7~\2\2\u06d1"+
		"\u06d3\3\2\2\2\u06d2\u06c8\3\2\2\2\u06d2\u06cd\3\2\2\2\u06d3\u06d6\3\2"+
		"\2\2\u06d4\u06d2\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u00e3\3\2\2\2\u06d6"+
		"\u06d4\3\2\2\2\u06d7\u06d9\5\u00e6t\2\u06d8\u06da\5\u00ecw\2\u06d9\u06d8"+
		"\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u00e5\3\2\2\2\u06db\u06de\7\177\2\2"+
		"\u06dc\u06de\5\u00e8u\2\u06dd\u06db\3\2\2\2\u06dd\u06dc\3\2\2\2\u06de"+
		"\u00e7\3\2\2\2\u06df\u06e0\5\u00eav\2\u06e0\u06e1\7z\2\2\u06e1\u06e2\7"+
		"\177\2\2\u06e2\u00e9\3\2\2\2\u06e3\u06e4\7\177\2\2\u06e4\u00eb\3\2\2\2"+
		"\u06e5\u06e6\7P\2\2\u06e6\u06e7\5\u00eex\2\u06e7\u06e8\7Q\2\2\u06e8\u00ed"+
		"\3\2\2\2\u06e9\u06eb\bx\1\2\u06ea\u06ec\5\u00f0y\2\u06eb\u06ea\3\2\2\2"+
		"\u06eb\u06ec\3\2\2\2\u06ec\u06f1\3\2\2\2\u06ed\u06ee\f\3\2\2\u06ee\u06f0"+
		"\5\u00f0y\2\u06ef\u06ed\3\2\2\2\u06f0\u06f3\3\2\2\2\u06f1\u06ef\3\2\2"+
		"\2\u06f1\u06f2\3\2\2\2\u06f2\u00ef\3\2\2\2\u06f3\u06f1\3\2\2\2\u06f4\u06f5"+
		"\7P\2\2\u06f5\u06f6\5\u00eex\2\u06f6\u06f7\7Q\2\2\u06f7\u0701\3\2\2\2"+
		"\u06f8\u06f9\7R\2\2\u06f9\u06fa\5\u00eex\2\u06fa\u06fb\7S\2\2\u06fb\u0701"+
		"\3\2\2\2\u06fc\u06fd\7T\2\2\u06fd\u06fe\5\u00eex\2\u06fe\u06ff\7U\2\2"+
		"\u06ff\u0701\3\2\2\2\u0700\u06f4\3\2\2\2\u0700\u06f8\3\2\2\2\u0700\u06fc"+
		"\3\2\2\2\u0701\u00f1\3\2\2\2\u0702\u0703\bz\1\2\u0703\u0704\5\u00f4{\2"+
		"\u0704\u070a\3\2\2\2\u0705\u0706\f\3\2\2\u0706\u0707\7u\2\2\u0707\u0709"+
		"\5\u00f4{\2\u0708\u0705\3\2\2\2\u0709\u070c\3\2\2\2\u070a\u0708\3\2\2"+
		"\2\u070a\u070b\3\2\2\2\u070b\u00f3\3\2\2\2\u070c\u070a\3\2\2\2\u070d\u070f"+
		"\5\u00f6|\2\u070e\u0710\5\u0120\u0091\2\u070f\u070e\3\2\2\2\u070f\u0710"+
		"\3\2\2\2\u0710\u00f5\3\2\2\2\u0711\u0717\5\u00f8}\2\u0712\u0713\5\u00fa"+
		"~\2\u0713\u0714\5\u00fc\177\2\u0714\u0715\5\u00fe\u0080\2\u0715\u0717"+
		"\3\2\2\2\u0716\u0711\3\2\2\2\u0716\u0712\3\2\2\2\u0717\u00f7\3\2\2\2\u0718"+
		"\u071d\5\u00fa~\2\u0719\u071a\5\u0100\u0081\2\u071a\u071b\5\u00f8}\2\u071b"+
		"\u071d\3\2\2\2\u071c\u0718\3\2\2\2\u071c\u0719\3\2\2\2\u071d\u00f9\3\2"+
		"\2\2\u071e\u071f\b~\1\2\u071f\u0721\5\u0108\u0085\2\u0720\u0722\5\u00dc"+
		"o\2\u0721\u0720\3\2\2\2\u0721\u0722\3\2\2\2\u0722\u0728\3\2\2\2\u0723"+
		"\u0724\7P\2\2\u0724\u0725\5\u00f8}\2\u0725\u0726\7Q\2\2\u0726\u0728\3"+
		"\2\2\2\u0727\u071e\3\2\2\2\u0727\u0723\3\2\2\2\u0728\u0736\3\2\2\2\u0729"+
		"\u072a\f\5\2\2\u072a\u0735\5\u00fc\177\2\u072b\u072c\f\4\2\2\u072c\u072e"+
		"\7R\2\2\u072d\u072f\5Z.\2\u072e\u072d\3\2\2\2\u072e\u072f\3\2\2\2\u072f"+
		"\u0730\3\2\2\2\u0730\u0732\7S\2\2\u0731\u0733\5\u00dco\2\u0732\u0731\3"+
		"\2\2\2\u0732\u0733\3\2\2\2\u0733\u0735\3\2\2\2\u0734\u0729\3\2\2\2\u0734"+
		"\u072b\3\2\2\2\u0735\u0738\3\2\2\2\u0736\u0734\3\2\2\2\u0736\u0737\3\2"+
		"\2\2\u0737\u00fb\3\2\2\2\u0738\u0736\3\2\2\2\u0739\u073a\7P\2\2\u073a"+
		"\u073b\5\u0116\u008c\2\u073b\u073d\7Q\2\2\u073c\u073e\5\u0102\u0082\2"+
		"\u073d\u073c\3\2\2\2\u073d\u073e\3\2\2\2\u073e\u0740\3\2\2\2\u073f\u0741"+
		"\5\u0106\u0084\2\u0740\u073f\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u0743\3"+
		"\2\2\2\u0742\u0744\5\u0186\u00c4\2\u0743\u0742\3\2\2\2\u0743\u0744\3\2"+
		"\2\2\u0744\u0746\3\2\2\2\u0745\u0747\5\u00dco\2\u0746\u0745\3\2\2\2\u0746"+
		"\u0747\3\2\2\2\u0747\u00fd\3\2\2\2\u0748\u0749\7w\2\2\u0749\u074b\5\u00a2"+
		"R\2\u074a\u074c\5\u010c\u0087\2\u074b\u074a\3\2\2\2\u074b\u074c\3\2\2"+
		"\2\u074c\u00ff\3\2\2\2\u074d\u074f\7X\2\2\u074e\u0750\5\u00dco\2\u074f"+
		"\u074e\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u0752\3\2\2\2\u0751\u0753\5\u0102"+
		"\u0082\2\u0752\u0751\3\2\2\2\u0752\u0753\3\2\2\2\u0753\u0765\3\2\2\2\u0754"+
		"\u0756\7\\\2\2\u0755\u0757\5\u00dco\2\u0756\u0755\3\2\2\2\u0756\u0757"+
		"\3\2\2\2\u0757\u0765\3\2\2\2\u0758\u075a\7q\2\2\u0759\u075b\5\u00dco\2"+
		"\u075a\u0759\3\2\2\2\u075a\u075b\3\2\2\2\u075b\u0765\3\2\2\2\u075c\u075d"+
		"\5\f\7\2\u075d\u075f\7X\2\2\u075e\u0760\5\u00dco\2\u075f\u075e\3\2\2\2"+
		"\u075f\u0760\3\2\2\2\u0760\u0762\3\2\2\2\u0761\u0763\5\u0102\u0082\2\u0762"+
		"\u0761\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u0765\3\2\2\2\u0764\u074d\3\2"+
		"\2\2\u0764\u0754\3\2\2\2\u0764\u0758\3\2\2\2\u0764\u075c\3\2\2\2\u0765"+
		"\u0101\3\2\2\2\u0766\u0768\5\u0104\u0083\2\u0767\u0769\5\u0102\u0082\2"+
		"\u0768\u0767\3\2\2\2\u0768\u0769\3\2\2\2\u0769\u0103\3\2\2\2\u076a\u076b"+
		"\t\6\2\2\u076b\u0105\3\2\2\2\u076c\u076d\t\7\2\2\u076d\u0107\3\2\2\2\u076e"+
		"\u0770\7~\2\2\u076f\u076e\3\2\2\2\u076f\u0770\3\2\2\2\u0770\u0771\3\2"+
		"\2\2\u0771\u0772\5\6\4\2\u0772\u0109\3\2\2\2\u0773\u0775\5\u00a0Q\2\u0774"+
		"\u0776\5\u010c\u0087\2\u0775\u0774\3\2\2\2\u0775\u0776\3\2\2\2\u0776\u010b"+
		"\3\2\2\2\u0777\u0780\5\u010e\u0088\2\u0778\u077a\5\u0110\u0089\2\u0779"+
		"\u0778\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u077b\3\2\2\2\u077b\u077c\5\u00fc"+
		"\177\2\u077c\u077d\5\u00fe\u0080\2\u077d\u0780\3\2\2\2\u077e\u0780\5\u0112"+
		"\u008a\2\u077f\u0777\3\2\2\2\u077f\u0779\3\2\2\2\u077f\u077e\3\2\2\2\u0780"+
		"\u010d\3\2\2\2\u0781\u0787\5\u0110\u0089\2\u0782\u0784\5\u0100\u0081\2"+
		"\u0783\u0785\5\u010e\u0088\2\u0784\u0783\3\2\2\2\u0784\u0785\3\2\2\2\u0785"+
		"\u0787\3\2\2\2\u0786\u0781\3\2\2\2\u0786\u0782\3\2\2\2\u0787\u010f\3\2"+
		"\2\2\u0788\u0789\b\u0089\1\2\u0789\u0797\5\u00fc\177\2\u078a\u078c\7R"+
		"\2\2\u078b\u078d\5Z.\2\u078c\u078b\3\2\2\2\u078c\u078d\3\2\2\2\u078d\u078e"+
		"\3\2\2\2\u078e\u0790\7S\2\2\u078f\u0791\5\u00dco\2\u0790\u078f\3\2\2\2"+
		"\u0790\u0791\3\2\2\2\u0791\u0797\3\2\2\2\u0792\u0793\7P\2\2\u0793\u0794"+
		"\5\u010e\u0088\2\u0794\u0795\7Q\2\2\u0795\u0797\3\2\2\2\u0796\u0788\3"+
		"\2\2\2\u0796\u078a\3\2\2\2\u0796\u0792\3\2\2\2\u0797\u07a5\3\2\2\2\u0798"+
		"\u0799\f\7\2\2\u0799\u07a4\5\u00fc\177\2\u079a\u079b\f\5\2\2\u079b\u079d"+
		"\7R\2\2\u079c\u079e\5Z.\2\u079d\u079c\3\2\2\2\u079d\u079e\3\2\2\2\u079e"+
		"\u079f\3\2\2\2\u079f\u07a1\7S\2\2\u07a0\u07a2\5\u00dco\2\u07a1\u07a0\3"+
		"\2\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07a4\3\2\2\2\u07a3\u0798\3\2\2\2\u07a3"+
		"\u079a\3\2\2\2\u07a4\u07a7\3\2\2\2\u07a5\u07a3\3\2\2\2\u07a5\u07a6\3\2"+
		"\2\2\u07a6\u0111\3\2\2\2\u07a7\u07a5\3\2\2\2\u07a8\u07ad\5\u0114\u008b"+
		"\2\u07a9\u07aa\5\u0100\u0081\2\u07aa\u07ab\5\u0112\u008a\2\u07ab\u07ad"+
		"\3\2\2\2\u07ac\u07a8\3\2\2\2\u07ac\u07a9\3\2\2\2\u07ad\u0113\3\2\2\2\u07ae"+
		"\u07af\b\u008b\1\2\u07af\u07b0\7~\2\2\u07b0\u07be\3\2\2\2\u07b1\u07b2"+
		"\f\5\2\2\u07b2\u07bd\5\u00fc\177\2\u07b3\u07b4\f\4\2\2\u07b4\u07b6\7R"+
		"\2\2\u07b5\u07b7\5Z.\2\u07b6\u07b5\3\2\2\2\u07b6\u07b7\3\2\2\2\u07b7\u07b8"+
		"\3\2\2\2\u07b8\u07ba\7S\2\2\u07b9\u07bb\5\u00dco\2\u07ba\u07b9\3\2\2\2"+
		"\u07ba\u07bb\3\2\2\2\u07bb\u07bd\3\2\2\2\u07bc\u07b1\3\2\2\2\u07bc\u07b3"+
		"\3\2\2\2\u07bd\u07c0\3\2\2\2\u07be\u07bc\3\2\2\2\u07be\u07bf\3\2\2\2\u07bf"+
		"\u0115\3\2\2\2\u07c0\u07be\3\2\2\2\u07c1\u07c3\5\u0118\u008d\2\u07c2\u07c1"+
		"\3\2\2\2\u07c2\u07c3\3\2\2\2\u07c3\u07c5\3\2\2\2\u07c4\u07c6\7~\2\2\u07c5"+
		"\u07c4\3\2\2\2\u07c5\u07c6\3\2\2\2\u07c6\u07cc\3\2\2\2\u07c7\u07c8\5\u0118"+
		"\u008d\2\u07c8\u07c9\7u\2\2\u07c9\u07ca\7~\2\2\u07ca\u07cc\3\2\2\2\u07cb"+
		"\u07c2\3\2\2\2\u07cb\u07c7\3\2\2\2\u07cc\u0117\3\2\2\2\u07cd\u07ce\b\u008d"+
		"\1\2\u07ce\u07cf\5\u011a\u008e\2\u07cf\u07d5\3\2\2\2\u07d0\u07d1\f\3\2"+
		"\2\u07d1\u07d2\7u\2\2\u07d2\u07d4\5\u011a\u008e\2\u07d3\u07d0\3\2\2\2"+
		"\u07d4\u07d7\3\2\2\2\u07d5\u07d3\3\2\2\2\u07d5\u07d6\3\2\2\2\u07d6\u0119"+
		"\3\2\2\2\u07d7\u07d5\3\2\2\2\u07d8\u07da\5\u00dco\2\u07d9\u07d8\3\2\2"+
		"\2\u07d9\u07da\3\2\2\2\u07da\u07db\3\2\2\2\u07db\u07dc\5\u0094K\2\u07dc"+
		"\u07dd\5\u00f6|\2\u07dd\u07f8\3\2\2\2\u07de\u07e0\5\u00dco\2\u07df\u07de"+
		"\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e2\5\u0094K"+
		"\2\u07e2\u07e3\5\u00f6|\2\u07e3\u07e4\7`\2\2\u07e4\u07e5\5\u0124\u0093"+
		"\2\u07e5\u07f8\3\2\2\2\u07e6\u07e8\5\u00dco\2\u07e7\u07e6\3\2\2\2\u07e7"+
		"\u07e8\3\2\2\2\u07e8\u07e9\3\2\2\2\u07e9\u07eb\5\u0094K\2\u07ea\u07ec"+
		"\5\u010c\u0087\2\u07eb\u07ea\3\2\2\2\u07eb\u07ec\3\2\2\2\u07ec\u07f8\3"+
		"\2\2\2\u07ed\u07ef\5\u00dco\2\u07ee\u07ed\3\2\2\2\u07ee\u07ef\3\2\2\2"+
		"\u07ef\u07f0\3\2\2\2\u07f0\u07f2\5\u0094K\2\u07f1\u07f3\5\u010c\u0087"+
		"\2\u07f2\u07f1\3\2\2\2\u07f2\u07f3\3\2\2\2\u07f3\u07f4\3\2\2\2\u07f4\u07f5"+
		"\7`\2\2\u07f5\u07f6\5\u0124\u0093\2\u07f6\u07f8\3\2\2\2\u07f7\u07d9\3"+
		"\2\2\2\u07f7\u07df\3\2\2\2\u07f7\u07e7\3\2\2\2\u07f7\u07ee\3\2\2\2\u07f8"+
		"\u011b\3\2\2\2\u07f9\u07fb\5\u00dco\2\u07fa\u07f9\3\2\2\2\u07fa\u07fb"+
		"\3\2\2\2\u07fb\u07fd\3\2\2\2\u07fc\u07fe\5\u0094K\2\u07fd\u07fc\3\2\2"+
		"\2\u07fd\u07fe\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0801\5\u00f6|\2\u0800"+
		"\u0802\5\u013e\u00a0\2\u0801\u0800\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u0803"+
		"\3\2\2\2\u0803\u0804\5\u011e\u0090\2\u0804\u011d\3\2\2\2\u0805\u0807\5"+
		"\u0156\u00ac\2\u0806\u0805\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u0808\3\2"+
		"\2\2\u0808\u0811\5d\63\2\u0809\u0811\5\u017c\u00bf\2\u080a\u080b\7`\2"+
		"\2\u080b\u080c\7\26\2\2\u080c\u0811\7{\2\2\u080d\u080e\7`\2\2\u080e\u080f"+
		"\7\27\2\2\u080f\u0811\7{\2\2\u0810\u0806\3\2\2\2\u0810\u0809\3\2\2\2\u0810"+
		"\u080a\3\2\2\2\u0810\u080d\3\2\2\2\u0811\u011f\3\2\2\2\u0812\u0818\5\u0122"+
		"\u0092\2\u0813\u0814\7P\2\2\u0814\u0815\5\"\22\2\u0815\u0816\7Q\2\2\u0816"+
		"\u0818\3\2\2\2\u0817\u0812\3\2\2\2\u0817\u0813\3\2\2\2\u0818\u0121\3\2"+
		"\2\2\u0819\u081a\7`\2\2\u081a\u081d\5\u0124\u0093\2\u081b\u081d\5\u0128"+
		"\u0095\2\u081c\u0819\3\2\2\2\u081c\u081b\3\2\2\2\u081d\u0123\3\2\2\2\u081e"+
		"\u0821\5T+\2\u081f\u0821\5\u0128\u0095\2\u0820\u081e\3\2\2\2\u0820\u081f"+
		"\3\2\2\2\u0821\u0125\3\2\2\2\u0822\u0823\b\u0094\1\2\u0823\u0825\5\u0124"+
		"\u0093\2\u0824\u0826\7~\2\2\u0825\u0824\3\2\2\2\u0825\u0826\3\2\2\2\u0826"+
		"\u082f\3\2\2\2\u0827\u0828\f\3\2\2\u0828\u0829\7u\2\2\u0829\u082b\5\u0124"+
		"\u0093\2\u082a\u082c\7~\2\2\u082b\u082a\3\2\2\2\u082b\u082c\3\2\2\2\u082c"+
		"\u082e\3\2\2\2\u082d\u0827\3\2\2\2\u082e\u0831\3\2\2\2\u082f\u082d\3\2"+
		"\2\2\u082f\u0830\3\2\2\2\u0830\u0127\3\2\2\2\u0831\u082f\3\2\2\2\u0832"+
		"\u0833\7T\2\2\u0833\u0835\5\u0126\u0094\2\u0834\u0836\7u\2\2\u0835\u0834"+
		"\3\2\2\2\u0835\u0836\3\2\2\2\u0836\u0837\3\2\2\2\u0837\u0838\7U\2\2\u0838"+
		"\u083c\3\2\2\2\u0839\u083a\7T\2\2\u083a\u083c\7U\2\2\u083b\u0832\3\2\2"+
		"\2\u083b\u0839\3\2\2\2\u083c\u0129\3\2\2\2\u083d\u0840\7\177\2\2\u083e"+
		"\u0840\5\u016a\u00b6\2\u083f\u083d\3\2\2\2\u083f\u083e\3\2\2\2\u0840\u012b"+
		"\3\2\2\2\u0841\u0842\5\u012e\u0098\2\u0842\u0844\7T\2\2\u0843\u0845\5"+
		"\u0136\u009c\2\u0844\u0843\3\2\2\2\u0844\u0845\3\2\2\2\u0845\u0846\3\2"+
		"\2\2\u0846\u0847\7U\2\2\u0847\u012d\3\2\2\2\u0848\u084a\5\u0134\u009b"+
		"\2\u0849\u084b\5\u00dco\2\u084a\u0849\3\2\2\2\u084a\u084b\3\2\2\2\u084b"+
		"\u084c\3\2\2\2\u084c\u084e\5\u0130\u0099\2\u084d\u084f\5\u0132\u009a\2"+
		"\u084e\u084d\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u0851\3\2\2\2\u0850\u0852"+
		"\5\u0144\u00a3\2\u0851\u0850\3\2\2\2\u0851\u0852\3\2\2\2\u0852\u085b\3"+
		"\2\2\2\u0853\u0855\5\u0134\u009b\2\u0854\u0856\5\u00dco\2\u0855\u0854"+
		"\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0858\3\2\2\2\u0857\u0859\5\u0144\u00a3"+
		"\2\u0858\u0857\3\2\2\2\u0858\u0859\3\2\2\2\u0859\u085b\3\2\2\2\u085a\u0848"+
		"\3\2\2\2\u085a\u0853\3\2\2\2\u085b\u012f\3\2\2\2\u085c\u085e\5\f\7\2\u085d"+
		"\u085c\3\2\2\2\u085d\u085e\3\2\2\2\u085e\u085f\3\2\2\2\u085f\u0860\5\u012a"+
		"\u0096\2\u0860\u0131\3\2\2\2\u0861\u0862\7!\2\2\u0862\u0133\3\2\2\2\u0863"+
		"\u0864\t\b\2\2\u0864\u0135\3\2\2\2\u0865\u0867\5\u0138\u009d\2\u0866\u0868"+
		"\5\u0136\u009c\2\u0867\u0866\3\2\2\2\u0867\u0868\3\2\2\2\u0868\u086f\3"+
		"\2\2\2\u0869\u086a\5\u014e\u00a8\2\u086a\u086c\7y\2\2\u086b\u086d\5\u0136"+
		"\u009c\2\u086c\u086b\3\2\2\2\u086c\u086d\3\2\2\2\u086d\u086f\3\2\2\2\u086e"+
		"\u0865\3\2\2\2\u086e\u0869\3\2\2\2\u086f\u0137\3\2\2\2\u0870\u0872\5\u00dc"+
		"o\2\u0871\u0870\3\2\2\2\u0871\u0872\3\2\2\2\u0872\u0874\3\2\2\2\u0873"+
		"\u0875\5\u0094K\2\u0874\u0873\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0877"+
		"\3\2\2\2\u0876\u0878\5\u013a\u009e\2\u0877\u0876\3\2\2\2\u0877\u0878\3"+
		"\2\2\2\u0878\u0879\3\2\2\2\u0879\u0881\7{\2\2\u087a\u0881\5\u011c\u008f"+
		"\2\u087b\u0881\5\u00d4k\2\u087c\u0881\5\u008cG\2\u087d\u0881\5\u0162\u00b2"+
		"\2\u087e\u0881\5\u0088E\2\u087f\u0881\5\u008eH\2\u0880\u0871\3\2\2\2\u0880"+
		"\u087a\3\2\2\2\u0880\u087b\3\2\2\2\u0880\u087c\3\2\2\2\u0880\u087d\3\2"+
		"\2\2\u0880\u087e\3\2\2\2\u0880\u087f\3\2\2\2\u0881\u0139\3\2\2\2\u0882"+
		"\u0883\b\u009e\1\2\u0883\u0884\5\u013c\u009f\2\u0884\u088a\3\2\2\2\u0885"+
		"\u0886\f\3\2\2\u0886\u0887\7u\2\2\u0887\u0889\5\u013c\u009f\2\u0888\u0885"+
		"\3\2\2\2\u0889\u088c\3\2\2\2\u088a\u0888\3\2\2\2\u088a\u088b\3\2\2\2\u088b"+
		"\u013b\3\2\2\2\u088c\u088a\3\2\2\2\u088d\u088f\5\u00f6|\2\u088e\u0890"+
		"\5\u013e\u00a0\2\u088f\u088e\3\2\2\2\u088f\u0890\3\2\2\2\u0890\u0892\3"+
		"\2\2\2\u0891\u0893\5\u0142\u00a2\2\u0892\u0891\3\2\2\2\u0892\u0893\3\2"+
		"\2\2\u0893\u08a1\3\2\2\2\u0894\u0896\5\u00f6|\2\u0895\u0897\5\u0122\u0092"+
		"\2\u0896\u0895\3\2\2\2\u0896\u0897\3\2\2\2\u0897\u08a1\3\2\2\2\u0898\u089a"+
		"\7\177\2\2\u0899\u0898\3\2\2\2\u0899\u089a\3\2\2\2\u089a\u089c\3\2\2\2"+
		"\u089b\u089d\5\u00dco\2\u089c\u089b\3\2\2\2\u089c\u089d\3\2\2\2\u089d"+
		"\u089e\3\2\2\2\u089e\u089f\7y\2\2\u089f\u08a1\5Z.\2\u08a0\u088d\3\2\2"+
		"\2\u08a0\u0894\3\2\2\2\u08a0\u0899\3\2\2\2\u08a1\u013d\3\2\2\2\u08a2\u08a3"+
		"\b\u00a0\1\2\u08a3\u08a4\5\u0140\u00a1\2\u08a4\u08a9\3\2\2\2\u08a5\u08a6"+
		"\f\3\2\2\u08a6\u08a8\5\u0140\u00a1\2\u08a7\u08a5\3\2\2\2\u08a8\u08ab\3"+
		"\2\2\2\u08a9\u08a7\3\2\2\2\u08a9\u08aa\3\2\2\2\u08aa\u013f\3\2\2\2\u08ab"+
		"\u08a9\3\2\2\2\u08ac\u08ad\t\t\2\2\u08ad\u0141\3\2\2\2\u08ae\u08af\7`"+
		"\2\2\u08af\u08b0\7\u0082\2\2\u08b0\u08b1\b\u00a2\1\2\u08b1\u0143\3\2\2"+
		"\2\u08b2\u08b3\7y\2\2\u08b3\u08b4\5\u0146\u00a4\2\u08b4\u0145\3\2\2\2"+
		"\u08b5\u08b6\b\u00a4\1\2\u08b6\u08b8\5\u0148\u00a5\2\u08b7\u08b9\7~\2"+
		"\2\u08b8\u08b7\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9\u08c2\3\2\2\2\u08ba\u08bb"+
		"\f\3\2\2\u08bb\u08bc\7u\2\2\u08bc\u08be\5\u0148\u00a5\2\u08bd\u08bf\7"+
		"~\2\2\u08be\u08bd\3\2\2\2\u08be\u08bf\3\2\2\2\u08bf\u08c1\3\2\2\2\u08c0"+
		"\u08ba\3\2\2\2\u08c1\u08c4\3\2\2\2\u08c2\u08c0\3\2\2\2\u08c2\u08c3\3\2"+
		"\2\2\u08c3\u0147\3\2\2\2\u08c4\u08c2\3\2\2\2\u08c5\u08c7\5\u00dco\2\u08c6"+
		"\u08c5\3\2\2\2\u08c6\u08c7\3\2\2\2\u08c7\u08c8\3\2\2\2\u08c8\u08db\5\u014c"+
		"\u00a7\2\u08c9\u08cb\5\u00dco\2\u08ca\u08c9\3\2\2\2\u08ca\u08cb\3\2\2"+
		"\2\u08cb\u08cc\3\2\2\2\u08cc\u08ce\7K\2\2\u08cd\u08cf\5\u014e\u00a8\2"+
		"\u08ce\u08cd\3\2\2\2\u08ce\u08cf\3\2\2\2\u08cf\u08d0\3\2\2\2\u08d0\u08db"+
		"\5\u014c\u00a7\2\u08d1\u08d3\5\u00dco\2\u08d2\u08d1\3\2\2\2\u08d2\u08d3"+
		"\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08d6\5\u014e\u00a8\2\u08d5\u08d7\7"+
		"K\2\2\u08d6\u08d5\3\2\2\2\u08d6\u08d7\3\2\2\2\u08d7\u08d8\3\2\2\2\u08d8"+
		"\u08d9\5\u014c\u00a7\2\u08d9\u08db\3\2\2\2\u08da\u08c6\3\2\2\2\u08da\u08ca"+
		"\3\2\2\2\u08da\u08d2\3\2\2\2\u08db\u0149\3\2\2\2\u08dc\u08de\5\f\7\2\u08dd"+
		"\u08dc\3\2\2\2\u08dd\u08de\3\2\2\2\u08de\u08df\3\2\2\2\u08df\u08e2\5\u012a"+
		"\u0096\2\u08e0\u08e2\5\u00a8U\2\u08e1\u08dd\3\2\2\2\u08e1\u08e0\3\2\2"+
		"\2\u08e2\u014b\3\2\2\2\u08e3\u08e4\5\u014a\u00a6\2\u08e4\u014d\3\2\2\2"+
		"\u08e5\u08e6\t\n\2\2\u08e6\u014f\3\2\2\2\u08e7\u08e8\7/\2\2\u08e8\u08e9"+
		"\5\u0152\u00aa\2\u08e9\u0151\3\2\2\2\u08ea\u08ec\5\u00a0Q\2\u08eb\u08ed"+
		"\5\u0154\u00ab\2\u08ec\u08eb\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed\u0153\3"+
		"\2\2\2\u08ee\u08f0\5\u0100\u0081\2\u08ef\u08f1\5\u0154\u00ab\2\u08f0\u08ef"+
		"\3\2\2\2\u08f0\u08f1\3\2\2\2\u08f1\u0155\3\2\2\2\u08f2\u08f3\7y\2\2\u08f3"+
		"\u08f4\5\u0158\u00ad\2\u08f4\u0157\3\2\2\2\u08f5\u08f7\5\u015a\u00ae\2"+
		"\u08f6\u08f8\7~\2\2\u08f7\u08f6\3\2\2\2\u08f7\u08f8\3\2\2\2\u08f8\u0901"+
		"\3\2\2\2\u08f9\u08fb\5\u015a\u00ae\2\u08fa\u08fc\7~\2\2\u08fb\u08fa\3"+
		"\2\2\2\u08fb\u08fc\3\2\2\2\u08fc\u08fd\3\2\2\2\u08fd\u08fe\7u\2\2\u08fe"+
		"\u08ff\5\u0158\u00ad\2\u08ff\u0901\3\2\2\2\u0900\u08f5\3\2\2\2\u0900\u08f9"+
		"\3\2\2\2\u0901\u0159\3\2\2\2\u0902\u0903\5\u015c\u00af\2\u0903\u0905\7"+
		"P\2\2\u0904\u0906\5\"\22\2\u0905\u0904\3\2\2\2\u0905\u0906\3\2\2\2\u0906"+
		"\u0907\3\2\2\2\u0907\u0908\7Q\2\2\u0908\u090d\3\2\2\2\u0909\u090a\5\u015c"+
		"\u00af\2\u090a\u090b\5\u0128\u0095\2\u090b\u090d\3\2\2\2\u090c\u0902\3"+
		"\2\2\2\u090c\u0909\3\2\2\2\u090d\u015b\3\2\2\2\u090e\u0911\5\u014a\u00a6"+
		"\2\u090f\u0911\7\177\2\2\u0910\u090e\3\2\2\2\u0910\u090f\3\2\2\2\u0911"+
		"\u015d\3\2\2\2\u0912\u0913\7/\2\2\u0913\u0914\5\u0192\u00ca\2\u0914\u015f"+
		"\3\2\2\2\u0915\u0916\7/\2\2\u0916\u0917\7\u0088\2\2\u0917\u091b\7\177"+
		"\2\2\u0918\u0919\7/\2\2\u0919\u091b\7\u008b\2\2\u091a\u0915\3\2\2\2\u091a"+
		"\u0918\3\2\2\2\u091b\u0161\3\2\2\2\u091c\u091d\7?\2\2\u091d\u091e\7a\2"+
		"\2\u091e\u091f\5\u0164\u00b3\2\u091f\u0920\7b\2\2\u0920\u0921\5\u0084"+
		"C\2\u0921\u0163\3\2\2\2\u0922\u0923\b\u00b3\1\2\u0923\u0924\5\u0166\u00b4"+
		"\2\u0924\u092a\3\2\2\2\u0925\u0926\f\3\2\2\u0926\u0927\7u\2\2\u0927\u0929"+
		"\5\u0166\u00b4\2\u0928\u0925\3\2\2\2\u0929\u092c\3\2\2\2\u092a\u0928\3"+
		"\2\2\2\u092a\u092b\3\2\2\2\u092b\u0165\3\2\2\2\u092c\u092a\3\2\2\2\u092d"+
		"\u0930\5\u0168\u00b5\2\u092e\u0930\5\u011a\u008e\2\u092f\u092d\3\2\2\2"+
		"\u092f\u092e\3\2\2\2\u0930\u0167\3\2\2\2\u0931\u0933\7\20\2\2\u0932\u0934"+
		"\7~\2\2\u0933\u0932\3\2\2\2\u0933\u0934\3\2\2\2\u0934\u0936\3\2\2\2\u0935"+
		"\u0937\7\177\2\2\u0936\u0935\3\2\2\2\u0936\u0937\3\2\2\2\u0937\u0962\3"+
		"\2\2\2\u0938\u093a\7\20\2\2\u0939\u093b\7\177\2\2\u093a\u0939\3\2\2\2"+
		"\u093a\u093b\3\2\2\2\u093b\u093c\3\2\2\2\u093c\u093d\7`\2\2\u093d\u0962"+
		"\5\u010a\u0086\2\u093e\u0940\7G\2\2\u093f\u0941\7~\2\2\u0940\u093f\3\2"+
		"\2\2\u0940\u0941\3\2\2\2\u0941\u0943\3\2\2\2\u0942\u0944\7\177\2\2\u0943"+
		"\u0942\3\2\2\2\u0943\u0944\3\2\2\2\u0944\u0962\3\2\2\2\u0945\u0947\7G"+
		"\2\2\u0946\u0948\7\177\2\2\u0947\u0946\3\2\2\2\u0947\u0948\3\2\2\2\u0948"+
		"\u0949\3\2\2\2\u0949\u094a\7`\2\2\u094a\u0962\5\u010a\u0086\2\u094b\u094c"+
		"\7?\2\2\u094c\u094d\7a\2\2\u094d\u094e\5\u0164\u00b3\2\u094e\u094f\7b"+
		"\2\2\u094f\u0951\7\20\2\2\u0950\u0952\7~\2\2\u0951\u0950";
	private static final String _serializedATNSegment1 =
		"\3\2\2\2\u0951\u0952\3\2\2\2\u0952\u0954\3\2\2\2\u0953\u0955\7\177\2\2"+
		"\u0954\u0953\3\2\2\2\u0954\u0955\3\2\2\2\u0955\u0962\3\2\2\2\u0956\u0957"+
		"\7?\2\2\u0957\u0958\7a\2\2\u0958\u0959\5\u0164\u00b3\2\u0959\u095a\7b"+
		"\2\2\u095a\u095c\7\20\2\2\u095b\u095d\7\177\2\2\u095c\u095b\3\2\2\2\u095c"+
		"\u095d\3\2\2\2\u095d\u095e\3\2\2\2\u095e\u095f\7`\2\2\u095f\u0960\5\6"+
		"\4\2\u0960\u0962\3\2\2\2\u0961\u0931\3\2\2\2\u0961\u0938\3\2\2\2\u0961"+
		"\u093e\3\2\2\2\u0961\u0945\3\2\2\2\u0961\u094b\3\2\2\2\u0961\u0956\3\2"+
		"\2\2\u0962\u0169\3\2\2\2\u0963\u0964\5\u016e\u00b8\2\u0964\u0966\7a\2"+
		"\2\u0965\u0967\5\u0170\u00b9\2\u0966\u0965\3\2\2\2\u0966\u0967\3\2\2\2"+
		"\u0967\u0968\3\2\2\2\u0968\u0969\7b\2\2\u0969\u016b\3\2\2\2\u096a\u097a"+
		"\5\u016a\u00b6\2\u096b\u096c\5\u015e\u00b0\2\u096c\u096e\7a\2\2\u096d"+
		"\u096f\5\u0170\u00b9\2\u096e\u096d\3\2\2\2\u096e\u096f\3\2\2\2\u096f\u0970"+
		"\3\2\2\2\u0970\u0971\7b\2\2\u0971\u097a\3\2\2\2\u0972\u0973\5\u0160\u00b1"+
		"\2\u0973\u0975\7a\2\2\u0974\u0976\5\u0170\u00b9\2\u0975\u0974\3\2\2\2"+
		"\u0975\u0976\3\2\2\2\u0976\u0977\3\2\2\2\u0977\u0978\7b\2\2\u0978\u097a"+
		"\3\2\2\2\u0979\u096a\3\2\2\2\u0979\u096b\3\2\2\2\u0979\u0972\3\2\2\2\u097a"+
		"\u016d\3\2\2\2\u097b\u097c\7\177\2\2\u097c\u016f\3\2\2\2\u097d\u097e\b"+
		"\u00b9\1\2\u097e\u0980\5\u0172\u00ba\2\u097f\u0981\7~\2\2\u0980\u097f"+
		"\3\2\2\2\u0980\u0981\3\2\2\2\u0981\u098a\3\2\2\2\u0982\u0983\f\3\2\2\u0983"+
		"\u0984\7u\2\2\u0984\u0986\5\u0172\u00ba\2\u0985\u0987\7~\2\2\u0986\u0985"+
		"\3\2\2\2\u0986\u0987\3\2\2\2\u0987\u0989\3\2\2\2\u0988\u0982\3\2\2\2\u0989"+
		"\u098c\3\2\2\2\u098a\u0988\3\2\2\2\u098a\u098b\3\2\2\2\u098b\u0171\3\2"+
		"\2\2\u098c\u098a\3\2\2\2\u098d\u0991\5\u010a\u0086\2\u098e\u0991\5Z.\2"+
		"\u098f\u0991\5\6\4\2\u0990\u098d\3\2\2\2\u0990\u098e\3\2\2\2\u0990\u098f"+
		"\3\2\2\2\u0991\u0173\3\2\2\2\u0992\u0993\7G\2\2\u0993\u0994\5\f\7\2\u0994"+
		"\u0995\7\177\2\2\u0995\u099e\3\2\2\2\u0996\u0997\7G\2\2\u0997\u0999\5"+
		"\f\7\2\u0998\u099a\7?\2\2\u0999\u0998\3\2\2\2\u0999\u099a\3\2\2\2\u099a"+
		"\u099b\3\2\2\2\u099b\u099c\5\u016a\u00b6\2\u099c\u099e\3\2\2\2\u099d\u0992"+
		"\3\2\2\2\u099d\u0996\3\2\2\2\u099e\u0175\3\2\2\2\u099f\u09a1\7\37\2\2"+
		"\u09a0\u099f\3\2\2\2\u09a0\u09a1\3\2\2\2\u09a1\u09a2\3\2\2\2\u09a2\u09a3"+
		"\7?\2\2\u09a3\u09a4\5\u0084C\2\u09a4\u0177\3\2\2\2\u09a5\u09a6\7?\2\2"+
		"\u09a6\u09a7\7a\2\2\u09a7\u09a8\7b\2\2\u09a8\u09a9\5\u0084C\2\u09a9\u0179"+
		"\3\2\2\2\u09aa\u09ab\7D\2\2\u09ab\u09ac\5d\63\2\u09ac\u09ad\5\u017e\u00c0"+
		"\2\u09ad\u017b\3\2\2\2\u09ae\u09b0\7D\2\2\u09af\u09b1\5\u0156\u00ac\2"+
		"\u09b0\u09af\3\2\2\2\u09b0\u09b1\3\2\2\2\u09b1\u09b2\3\2\2\2\u09b2\u09b3"+
		"\5d\63\2\u09b3\u09b4\5\u017e\u00c0\2\u09b4\u017d\3\2\2\2\u09b5\u09b7\5"+
		"\u0180\u00c1\2\u09b6\u09b8\5\u017e\u00c0\2\u09b7\u09b6\3\2\2\2\u09b7\u09b8"+
		"\3\2\2\2\u09b8\u017f\3\2\2\2\u09b9\u09ba\7\f\2\2\u09ba\u09bb\7P\2\2\u09bb"+
		"\u09bc\5\u0182\u00c2\2\u09bc\u09bd\7Q\2\2\u09bd\u09be\5d\63\2\u09be\u0181"+
		"\3\2\2\2\u09bf\u09c1\5\u00dco\2\u09c0\u09bf\3\2\2\2\u09c0\u09c1\3\2\2"+
		"\2\u09c1\u09c2\3\2\2\2\u09c2\u09c3\5\u00a0Q\2\u09c3\u09c4\5\u00f6|\2\u09c4"+
		"\u09ce\3\2\2\2\u09c5\u09c7\5\u00dco\2\u09c6\u09c5\3\2\2\2\u09c6\u09c7"+
		"\3\2\2\2\u09c7\u09c8\3\2\2\2\u09c8\u09ca\5\u00a0Q\2\u09c9\u09cb\5\u010c"+
		"\u0087\2\u09ca\u09c9\3\2\2\2\u09ca\u09cb\3\2\2\2\u09cb\u09ce\3\2\2\2\u09cc"+
		"\u09ce\7~\2\2\u09cd\u09c0\3\2\2\2\u09cd\u09c6\3\2\2\2\u09cd\u09cc\3\2"+
		"\2\2\u09ce\u0183\3\2\2\2\u09cf\u09d1\7B\2\2\u09d0\u09d2\5T+\2\u09d1\u09d0"+
		"\3\2\2\2\u09d1\u09d2\3\2\2\2\u09d2\u0185\3\2\2\2\u09d3\u09d6\5\u0188\u00c5"+
		"\2\u09d4\u09d6\5\u018c\u00c7\2\u09d5\u09d3\3\2\2\2\u09d5\u09d4\3\2\2\2"+
		"\u09d6\u0187\3\2\2\2\u09d7\u09d8\7B\2\2\u09d8\u09da\7P\2\2\u09d9\u09db"+
		"\5\u018a\u00c6\2\u09da\u09d9\3\2\2\2\u09da\u09db\3\2\2\2\u09db\u09dc\3"+
		"\2\2\2\u09dc\u09dd\7Q\2\2\u09dd\u0189\3\2\2\2\u09de\u09df\b\u00c6\1\2"+
		"\u09df\u09e1\5\u010a\u0086\2\u09e0\u09e2\7~\2\2\u09e1\u09e0\3\2\2\2\u09e1"+
		"\u09e2\3\2\2\2\u09e2\u09eb\3\2\2\2\u09e3\u09e4\f\3\2\2\u09e4\u09e5\7u"+
		"\2\2\u09e5\u09e7\5\u010a\u0086\2\u09e6\u09e8\7~\2\2\u09e7\u09e6\3\2\2"+
		"\2\u09e7\u09e8\3\2\2\2\u09e8\u09ea\3\2\2\2\u09e9\u09e3\3\2\2\2\u09ea\u09ed"+
		"\3\2\2\2\u09eb\u09e9\3\2\2\2\u09eb\u09ec\3\2\2\2\u09ec\u018b\3\2\2\2\u09ed"+
		"\u09eb\3\2\2\2\u09ee\u09ef\7-\2\2\u09ef\u09f0\7P\2\2\u09f0\u09f1\5Z.\2"+
		"\u09f1\u09f2\7Q\2\2\u09f2\u09f5\3\2\2\2\u09f3\u09f5\7-\2\2\u09f4\u09ee"+
		"\3\2\2\2\u09f4\u09f3\3\2\2\2\u09f5\u018d\3\2\2\2\u09f6\u09f7\7b\2\2\u09f7"+
		"\u09f8\7b\2\2\u09f8\u018f\3\2\2\2\u09f9\u09fa\7b\2\2\u09fa\u09fb\7b\2"+
		"\2\u09fb\u09fc\7`\2\2\u09fc\u0191\3\2\2\2\u09fd\u0a2e\7,\2\2\u09fe\u0a2e"+
		"\7\27\2\2\u09ff\u0a00\7,\2\2\u0a00\u0a01\7R\2\2\u0a01\u0a2e\7S\2\2\u0a02"+
		"\u0a03\7\27\2\2\u0a03\u0a04\7R\2\2\u0a04\u0a2e\7S\2\2\u0a05\u0a2e\7V\2"+
		"\2\u0a06\u0a2e\7W\2\2\u0a07\u0a2e\7X\2\2\u0a08\u0a2e\7Y\2\2\u0a09\u0a2e"+
		"\7Z\2\2\u0a0a\u0a2e\7[\2\2\u0a0b\u0a2e\7\\\2\2\u0a0c\u0a2e\7]\2\2\u0a0d"+
		"\u0a2e\7^\2\2\u0a0e\u0a2e\7_\2\2\u0a0f\u0a2e\7`\2\2\u0a10\u0a2e\7a\2\2"+
		"\u0a11\u0a2e\7b\2\2\u0a12\u0a2e\7c\2\2\u0a13\u0a2e\7d\2\2\u0a14\u0a2e"+
		"\7e\2\2\u0a15\u0a2e\7f\2\2\u0a16\u0a2e\7g\2\2\u0a17\u0a2e\7h\2\2\u0a18"+
		"\u0a2e\7i\2\2\u0a19\u0a2e\7j\2\2\u0a1a\u0a2e\7k\2\2\u0a1b\u0a2e\5\u018e"+
		"\u00c8\2\u0a1c\u0a2e\5\u0190\u00c9\2\u0a1d\u0a2e\7l\2\2\u0a1e\u0a2e\7"+
		"m\2\2\u0a1f\u0a2e\7n\2\2\u0a20\u0a2e\7o\2\2\u0a21\u0a2e\7p\2\2\u0a22\u0a2e"+
		"\7q\2\2\u0a23\u0a2e\7r\2\2\u0a24\u0a2e\7s\2\2\u0a25\u0a2e\7t\2\2\u0a26"+
		"\u0a2e\7u\2\2\u0a27\u0a2e\7v\2\2\u0a28\u0a2e\7w\2\2\u0a29\u0a2a\7P\2\2"+
		"\u0a2a\u0a2e\7Q\2\2\u0a2b\u0a2c\7R\2\2\u0a2c\u0a2e\7S\2\2\u0a2d\u09fd"+
		"\3\2\2\2\u0a2d\u09fe\3\2\2\2\u0a2d\u09ff\3\2\2\2\u0a2d\u0a02\3\2\2\2\u0a2d"+
		"\u0a05\3\2\2\2\u0a2d\u0a06\3\2\2\2\u0a2d\u0a07\3\2\2\2\u0a2d\u0a08\3\2"+
		"\2\2\u0a2d\u0a09\3\2\2\2\u0a2d\u0a0a\3\2\2\2\u0a2d\u0a0b\3\2\2\2\u0a2d"+
		"\u0a0c\3\2\2\2\u0a2d\u0a0d\3\2\2\2\u0a2d\u0a0e\3\2\2\2\u0a2d\u0a0f\3\2"+
		"\2\2\u0a2d\u0a10\3\2\2\2\u0a2d\u0a11\3\2\2\2\u0a2d\u0a12\3\2\2\2\u0a2d"+
		"\u0a13\3\2\2\2\u0a2d\u0a14\3\2\2\2\u0a2d\u0a15\3\2\2\2\u0a2d\u0a16\3\2"+
		"\2\2\u0a2d\u0a17\3\2\2\2\u0a2d\u0a18\3\2\2\2\u0a2d\u0a19\3\2\2\2\u0a2d"+
		"\u0a1a\3\2\2\2\u0a2d\u0a1b\3\2\2\2\u0a2d\u0a1c\3\2\2\2\u0a2d\u0a1d\3\2"+
		"\2\2\u0a2d\u0a1e\3\2\2\2\u0a2d\u0a1f\3\2\2\2\u0a2d\u0a20\3\2\2\2\u0a2d"+
		"\u0a21\3\2\2\2\u0a2d\u0a22\3\2\2\2\u0a2d\u0a23\3\2\2\2\u0a2d\u0a24\3\2"+
		"\2\2\u0a2d\u0a25\3\2\2\2\u0a2d\u0a26\3\2\2\2\u0a2d\u0a27\3\2\2\2\u0a2d"+
		"\u0a28\3\2\2\2\u0a2d\u0a29\3\2\2\2\u0a2d\u0a2b\3\2\2\2\u0a2e\u0193\3\2"+
		"\2\2\u0a2f\u0a37\7\u0080\2\2\u0a30\u0a37\7\u0086\2\2\u0a31\u0a37\7\u0087"+
		"\2\2\u0a32\u0a37\7\u0088\2\2\u0a33\u0a37\5\u0196\u00cc\2\u0a34\u0a37\5"+
		"\u0198\u00cd\2\u0a35\u0a37\5\u019a\u00ce\2\u0a36\u0a2f\3\2\2\2\u0a36\u0a30"+
		"\3\2\2\2\u0a36\u0a31\3\2\2\2\u0a36\u0a32\3\2\2\2\u0a36\u0a33\3\2\2\2\u0a36"+
		"\u0a34\3\2\2\2\u0a36\u0a35\3\2\2\2\u0a37\u0195\3\2\2\2\u0a38\u0a39\t\13"+
		"\2\2\u0a39\u0197\3\2\2\2\u0a3a\u0a3b\7.\2\2\u0a3b\u0199\3\2\2\2\u0a3c"+
		"\u0a3d\t\f\2\2\u0a3d\u019b\3\2\2\2\u0160\u019d\u01a9\u01ad\u01b8\u01bc"+
		"\u01cb\u01d2\u01d7\u01d9\u01de\u01e4\u01ee\u01f5\u01fb\u01ff\u0204\u020a"+
		"\u0211\u0217\u021a\u021d\u0220\u0227\u022e\u0262\u0271\u0277\u027d\u028a"+
		"\u028c\u0292\u02a1\u02a7\u02c5\u02ca\u02ce\u02d2\u02d5\u02d9\u02df\u02e1"+
		"\u02e9\u02ed\u02f0\u02f7\u02fe\u0302\u0307\u030b\u030e\u0313\u0319\u0326"+
		"\u0331\u0333\u0342\u0344\u0350\u0352\u035f\u0361\u0373\u0375\u0381\u0383"+
		"\u038e\u0399\u03a4\u03af\u03ba\u03c4\u03cc\u03d9\u03e3\u03ea\u03ee\u03f2"+
		"\u03f6\u03fa\u03ff\u0402\u0405\u040c\u0411\u0414\u041c\u0422\u042d\u0444"+
		"\u0448\u044c\u0450\u0454\u0458\u045d\u0460\u0464\u0468\u046c\u0470\u0474"+
		"\u0479\u047c\u0480\u0484\u0488\u048c\u0490\u0495\u0498\u049c\u04a4\u04aa"+
		"\u04be\u04c2\u04cf\u04d3\u04d7\u04db\u04df\u04e3\u04e8\u04eb\u04ef\u04f3"+
		"\u04f7\u04fb\u04ff\u0504\u0507\u050b\u050e\u0515\u051d\u0527\u0532\u053e"+
		"\u0548\u054d\u0554\u0557\u055c\u0561\u0576\u057a\u057f\u058a\u0590\u0594"+
		"\u0599\u059d\u05a2\u05a5\u05bb\u05c1\u05cc\u05d0\u05d3\u05dd\u05e3\u05e6"+
		"\u05ed\u05f7\u05fb\u05fe\u0601\u0605\u060a\u060c\u0610\u0614\u061d\u062a"+
		"\u0632\u0638\u063e\u0642\u0645\u064e\u0657\u065f\u066a\u0670\u067b\u067e"+
		"\u0683\u0692\u0698\u06a1\u06ab\u06b1\u06b9\u06bd\u06c1\u06c6\u06cb\u06d2"+
		"\u06d4\u06d9\u06dd\u06eb\u06f1\u0700\u070a\u070f\u0716\u071c\u0721\u0727"+
		"\u072e\u0732\u0734\u0736\u073d\u0740\u0743\u0746\u074b\u074f\u0752\u0756"+
		"\u075a\u075f\u0762\u0764\u0768\u076f\u0775\u0779\u077f\u0784\u0786\u078c"+
		"\u0790\u0796\u079d\u07a1\u07a3\u07a5\u07ac\u07b6\u07ba\u07bc\u07be\u07c2"+
		"\u07c5\u07cb\u07d5\u07d9\u07df\u07e7\u07eb\u07ee\u07f2\u07f7\u07fa\u07fd"+
		"\u0801\u0806\u0810\u0817\u081c\u0820\u0825\u082b\u082f\u0835\u083b\u083f"+
		"\u0844\u084a\u084e\u0851\u0855\u0858\u085a\u085d\u0867\u086c\u086e\u0871"+
		"\u0874\u0877\u0880\u088a\u088f\u0892\u0896\u0899\u089c\u08a0\u08a9\u08b8"+
		"\u08be\u08c2\u08c6\u08ca\u08ce\u08d2\u08d6\u08da\u08dd\u08e1\u08ec\u08f0"+
		"\u08f7\u08fb\u0900\u0905\u090c\u0910\u091a\u092a\u092f\u0933\u0936\u093a"+
		"\u0940\u0943\u0947\u0951\u0954\u095c\u0961\u0966\u096e\u0975\u0979\u0980"+
		"\u0986\u098a\u0990\u0999\u099d\u09a0\u09b0\u09b7\u09c0\u09c6\u09ca\u09cd"+
		"\u09d1\u09d5\u09da\u09e1\u09e7\u09eb\u09f4\u0a2d\u0a36";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}