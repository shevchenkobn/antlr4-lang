// Generated from ./OfpPashaievaShevchenko.g4 by ANTLR 4.8

package ua.nure.lnu2020.ofp_4dv507.bogdan;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OfpBogdanParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, NEW=3, LENGTH=4, COMMA=5, ASSIGN=6, EQ=7, GT=8, LT=9, 
		PLUS=10, MINUS=11, MULT=12, DIV=13, LCB=14, RCB=15, LRB=16, RRB=17, LSB=18, 
		RSB=19, DT_INT_ARR=20, DT_FLOAT_ARR=21, DT_CHAR_ARR=22, DT_BOOL=23, DT_STR=24, 
		DT_INT=25, DT_FLOAT=26, DT_CHAR=27, RETURN=28, IF=29, ELSE=30, WHILE=31, 
		VOID=32, MAIN=33, PRINT=34, PRINTLN=35, TRUE=36, FALSE=37, POSITIVE_FLOAT=38, 
		FLOAT_ZERO=39, POSITIVE_INT=40, INT_ZERO=41, STRING=42, QUOTED_CHAR=43, 
		ID=44, CHAR=45, SC=46;
	public static final int
		RULE_start = 0, RULE_mainDef = 1, RULE_funcDef = 2, RULE_funcArgs = 3, 
		RULE_datatype = 4, RULE_varDef = 5, RULE_ifDef = 6, RULE_whileDef = 7, 
		RULE_statOrBlock = 8, RULE_block = 9, RULE_stat = 10, RULE_scStat = 11, 
		RULE_assign = 12, RULE_arrSet = 13, RULE_complexExpr = 14, RULE_arrGet = 15, 
		RULE_funcCall = 16, RULE_returnExpr = 17, RULE_expr = 18, RULE_printExpr = 19, 
		RULE_printlnExpr = 20, RULE_printable = 21, RULE_intDecl = 22, RULE_floatDecl = 23, 
		RULE_charDecl = 24, RULE_boolDecl = 25, RULE_strDecl = 26, RULE_intArrDecl = 27, 
		RULE_floatArrDecl = 28, RULE_charArrDecl = 29, RULE_intDef = 30, RULE_floatDef = 31, 
		RULE_charDef = 32, RULE_boolDef = 33, RULE_strDef = 34, RULE_intArrDef = 35, 
		RULE_floatArrDef = 36, RULE_charArrDef = 37, RULE_intArrExpr = 38, RULE_floatArrExpr = 39, 
		RULE_charArrExpr = 40, RULE_intArr = 41, RULE_floatArr = 42, RULE_charArr = 43, 
		RULE_newArr = 44, RULE_lengthRead = 45, RULE_boolExpr = 46, RULE_intExpr = 47, 
		RULE_floatExpr = 48, RULE_charExpr = 49, RULE_strExpr = 50, RULE_intVal = 51, 
		RULE_floatVal = 52;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "mainDef", "funcDef", "funcArgs", "datatype", "varDef", "ifDef", 
			"whileDef", "statOrBlock", "block", "stat", "scStat", "assign", "arrSet", 
			"complexExpr", "arrGet", "funcCall", "returnExpr", "expr", "printExpr", 
			"printlnExpr", "printable", "intDecl", "floatDecl", "charDecl", "boolDecl", 
			"strDecl", "intArrDecl", "floatArrDecl", "charArrDecl", "intDef", "floatDef", 
			"charDef", "boolDef", "strDef", "intArrDef", "floatArrDef", "charArrDef", 
			"intArrExpr", "floatArrExpr", "charArrExpr", "intArr", "floatArr", "charArr", 
			"newArr", "lengthRead", "boolExpr", "intExpr", "floatExpr", "charExpr", 
			"strExpr", "intVal", "floatVal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'new'", "'.length'", "','", "'='", "'=='", "'>'", 
			"'<'", "'+'", "'-'", "'*'", "'/'", "'{'", "'}'", "'('", "')'", "'['", 
			"']'", null, null, null, "'bool'", "'string'", "'int'", "'float'", "'char'", 
			"'return'", "'if'", "'else'", "'while'", "'void'", "'main'", "'print'", 
			"'println'", "'true'", "'false'", null, null, null, "'0'", null, null, 
			null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "NEW", "LENGTH", "COMMA", "ASSIGN", "EQ", "GT", 
			"LT", "PLUS", "MINUS", "MULT", "DIV", "LCB", "RCB", "LRB", "RRB", "LSB", 
			"RSB", "DT_INT_ARR", "DT_FLOAT_ARR", "DT_CHAR_ARR", "DT_BOOL", "DT_STR", 
			"DT_INT", "DT_FLOAT", "DT_CHAR", "RETURN", "IF", "ELSE", "WHILE", "VOID", 
			"MAIN", "PRINT", "PRINTLN", "TRUE", "FALSE", "POSITIVE_FLOAT", "FLOAT_ZERO", 
			"POSITIVE_INT", "INT_ZERO", "STRING", "QUOTED_CHAR", "ID", "CHAR", "SC"
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
	public String getGrammarFileName() { return "OfpPashaievaShevchenko.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OfpBogdanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public MainDefContext mainDef() {
			return getRuleContext(MainDefContext.class,0);
		}
		public List<FuncDefContext> funcDef() {
			return getRuleContexts(FuncDefContext.class);
		}
		public FuncDefContext funcDef(int i) {
			return getRuleContext(FuncDefContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(106);
					funcDef();
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(112);
			mainDef();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DT_INT_ARR) | (1L << DT_FLOAT_ARR) | (1L << DT_CHAR_ARR) | (1L << DT_BOOL) | (1L << DT_STR) | (1L << DT_INT) | (1L << DT_FLOAT) | (1L << DT_CHAR) | (1L << VOID))) != 0)) {
				{
				{
				setState(113);
				funcDef();
				}
				}
				setState(118);
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

	public static class MainDefContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(OfpBogdanParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(OfpBogdanParser.MAIN, 0); }
		public TerminalNode LRB() { return getToken(OfpBogdanParser.LRB, 0); }
		public TerminalNode RRB() { return getToken(OfpBogdanParser.RRB, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterMainDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitMainDef(this);
		}
	}

	public final MainDefContext mainDef() throws RecognitionException {
		MainDefContext _localctx = new MainDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(VOID);
			setState(120);
			match(MAIN);
			setState(121);
			match(LRB);
			setState(122);
			match(RRB);
			setState(123);
			block();
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

	public static class FuncDefContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(OfpBogdanParser.VOID, 0); }
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public FuncArgsContext funcArgs() {
			return getRuleContext(FuncArgsContext.class,0);
		}
		public TerminalNode LCB() { return getToken(OfpBogdanParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(OfpBogdanParser.RCB, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitFuncDef(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcDef);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(125);
				match(VOID);
				setState(126);
				match(ID);
				setState(127);
				funcArgs();
				setState(128);
				match(LCB);
				setState(129);
				match(RCB);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(133);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(131);
					match(VOID);
					}
					break;
				case DT_INT_ARR:
				case DT_FLOAT_ARR:
				case DT_CHAR_ARR:
				case DT_BOOL:
				case DT_STR:
				case DT_INT:
				case DT_FLOAT:
				case DT_CHAR:
					{
					setState(132);
					datatype();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(135);
				match(ID);
				setState(136);
				funcArgs();
				setState(137);
				block();
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

	public static class FuncArgsContext extends ParserRuleContext {
		public TerminalNode LRB() { return getToken(OfpBogdanParser.LRB, 0); }
		public TerminalNode RRB() { return getToken(OfpBogdanParser.RRB, 0); }
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OfpBogdanParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OfpBogdanParser.COMMA, i);
		}
		public FuncArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterFuncArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitFuncArgs(this);
		}
	}

	public final FuncArgsContext funcArgs() throws RecognitionException {
		FuncArgsContext _localctx = new FuncArgsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(LRB);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DT_INT_ARR) | (1L << DT_FLOAT_ARR) | (1L << DT_CHAR_ARR) | (1L << DT_BOOL) | (1L << DT_STR) | (1L << DT_INT) | (1L << DT_FLOAT) | (1L << DT_CHAR))) != 0)) {
				{
				setState(142);
				varDef();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(143);
					match(COMMA);
					setState(144);
					varDef();
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(152);
			match(RRB);
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

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode DT_INT() { return getToken(OfpBogdanParser.DT_INT, 0); }
		public TerminalNode DT_FLOAT() { return getToken(OfpBogdanParser.DT_FLOAT, 0); }
		public TerminalNode DT_CHAR() { return getToken(OfpBogdanParser.DT_CHAR, 0); }
		public TerminalNode DT_BOOL() { return getToken(OfpBogdanParser.DT_BOOL, 0); }
		public TerminalNode DT_STR() { return getToken(OfpBogdanParser.DT_STR, 0); }
		public TerminalNode DT_INT_ARR() { return getToken(OfpBogdanParser.DT_INT_ARR, 0); }
		public TerminalNode DT_FLOAT_ARR() { return getToken(OfpBogdanParser.DT_FLOAT_ARR, 0); }
		public TerminalNode DT_CHAR_ARR() { return getToken(OfpBogdanParser.DT_CHAR_ARR, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitDatatype(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DT_INT_ARR) | (1L << DT_FLOAT_ARR) | (1L << DT_CHAR_ARR) | (1L << DT_BOOL) | (1L << DT_STR) | (1L << DT_INT) | (1L << DT_FLOAT) | (1L << DT_CHAR))) != 0)) ) {
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

	public static class VarDefContext extends ParserRuleContext {
		public IntDefContext intDef() {
			return getRuleContext(IntDefContext.class,0);
		}
		public FloatDefContext floatDef() {
			return getRuleContext(FloatDefContext.class,0);
		}
		public CharDefContext charDef() {
			return getRuleContext(CharDefContext.class,0);
		}
		public BoolDefContext boolDef() {
			return getRuleContext(BoolDefContext.class,0);
		}
		public StrDefContext strDef() {
			return getRuleContext(StrDefContext.class,0);
		}
		public IntArrDefContext intArrDef() {
			return getRuleContext(IntArrDefContext.class,0);
		}
		public FloatArrDefContext floatArrDef() {
			return getRuleContext(FloatArrDefContext.class,0);
		}
		public CharArrDefContext charArrDef() {
			return getRuleContext(CharArrDefContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitVarDef(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDef);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DT_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				intDef();
				}
				break;
			case DT_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				floatDef();
				}
				break;
			case DT_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				charDef();
				}
				break;
			case DT_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				boolDef();
				}
				break;
			case DT_STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				strDef();
				}
				break;
			case DT_INT_ARR:
				enterOuterAlt(_localctx, 6);
				{
				setState(161);
				intArrDef();
				}
				break;
			case DT_FLOAT_ARR:
				enterOuterAlt(_localctx, 7);
				{
				setState(162);
				floatArrDef();
				}
				break;
			case DT_CHAR_ARR:
				enterOuterAlt(_localctx, 8);
				{
				setState(163);
				charArrDef();
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

	public static class IfDefContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(OfpBogdanParser.IF, 0); }
		public TerminalNode LRB() { return getToken(OfpBogdanParser.LRB, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode RRB() { return getToken(OfpBogdanParser.RRB, 0); }
		public List<StatOrBlockContext> statOrBlock() {
			return getRuleContexts(StatOrBlockContext.class);
		}
		public StatOrBlockContext statOrBlock(int i) {
			return getRuleContext(StatOrBlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(OfpBogdanParser.ELSE, 0); }
		public IfDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterIfDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitIfDef(this);
		}
	}

	public final IfDefContext ifDef() throws RecognitionException {
		IfDefContext _localctx = new IfDefContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(IF);
			setState(167);
			match(LRB);
			setState(168);
			boolExpr(0);
			setState(169);
			match(RRB);
			setState(170);
			statOrBlock();
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(171);
				match(ELSE);
				setState(172);
				statOrBlock();
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

	public static class WhileDefContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(OfpBogdanParser.WHILE, 0); }
		public TerminalNode LRB() { return getToken(OfpBogdanParser.LRB, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode RRB() { return getToken(OfpBogdanParser.RRB, 0); }
		public StatOrBlockContext statOrBlock() {
			return getRuleContext(StatOrBlockContext.class,0);
		}
		public WhileDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterWhileDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitWhileDef(this);
		}
	}

	public final WhileDefContext whileDef() throws RecognitionException {
		WhileDefContext _localctx = new WhileDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(WHILE);
			setState(176);
			match(LRB);
			setState(177);
			boolExpr(0);
			setState(178);
			match(RRB);
			setState(179);
			statOrBlock();
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

	public static class StatOrBlockContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatOrBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statOrBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterStatOrBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitStatOrBlock(this);
		}
	}

	public final StatOrBlockContext statOrBlock() throws RecognitionException {
		StatOrBlockContext _localctx = new StatOrBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statOrBlock);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DT_INT_ARR:
			case DT_FLOAT_ARR:
			case DT_CHAR_ARR:
			case DT_BOOL:
			case DT_STR:
			case DT_INT:
			case DT_FLOAT:
			case DT_CHAR:
			case RETURN:
			case IF:
			case WHILE:
			case PRINT:
			case PRINTLN:
			case ID:
			case SC:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				stat();
				}
				break;
			case LCB:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCB() { return getToken(OfpBogdanParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(OfpBogdanParser.RCB, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(LCB);
			setState(187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(186);
				stat();
				}
				}
				setState(189); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DT_INT_ARR) | (1L << DT_FLOAT_ARR) | (1L << DT_CHAR_ARR) | (1L << DT_BOOL) | (1L << DT_STR) | (1L << DT_INT) | (1L << DT_FLOAT) | (1L << DT_CHAR) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << PRINTLN) | (1L << ID) | (1L << SC))) != 0) );
			setState(191);
			match(RCB);
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

	public static class StatContext extends ParserRuleContext {
		public ScStatContext scStat() {
			return getRuleContext(ScStatContext.class,0);
		}
		public IfDefContext ifDef() {
			return getRuleContext(IfDefContext.class,0);
		}
		public WhileDefContext whileDef() {
			return getRuleContext(WhileDefContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stat);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DT_INT_ARR:
			case DT_FLOAT_ARR:
			case DT_CHAR_ARR:
			case DT_BOOL:
			case DT_STR:
			case DT_INT:
			case DT_FLOAT:
			case DT_CHAR:
			case RETURN:
			case PRINT:
			case PRINTLN:
			case ID:
			case SC:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				scStat();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				ifDef();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				whileDef();
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

	public static class ScStatContext extends ParserRuleContext {
		public TerminalNode SC() { return getToken(OfpBogdanParser.SC, 0); }
		public IntDeclContext intDecl() {
			return getRuleContext(IntDeclContext.class,0);
		}
		public FloatDeclContext floatDecl() {
			return getRuleContext(FloatDeclContext.class,0);
		}
		public CharDeclContext charDecl() {
			return getRuleContext(CharDeclContext.class,0);
		}
		public BoolDeclContext boolDecl() {
			return getRuleContext(BoolDeclContext.class,0);
		}
		public StrDeclContext strDecl() {
			return getRuleContext(StrDeclContext.class,0);
		}
		public IntArrDeclContext intArrDecl() {
			return getRuleContext(IntArrDeclContext.class,0);
		}
		public FloatArrDeclContext floatArrDecl() {
			return getRuleContext(FloatArrDeclContext.class,0);
		}
		public CharArrDeclContext charArrDecl() {
			return getRuleContext(CharArrDeclContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ArrSetContext arrSet() {
			return getRuleContext(ArrSetContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ReturnExprContext returnExpr() {
			return getRuleContext(ReturnExprContext.class,0);
		}
		public PrintExprContext printExpr() {
			return getRuleContext(PrintExprContext.class,0);
		}
		public PrintlnExprContext printlnExpr() {
			return getRuleContext(PrintlnExprContext.class,0);
		}
		public ScStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterScStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitScStat(this);
		}
	}

	public final ScStatContext scStat() throws RecognitionException {
		ScStatContext _localctx = new ScStatContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_scStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(198);
				intDecl();
				}
				break;
			case 2:
				{
				setState(199);
				floatDecl();
				}
				break;
			case 3:
				{
				setState(200);
				charDecl();
				}
				break;
			case 4:
				{
				setState(201);
				boolDecl();
				}
				break;
			case 5:
				{
				setState(202);
				strDecl();
				}
				break;
			case 6:
				{
				setState(203);
				intArrDecl();
				}
				break;
			case 7:
				{
				setState(204);
				floatArrDecl();
				}
				break;
			case 8:
				{
				setState(205);
				charArrDecl();
				}
				break;
			case 9:
				{
				setState(206);
				assign();
				}
				break;
			case 10:
				{
				setState(207);
				arrSet();
				}
				break;
			case 11:
				{
				setState(208);
				funcCall();
				}
				break;
			case 12:
				{
				setState(209);
				returnExpr();
				}
				break;
			case 13:
				{
				setState(210);
				printExpr();
				}
				break;
			case 14:
				{
				setState(211);
				printlnExpr();
				}
				break;
			case 15:
				{
				}
				break;
			}
			setState(215);
			match(SC);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(OfpBogdanParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(ID);
			setState(218);
			match(ASSIGN);
			setState(219);
			expr();
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

	public static class ArrSetContext extends ParserRuleContext {
		public ArrGetContext arrGet() {
			return getRuleContext(ArrGetContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(OfpBogdanParser.ASSIGN, 0); }
		public ComplexExprContext complexExpr() {
			return getRuleContext(ComplexExprContext.class,0);
		}
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public FloatExprContext floatExpr() {
			return getRuleContext(FloatExprContext.class,0);
		}
		public CharExprContext charExpr() {
			return getRuleContext(CharExprContext.class,0);
		}
		public ArrSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterArrSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitArrSet(this);
		}
	}

	public final ArrSetContext arrSet() throws RecognitionException {
		ArrSetContext _localctx = new ArrSetContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			arrGet();
			setState(222);
			match(ASSIGN);
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(223);
				complexExpr();
				}
				break;
			case 2:
				{
				setState(224);
				intExpr(0);
				}
				break;
			case 3:
				{
				setState(225);
				floatExpr(0);
				}
				break;
			case 4:
				{
				setState(226);
				charExpr();
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

	public static class ComplexExprContext extends ParserRuleContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ArrGetContext arrGet() {
			return getRuleContext(ArrGetContext.class,0);
		}
		public ComplexExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterComplexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitComplexExpr(this);
		}
	}

	public final ComplexExprContext complexExpr() throws RecognitionException {
		ComplexExprContext _localctx = new ComplexExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_complexExpr);
		try {
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				arrGet();
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

	public static class ArrGetContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public TerminalNode LSB() { return getToken(OfpBogdanParser.LSB, 0); }
		public TerminalNode RSB() { return getToken(OfpBogdanParser.RSB, 0); }
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public ComplexExprContext complexExpr() {
			return getRuleContext(ComplexExprContext.class,0);
		}
		public ArrGetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrGet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterArrGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitArrGet(this);
		}
	}

	public final ArrGetContext arrGet() throws RecognitionException {
		ArrGetContext _localctx = new ArrGetContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrGet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(ID);
			setState(234);
			match(LSB);
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(235);
				intExpr(0);
				}
				break;
			case 2:
				{
				setState(236);
				complexExpr();
				}
				break;
			}
			setState(239);
			match(RSB);
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

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public TerminalNode LRB() { return getToken(OfpBogdanParser.LRB, 0); }
		public TerminalNode RRB() { return getToken(OfpBogdanParser.RRB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OfpBogdanParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OfpBogdanParser.COMMA, i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitFuncCall(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(ID);
			setState(242);
			match(LRB);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << MINUS) | (1L << LCB) | (1L << LRB) | (1L << TRUE) | (1L << FALSE) | (1L << POSITIVE_FLOAT) | (1L << FLOAT_ZERO) | (1L << POSITIVE_INT) | (1L << INT_ZERO) | (1L << STRING) | (1L << QUOTED_CHAR) | (1L << ID))) != 0)) {
				{
				setState(243);
				expr();
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(244);
					match(COMMA);
					setState(245);
					expr();
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(253);
			match(RRB);
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

	public static class ReturnExprContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(OfpBogdanParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterReturnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitReturnExpr(this);
		}
	}

	public final ReturnExprContext returnExpr() throws RecognitionException {
		ReturnExprContext _localctx = new ReturnExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(RETURN);
			setState(256);
			expr();
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

	public static class ExprContext extends ParserRuleContext {
		public ComplexExprContext complexExpr() {
			return getRuleContext(ComplexExprContext.class,0);
		}
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public CharExprContext charExpr() {
			return getRuleContext(CharExprContext.class,0);
		}
		public FloatExprContext floatExpr() {
			return getRuleContext(FloatExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public StrExprContext strExpr() {
			return getRuleContext(StrExprContext.class,0);
		}
		public IntArrExprContext intArrExpr() {
			return getRuleContext(IntArrExprContext.class,0);
		}
		public FloatArrExprContext floatArrExpr() {
			return getRuleContext(FloatArrExprContext.class,0);
		}
		public CharArrExprContext charArrExpr() {
			return getRuleContext(CharArrExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				complexExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				intExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				charExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				floatExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				boolExpr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(263);
				strExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(264);
				intArrExpr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(265);
				floatArrExpr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(266);
				charArrExpr();
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

	public static class PrintExprContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(OfpBogdanParser.PRINT, 0); }
		public TerminalNode LRB() { return getToken(OfpBogdanParser.LRB, 0); }
		public PrintableContext printable() {
			return getRuleContext(PrintableContext.class,0);
		}
		public TerminalNode RRB() { return getToken(OfpBogdanParser.RRB, 0); }
		public PrintExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitPrintExpr(this);
		}
	}

	public final PrintExprContext printExpr() throws RecognitionException {
		PrintExprContext _localctx = new PrintExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_printExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(PRINT);
			setState(270);
			match(LRB);
			setState(271);
			printable();
			setState(272);
			match(RRB);
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

	public static class PrintlnExprContext extends ParserRuleContext {
		public TerminalNode PRINTLN() { return getToken(OfpBogdanParser.PRINTLN, 0); }
		public TerminalNode LRB() { return getToken(OfpBogdanParser.LRB, 0); }
		public PrintableContext printable() {
			return getRuleContext(PrintableContext.class,0);
		}
		public TerminalNode RRB() { return getToken(OfpBogdanParser.RRB, 0); }
		public PrintlnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printlnExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterPrintlnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitPrintlnExpr(this);
		}
	}

	public final PrintlnExprContext printlnExpr() throws RecognitionException {
		PrintlnExprContext _localctx = new PrintlnExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_printlnExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(PRINTLN);
			setState(275);
			match(LRB);
			setState(276);
			printable();
			setState(277);
			match(RRB);
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

	public static class PrintableContext extends ParserRuleContext {
		public ComplexExprContext complexExpr() {
			return getRuleContext(ComplexExprContext.class,0);
		}
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public FloatExprContext floatExpr() {
			return getRuleContext(FloatExprContext.class,0);
		}
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public CharExprContext charExpr() {
			return getRuleContext(CharExprContext.class,0);
		}
		public StrExprContext strExpr() {
			return getRuleContext(StrExprContext.class,0);
		}
		public PrintableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterPrintable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitPrintable(this);
		}
	}

	public final PrintableContext printable() throws RecognitionException {
		PrintableContext _localctx = new PrintableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_printable);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				complexExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				intExpr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281);
				floatExpr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				boolExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(283);
				charExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(284);
				strExpr();
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

	public static class IntDeclContext extends ParserRuleContext {
		public IntDefContext intDef() {
			return getRuleContext(IntDefContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(OfpBogdanParser.ASSIGN, 0); }
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public IntDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterIntDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitIntDecl(this);
		}
	}

	public final IntDeclContext intDecl() throws RecognitionException {
		IntDeclContext _localctx = new IntDeclContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_intDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			intDef();
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(288);
				match(ASSIGN);
				setState(289);
				intExpr(0);
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

	public static class FloatDeclContext extends ParserRuleContext {
		public FloatDefContext floatDef() {
			return getRuleContext(FloatDefContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(OfpBogdanParser.ASSIGN, 0); }
		public FloatExprContext floatExpr() {
			return getRuleContext(FloatExprContext.class,0);
		}
		public FloatDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterFloatDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitFloatDecl(this);
		}
	}

	public final FloatDeclContext floatDecl() throws RecognitionException {
		FloatDeclContext _localctx = new FloatDeclContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_floatDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			floatDef();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(293);
				match(ASSIGN);
				setState(294);
				floatExpr(0);
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

	public static class CharDeclContext extends ParserRuleContext {
		public CharDefContext charDef() {
			return getRuleContext(CharDefContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(OfpBogdanParser.ASSIGN, 0); }
		public CharExprContext charExpr() {
			return getRuleContext(CharExprContext.class,0);
		}
		public CharDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterCharDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitCharDecl(this);
		}
	}

	public final CharDeclContext charDecl() throws RecognitionException {
		CharDeclContext _localctx = new CharDeclContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_charDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			charDef();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(298);
				match(ASSIGN);
				setState(299);
				charExpr();
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

	public static class BoolDeclContext extends ParserRuleContext {
		public BoolDefContext boolDef() {
			return getRuleContext(BoolDefContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(OfpBogdanParser.ASSIGN, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BoolDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterBoolDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitBoolDecl(this);
		}
	}

	public final BoolDeclContext boolDecl() throws RecognitionException {
		BoolDeclContext _localctx = new BoolDeclContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_boolDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			boolDef();
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(303);
				match(ASSIGN);
				setState(304);
				boolExpr(0);
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

	public static class StrDeclContext extends ParserRuleContext {
		public StrDefContext strDef() {
			return getRuleContext(StrDefContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(OfpBogdanParser.ASSIGN, 0); }
		public StrExprContext strExpr() {
			return getRuleContext(StrExprContext.class,0);
		}
		public StrDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterStrDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitStrDecl(this);
		}
	}

	public final StrDeclContext strDecl() throws RecognitionException {
		StrDeclContext _localctx = new StrDeclContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_strDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			strDef();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(308);
				match(ASSIGN);
				setState(309);
				strExpr();
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

	public static class IntArrDeclContext extends ParserRuleContext {
		public IntArrDefContext intArrDef() {
			return getRuleContext(IntArrDefContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(OfpBogdanParser.ASSIGN, 0); }
		public IntArrExprContext intArrExpr() {
			return getRuleContext(IntArrExprContext.class,0);
		}
		public IntArrDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intArrDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterIntArrDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitIntArrDecl(this);
		}
	}

	public final IntArrDeclContext intArrDecl() throws RecognitionException {
		IntArrDeclContext _localctx = new IntArrDeclContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_intArrDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			intArrDef();
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(313);
				match(ASSIGN);
				setState(314);
				intArrExpr();
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

	public static class FloatArrDeclContext extends ParserRuleContext {
		public FloatArrDefContext floatArrDef() {
			return getRuleContext(FloatArrDefContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(OfpBogdanParser.ASSIGN, 0); }
		public FloatArrExprContext floatArrExpr() {
			return getRuleContext(FloatArrExprContext.class,0);
		}
		public FloatArrDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatArrDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterFloatArrDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitFloatArrDecl(this);
		}
	}

	public final FloatArrDeclContext floatArrDecl() throws RecognitionException {
		FloatArrDeclContext _localctx = new FloatArrDeclContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_floatArrDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			floatArrDef();
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(318);
				match(ASSIGN);
				setState(319);
				floatArrExpr();
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

	public static class CharArrDeclContext extends ParserRuleContext {
		public CharArrDefContext charArrDef() {
			return getRuleContext(CharArrDefContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(OfpBogdanParser.ASSIGN, 0); }
		public CharArrExprContext charArrExpr() {
			return getRuleContext(CharArrExprContext.class,0);
		}
		public CharArrDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charArrDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterCharArrDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitCharArrDecl(this);
		}
	}

	public final CharArrDeclContext charArrDecl() throws RecognitionException {
		CharArrDeclContext _localctx = new CharArrDeclContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_charArrDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			charArrDef();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(323);
				match(ASSIGN);
				setState(324);
				charArrExpr();
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

	public static class IntDefContext extends ParserRuleContext {
		public TerminalNode DT_INT() { return getToken(OfpBogdanParser.DT_INT, 0); }
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public IntDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterIntDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitIntDef(this);
		}
	}

	public final IntDefContext intDef() throws RecognitionException {
		IntDefContext _localctx = new IntDefContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_intDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(DT_INT);
			setState(328);
			match(ID);
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

	public static class FloatDefContext extends ParserRuleContext {
		public TerminalNode DT_FLOAT() { return getToken(OfpBogdanParser.DT_FLOAT, 0); }
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public FloatDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterFloatDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitFloatDef(this);
		}
	}

	public final FloatDefContext floatDef() throws RecognitionException {
		FloatDefContext _localctx = new FloatDefContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_floatDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(DT_FLOAT);
			setState(331);
			match(ID);
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

	public static class CharDefContext extends ParserRuleContext {
		public TerminalNode DT_CHAR() { return getToken(OfpBogdanParser.DT_CHAR, 0); }
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public CharDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterCharDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitCharDef(this);
		}
	}

	public final CharDefContext charDef() throws RecognitionException {
		CharDefContext _localctx = new CharDefContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_charDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(DT_CHAR);
			setState(334);
			match(ID);
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

	public static class BoolDefContext extends ParserRuleContext {
		public TerminalNode DT_BOOL() { return getToken(OfpBogdanParser.DT_BOOL, 0); }
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public BoolDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterBoolDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitBoolDef(this);
		}
	}

	public final BoolDefContext boolDef() throws RecognitionException {
		BoolDefContext _localctx = new BoolDefContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_boolDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(DT_BOOL);
			setState(337);
			match(ID);
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

	public static class StrDefContext extends ParserRuleContext {
		public TerminalNode DT_STR() { return getToken(OfpBogdanParser.DT_STR, 0); }
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public StrDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterStrDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitStrDef(this);
		}
	}

	public final StrDefContext strDef() throws RecognitionException {
		StrDefContext _localctx = new StrDefContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_strDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(DT_STR);
			setState(340);
			match(ID);
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

	public static class IntArrDefContext extends ParserRuleContext {
		public TerminalNode DT_INT_ARR() { return getToken(OfpBogdanParser.DT_INT_ARR, 0); }
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public IntArrDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intArrDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterIntArrDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitIntArrDef(this);
		}
	}

	public final IntArrDefContext intArrDef() throws RecognitionException {
		IntArrDefContext _localctx = new IntArrDefContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_intArrDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(DT_INT_ARR);
			setState(343);
			match(ID);
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

	public static class FloatArrDefContext extends ParserRuleContext {
		public TerminalNode DT_FLOAT_ARR() { return getToken(OfpBogdanParser.DT_FLOAT_ARR, 0); }
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public FloatArrDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatArrDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterFloatArrDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitFloatArrDef(this);
		}
	}

	public final FloatArrDefContext floatArrDef() throws RecognitionException {
		FloatArrDefContext _localctx = new FloatArrDefContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_floatArrDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(DT_FLOAT_ARR);
			setState(346);
			match(ID);
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

	public static class CharArrDefContext extends ParserRuleContext {
		public TerminalNode DT_CHAR_ARR() { return getToken(OfpBogdanParser.DT_CHAR_ARR, 0); }
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public CharArrDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charArrDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterCharArrDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitCharArrDef(this);
		}
	}

	public final CharArrDefContext charArrDef() throws RecognitionException {
		CharArrDefContext _localctx = new CharArrDefContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_charArrDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(DT_CHAR_ARR);
			setState(349);
			match(ID);
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

	public static class IntArrExprContext extends ParserRuleContext {
		public IntArrContext intArr() {
			return getRuleContext(IntArrContext.class,0);
		}
		public NewArrContext newArr() {
			return getRuleContext(NewArrContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public IntArrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intArrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterIntArrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitIntArrExpr(this);
		}
	}

	public final IntArrExprContext intArrExpr() throws RecognitionException {
		IntArrExprContext _localctx = new IntArrExprContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_intArrExpr);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				intArr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				newArr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(353);
				funcCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				match(ID);
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

	public static class FloatArrExprContext extends ParserRuleContext {
		public FloatArrContext floatArr() {
			return getRuleContext(FloatArrContext.class,0);
		}
		public NewArrContext newArr() {
			return getRuleContext(NewArrContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public FloatArrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatArrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterFloatArrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitFloatArrExpr(this);
		}
	}

	public final FloatArrExprContext floatArrExpr() throws RecognitionException {
		FloatArrExprContext _localctx = new FloatArrExprContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_floatArrExpr);
		try {
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				floatArr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				newArr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				funcCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				match(ID);
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

	public static class CharArrExprContext extends ParserRuleContext {
		public CharArrContext charArr() {
			return getRuleContext(CharArrContext.class,0);
		}
		public NewArrContext newArr() {
			return getRuleContext(NewArrContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public CharArrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charArrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterCharArrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitCharArrExpr(this);
		}
	}

	public final CharArrExprContext charArrExpr() throws RecognitionException {
		CharArrExprContext _localctx = new CharArrExprContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_charArrExpr);
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				charArr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				newArr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				funcCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(366);
				match(ID);
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

	public static class IntArrContext extends ParserRuleContext {
		public TerminalNode LCB() { return getToken(OfpBogdanParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(OfpBogdanParser.RCB, 0); }
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OfpBogdanParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OfpBogdanParser.COMMA, i);
		}
		public IntArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterIntArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitIntArr(this);
		}
	}

	public final IntArrContext intArr() throws RecognitionException {
		IntArrContext _localctx = new IntArrContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_intArr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(LCB);
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LCB) | (1L << LRB) | (1L << POSITIVE_INT) | (1L << INT_ZERO) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(370);
				intExpr(0);
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(371);
					match(COMMA);
					setState(372);
					intExpr(0);
					}
					}
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(380);
			match(RCB);
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

	public static class FloatArrContext extends ParserRuleContext {
		public TerminalNode LCB() { return getToken(OfpBogdanParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(OfpBogdanParser.RCB, 0); }
		public List<FloatExprContext> floatExpr() {
			return getRuleContexts(FloatExprContext.class);
		}
		public FloatExprContext floatExpr(int i) {
			return getRuleContext(FloatExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OfpBogdanParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OfpBogdanParser.COMMA, i);
		}
		public FloatArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterFloatArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitFloatArr(this);
		}
	}

	public final FloatArrContext floatArr() throws RecognitionException {
		FloatArrContext _localctx = new FloatArrContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_floatArr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(LCB);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LRB) | (1L << POSITIVE_FLOAT) | (1L << FLOAT_ZERO) | (1L << ID))) != 0)) {
				{
				setState(383);
				floatExpr(0);
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(384);
					match(COMMA);
					setState(385);
					floatExpr(0);
					}
					}
					setState(390);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(393);
			match(RCB);
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

	public static class CharArrContext extends ParserRuleContext {
		public TerminalNode LCB() { return getToken(OfpBogdanParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(OfpBogdanParser.RCB, 0); }
		public List<CharExprContext> charExpr() {
			return getRuleContexts(CharExprContext.class);
		}
		public CharExprContext charExpr(int i) {
			return getRuleContext(CharExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OfpBogdanParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OfpBogdanParser.COMMA, i);
		}
		public CharArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterCharArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitCharArr(this);
		}
	}

	public final CharArrContext charArr() throws RecognitionException {
		CharArrContext _localctx = new CharArrContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_charArr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(LCB);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUOTED_CHAR || _la==ID) {
				{
				setState(396);
				charExpr();
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(397);
					match(COMMA);
					setState(398);
					charExpr();
					}
					}
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(406);
			match(RCB);
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

	public static class NewArrContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(OfpBogdanParser.NEW, 0); }
		public TerminalNode LSB() { return getToken(OfpBogdanParser.LSB, 0); }
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public TerminalNode RSB() { return getToken(OfpBogdanParser.RSB, 0); }
		public TerminalNode DT_INT() { return getToken(OfpBogdanParser.DT_INT, 0); }
		public TerminalNode DT_FLOAT() { return getToken(OfpBogdanParser.DT_FLOAT, 0); }
		public TerminalNode DT_CHAR() { return getToken(OfpBogdanParser.DT_CHAR, 0); }
		public NewArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterNewArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitNewArr(this);
		}
	}

	public final NewArrContext newArr() throws RecognitionException {
		NewArrContext _localctx = new NewArrContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_newArr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(NEW);
			setState(409);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DT_INT) | (1L << DT_FLOAT) | (1L << DT_CHAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(410);
			match(LSB);
			setState(411);
			intExpr(0);
			setState(412);
			match(RSB);
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

	public static class LengthReadContext extends ParserRuleContext {
		public TerminalNode LENGTH() { return getToken(OfpBogdanParser.LENGTH, 0); }
		public IntArrContext intArr() {
			return getRuleContext(IntArrContext.class,0);
		}
		public FloatArrContext floatArr() {
			return getRuleContext(FloatArrContext.class,0);
		}
		public CharArrContext charArr() {
			return getRuleContext(CharArrContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode STRING() { return getToken(OfpBogdanParser.STRING, 0); }
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public LengthReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterLengthRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitLengthRead(this);
		}
	}

	public final LengthReadContext lengthRead() throws RecognitionException {
		LengthReadContext _localctx = new LengthReadContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_lengthRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(414);
				intArr();
				}
				break;
			case 2:
				{
				setState(415);
				floatArr();
				}
				break;
			case 3:
				{
				setState(416);
				charArr();
				}
				break;
			case 4:
				{
				setState(417);
				funcCall();
				}
				break;
			case 5:
				{
				setState(418);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(419);
				match(ID);
				}
				break;
			}
			setState(422);
			match(LENGTH);
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

	public static class BoolExprContext extends ParserRuleContext {
		public TerminalNode LRB() { return getToken(OfpBogdanParser.LRB, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode RRB() { return getToken(OfpBogdanParser.RRB, 0); }
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(OfpBogdanParser.EQ, 0); }
		public TerminalNode GT() { return getToken(OfpBogdanParser.GT, 0); }
		public TerminalNode LT() { return getToken(OfpBogdanParser.LT, 0); }
		public List<FloatExprContext> floatExpr() {
			return getRuleContexts(FloatExprContext.class);
		}
		public FloatExprContext floatExpr(int i) {
			return getRuleContext(FloatExprContext.class,i);
		}
		public List<CharExprContext> charExpr() {
			return getRuleContexts(CharExprContext.class);
		}
		public CharExprContext charExpr(int i) {
			return getRuleContext(CharExprContext.class,i);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(OfpBogdanParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OfpBogdanParser.FALSE, 0); }
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitBoolExpr(this);
		}
	}

	public final BoolExprContext boolExpr() throws RecognitionException {
		return boolExpr(0);
	}

	private BoolExprContext boolExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExprContext _localctx = new BoolExprContext(_ctx, _parentState);
		BoolExprContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_boolExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(425);
				match(LRB);
				setState(426);
				boolExpr(0);
				setState(427);
				match(RRB);
				}
				break;
			case 2:
				{
				setState(429);
				intExpr(0);
				setState(430);
				match(EQ);
				setState(431);
				intExpr(0);
				}
				break;
			case 3:
				{
				setState(433);
				intExpr(0);
				setState(434);
				match(GT);
				setState(435);
				intExpr(0);
				}
				break;
			case 4:
				{
				setState(437);
				intExpr(0);
				setState(438);
				match(LT);
				setState(439);
				intExpr(0);
				}
				break;
			case 5:
				{
				setState(441);
				floatExpr(0);
				setState(442);
				match(EQ);
				setState(443);
				floatExpr(0);
				}
				break;
			case 6:
				{
				setState(445);
				floatExpr(0);
				setState(446);
				match(GT);
				setState(447);
				floatExpr(0);
				}
				break;
			case 7:
				{
				setState(449);
				floatExpr(0);
				setState(450);
				match(LT);
				setState(451);
				floatExpr(0);
				}
				break;
			case 8:
				{
				setState(453);
				charExpr();
				setState(454);
				match(EQ);
				setState(455);
				charExpr();
				}
				break;
			case 9:
				{
				setState(457);
				funcCall();
				}
				break;
			case 10:
				{
				setState(458);
				match(TRUE);
				}
				break;
			case 11:
				{
				setState(459);
				match(FALSE);
				}
				break;
			case 12:
				{
				setState(460);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
					setState(463);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(464);
					match(EQ);
					setState(465);
					boolExpr(6);
					}
					} 
				}
				setState(470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class IntExprContext extends ParserRuleContext {
		public TerminalNode LRB() { return getToken(OfpBogdanParser.LRB, 0); }
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public TerminalNode RRB() { return getToken(OfpBogdanParser.RRB, 0); }
		public ComplexExprContext complexExpr() {
			return getRuleContext(ComplexExprContext.class,0);
		}
		public LengthReadContext lengthRead() {
			return getRuleContext(LengthReadContext.class,0);
		}
		public IntValContext intVal() {
			return getRuleContext(IntValContext.class,0);
		}
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public TerminalNode MULT() { return getToken(OfpBogdanParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(OfpBogdanParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(OfpBogdanParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(OfpBogdanParser.MINUS, 0); }
		public IntExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitIntExpr(this);
		}
	}

	public final IntExprContext intExpr() throws RecognitionException {
		return intExpr(0);
	}

	private IntExprContext intExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntExprContext _localctx = new IntExprContext(_ctx, _parentState);
		IntExprContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_intExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(472);
				match(LRB);
				setState(473);
				intExpr(0);
				setState(474);
				match(RRB);
				}
				break;
			case 2:
				{
				setState(476);
				complexExpr();
				}
				break;
			case 3:
				{
				setState(477);
				lengthRead();
				}
				break;
			case 4:
				{
				setState(478);
				intVal();
				}
				break;
			case 5:
				{
				setState(479);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(488);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new IntExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(482);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(483);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(484);
						intExpr(7);
						}
						break;
					case 2:
						{
						_localctx = new IntExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(485);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(486);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(487);
						intExpr(6);
						}
						break;
					}
					} 
				}
				setState(492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class FloatExprContext extends ParserRuleContext {
		public TerminalNode LRB() { return getToken(OfpBogdanParser.LRB, 0); }
		public List<FloatExprContext> floatExpr() {
			return getRuleContexts(FloatExprContext.class);
		}
		public FloatExprContext floatExpr(int i) {
			return getRuleContext(FloatExprContext.class,i);
		}
		public TerminalNode RRB() { return getToken(OfpBogdanParser.RRB, 0); }
		public ComplexExprContext complexExpr() {
			return getRuleContext(ComplexExprContext.class,0);
		}
		public FloatValContext floatVal() {
			return getRuleContext(FloatValContext.class,0);
		}
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public TerminalNode MULT() { return getToken(OfpBogdanParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(OfpBogdanParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(OfpBogdanParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(OfpBogdanParser.MINUS, 0); }
		public FloatExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterFloatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitFloatExpr(this);
		}
	}

	public final FloatExprContext floatExpr() throws RecognitionException {
		return floatExpr(0);
	}

	private FloatExprContext floatExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FloatExprContext _localctx = new FloatExprContext(_ctx, _parentState);
		FloatExprContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_floatExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(494);
				match(LRB);
				setState(495);
				floatExpr(0);
				setState(496);
				match(RRB);
				}
				break;
			case 2:
				{
				setState(498);
				complexExpr();
				}
				break;
			case 3:
				{
				setState(499);
				floatVal();
				}
				break;
			case 4:
				{
				setState(500);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(509);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new FloatExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_floatExpr);
						setState(503);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(504);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(505);
						floatExpr(6);
						}
						break;
					case 2:
						{
						_localctx = new FloatExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_floatExpr);
						setState(506);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(507);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(508);
						floatExpr(5);
						}
						break;
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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

	public static class CharExprContext extends ParserRuleContext {
		public ComplexExprContext complexExpr() {
			return getRuleContext(ComplexExprContext.class,0);
		}
		public TerminalNode QUOTED_CHAR() { return getToken(OfpBogdanParser.QUOTED_CHAR, 0); }
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public CharExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterCharExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitCharExpr(this);
		}
	}

	public final CharExprContext charExpr() throws RecognitionException {
		CharExprContext _localctx = new CharExprContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_charExpr);
		try {
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				complexExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				match(QUOTED_CHAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				match(ID);
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

	public static class StrExprContext extends ParserRuleContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode STRING() { return getToken(OfpBogdanParser.STRING, 0); }
		public TerminalNode ID() { return getToken(OfpBogdanParser.ID, 0); }
		public StrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitStrExpr(this);
		}
	}

	public final StrExprContext strExpr() throws RecognitionException {
		StrExprContext _localctx = new StrExprContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_strExpr);
		try {
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(521);
				match(ID);
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

	public static class IntValContext extends ParserRuleContext {
		public TerminalNode INT_ZERO() { return getToken(OfpBogdanParser.INT_ZERO, 0); }
		public TerminalNode POSITIVE_INT() { return getToken(OfpBogdanParser.POSITIVE_INT, 0); }
		public TerminalNode MINUS() { return getToken(OfpBogdanParser.MINUS, 0); }
		public IntValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterIntVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitIntVal(this);
		}
	}

	public final IntValContext intVal() throws RecognitionException {
		IntValContext _localctx = new IntValContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_intVal);
		int _la;
		try {
			setState(529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				match(INT_ZERO);
				}
				break;
			case MINUS:
			case POSITIVE_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(525);
					match(MINUS);
					}
				}

				setState(528);
				match(POSITIVE_INT);
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

	public static class FloatValContext extends ParserRuleContext {
		public TerminalNode FLOAT_ZERO() { return getToken(OfpBogdanParser.FLOAT_ZERO, 0); }
		public TerminalNode POSITIVE_FLOAT() { return getToken(OfpBogdanParser.POSITIVE_FLOAT, 0); }
		public TerminalNode MINUS() { return getToken(OfpBogdanParser.MINUS, 0); }
		public FloatValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).enterFloatVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpBogdanListener ) ((OfpBogdanListener)listener).exitFloatVal(this);
		}
	}

	public final FloatValContext floatVal() throws RecognitionException {
		FloatValContext _localctx = new FloatValContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_floatVal);
		int _la;
		try {
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT_ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				match(FLOAT_ZERO);
				}
				break;
			case MINUS:
			case POSITIVE_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(532);
					match(MINUS);
					}
				}

				setState(535);
				match(POSITIVE_FLOAT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 46:
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		case 47:
			return intExpr_sempred((IntExprContext)_localctx, predIndex);
		case 48:
			return floatExpr_sempred((FloatExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean intExpr_sempred(IntExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean floatExpr_sempred(FloatExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u021d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\7\2n\n\2\f\2\16\2q\13\2\3\2\3\2\7\2u\n\2\f"+
		"\2\16\2x\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\u0088\n\4\3\4\3\4\3\4\3\4\5\4\u008e\n\4\3\5\3\5\3\5\3\5\7\5\u0094"+
		"\n\5\f\5\16\5\u0097\13\5\5\5\u0099\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7\u00a7\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b0\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u00ba\n\n\3\13\3\13\6\13\u00be"+
		"\n\13\r\13\16\13\u00bf\3\13\3\13\3\f\3\f\3\f\5\f\u00c7\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d8\n\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e6\n\17\3\20"+
		"\3\20\5\20\u00ea\n\20\3\21\3\21\3\21\3\21\5\21\u00f0\n\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u00f9\n\22\f\22\16\22\u00fc\13\22\5\22\u00fe"+
		"\n\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u010e\n\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0120\n\27\3\30\3\30\3\30\5\30\u0125"+
		"\n\30\3\31\3\31\3\31\5\31\u012a\n\31\3\32\3\32\3\32\5\32\u012f\n\32\3"+
		"\33\3\33\3\33\5\33\u0134\n\33\3\34\3\34\3\34\5\34\u0139\n\34\3\35\3\35"+
		"\3\35\5\35\u013e\n\35\3\36\3\36\3\36\5\36\u0143\n\36\3\37\3\37\3\37\5"+
		"\37\u0148\n\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3"+
		"%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\5(\u0166\n(\3)\3)\3)\3)\5)\u016c\n"+
		")\3*\3*\3*\3*\5*\u0172\n*\3+\3+\3+\3+\7+\u0178\n+\f+\16+\u017b\13+\5+"+
		"\u017d\n+\3+\3+\3,\3,\3,\3,\7,\u0185\n,\f,\16,\u0188\13,\5,\u018a\n,\3"+
		",\3,\3-\3-\3-\3-\7-\u0192\n-\f-\16-\u0195\13-\5-\u0197\n-\3-\3-\3.\3."+
		"\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\5/\u01a7\n/\3/\3/\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\5\60\u01d0\n\60\3\60\3\60\3\60\7\60\u01d5\n\60"+
		"\f\60\16\60\u01d8\13\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5"+
		"\61\u01e3\n\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u01eb\n\61\f\61\16\61"+
		"\u01ee\13\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u01f8\n\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\7\62\u0200\n\62\f\62\16\62\u0203\13\62\3"+
		"\63\3\63\3\63\5\63\u0208\n\63\3\64\3\64\3\64\5\64\u020d\n\64\3\65\3\65"+
		"\5\65\u0211\n\65\3\65\5\65\u0214\n\65\3\66\3\66\5\66\u0218\n\66\3\66\5"+
		"\66\u021b\n\66\3\66\2\5^`b\67\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj\2\6\3\2\26\35\3\2\33\35"+
		"\3\2\16\17\3\2\f\r\2\u0256\2o\3\2\2\2\4y\3\2\2\2\6\u008d\3\2\2\2\b\u008f"+
		"\3\2\2\2\n\u009c\3\2\2\2\f\u00a6\3\2\2\2\16\u00a8\3\2\2\2\20\u00b1\3\2"+
		"\2\2\22\u00b9\3\2\2\2\24\u00bb\3\2\2\2\26\u00c6\3\2\2\2\30\u00d7\3\2\2"+
		"\2\32\u00db\3\2\2\2\34\u00df\3\2\2\2\36\u00e9\3\2\2\2 \u00eb\3\2\2\2\""+
		"\u00f3\3\2\2\2$\u0101\3\2\2\2&\u010d\3\2\2\2(\u010f\3\2\2\2*\u0114\3\2"+
		"\2\2,\u011f\3\2\2\2.\u0121\3\2\2\2\60\u0126\3\2\2\2\62\u012b\3\2\2\2\64"+
		"\u0130\3\2\2\2\66\u0135\3\2\2\28\u013a\3\2\2\2:\u013f\3\2\2\2<\u0144\3"+
		"\2\2\2>\u0149\3\2\2\2@\u014c\3\2\2\2B\u014f\3\2\2\2D\u0152\3\2\2\2F\u0155"+
		"\3\2\2\2H\u0158\3\2\2\2J\u015b\3\2\2\2L\u015e\3\2\2\2N\u0165\3\2\2\2P"+
		"\u016b\3\2\2\2R\u0171\3\2\2\2T\u0173\3\2\2\2V\u0180\3\2\2\2X\u018d\3\2"+
		"\2\2Z\u019a\3\2\2\2\\\u01a6\3\2\2\2^\u01cf\3\2\2\2`\u01e2\3\2\2\2b\u01f7"+
		"\3\2\2\2d\u0207\3\2\2\2f\u020c\3\2\2\2h\u0213\3\2\2\2j\u021a\3\2\2\2l"+
		"n\5\6\4\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2"+
		"rv\5\4\3\2su\5\6\4\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\3\3\2\2"+
		"\2xv\3\2\2\2yz\7\"\2\2z{\7#\2\2{|\7\22\2\2|}\7\23\2\2}~\5\24\13\2~\5\3"+
		"\2\2\2\177\u0080\7\"\2\2\u0080\u0081\7.\2\2\u0081\u0082\5\b\5\2\u0082"+
		"\u0083\7\20\2\2\u0083\u0084\7\21\2\2\u0084\u008e\3\2\2\2\u0085\u0088\7"+
		"\"\2\2\u0086\u0088\5\n\6\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\7.\2\2\u008a\u008b\5\b\5\2\u008b\u008c\5\24"+
		"\13\2\u008c\u008e\3\2\2\2\u008d\177\3\2\2\2\u008d\u0087\3\2\2\2\u008e"+
		"\7\3\2\2\2\u008f\u0098\7\22\2\2\u0090\u0095\5\f\7\2\u0091\u0092\7\7\2"+
		"\2\u0092\u0094\5\f\7\2\u0093\u0091\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0098"+
		"\u0090\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\23"+
		"\2\2\u009b\t\3\2\2\2\u009c\u009d\t\2\2\2\u009d\13\3\2\2\2\u009e\u00a7"+
		"\5> \2\u009f\u00a7\5@!\2\u00a0\u00a7\5B\"\2\u00a1\u00a7\5D#\2\u00a2\u00a7"+
		"\5F$\2\u00a3\u00a7\5H%\2\u00a4\u00a7\5J&\2\u00a5\u00a7\5L\'\2\u00a6\u009e"+
		"\3\2\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a6"+
		"\u00a2\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2"+
		"\2\2\u00a7\r\3\2\2\2\u00a8\u00a9\7\37\2\2\u00a9\u00aa\7\22\2\2\u00aa\u00ab"+
		"\5^\60\2\u00ab\u00ac\7\23\2\2\u00ac\u00af\5\22\n\2\u00ad\u00ae\7 \2\2"+
		"\u00ae\u00b0\5\22\n\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\17"+
		"\3\2\2\2\u00b1\u00b2\7!\2\2\u00b2\u00b3\7\22\2\2\u00b3\u00b4\5^\60\2\u00b4"+
		"\u00b5\7\23\2\2\u00b5\u00b6\5\22\n\2\u00b6\21\3\2\2\2\u00b7\u00ba\5\26"+
		"\f\2\u00b8\u00ba\5\24\13\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\23\3\2\2\2\u00bb\u00bd\7\20\2\2\u00bc\u00be\5\26\f\2\u00bd\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\7\21\2\2\u00c2\25\3\2\2\2\u00c3\u00c7\5\30"+
		"\r\2\u00c4\u00c7\5\16\b\2\u00c5\u00c7\5\20\t\2\u00c6\u00c3\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\27\3\2\2\2\u00c8\u00d8\5.\30"+
		"\2\u00c9\u00d8\5\60\31\2\u00ca\u00d8\5\62\32\2\u00cb\u00d8\5\64\33\2\u00cc"+
		"\u00d8\5\66\34\2\u00cd\u00d8\58\35\2\u00ce\u00d8\5:\36\2\u00cf\u00d8\5"+
		"<\37\2\u00d0\u00d8\5\32\16\2\u00d1\u00d8\5\34\17\2\u00d2\u00d8\5\"\22"+
		"\2\u00d3\u00d8\5$\23\2\u00d4\u00d8\5(\25\2\u00d5\u00d8\5*\26\2\u00d6\u00d8"+
		"\3\2\2\2\u00d7\u00c8\3\2\2\2\u00d7\u00c9\3\2\2\2\u00d7\u00ca\3\2\2\2\u00d7"+
		"\u00cb\3\2\2\2\u00d7\u00cc\3\2\2\2\u00d7\u00cd\3\2\2\2\u00d7\u00ce\3\2"+
		"\2\2\u00d7\u00cf\3\2\2\2\u00d7\u00d0\3\2\2\2\u00d7\u00d1\3\2\2\2\u00d7"+
		"\u00d2\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d7\u00d5\3\2"+
		"\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\60\2\2\u00da"+
		"\31\3\2\2\2\u00db\u00dc\7.\2\2\u00dc\u00dd\7\b\2\2\u00dd\u00de\5&\24\2"+
		"\u00de\33\3\2\2\2\u00df\u00e0\5 \21\2\u00e0\u00e5\7\b\2\2\u00e1\u00e6"+
		"\5\36\20\2\u00e2\u00e6\5`\61\2\u00e3\u00e6\5b\62\2\u00e4\u00e6\5d\63\2"+
		"\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4"+
		"\3\2\2\2\u00e6\35\3\2\2\2\u00e7\u00ea\5\"\22\2\u00e8\u00ea\5 \21\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\37\3\2\2\2\u00eb\u00ec\7.\2\2"+
		"\u00ec\u00ef\7\24\2\2\u00ed\u00f0\5`\61\2\u00ee\u00f0\5\36\20\2\u00ef"+
		"\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7\25"+
		"\2\2\u00f2!\3\2\2\2\u00f3\u00f4\7.\2\2\u00f4\u00fd\7\22\2\2\u00f5\u00fa"+
		"\5&\24\2\u00f6\u00f7\7\7\2\2\u00f7\u00f9\5&\24\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe\3\2"+
		"\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0100\7\23\2\2\u0100#\3\2\2\2\u0101\u0102\7\36\2"+
		"\2\u0102\u0103\5&\24\2\u0103%\3\2\2\2\u0104\u010e\5\36\20\2\u0105\u010e"+
		"\5`\61\2\u0106\u010e\5d\63\2\u0107\u010e\5b\62\2\u0108\u010e\5^\60\2\u0109"+
		"\u010e\5f\64\2\u010a\u010e\5N(\2\u010b\u010e\5P)\2\u010c\u010e\5R*\2\u010d"+
		"\u0104\3\2\2\2\u010d\u0105\3\2\2\2\u010d\u0106\3\2\2\2\u010d\u0107\3\2"+
		"\2\2\u010d\u0108\3\2\2\2\u010d\u0109\3\2\2\2\u010d\u010a\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\'\3\2\2\2\u010f\u0110\7$\2\2"+
		"\u0110\u0111\7\22\2\2\u0111\u0112\5,\27\2\u0112\u0113\7\23\2\2\u0113)"+
		"\3\2\2\2\u0114\u0115\7%\2\2\u0115\u0116\7\22\2\2\u0116\u0117\5,\27\2\u0117"+
		"\u0118\7\23\2\2\u0118+\3\2\2\2\u0119\u0120\5\36\20\2\u011a\u0120\5`\61"+
		"\2\u011b\u0120\5b\62\2\u011c\u0120\5^\60\2\u011d\u0120\5d\63\2\u011e\u0120"+
		"\5f\64\2\u011f\u0119\3\2\2\2\u011f\u011a\3\2\2\2\u011f\u011b\3\2\2\2\u011f"+
		"\u011c\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120-\3\2\2\2"+
		"\u0121\u0124\5> \2\u0122\u0123\7\b\2\2\u0123\u0125\5`\61\2\u0124\u0122"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125/\3\2\2\2\u0126\u0129\5@!\2\u0127\u0128"+
		"\7\b\2\2\u0128\u012a\5b\62\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\61\3\2\2\2\u012b\u012e\5B\"\2\u012c\u012d\7\b\2\2\u012d\u012f\5d\63\2"+
		"\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\63\3\2\2\2\u0130\u0133"+
		"\5D#\2\u0131\u0132\7\b\2\2\u0132\u0134\5^\60\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\65\3\2\2\2\u0135\u0138\5F$\2\u0136\u0137\7\b\2\2"+
		"\u0137\u0139\5f\64\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\67"+
		"\3\2\2\2\u013a\u013d\5H%\2\u013b\u013c\7\b\2\2\u013c\u013e\5N(\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e9\3\2\2\2\u013f\u0142\5J&\2\u0140"+
		"\u0141\7\b\2\2\u0141\u0143\5P)\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2"+
		"\2\u0143;\3\2\2\2\u0144\u0147\5L\'\2\u0145\u0146\7\b\2\2\u0146\u0148\5"+
		"R*\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148=\3\2\2\2\u0149\u014a"+
		"\7\33\2\2\u014a\u014b\7.\2\2\u014b?\3\2\2\2\u014c\u014d\7\34\2\2\u014d"+
		"\u014e\7.\2\2\u014eA\3\2\2\2\u014f\u0150\7\35\2\2\u0150\u0151\7.\2\2\u0151"+
		"C\3\2\2\2\u0152\u0153\7\31\2\2\u0153\u0154\7.\2\2\u0154E\3\2\2\2\u0155"+
		"\u0156\7\32\2\2\u0156\u0157\7.\2\2\u0157G\3\2\2\2\u0158\u0159\7\26\2\2"+
		"\u0159\u015a\7.\2\2\u015aI\3\2\2\2\u015b\u015c\7\27\2\2\u015c\u015d\7"+
		".\2\2\u015dK\3\2\2\2\u015e\u015f\7\30\2\2\u015f\u0160\7.\2\2\u0160M\3"+
		"\2\2\2\u0161\u0166\5T+\2\u0162\u0166\5Z.\2\u0163\u0166\5\"\22\2\u0164"+
		"\u0166\7.\2\2\u0165\u0161\3\2\2\2\u0165\u0162\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0165\u0164\3\2\2\2\u0166O\3\2\2\2\u0167\u016c\5V,\2\u0168\u016c"+
		"\5Z.\2\u0169\u016c\5\"\22\2\u016a\u016c\7.\2\2\u016b\u0167\3\2\2\2\u016b"+
		"\u0168\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016a\3\2\2\2\u016cQ\3\2\2\2"+
		"\u016d\u0172\5X-\2\u016e\u0172\5Z.\2\u016f\u0172\5\"\22\2\u0170\u0172"+
		"\7.\2\2\u0171\u016d\3\2\2\2\u0171\u016e\3\2\2\2\u0171\u016f\3\2\2\2\u0171"+
		"\u0170\3\2\2\2\u0172S\3\2\2\2\u0173\u017c\7\20\2\2\u0174\u0179\5`\61\2"+
		"\u0175\u0176\7\7\2\2\u0176\u0178\5`\61\2\u0177\u0175\3\2\2\2\u0178\u017b"+
		"\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017d\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017c\u0174\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2"+
		"\2\2\u017e\u017f\7\21\2\2\u017fU\3\2\2\2\u0180\u0189\7\20\2\2\u0181\u0186"+
		"\5b\62\2\u0182\u0183\7\7\2\2\u0183\u0185\5b\62\2\u0184\u0182\3\2\2\2\u0185"+
		"\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018a\3\2"+
		"\2\2\u0188\u0186\3\2\2\2\u0189\u0181\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018c\7\21\2\2\u018cW\3\2\2\2\u018d\u0196\7\20\2"+
		"\2\u018e\u0193\5d\63\2\u018f\u0190\7\7\2\2\u0190\u0192\5d\63\2\u0191\u018f"+
		"\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		"\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u018e\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0198\3\2\2\2\u0198\u0199\7\21\2\2\u0199Y\3\2\2\2\u019a\u019b"+
		"\7\5\2\2\u019b\u019c\t\3\2\2\u019c\u019d\7\24\2\2\u019d\u019e\5`\61\2"+
		"\u019e\u019f\7\25\2\2\u019f[\3\2\2\2\u01a0\u01a7\5T+\2\u01a1\u01a7\5V"+
		",\2\u01a2\u01a7\5X-\2\u01a3\u01a7\5\"\22\2\u01a4\u01a7\7,\2\2\u01a5\u01a7"+
		"\7.\2\2\u01a6\u01a0\3\2\2\2\u01a6\u01a1\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a6"+
		"\u01a3\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01a8\3\2"+
		"\2\2\u01a8\u01a9\7\6\2\2\u01a9]\3\2\2\2\u01aa\u01ab\b\60\1\2\u01ab\u01ac"+
		"\7\22\2\2\u01ac\u01ad\5^\60\2\u01ad\u01ae\7\23\2\2\u01ae\u01d0\3\2\2\2"+
		"\u01af\u01b0\5`\61\2\u01b0\u01b1\7\t\2\2\u01b1\u01b2\5`\61\2\u01b2\u01d0"+
		"\3\2\2\2\u01b3\u01b4\5`\61\2\u01b4\u01b5\7\n\2\2\u01b5\u01b6\5`\61\2\u01b6"+
		"\u01d0\3\2\2\2\u01b7\u01b8\5`\61\2\u01b8\u01b9\7\13\2\2\u01b9\u01ba\5"+
		"`\61\2\u01ba\u01d0\3\2\2\2\u01bb\u01bc\5b\62\2\u01bc\u01bd\7\t\2\2\u01bd"+
		"\u01be\5b\62\2\u01be\u01d0\3\2\2\2\u01bf\u01c0\5b\62\2\u01c0\u01c1\7\n"+
		"\2\2\u01c1\u01c2\5b\62\2\u01c2\u01d0\3\2\2\2\u01c3\u01c4\5b\62\2\u01c4"+
		"\u01c5\7\13\2\2\u01c5\u01c6\5b\62\2\u01c6\u01d0\3\2\2\2\u01c7\u01c8\5"+
		"d\63\2\u01c8\u01c9\7\t\2\2\u01c9\u01ca\5d\63\2\u01ca\u01d0\3\2\2\2\u01cb"+
		"\u01d0\5\"\22\2\u01cc\u01d0\7&\2\2\u01cd\u01d0\7\'\2\2\u01ce\u01d0\7."+
		"\2\2\u01cf\u01aa\3\2\2\2\u01cf\u01af\3\2\2\2\u01cf\u01b3\3\2\2\2\u01cf"+
		"\u01b7\3\2\2\2\u01cf\u01bb\3\2\2\2\u01cf\u01bf\3\2\2\2\u01cf\u01c3\3\2"+
		"\2\2\u01cf\u01c7\3\2\2\2\u01cf\u01cb\3\2\2\2\u01cf\u01cc\3\2\2\2\u01cf"+
		"\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d6\3\2\2\2\u01d1\u01d2\f\7"+
		"\2\2\u01d2\u01d3\7\t\2\2\u01d3\u01d5\5^\60\b\u01d4\u01d1\3\2\2\2\u01d5"+
		"\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7_\3\2\2\2"+
		"\u01d8\u01d6\3\2\2\2\u01d9\u01da\b\61\1\2\u01da\u01db\7\22\2\2\u01db\u01dc"+
		"\5`\61\2\u01dc\u01dd\7\23\2\2\u01dd\u01e3\3\2\2\2\u01de\u01e3\5\36\20"+
		"\2\u01df\u01e3\5\\/\2\u01e0\u01e3\5h\65\2\u01e1\u01e3\7.\2\2\u01e2\u01d9"+
		"\3\2\2\2\u01e2\u01de\3\2\2\2\u01e2\u01df\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2"+
		"\u01e1\3\2\2\2\u01e3\u01ec\3\2\2\2\u01e4\u01e5\f\b\2\2\u01e5\u01e6\t\4"+
		"\2\2\u01e6\u01eb\5`\61\t\u01e7\u01e8\f\7\2\2\u01e8\u01e9\t\5\2\2\u01e9"+
		"\u01eb\5`\61\b\u01ea\u01e4\3\2\2\2\u01ea\u01e7\3\2\2\2\u01eb\u01ee\3\2"+
		"\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01eda\3\2\2\2\u01ee\u01ec"+
		"\3\2\2\2\u01ef\u01f0\b\62\1\2\u01f0\u01f1\7\22\2\2\u01f1\u01f2\5b\62\2"+
		"\u01f2\u01f3\7\23\2\2\u01f3\u01f8\3\2\2\2\u01f4\u01f8\5\36\20\2\u01f5"+
		"\u01f8\5j\66\2\u01f6\u01f8\7.\2\2\u01f7\u01ef\3\2\2\2\u01f7\u01f4\3\2"+
		"\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8\u0201\3\2\2\2\u01f9"+
		"\u01fa\f\7\2\2\u01fa\u01fb\t\4\2\2\u01fb\u0200\5b\62\b\u01fc\u01fd\f\6"+
		"\2\2\u01fd\u01fe\t\5\2\2\u01fe\u0200\5b\62\7\u01ff\u01f9\3\2\2\2\u01ff"+
		"\u01fc\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2"+
		"\2\2\u0202c\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0208\5\36\20\2\u0205\u0208"+
		"\7-\2\2\u0206\u0208\7.\2\2\u0207\u0204\3\2\2\2\u0207\u0205\3\2\2\2\u0207"+
		"\u0206\3\2\2\2\u0208e\3\2\2\2\u0209\u020d\5\"\22\2\u020a\u020d\7,\2\2"+
		"\u020b\u020d\7.\2\2\u020c\u0209\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020b"+
		"\3\2\2\2\u020dg\3\2\2\2\u020e\u0214\7+\2\2\u020f\u0211\7\r\2\2\u0210\u020f"+
		"\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214\7*\2\2\u0213"+
		"\u020e\3\2\2\2\u0213\u0210\3\2\2\2\u0214i\3\2\2\2\u0215\u021b\7)\2\2\u0216"+
		"\u0218\7\r\2\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2"+
		"\2\2\u0219\u021b\7(\2\2\u021a\u0215\3\2\2\2\u021a\u0217\3\2\2\2\u021b"+
		"k\3\2\2\2\65ov\u0087\u008d\u0095\u0098\u00a6\u00af\u00b9\u00bf\u00c6\u00d7"+
		"\u00e5\u00e9\u00ef\u00fa\u00fd\u010d\u011f\u0124\u0129\u012e\u0133\u0138"+
		"\u013d\u0142\u0147\u0165\u016b\u0171\u0179\u017c\u0186\u0189\u0193\u0196"+
		"\u01a6\u01cf\u01d6\u01e2\u01ea\u01ec\u01f7\u01ff\u0201\u0207\u020c\u0210"+
		"\u0213\u0217\u021a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}