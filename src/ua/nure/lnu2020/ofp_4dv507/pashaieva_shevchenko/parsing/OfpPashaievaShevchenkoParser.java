// Generated from ./OfpPashaievaShevchenko.g4 by ANTLR 4.8

package ua.nure.lnu2020.ofp_4dv507.pashaieva_shevchenko.parsing;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OfpPashaievaShevchenkoParser extends Parser {
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
		RULE_programDef = 0, RULE_mainDef = 1, RULE_anyFuncDef = 2, RULE_funcDef = 3, 
		RULE_voidFuncDef = 4, RULE_funcArgs = 5, RULE_datatype = 6, RULE_varDef = 7, 
		RULE_ifDef = 8, RULE_voidIfDef = 9, RULE_whileDef = 10, RULE_voidWhileDef = 11, 
		RULE_statOrBlock = 12, RULE_voidStatOrBlock = 13, RULE_block = 14, RULE_funcBlock = 15, 
		RULE_voidBlock = 16, RULE_stat = 17, RULE_voidStat = 18, RULE_scStat = 19, 
		RULE_voidScStat = 20, RULE_voidScStatValue = 21, RULE_assign = 22, RULE_arrSet = 23, 
		RULE_complexExpr = 24, RULE_arrGet = 25, RULE_funcCall = 26, RULE_returnExpr = 27, 
		RULE_expr = 28, RULE_printExpr = 29, RULE_printlnExpr = 30, RULE_printable = 31, 
		RULE_intDecl = 32, RULE_floatDecl = 33, RULE_charDecl = 34, RULE_boolDecl = 35, 
		RULE_strDecl = 36, RULE_intArrDecl = 37, RULE_floatArrDecl = 38, RULE_charArrDecl = 39, 
		RULE_intDef = 40, RULE_floatDef = 41, RULE_charDef = 42, RULE_boolDef = 43, 
		RULE_strDef = 44, RULE_intArrDef = 45, RULE_floatArrDef = 46, RULE_charArrDef = 47, 
		RULE_intArrExpr = 48, RULE_floatArrExpr = 49, RULE_charArrExpr = 50, RULE_intArr = 51, 
		RULE_floatArr = 52, RULE_charArr = 53, RULE_newIntArr = 54, RULE_newFloatArr = 55, 
		RULE_newCharArr = 56, RULE_lengthRead = 57, RULE_boolExpr = 58, RULE_intExpr = 59, 
		RULE_floatExpr = 60, RULE_charExpr = 61, RULE_strExpr = 62, RULE_intLiteral = 63, 
		RULE_floatLiteral = 64, RULE_variable = 65;
	private static String[] makeRuleNames() {
		return new String[] {
			"programDef", "mainDef", "anyFuncDef", "funcDef", "voidFuncDef", "funcArgs", 
			"datatype", "varDef", "ifDef", "voidIfDef", "whileDef", "voidWhileDef", 
			"statOrBlock", "voidStatOrBlock", "block", "funcBlock", "voidBlock", 
			"stat", "voidStat", "scStat", "voidScStat", "voidScStatValue", "assign", 
			"arrSet", "complexExpr", "arrGet", "funcCall", "returnExpr", "expr", 
			"printExpr", "printlnExpr", "printable", "intDecl", "floatDecl", "charDecl", 
			"boolDecl", "strDecl", "intArrDecl", "floatArrDecl", "charArrDecl", "intDef", 
			"floatDef", "charDef", "boolDef", "strDef", "intArrDef", "floatArrDef", 
			"charArrDef", "intArrExpr", "floatArrExpr", "charArrExpr", "intArr", 
			"floatArr", "charArr", "newIntArr", "newFloatArr", "newCharArr", "lengthRead", 
			"boolExpr", "intExpr", "floatExpr", "charExpr", "strExpr", "intLiteral", 
			"floatLiteral", "variable"
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

	public OfpPashaievaShevchenkoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramDefContext extends ParserRuleContext {
		public MainDefContext mainDef() {
			return getRuleContext(MainDefContext.class,0);
		}
		public TerminalNode EOF() { return getToken(OfpPashaievaShevchenkoParser.EOF, 0); }
		public List<AnyFuncDefContext> anyFuncDef() {
			return getRuleContexts(AnyFuncDefContext.class);
		}
		public AnyFuncDefContext anyFuncDef(int i) {
			return getRuleContext(AnyFuncDefContext.class,i);
		}
		public ProgramDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterProgramDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitProgramDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitProgramDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramDefContext programDef() throws RecognitionException {
		ProgramDefContext _localctx = new ProgramDefContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(132);
					anyFuncDef();
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(138);
			mainDef();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DT_INT_ARR) | (1L << DT_FLOAT_ARR) | (1L << DT_CHAR_ARR) | (1L << DT_BOOL) | (1L << DT_STR) | (1L << DT_INT) | (1L << DT_FLOAT) | (1L << DT_CHAR) | (1L << VOID))) != 0)) {
				{
				{
				setState(139);
				anyFuncDef();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
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

	public static class MainDefContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(OfpPashaievaShevchenkoParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(OfpPashaievaShevchenkoParser.MAIN, 0); }
		public TerminalNode LRB() { return getToken(OfpPashaievaShevchenkoParser.LRB, 0); }
		public TerminalNode RRB() { return getToken(OfpPashaievaShevchenkoParser.RRB, 0); }
		public VoidBlockContext voidBlock() {
			return getRuleContext(VoidBlockContext.class,0);
		}
		public MainDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterMainDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitMainDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitMainDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDefContext mainDef() throws RecognitionException {
		MainDefContext _localctx = new MainDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(VOID);
			setState(148);
			match(MAIN);
			setState(149);
			match(LRB);
			setState(150);
			match(RRB);
			setState(151);
			voidBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnyFuncDefContext extends ParserRuleContext {
		public VoidFuncDefContext voidFuncDef() {
			return getRuleContext(VoidFuncDefContext.class,0);
		}
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public AnyFuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anyFuncDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterAnyFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitAnyFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitAnyFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyFuncDefContext anyFuncDef() throws RecognitionException {
		AnyFuncDefContext _localctx = new AnyFuncDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_anyFuncDef);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				voidFuncDef();
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
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				funcDef();
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

	public static class FuncDefContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(OfpPashaievaShevchenkoParser.ID, 0); }
		public FuncArgsContext funcArgs() {
			return getRuleContext(FuncArgsContext.class,0);
		}
		public FuncBlockContext funcBlock() {
			return getRuleContext(FuncBlockContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			datatype();
			setState(158);
			match(ID);
			setState(159);
			funcArgs();
			setState(160);
			funcBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VoidFuncDefContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(OfpPashaievaShevchenkoParser.VOID, 0); }
		public TerminalNode ID() { return getToken(OfpPashaievaShevchenkoParser.ID, 0); }
		public FuncArgsContext funcArgs() {
			return getRuleContext(FuncArgsContext.class,0);
		}
		public VoidBlockContext voidBlock() {
			return getRuleContext(VoidBlockContext.class,0);
		}
		public VoidFuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidFuncDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterVoidFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitVoidFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitVoidFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidFuncDefContext voidFuncDef() throws RecognitionException {
		VoidFuncDefContext _localctx = new VoidFuncDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_voidFuncDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(VOID);
			setState(163);
			match(ID);
			setState(164);
			funcArgs();
			setState(165);
			voidBlock();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode LRB() { return getToken(OfpPashaievaShevchenkoParser.LRB, 0); }
		public TerminalNode RRB() { return getToken(OfpPashaievaShevchenkoParser.RRB, 0); }
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OfpPashaievaShevchenkoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OfpPashaievaShevchenkoParser.COMMA, i);
		}
		public FuncArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterFuncArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitFuncArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitFuncArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncArgsContext funcArgs() throws RecognitionException {
		FuncArgsContext _localctx = new FuncArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(LRB);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DT_INT_ARR) | (1L << DT_FLOAT_ARR) | (1L << DT_CHAR_ARR) | (1L << DT_BOOL) | (1L << DT_STR) | (1L << DT_INT) | (1L << DT_FLOAT) | (1L << DT_CHAR))) != 0)) {
				{
				setState(168);
				varDef();
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(169);
					match(COMMA);
					setState(170);
					varDef();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(178);
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
		public TerminalNode DT_INT() { return getToken(OfpPashaievaShevchenkoParser.DT_INT, 0); }
		public TerminalNode DT_FLOAT() { return getToken(OfpPashaievaShevchenkoParser.DT_FLOAT, 0); }
		public TerminalNode DT_CHAR() { return getToken(OfpPashaievaShevchenkoParser.DT_CHAR, 0); }
		public TerminalNode DT_BOOL() { return getToken(OfpPashaievaShevchenkoParser.DT_BOOL, 0); }
		public TerminalNode DT_STR() { return getToken(OfpPashaievaShevchenkoParser.DT_STR, 0); }
		public TerminalNode DT_INT_ARR() { return getToken(OfpPashaievaShevchenkoParser.DT_INT_ARR, 0); }
		public TerminalNode DT_FLOAT_ARR() { return getToken(OfpPashaievaShevchenkoParser.DT_FLOAT_ARR, 0); }
		public TerminalNode DT_CHAR_ARR() { return getToken(OfpPashaievaShevchenkoParser.DT_CHAR_ARR, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitDatatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDef);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DT_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				intDef();
				}
				break;
			case DT_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				floatDef();
				}
				break;
			case DT_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				charDef();
				}
				break;
			case DT_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				boolDef();
				}
				break;
			case DT_STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				strDef();
				}
				break;
			case DT_INT_ARR:
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				intArrDef();
				}
				break;
			case DT_FLOAT_ARR:
				enterOuterAlt(_localctx, 7);
				{
				setState(188);
				floatArrDef();
				}
				break;
			case DT_CHAR_ARR:
				enterOuterAlt(_localctx, 8);
				{
				setState(189);
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
		public TerminalNode IF() { return getToken(OfpPashaievaShevchenkoParser.IF, 0); }
		public TerminalNode LRB() { return getToken(OfpPashaievaShevchenkoParser.LRB, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode RRB() { return getToken(OfpPashaievaShevchenkoParser.RRB, 0); }
		public List<StatOrBlockContext> statOrBlock() {
			return getRuleContexts(StatOrBlockContext.class);
		}
		public StatOrBlockContext statOrBlock(int i) {
			return getRuleContext(StatOrBlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(OfpPashaievaShevchenkoParser.ELSE, 0); }
		public IfDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterIfDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitIfDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitIfDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfDefContext ifDef() throws RecognitionException {
		IfDefContext _localctx = new IfDefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(IF);
			setState(193);
			match(LRB);
			setState(194);
			boolExpr(0);
			setState(195);
			match(RRB);
			setState(196);
			statOrBlock();
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(197);
				match(ELSE);
				setState(198);
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

	public static class VoidIfDefContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(OfpPashaievaShevchenkoParser.IF, 0); }
		public TerminalNode LRB() { return getToken(OfpPashaievaShevchenkoParser.LRB, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode RRB() { return getToken(OfpPashaievaShevchenkoParser.RRB, 0); }
		public List<VoidStatOrBlockContext> voidStatOrBlock() {
			return getRuleContexts(VoidStatOrBlockContext.class);
		}
		public VoidStatOrBlockContext voidStatOrBlock(int i) {
			return getRuleContext(VoidStatOrBlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(OfpPashaievaShevchenkoParser.ELSE, 0); }
		public VoidIfDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidIfDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterVoidIfDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitVoidIfDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitVoidIfDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidIfDefContext voidIfDef() throws RecognitionException {
		VoidIfDefContext _localctx = new VoidIfDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_voidIfDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(IF);
			setState(202);
			match(LRB);
			setState(203);
			boolExpr(0);
			setState(204);
			match(RRB);
			setState(205);
			voidStatOrBlock();
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(206);
				match(ELSE);
				setState(207);
				voidStatOrBlock();
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
		public TerminalNode WHILE() { return getToken(OfpPashaievaShevchenkoParser.WHILE, 0); }
		public TerminalNode LRB() { return getToken(OfpPashaievaShevchenkoParser.LRB, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode RRB() { return getToken(OfpPashaievaShevchenkoParser.RRB, 0); }
		public StatOrBlockContext statOrBlock() {
			return getRuleContext(StatOrBlockContext.class,0);
		}
		public WhileDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterWhileDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitWhileDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitWhileDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileDefContext whileDef() throws RecognitionException {
		WhileDefContext _localctx = new WhileDefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(WHILE);
			setState(211);
			match(LRB);
			setState(212);
			boolExpr(0);
			setState(213);
			match(RRB);
			setState(214);
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

	public static class VoidWhileDefContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(OfpPashaievaShevchenkoParser.WHILE, 0); }
		public TerminalNode LRB() { return getToken(OfpPashaievaShevchenkoParser.LRB, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode RRB() { return getToken(OfpPashaievaShevchenkoParser.RRB, 0); }
		public VoidStatOrBlockContext voidStatOrBlock() {
			return getRuleContext(VoidStatOrBlockContext.class,0);
		}
		public VoidWhileDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidWhileDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterVoidWhileDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitVoidWhileDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitVoidWhileDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidWhileDefContext voidWhileDef() throws RecognitionException {
		VoidWhileDefContext _localctx = new VoidWhileDefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_voidWhileDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(WHILE);
			setState(217);
			match(LRB);
			setState(218);
			boolExpr(0);
			setState(219);
			match(RRB);
			setState(220);
			voidStatOrBlock();
			}
		}
		catch (RecognitionException re) {
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
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterStatOrBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitStatOrBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitStatOrBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatOrBlockContext statOrBlock() throws RecognitionException {
		StatOrBlockContext _localctx = new StatOrBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statOrBlock);
		try {
			setState(224);
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
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				stat();
				}
				break;
			case LCB:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
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

	public static class VoidStatOrBlockContext extends ParserRuleContext {
		public VoidStatContext voidStat() {
			return getRuleContext(VoidStatContext.class,0);
		}
		public VoidBlockContext voidBlock() {
			return getRuleContext(VoidBlockContext.class,0);
		}
		public VoidStatOrBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidStatOrBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterVoidStatOrBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitVoidStatOrBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitVoidStatOrBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidStatOrBlockContext voidStatOrBlock() throws RecognitionException {
		VoidStatOrBlockContext _localctx = new VoidStatOrBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_voidStatOrBlock);
		try {
			setState(228);
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
			case IF:
			case WHILE:
			case PRINT:
			case PRINTLN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				voidStat();
				}
				break;
			case LCB:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				voidBlock();
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
		public TerminalNode LCB() { return getToken(OfpPashaievaShevchenkoParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(OfpPashaievaShevchenkoParser.RCB, 0); }
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
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(LCB);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DT_INT_ARR) | (1L << DT_FLOAT_ARR) | (1L << DT_CHAR_ARR) | (1L << DT_BOOL) | (1L << DT_STR) | (1L << DT_INT) | (1L << DT_FLOAT) | (1L << DT_CHAR) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << PRINTLN) | (1L << ID))) != 0)) {
				{
				{
				setState(231);
				stat();
				}
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(237);
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

	public static class FuncBlockContext extends ParserRuleContext {
		public TerminalNode LCB() { return getToken(OfpPashaievaShevchenkoParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(OfpPashaievaShevchenkoParser.RCB, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public FuncBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterFuncBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitFuncBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitFuncBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncBlockContext funcBlock() throws RecognitionException {
		FuncBlockContext _localctx = new FuncBlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(LCB);
			setState(241); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(240);
				stat();
				}
				}
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DT_INT_ARR) | (1L << DT_FLOAT_ARR) | (1L << DT_CHAR_ARR) | (1L << DT_BOOL) | (1L << DT_STR) | (1L << DT_INT) | (1L << DT_FLOAT) | (1L << DT_CHAR) | (1L << RETURN) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << PRINTLN) | (1L << ID))) != 0) );
			setState(245);
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

	public static class VoidBlockContext extends ParserRuleContext {
		public TerminalNode LCB() { return getToken(OfpPashaievaShevchenkoParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(OfpPashaievaShevchenkoParser.RCB, 0); }
		public List<VoidStatContext> voidStat() {
			return getRuleContexts(VoidStatContext.class);
		}
		public VoidStatContext voidStat(int i) {
			return getRuleContext(VoidStatContext.class,i);
		}
		public VoidBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterVoidBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitVoidBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitVoidBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidBlockContext voidBlock() throws RecognitionException {
		VoidBlockContext _localctx = new VoidBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_voidBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(LCB);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DT_INT_ARR) | (1L << DT_FLOAT_ARR) | (1L << DT_CHAR_ARR) | (1L << DT_BOOL) | (1L << DT_STR) | (1L << DT_INT) | (1L << DT_FLOAT) | (1L << DT_CHAR) | (1L << IF) | (1L << WHILE) | (1L << PRINT) | (1L << PRINTLN) | (1L << ID))) != 0)) {
				{
				{
				setState(248);
				voidStat();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
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
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stat);
		try {
			setState(259);
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
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				scStat();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				ifDef();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
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

	public static class VoidStatContext extends ParserRuleContext {
		public VoidScStatContext voidScStat() {
			return getRuleContext(VoidScStatContext.class,0);
		}
		public VoidIfDefContext voidIfDef() {
			return getRuleContext(VoidIfDefContext.class,0);
		}
		public VoidWhileDefContext voidWhileDef() {
			return getRuleContext(VoidWhileDefContext.class,0);
		}
		public VoidStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterVoidStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitVoidStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitVoidStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidStatContext voidStat() throws RecognitionException {
		VoidStatContext _localctx = new VoidStatContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_voidStat);
		try {
			setState(264);
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
			case PRINT:
			case PRINTLN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				voidScStat();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				voidIfDef();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				voidWhileDef();
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
		public TerminalNode SC() { return getToken(OfpPashaievaShevchenkoParser.SC, 0); }
		public VoidScStatValueContext voidScStatValue() {
			return getRuleContext(VoidScStatValueContext.class,0);
		}
		public ReturnExprContext returnExpr() {
			return getRuleContext(ReturnExprContext.class,0);
		}
		public ScStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterScStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitScStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitScStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScStatContext scStat() throws RecognitionException {
		ScStatContext _localctx = new ScStatContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_scStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
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
			case PRINT:
			case PRINTLN:
			case ID:
				{
				setState(266);
				voidScStatValue();
				}
				break;
			case RETURN:
				{
				setState(267);
				returnExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(270);
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

	public static class VoidScStatContext extends ParserRuleContext {
		public VoidScStatValueContext voidScStatValue() {
			return getRuleContext(VoidScStatValueContext.class,0);
		}
		public TerminalNode SC() { return getToken(OfpPashaievaShevchenkoParser.SC, 0); }
		public VoidScStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidScStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterVoidScStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitVoidScStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitVoidScStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidScStatContext voidScStat() throws RecognitionException {
		VoidScStatContext _localctx = new VoidScStatContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_voidScStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			voidScStatValue();
			setState(273);
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

	public static class VoidScStatValueContext extends ParserRuleContext {
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
		public PrintExprContext printExpr() {
			return getRuleContext(PrintExprContext.class,0);
		}
		public PrintlnExprContext printlnExpr() {
			return getRuleContext(PrintlnExprContext.class,0);
		}
		public VoidScStatValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidScStatValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterVoidScStatValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitVoidScStatValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitVoidScStatValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidScStatValueContext voidScStatValue() throws RecognitionException {
		VoidScStatValueContext _localctx = new VoidScStatValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_voidScStatValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(275);
				intDecl();
				}
				break;
			case 2:
				{
				setState(276);
				floatDecl();
				}
				break;
			case 3:
				{
				setState(277);
				charDecl();
				}
				break;
			case 4:
				{
				setState(278);
				boolDecl();
				}
				break;
			case 5:
				{
				setState(279);
				strDecl();
				}
				break;
			case 6:
				{
				setState(280);
				intArrDecl();
				}
				break;
			case 7:
				{
				setState(281);
				floatArrDecl();
				}
				break;
			case 8:
				{
				setState(282);
				charArrDecl();
				}
				break;
			case 9:
				{
				setState(283);
				assign();
				}
				break;
			case 10:
				{
				setState(284);
				arrSet();
				}
				break;
			case 11:
				{
				setState(285);
				funcCall();
				}
				break;
			case 12:
				{
				setState(286);
				printExpr();
				}
				break;
			case 13:
				{
				setState(287);
				printlnExpr();
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OfpPashaievaShevchenkoParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(OfpPashaievaShevchenkoParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(ID);
			setState(291);
			match(ASSIGN);
			setState(292);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode LSB() { return getToken(OfpPashaievaShevchenkoParser.LSB, 0); }
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public TerminalNode RSB() { return getToken(OfpPashaievaShevchenkoParser.RSB, 0); }
		public TerminalNode ASSIGN() { return getToken(OfpPashaievaShevchenkoParser.ASSIGN, 0); }
		public ComplexExprContext complexExpr() {
			return getRuleContext(ComplexExprContext.class,0);
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
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterArrSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitArrSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitArrSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrSetContext arrSet() throws RecognitionException {
		ArrSetContext _localctx = new ArrSetContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			variable();
			setState(295);
			match(LSB);
			setState(296);
			intExpr(0);
			setState(297);
			match(RSB);
			setState(298);
			match(ASSIGN);
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(299);
				complexExpr();
				}
				break;
			case 2:
				{
				setState(300);
				variable();
				}
				break;
			case 3:
				{
				setState(301);
				intExpr(0);
				}
				break;
			case 4:
				{
				setState(302);
				floatExpr(0);
				}
				break;
			case 5:
				{
				setState(303);
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
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterComplexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitComplexExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitComplexExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexExprContext complexExpr() throws RecognitionException {
		ComplexExprContext _localctx = new ComplexExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_complexExpr);
		try {
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
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
		public TerminalNode LSB() { return getToken(OfpPashaievaShevchenkoParser.LSB, 0); }
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public TerminalNode RSB() { return getToken(OfpPashaievaShevchenkoParser.RSB, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public ArrGetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrGet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterArrGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitArrGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitArrGet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrGetContext arrGet() throws RecognitionException {
		ArrGetContext _localctx = new ArrGetContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arrGet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(310);
				variable();
				}
				break;
			case 2:
				{
				setState(311);
				funcCall();
				}
				break;
			}
			setState(314);
			match(LSB);
			setState(315);
			intExpr(0);
			setState(316);
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
		public TerminalNode ID() { return getToken(OfpPashaievaShevchenkoParser.ID, 0); }
		public TerminalNode LRB() { return getToken(OfpPashaievaShevchenkoParser.LRB, 0); }
		public TerminalNode RRB() { return getToken(OfpPashaievaShevchenkoParser.RRB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OfpPashaievaShevchenkoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OfpPashaievaShevchenkoParser.COMMA, i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(ID);
			setState(319);
			match(LRB);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << MINUS) | (1L << LCB) | (1L << LRB) | (1L << TRUE) | (1L << FALSE) | (1L << POSITIVE_FLOAT) | (1L << FLOAT_ZERO) | (1L << POSITIVE_INT) | (1L << INT_ZERO) | (1L << STRING) | (1L << QUOTED_CHAR) | (1L << ID))) != 0)) {
				{
				setState(320);
				expr();
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(321);
					match(COMMA);
					setState(322);
					expr();
					}
					}
					setState(327);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(330);
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
		public TerminalNode RETURN() { return getToken(OfpPashaievaShevchenkoParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterReturnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitReturnExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitReturnExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnExprContext returnExpr() throws RecognitionException {
		ReturnExprContext _localctx = new ReturnExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_returnExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(RETURN);
			setState(333);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
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
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expr);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				complexExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(337);
				intExpr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
				floatExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(339);
				charExpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(340);
				boolExpr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(341);
				strExpr();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(342);
				intArrExpr();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(343);
				floatArrExpr();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(344);
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
		public TerminalNode PRINT() { return getToken(OfpPashaievaShevchenkoParser.PRINT, 0); }
		public TerminalNode LRB() { return getToken(OfpPashaievaShevchenkoParser.LRB, 0); }
		public PrintableContext printable() {
			return getRuleContext(PrintableContext.class,0);
		}
		public TerminalNode RRB() { return getToken(OfpPashaievaShevchenkoParser.RRB, 0); }
		public PrintExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitPrintExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintExprContext printExpr() throws RecognitionException {
		PrintExprContext _localctx = new PrintExprContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_printExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(PRINT);
			setState(348);
			match(LRB);
			setState(349);
			printable();
			setState(350);
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
		public TerminalNode PRINTLN() { return getToken(OfpPashaievaShevchenkoParser.PRINTLN, 0); }
		public TerminalNode LRB() { return getToken(OfpPashaievaShevchenkoParser.LRB, 0); }
		public PrintableContext printable() {
			return getRuleContext(PrintableContext.class,0);
		}
		public TerminalNode RRB() { return getToken(OfpPashaievaShevchenkoParser.RRB, 0); }
		public PrintlnExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printlnExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterPrintlnExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitPrintlnExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitPrintlnExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnExprContext printlnExpr() throws RecognitionException {
		PrintlnExprContext _localctx = new PrintlnExprContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_printlnExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(PRINTLN);
			setState(353);
			match(LRB);
			setState(354);
			printable();
			setState(355);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
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
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterPrintable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitPrintable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitPrintable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintableContext printable() throws RecognitionException {
		PrintableContext _localctx = new PrintableContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_printable);
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				complexExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				variable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				intExpr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(360);
				floatExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(361);
				boolExpr(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(362);
				charExpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(363);
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
		public TerminalNode ASSIGN() { return getToken(OfpPashaievaShevchenkoParser.ASSIGN, 0); }
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public IntDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterIntDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitIntDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitIntDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntDeclContext intDecl() throws RecognitionException {
		IntDeclContext _localctx = new IntDeclContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_intDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			intDef();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(367);
				match(ASSIGN);
				setState(368);
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
		public TerminalNode ASSIGN() { return getToken(OfpPashaievaShevchenkoParser.ASSIGN, 0); }
		public FloatExprContext floatExpr() {
			return getRuleContext(FloatExprContext.class,0);
		}
		public FloatDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterFloatDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitFloatDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitFloatDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatDeclContext floatDecl() throws RecognitionException {
		FloatDeclContext _localctx = new FloatDeclContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_floatDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			floatDef();
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(372);
				match(ASSIGN);
				setState(373);
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
		public TerminalNode ASSIGN() { return getToken(OfpPashaievaShevchenkoParser.ASSIGN, 0); }
		public CharExprContext charExpr() {
			return getRuleContext(CharExprContext.class,0);
		}
		public CharDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterCharDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitCharDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitCharDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharDeclContext charDecl() throws RecognitionException {
		CharDeclContext _localctx = new CharDeclContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_charDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			charDef();
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(377);
				match(ASSIGN);
				setState(378);
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
		public TerminalNode ASSIGN() { return getToken(OfpPashaievaShevchenkoParser.ASSIGN, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public BoolDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterBoolDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitBoolDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitBoolDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolDeclContext boolDecl() throws RecognitionException {
		BoolDeclContext _localctx = new BoolDeclContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_boolDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			boolDef();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(382);
				match(ASSIGN);
				setState(383);
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
		public TerminalNode ASSIGN() { return getToken(OfpPashaievaShevchenkoParser.ASSIGN, 0); }
		public StrExprContext strExpr() {
			return getRuleContext(StrExprContext.class,0);
		}
		public StrDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterStrDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitStrDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitStrDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrDeclContext strDecl() throws RecognitionException {
		StrDeclContext _localctx = new StrDeclContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_strDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			strDef();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(387);
				match(ASSIGN);
				setState(388);
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
		public TerminalNode ASSIGN() { return getToken(OfpPashaievaShevchenkoParser.ASSIGN, 0); }
		public IntArrExprContext intArrExpr() {
			return getRuleContext(IntArrExprContext.class,0);
		}
		public IntArrDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intArrDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterIntArrDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitIntArrDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitIntArrDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntArrDeclContext intArrDecl() throws RecognitionException {
		IntArrDeclContext _localctx = new IntArrDeclContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_intArrDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			intArrDef();
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(392);
				match(ASSIGN);
				setState(393);
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
		public TerminalNode ASSIGN() { return getToken(OfpPashaievaShevchenkoParser.ASSIGN, 0); }
		public FloatArrExprContext floatArrExpr() {
			return getRuleContext(FloatArrExprContext.class,0);
		}
		public FloatArrDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatArrDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterFloatArrDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitFloatArrDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitFloatArrDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatArrDeclContext floatArrDecl() throws RecognitionException {
		FloatArrDeclContext _localctx = new FloatArrDeclContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_floatArrDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			floatArrDef();
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(397);
				match(ASSIGN);
				setState(398);
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
		public TerminalNode ASSIGN() { return getToken(OfpPashaievaShevchenkoParser.ASSIGN, 0); }
		public CharArrExprContext charArrExpr() {
			return getRuleContext(CharArrExprContext.class,0);
		}
		public CharArrDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charArrDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterCharArrDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitCharArrDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitCharArrDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharArrDeclContext charArrDecl() throws RecognitionException {
		CharArrDeclContext _localctx = new CharArrDeclContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_charArrDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			charArrDef();
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(402);
				match(ASSIGN);
				setState(403);
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
		public TerminalNode DT_INT() { return getToken(OfpPashaievaShevchenkoParser.DT_INT, 0); }
		public TerminalNode ID() { return getToken(OfpPashaievaShevchenkoParser.ID, 0); }
		public IntDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterIntDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitIntDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitIntDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntDefContext intDef() throws RecognitionException {
		IntDefContext _localctx = new IntDefContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_intDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(DT_INT);
			setState(407);
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
		public TerminalNode DT_FLOAT() { return getToken(OfpPashaievaShevchenkoParser.DT_FLOAT, 0); }
		public TerminalNode ID() { return getToken(OfpPashaievaShevchenkoParser.ID, 0); }
		public FloatDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterFloatDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitFloatDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitFloatDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatDefContext floatDef() throws RecognitionException {
		FloatDefContext _localctx = new FloatDefContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_floatDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(DT_FLOAT);
			setState(410);
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
		public TerminalNode DT_CHAR() { return getToken(OfpPashaievaShevchenkoParser.DT_CHAR, 0); }
		public TerminalNode ID() { return getToken(OfpPashaievaShevchenkoParser.ID, 0); }
		public CharDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterCharDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitCharDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitCharDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharDefContext charDef() throws RecognitionException {
		CharDefContext _localctx = new CharDefContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_charDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(DT_CHAR);
			setState(413);
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
		public TerminalNode DT_BOOL() { return getToken(OfpPashaievaShevchenkoParser.DT_BOOL, 0); }
		public TerminalNode ID() { return getToken(OfpPashaievaShevchenkoParser.ID, 0); }
		public BoolDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterBoolDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitBoolDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitBoolDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolDefContext boolDef() throws RecognitionException {
		BoolDefContext _localctx = new BoolDefContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_boolDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(DT_BOOL);
			setState(416);
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
		public TerminalNode DT_STR() { return getToken(OfpPashaievaShevchenkoParser.DT_STR, 0); }
		public TerminalNode ID() { return getToken(OfpPashaievaShevchenkoParser.ID, 0); }
		public StrDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterStrDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitStrDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitStrDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrDefContext strDef() throws RecognitionException {
		StrDefContext _localctx = new StrDefContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_strDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(DT_STR);
			setState(419);
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
		public TerminalNode DT_INT_ARR() { return getToken(OfpPashaievaShevchenkoParser.DT_INT_ARR, 0); }
		public TerminalNode ID() { return getToken(OfpPashaievaShevchenkoParser.ID, 0); }
		public IntArrDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intArrDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterIntArrDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitIntArrDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitIntArrDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntArrDefContext intArrDef() throws RecognitionException {
		IntArrDefContext _localctx = new IntArrDefContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_intArrDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(DT_INT_ARR);
			setState(422);
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
		public TerminalNode DT_FLOAT_ARR() { return getToken(OfpPashaievaShevchenkoParser.DT_FLOAT_ARR, 0); }
		public TerminalNode ID() { return getToken(OfpPashaievaShevchenkoParser.ID, 0); }
		public FloatArrDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatArrDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterFloatArrDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitFloatArrDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitFloatArrDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatArrDefContext floatArrDef() throws RecognitionException {
		FloatArrDefContext _localctx = new FloatArrDefContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_floatArrDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(DT_FLOAT_ARR);
			setState(425);
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
		public TerminalNode DT_CHAR_ARR() { return getToken(OfpPashaievaShevchenkoParser.DT_CHAR_ARR, 0); }
		public TerminalNode ID() { return getToken(OfpPashaievaShevchenkoParser.ID, 0); }
		public CharArrDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charArrDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterCharArrDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitCharArrDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitCharArrDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharArrDefContext charArrDef() throws RecognitionException {
		CharArrDefContext _localctx = new CharArrDefContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_charArrDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(DT_CHAR_ARR);
			setState(428);
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
		public NewIntArrContext newIntArr() {
			return getRuleContext(NewIntArrContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public IntArrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intArrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterIntArrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitIntArrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitIntArrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntArrExprContext intArrExpr() throws RecognitionException {
		IntArrExprContext _localctx = new IntArrExprContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_intArrExpr);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				intArr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				newIntArr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				funcCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(433);
				variable();
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
		public NewFloatArrContext newFloatArr() {
			return getRuleContext(NewFloatArrContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FloatArrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatArrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterFloatArrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitFloatArrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitFloatArrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatArrExprContext floatArrExpr() throws RecognitionException {
		FloatArrExprContext _localctx = new FloatArrExprContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_floatArrExpr);
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				floatArr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				newFloatArr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				funcCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				variable();
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
		public NewCharArrContext newCharArr() {
			return getRuleContext(NewCharArrContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public CharArrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charArrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterCharArrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitCharArrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitCharArrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharArrExprContext charArrExpr() throws RecognitionException {
		CharArrExprContext _localctx = new CharArrExprContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_charArrExpr);
		try {
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				charArr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				newCharArr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				funcCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(445);
				variable();
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
		public TerminalNode LCB() { return getToken(OfpPashaievaShevchenkoParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(OfpPashaievaShevchenkoParser.RCB, 0); }
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OfpPashaievaShevchenkoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OfpPashaievaShevchenkoParser.COMMA, i);
		}
		public IntArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterIntArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitIntArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitIntArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntArrContext intArr() throws RecognitionException {
		IntArrContext _localctx = new IntArrContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_intArr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(LCB);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LCB) | (1L << LRB) | (1L << POSITIVE_INT) | (1L << INT_ZERO) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(449);
				intExpr(0);
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(450);
					match(COMMA);
					setState(451);
					intExpr(0);
					}
					}
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(459);
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
		public TerminalNode LCB() { return getToken(OfpPashaievaShevchenkoParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(OfpPashaievaShevchenkoParser.RCB, 0); }
		public List<FloatExprContext> floatExpr() {
			return getRuleContexts(FloatExprContext.class);
		}
		public FloatExprContext floatExpr(int i) {
			return getRuleContext(FloatExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OfpPashaievaShevchenkoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OfpPashaievaShevchenkoParser.COMMA, i);
		}
		public FloatArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterFloatArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitFloatArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitFloatArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatArrContext floatArr() throws RecognitionException {
		FloatArrContext _localctx = new FloatArrContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_floatArr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			match(LCB);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LRB) | (1L << POSITIVE_FLOAT) | (1L << FLOAT_ZERO) | (1L << ID))) != 0)) {
				{
				setState(462);
				floatExpr(0);
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(463);
					match(COMMA);
					setState(464);
					floatExpr(0);
					}
					}
					setState(469);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(472);
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
		public TerminalNode LCB() { return getToken(OfpPashaievaShevchenkoParser.LCB, 0); }
		public TerminalNode RCB() { return getToken(OfpPashaievaShevchenkoParser.RCB, 0); }
		public List<CharExprContext> charExpr() {
			return getRuleContexts(CharExprContext.class);
		}
		public CharExprContext charExpr(int i) {
			return getRuleContext(CharExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(OfpPashaievaShevchenkoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OfpPashaievaShevchenkoParser.COMMA, i);
		}
		public CharArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterCharArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitCharArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitCharArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharArrContext charArr() throws RecognitionException {
		CharArrContext _localctx = new CharArrContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_charArr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(LCB);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUOTED_CHAR || _la==ID) {
				{
				setState(475);
				charExpr();
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(476);
					match(COMMA);
					setState(477);
					charExpr();
					}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(485);
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

	public static class NewIntArrContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(OfpPashaievaShevchenkoParser.NEW, 0); }
		public TerminalNode DT_INT() { return getToken(OfpPashaievaShevchenkoParser.DT_INT, 0); }
		public TerminalNode LSB() { return getToken(OfpPashaievaShevchenkoParser.LSB, 0); }
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public TerminalNode RSB() { return getToken(OfpPashaievaShevchenkoParser.RSB, 0); }
		public NewIntArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newIntArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterNewIntArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitNewIntArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitNewIntArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewIntArrContext newIntArr() throws RecognitionException {
		NewIntArrContext _localctx = new NewIntArrContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_newIntArr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(NEW);
			setState(488);
			match(DT_INT);
			setState(489);
			match(LSB);
			setState(490);
			intExpr(0);
			setState(491);
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

	public static class NewFloatArrContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(OfpPashaievaShevchenkoParser.NEW, 0); }
		public TerminalNode DT_FLOAT() { return getToken(OfpPashaievaShevchenkoParser.DT_FLOAT, 0); }
		public TerminalNode LSB() { return getToken(OfpPashaievaShevchenkoParser.LSB, 0); }
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public TerminalNode RSB() { return getToken(OfpPashaievaShevchenkoParser.RSB, 0); }
		public NewFloatArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newFloatArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterNewFloatArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitNewFloatArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitNewFloatArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewFloatArrContext newFloatArr() throws RecognitionException {
		NewFloatArrContext _localctx = new NewFloatArrContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_newFloatArr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			match(NEW);
			setState(494);
			match(DT_FLOAT);
			setState(495);
			match(LSB);
			setState(496);
			intExpr(0);
			setState(497);
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

	public static class NewCharArrContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(OfpPashaievaShevchenkoParser.NEW, 0); }
		public TerminalNode DT_CHAR() { return getToken(OfpPashaievaShevchenkoParser.DT_CHAR, 0); }
		public TerminalNode LSB() { return getToken(OfpPashaievaShevchenkoParser.LSB, 0); }
		public IntExprContext intExpr() {
			return getRuleContext(IntExprContext.class,0);
		}
		public TerminalNode RSB() { return getToken(OfpPashaievaShevchenkoParser.RSB, 0); }
		public NewCharArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newCharArr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterNewCharArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitNewCharArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitNewCharArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewCharArrContext newCharArr() throws RecognitionException {
		NewCharArrContext _localctx = new NewCharArrContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_newCharArr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(NEW);
			setState(500);
			match(DT_CHAR);
			setState(501);
			match(LSB);
			setState(502);
			intExpr(0);
			setState(503);
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
		public TerminalNode LENGTH() { return getToken(OfpPashaievaShevchenkoParser.LENGTH, 0); }
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
		public TerminalNode STRING() { return getToken(OfpPashaievaShevchenkoParser.STRING, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LengthReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lengthRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterLengthRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitLengthRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitLengthRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthReadContext lengthRead() throws RecognitionException {
		LengthReadContext _localctx = new LengthReadContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_lengthRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(505);
				intArr();
				}
				break;
			case 2:
				{
				setState(506);
				floatArr();
				}
				break;
			case 3:
				{
				setState(507);
				charArr();
				}
				break;
			case 4:
				{
				setState(508);
				funcCall();
				}
				break;
			case 5:
				{
				setState(509);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(510);
				variable();
				}
				break;
			}
			setState(513);
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
		public TerminalNode LRB() { return getToken(OfpPashaievaShevchenkoParser.LRB, 0); }
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode RRB() { return getToken(OfpPashaievaShevchenkoParser.RRB, 0); }
		public List<ComplexExprContext> complexExpr() {
			return getRuleContexts(ComplexExprContext.class);
		}
		public ComplexExprContext complexExpr(int i) {
			return getRuleContext(ComplexExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(OfpPashaievaShevchenkoParser.EQ, 0); }
		public TerminalNode GT() { return getToken(OfpPashaievaShevchenkoParser.GT, 0); }
		public TerminalNode LT() { return getToken(OfpPashaievaShevchenkoParser.LT, 0); }
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
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
		public TerminalNode TRUE() { return getToken(OfpPashaievaShevchenkoParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OfpPashaievaShevchenkoParser.FALSE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterBoolExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitBoolExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitBoolExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_boolExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(516);
				match(LRB);
				setState(517);
				boolExpr(0);
				setState(518);
				match(RRB);
				}
				break;
			case 2:
				{
				setState(520);
				complexExpr();
				setState(521);
				match(EQ);
				setState(522);
				complexExpr();
				}
				break;
			case 3:
				{
				setState(524);
				complexExpr();
				setState(525);
				match(GT);
				setState(526);
				complexExpr();
				}
				break;
			case 4:
				{
				setState(528);
				complexExpr();
				setState(529);
				match(LT);
				setState(530);
				complexExpr();
				}
				break;
			case 5:
				{
				setState(532);
				intExpr(0);
				setState(533);
				match(EQ);
				setState(534);
				intExpr(0);
				}
				break;
			case 6:
				{
				setState(536);
				intExpr(0);
				setState(537);
				match(GT);
				setState(538);
				intExpr(0);
				}
				break;
			case 7:
				{
				setState(540);
				intExpr(0);
				setState(541);
				match(LT);
				setState(542);
				intExpr(0);
				}
				break;
			case 8:
				{
				setState(544);
				floatExpr(0);
				setState(545);
				match(EQ);
				setState(546);
				floatExpr(0);
				}
				break;
			case 9:
				{
				setState(548);
				floatExpr(0);
				setState(549);
				match(GT);
				setState(550);
				floatExpr(0);
				}
				break;
			case 10:
				{
				setState(552);
				floatExpr(0);
				setState(553);
				match(LT);
				setState(554);
				floatExpr(0);
				}
				break;
			case 11:
				{
				setState(556);
				charExpr();
				setState(557);
				match(EQ);
				setState(558);
				charExpr();
				}
				break;
			case 12:
				{
				setState(560);
				funcCall();
				}
				break;
			case 13:
				{
				setState(561);
				match(TRUE);
				}
				break;
			case 14:
				{
				setState(562);
				match(FALSE);
				}
				break;
			case 15:
				{
				setState(563);
				variable();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(571);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
					setState(566);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(567);
					match(EQ);
					setState(568);
					boolExpr(6);
					}
					} 
				}
				setState(573);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
		public TerminalNode LRB() { return getToken(OfpPashaievaShevchenkoParser.LRB, 0); }
		public List<IntExprContext> intExpr() {
			return getRuleContexts(IntExprContext.class);
		}
		public IntExprContext intExpr(int i) {
			return getRuleContext(IntExprContext.class,i);
		}
		public TerminalNode RRB() { return getToken(OfpPashaievaShevchenkoParser.RRB, 0); }
		public TerminalNode MINUS() { return getToken(OfpPashaievaShevchenkoParser.MINUS, 0); }
		public ComplexExprContext complexExpr() {
			return getRuleContext(ComplexExprContext.class,0);
		}
		public LengthReadContext lengthRead() {
			return getRuleContext(LengthReadContext.class,0);
		}
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode MULT() { return getToken(OfpPashaievaShevchenkoParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(OfpPashaievaShevchenkoParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(OfpPashaievaShevchenkoParser.PLUS, 0); }
		public IntExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterIntExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitIntExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitIntExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_intExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(575);
					match(MINUS);
					}
				}

				setState(578);
				match(LRB);
				setState(579);
				intExpr(0);
				setState(580);
				match(RRB);
				}
				break;
			case 2:
				{
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(582);
					match(MINUS);
					}
				}

				setState(587);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(585);
					complexExpr();
					}
					break;
				case 2:
					{
					setState(586);
					lengthRead();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(589);
				intLiteral();
				}
				break;
			case 4:
				{
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(590);
					match(MINUS);
					}
				}

				setState(593);
				variable();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(602);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						_localctx = new IntExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(596);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(597);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(598);
						intExpr(6);
						}
						break;
					case 2:
						{
						_localctx = new IntExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_intExpr);
						setState(599);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(600);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(601);
						intExpr(5);
						}
						break;
					}
					} 
				}
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
		public TerminalNode LRB() { return getToken(OfpPashaievaShevchenkoParser.LRB, 0); }
		public List<FloatExprContext> floatExpr() {
			return getRuleContexts(FloatExprContext.class);
		}
		public FloatExprContext floatExpr(int i) {
			return getRuleContext(FloatExprContext.class,i);
		}
		public TerminalNode RRB() { return getToken(OfpPashaievaShevchenkoParser.RRB, 0); }
		public TerminalNode MINUS() { return getToken(OfpPashaievaShevchenkoParser.MINUS, 0); }
		public ComplexExprContext complexExpr() {
			return getRuleContext(ComplexExprContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode MULT() { return getToken(OfpPashaievaShevchenkoParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(OfpPashaievaShevchenkoParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(OfpPashaievaShevchenkoParser.PLUS, 0); }
		public FloatExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterFloatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitFloatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitFloatExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_floatExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(608);
					match(MINUS);
					}
				}

				setState(611);
				match(LRB);
				setState(612);
				floatExpr(0);
				setState(613);
				match(RRB);
				}
				break;
			case 2:
				{
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(615);
					match(MINUS);
					}
				}

				setState(618);
				complexExpr();
				}
				break;
			case 3:
				{
				setState(619);
				floatLiteral();
				}
				break;
			case 4:
				{
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(620);
					match(MINUS);
					}
				}

				setState(623);
				variable();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(632);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
					case 1:
						{
						_localctx = new FloatExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_floatExpr);
						setState(626);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(627);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(628);
						floatExpr(6);
						}
						break;
					case 2:
						{
						_localctx = new FloatExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_floatExpr);
						setState(629);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(630);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(631);
						floatExpr(5);
						}
						break;
					}
					} 
				}
				setState(636);
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

	public static class CharExprContext extends ParserRuleContext {
		public ComplexExprContext complexExpr() {
			return getRuleContext(ComplexExprContext.class,0);
		}
		public TerminalNode QUOTED_CHAR() { return getToken(OfpPashaievaShevchenkoParser.QUOTED_CHAR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public CharExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterCharExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitCharExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitCharExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharExprContext charExpr() throws RecognitionException {
		CharExprContext _localctx = new CharExprContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_charExpr);
		try {
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				complexExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				match(QUOTED_CHAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(639);
				variable();
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
		public TerminalNode STRING() { return getToken(OfpPashaievaShevchenkoParser.STRING, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public StrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitStrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrExprContext strExpr() throws RecognitionException {
		StrExprContext _localctx = new StrExprContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_strExpr);
		try {
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(644);
				variable();
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

	public static class IntLiteralContext extends ParserRuleContext {
		public TerminalNode INT_ZERO() { return getToken(OfpPashaievaShevchenkoParser.INT_ZERO, 0); }
		public TerminalNode POSITIVE_INT() { return getToken(OfpPashaievaShevchenkoParser.POSITIVE_INT, 0); }
		public TerminalNode MINUS() { return getToken(OfpPashaievaShevchenkoParser.MINUS, 0); }
		public IntLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntLiteralContext intLiteral() throws RecognitionException {
		IntLiteralContext _localctx = new IntLiteralContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_intLiteral);
		int _la;
		try {
			setState(652);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				match(INT_ZERO);
				}
				break;
			case MINUS:
			case POSITIVE_INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(648);
					match(MINUS);
					}
				}

				setState(651);
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_ZERO() { return getToken(OfpPashaievaShevchenkoParser.FLOAT_ZERO, 0); }
		public TerminalNode POSITIVE_FLOAT() { return getToken(OfpPashaievaShevchenkoParser.POSITIVE_FLOAT, 0); }
		public TerminalNode MINUS() { return getToken(OfpPashaievaShevchenkoParser.MINUS, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_floatLiteral);
		int _la;
		try {
			setState(659);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT_ZERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(654);
				match(FLOAT_ZERO);
				}
				break;
			case MINUS:
			case POSITIVE_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(655);
					match(MINUS);
					}
				}

				setState(658);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OfpPashaievaShevchenkoParser.ID, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OfpPashaievaShevchenkoListener ) ((OfpPashaievaShevchenkoListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OfpPashaievaShevchenkoVisitor ) return ((OfpPashaievaShevchenkoVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 58:
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		case 59:
			return intExpr_sempred((IntExprContext)_localctx, predIndex);
		case 60:
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
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u029a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\7\2\u0088\n\2\f\2\16\2\u008b"+
		"\13\2\3\2\3\2\7\2\u008f\n\2\f\2\16\2\u0092\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\5\4\u009e\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\7\7\u00ae\n\7\f\7\16\7\u00b1\13\7\5\7\u00b3\n\7\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c1\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\5\n\u00ca\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00d3\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\5\16\u00e3\n\16\3\17\3\17\5\17\u00e7\n\17\3\20\3\20\7\20\u00eb\n\20\f"+
		"\20\16\20\u00ee\13\20\3\20\3\20\3\21\3\21\6\21\u00f4\n\21\r\21\16\21\u00f5"+
		"\3\21\3\21\3\22\3\22\7\22\u00fc\n\22\f\22\16\22\u00ff\13\22\3\22\3\22"+
		"\3\23\3\23\3\23\5\23\u0106\n\23\3\24\3\24\3\24\5\24\u010b\n\24\3\25\3"+
		"\25\5\25\u010f\n\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0123\n\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0133\n\31"+
		"\3\32\3\32\5\32\u0137\n\32\3\33\3\33\5\33\u013b\n\33\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\7\34\u0146\n\34\f\34\16\34\u0149\13\34\5"+
		"\34\u014b\n\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u015c\n\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3!\3!\5!\u016f\n!\3\"\3\"\3\"\5\"\u0174\n\"\3#"+
		"\3#\3#\5#\u0179\n#\3$\3$\3$\5$\u017e\n$\3%\3%\3%\5%\u0183\n%\3&\3&\3&"+
		"\5&\u0188\n&\3\'\3\'\3\'\5\'\u018d\n\'\3(\3(\3(\5(\u0192\n(\3)\3)\3)\5"+
		")\u0197\n)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\5\62\u01b5\n\62\3\63\3\63"+
		"\3\63\3\63\5\63\u01bb\n\63\3\64\3\64\3\64\3\64\5\64\u01c1\n\64\3\65\3"+
		"\65\3\65\3\65\7\65\u01c7\n\65\f\65\16\65\u01ca\13\65\5\65\u01cc\n\65\3"+
		"\65\3\65\3\66\3\66\3\66\3\66\7\66\u01d4\n\66\f\66\16\66\u01d7\13\66\5"+
		"\66\u01d9\n\66\3\66\3\66\3\67\3\67\3\67\3\67\7\67\u01e1\n\67\f\67\16\67"+
		"\u01e4\13\67\5\67\u01e6\n\67\3\67\3\67\38\38\38\38\38\38\39\39\39\39\3"+
		"9\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\5;\u0202\n;\3;\3;\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5"+
		"<\u0237\n<\3<\3<\3<\7<\u023c\n<\f<\16<\u023f\13<\3=\3=\5=\u0243\n=\3="+
		"\3=\3=\3=\3=\5=\u024a\n=\3=\3=\5=\u024e\n=\3=\3=\5=\u0252\n=\3=\5=\u0255"+
		"\n=\3=\3=\3=\3=\3=\3=\7=\u025d\n=\f=\16=\u0260\13=\3>\3>\5>\u0264\n>\3"+
		">\3>\3>\3>\3>\5>\u026b\n>\3>\3>\3>\5>\u0270\n>\3>\5>\u0273\n>\3>\3>\3"+
		">\3>\3>\3>\7>\u027b\n>\f>\16>\u027e\13>\3?\3?\3?\5?\u0283\n?\3@\3@\3@"+
		"\5@\u0288\n@\3A\3A\5A\u028c\nA\3A\5A\u028f\nA\3B\3B\5B\u0293\nB\3B\5B"+
		"\u0296\nB\3C\3C\3C\2\5vxzD\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\2\5\3\2\26\35\3\2\16\17\3\2\f\r\2\u02d6\2\u0089\3\2\2\2\4\u0095\3\2\2"+
		"\2\6\u009d\3\2\2\2\b\u009f\3\2\2\2\n\u00a4\3\2\2\2\f\u00a9\3\2\2\2\16"+
		"\u00b6\3\2\2\2\20\u00c0\3\2\2\2\22\u00c2\3\2\2\2\24\u00cb\3\2\2\2\26\u00d4"+
		"\3\2\2\2\30\u00da\3\2\2\2\32\u00e2\3\2\2\2\34\u00e6\3\2\2\2\36\u00e8\3"+
		"\2\2\2 \u00f1\3\2\2\2\"\u00f9\3\2\2\2$\u0105\3\2\2\2&\u010a\3\2\2\2(\u010e"+
		"\3\2\2\2*\u0112\3\2\2\2,\u0122\3\2\2\2.\u0124\3\2\2\2\60\u0128\3\2\2\2"+
		"\62\u0136\3\2\2\2\64\u013a\3\2\2\2\66\u0140\3\2\2\28\u014e\3\2\2\2:\u015b"+
		"\3\2\2\2<\u015d\3\2\2\2>\u0162\3\2\2\2@\u016e\3\2\2\2B\u0170\3\2\2\2D"+
		"\u0175\3\2\2\2F\u017a\3\2\2\2H\u017f\3\2\2\2J\u0184\3\2\2\2L\u0189\3\2"+
		"\2\2N\u018e\3\2\2\2P\u0193\3\2\2\2R\u0198\3\2\2\2T\u019b\3\2\2\2V\u019e"+
		"\3\2\2\2X\u01a1\3\2\2\2Z\u01a4\3\2\2\2\\\u01a7\3\2\2\2^\u01aa\3\2\2\2"+
		"`\u01ad\3\2\2\2b\u01b4\3\2\2\2d\u01ba\3\2\2\2f\u01c0\3\2\2\2h\u01c2\3"+
		"\2\2\2j\u01cf\3\2\2\2l\u01dc\3\2\2\2n\u01e9\3\2\2\2p\u01ef\3\2\2\2r\u01f5"+
		"\3\2\2\2t\u0201\3\2\2\2v\u0236\3\2\2\2x\u0254\3\2\2\2z\u0272\3\2\2\2|"+
		"\u0282\3\2\2\2~\u0287\3\2\2\2\u0080\u028e\3\2\2\2\u0082\u0295\3\2\2\2"+
		"\u0084\u0297\3\2\2\2\u0086\u0088\5\6\4\2\u0087\u0086\3\2\2\2\u0088\u008b"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u0090\5\4\3\2\u008d\u008f\5\6\4\2\u008e\u008d\3\2"+
		"\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\2\2\3\u0094\3\3\2\2\2"+
		"\u0095\u0096\7\"\2\2\u0096\u0097\7#\2\2\u0097\u0098\7\22\2\2\u0098\u0099"+
		"\7\23\2\2\u0099\u009a\5\"\22\2\u009a\5\3\2\2\2\u009b\u009e\5\n\6\2\u009c"+
		"\u009e\5\b\5\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\7\3\2\2\2"+
		"\u009f\u00a0\5\16\b\2\u00a0\u00a1\7.\2\2\u00a1\u00a2\5\f\7\2\u00a2\u00a3"+
		"\5 \21\2\u00a3\t\3\2\2\2\u00a4\u00a5\7\"\2\2\u00a5\u00a6\7.\2\2\u00a6"+
		"\u00a7\5\f\7\2\u00a7\u00a8\5\"\22\2\u00a8\13\3\2\2\2\u00a9\u00b2\7\22"+
		"\2\2\u00aa\u00af\5\20\t\2\u00ab\u00ac\7\7\2\2\u00ac\u00ae\5\20\t\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\23\2\2\u00b5\r\3\2\2"+
		"\2\u00b6\u00b7\t\2\2\2\u00b7\17\3\2\2\2\u00b8\u00c1\5R*\2\u00b9\u00c1"+
		"\5T+\2\u00ba\u00c1\5V,\2\u00bb\u00c1\5X-\2\u00bc\u00c1\5Z.\2\u00bd\u00c1"+
		"\5\\/\2\u00be\u00c1\5^\60\2\u00bf\u00c1\5`\61\2\u00c0\u00b8\3\2\2\2\u00c0"+
		"\u00b9\3\2\2\2\u00c0\u00ba\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c0\u00bc\3\2"+
		"\2\2\u00c0\u00bd\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\21\3\2\2\2\u00c2\u00c3\7\37\2\2\u00c3\u00c4\7\22\2\2\u00c4\u00c5\5v<"+
		"\2\u00c5\u00c6\7\23\2\2\u00c6\u00c9\5\32\16\2\u00c7\u00c8\7 \2\2\u00c8"+
		"\u00ca\5\32\16\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\23\3\2"+
		"\2\2\u00cb\u00cc\7\37\2\2\u00cc\u00cd\7\22\2\2\u00cd\u00ce\5v<\2\u00ce"+
		"\u00cf\7\23\2\2\u00cf\u00d2\5\34\17\2\u00d0\u00d1\7 \2\2\u00d1\u00d3\5"+
		"\34\17\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\25\3\2\2\2\u00d4"+
		"\u00d5\7!\2\2\u00d5\u00d6\7\22\2\2\u00d6\u00d7\5v<\2\u00d7\u00d8\7\23"+
		"\2\2\u00d8\u00d9\5\32\16\2\u00d9\27\3\2\2\2\u00da\u00db\7!\2\2\u00db\u00dc"+
		"\7\22\2\2\u00dc\u00dd\5v<\2\u00dd\u00de\7\23\2\2\u00de\u00df\5\34\17\2"+
		"\u00df\31\3\2\2\2\u00e0\u00e3\5$\23\2\u00e1\u00e3\5\36\20\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\33\3\2\2\2\u00e4\u00e7\5&\24\2\u00e5"+
		"\u00e7\5\"\22\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\35\3\2\2"+
		"\2\u00e8\u00ec\7\20\2\2\u00e9\u00eb\5$\23\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\7\21\2\2\u00f0\37\3\2\2\2\u00f1\u00f3"+
		"\7\20\2\2\u00f2\u00f4\5$\23\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2"+
		"\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8"+
		"\7\21\2\2\u00f8!\3\2\2\2\u00f9\u00fd\7\20\2\2\u00fa\u00fc\5&\24\2\u00fb"+
		"\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7\21\2\2\u0101"+
		"#\3\2\2\2\u0102\u0106\5(\25\2\u0103\u0106\5\22\n\2\u0104\u0106\5\26\f"+
		"\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106%"+
		"\3\2\2\2\u0107\u010b\5*\26\2\u0108\u010b\5\24\13\2\u0109\u010b\5\30\r"+
		"\2\u010a\u0107\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b\'"+
		"\3\2\2\2\u010c\u010f\5,\27\2\u010d\u010f\58\35\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7\60\2\2\u0111)\3\2\2\2"+
		"\u0112\u0113\5,\27\2\u0113\u0114\7\60\2\2\u0114+\3\2\2\2\u0115\u0123\5"+
		"B\"\2\u0116\u0123\5D#\2\u0117\u0123\5F$\2\u0118\u0123\5H%\2\u0119\u0123"+
		"\5J&\2\u011a\u0123\5L\'\2\u011b\u0123\5N(\2\u011c\u0123\5P)\2\u011d\u0123"+
		"\5.\30\2\u011e\u0123\5\60\31\2\u011f\u0123\5\66\34\2\u0120\u0123\5<\37"+
		"\2\u0121\u0123\5> \2\u0122\u0115\3\2\2\2\u0122\u0116\3\2\2\2\u0122\u0117"+
		"\3\2\2\2\u0122\u0118\3\2\2\2\u0122\u0119\3\2\2\2\u0122\u011a\3\2\2\2\u0122"+
		"\u011b\3\2\2\2\u0122\u011c\3\2\2\2\u0122\u011d\3\2\2\2\u0122\u011e\3\2"+
		"\2\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2\2\u0123"+
		"-\3\2\2\2\u0124\u0125\7.\2\2\u0125\u0126\7\b\2\2\u0126\u0127\5:\36\2\u0127"+
		"/\3\2\2\2\u0128\u0129\5\u0084C\2\u0129\u012a\7\24\2\2\u012a\u012b\5x="+
		"\2\u012b\u012c\7\25\2\2\u012c\u0132\7\b\2\2\u012d\u0133\5\62\32\2\u012e"+
		"\u0133\5\u0084C\2\u012f\u0133\5x=\2\u0130\u0133\5z>\2\u0131\u0133\5|?"+
		"\2\u0132\u012d\3\2\2\2\u0132\u012e\3\2\2\2\u0132\u012f\3\2\2\2\u0132\u0130"+
		"\3\2\2\2\u0132\u0131\3\2\2\2\u0133\61\3\2\2\2\u0134\u0137\5\66\34\2\u0135"+
		"\u0137\5\64\33\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\63\3\2"+
		"\2\2\u0138\u013b\5\u0084C\2\u0139\u013b\5\66\34\2\u013a\u0138\3\2\2\2"+
		"\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\7\24\2\2\u013d\u013e"+
		"\5x=\2\u013e\u013f\7\25\2\2\u013f\65\3\2\2\2\u0140\u0141\7.\2\2\u0141"+
		"\u014a\7\22\2\2\u0142\u0147\5:\36\2\u0143\u0144\7\7\2\2\u0144\u0146\5"+
		":\36\2\u0145\u0143\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u0142\3\2"+
		"\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014d\7\23\2\2\u014d"+
		"\67\3\2\2\2\u014e\u014f\7\36\2\2\u014f\u0150\5:\36\2\u01509\3\2\2\2\u0151"+
		"\u015c\5\62\32\2\u0152\u015c\5\u0084C\2\u0153\u015c\5x=\2\u0154\u015c"+
		"\5z>\2\u0155\u015c\5|?\2\u0156\u015c\5v<\2\u0157\u015c\5~@\2\u0158\u015c"+
		"\5b\62\2\u0159\u015c\5d\63\2\u015a\u015c\5f\64\2\u015b\u0151\3\2\2\2\u015b"+
		"\u0152\3\2\2\2\u015b\u0153\3\2\2\2\u015b\u0154\3\2\2\2\u015b\u0155\3\2"+
		"\2\2\u015b\u0156\3\2\2\2\u015b\u0157\3\2\2\2\u015b\u0158\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c;\3\2\2\2\u015d\u015e\7$\2\2\u015e"+
		"\u015f\7\22\2\2\u015f\u0160\5@!\2\u0160\u0161\7\23\2\2\u0161=\3\2\2\2"+
		"\u0162\u0163\7%\2\2\u0163\u0164\7\22\2\2\u0164\u0165\5@!\2\u0165\u0166"+
		"\7\23\2\2\u0166?\3\2\2\2\u0167\u016f\5\62\32\2\u0168\u016f\5\u0084C\2"+
		"\u0169\u016f\5x=\2\u016a\u016f\5z>\2\u016b\u016f\5v<\2\u016c\u016f\5|"+
		"?\2\u016d\u016f\5~@\2\u016e\u0167\3\2\2\2\u016e\u0168\3\2\2\2\u016e\u0169"+
		"\3\2\2\2\u016e\u016a\3\2\2\2\u016e\u016b\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016d\3\2\2\2\u016fA\3\2\2\2\u0170\u0173\5R*\2\u0171\u0172\7\b\2\2\u0172"+
		"\u0174\5x=\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174C\3\2\2\2\u0175"+
		"\u0178\5T+\2\u0176\u0177\7\b\2\2\u0177\u0179\5z>\2\u0178\u0176\3\2\2\2"+
		"\u0178\u0179\3\2\2\2\u0179E\3\2\2\2\u017a\u017d\5V,\2\u017b\u017c\7\b"+
		"\2\2\u017c\u017e\5|?\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017eG"+
		"\3\2\2\2\u017f\u0182\5X-\2\u0180\u0181\7\b\2\2\u0181\u0183\5v<\2\u0182"+
		"\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183I\3\2\2\2\u0184\u0187\5Z.\2\u0185"+
		"\u0186\7\b\2\2\u0186\u0188\5~@\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2"+
		"\2\u0188K\3\2\2\2\u0189\u018c\5\\/\2\u018a\u018b\7\b\2\2\u018b\u018d\5"+
		"b\62\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018dM\3\2\2\2\u018e\u0191"+
		"\5^\60\2\u018f\u0190\7\b\2\2\u0190\u0192\5d\63\2\u0191\u018f\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192O\3\2\2\2\u0193\u0196\5`\61\2\u0194\u0195\7\b\2\2"+
		"\u0195\u0197\5f\64\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197Q\3"+
		"\2\2\2\u0198\u0199\7\33\2\2\u0199\u019a\7.\2\2\u019aS\3\2\2\2\u019b\u019c"+
		"\7\34\2\2\u019c\u019d\7.\2\2\u019dU\3\2\2\2\u019e\u019f\7\35\2\2\u019f"+
		"\u01a0\7.\2\2\u01a0W\3\2\2\2\u01a1\u01a2\7\31\2\2\u01a2\u01a3\7.\2\2\u01a3"+
		"Y\3\2\2\2\u01a4\u01a5\7\32\2\2\u01a5\u01a6\7.\2\2\u01a6[\3\2\2\2\u01a7"+
		"\u01a8\7\26\2\2\u01a8\u01a9\7.\2\2\u01a9]\3\2\2\2\u01aa\u01ab\7\27\2\2"+
		"\u01ab\u01ac\7.\2\2\u01ac_\3\2\2\2\u01ad\u01ae\7\30\2\2\u01ae\u01af\7"+
		".\2\2\u01afa\3\2\2\2\u01b0\u01b5\5h\65\2\u01b1\u01b5\5n8\2\u01b2\u01b5"+
		"\5\66\34\2\u01b3\u01b5\5\u0084C\2\u01b4\u01b0\3\2\2\2\u01b4\u01b1\3\2"+
		"\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5c\3\2\2\2\u01b6\u01bb"+
		"\5j\66\2\u01b7\u01bb\5p9\2\u01b8\u01bb\5\66\34\2\u01b9\u01bb\5\u0084C"+
		"\2\u01ba\u01b6\3\2\2\2\u01ba\u01b7\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9"+
		"\3\2\2\2\u01bbe\3\2\2\2\u01bc\u01c1\5l\67\2\u01bd\u01c1\5r:\2\u01be\u01c1"+
		"\5\66\34\2\u01bf\u01c1\5\u0084C\2\u01c0\u01bc\3\2\2\2\u01c0\u01bd\3\2"+
		"\2\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1g\3\2\2\2\u01c2\u01cb"+
		"\7\20\2\2\u01c3\u01c8\5x=\2\u01c4\u01c5\7\7\2\2\u01c5\u01c7\5x=\2\u01c6"+
		"\u01c4\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2"+
		"\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01c3\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\7\21\2\2\u01cei\3\2\2\2"+
		"\u01cf\u01d8\7\20\2\2\u01d0\u01d5\5z>\2\u01d1\u01d2\7\7\2\2\u01d2\u01d4"+
		"\5z>\2\u01d3\u01d1\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d0\3\2"+
		"\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\7\21\2\2\u01db"+
		"k\3\2\2\2\u01dc\u01e5\7\20\2\2\u01dd\u01e2\5|?\2\u01de\u01df\7\7\2\2\u01df"+
		"\u01e1\5|?\2\u01e0\u01de\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2"+
		"\2\u01e2\u01e3\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01dd"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\7\21\2\2"+
		"\u01e8m\3\2\2\2\u01e9\u01ea\7\5\2\2\u01ea\u01eb\7\33\2\2\u01eb\u01ec\7"+
		"\24\2\2\u01ec\u01ed\5x=\2\u01ed\u01ee\7\25\2\2\u01eeo\3\2\2\2\u01ef\u01f0"+
		"\7\5\2\2\u01f0\u01f1\7\34\2\2\u01f1\u01f2\7\24\2\2\u01f2\u01f3\5x=\2\u01f3"+
		"\u01f4\7\25\2\2\u01f4q\3\2\2\2\u01f5\u01f6\7\5\2\2\u01f6\u01f7\7\35\2"+
		"\2\u01f7\u01f8\7\24\2\2\u01f8\u01f9\5x=\2\u01f9\u01fa\7\25\2\2\u01fas"+
		"\3\2\2\2\u01fb\u0202\5h\65\2\u01fc\u0202\5j\66\2\u01fd\u0202\5l\67\2\u01fe"+
		"\u0202\5\66\34\2\u01ff\u0202\7,\2\2\u0200\u0202\5\u0084C\2\u0201\u01fb"+
		"\3\2\2\2\u0201\u01fc\3\2\2\2\u0201\u01fd\3\2\2\2\u0201\u01fe\3\2\2\2\u0201"+
		"\u01ff\3\2\2\2\u0201\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\7\6"+
		"\2\2\u0204u\3\2\2\2\u0205\u0206\b<\1\2\u0206\u0207\7\22\2\2\u0207\u0208"+
		"\5v<\2\u0208\u0209\7\23\2\2\u0209\u0237\3\2\2\2\u020a\u020b\5\62\32\2"+
		"\u020b\u020c\7\t\2\2\u020c\u020d\5\62\32\2\u020d\u0237\3\2\2\2\u020e\u020f"+
		"\5\62\32\2\u020f\u0210\7\n\2\2\u0210\u0211\5\62\32\2\u0211\u0237\3\2\2"+
		"\2\u0212\u0213\5\62\32\2\u0213\u0214\7\13\2\2\u0214\u0215\5\62\32\2\u0215"+
		"\u0237\3\2\2\2\u0216\u0217\5x=\2\u0217\u0218\7\t\2\2\u0218\u0219\5x=\2"+
		"\u0219\u0237\3\2\2\2\u021a\u021b\5x=\2\u021b\u021c\7\n\2\2\u021c\u021d"+
		"\5x=\2\u021d\u0237\3\2\2\2\u021e\u021f\5x=\2\u021f\u0220\7\13\2\2\u0220"+
		"\u0221\5x=\2\u0221\u0237\3\2\2\2\u0222\u0223\5z>\2\u0223\u0224\7\t\2\2"+
		"\u0224\u0225\5z>\2\u0225\u0237\3\2\2\2\u0226\u0227\5z>\2\u0227\u0228\7"+
		"\n\2\2\u0228\u0229\5z>\2\u0229\u0237\3\2\2\2\u022a\u022b\5z>\2\u022b\u022c"+
		"\7\13\2\2\u022c\u022d\5z>\2\u022d\u0237\3\2\2\2\u022e\u022f\5|?\2\u022f"+
		"\u0230\7\t\2\2\u0230\u0231\5|?\2\u0231\u0237\3\2\2\2\u0232\u0237\5\66"+
		"\34\2\u0233\u0237\7&\2\2\u0234\u0237\7\'\2\2\u0235\u0237\5\u0084C\2\u0236"+
		"\u0205\3\2\2\2\u0236\u020a\3\2\2\2\u0236\u020e\3\2\2\2\u0236\u0212\3\2"+
		"\2\2\u0236\u0216\3\2\2\2\u0236\u021a\3\2\2\2\u0236\u021e\3\2\2\2\u0236"+
		"\u0222\3\2\2\2\u0236\u0226\3\2\2\2\u0236\u022a\3\2\2\2\u0236\u022e\3\2"+
		"\2\2\u0236\u0232\3\2\2\2\u0236\u0233\3\2\2\2\u0236\u0234\3\2\2\2\u0236"+
		"\u0235\3\2\2\2\u0237\u023d\3\2\2\2\u0238\u0239\f\7\2\2\u0239\u023a\7\t"+
		"\2\2\u023a\u023c\5v<\b\u023b\u0238\3\2\2\2\u023c\u023f\3\2\2\2\u023d\u023b"+
		"\3\2\2\2\u023d\u023e\3\2\2\2\u023ew\3\2\2\2\u023f\u023d\3\2\2\2\u0240"+
		"\u0242\b=\1\2\u0241\u0243\7\r\2\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2"+
		"\2\2\u0243\u0244\3\2\2\2\u0244\u0245\7\22\2\2\u0245\u0246\5x=\2\u0246"+
		"\u0247\7\23\2\2\u0247\u0255\3\2\2\2\u0248\u024a\7\r\2\2\u0249\u0248\3"+
		"\2\2\2\u0249\u024a\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u024e\5\62\32\2\u024c"+
		"\u024e\5t;\2\u024d\u024b\3\2\2\2\u024d\u024c\3\2\2\2\u024e\u0255\3\2\2"+
		"\2\u024f\u0255\5\u0080A\2\u0250\u0252\7\r\2\2\u0251\u0250\3\2\2\2\u0251"+
		"\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\5\u0084C\2\u0254\u0240"+
		"\3\2\2\2\u0254\u0249\3\2\2\2\u0254\u024f\3\2\2\2\u0254\u0251\3\2\2\2\u0255"+
		"\u025e\3\2\2\2\u0256\u0257\f\7\2\2\u0257\u0258\t\3\2\2\u0258\u025d\5x"+
		"=\b\u0259\u025a\f\6\2\2\u025a\u025b\t\4\2\2\u025b\u025d\5x=\7\u025c\u0256"+
		"\3\2\2\2\u025c\u0259\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e"+
		"\u025f\3\2\2\2\u025fy\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0263\b>\1\2\u0262"+
		"\u0264\7\r\2\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\3\2"+
		"\2\2\u0265\u0266\7\22\2\2\u0266\u0267\5z>\2\u0267\u0268\7\23\2\2\u0268"+
		"\u0273\3\2\2\2\u0269\u026b\7\r\2\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2"+
		"\2\2\u026b\u026c\3\2\2\2\u026c\u0273\5\62\32\2\u026d\u0273\5\u0082B\2"+
		"\u026e\u0270\7\r\2\2\u026f\u026e\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271"+
		"\3\2\2\2\u0271\u0273\5\u0084C\2\u0272\u0261\3\2\2\2\u0272\u026a\3\2\2"+
		"\2\u0272\u026d\3\2\2\2\u0272\u026f\3\2\2\2\u0273\u027c\3\2\2\2\u0274\u0275"+
		"\f\7\2\2\u0275\u0276\t\3\2\2\u0276\u027b\5z>\b\u0277\u0278\f\6\2\2\u0278"+
		"\u0279\t\4\2\2\u0279\u027b\5z>\7\u027a\u0274\3\2\2\2\u027a\u0277\3\2\2"+
		"\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d{"+
		"\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0283\5\62\32\2\u0280\u0283\7-\2\2"+
		"\u0281\u0283\5\u0084C\2\u0282\u027f\3\2\2\2\u0282\u0280\3\2\2\2\u0282"+
		"\u0281\3\2\2\2\u0283}\3\2\2\2\u0284\u0288\5\66\34\2\u0285\u0288\7,\2\2"+
		"\u0286\u0288\5\u0084C\2\u0287\u0284\3\2\2\2\u0287\u0285\3\2\2\2\u0287"+
		"\u0286\3\2\2\2\u0288\177\3\2\2\2\u0289\u028f\7+\2\2\u028a\u028c\7\r\2"+
		"\2\u028b\u028a\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028f"+
		"\7*\2\2\u028e\u0289\3\2\2\2\u028e\u028b\3\2\2\2\u028f\u0081\3\2\2\2\u0290"+
		"\u0296\7)\2\2\u0291\u0293\7\r\2\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2"+
		"\2\2\u0293\u0294\3\2\2\2\u0294\u0296\7(\2\2\u0295\u0290\3\2\2\2\u0295"+
		"\u0292\3\2\2\2\u0296\u0083\3\2\2\2\u0297\u0298\7.\2\2\u0298\u0085\3\2"+
		"\2\2A\u0089\u0090\u009d\u00af\u00b2\u00c0\u00c9\u00d2\u00e2\u00e6\u00ec"+
		"\u00f5\u00fd\u0105\u010a\u010e\u0122\u0132\u0136\u013a\u0147\u014a\u015b"+
		"\u016e\u0173\u0178\u017d\u0182\u0187\u018c\u0191\u0196\u01b4\u01ba\u01c0"+
		"\u01c8\u01cb\u01d5\u01d8\u01e2\u01e5\u0201\u0236\u023d\u0242\u0249\u024d"+
		"\u0251\u0254\u025c\u025e\u0263\u026a\u026f\u0272\u027a\u027c\u0282\u0287"+
		"\u028b\u028e\u0292\u0295";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}