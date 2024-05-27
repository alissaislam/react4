// Generated from D:/Intellgi/react4/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReactParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DoubleQuote=1, SingleQuote=2, Break=3, Do=4, Instanceof=5, Typeof=6, Case=7, 
		Else=8, New=9, Var=10, Catch=11, Finally=12, Return=13, Void=14, Continue=15, 
		For=16, Switch=17, While=18, Debugger=19, Function_=20, This=21, With=22, 
		Default=23, If=24, Throw=25, Delete=26, In=27, Try=28, As=29, From=30, 
		Class=31, Enum=32, Extends=33, Super=34, Const=35, Export=36, Import=37, 
		Async=38, Await=39, IgSemiColon=40, OpenBracket=41, CloseBracket=42, OpenParen=43, 
		CloseParen=44, OpenBrace=45, CloseBrace=46, SemiColon=47, Comma=48, Assign=49, 
		QuestionMark=50, Colon=51, Ellipsis=52, Dot=53, PlusPlus=54, MinusMinus=55, 
		Plus=56, Minus=57, BitNot=58, Not=59, Multiply=60, Divide=61, Modulus=62, 
		Power=63, NullCoalesce=64, Hashtag=65, RightShiftArithmetic=66, LeftShiftArithmetic=67, 
		RightShiftLogical=68, LessThan=69, MoreThan=70, LessThanEquals=71, GreaterThanEquals=72, 
		Equals_=73, NotEquals=74, IdentityEquals=75, IdentityNotEquals=76, BitAnd=77, 
		BitXOr=78, BitOr=79, And=80, Or=81, MultiplyAssign=82, DivideAssign=83, 
		ModulusAssign=84, PlusAssign=85, MinusAssign=86, LeftShiftArithmeticAssign=87, 
		RightShiftArithmeticAssign=88, RightShiftLogicalAssign=89, BitAndAssign=90, 
		BitXorAssign=91, BitOrAssign=92, PowerAssign=93, ARROW=94, UseState=95, 
		UseEffect=96, UseRef=97, UseMemo=98, NullLiteral=99, BooleanLiteral=100, 
		Implements=101, Let=102, Private=103, Public=104, Interface=105, Package=106, 
		Protected=107, Static=108, Yield=109, IDENTIFIER=110, JSX_TAG=111, WS=112, 
		NEWLINE=113, SINGLE_LINE_COMMENT=114, MULTI_LINE_COMMENT=115, NUMBER=116, 
		String=117, StringDQ=118, CLOSE_TAG=119, Self_CLOSE_TAG=120, MoreThanIn=121, 
		LessThanIn=122, JSX_TAGIn=123, WS_INSIDE=124, NewIn=125, StringIn=126, 
		CloseBraceIn=127, OpenBraceIn=128, IDENTIFIERIn=129, AssignIn=130, CommaIn=131, 
		OpenParenIn=132, CloseParenIn=133, ARROWIn=134, DotIn=135, MultiplyIn=136, 
		DivideIn=137, PlusIn=138, MinusIn=139, NUMBERIn=140, BooleanLiteralIn=141, 
		CLOSE_TAGIn=142, MoreThanInIn=143, JSX_TAGInIn=144, WS_INSIDEIN=145, NewInIN=146, 
		OpenBraceInIn=147, LETTERR=148, Id=149, JSX_TAGModeCall=150, CloseBraceCall=151, 
		NullLiteralModeCall=152, StringModeCall=153, CloseBraceModeCall=154, OpenBraceModeCall=155, 
		AssignModeCall=156, CommaModeCall=157, OpenParenModeCall=158, CloseParenModeCall=159, 
		ARROWModeCall=160, DotModeCall=161, MultiplyModeCall=162, DivideModeCall=163, 
		PlusModeCall=164, MinusModeCall=165, NUMBERModeCall=166, BooleanLiteralModeCall=167, 
		MoreThanModeCall=168, LessThanModeCall=169, QuestionMarkModeCall=170, 
		ColonModeCall=171, ReturnModeCall=172, Equals_ModeCall=173, IdentityNotEqualsModeCall=174, 
		IdentityEqualsModeCall=175, NotEqualsModeCall=176, LessThanEqualsModeCall=177, 
		GreaterThanEqualsModeCall=178, IgSemiColonModeCall=179, SemiColonModeCall=180, 
		PlussPlussModeCall=181, MinusMinusModeCall=182, WS_INSIDECall=183, NewInCall=184;
	public static final int
		RULE_start = 0, RULE_statment = 1, RULE_statmentElement = 2, RULE_if = 3, 
		RULE_forElement = 4, RULE_function = 5, RULE_comments = 6, RULE_while = 7, 
		RULE_do_while = 8, RULE_callfunction = 9, RULE_switch = 10, RULE_tryCatch = 11, 
		RULE_importt = 12, RULE_ifShort = 13, RULE_jsxElement = 14, RULE_jsxElementNonSelfClosing = 15, 
		RULE_jsxElementSelfClosing = 16, RULE_jsxElementIn = 17, RULE_blockIn = 18, 
		RULE_attribute = 19, RULE_jsxArguments = 20, RULE_jsxParameters = 21, 
		RULE_jsxArrowFunction = 22, RULE_jsxCallfunction = 23, RULE_jsxSimpleCallfunction = 24, 
		RULE_jsxArgument = 25, RULE_jsxExpression = 26, RULE_jsxCallIdentifier = 27, 
		RULE_jsxBlock = 28, RULE_block = 29, RULE_else_if = 30, RULE_else = 31, 
		RULE_forLoopParts = 32, RULE_conditions = 33, RULE_arguments = 34, RULE_blockOfarguments = 35, 
		RULE_variableDeclaration = 36, RULE_variableDeclarationList = 37, RULE_arrowFunction = 38, 
		RULE_returnstatment = 39, RULE_simpleCallfunction = 40, RULE_argument = 41, 
		RULE_hooks = 42, RULE_hook = 43, RULE_useState = 44, RULE_useEffect = 45, 
		RULE_useRef = 46, RULE_useMemo = 47, RULE_parameters = 48, RULE_callIdentifier = 49, 
		RULE_expression = 50, RULE_export = 51, RULE_data = 52, RULE_array = 53, 
		RULE_map = 54, RULE_mapElementList = 55, RULE_mapElement = 56, RULE_suquence = 57, 
		RULE_kind = 58, RULE_operation = 59, RULE_id = 60, RULE_openParen = 61, 
		RULE_closeParen = 62, RULE_assign = 63, RULE_closeBrace = 64, RULE_openBrace = 65, 
		RULE_jsx_tag = 66, RULE_break = 67;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statment", "statmentElement", "if", "forElement", "function", 
			"comments", "while", "do_while", "callfunction", "switch", "tryCatch", 
			"importt", "ifShort", "jsxElement", "jsxElementNonSelfClosing", "jsxElementSelfClosing", 
			"jsxElementIn", "blockIn", "attribute", "jsxArguments", "jsxParameters", 
			"jsxArrowFunction", "jsxCallfunction", "jsxSimpleCallfunction", "jsxArgument", 
			"jsxExpression", "jsxCallIdentifier", "jsxBlock", "block", "else_if", 
			"else", "forLoopParts", "conditions", "arguments", "blockOfarguments", 
			"variableDeclaration", "variableDeclarationList", "arrowFunction", "returnstatment", 
			"simpleCallfunction", "argument", "hooks", "hook", "useState", "useEffect", 
			"useRef", "useMemo", "parameters", "callIdentifier", "expression", "export", 
			"data", "array", "map", "mapElementList", "mapElement", "suquence", "kind", 
			"operation", "id", "openParen", "closeParen", "assign", "closeBrace", 
			"openBrace", "jsx_tag", "break"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'''", "'break'", "'do'", "'instanceof'", "'typeof'", "'case'", 
			"'else'", "'new'", "'var'", "'catch'", "'finally'", "'return'", "'void'", 
			"'continue'", "'for'", "'switch'", "'while'", "'debugger'", "'function'", 
			"'this'", "'with'", "'default'", "'if'", "'throw'", "'delete'", "'in'", 
			"'try'", "'as'", "'from'", "'class'", "'enum'", "'extends'", "'super'", 
			"'const'", "'export'", "'import'", "'async'", "'await'", "';;'", "'['", 
			"']'", "'('", "')'", "'{'", "'}'", "';'", "','", "'='", null, null, "'...'", 
			null, "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", 
			"'**'", "'??'", "'#'", "'>>'", "'<<'", "'>>>'", null, null, "'<='", "'>='", 
			null, "'!='", "'==='", "'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", 
			"'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", 
			"'^='", "'|='", "'**='", "'=>'", "'useState'", "'useEffect'", "'useRef'", 
			"'useMemo'", "'null'", null, "'implements'", "'let'", "'private'", "'public'", 
			"'interface'", "'package'", "'protected'", "'static'", "'yield'", null, 
			null, null, null, null, null, null, null, null, null, "'/>'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'?'", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DoubleQuote", "SingleQuote", "Break", "Do", "Instanceof", "Typeof", 
			"Case", "Else", "New", "Var", "Catch", "Finally", "Return", "Void", "Continue", 
			"For", "Switch", "While", "Debugger", "Function_", "This", "With", "Default", 
			"If", "Throw", "Delete", "In", "Try", "As", "From", "Class", "Enum", 
			"Extends", "Super", "Const", "Export", "Import", "Async", "Await", "IgSemiColon", 
			"OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
			"CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", "Colon", 
			"Ellipsis", "Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", 
			"Not", "Multiply", "Divide", "Modulus", "Power", "NullCoalesce", "Hashtag", 
			"RightShiftArithmetic", "LeftShiftArithmetic", "RightShiftLogical", "LessThan", 
			"MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals_", "NotEquals", 
			"IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", "BitOr", "And", 
			"Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", "PlusAssign", 
			"MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
			"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
			"PowerAssign", "ARROW", "UseState", "UseEffect", "UseRef", "UseMemo", 
			"NullLiteral", "BooleanLiteral", "Implements", "Let", "Private", "Public", 
			"Interface", "Package", "Protected", "Static", "Yield", "IDENTIFIER", 
			"JSX_TAG", "WS", "NEWLINE", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", 
			"NUMBER", "String", "StringDQ", "CLOSE_TAG", "Self_CLOSE_TAG", "MoreThanIn", 
			"LessThanIn", "JSX_TAGIn", "WS_INSIDE", "NewIn", "StringIn", "CloseBraceIn", 
			"OpenBraceIn", "IDENTIFIERIn", "AssignIn", "CommaIn", "OpenParenIn", 
			"CloseParenIn", "ARROWIn", "DotIn", "MultiplyIn", "DivideIn", "PlusIn", 
			"MinusIn", "NUMBERIn", "BooleanLiteralIn", "CLOSE_TAGIn", "MoreThanInIn", 
			"JSX_TAGInIn", "WS_INSIDEIN", "NewInIN", "OpenBraceInIn", "LETTERR", 
			"Id", "JSX_TAGModeCall", "CloseBraceCall", "NullLiteralModeCall", "StringModeCall", 
			"CloseBraceModeCall", "OpenBraceModeCall", "AssignModeCall", "CommaModeCall", 
			"OpenParenModeCall", "CloseParenModeCall", "ARROWModeCall", "DotModeCall", 
			"MultiplyModeCall", "DivideModeCall", "PlusModeCall", "MinusModeCall", 
			"NUMBERModeCall", "BooleanLiteralModeCall", "MoreThanModeCall", "LessThanModeCall", 
			"QuestionMarkModeCall", "ColonModeCall", "ReturnModeCall", "Equals_ModeCall", 
			"IdentityNotEqualsModeCall", "IdentityEqualsModeCall", "NotEqualsModeCall", 
			"LessThanEqualsModeCall", "GreaterThanEqualsModeCall", "IgSemiColonModeCall", 
			"SemiColonModeCall", "PlussPlussModeCall", "MinusMinusModeCall", "WS_INSIDECall", 
			"NewInCall"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "ReactParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReactParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ReactParser.EOF, 0); }
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 46695171163160L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 298944017998269445L) != 0) || _la==NUMBERModeCall || _la==BooleanLiteralModeCall) {
				{
				{
				setState(136);
				statment();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatmentContext extends ParserRuleContext {
		public StatmentElementContext statmentElement() {
			return getRuleContext(StatmentElementContext.class,0);
		}
		public List<TerminalNode> SemiColon() { return getTokens(ReactParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(ReactParser.SemiColon, i);
		}
		public List<TerminalNode> IgSemiColon() { return getTokens(ReactParser.IgSemiColon); }
		public TerminalNode IgSemiColon(int i) {
			return getToken(ReactParser.IgSemiColon, i);
		}
		public StatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentContext statment() throws RecognitionException {
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			statmentElement();
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					match(SemiColon);
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					match(IgSemiColon);
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatmentElementContext extends ParserRuleContext {
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public HooksContext hooks() {
			return getRuleContext(HooksContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ForElementContext forElement() {
			return getRuleContext(ForElementContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public CallfunctionContext callfunction() {
			return getRuleContext(CallfunctionContext.class,0);
		}
		public SwitchContext switch_() {
			return getRuleContext(SwitchContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BreakContext break_() {
			return getRuleContext(BreakContext.class,0);
		}
		public TryCatchContext tryCatch() {
			return getRuleContext(TryCatchContext.class,0);
		}
		public ImporttContext importt() {
			return getRuleContext(ImporttContext.class,0);
		}
		public IfShortContext ifShort() {
			return getRuleContext(IfShortContext.class,0);
		}
		public SuquenceContext suquence() {
			return getRuleContext(SuquenceContext.class,0);
		}
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public StatmentElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statmentElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStatmentElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStatmentElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStatmentElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentElementContext statmentElement() throws RecognitionException {
		StatmentElementContext _localctx = new StatmentElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statmentElement);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				variableDeclarationList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				hooks();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				if_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				forElement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				function();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				comments();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(163);
				while_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(164);
				do_while();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(165);
				callfunction();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(166);
				switch_();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(167);
				block();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(168);
				break_();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(169);
				tryCatch();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(170);
				importt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(171);
				ifShort();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(172);
				suquence();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(173);
				export();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(174);
				jsxElement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(175);
				expression(0);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(176);
				arrowFunction();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(ReactParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public List<Else_ifContext> else_if() {
			return getRuleContexts(Else_ifContext.class);
		}
		public Else_ifContext else_if(int i) {
			return getRuleContext(Else_ifContext.class,i);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(If);
			setState(180);
			match(OpenParen);
			setState(181);
			conditions();
			setState(182);
			match(CloseParen);
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(183);
				block();
				}
				break;
			case 2:
				{
				setState(184);
				statment();
				}
				break;
			}
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(187);
					else_if();
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(193);
				else_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForElementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(ReactParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ForLoopPartsContext forLoopParts() {
			return getRuleContext(ForLoopPartsContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public ForElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterForElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitForElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitForElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForElementContext forElement() throws RecognitionException {
		ForElementContext _localctx = new ForElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(For);
			setState(197);
			match(OpenParen);
			setState(198);
			forLoopParts();
			setState(199);
			match(CloseParen);
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(200);
				block();
				}
				break;
			case 2:
				{
				setState(201);
				statment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public TerminalNode Function_() { return getToken(ReactParser.Function_, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public List<ReturnstatmentContext> returnstatment() {
			return getRuleContexts(ReturnstatmentContext.class);
		}
		public ReturnstatmentContext returnstatment(int i) {
			return getRuleContext(ReturnstatmentContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Function_) {
				{
				setState(204);
				match(Function_);
				}
			}

			setState(207);
			id();
			setState(208);
			match(OpenParen);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & 6917529027641082025L) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 216468000986366145L) != 0)) {
				{
				setState(209);
				arguments();
				}
			}

			setState(212);
			match(CloseParen);
			setState(213);
			match(OpenBrace);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 46695171171352L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 298944017998269445L) != 0) || _la==NUMBERModeCall || _la==BooleanLiteralModeCall) {
				{
				setState(216);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Break:
				case Do:
				case Var:
				case For:
				case Switch:
				case While:
				case Function_:
				case If:
				case Try:
				case Const:
				case Export:
				case Import:
				case Async:
				case OpenBracket:
				case OpenParen:
				case OpenBrace:
				case BooleanLiteral:
				case Let:
				case IDENTIFIER:
				case JSX_TAG:
				case SINGLE_LINE_COMMENT:
				case MULTI_LINE_COMMENT:
				case NUMBER:
				case String:
				case JSX_TAGIn:
				case IDENTIFIERIn:
				case JSX_TAGInIn:
				case Id:
				case JSX_TAGModeCall:
				case StringModeCall:
				case OpenParenModeCall:
				case NUMBERModeCall:
				case BooleanLiteralModeCall:
					{
					setState(214);
					statment();
					}
					break;
				case Return:
					{
					setState(215);
					returnstatment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CommentsContext extends ParserRuleContext {
		public TerminalNode SINGLE_LINE_COMMENT() { return getToken(ReactParser.SINGLE_LINE_COMMENT, 0); }
		public TerminalNode MULTI_LINE_COMMENT() { return getToken(ReactParser.MULTI_LINE_COMMENT, 0); }
		public CommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterComments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitComments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitComments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentsContext comments() throws RecognitionException {
		CommentsContext _localctx = new CommentsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_LINE_COMMENT || _la==MULTI_LINE_COMMENT) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(ReactParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(While);
			setState(226);
			match(OpenParen);
			setState(227);
			conditions();
			setState(228);
			match(CloseParen);
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(229);
				block();
				}
				break;
			case 2:
				{
				setState(230);
				statment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Do_whileContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(ReactParser.Do, 0); }
		public TerminalNode While() { return getToken(ReactParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(Do);
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(234);
				block();
				}
				break;
			case 2:
				{
				setState(235);
				statment();
				}
				break;
			}
			setState(238);
			match(While);
			setState(239);
			match(OpenParen);
			setState(240);
			conditions();
			setState(241);
			match(CloseParen);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallfunctionContext extends ParserRuleContext {
		public List<SimpleCallfunctionContext> simpleCallfunction() {
			return getRuleContexts(SimpleCallfunctionContext.class);
		}
		public SimpleCallfunctionContext simpleCallfunction(int i) {
			return getRuleContext(SimpleCallfunctionContext.class,i);
		}
		public List<CallIdentifierContext> callIdentifier() {
			return getRuleContexts(CallIdentifierContext.class);
		}
		public CallIdentifierContext callIdentifier(int i) {
			return getRuleContext(CallIdentifierContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(ReactParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(ReactParser.Dot, i);
		}
		public List<TerminalNode> DotModeCall() { return getTokens(ReactParser.DotModeCall); }
		public TerminalNode DotModeCall(int i) {
			return getToken(ReactParser.DotModeCall, i);
		}
		public CallfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCallfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCallfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCallfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallfunctionContext callfunction() throws RecognitionException {
		CallfunctionContext _localctx = new CallfunctionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_callfunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(243);
				simpleCallfunction();
				}
				break;
			case 2:
				{
				setState(244);
				callIdentifier();
				}
				break;
			}
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(247);
					_la = _input.LA(1);
					if ( !(_la==Dot || _la==DotModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(250);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(248);
						simpleCallfunction();
						}
						break;
					case 2:
						{
						setState(249);
						callIdentifier();
						}
						break;
					}
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(257);
				simpleCallfunction();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(ReactParser.Switch, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<TerminalNode> Case() { return getTokens(ReactParser.Case); }
		public TerminalNode Case(int i) {
			return getToken(ReactParser.Case, i);
		}
		public List<TerminalNode> Colon() { return getTokens(ReactParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(ReactParser.Colon, i);
		}
		public TerminalNode Default() { return getToken(ReactParser.Default, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public SwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchContext switch_() throws RecognitionException {
		SwitchContext _localctx = new SwitchContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(Switch);
			setState(261);
			match(OpenParen);
			setState(262);
			expression(0);
			setState(263);
			match(CloseParen);
			setState(264);
			match(OpenBrace);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Case) {
				{
				{
				setState(265);
				match(Case);
				setState(266);
				expression(0);
				setState(267);
				match(Colon);
				setState(275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(268);
					block();
					}
					break;
				case 2:
					{
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 46695171163160L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 298944017998269445L) != 0) || _la==NUMBERModeCall || _la==BooleanLiteralModeCall) {
						{
						{
						setState(269);
						statment();
						}
						}
						setState(274);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(282);
				match(Default);
				setState(283);
				match(Colon);
				setState(291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(284);
					block();
					}
					break;
				case 2:
					{
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 46695171163160L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 298944017998269445L) != 0) || _la==NUMBERModeCall || _la==BooleanLiteralModeCall) {
						{
						{
						setState(285);
						statment();
						}
						}
						setState(290);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
			}

			setState(295);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TryCatchContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(ReactParser.Try, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> Catch() { return getTokens(ReactParser.Catch); }
		public TerminalNode Catch(int i) {
			return getToken(ReactParser.Catch, i);
		}
		public List<TerminalNode> OpenParen() { return getTokens(ReactParser.OpenParen); }
		public TerminalNode OpenParen(int i) {
			return getToken(ReactParser.OpenParen, i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> CloseParen() { return getTokens(ReactParser.CloseParen); }
		public TerminalNode CloseParen(int i) {
			return getToken(ReactParser.CloseParen, i);
		}
		public TerminalNode Finally() { return getToken(ReactParser.Finally, 0); }
		public TryCatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTryCatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTryCatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitTryCatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchContext tryCatch() throws RecognitionException {
		TryCatchContext _localctx = new TryCatchContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tryCatch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(Try);
			setState(298);
			block();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Catch) {
				{
				{
				setState(299);
				match(Catch);
				setState(300);
				match(OpenParen);
				setState(302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(301);
					id();
					}
					break;
				}
				setState(304);
				id();
				setState(305);
				match(CloseParen);
				setState(306);
				block();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Finally) {
				{
				setState(313);
				match(Finally);
				setState(314);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImporttContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(ReactParser.Import, 0); }
		public TerminalNode String() { return getToken(ReactParser.String, 0); }
		public TerminalNode From() { return getToken(ReactParser.From, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<HookContext> hook() {
			return getRuleContexts(HookContext.class);
		}
		public HookContext hook(int i) {
			return getRuleContext(HookContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public ImporttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImporttContext importt() throws RecognitionException {
		ImporttContext _localctx = new ImporttContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_importt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(Import);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBrace || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 18014415689383951L) != 0)) {
				{
				setState(339);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBrace:
					{
					setState(318);
					match(OpenBrace);
					setState(321);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
					case IDENTIFIERIn:
					case Id:
						{
						setState(319);
						id();
						}
						break;
					case UseState:
					case UseEffect:
					case UseRef:
					case UseMemo:
						{
						setState(320);
						hook();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(323);
						match(Comma);
						setState(326);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case IDENTIFIER:
						case IDENTIFIERIn:
						case Id:
							{
							setState(324);
							id();
							}
							break;
						case UseState:
						case UseEffect:
						case UseRef:
						case UseMemo:
							{
							setState(325);
							hook();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						}
						setState(332);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(333);
					match(CloseBrace);
					}
					break;
				case UseState:
				case UseEffect:
				case UseRef:
				case UseMemo:
				case IDENTIFIER:
				case IDENTIFIERIn:
				case Id:
					{
					setState(337);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
					case IDENTIFIERIn:
					case Id:
						{
						setState(335);
						id();
						}
						break;
					case UseState:
					case UseEffect:
					case UseRef:
					case UseMemo:
						{
						setState(336);
						hook();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==From) {
				{
				setState(343);
				match(From);
				}
			}

			setState(346);
			match(String);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfShortContext extends ParserRuleContext {
		public CallIdentifierContext callIdentifier() {
			return getRuleContext(CallIdentifierContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(ReactParser.QuestionMark, 0); }
		public TerminalNode QuestionMarkModeCall() { return getToken(ReactParser.QuestionMarkModeCall, 0); }
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public TerminalNode ColonModeCall() { return getToken(ReactParser.ColonModeCall, 0); }
		public List<OpenParenContext> openParen() {
			return getRuleContexts(OpenParenContext.class);
		}
		public OpenParenContext openParen(int i) {
			return getRuleContext(OpenParenContext.class,i);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public List<CloseParenContext> closeParen() {
			return getRuleContexts(CloseParenContext.class);
		}
		public CloseParenContext closeParen(int i) {
			return getRuleContext(CloseParenContext.class,i);
		}
		public List<JsxElementContext> jsxElement() {
			return getRuleContexts(JsxElementContext.class);
		}
		public JsxElementContext jsxElement(int i) {
			return getRuleContext(JsxElementContext.class,i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfShortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifShort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIfShort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIfShort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIfShort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfShortContext ifShort() throws RecognitionException {
		IfShortContext _localctx = new IfShortContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifShort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			callIdentifier();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 255L) != 0) || ((((_la - 168)) & ~0x3f) == 0 && ((1L << (_la - 168)) & 2019L) != 0)) {
				{
				setState(349);
				operation();
				setState(350);
				expression(0);
				}
			}

			setState(354);
			_la = _input.LA(1);
			if ( !(_la==QuestionMark || _la==QuestionMarkModeCall) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(355);
				openParen();
				setState(356);
				statment();
				setState(357);
				closeParen();
				}
				break;
			case 2:
				{
				setState(359);
				openParen();
				setState(360);
				jsxElement();
				setState(361);
				closeParen();
				}
				break;
			case 3:
				{
				setState(363);
				statment();
				}
				break;
			case 4:
				{
				setState(364);
				jsxElement();
				}
				break;
			}
			setState(367);
			_la = _input.LA(1);
			if ( !(_la==Colon || _la==ColonModeCall) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(368);
				openParen();
				setState(369);
				statment();
				setState(370);
				closeParen();
				}
				break;
			case 2:
				{
				setState(372);
				openParen();
				setState(373);
				jsxElement();
				setState(374);
				closeParen();
				}
				break;
			case 3:
				{
				setState(376);
				statment();
				}
				break;
			case 4:
				{
				setState(377);
				jsxElement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementContext extends ParserRuleContext {
		public JsxElementNonSelfClosingContext jsxElementNonSelfClosing() {
			return getRuleContext(JsxElementNonSelfClosingContext.class,0);
		}
		public JsxElementSelfClosingContext jsxElementSelfClosing() {
			return getRuleContext(JsxElementSelfClosingContext.class,0);
		}
		public JsxElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementContext jsxElement() throws RecognitionException {
		JsxElementContext _localctx = new JsxElementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jsxElement);
		try {
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				jsxElementNonSelfClosing();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				jsxElementSelfClosing();
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementNonSelfClosingContext extends ParserRuleContext {
		public TerminalNode MoreThanIn() { return getToken(ReactParser.MoreThanIn, 0); }
		public TerminalNode CLOSE_TAGIn() { return getToken(ReactParser.CLOSE_TAGIn, 0); }
		public TerminalNode JSX_TAG() { return getToken(ReactParser.JSX_TAG, 0); }
		public TerminalNode JSX_TAGModeCall() { return getToken(ReactParser.JSX_TAGModeCall, 0); }
		public TerminalNode MoreThan() { return getToken(ReactParser.MoreThan, 0); }
		public TerminalNode MoreThanModeCall() { return getToken(ReactParser.MoreThanModeCall, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> OpenBraceInIn() { return getTokens(ReactParser.OpenBraceInIn); }
		public TerminalNode OpenBraceInIn(int i) {
			return getToken(ReactParser.OpenBraceInIn, i);
		}
		public List<TerminalNode> CloseBraceCall() { return getTokens(ReactParser.CloseBraceCall); }
		public TerminalNode CloseBraceCall(int i) {
			return getToken(ReactParser.CloseBraceCall, i);
		}
		public List<TerminalNode> LETTERR() { return getTokens(ReactParser.LETTERR); }
		public TerminalNode LETTERR(int i) {
			return getToken(ReactParser.LETTERR, i);
		}
		public List<JsxElementInContext> jsxElementIn() {
			return getRuleContexts(JsxElementInContext.class);
		}
		public JsxElementInContext jsxElementIn(int i) {
			return getRuleContext(JsxElementInContext.class,i);
		}
		public List<BlockOfargumentsContext> blockOfarguments() {
			return getRuleContexts(BlockOfargumentsContext.class);
		}
		public BlockOfargumentsContext blockOfarguments(int i) {
			return getRuleContext(BlockOfargumentsContext.class,i);
		}
		public List<IfShortContext> ifShort() {
			return getRuleContexts(IfShortContext.class);
		}
		public IfShortContext ifShort(int i) {
			return getRuleContext(IfShortContext.class,i);
		}
		public List<TerminalNode> Id() { return getTokens(ReactParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ReactParser.Id, i);
		}
		public List<TerminalNode> Dot() { return getTokens(ReactParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(ReactParser.Dot, i);
		}
		public List<TerminalNode> DotModeCall() { return getTokens(ReactParser.DotModeCall); }
		public TerminalNode DotModeCall(int i) {
			return getToken(ReactParser.DotModeCall, i);
		}
		public JsxElementNonSelfClosingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElementNonSelfClosing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxElementNonSelfClosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxElementNonSelfClosing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxElementNonSelfClosing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementNonSelfClosingContext jsxElementNonSelfClosing() throws RecognitionException {
		JsxElementNonSelfClosingContext _localctx = new JsxElementNonSelfClosingContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_jsxElementNonSelfClosing);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_la = _input.LA(1);
			if ( !(_la==JSX_TAG || _la==JSX_TAGModeCall) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 549756338177L) != 0)) {
				{
				{
				setState(385);
				attribute();
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391);
			match(MoreThanIn);
			setState(410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(408);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OpenBraceInIn:
						{
						setState(392);
						match(OpenBraceInIn);
						setState(402);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
						case 1:
							{
							setState(393);
							ifShort();
							}
							break;
						case 2:
							{
							setState(394);
							match(Id);
							setState(399);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
							while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1+1 ) {
									{
									{
									setState(395);
									_la = _input.LA(1);
									if ( !(_la==Dot || _la==DotModeCall) ) {
									_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(396);
									match(Id);
									}
									} 
								}
								setState(401);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
							}
							}
							break;
						}
						setState(404);
						match(CloseBraceCall);
						}
						break;
					case LETTERR:
						{
						setState(405);
						match(LETTERR);
						}
						break;
					case JSX_TAG:
					case JSX_TAGIn:
					case JSX_TAGInIn:
						{
						setState(406);
						jsxElementIn();
						}
						break;
					case OpenBrace:
						{
						setState(407);
						blockOfarguments();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(413);
			match(CLOSE_TAGIn);
			setState(414);
			_la = _input.LA(1);
			if ( !(_la==MoreThan || _la==MoreThanModeCall) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementSelfClosingContext extends ParserRuleContext {
		public Jsx_tagContext jsx_tag() {
			return getRuleContext(Jsx_tagContext.class,0);
		}
		public TerminalNode Self_CLOSE_TAG() { return getToken(ReactParser.Self_CLOSE_TAG, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public JsxElementSelfClosingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElementSelfClosing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxElementSelfClosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxElementSelfClosing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxElementSelfClosing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementSelfClosingContext jsxElementSelfClosing() throws RecognitionException {
		JsxElementSelfClosingContext _localctx = new JsxElementSelfClosingContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jsxElementSelfClosing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			jsx_tag();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 549756338177L) != 0)) {
				{
				{
				setState(417);
				attribute();
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(423);
			match(Self_CLOSE_TAG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementInContext extends ParserRuleContext {
		public TerminalNode MoreThanIn() { return getToken(ReactParser.MoreThanIn, 0); }
		public TerminalNode CLOSE_TAGIn() { return getToken(ReactParser.CLOSE_TAGIn, 0); }
		public TerminalNode MoreThanInIn() { return getToken(ReactParser.MoreThanInIn, 0); }
		public JsxElementSelfClosingContext jsxElementSelfClosing() {
			return getRuleContext(JsxElementSelfClosingContext.class,0);
		}
		public TerminalNode JSX_TAGIn() { return getToken(ReactParser.JSX_TAGIn, 0); }
		public TerminalNode JSX_TAGInIn() { return getToken(ReactParser.JSX_TAGInIn, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> OpenBraceInIn() { return getTokens(ReactParser.OpenBraceInIn); }
		public TerminalNode OpenBraceInIn(int i) {
			return getToken(ReactParser.OpenBraceInIn, i);
		}
		public List<TerminalNode> Id() { return getTokens(ReactParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ReactParser.Id, i);
		}
		public List<TerminalNode> CloseBraceCall() { return getTokens(ReactParser.CloseBraceCall); }
		public TerminalNode CloseBraceCall(int i) {
			return getToken(ReactParser.CloseBraceCall, i);
		}
		public List<JsxElementInContext> jsxElementIn() {
			return getRuleContexts(JsxElementInContext.class);
		}
		public JsxElementInContext jsxElementIn(int i) {
			return getRuleContext(JsxElementInContext.class,i);
		}
		public List<TerminalNode> LETTERR() { return getTokens(ReactParser.LETTERR); }
		public TerminalNode LETTERR(int i) {
			return getToken(ReactParser.LETTERR, i);
		}
		public List<BlockOfargumentsContext> blockOfarguments() {
			return getRuleContexts(BlockOfargumentsContext.class);
		}
		public BlockOfargumentsContext blockOfarguments(int i) {
			return getRuleContext(BlockOfargumentsContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(ReactParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(ReactParser.Dot, i);
		}
		public List<TerminalNode> DotModeCall() { return getTokens(ReactParser.DotModeCall); }
		public TerminalNode DotModeCall(int i) {
			return getToken(ReactParser.DotModeCall, i);
		}
		public List<TerminalNode> PlussPlussModeCall() { return getTokens(ReactParser.PlussPlussModeCall); }
		public TerminalNode PlussPlussModeCall(int i) {
			return getToken(ReactParser.PlussPlussModeCall, i);
		}
		public List<TerminalNode> MinusMinusModeCall() { return getTokens(ReactParser.MinusMinusModeCall); }
		public TerminalNode MinusMinusModeCall(int i) {
			return getToken(ReactParser.MinusMinusModeCall, i);
		}
		public JsxElementInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElementIn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxElementIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxElementIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxElementIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementInContext jsxElementIn() throws RecognitionException {
		JsxElementInContext _localctx = new JsxElementInContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_jsxElementIn);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(425);
				_la = _input.LA(1);
				if ( !(_la==JSX_TAGIn || _la==JSX_TAGInIn) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 549756338177L) != 0)) {
					{
					{
					setState(426);
					attribute();
					}
					}
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(432);
				match(MoreThanIn);
				setState(451);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						setState(449);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OpenBraceInIn:
							{
							setState(433);
							match(OpenBraceInIn);
							setState(434);
							match(Id);
							setState(442);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
							while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1+1 ) {
									{
									{
									setState(435);
									_la = _input.LA(1);
									if ( !(_la==Dot || _la==DotModeCall) ) {
									_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(436);
									match(Id);
									setState(438);
									_errHandler.sync(this);
									_la = _input.LA(1);
									if (_la==PlussPlussModeCall || _la==MinusMinusModeCall) {
										{
										setState(437);
										_la = _input.LA(1);
										if ( !(_la==PlussPlussModeCall || _la==MinusMinusModeCall) ) {
										_errHandler.recoverInline(this);
										}
										else {
											if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
											_errHandler.reportMatch(this);
											consume();
										}
										}
									}

									}
									} 
								}
								setState(444);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
							}
							setState(445);
							match(CloseBraceCall);
							}
							break;
						case JSX_TAG:
						case JSX_TAGIn:
						case JSX_TAGInIn:
							{
							setState(446);
							jsxElementIn();
							}
							break;
						case LETTERR:
							{
							setState(447);
							match(LETTERR);
							}
							break;
						case OpenBrace:
							{
							setState(448);
							blockOfarguments();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(453);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				}
				setState(454);
				match(CLOSE_TAGIn);
				setState(455);
				match(MoreThanInIn);
				}
				break;
			case 2:
				{
				setState(456);
				jsxElementSelfClosing();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockInContext extends ParserRuleContext {
		public TerminalNode OpenBraceIn() { return getToken(ReactParser.OpenBraceIn, 0); }
		public TerminalNode CloseBraceIn() { return getToken(ReactParser.CloseBraceIn, 0); }
		public List<JsxArgumentsContext> jsxArguments() {
			return getRuleContexts(JsxArgumentsContext.class);
		}
		public JsxArgumentsContext jsxArguments(int i) {
			return getRuleContext(JsxArgumentsContext.class,i);
		}
		public BlockInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockIn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBlockIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBlockIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBlockIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockInContext blockIn() throws RecognitionException {
		BlockInContext _localctx = new BlockInContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_blockIn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(OpenBraceIn);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 552981823489L) != 0)) {
				{
				{
				setState(460);
				jsxArguments();
				}
				}
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(466);
			match(CloseBraceIn);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode AssignIn() { return getToken(ReactParser.AssignIn, 0); }
		public BlockInContext blockIn() {
			return getRuleContext(BlockInContext.class,0);
		}
		public TerminalNode StringIn() { return getToken(ReactParser.StringIn, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			id();
			{
			setState(469);
			match(AssignIn);
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBraceIn:
				{
				setState(470);
				blockIn();
				}
				break;
			case StringIn:
				{
				setState(471);
				match(StringIn);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxArgumentsContext extends ParserRuleContext {
		public List<JsxParametersContext> jsxParameters() {
			return getRuleContexts(JsxParametersContext.class);
		}
		public JsxParametersContext jsxParameters(int i) {
			return getRuleContext(JsxParametersContext.class,i);
		}
		public List<TerminalNode> CommaIn() { return getTokens(ReactParser.CommaIn); }
		public TerminalNode CommaIn(int i) {
			return getToken(ReactParser.CommaIn, i);
		}
		public JsxArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxArgumentsContext jsxArguments() throws RecognitionException {
		JsxArgumentsContext _localctx = new JsxArgumentsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_jsxArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			jsxParameters();
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CommaIn) {
				{
				{
				setState(475);
				match(CommaIn);
				setState(476);
				jsxParameters();
				}
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxParametersContext extends ParserRuleContext {
		public JsxArrowFunctionContext jsxArrowFunction() {
			return getRuleContext(JsxArrowFunctionContext.class,0);
		}
		public JsxCallfunctionContext jsxCallfunction() {
			return getRuleContext(JsxCallfunctionContext.class,0);
		}
		public JsxArgumentContext jsxArgument() {
			return getRuleContext(JsxArgumentContext.class,0);
		}
		public JsxCallIdentifierContext jsxCallIdentifier() {
			return getRuleContext(JsxCallIdentifierContext.class,0);
		}
		public JsxExpressionContext jsxExpression() {
			return getRuleContext(JsxExpressionContext.class,0);
		}
		public JsxParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxParametersContext jsxParameters() throws RecognitionException {
		JsxParametersContext _localctx = new JsxParametersContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jsxParameters);
		try {
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				jsxArrowFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(483);
				jsxCallfunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(484);
				jsxArgument();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(485);
				jsxCallIdentifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(486);
				jsxExpression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxArrowFunctionContext extends ParserRuleContext {
		public TerminalNode ARROWIn() { return getToken(ReactParser.ARROWIn, 0); }
		public TerminalNode OpenParenIn() { return getToken(ReactParser.OpenParenIn, 0); }
		public TerminalNode CloseParenIn() { return getToken(ReactParser.CloseParenIn, 0); }
		public JsxArgumentContext jsxArgument() {
			return getRuleContext(JsxArgumentContext.class,0);
		}
		public TerminalNode OpenBraceIn() { return getToken(ReactParser.OpenBraceIn, 0); }
		public TerminalNode CloseBraceIn() { return getToken(ReactParser.CloseBraceIn, 0); }
		public JsxArgumentsContext jsxArguments() {
			return getRuleContext(JsxArgumentsContext.class,0);
		}
		public List<JsxExpressionContext> jsxExpression() {
			return getRuleContexts(JsxExpressionContext.class);
		}
		public JsxExpressionContext jsxExpression(int i) {
			return getRuleContext(JsxExpressionContext.class,i);
		}
		public JsxArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxArrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxArrowFunctionContext jsxArrowFunction() throws RecognitionException {
		JsxArrowFunctionContext _localctx = new JsxArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_jsxArrowFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenParenIn:
				{
				setState(489);
				match(OpenParenIn);
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 552981823489L) != 0)) {
					{
					setState(490);
					jsxArguments();
					}
				}

				setState(493);
				match(CloseParenIn);
				}
				break;
			case IDENTIFIER:
			case IDENTIFIERIn:
			case Id:
				{
				setState(494);
				jsxArgument();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(497);
			match(ARROWIn);
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case StringIn:
			case CloseBraceIn:
			case IDENTIFIERIn:
			case CommaIn:
			case OpenParenIn:
			case CloseParenIn:
			case ARROWIn:
			case NUMBERIn:
			case BooleanLiteralIn:
			case Id:
				{
				setState(499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(498);
					jsxExpression(0);
					}
					break;
				}
				}
				break;
			case OpenBraceIn:
				{
				setState(501);
				match(OpenBraceIn);
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 552981823489L) != 0)) {
					{
					{
					setState(502);
					jsxExpression(0);
					}
					}
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(508);
				match(CloseBraceIn);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxCallfunctionContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<JsxSimpleCallfunctionContext> jsxSimpleCallfunction() {
			return getRuleContexts(JsxSimpleCallfunctionContext.class);
		}
		public JsxSimpleCallfunctionContext jsxSimpleCallfunction(int i) {
			return getRuleContext(JsxSimpleCallfunctionContext.class,i);
		}
		public List<TerminalNode> DotIn() { return getTokens(ReactParser.DotIn); }
		public TerminalNode DotIn(int i) {
			return getToken(ReactParser.DotIn, i);
		}
		public JsxCallfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxCallfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxCallfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxCallfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxCallfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxCallfunctionContext jsxCallfunction() throws RecognitionException {
		JsxCallfunctionContext _localctx = new JsxCallfunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_jsxCallfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(511);
				id();
				setState(516); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(516);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						setState(512);
						match(DotIn);
						setState(513);
						id();
						}
						break;
					case 2:
						{
						setState(514);
						match(DotIn);
						setState(515);
						jsxSimpleCallfunction();
						}
						break;
					}
					}
					setState(518); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DotIn );
				}
				break;
			case 2:
				{
				setState(520);
				jsxSimpleCallfunction();
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxSimpleCallfunctionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode OpenParenIn() { return getToken(ReactParser.OpenParenIn, 0); }
		public TerminalNode CloseParenIn() { return getToken(ReactParser.CloseParenIn, 0); }
		public JsxArgumentsContext jsxArguments() {
			return getRuleContext(JsxArgumentsContext.class,0);
		}
		public JsxSimpleCallfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxSimpleCallfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxSimpleCallfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxSimpleCallfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxSimpleCallfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxSimpleCallfunctionContext jsxSimpleCallfunction() throws RecognitionException {
		JsxSimpleCallfunctionContext _localctx = new JsxSimpleCallfunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_jsxSimpleCallfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			id();
			setState(524);
			match(OpenParenIn);
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 552981823489L) != 0)) {
				{
				setState(525);
				jsxArguments();
				}
			}

			setState(528);
			match(CloseParenIn);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxArgumentContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode AssignIn() { return getToken(ReactParser.AssignIn, 0); }
		public JsxExpressionContext jsxExpression() {
			return getRuleContext(JsxExpressionContext.class,0);
		}
		public JsxArrowFunctionContext jsxArrowFunction() {
			return getRuleContext(JsxArrowFunctionContext.class,0);
		}
		public JsxArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxArgumentContext jsxArgument() throws RecognitionException {
		JsxArgumentContext _localctx = new JsxArgumentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_jsxArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(530);
			id();
			{
			setState(531);
			match(AssignIn);
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(532);
				jsxExpression(0);
				}
				break;
			case 2:
				{
				setState(533);
				jsxArrowFunction();
				}
				break;
			}
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxExpressionContext extends ParserRuleContext {
		public TerminalNode OpenParenIn() { return getToken(ReactParser.OpenParenIn, 0); }
		public List<JsxExpressionContext> jsxExpression() {
			return getRuleContexts(JsxExpressionContext.class);
		}
		public JsxExpressionContext jsxExpression(int i) {
			return getRuleContext(JsxExpressionContext.class,i);
		}
		public TerminalNode CloseParenIn() { return getToken(ReactParser.CloseParenIn, 0); }
		public TerminalNode MultiplyIn() { return getToken(ReactParser.MultiplyIn, 0); }
		public TerminalNode DivideIn() { return getToken(ReactParser.DivideIn, 0); }
		public TerminalNode PlusIn() { return getToken(ReactParser.PlusIn, 0); }
		public TerminalNode MinusIn() { return getToken(ReactParser.MinusIn, 0); }
		public TerminalNode NUMBERIn() { return getToken(ReactParser.NUMBERIn, 0); }
		public TerminalNode StringIn() { return getToken(ReactParser.StringIn, 0); }
		public TerminalNode BooleanLiteralIn() { return getToken(ReactParser.BooleanLiteralIn, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public JsxExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxExpressionContext jsxExpression() throws RecognitionException {
		return jsxExpression(0);
	}

	private JsxExpressionContext jsxExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JsxExpressionContext _localctx = new JsxExpressionContext(_ctx, _parentState);
		JsxExpressionContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_jsxExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(537);
				match(OpenParenIn);
				setState(538);
				jsxExpression(0);
				setState(539);
				_la = _input.LA(1);
				if ( !(_la==MultiplyIn || _la==DivideIn) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(540);
				jsxExpression(0);
				setState(541);
				match(CloseParenIn);
				}
				break;
			case 2:
				{
				setState(543);
				match(OpenParenIn);
				setState(544);
				jsxExpression(0);
				setState(545);
				_la = _input.LA(1);
				if ( !(_la==PlusIn || _la==MinusIn) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(546);
				jsxExpression(0);
				setState(547);
				match(CloseParenIn);
				}
				break;
			case 3:
				{
				setState(549);
				match(NUMBERIn);
				}
				break;
			case 4:
				{
				setState(550);
				match(StringIn);
				}
				break;
			case 5:
				{
				setState(551);
				match(BooleanLiteralIn);
				}
				break;
			case 6:
				{
				setState(552);
				id();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(563);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,66,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(561);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
					case 1:
						{
						_localctx = new JsxExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_jsxExpression);
						setState(555);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(556);
						_la = _input.LA(1);
						if ( !(_la==MultiplyIn || _la==DivideIn) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(557);
						jsxExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new JsxExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_jsxExpression);
						setState(558);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(559);
						_la = _input.LA(1);
						if ( !(_la==PlusIn || _la==MinusIn) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(560);
						jsxExpression(6);
						}
						break;
					}
					} 
				}
				setState(565);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxCallIdentifierContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> DotIn() { return getTokens(ReactParser.DotIn); }
		public TerminalNode DotIn(int i) {
			return getToken(ReactParser.DotIn, i);
		}
		public JsxCallIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxCallIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxCallIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxCallIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxCallIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxCallIdentifierContext jsxCallIdentifier() throws RecognitionException {
		JsxCallIdentifierContext _localctx = new JsxCallIdentifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_jsxCallIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			id();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DotIn) {
				{
				{
				setState(567);
				match(DotIn);
				setState(568);
				id();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxBlockContext extends ParserRuleContext {
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public OpenParenContext openParen() {
			return getRuleContext(OpenParenContext.class,0);
		}
		public CloseParenContext closeParen() {
			return getRuleContext(CloseParenContext.class,0);
		}
		public List<TerminalNode> SemiColon() { return getTokens(ReactParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(ReactParser.SemiColon, i);
		}
		public List<TerminalNode> SemiColonModeCall() { return getTokens(ReactParser.SemiColonModeCall); }
		public TerminalNode SemiColonModeCall(int i) {
			return getToken(ReactParser.SemiColonModeCall, i);
		}
		public List<TerminalNode> IgSemiColon() { return getTokens(ReactParser.IgSemiColon); }
		public TerminalNode IgSemiColon(int i) {
			return getToken(ReactParser.IgSemiColon, i);
		}
		public List<TerminalNode> IgSemiColonModeCall() { return getTokens(ReactParser.IgSemiColonModeCall); }
		public TerminalNode IgSemiColonModeCall(int i) {
			return getToken(ReactParser.IgSemiColonModeCall, i);
		}
		public JsxBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxBlockContext jsxBlock() throws RecognitionException {
		JsxBlockContext _localctx = new JsxBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_jsxBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenParen:
			case OpenParenModeCall:
				{
				{
				setState(574);
				openParen();
				{
				setState(575);
				jsxElement();
				}
				setState(576);
				closeParen();
				}
				}
				break;
			case JSX_TAG:
			case JSX_TAGIn:
			case JSX_TAGInIn:
			case JSX_TAGModeCall:
				{
				setState(578);
				jsxElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(584);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(581);
					_la = _input.LA(1);
					if ( !(_la==SemiColon || _la==SemiColonModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(586);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(590);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(587);
					_la = _input.LA(1);
					if ( !(_la==IgSemiColon || _la==IgSemiColonModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(OpenBrace);
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 46695171163160L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 298944017998269445L) != 0) || _la==NUMBERModeCall || _la==BooleanLiteralModeCall) {
				{
				{
				setState(594);
				statment();
				}
				}
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(600);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Else_ifContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(ReactParser.Else, 0); }
		public TerminalNode If() { return getToken(ReactParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public Else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElse_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElse_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElse_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_else_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(Else);
			setState(603);
			match(If);
			setState(604);
			match(OpenParen);
			setState(605);
			conditions();
			setState(606);
			match(CloseParen);
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(607);
				block();
				}
				break;
			case 2:
				{
				setState(608);
				statment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(ReactParser.Else, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			match(Else);
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(612);
				block();
				}
				break;
			case 2:
				{
				setState(613);
				statment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopPartsContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(ReactParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(ReactParser.SemiColon, i);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public CallIdentifierContext callIdentifier() {
			return getRuleContext(CallIdentifierContext.class,0);
		}
		public KindContext kind() {
			return getRuleContext(KindContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(ReactParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(ReactParser.MinusMinus, 0); }
		public ForLoopPartsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopParts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterForLoopParts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitForLoopParts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitForLoopParts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopPartsContext forLoopParts() throws RecognitionException {
		ForLoopPartsContext _localctx = new ForLoopPartsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forLoopParts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(617);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(616);
					kind();
					}
					break;
				}
				setState(619);
				variableDeclaration();
				setState(620);
				match(SemiColon);
				setState(621);
				conditions();
				setState(622);
				match(SemiColon);
				setState(627);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(623);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(624);
					id();
					setState(625);
					_la = _input.LA(1);
					if ( !(_la==PlusPlus || _la==MinusMinus) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(629);
				id();
				setState(630);
				id();
				setState(631);
				match(Colon);
				setState(632);
				callIdentifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionsContext extends ParserRuleContext {
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode BooleanLiteral() { return getToken(ReactParser.BooleanLiteral, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> Not() { return getTokens(ReactParser.Not); }
		public TerminalNode Not(int i) {
			return getToken(ReactParser.Not, i);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_conditions);
		int _la;
		try {
			setState(648);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(636);
				data();
				setState(637);
				operation();
				setState(638);
				data();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				match(BooleanLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Not) {
					{
					{
					setState(641);
					match(Not);
					}
					}
					setState(646);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(647);
				id();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public List<TerminalNode> CommaModeCall() { return getTokens(ReactParser.CommaModeCall); }
		public TerminalNode CommaModeCall(int i) {
			return getToken(ReactParser.CommaModeCall, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			parameters();
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma || _la==CommaModeCall) {
				{
				{
				setState(651);
				_la = _input.LA(1);
				if ( !(_la==Comma || _la==CommaModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(652);
				parameters();
				}
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockOfargumentsContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public BlockOfargumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockOfarguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBlockOfarguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBlockOfarguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBlockOfarguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockOfargumentsContext blockOfarguments() throws RecognitionException {
		BlockOfargumentsContext _localctx = new BlockOfargumentsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_blockOfarguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(OpenBrace);
			setState(659);
			arguments();
			setState(660);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public KindContext kind() {
			return getRuleContext(KindContext.class,0);
		}
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallfunctionContext callfunction() {
			return getRuleContext(CallfunctionContext.class,0);
		}
		public CallIdentifierContext callIdentifier() {
			return getRuleContext(CallIdentifierContext.class,0);
		}
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Var || _la==Const || _la==Let) {
				{
				setState(662);
				kind();
				}
			}

			{
			setState(665);
			id();
			}
			{
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(666);
				match(Assign);
				setState(671);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(667);
					expression(0);
					}
					break;
				case 2:
					{
					setState(668);
					callfunction();
					}
					break;
				case 3:
					{
					setState(669);
					callIdentifier();
					}
					break;
				case 4:
					{
					setState(670);
					arrowFunction();
					}
					break;
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariableDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariableDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			variableDeclaration();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(676);
				match(Comma);
				setState(677);
				variableDeclaration();
				}
				}
				setState(682);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public TerminalNode ARROWModeCall() { return getToken(ReactParser.ARROWModeCall, 0); }
		public OpenParenContext openParen() {
			return getRuleContext(OpenParenContext.class,0);
		}
		public CloseParenContext closeParen() {
			return getRuleContext(CloseParenContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public OpenBraceContext openBrace() {
			return getRuleContext(OpenBraceContext.class,0);
		}
		public CloseBraceContext closeBrace() {
			return getRuleContext(CloseBraceContext.class,0);
		}
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public ReturnstatmentContext returnstatment() {
			return getRuleContext(ReturnstatmentContext.class,0);
		}
		public TerminalNode Async() { return getToken(ReactParser.Async, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arrowFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Async) {
				{
				setState(683);
				match(Async);
				}
			}

			setState(693);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenParen:
			case OpenParenModeCall:
				{
				setState(686);
				openParen();
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & 6917529027641082025L) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 216468000986366145L) != 0)) {
					{
					setState(687);
					arguments();
					}
				}

				setState(690);
				closeParen();
				}
				break;
			case IDENTIFIER:
			case IDENTIFIERIn:
			case Id:
				{
				setState(692);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(695);
			_la = _input.LA(1);
			if ( !(_la==ARROW || _la==ARROWModeCall) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(697);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(696);
					expression(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(699);
				openBrace();
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 46695171163160L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 298944017998269445L) != 0) || _la==NUMBERModeCall || _la==BooleanLiteralModeCall) {
					{
					{
					setState(700);
					statment();
					}
					}
					setState(705);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Return) {
					{
					setState(706);
					returnstatment();
					}
				}

				setState(709);
				closeBrace();
				}
				break;
			case 3:
				{
				setState(711);
				jsxElement();
				}
				break;
			case 4:
				{
				setState(712);
				returnstatment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnstatmentContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(ReactParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JsxBlockContext jsxBlock() {
			return getRuleContext(JsxBlockContext.class,0);
		}
		public ReturnstatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterReturnstatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitReturnstatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitReturnstatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstatmentContext returnstatment() throws RecognitionException {
		ReturnstatmentContext _localctx = new ReturnstatmentContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_returnstatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			match(Return);
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(716);
				expression(0);
				}
				break;
			case 2:
				{
				setState(717);
				jsxBlock();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleCallfunctionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public OpenParenContext openParen() {
			return getRuleContext(OpenParenContext.class,0);
		}
		public CloseParenContext closeParen() {
			return getRuleContext(CloseParenContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public SimpleCallfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCallfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSimpleCallfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSimpleCallfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSimpleCallfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleCallfunctionContext simpleCallfunction() throws RecognitionException {
		SimpleCallfunctionContext _localctx = new SimpleCallfunctionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_simpleCallfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			id();
			setState(721);
			openParen();
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & 6917529027641082025L) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 216468000986366145L) != 0)) {
				{
				setState(722);
				arguments();
				}
			}

			setState(725);
			closeParen();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public CallIdentifierContext callIdentifier() {
			return getRuleContext(CallIdentifierContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(727);
			callIdentifier();
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign || _la==AssignModeCall) {
				{
				setState(728);
				assign();
				setState(731);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(729);
					expression(0);
					}
					break;
				case 2:
					{
					setState(730);
					arrowFunction();
					}
					break;
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class HooksContext extends ParserRuleContext {
		public UseEffectContext useEffect() {
			return getRuleContext(UseEffectContext.class,0);
		}
		public UseMemoContext useMemo() {
			return getRuleContext(UseMemoContext.class,0);
		}
		public UseRefContext useRef() {
			return getRuleContext(UseRefContext.class,0);
		}
		public UseStateContext useState() {
			return getRuleContext(UseStateContext.class,0);
		}
		public HooksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hooks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHooks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHooks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHooks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HooksContext hooks() throws RecognitionException {
		HooksContext _localctx = new HooksContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_hooks);
		try {
			setState(739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				useEffect();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(736);
				useMemo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(737);
				useRef();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(738);
				useState();
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

	@SuppressWarnings("CheckReturnValue")
	public static class HookContext extends ParserRuleContext {
		public TerminalNode UseEffect() { return getToken(ReactParser.UseEffect, 0); }
		public TerminalNode UseMemo() { return getToken(ReactParser.UseMemo, 0); }
		public TerminalNode UseRef() { return getToken(ReactParser.UseRef, 0); }
		public TerminalNode UseState() { return getToken(ReactParser.UseState, 0); }
		public HookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hook; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHook(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHook(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HookContext hook() throws RecognitionException {
		HookContext _localctx = new HookContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_hook);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			_la = _input.LA(1);
			if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & 15L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseStateContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(ReactParser.OpenBracket, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode Comma() { return getToken(ReactParser.Comma, 0); }
		public TerminalNode CloseBracket() { return getToken(ReactParser.CloseBracket, 0); }
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode NullLiteral() { return getToken(ReactParser.NullLiteral, 0); }
		public KindContext kind() {
			return getRuleContext(KindContext.class,0);
		}
		public TerminalNode UseState() { return getToken(ReactParser.UseState, 0); }
		public UseStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseStateContext useState() throws RecognitionException {
		UseStateContext _localctx = new UseStateContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_useState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Var || _la==Const || _la==Let) {
				{
				setState(743);
				kind();
				}
			}

			setState(746);
			match(OpenBracket);
			setState(747);
			id();
			setState(748);
			match(Comma);
			setState(749);
			id();
			setState(750);
			match(CloseBracket);
			setState(751);
			match(Assign);
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UseState) {
				{
				setState(752);
				match(UseState);
				}
			}

			setState(755);
			match(OpenParen);
			setState(758);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case IDENTIFIERIn:
			case Id:
				{
				setState(756);
				id();
				}
				break;
			case NullLiteral:
				{
				setState(757);
				match(NullLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(760);
			match(CloseParen);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseEffectContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(ReactParser.Comma, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public UseEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseEffectContext useEffect() throws RecognitionException {
		UseEffectContext _localctx = new UseEffectContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_useEffect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(OpenParen);
			setState(763);
			arrowFunction();
			setState(764);
			match(Comma);
			setState(765);
			array();
			setState(766);
			match(CloseParen);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseRefContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public TerminalNode UseRef() { return getToken(ReactParser.UseRef, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode NullLiteral() { return getToken(ReactParser.NullLiteral, 0); }
		public KindContext kind() {
			return getRuleContext(KindContext.class,0);
		}
		public UseRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseRefContext useRef() throws RecognitionException {
		UseRefContext _localctx = new UseRefContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_useRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Var || _la==Const || _la==Let) {
				{
				setState(768);
				kind();
				}
			}

			setState(771);
			id();
			setState(772);
			match(Assign);
			setState(773);
			match(UseRef);
			setState(774);
			match(OpenParen);
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case IDENTIFIERIn:
			case Id:
				{
				setState(775);
				id();
				}
				break;
			case NullLiteral:
				{
				setState(776);
				match(NullLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(779);
			match(CloseParen);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UseMemoContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public TerminalNode UseMemo() { return getToken(ReactParser.UseMemo, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(ReactParser.Comma, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public KindContext kind() {
			return getRuleContext(KindContext.class,0);
		}
		public UseMemoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useMemo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseMemo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseMemo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseMemo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseMemoContext useMemo() throws RecognitionException {
		UseMemoContext _localctx = new UseMemoContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_useMemo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Var || _la==Const || _la==Let) {
				{
				setState(781);
				kind();
				}
			}

			setState(784);
			id();
			setState(785);
			match(Assign);
			setState(786);
			match(UseMemo);
			setState(787);
			match(OpenParen);
			setState(788);
			arrowFunction();
			setState(789);
			match(Comma);
			setState(790);
			array();
			setState(791);
			match(CloseParen);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public CallIdentifierContext callIdentifier() {
			return getRuleContext(CallIdentifierContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public CallfunctionContext callfunction() {
			return getRuleContext(CallfunctionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NullLiteral() { return getToken(ReactParser.NullLiteral, 0); }
		public TerminalNode NullLiteralModeCall() { return getToken(ReactParser.NullLiteralModeCall, 0); }
		public BlockOfargumentsContext blockOfarguments() {
			return getRuleContext(BlockOfargumentsContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_parameters);
		try {
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(793);
				arrowFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(794);
				callIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(795);
				argument();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(796);
				callfunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(797);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(798);
				match(NullLiteral);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(799);
				match(NullLiteralModeCall);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(800);
				blockOfarguments();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallIdentifierContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(ReactParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(ReactParser.Dot, i);
		}
		public List<TerminalNode> DotModeCall() { return getTokens(ReactParser.DotModeCall); }
		public TerminalNode DotModeCall(int i) {
			return getToken(ReactParser.DotModeCall, i);
		}
		public CallIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCallIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCallIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCallIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallIdentifierContext callIdentifier() throws RecognitionException {
		CallIdentifierContext _localctx = new CallIdentifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_callIdentifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			id();
			setState(808);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(804);
					_la = _input.LA(1);
					if ( !(_la==Dot || _la==DotModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(805);
					id();
					}
					} 
				}
				setState(810);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public OpenParenContext openParen() {
			return getRuleContext(OpenParenContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CloseParenContext closeParen() {
			return getRuleContext(CloseParenContext.class,0);
		}
		public TerminalNode Multiply() { return getToken(ReactParser.Multiply, 0); }
		public TerminalNode MultiplyModeCall() { return getToken(ReactParser.MultiplyModeCall, 0); }
		public TerminalNode Divide() { return getToken(ReactParser.Divide, 0); }
		public TerminalNode DivideModeCall() { return getToken(ReactParser.DivideModeCall, 0); }
		public TerminalNode Plus() { return getToken(ReactParser.Plus, 0); }
		public TerminalNode PlusModeCall() { return getToken(ReactParser.PlusModeCall, 0); }
		public TerminalNode Minus() { return getToken(ReactParser.Minus, 0); }
		public TerminalNode MinusModeCall() { return getToken(ReactParser.MinusModeCall, 0); }
		public CallIdentifierContext callIdentifier() {
			return getRuleContext(CallIdentifierContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(ReactParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(ReactParser.MinusMinus, 0); }
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
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
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(812);
				openParen();
				setState(813);
				expression(0);
				setState(816);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Multiply:
				case MultiplyModeCall:
					{
					setState(814);
					_la = _input.LA(1);
					if ( !(_la==Multiply || _la==MultiplyModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case Divide:
				case DivideModeCall:
					{
					setState(815);
					_la = _input.LA(1);
					if ( !(_la==Divide || _la==DivideModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(818);
				expression(0);
				setState(819);
				closeParen();
				}
				break;
			case 2:
				{
				setState(821);
				openParen();
				setState(822);
				expression(0);
				setState(825);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Plus:
				case PlusModeCall:
					{
					setState(823);
					_la = _input.LA(1);
					if ( !(_la==Plus || _la==PlusModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case Minus:
				case MinusModeCall:
					{
					setState(824);
					_la = _input.LA(1);
					if ( !(_la==Minus || _la==MinusModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(827);
				expression(0);
				setState(828);
				closeParen();
				}
				break;
			case 3:
				{
				setState(830);
				callIdentifier();
				setState(831);
				_la = _input.LA(1);
				if ( !(_la==PlusPlus || _la==MinusMinus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				{
				setState(833);
				data();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(850);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(848);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(836);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(839);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Multiply:
						case MultiplyModeCall:
							{
							setState(837);
							_la = _input.LA(1);
							if ( !(_la==Multiply || _la==MultiplyModeCall) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						case Divide:
						case DivideModeCall:
							{
							setState(838);
							_la = _input.LA(1);
							if ( !(_la==Divide || _la==DivideModeCall) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(841);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(842);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(845);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Plus:
						case PlusModeCall:
							{
							setState(843);
							_la = _input.LA(1);
							if ( !(_la==Plus || _la==PlusModeCall) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						case Minus:
						case MinusModeCall:
							{
							setState(844);
							_la = _input.LA(1);
							if ( !(_la==Minus || _la==MinusModeCall) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(847);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(852);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExportContext extends ParserRuleContext {
		public TerminalNode Export() { return getToken(ReactParser.Export, 0); }
		public TerminalNode Default() { return getToken(ReactParser.Default, 0); }
		public CallIdentifierContext callIdentifier() {
			return getRuleContext(CallIdentifierContext.class,0);
		}
		public List<TerminalNode> SemiColon() { return getTokens(ReactParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(ReactParser.SemiColon, i);
		}
		public List<TerminalNode> IgSemiColon() { return getTokens(ReactParser.IgSemiColon); }
		public TerminalNode IgSemiColon(int i) {
			return getToken(ReactParser.IgSemiColon, i);
		}
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_export);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(Export);
			setState(854);
			match(Default);
			setState(855);
			callIdentifier();
			setState(859);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(856);
					match(SemiColon);
					}
					} 
				}
				setState(861);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			setState(865);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(862);
					match(IgSemiColon);
					}
					} 
				}
				setState(867);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataContext extends ParserRuleContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public TerminalNode NUMBERModeCall() { return getToken(ReactParser.NUMBERModeCall, 0); }
		public TerminalNode String() { return getToken(ReactParser.String, 0); }
		public TerminalNode StringModeCall() { return getToken(ReactParser.StringModeCall, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public TerminalNode BooleanLiteral() { return getToken(ReactParser.BooleanLiteral, 0); }
		public TerminalNode BooleanLiteralModeCall() { return getToken(ReactParser.BooleanLiteralModeCall, 0); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_data);
		int _la;
		try {
			setState(874);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				array();
				}
				break;
			case NUMBER:
			case NUMBERModeCall:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==NUMBERModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case String:
			case StringModeCall:
				enterOuterAlt(_localctx, 3);
				{
				setState(870);
				_la = _input.LA(1);
				if ( !(_la==String || _la==StringModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case IDENTIFIER:
			case IDENTIFIERIn:
			case Id:
				enterOuterAlt(_localctx, 4);
				{
				setState(871);
				id();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 5);
				{
				setState(872);
				map();
				}
				break;
			case BooleanLiteral:
			case BooleanLiteralModeCall:
				enterOuterAlt(_localctx, 6);
				{
				setState(873);
				_la = _input.LA(1);
				if ( !(_la==BooleanLiteral || _la==BooleanLiteralModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(ReactParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(ReactParser.CloseBracket, 0); }
		public SuquenceContext suquence() {
			return getRuleContext(SuquenceContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(OpenBracket);
			setState(878);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & 576460752303423505L) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 216182127963144385L) != 0)) {
				{
				setState(877);
				suquence();
				}
			}

			setState(880);
			match(CloseBracket);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MapContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<MapElementListContext> mapElementList() {
			return getRuleContexts(MapElementListContext.class);
		}
		public MapElementListContext mapElementList(int i) {
			return getRuleContext(MapElementListContext.class,i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(OpenBrace);
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(883);
				mapElementList();
				}
				}
				setState(888);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(889);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MapElementListContext extends ParserRuleContext {
		public List<MapElementContext> mapElement() {
			return getRuleContexts(MapElementContext.class);
		}
		public MapElementContext mapElement(int i) {
			return getRuleContext(MapElementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public MapElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapElementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMapElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMapElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMapElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapElementListContext mapElementList() throws RecognitionException {
		MapElementListContext _localctx = new MapElementListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_mapElementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			mapElement();
			setState(896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(892);
				match(Comma);
				setState(893);
				mapElement();
				}
				}
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MapElementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public CallfunctionContext callfunction() {
			return getRuleContext(CallfunctionContext.class,0);
		}
		public CallIdentifierContext callIdentifier() {
			return getRuleContext(CallIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MapElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMapElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMapElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMapElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapElementContext mapElement() throws RecognitionException {
		MapElementContext _localctx = new MapElementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_mapElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			match(IDENTIFIER);
			setState(900);
			match(Colon);
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(901);
				callfunction();
				}
				break;
			case 2:
				{
				setState(902);
				callIdentifier();
				}
				break;
			case 3:
				{
				setState(903);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SuquenceContext extends ParserRuleContext {
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public SuquenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suquence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSuquence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSuquence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSuquence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuquenceContext suquence() throws RecognitionException {
		SuquenceContext _localctx = new SuquenceContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_suquence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(906);
			data();
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(907);
				match(Comma);
				setState(908);
				data();
				}
				}
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class KindContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(ReactParser.Const, 0); }
		public TerminalNode Let() { return getToken(ReactParser.Let, 0); }
		public TerminalNode Var() { return getToken(ReactParser.Var, 0); }
		public KindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterKind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitKind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitKind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KindContext kind() throws RecognitionException {
		KindContext _localctx = new KindContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			_la = _input.LA(1);
			if ( !(_la==Var || _la==Const || _la==Let) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public TerminalNode LessThan() { return getToken(ReactParser.LessThan, 0); }
		public TerminalNode LessThanModeCall() { return getToken(ReactParser.LessThanModeCall, 0); }
		public TerminalNode MoreThan() { return getToken(ReactParser.MoreThan, 0); }
		public TerminalNode MoreThanModeCall() { return getToken(ReactParser.MoreThanModeCall, 0); }
		public TerminalNode Equals_() { return getToken(ReactParser.Equals_, 0); }
		public TerminalNode Equals_ModeCall() { return getToken(ReactParser.Equals_ModeCall, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(ReactParser.GreaterThanEquals, 0); }
		public TerminalNode GreaterThanEqualsModeCall() { return getToken(ReactParser.GreaterThanEqualsModeCall, 0); }
		public TerminalNode LessThanEqualsModeCall() { return getToken(ReactParser.LessThanEqualsModeCall, 0); }
		public TerminalNode LessThanEquals() { return getToken(ReactParser.LessThanEquals, 0); }
		public TerminalNode NotEquals() { return getToken(ReactParser.NotEquals, 0); }
		public TerminalNode NotEqualsModeCall() { return getToken(ReactParser.NotEqualsModeCall, 0); }
		public TerminalNode IdentityEquals() { return getToken(ReactParser.IdentityEquals, 0); }
		public TerminalNode IdentityEqualsModeCall() { return getToken(ReactParser.IdentityEqualsModeCall, 0); }
		public TerminalNode IdentityNotEquals() { return getToken(ReactParser.IdentityNotEquals, 0); }
		public TerminalNode IdentityNotEqualsModeCall() { return getToken(ReactParser.IdentityNotEqualsModeCall, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_operation);
		int _la;
		try {
			setState(931);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LessThan:
				enterOuterAlt(_localctx, 1);
				{
				setState(916);
				match(LessThan);
				}
				break;
			case LessThanModeCall:
				enterOuterAlt(_localctx, 2);
				{
				setState(917);
				match(LessThanModeCall);
				}
				break;
			case MoreThan:
				enterOuterAlt(_localctx, 3);
				{
				setState(918);
				match(MoreThan);
				}
				break;
			case MoreThanModeCall:
				enterOuterAlt(_localctx, 4);
				{
				setState(919);
				match(MoreThanModeCall);
				}
				break;
			case Equals_:
			case Equals_ModeCall:
				enterOuterAlt(_localctx, 5);
				{
				setState(920);
				_la = _input.LA(1);
				if ( !(_la==Equals_ || _la==Equals_ModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case GreaterThanEquals:
				enterOuterAlt(_localctx, 6);
				{
				setState(921);
				match(GreaterThanEquals);
				}
				break;
			case GreaterThanEqualsModeCall:
				enterOuterAlt(_localctx, 7);
				{
				setState(922);
				match(GreaterThanEqualsModeCall);
				}
				break;
			case LessThanEqualsModeCall:
				enterOuterAlt(_localctx, 8);
				{
				setState(923);
				match(LessThanEqualsModeCall);
				}
				break;
			case LessThanEquals:
				enterOuterAlt(_localctx, 9);
				{
				setState(924);
				match(LessThanEquals);
				}
				break;
			case NotEquals:
				enterOuterAlt(_localctx, 10);
				{
				setState(925);
				match(NotEquals);
				}
				break;
			case NotEqualsModeCall:
				enterOuterAlt(_localctx, 11);
				{
				setState(926);
				match(NotEqualsModeCall);
				}
				break;
			case IdentityEquals:
				enterOuterAlt(_localctx, 12);
				{
				setState(927);
				match(IdentityEquals);
				}
				break;
			case IdentityEqualsModeCall:
				enterOuterAlt(_localctx, 13);
				{
				setState(928);
				match(IdentityEqualsModeCall);
				}
				break;
			case IdentityNotEquals:
				enterOuterAlt(_localctx, 14);
				{
				setState(929);
				match(IdentityNotEquals);
				}
				break;
			case IdentityNotEqualsModeCall:
				enterOuterAlt(_localctx, 15);
				{
				setState(930);
				match(IdentityNotEqualsModeCall);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode Id() { return getToken(ReactParser.Id, 0); }
		public TerminalNode IDENTIFIERIn() { return getToken(ReactParser.IDENTIFIERIn, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			_la = _input.LA(1);
			if ( !(((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 549756338177L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpenParenContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode OpenParenModeCall() { return getToken(ReactParser.OpenParenModeCall, 0); }
		public OpenParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOpenParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOpenParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitOpenParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenParenContext openParen() throws RecognitionException {
		OpenParenContext _localctx = new OpenParenContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_openParen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			_la = _input.LA(1);
			if ( !(_la==OpenParen || _la==OpenParenModeCall) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class CloseParenContext extends ParserRuleContext {
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode CloseParenModeCall() { return getToken(ReactParser.CloseParenModeCall, 0); }
		public CloseParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCloseParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCloseParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCloseParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseParenContext closeParen() throws RecognitionException {
		CloseParenContext _localctx = new CloseParenContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_closeParen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			_la = _input.LA(1);
			if ( !(_la==CloseParen || _la==CloseParenModeCall) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public TerminalNode AssignModeCall() { return getToken(ReactParser.AssignModeCall, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			_la = _input.LA(1);
			if ( !(_la==Assign || _la==AssignModeCall) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class CloseBraceContext extends ParserRuleContext {
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public TerminalNode CloseBraceModeCall() { return getToken(ReactParser.CloseBraceModeCall, 0); }
		public CloseBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeBrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCloseBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCloseBrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCloseBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseBraceContext closeBrace() throws RecognitionException {
		CloseBraceContext _localctx = new CloseBraceContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_closeBrace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(941);
			_la = _input.LA(1);
			if ( !(_la==CloseBrace || _la==CloseBraceModeCall) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpenBraceContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode OpenBraceModeCall() { return getToken(ReactParser.OpenBraceModeCall, 0); }
		public OpenBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openBrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOpenBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOpenBrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitOpenBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenBraceContext openBrace() throws RecognitionException {
		OpenBraceContext _localctx = new OpenBraceContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_openBrace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceModeCall) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Jsx_tagContext extends ParserRuleContext {
		public TerminalNode JSX_TAGIn() { return getToken(ReactParser.JSX_TAGIn, 0); }
		public TerminalNode JSX_TAGInIn() { return getToken(ReactParser.JSX_TAGInIn, 0); }
		public TerminalNode JSX_TAG() { return getToken(ReactParser.JSX_TAG, 0); }
		public Jsx_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsx_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsx_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsx_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jsx_tagContext jsx_tag() throws RecognitionException {
		Jsx_tagContext _localctx = new Jsx_tagContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_jsx_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			_la = _input.LA(1);
			if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & 8589938689L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreakContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(ReactParser.Break, 0); }
		public BreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakContext break_() throws RecognitionException {
		BreakContext _localctx = new BreakContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			match(Break);
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
		case 26:
			return jsxExpression_sempred((JsxExpressionContext)_localctx, predIndex);
		case 50:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean jsxExpression_sempred(JsxExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00b8\u03b6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0001\u0000\u0005\u0000\u008a"+
		"\b\u0000\n\u0000\f\u0000\u008d\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u0093\b\u0001\n\u0001\f\u0001\u0096\t\u0001\u0001"+
		"\u0001\u0005\u0001\u0099\b\u0001\n\u0001\f\u0001\u009c\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00b2\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00ba\b\u0003\u0001\u0003"+
		"\u0005\u0003\u00bd\b\u0003\n\u0003\f\u0003\u00c0\t\u0003\u0001\u0003\u0003"+
		"\u0003\u00c3\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u00cb\b\u0004\u0001\u0005\u0003\u0005\u00ce"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00d3\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00d9\b\u0005"+
		"\n\u0005\f\u0005\u00dc\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00e8\b\u0007\u0001\b\u0001\b\u0001\b\u0003\b\u00ed"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u00f6"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u00fb\b\t\u0005\t\u00fd\b\t\n\t\f"+
		"\t\u0100\t\t\u0001\t\u0003\t\u0103\b\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u010f\b\n\n\n"+
		"\f\n\u0112\t\n\u0003\n\u0114\b\n\u0005\n\u0116\b\n\n\n\f\n\u0119\t\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u011f\b\n\n\n\f\n\u0122\t\n\u0003\n"+
		"\u0124\b\n\u0003\n\u0126\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u012f\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0135\b\u000b\n\u000b\f\u000b"+
		"\u0138\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u013c\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u0142\b\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0147\b\f\u0005\f\u0149\b\f\n\f\f\f\u014c\t\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u0152\b\f\u0003\f\u0154\b\f\u0003\f\u0156\b\f\u0001"+
		"\f\u0003\f\u0159\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0161\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u016e\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u017b"+
		"\b\r\u0001\u000e\u0001\u000e\u0003\u000e\u017f\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u0183\b\u000f\n\u000f\f\u000f\u0186\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u018e\b\u000f\n\u000f\f\u000f\u0191\t\u000f\u0003\u000f\u0193\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0199\b\u000f"+
		"\n\u000f\f\u000f\u019c\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u01a3\b\u0010\n\u0010\f\u0010\u01a6\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u01ac\b\u0011"+
		"\n\u0011\f\u0011\u01af\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01b7\b\u0011\u0005\u0011\u01b9"+
		"\b\u0011\n\u0011\f\u0011\u01bc\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u01c2\b\u0011\n\u0011\f\u0011\u01c5\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01ca\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u01ce\b\u0012\n\u0012\f\u0012\u01d1\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u01d9\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01de\b"+
		"\u0014\n\u0014\f\u0014\u01e1\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u01e8\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u01ec\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01f0\b"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01f4\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u01f8\b\u0016\n\u0016\f\u0016\u01fb\t\u0016\u0001\u0016"+
		"\u0003\u0016\u01fe\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0004\u0017\u0205\b\u0017\u000b\u0017\f\u0017\u0206\u0001"+
		"\u0017\u0003\u0017\u020a\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u020f\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u0217\b\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u022a\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0232"+
		"\b\u001a\n\u001a\f\u001a\u0235\t\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0005\u001b\u023a\b\u001b\n\u001b\f\u001b\u023d\t\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0244\b\u001c\u0001"+
		"\u001c\u0005\u001c\u0247\b\u001c\n\u001c\f\u001c\u024a\t\u001c\u0001\u001c"+
		"\u0005\u001c\u024d\b\u001c\n\u001c\f\u001c\u0250\t\u001c\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u0254\b\u001d\n\u001d\f\u001d\u0257\t\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u0262\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0267\b\u001f\u0001 \u0003 \u026a\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0274\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0003 \u027b\b \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0005!\u0283\b!\n!\f!\u0286\t!\u0001!\u0003!\u0289\b!\u0001\""+
		"\u0001\"\u0001\"\u0005\"\u028e\b\"\n\"\f\"\u0291\t\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001$\u0003$\u0298\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u02a0\b$\u0003$\u02a2\b$\u0001%\u0001%\u0001%\u0005%\u02a7\b"+
		"%\n%\f%\u02aa\t%\u0001&\u0003&\u02ad\b&\u0001&\u0001&\u0003&\u02b1\b&"+
		"\u0001&\u0001&\u0001&\u0003&\u02b6\b&\u0001&\u0001&\u0003&\u02ba\b&\u0001"+
		"&\u0001&\u0005&\u02be\b&\n&\f&\u02c1\t&\u0001&\u0003&\u02c4\b&\u0001&"+
		"\u0001&\u0001&\u0001&\u0003&\u02ca\b&\u0001\'\u0001\'\u0001\'\u0003\'"+
		"\u02cf\b\'\u0001(\u0001(\u0001(\u0003(\u02d4\b(\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001)\u0003)\u02dc\b)\u0003)\u02de\b)\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u02e4\b*\u0001+\u0001+\u0001,\u0003,\u02e9\b,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0003,\u02f2\b,\u0001,\u0001,\u0001,\u0003"+
		",\u02f7\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		".\u0003.\u0302\b.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u030a"+
		"\b.\u0001.\u0001.\u0001/\u0003/\u030f\b/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00030\u0322\b0\u00011\u00011\u00011\u00051\u0327\b1\n"+
		"1\f1\u032a\t1\u00012\u00012\u00012\u00012\u00012\u00032\u0331\b2\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u033a\b2\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00032\u0343\b2\u00012\u00012\u0001"+
		"2\u00032\u0348\b2\u00012\u00012\u00012\u00012\u00032\u034e\b2\u00012\u0005"+
		"2\u0351\b2\n2\f2\u0354\t2\u00013\u00013\u00013\u00013\u00053\u035a\b3"+
		"\n3\f3\u035d\t3\u00013\u00053\u0360\b3\n3\f3\u0363\t3\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00034\u036b\b4\u00015\u00015\u00035\u036f\b5\u0001"+
		"5\u00015\u00016\u00016\u00056\u0375\b6\n6\f6\u0378\t6\u00016\u00016\u0001"+
		"7\u00017\u00017\u00057\u037f\b7\n7\f7\u0382\t7\u00018\u00018\u00018\u0001"+
		"8\u00018\u00038\u0389\b8\u00019\u00019\u00019\u00059\u038e\b9\n9\f9\u0391"+
		"\t9\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u03a4\b;\u0001"+
		"<\u0001<\u0001=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001@\u0001@\u0001"+
		"A\u0001A\u0001B\u0001B\u0001C\u0001C\u0001C\u0005\u00fe\u018f\u019a\u01ba"+
		"\u01c3\u00024dD\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0080\u0082\u0084\u0086\u0000 \u0001\u0000rs\u0002\u00005"+
		"5\u00a1\u00a1\u0002\u000022\u00aa\u00aa\u0002\u000033\u00ab\u00ab\u0002"+
		"\u0000oo\u0096\u0096\u0002\u0000FF\u00a8\u00a8\u0002\u0000{{\u0090\u0090"+
		"\u0001\u0000\u00b5\u00b6\u0001\u0000\u0088\u0089\u0001\u0000\u008a\u008b"+
		"\u0002\u0000//\u00b4\u00b4\u0002\u0000((\u00b3\u00b3\u0001\u000067\u0002"+
		"\u000000\u009d\u009d\u0002\u0000^^\u00a0\u00a0\u0001\u0000_b\u0002\u0000"+
		"<<\u00a2\u00a2\u0002\u0000==\u00a3\u00a3\u0002\u000088\u00a4\u00a4\u0002"+
		"\u000099\u00a5\u00a5\u0002\u0000tt\u00a6\u00a6\u0002\u0000uu\u0099\u0099"+
		"\u0002\u0000dd\u00a7\u00a7\u0003\u0000\n\n##ff\u0002\u0000II\u00ad\u00ad"+
		"\u0003\u0000nn\u0081\u0081\u0095\u0095\u0002\u0000++\u009e\u009e\u0002"+
		"\u0000,,\u009f\u009f\u0002\u000011\u009c\u009c\u0002\u0000..\u009a\u009a"+
		"\u0002\u0000--\u009b\u009b\u0003\u0000oo{{\u0090\u0090\u042c\u0000\u008b"+
		"\u0001\u0000\u0000\u0000\u0002\u0090\u0001\u0000\u0000\u0000\u0004\u00b1"+
		"\u0001\u0000\u0000\u0000\u0006\u00b3\u0001\u0000\u0000\u0000\b\u00c4\u0001"+
		"\u0000\u0000\u0000\n\u00cd\u0001\u0000\u0000\u0000\f\u00df\u0001\u0000"+
		"\u0000\u0000\u000e\u00e1\u0001\u0000\u0000\u0000\u0010\u00e9\u0001\u0000"+
		"\u0000\u0000\u0012\u00f5\u0001\u0000\u0000\u0000\u0014\u0104\u0001\u0000"+
		"\u0000\u0000\u0016\u0129\u0001\u0000\u0000\u0000\u0018\u013d\u0001\u0000"+
		"\u0000\u0000\u001a\u015c\u0001\u0000\u0000\u0000\u001c\u017e\u0001\u0000"+
		"\u0000\u0000\u001e\u0180\u0001\u0000\u0000\u0000 \u01a0\u0001\u0000\u0000"+
		"\u0000\"\u01c9\u0001\u0000\u0000\u0000$\u01cb\u0001\u0000\u0000\u0000"+
		"&\u01d4\u0001\u0000\u0000\u0000(\u01da\u0001\u0000\u0000\u0000*\u01e7"+
		"\u0001\u0000\u0000\u0000,\u01ef\u0001\u0000\u0000\u0000.\u0209\u0001\u0000"+
		"\u0000\u00000\u020b\u0001\u0000\u0000\u00002\u0212\u0001\u0000\u0000\u0000"+
		"4\u0229\u0001\u0000\u0000\u00006\u0236\u0001\u0000\u0000\u00008\u0243"+
		"\u0001\u0000\u0000\u0000:\u0251\u0001\u0000\u0000\u0000<\u025a\u0001\u0000"+
		"\u0000\u0000>\u0263\u0001\u0000\u0000\u0000@\u027a\u0001\u0000\u0000\u0000"+
		"B\u0288\u0001\u0000\u0000\u0000D\u028a\u0001\u0000\u0000\u0000F\u0292"+
		"\u0001\u0000\u0000\u0000H\u0297\u0001\u0000\u0000\u0000J\u02a3\u0001\u0000"+
		"\u0000\u0000L\u02ac\u0001\u0000\u0000\u0000N\u02cb\u0001\u0000\u0000\u0000"+
		"P\u02d0\u0001\u0000\u0000\u0000R\u02d7\u0001\u0000\u0000\u0000T\u02e3"+
		"\u0001\u0000\u0000\u0000V\u02e5\u0001\u0000\u0000\u0000X\u02e8\u0001\u0000"+
		"\u0000\u0000Z\u02fa\u0001\u0000\u0000\u0000\\\u0301\u0001\u0000\u0000"+
		"\u0000^\u030e\u0001\u0000\u0000\u0000`\u0321\u0001\u0000\u0000\u0000b"+
		"\u0323\u0001\u0000\u0000\u0000d\u0342\u0001\u0000\u0000\u0000f\u0355\u0001"+
		"\u0000\u0000\u0000h\u036a\u0001\u0000\u0000\u0000j\u036c\u0001\u0000\u0000"+
		"\u0000l\u0372\u0001\u0000\u0000\u0000n\u037b\u0001\u0000\u0000\u0000p"+
		"\u0383\u0001\u0000\u0000\u0000r\u038a\u0001\u0000\u0000\u0000t\u0392\u0001"+
		"\u0000\u0000\u0000v\u03a3\u0001\u0000\u0000\u0000x\u03a5\u0001\u0000\u0000"+
		"\u0000z\u03a7\u0001\u0000\u0000\u0000|\u03a9\u0001\u0000\u0000\u0000~"+
		"\u03ab\u0001\u0000\u0000\u0000\u0080\u03ad\u0001\u0000\u0000\u0000\u0082"+
		"\u03af\u0001\u0000\u0000\u0000\u0084\u03b1\u0001\u0000\u0000\u0000\u0086"+
		"\u03b3\u0001\u0000\u0000\u0000\u0088\u008a\u0003\u0002\u0001\u0000\u0089"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b"+
		"\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c"+
		"\u008e\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0005\u0000\u0000\u0001\u008f\u0001\u0001\u0000\u0000\u0000\u0090"+
		"\u0094\u0003\u0004\u0002\u0000\u0091\u0093\u0005/\u0000\u0000\u0092\u0091"+
		"\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u009a"+
		"\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0099"+
		"\u0005(\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009c\u0001"+
		"\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001"+
		"\u0000\u0000\u0000\u009b\u0003\u0001\u0000\u0000\u0000\u009c\u009a\u0001"+
		"\u0000\u0000\u0000\u009d\u00b2\u0003J%\u0000\u009e\u00b2\u0003T*\u0000"+
		"\u009f\u00b2\u0003\u0006\u0003\u0000\u00a0\u00b2\u0003\b\u0004\u0000\u00a1"+
		"\u00b2\u0003\n\u0005\u0000\u00a2\u00b2\u0003\f\u0006\u0000\u00a3\u00b2"+
		"\u0003\u000e\u0007\u0000\u00a4\u00b2\u0003\u0010\b\u0000\u00a5\u00b2\u0003"+
		"\u0012\t\u0000\u00a6\u00b2\u0003\u0014\n\u0000\u00a7\u00b2\u0003:\u001d"+
		"\u0000\u00a8\u00b2\u0003\u0086C\u0000\u00a9\u00b2\u0003\u0016\u000b\u0000"+
		"\u00aa\u00b2\u0003\u0018\f\u0000\u00ab\u00b2\u0003\u001a\r\u0000\u00ac"+
		"\u00b2\u0003r9\u0000\u00ad\u00b2\u0003f3\u0000\u00ae\u00b2\u0003\u001c"+
		"\u000e\u0000\u00af\u00b2\u0003d2\u0000\u00b0\u00b2\u0003L&\u0000\u00b1"+
		"\u009d\u0001\u0000\u0000\u0000\u00b1\u009e\u0001\u0000\u0000\u0000\u00b1"+
		"\u009f\u0001\u0000\u0000\u0000\u00b1\u00a0\u0001\u0000\u0000\u0000\u00b1"+
		"\u00a1\u0001\u0000\u0000\u0000\u00b1\u00a2\u0001\u0000\u0000\u0000\u00b1"+
		"\u00a3\u0001\u0000\u0000\u0000\u00b1\u00a4\u0001\u0000\u0000\u0000\u00b1"+
		"\u00a5\u0001\u0000\u0000\u0000\u00b1\u00a6\u0001\u0000\u0000\u0000\u00b1"+
		"\u00a7\u0001\u0000\u0000\u0000\u00b1\u00a8\u0001\u0000\u0000\u0000\u00b1"+
		"\u00a9\u0001\u0000\u0000\u0000\u00b1\u00aa\u0001\u0000\u0000\u0000\u00b1"+
		"\u00ab\u0001\u0000\u0000\u0000\u00b1\u00ac\u0001\u0000\u0000\u0000\u00b1"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b1\u00ae\u0001\u0000\u0000\u0000\u00b1"+
		"\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"\u0005\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0018\u0000\u0000\u00b4"+
		"\u00b5\u0005+\u0000\u0000\u00b5\u00b6\u0003B!\u0000\u00b6\u00b9\u0005"+
		",\u0000\u0000\u00b7\u00ba\u0003:\u001d\u0000\u00b8\u00ba\u0003\u0002\u0001"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000"+
		"\u0000\u00ba\u00be\u0001\u0000\u0000\u0000\u00bb\u00bd\u0003<\u001e\u0000"+
		"\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c3\u0003>\u001f\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c3\u0007\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0005\u0010\u0000\u0000\u00c5\u00c6\u0005+\u0000\u0000\u00c6\u00c7"+
		"\u0003@ \u0000\u00c7\u00ca\u0005,\u0000\u0000\u00c8\u00cb\u0003:\u001d"+
		"\u0000\u00c9\u00cb\u0003\u0002\u0001\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\t\u0001\u0000\u0000\u0000"+
		"\u00cc\u00ce\u0005\u0014\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000"+
		"\u00cf\u00d0\u0003x<\u0000\u00d0\u00d2\u0005+\u0000\u0000\u00d1\u00d3"+
		"\u0003D\"\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005"+
		",\u0000\u0000\u00d5\u00da\u0005-\u0000\u0000\u00d6\u00d9\u0003\u0002\u0001"+
		"\u0000\u00d7\u00d9\u0003N\'\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000"+
		"\u00da\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000"+
		"\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0005.\u0000\u0000\u00de\u000b\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0007\u0000\u0000\u0000\u00e0\r\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0005\u0012\u0000\u0000\u00e2\u00e3\u0005+\u0000\u0000\u00e3\u00e4\u0003"+
		"B!\u0000\u00e4\u00e7\u0005,\u0000\u0000\u00e5\u00e8\u0003:\u001d\u0000"+
		"\u00e6\u00e8\u0003\u0002\u0001\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u000f\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ec\u0005\u0004\u0000\u0000\u00ea\u00ed\u0003:\u001d\u0000\u00eb"+
		"\u00ed\u0003\u0002\u0001\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ef\u0005\u0012\u0000\u0000\u00ef\u00f0\u0005+\u0000\u0000\u00f0\u00f1"+
		"\u0003B!\u0000\u00f1\u00f2\u0005,\u0000\u0000\u00f2\u0011\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f6\u0003P(\u0000\u00f4\u00f6\u0003b1\u0000\u00f5"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6"+
		"\u00fe\u0001\u0000\u0000\u0000\u00f7\u00fa\u0007\u0001\u0000\u0000\u00f8"+
		"\u00fb\u0003P(\u0000\u00f9\u00fb\u0003b1\u0000\u00fa\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fc\u00f7\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u0101\u0103\u0003P(\u0000\u0102\u0101\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0013\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0005\u0011\u0000\u0000\u0105\u0106\u0005+\u0000\u0000\u0106"+
		"\u0107\u0003d2\u0000\u0107\u0108\u0005,\u0000\u0000\u0108\u0117\u0005"+
		"-\u0000\u0000\u0109\u010a\u0005\u0007\u0000\u0000\u010a\u010b\u0003d2"+
		"\u0000\u010b\u0113\u00053\u0000\u0000\u010c\u0114\u0003:\u001d\u0000\u010d"+
		"\u010f\u0003\u0002\u0001\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f"+
		"\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112"+
		"\u0110\u0001\u0000\u0000\u0000\u0113\u010c\u0001\u0000\u0000\u0000\u0113"+
		"\u0110\u0001\u0000\u0000\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115"+
		"\u0109\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117"+
		"\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118"+
		"\u0125\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0005\u0017\u0000\u0000\u011b\u0123\u00053\u0000\u0000\u011c\u0124"+
		"\u0003:\u001d\u0000\u011d\u011f\u0003\u0002\u0001\u0000\u011e\u011d\u0001"+
		"\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u011e\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0124\u0001"+
		"\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u011c\u0001"+
		"\u0000\u0000\u0000\u0123\u0120\u0001\u0000\u0000\u0000\u0124\u0126\u0001"+
		"\u0000\u0000\u0000\u0125\u011a\u0001\u0000\u0000\u0000\u0125\u0126\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0005"+
		".\u0000\u0000\u0128\u0015\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u001c"+
		"\u0000\u0000\u012a\u0136\u0003:\u001d\u0000\u012b\u012c\u0005\u000b\u0000"+
		"\u0000\u012c\u012e\u0005+\u0000\u0000\u012d\u012f\u0003x<\u0000\u012e"+
		"\u012d\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0001\u0000\u0000\u0000\u0130\u0131\u0003x<\u0000\u0131\u0132\u0005"+
		",\u0000\u0000\u0132\u0133\u0003:\u001d\u0000\u0133\u0135\u0001\u0000\u0000"+
		"\u0000\u0134\u012b\u0001\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000"+
		"\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000"+
		"\u0000\u0137\u013b\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0005\f\u0000\u0000\u013a\u013c\u0003:\u001d\u0000"+
		"\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000"+
		"\u013c\u0017\u0001\u0000\u0000\u0000\u013d\u0155\u0005%\u0000\u0000\u013e"+
		"\u0141\u0005-\u0000\u0000\u013f\u0142\u0003x<\u0000\u0140\u0142\u0003"+
		"V+\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0140\u0001\u0000\u0000"+
		"\u0000\u0142\u014a\u0001\u0000\u0000\u0000\u0143\u0146\u00050\u0000\u0000"+
		"\u0144\u0147\u0003x<\u0000\u0145\u0147\u0003V+\u0000\u0146\u0144\u0001"+
		"\u0000\u0000\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0147\u0149\u0001"+
		"\u0000\u0000\u0000\u0148\u0143\u0001\u0000\u0000\u0000\u0149\u014c\u0001"+
		"\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001"+
		"\u0000\u0000\u0000\u014b\u014d\u0001\u0000\u0000\u0000\u014c\u014a\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0005.\u0000\u0000\u014e\u0154\u0001\u0000"+
		"\u0000\u0000\u014f\u0152\u0003x<\u0000\u0150\u0152\u0003V+\u0000\u0151"+
		"\u014f\u0001\u0000\u0000\u0000\u0151\u0150\u0001\u0000\u0000\u0000\u0152"+
		"\u0154\u0001\u0000\u0000\u0000\u0153\u013e\u0001\u0000\u0000\u0000\u0153"+
		"\u0151\u0001\u0000\u0000\u0000\u0154\u0156\u0001\u0000\u0000\u0000\u0155"+
		"\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000\u0156"+
		"\u0158\u0001\u0000\u0000\u0000\u0157\u0159\u0005\u001e\u0000\u0000\u0158"+
		"\u0157\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0001\u0000\u0000\u0000\u015a\u015b\u0005u\u0000\u0000\u015b\u0019"+
		"\u0001\u0000\u0000\u0000\u015c\u0160\u0003b1\u0000\u015d\u015e\u0003v"+
		";\u0000\u015e\u015f\u0003d2\u0000\u015f\u0161\u0001\u0000\u0000\u0000"+
		"\u0160\u015d\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000"+
		"\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u016d\u0007\u0002\u0000\u0000"+
		"\u0163\u0164\u0003z=\u0000\u0164\u0165\u0003\u0002\u0001\u0000\u0165\u0166"+
		"\u0003|>\u0000\u0166\u016e\u0001\u0000\u0000\u0000\u0167\u0168\u0003z"+
		"=\u0000\u0168\u0169\u0003\u001c\u000e\u0000\u0169\u016a\u0003|>\u0000"+
		"\u016a\u016e\u0001\u0000\u0000\u0000\u016b\u016e\u0003\u0002\u0001\u0000"+
		"\u016c\u016e\u0003\u001c\u000e\u0000\u016d\u0163\u0001\u0000\u0000\u0000"+
		"\u016d\u0167\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000"+
		"\u016d\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000"+
		"\u016f\u017a\u0007\u0003\u0000\u0000\u0170\u0171\u0003z=\u0000\u0171\u0172"+
		"\u0003\u0002\u0001\u0000\u0172\u0173\u0003|>\u0000\u0173\u017b\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0003z=\u0000\u0175\u0176\u0003\u001c\u000e\u0000"+
		"\u0176\u0177\u0003|>\u0000\u0177\u017b\u0001\u0000\u0000\u0000\u0178\u017b"+
		"\u0003\u0002\u0001\u0000\u0179\u017b\u0003\u001c\u000e\u0000\u017a\u0170"+
		"\u0001\u0000\u0000\u0000\u017a\u0174\u0001\u0000\u0000\u0000\u017a\u0178"+
		"\u0001\u0000\u0000\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017b\u001b"+
		"\u0001\u0000\u0000\u0000\u017c\u017f\u0003\u001e\u000f\u0000\u017d\u017f"+
		"\u0003 \u0010\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017d\u0001"+
		"\u0000\u0000\u0000\u017f\u001d\u0001\u0000\u0000\u0000\u0180\u0184\u0007"+
		"\u0004\u0000\u0000\u0181\u0183\u0003&\u0013\u0000\u0182\u0181\u0001\u0000"+
		"\u0000\u0000\u0183\u0186\u0001\u0000\u0000\u0000\u0184\u0182\u0001\u0000"+
		"\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0187\u0001\u0000"+
		"\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u019a\u0005y\u0000"+
		"\u0000\u0188\u0192\u0005\u0093\u0000\u0000\u0189\u0193\u0003\u001a\r\u0000"+
		"\u018a\u018f\u0005\u0095\u0000\u0000\u018b\u018c\u0007\u0001\u0000\u0000"+
		"\u018c\u018e\u0005\u0095\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000"+
		"\u018e\u0191\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000"+
		"\u018f\u018d\u0001\u0000\u0000\u0000\u0190\u0193\u0001\u0000\u0000\u0000"+
		"\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0189\u0001\u0000\u0000\u0000"+
		"\u0192\u018a\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000"+
		"\u0194\u0199\u0005\u0097\u0000\u0000\u0195\u0199\u0005\u0094\u0000\u0000"+
		"\u0196\u0199\u0003\"\u0011\u0000\u0197\u0199\u0003F#\u0000\u0198\u0188"+
		"\u0001\u0000\u0000\u0000\u0198\u0195\u0001\u0000\u0000\u0000\u0198\u0196"+
		"\u0001\u0000\u0000\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0199\u019c"+
		"\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019a\u0198"+
		"\u0001\u0000\u0000\u0000\u019b\u019d\u0001\u0000\u0000\u0000\u019c\u019a"+
		"\u0001\u0000\u0000\u0000\u019d\u019e\u0005\u008e\u0000\u0000\u019e\u019f"+
		"\u0007\u0005\u0000\u0000\u019f\u001f\u0001\u0000\u0000\u0000\u01a0\u01a4"+
		"\u0003\u0084B\u0000\u01a1\u01a3\u0003&\u0013\u0000\u01a2\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a6\u0001\u0000\u0000\u0000\u01a4\u01a2\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005x\u0000"+
		"\u0000\u01a8!\u0001\u0000\u0000\u0000\u01a9\u01ad\u0007\u0006\u0000\u0000"+
		"\u01aa\u01ac\u0003&\u0013\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ac"+
		"\u01af\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ae\u0001\u0000\u0000\u0000\u01ae\u01b0\u0001\u0000\u0000\u0000\u01af"+
		"\u01ad\u0001\u0000\u0000\u0000\u01b0\u01c3\u0005y\u0000\u0000\u01b1\u01b2"+
		"\u0005\u0093\u0000\u0000\u01b2\u01ba\u0005\u0095\u0000\u0000\u01b3\u01b4"+
		"\u0007\u0001\u0000\u0000\u01b4\u01b6\u0005\u0095\u0000\u0000\u01b5\u01b7"+
		"\u0007\u0007\u0000\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b6\u01b7"+
		"\u0001\u0000\u0000\u0000\u01b7\u01b9\u0001\u0000\u0000\u0000\u01b8\u01b3"+
		"\u0001\u0000\u0000\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba\u01bb"+
		"\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000\u0000\u01bb\u01bd"+
		"\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01c2"+
		"\u0005\u0097\u0000\u0000\u01be\u01c2\u0003\"\u0011\u0000\u01bf\u01c2\u0005"+
		"\u0094\u0000\u0000\u01c0\u01c2\u0003F#\u0000\u01c1\u01b1\u0001\u0000\u0000"+
		"\u0000\u01c1\u01be\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c4\u01c6\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c7\u0005\u008e\u0000\u0000\u01c7\u01ca\u0005\u008f\u0000"+
		"\u0000\u01c8\u01ca\u0003 \u0010\u0000\u01c9\u01a9\u0001\u0000\u0000\u0000"+
		"\u01c9\u01c8\u0001\u0000\u0000\u0000\u01ca#\u0001\u0000\u0000\u0000\u01cb"+
		"\u01cf\u0005\u0080\u0000\u0000\u01cc\u01ce\u0003(\u0014\u0000\u01cd\u01cc"+
		"\u0001\u0000\u0000\u0000\u01ce\u01d1\u0001\u0000\u0000\u0000\u01cf\u01cd"+
		"\u0001\u0000\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d2"+
		"\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000\u0000\u01d2\u01d3"+
		"\u0005\u007f\u0000\u0000\u01d3%\u0001\u0000\u0000\u0000\u01d4\u01d5\u0003"+
		"x<\u0000\u01d5\u01d8\u0005\u0082\u0000\u0000\u01d6\u01d9\u0003$\u0012"+
		"\u0000\u01d7\u01d9\u0005~\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d9\'\u0001\u0000\u0000\u0000\u01da"+
		"\u01df\u0003*\u0015\u0000\u01db\u01dc\u0005\u0083\u0000\u0000\u01dc\u01de"+
		"\u0003*\u0015\u0000\u01dd\u01db\u0001\u0000\u0000\u0000\u01de\u01e1\u0001"+
		"\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e0)\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e8\u0003,\u0016\u0000\u01e3\u01e8\u0003.\u0017\u0000"+
		"\u01e4\u01e8\u00032\u0019\u0000\u01e5\u01e8\u00036\u001b\u0000\u01e6\u01e8"+
		"\u00034\u001a\u0000\u01e7\u01e2\u0001\u0000\u0000\u0000\u01e7\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e4\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e6\u0001\u0000\u0000\u0000\u01e8+\u0001\u0000"+
		"\u0000\u0000\u01e9\u01eb\u0005\u0084\u0000\u0000\u01ea\u01ec\u0003(\u0014"+
		"\u0000\u01eb\u01ea\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000"+
		"\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u01f0\u0005\u0085\u0000"+
		"\u0000\u01ee\u01f0\u00032\u0019\u0000\u01ef\u01e9\u0001\u0000\u0000\u0000"+
		"\u01ef\u01ee\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000"+
		"\u01f1\u01fd\u0005\u0086\u0000\u0000\u01f2\u01f4\u00034\u001a\u0000\u01f3"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4"+
		"\u01fe\u0001\u0000\u0000\u0000\u01f5\u01f9\u0005\u0080\u0000\u0000\u01f6"+
		"\u01f8\u00034\u001a\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f8\u01fb"+
		"\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fa"+
		"\u0001\u0000\u0000\u0000\u01fa\u01fc\u0001\u0000\u0000\u0000\u01fb\u01f9"+
		"\u0001\u0000\u0000\u0000\u01fc\u01fe\u0005\u007f\u0000\u0000\u01fd\u01f3"+
		"\u0001\u0000\u0000\u0000\u01fd\u01f5\u0001\u0000\u0000\u0000\u01fe-\u0001"+
		"\u0000\u0000\u0000\u01ff\u0204\u0003x<\u0000\u0200\u0201\u0005\u0087\u0000"+
		"\u0000\u0201\u0205\u0003x<\u0000\u0202\u0203\u0005\u0087\u0000\u0000\u0203"+
		"\u0205\u00030\u0018\u0000\u0204\u0200\u0001\u0000\u0000\u0000\u0204\u0202"+
		"\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0204"+
		"\u0001\u0000\u0000\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u0207\u020a"+
		"\u0001\u0000\u0000\u0000\u0208\u020a\u00030\u0018\u0000\u0209\u01ff\u0001"+
		"\u0000\u0000\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u020a/\u0001\u0000"+
		"\u0000\u0000\u020b\u020c\u0003x<\u0000\u020c\u020e\u0005\u0084\u0000\u0000"+
		"\u020d\u020f\u0003(\u0014\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020e"+
		"\u020f\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210"+
		"\u0211\u0005\u0085\u0000\u0000\u02111\u0001\u0000\u0000\u0000\u0212\u0213"+
		"\u0003x<\u0000\u0213\u0216\u0005\u0082\u0000\u0000\u0214\u0217\u00034"+
		"\u001a\u0000\u0215\u0217\u0003,\u0016\u0000\u0216\u0214\u0001\u0000\u0000"+
		"\u0000\u0216\u0215\u0001\u0000\u0000\u0000\u02173\u0001\u0000\u0000\u0000"+
		"\u0218\u0219\u0006\u001a\uffff\uffff\u0000\u0219\u021a\u0005\u0084\u0000"+
		"\u0000\u021a\u021b\u00034\u001a\u0000\u021b\u021c\u0007\b\u0000\u0000"+
		"\u021c\u021d\u00034\u001a\u0000\u021d\u021e\u0005\u0085\u0000\u0000\u021e"+
		"\u022a\u0001\u0000\u0000\u0000\u021f\u0220\u0005\u0084\u0000\u0000\u0220"+
		"\u0221\u00034\u001a\u0000\u0221\u0222\u0007\t\u0000\u0000\u0222\u0223"+
		"\u00034\u001a\u0000\u0223\u0224\u0005\u0085\u0000\u0000\u0224\u022a\u0001"+
		"\u0000\u0000\u0000\u0225\u022a\u0005\u008c\u0000\u0000\u0226\u022a\u0005"+
		"~\u0000\u0000\u0227\u022a\u0005\u008d\u0000\u0000\u0228\u022a\u0003x<"+
		"\u0000\u0229\u0218\u0001\u0000\u0000\u0000\u0229\u021f\u0001\u0000\u0000"+
		"\u0000\u0229\u0225\u0001\u0000\u0000\u0000\u0229\u0226\u0001\u0000\u0000"+
		"\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u0229\u0228\u0001\u0000\u0000"+
		"\u0000\u022a\u0233\u0001\u0000\u0000\u0000\u022b\u022c\n\u0006\u0000\u0000"+
		"\u022c\u022d\u0007\b\u0000\u0000\u022d\u0232\u00034\u001a\u0007\u022e"+
		"\u022f\n\u0005\u0000\u0000\u022f\u0230\u0007\t\u0000\u0000\u0230\u0232"+
		"\u00034\u001a\u0006\u0231\u022b\u0001\u0000\u0000\u0000\u0231\u022e\u0001"+
		"\u0000\u0000\u0000\u0232\u0235\u0001\u0000\u0000\u0000\u0233\u0231\u0001"+
		"\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u02345\u0001\u0000"+
		"\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0236\u023b\u0003x<\u0000"+
		"\u0237\u0238\u0005\u0087\u0000\u0000\u0238\u023a\u0003x<\u0000\u0239\u0237"+
		"\u0001\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000\u0000\u023b\u0239"+
		"\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c7\u0001"+
		"\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023e\u023f\u0003"+
		"z=\u0000\u023f\u0240\u0003\u001c\u000e\u0000\u0240\u0241\u0003|>\u0000"+
		"\u0241\u0244\u0001\u0000\u0000\u0000\u0242\u0244\u0003\u001c\u000e\u0000"+
		"\u0243\u023e\u0001\u0000\u0000\u0000\u0243\u0242\u0001\u0000\u0000\u0000"+
		"\u0244\u0248\u0001\u0000\u0000\u0000\u0245\u0247\u0007\n\u0000\u0000\u0246"+
		"\u0245\u0001\u0000\u0000\u0000\u0247\u024a\u0001\u0000\u0000\u0000\u0248"+
		"\u0246\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249"+
		"\u024e\u0001\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024b"+
		"\u024d\u0007\u000b\u0000\u0000\u024c\u024b\u0001\u0000\u0000\u0000\u024d"+
		"\u0250\u0001\u0000\u0000\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024e"+
		"\u024f\u0001\u0000\u0000\u0000\u024f9\u0001\u0000\u0000\u0000\u0250\u024e"+
		"\u0001\u0000\u0000\u0000\u0251\u0255\u0005-\u0000\u0000\u0252\u0254\u0003"+
		"\u0002\u0001\u0000\u0253\u0252\u0001\u0000\u0000\u0000\u0254\u0257\u0001"+
		"\u0000\u0000\u0000\u0255\u0253\u0001\u0000\u0000\u0000\u0255\u0256\u0001"+
		"\u0000\u0000\u0000\u0256\u0258\u0001\u0000\u0000\u0000\u0257\u0255\u0001"+
		"\u0000\u0000\u0000\u0258\u0259\u0005.\u0000\u0000\u0259;\u0001\u0000\u0000"+
		"\u0000\u025a\u025b\u0005\b\u0000\u0000\u025b\u025c\u0005\u0018\u0000\u0000"+
		"\u025c\u025d\u0005+\u0000\u0000\u025d\u025e\u0003B!\u0000\u025e\u0261"+
		"\u0005,\u0000\u0000\u025f\u0262\u0003:\u001d\u0000\u0260\u0262\u0003\u0002"+
		"\u0001\u0000\u0261\u025f\u0001\u0000\u0000\u0000\u0261\u0260\u0001\u0000"+
		"\u0000\u0000\u0262=\u0001\u0000\u0000\u0000\u0263\u0266\u0005\b\u0000"+
		"\u0000\u0264\u0267\u0003:\u001d\u0000\u0265\u0267\u0003\u0002\u0001\u0000"+
		"\u0266\u0264\u0001\u0000\u0000\u0000\u0266\u0265\u0001\u0000\u0000\u0000"+
		"\u0267?\u0001\u0000\u0000\u0000\u0268\u026a\u0003t:\u0000\u0269\u0268"+
		"\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026b"+
		"\u0001\u0000\u0000\u0000\u026b\u026c\u0003H$\u0000\u026c\u026d\u0005/"+
		"\u0000\u0000\u026d\u026e\u0003B!\u0000\u026e\u0273\u0005/\u0000\u0000"+
		"\u026f\u0274\u0003H$\u0000\u0270\u0271\u0003x<\u0000\u0271\u0272\u0007"+
		"\f\u0000\u0000\u0272\u0274\u0001\u0000\u0000\u0000\u0273\u026f\u0001\u0000"+
		"\u0000\u0000\u0273\u0270\u0001\u0000\u0000\u0000\u0274\u027b\u0001\u0000"+
		"\u0000\u0000\u0275\u0276\u0003x<\u0000\u0276\u0277\u0003x<\u0000\u0277"+
		"\u0278\u00053\u0000\u0000\u0278\u0279\u0003b1\u0000\u0279\u027b\u0001"+
		"\u0000\u0000\u0000\u027a\u0269\u0001\u0000\u0000\u0000\u027a\u0275\u0001"+
		"\u0000\u0000\u0000\u027bA\u0001\u0000\u0000\u0000\u027c\u027d\u0003h4"+
		"\u0000\u027d\u027e\u0003v;\u0000\u027e\u027f\u0003h4\u0000\u027f\u0289"+
		"\u0001\u0000\u0000\u0000\u0280\u0289\u0005d\u0000\u0000\u0281\u0283\u0005"+
		";\u0000\u0000\u0282\u0281\u0001\u0000\u0000\u0000\u0283\u0286\u0001\u0000"+
		"\u0000\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000"+
		"\u0000\u0000\u0285\u0287\u0001\u0000\u0000\u0000\u0286\u0284\u0001\u0000"+
		"\u0000\u0000\u0287\u0289\u0003x<\u0000\u0288\u027c\u0001\u0000\u0000\u0000"+
		"\u0288\u0280\u0001\u0000\u0000\u0000\u0288\u0284\u0001\u0000\u0000\u0000"+
		"\u0289C\u0001\u0000\u0000\u0000\u028a\u028f\u0003`0\u0000\u028b\u028c"+
		"\u0007\r\u0000\u0000\u028c\u028e\u0003`0\u0000\u028d\u028b\u0001\u0000"+
		"\u0000\u0000\u028e\u0291\u0001\u0000\u0000\u0000\u028f\u028d\u0001\u0000"+
		"\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290E\u0001\u0000\u0000"+
		"\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0292\u0293\u0005-\u0000\u0000"+
		"\u0293\u0294\u0003D\"\u0000\u0294\u0295\u0005.\u0000\u0000\u0295G\u0001"+
		"\u0000\u0000\u0000\u0296\u0298\u0003t:\u0000\u0297\u0296\u0001\u0000\u0000"+
		"\u0000\u0297\u0298\u0001\u0000\u0000\u0000\u0298\u0299\u0001\u0000\u0000"+
		"\u0000\u0299\u02a1\u0003x<\u0000\u029a\u029f\u00051\u0000\u0000\u029b"+
		"\u02a0\u0003d2\u0000\u029c\u02a0\u0003\u0012\t\u0000\u029d\u02a0\u0003"+
		"b1\u0000\u029e\u02a0\u0003L&\u0000\u029f\u029b\u0001\u0000\u0000\u0000"+
		"\u029f\u029c\u0001\u0000\u0000\u0000\u029f\u029d\u0001\u0000\u0000\u0000"+
		"\u029f\u029e\u0001\u0000\u0000\u0000\u02a0\u02a2\u0001\u0000\u0000\u0000"+
		"\u02a1\u029a\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000"+
		"\u02a2I\u0001\u0000\u0000\u0000\u02a3\u02a8\u0003H$\u0000\u02a4\u02a5"+
		"\u00050\u0000\u0000\u02a5\u02a7\u0003H$\u0000\u02a6\u02a4\u0001\u0000"+
		"\u0000\u0000\u02a7\u02aa\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000"+
		"\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9K\u0001\u0000\u0000"+
		"\u0000\u02aa\u02a8\u0001\u0000\u0000\u0000\u02ab\u02ad\u0005&\u0000\u0000"+
		"\u02ac\u02ab\u0001\u0000\u0000\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000"+
		"\u02ad\u02b5\u0001\u0000\u0000\u0000\u02ae\u02b0\u0003z=\u0000\u02af\u02b1"+
		"\u0003D\"\u0000\u02b0\u02af\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001"+
		"\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000\u02b2\u02b3\u0003"+
		"|>\u0000\u02b3\u02b6\u0001\u0000\u0000\u0000\u02b4\u02b6\u0003x<\u0000"+
		"\u02b5\u02ae\u0001\u0000\u0000\u0000\u02b5\u02b4\u0001\u0000\u0000\u0000"+
		"\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7\u02c9\u0007\u000e\u0000\u0000"+
		"\u02b8\u02ba\u0003d2\u0000\u02b9\u02b8\u0001\u0000\u0000\u0000\u02b9\u02ba"+
		"\u0001\u0000\u0000\u0000\u02ba\u02ca\u0001\u0000\u0000\u0000\u02bb\u02bf"+
		"\u0003\u0082A\u0000\u02bc\u02be\u0003\u0002\u0001\u0000\u02bd\u02bc\u0001"+
		"\u0000\u0000\u0000\u02be\u02c1\u0001\u0000\u0000\u0000\u02bf\u02bd\u0001"+
		"\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0\u02c3\u0001"+
		"\u0000\u0000\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000\u02c2\u02c4\u0003"+
		"N\'\u0000\u02c3\u02c2\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000"+
		"\u0000\u0000\u02c4\u02c5\u0001\u0000\u0000\u0000\u02c5\u02c6\u0003\u0080"+
		"@\u0000\u02c6\u02ca\u0001\u0000\u0000\u0000\u02c7\u02ca\u0003\u001c\u000e"+
		"\u0000\u02c8\u02ca\u0003N\'\u0000\u02c9\u02b9\u0001\u0000\u0000\u0000"+
		"\u02c9\u02bb\u0001\u0000\u0000\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000"+
		"\u02c9\u02c8\u0001\u0000\u0000\u0000\u02caM\u0001\u0000\u0000\u0000\u02cb"+
		"\u02ce\u0005\r\u0000\u0000\u02cc\u02cf\u0003d2\u0000\u02cd\u02cf\u0003"+
		"8\u001c\u0000\u02ce\u02cc\u0001\u0000\u0000\u0000\u02ce\u02cd\u0001\u0000"+
		"\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cfO\u0001\u0000\u0000"+
		"\u0000\u02d0\u02d1\u0003x<\u0000\u02d1\u02d3\u0003z=\u0000\u02d2\u02d4"+
		"\u0003D\"\u0000\u02d3\u02d2\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001"+
		"\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d6\u0003"+
		"|>\u0000\u02d6Q\u0001\u0000\u0000\u0000\u02d7\u02dd\u0003b1\u0000\u02d8"+
		"\u02db\u0003~?\u0000\u02d9\u02dc\u0003d2\u0000\u02da\u02dc\u0003L&\u0000"+
		"\u02db\u02d9\u0001\u0000\u0000\u0000\u02db\u02da\u0001\u0000\u0000\u0000"+
		"\u02dc\u02de\u0001\u0000\u0000\u0000\u02dd\u02d8\u0001\u0000\u0000\u0000"+
		"\u02dd\u02de\u0001\u0000\u0000\u0000\u02deS\u0001\u0000\u0000\u0000\u02df"+
		"\u02e4\u0003Z-\u0000\u02e0\u02e4\u0003^/\u0000\u02e1\u02e4\u0003\\.\u0000"+
		"\u02e2\u02e4\u0003X,\u0000\u02e3\u02df\u0001\u0000\u0000\u0000\u02e3\u02e0"+
		"\u0001\u0000\u0000\u0000\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e2"+
		"\u0001\u0000\u0000\u0000\u02e4U\u0001\u0000\u0000\u0000\u02e5\u02e6\u0007"+
		"\u000f\u0000\u0000\u02e6W\u0001\u0000\u0000\u0000\u02e7\u02e9\u0003t:"+
		"\u0000\u02e8\u02e7\u0001\u0000\u0000\u0000\u02e8\u02e9\u0001\u0000\u0000"+
		"\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea\u02eb\u0005)\u0000\u0000"+
		"\u02eb\u02ec\u0003x<\u0000\u02ec\u02ed\u00050\u0000\u0000\u02ed\u02ee"+
		"\u0003x<\u0000\u02ee\u02ef\u0005*\u0000\u0000\u02ef\u02f1\u00051\u0000"+
		"\u0000\u02f0\u02f2\u0005_\u0000\u0000\u02f1\u02f0\u0001\u0000\u0000\u0000"+
		"\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000"+
		"\u02f3\u02f6\u0005+\u0000\u0000\u02f4\u02f7\u0003x<\u0000\u02f5\u02f7"+
		"\u0005c\u0000\u0000\u02f6\u02f4\u0001\u0000\u0000\u0000\u02f6\u02f5\u0001"+
		"\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02f9\u0005"+
		",\u0000\u0000\u02f9Y\u0001\u0000\u0000\u0000\u02fa\u02fb\u0005+\u0000"+
		"\u0000\u02fb\u02fc\u0003L&\u0000\u02fc\u02fd\u00050\u0000\u0000\u02fd"+
		"\u02fe\u0003j5\u0000\u02fe\u02ff\u0005,\u0000\u0000\u02ff[\u0001\u0000"+
		"\u0000\u0000\u0300\u0302\u0003t:\u0000\u0301\u0300\u0001\u0000\u0000\u0000"+
		"\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0303\u0001\u0000\u0000\u0000"+
		"\u0303\u0304\u0003x<\u0000\u0304\u0305\u00051\u0000\u0000\u0305\u0306"+
		"\u0005a\u0000\u0000\u0306\u0309\u0005+\u0000\u0000\u0307\u030a\u0003x"+
		"<\u0000\u0308\u030a\u0005c\u0000\u0000\u0309\u0307\u0001\u0000\u0000\u0000"+
		"\u0309\u0308\u0001\u0000\u0000\u0000\u030a\u030b\u0001\u0000\u0000\u0000"+
		"\u030b\u030c\u0005,\u0000\u0000\u030c]\u0001\u0000\u0000\u0000\u030d\u030f"+
		"\u0003t:\u0000\u030e\u030d\u0001\u0000\u0000\u0000\u030e\u030f\u0001\u0000"+
		"\u0000\u0000\u030f\u0310\u0001\u0000\u0000\u0000\u0310\u0311\u0003x<\u0000"+
		"\u0311\u0312\u00051\u0000\u0000\u0312\u0313\u0005b\u0000\u0000\u0313\u0314"+
		"\u0005+\u0000\u0000\u0314\u0315\u0003L&\u0000\u0315\u0316\u00050\u0000"+
		"\u0000\u0316\u0317\u0003j5\u0000\u0317\u0318\u0005,\u0000\u0000\u0318"+
		"_\u0001\u0000\u0000\u0000\u0319\u0322\u0003L&\u0000\u031a\u0322\u0003"+
		"b1\u0000\u031b\u0322\u0003R)\u0000\u031c\u0322\u0003\u0012\t\u0000\u031d"+
		"\u0322\u0003d2\u0000\u031e\u0322\u0005c\u0000\u0000\u031f\u0322\u0005"+
		"\u0098\u0000\u0000\u0320\u0322\u0003F#\u0000\u0321\u0319\u0001\u0000\u0000"+
		"\u0000\u0321\u031a\u0001\u0000\u0000\u0000\u0321\u031b\u0001\u0000\u0000"+
		"\u0000\u0321\u031c\u0001\u0000\u0000\u0000\u0321\u031d\u0001\u0000\u0000"+
		"\u0000\u0321\u031e\u0001\u0000\u0000\u0000\u0321\u031f\u0001\u0000\u0000"+
		"\u0000\u0321\u0320\u0001\u0000\u0000\u0000\u0322a\u0001\u0000\u0000\u0000"+
		"\u0323\u0328\u0003x<\u0000\u0324\u0325\u0007\u0001\u0000\u0000\u0325\u0327"+
		"\u0003x<\u0000\u0326\u0324\u0001\u0000\u0000\u0000\u0327\u032a\u0001\u0000"+
		"\u0000\u0000\u0328\u0326\u0001\u0000\u0000\u0000\u0328\u0329\u0001\u0000"+
		"\u0000\u0000\u0329c\u0001\u0000\u0000\u0000\u032a\u0328\u0001\u0000\u0000"+
		"\u0000\u032b\u032c\u00062\uffff\uffff\u0000\u032c\u032d\u0003z=\u0000"+
		"\u032d\u0330\u0003d2\u0000\u032e\u0331\u0007\u0010\u0000\u0000\u032f\u0331"+
		"\u0007\u0011\u0000\u0000\u0330\u032e\u0001\u0000\u0000\u0000\u0330\u032f"+
		"\u0001\u0000\u0000\u0000\u0331\u0332\u0001\u0000\u0000\u0000\u0332\u0333"+
		"\u0003d2\u0000\u0333\u0334\u0003|>\u0000\u0334\u0343\u0001\u0000\u0000"+
		"\u0000\u0335\u0336\u0003z=\u0000\u0336\u0339\u0003d2\u0000\u0337\u033a"+
		"\u0007\u0012\u0000\u0000\u0338\u033a\u0007\u0013\u0000\u0000\u0339\u0337"+
		"\u0001\u0000\u0000\u0000\u0339\u0338\u0001\u0000\u0000\u0000\u033a\u033b"+
		"\u0001\u0000\u0000\u0000\u033b\u033c\u0003d2\u0000\u033c\u033d\u0003|"+
		">\u0000\u033d\u0343\u0001\u0000\u0000\u0000\u033e\u033f\u0003b1\u0000"+
		"\u033f\u0340\u0007\f\u0000\u0000\u0340\u0343\u0001\u0000\u0000\u0000\u0341"+
		"\u0343\u0003h4\u0000\u0342\u032b\u0001\u0000\u0000\u0000\u0342\u0335\u0001"+
		"\u0000\u0000\u0000\u0342\u033e\u0001\u0000\u0000\u0000\u0342\u0341\u0001"+
		"\u0000\u0000\u0000\u0343\u0352\u0001\u0000\u0000\u0000\u0344\u0347\n\u0004"+
		"\u0000\u0000\u0345\u0348\u0007\u0010\u0000\u0000\u0346\u0348\u0007\u0011"+
		"\u0000\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0347\u0346\u0001\u0000"+
		"\u0000\u0000\u0348\u0349\u0001\u0000\u0000\u0000\u0349\u0351\u0003d2\u0005"+
		"\u034a\u034d\n\u0003\u0000\u0000\u034b\u034e\u0007\u0012\u0000\u0000\u034c"+
		"\u034e\u0007\u0013\u0000\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034d"+
		"\u034c\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000\u0000\u0000\u034f"+
		"\u0351\u0003d2\u0004\u0350\u0344\u0001\u0000\u0000\u0000\u0350\u034a\u0001"+
		"\u0000\u0000\u0000\u0351\u0354\u0001\u0000\u0000\u0000\u0352\u0350\u0001"+
		"\u0000\u0000\u0000\u0352\u0353\u0001\u0000\u0000\u0000\u0353e\u0001\u0000"+
		"\u0000\u0000\u0354\u0352\u0001\u0000\u0000\u0000\u0355\u0356\u0005$\u0000"+
		"\u0000\u0356\u0357\u0005\u0017\u0000\u0000\u0357\u035b\u0003b1\u0000\u0358"+
		"\u035a\u0005/\u0000\u0000\u0359\u0358\u0001\u0000\u0000\u0000\u035a\u035d"+
		"\u0001\u0000\u0000\u0000\u035b\u0359\u0001\u0000\u0000\u0000\u035b\u035c"+
		"\u0001\u0000\u0000\u0000\u035c\u0361\u0001\u0000\u0000\u0000\u035d\u035b"+
		"\u0001\u0000\u0000\u0000\u035e\u0360\u0005(\u0000\u0000\u035f\u035e\u0001"+
		"\u0000\u0000\u0000\u0360\u0363\u0001\u0000\u0000\u0000\u0361\u035f\u0001"+
		"\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000\u0362g\u0001\u0000"+
		"\u0000\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0364\u036b\u0003j5\u0000"+
		"\u0365\u036b\u0007\u0014\u0000\u0000\u0366\u036b\u0007\u0015\u0000\u0000"+
		"\u0367\u036b\u0003x<\u0000\u0368\u036b\u0003l6\u0000\u0369\u036b\u0007"+
		"\u0016\u0000\u0000\u036a\u0364\u0001\u0000\u0000\u0000\u036a\u0365\u0001"+
		"\u0000\u0000\u0000\u036a\u0366\u0001\u0000\u0000\u0000\u036a\u0367\u0001"+
		"\u0000\u0000\u0000\u036a\u0368\u0001\u0000\u0000\u0000\u036a\u0369\u0001"+
		"\u0000\u0000\u0000\u036bi\u0001\u0000\u0000\u0000\u036c\u036e\u0005)\u0000"+
		"\u0000\u036d\u036f\u0003r9\u0000\u036e\u036d\u0001\u0000\u0000\u0000\u036e"+
		"\u036f\u0001\u0000\u0000\u0000\u036f\u0370\u0001\u0000\u0000\u0000\u0370"+
		"\u0371\u0005*\u0000\u0000\u0371k\u0001\u0000\u0000\u0000\u0372\u0376\u0005"+
		"-\u0000\u0000\u0373\u0375\u0003n7\u0000\u0374\u0373\u0001\u0000\u0000"+
		"\u0000\u0375\u0378\u0001\u0000\u0000\u0000\u0376\u0374\u0001\u0000\u0000"+
		"\u0000\u0376\u0377\u0001\u0000\u0000\u0000\u0377\u0379\u0001\u0000\u0000"+
		"\u0000\u0378\u0376\u0001\u0000\u0000\u0000\u0379\u037a\u0005.\u0000\u0000"+
		"\u037am\u0001\u0000\u0000\u0000\u037b\u0380\u0003p8\u0000\u037c\u037d"+
		"\u00050\u0000\u0000\u037d\u037f\u0003p8\u0000\u037e\u037c\u0001\u0000"+
		"\u0000\u0000\u037f\u0382\u0001\u0000\u0000\u0000\u0380\u037e\u0001\u0000"+
		"\u0000\u0000\u0380\u0381\u0001\u0000\u0000\u0000\u0381o\u0001\u0000\u0000"+
		"\u0000\u0382\u0380\u0001\u0000\u0000\u0000\u0383\u0384\u0005n\u0000\u0000"+
		"\u0384\u0388\u00053\u0000\u0000\u0385\u0389\u0003\u0012\t\u0000\u0386"+
		"\u0389\u0003b1\u0000\u0387\u0389\u0003d2\u0000\u0388\u0385\u0001\u0000"+
		"\u0000\u0000\u0388\u0386\u0001\u0000\u0000\u0000\u0388\u0387\u0001\u0000"+
		"\u0000\u0000\u0389q\u0001\u0000\u0000\u0000\u038a\u038f\u0003h4\u0000"+
		"\u038b\u038c\u00050\u0000\u0000\u038c\u038e\u0003h4\u0000\u038d\u038b"+
		"\u0001\u0000\u0000\u0000\u038e\u0391\u0001\u0000\u0000\u0000\u038f\u038d"+
		"\u0001\u0000\u0000\u0000\u038f\u0390\u0001\u0000\u0000\u0000\u0390s\u0001"+
		"\u0000\u0000\u0000\u0391\u038f\u0001\u0000\u0000\u0000\u0392\u0393\u0007"+
		"\u0017\u0000\u0000\u0393u\u0001\u0000\u0000\u0000\u0394\u03a4\u0005E\u0000"+
		"\u0000\u0395\u03a4\u0005\u00a9\u0000\u0000\u0396\u03a4\u0005F\u0000\u0000"+
		"\u0397\u03a4\u0005\u00a8\u0000\u0000\u0398\u03a4\u0007\u0018\u0000\u0000"+
		"\u0399\u03a4\u0005H\u0000\u0000\u039a\u03a4\u0005\u00b2\u0000\u0000\u039b"+
		"\u03a4\u0005\u00b1\u0000\u0000\u039c\u03a4\u0005G\u0000\u0000\u039d\u03a4"+
		"\u0005J\u0000\u0000\u039e\u03a4\u0005\u00b0\u0000\u0000\u039f\u03a4\u0005"+
		"K\u0000\u0000\u03a0\u03a4\u0005\u00af\u0000\u0000\u03a1\u03a4\u0005L\u0000"+
		"\u0000\u03a2\u03a4\u0005\u00ae\u0000\u0000\u03a3\u0394\u0001\u0000\u0000"+
		"\u0000\u03a3\u0395\u0001\u0000\u0000\u0000\u03a3\u0396\u0001\u0000\u0000"+
		"\u0000\u03a3\u0397\u0001\u0000\u0000\u0000\u03a3\u0398\u0001\u0000\u0000"+
		"\u0000\u03a3\u0399\u0001\u0000\u0000\u0000\u03a3\u039a\u0001\u0000\u0000"+
		"\u0000\u03a3\u039b\u0001\u0000\u0000\u0000\u03a3\u039c\u0001\u0000\u0000"+
		"\u0000\u03a3\u039d\u0001\u0000\u0000\u0000\u03a3\u039e\u0001\u0000\u0000"+
		"\u0000\u03a3\u039f\u0001\u0000\u0000\u0000\u03a3\u03a0\u0001\u0000\u0000"+
		"\u0000\u03a3\u03a1\u0001\u0000\u0000\u0000\u03a3\u03a2\u0001\u0000\u0000"+
		"\u0000\u03a4w\u0001\u0000\u0000\u0000\u03a5\u03a6\u0007\u0019\u0000\u0000"+
		"\u03a6y\u0001\u0000\u0000\u0000\u03a7\u03a8\u0007\u001a\u0000\u0000\u03a8"+
		"{\u0001\u0000\u0000\u0000\u03a9\u03aa\u0007\u001b\u0000\u0000\u03aa}\u0001"+
		"\u0000\u0000\u0000\u03ab\u03ac\u0007\u001c\u0000\u0000\u03ac\u007f\u0001"+
		"\u0000\u0000\u0000\u03ad\u03ae\u0007\u001d\u0000\u0000\u03ae\u0081\u0001"+
		"\u0000\u0000\u0000\u03af\u03b0\u0007\u001e\u0000\u0000\u03b0\u0083\u0001"+
		"\u0000\u0000\u0000\u03b1\u03b2\u0007\u001f\u0000\u0000\u03b2\u0085\u0001"+
		"\u0000\u0000\u0000\u03b3\u03b4\u0005\u0003\u0000\u0000\u03b4\u0087\u0001"+
		"\u0000\u0000\u0000x\u008b\u0094\u009a\u00b1\u00b9\u00be\u00c2\u00ca\u00cd"+
		"\u00d2\u00d8\u00da\u00e7\u00ec\u00f5\u00fa\u00fe\u0102\u0110\u0113\u0117"+
		"\u0120\u0123\u0125\u012e\u0136\u013b\u0141\u0146\u014a\u0151\u0153\u0155"+
		"\u0158\u0160\u016d\u017a\u017e\u0184\u018f\u0192\u0198\u019a\u01a4\u01ad"+
		"\u01b6\u01ba\u01c1\u01c3\u01c9\u01cf\u01d8\u01df\u01e7\u01eb\u01ef\u01f3"+
		"\u01f9\u01fd\u0204\u0206\u0209\u020e\u0216\u0229\u0231\u0233\u023b\u0243"+
		"\u0248\u024e\u0255\u0261\u0266\u0269\u0273\u027a\u0284\u0288\u028f\u0297"+
		"\u029f\u02a1\u02a8\u02ac\u02b0\u02b5\u02b9\u02bf\u02c3\u02c9\u02ce\u02d3"+
		"\u02db\u02dd\u02e3\u02e8\u02f1\u02f6\u0301\u0309\u030e\u0321\u0328\u0330"+
		"\u0339\u0342\u0347\u034d\u0350\u0352\u035b\u0361\u036a\u036e\u0376\u0380"+
		"\u0388\u038f\u03a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}