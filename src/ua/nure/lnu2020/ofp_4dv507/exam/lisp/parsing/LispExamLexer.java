// Generated from ./LispExam.g4 by ANTLR 4.8

package ua.nure.lnu2020.ofp_4dv507.exam.lisp.parsing;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LispExamLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WS=6, COMMENT=7, ID=8, INT_LITERAL=9, 
		PLUS=10, MINUS=11, LRB=12, RRB=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "WS", "COMMENT", "ID", "INT_LITERAL", 
			"PLUS", "MINUS", "LRB", "RRB"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'defn'", "'['", "']'", "'def'", "'println'", null, null, null, 
			null, "'+'", "'-'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "WS", "COMMENT", "ID", "INT_LITERAL", 
			"PLUS", "MINUS", "LRB", "RRB"
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


	public LispExamLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LispExam.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17]\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\6\7\64\n\7\r\7\16\7\65"+
		"\3\7\3\7\3\b\3\b\7\b<\n\b\f\b\16\b?\13\b\3\b\5\bB\n\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\7\tJ\n\t\f\t\16\tM\13\t\3\n\3\n\7\nQ\n\n\f\n\16\nT\13\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\3\2\6\5\2\13\f\17\17\"\"\3\2\f\f\4\2C\\"+
		"c|\7\2//\62;C\\aac|\2a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\"\3\2\2"+
		"\2\7$\3\2\2\2\t&\3\2\2\2\13*\3\2\2\2\r\63\3\2\2\2\179\3\2\2\2\21G\3\2"+
		"\2\2\23N\3\2\2\2\25U\3\2\2\2\27W\3\2\2\2\31Y\3\2\2\2\33[\3\2\2\2\35\36"+
		"\7f\2\2\36\37\7g\2\2\37 \7h\2\2 !\7p\2\2!\4\3\2\2\2\"#\7]\2\2#\6\3\2\2"+
		"\2$%\7_\2\2%\b\3\2\2\2&\'\7f\2\2\'(\7g\2\2()\7h\2\2)\n\3\2\2\2*+\7r\2"+
		"\2+,\7t\2\2,-\7k\2\2-.\7p\2\2./\7v\2\2/\60\7n\2\2\60\61\7p\2\2\61\f\3"+
		"\2\2\2\62\64\t\2\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3"+
		"\2\2\2\66\67\3\2\2\2\678\b\7\2\28\16\3\2\2\29=\7=\2\2:<\n\3\2\2;:\3\2"+
		"\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>A\3\2\2\2?=\3\2\2\2@B\7\17\2\2A@\3"+
		"\2\2\2AB\3\2\2\2BC\3\2\2\2CD\7\f\2\2DE\3\2\2\2EF\b\b\2\2F\20\3\2\2\2G"+
		"K\t\4\2\2HJ\t\5\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\22\3\2\2"+
		"\2MK\3\2\2\2NR\4\63;\2OQ\4\62;\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2"+
		"\2S\24\3\2\2\2TR\3\2\2\2UV\7-\2\2V\26\3\2\2\2WX\7/\2\2X\30\3\2\2\2YZ\7"+
		"*\2\2Z\32\3\2\2\2[\\\7+\2\2\\\34\3\2\2\2\b\2\65=AKR\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}