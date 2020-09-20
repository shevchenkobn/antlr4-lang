// Generated from ./OfpPashaievaShevchenko.g4 by ANTLR 4.8

package ua.nure.lnu2020.ofp_4dv507.bogdan;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OfpBogdanLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMMENT", "NEW", "LENGTH", "COMMA", "ASSIGN", "EQ", "GT", "LT", 
			"PLUS", "MINUS", "MULT", "DIV", "LCB", "RCB", "LRB", "RRB", "LSB", "RSB", 
			"DT_INT_ARR", "DT_FLOAT_ARR", "DT_CHAR_ARR", "DT_BOOL", "DT_STR", "DT_INT", 
			"DT_FLOAT", "DT_CHAR", "RETURN", "IF", "ELSE", "WHILE", "VOID", "MAIN", 
			"PRINT", "PRINTLN", "TRUE", "FALSE", "POSITIVE_FLOAT", "FLOAT_ZERO", 
			"POSITIVE_INT", "INT_ZERO", "STRING", "QUOTED_CHAR", "ID", "CHAR", "SC"
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


	public OfpBogdanLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "OfpPashaievaShevchenko.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u0143\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\3\2\6\2a\n\2\r\2\16\2b\3\2\3\2\3\3\3\3\7\3i"+
		"\n\3\f\3\16\3l\13\3\3\3\5\3o\n\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3\'\3\'\7\'\u0101\n\'\f\'\16\'\u0104\13\'\3\'\3\'\6\'\u0108\n\'\r"+
		"\'\16\'\u0109\3\'\3\'\3\'\3\'\7\'\u0110\n\'\f\'\16\'\u0113\13\'\3\'\3"+
		"\'\7\'\u0117\n\'\f\'\16\'\u011a\13\'\5\'\u011c\n\'\3(\3(\3(\3(\6(\u0122"+
		"\n(\r(\16(\u0123\3)\3)\7)\u0128\n)\f)\16)\u012b\13)\3*\3*\3+\3+\6+\u0131"+
		"\n+\r+\16+\u0132\3+\3+\3,\3,\3,\3,\3-\6-\u013c\n-\r-\16-\u013d\3.\3.\3"+
		"/\3/\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60\3\2\6\5\2\13\f\17\17"+
		"\"\"\4\2\f\f\17\17\4\2C\\c|\13\2\"#*+..\60\60<<??AAC\\c|\2\u014e\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3`\3\2\2\2\5f\3\2\2\2"+
		"\7t\3\2\2\2\tx\3\2\2\2\13\u0080\3\2\2\2\r\u0082\3\2\2\2\17\u0084\3\2\2"+
		"\2\21\u0087\3\2\2\2\23\u0089\3\2\2\2\25\u008b\3\2\2\2\27\u008d\3\2\2\2"+
		"\31\u008f\3\2\2\2\33\u0091\3\2\2\2\35\u0093\3\2\2\2\37\u0095\3\2\2\2!"+
		"\u0097\3\2\2\2#\u0099\3\2\2\2%\u009b\3\2\2\2\'\u009d\3\2\2\2)\u009f\3"+
		"\2\2\2+\u00a3\3\2\2\2-\u00a7\3\2\2\2/\u00ab\3\2\2\2\61\u00b0\3\2\2\2\63"+
		"\u00b7\3\2\2\2\65\u00bb\3\2\2\2\67\u00c1\3\2\2\29\u00c6\3\2\2\2;\u00cd"+
		"\3\2\2\2=\u00d0\3\2\2\2?\u00d5\3\2\2\2A\u00db\3\2\2\2C\u00e0\3\2\2\2E"+
		"\u00e5\3\2\2\2G\u00eb\3\2\2\2I\u00f3\3\2\2\2K\u00f8\3\2\2\2M\u011b\3\2"+
		"\2\2O\u011d\3\2\2\2Q\u0125\3\2\2\2S\u012c\3\2\2\2U\u012e\3\2\2\2W\u0136"+
		"\3\2\2\2Y\u013b\3\2\2\2[\u013f\3\2\2\2]\u0141\3\2\2\2_a\t\2\2\2`_\3\2"+
		"\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\b\2\2\2e\4\3\2\2\2fj\7"+
		"%\2\2gi\n\3\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3"+
		"\2\2\2mo\7\17\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\f\2\2qr\3\2\2\2rs"+
		"\b\3\3\2s\6\3\2\2\2tu\7p\2\2uv\7g\2\2vw\7y\2\2w\b\3\2\2\2xy\7\60\2\2y"+
		"z\7n\2\2z{\7g\2\2{|\7p\2\2|}\7i\2\2}~\7v\2\2~\177\7j\2\2\177\n\3\2\2\2"+
		"\u0080\u0081\7.\2\2\u0081\f\3\2\2\2\u0082\u0083\7?\2\2\u0083\16\3\2\2"+
		"\2\u0084\u0085\7?\2\2\u0085\u0086\7?\2\2\u0086\20\3\2\2\2\u0087\u0088"+
		"\7@\2\2\u0088\22\3\2\2\2\u0089\u008a\7>\2\2\u008a\24\3\2\2\2\u008b\u008c"+
		"\7-\2\2\u008c\26\3\2\2\2\u008d\u008e\7/\2\2\u008e\30\3\2\2\2\u008f\u0090"+
		"\7,\2\2\u0090\32\3\2\2\2\u0091\u0092\7\61\2\2\u0092\34\3\2\2\2\u0093\u0094"+
		"\7}\2\2\u0094\36\3\2\2\2\u0095\u0096\7\177\2\2\u0096 \3\2\2\2\u0097\u0098"+
		"\7*\2\2\u0098\"\3\2\2\2\u0099\u009a\7+\2\2\u009a$\3\2\2\2\u009b\u009c"+
		"\7]\2\2\u009c&\3\2\2\2\u009d\u009e\7_\2\2\u009e(\3\2\2\2\u009f\u00a0\5"+
		"\63\32\2\u00a0\u00a1\5%\23\2\u00a1\u00a2\5\'\24\2\u00a2*\3\2\2\2\u00a3"+
		"\u00a4\5\65\33\2\u00a4\u00a5\5%\23\2\u00a5\u00a6\5\'\24\2\u00a6,\3\2\2"+
		"\2\u00a7\u00a8\5\67\34\2\u00a8\u00a9\5%\23\2\u00a9\u00aa\5\'\24\2\u00aa"+
		".\3\2\2\2\u00ab\u00ac\7d\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7q\2\2\u00ae"+
		"\u00af\7n\2\2\u00af\60\3\2\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7v\2\2\u00b2"+
		"\u00b3\7t\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7p\2\2\u00b5\u00b6\7i\2\2"+
		"\u00b6\62\3\2\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7"+
		"v\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7h\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be"+
		"\7q\2\2\u00be\u00bf\7c\2\2\u00bf\u00c0\7v\2\2\u00c0\66\3\2\2\2\u00c1\u00c2"+
		"\7e\2\2\u00c2\u00c3\7j\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7t\2\2\u00c5"+
		"8\3\2\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7v\2\2\u00c9"+
		"\u00ca\7w\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7p\2\2\u00cc:\3\2\2\2\u00cd"+
		"\u00ce\7k\2\2\u00ce\u00cf\7h\2\2\u00cf<\3\2\2\2\u00d0\u00d1\7g\2\2\u00d1"+
		"\u00d2\7n\2\2\u00d2\u00d3\7u\2\2\u00d3\u00d4\7g\2\2\u00d4>\3\2\2\2\u00d5"+
		"\u00d6\7y\2\2\u00d6\u00d7\7j\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7n\2\2"+
		"\u00d9\u00da\7g\2\2\u00da@\3\2\2\2\u00db\u00dc\7x\2\2\u00dc\u00dd\7q\2"+
		"\2\u00dd\u00de\7k\2\2\u00de\u00df\7f\2\2\u00dfB\3\2\2\2\u00e0\u00e1\7"+
		"o\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7p\2\2\u00e4D"+
		"\3\2\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7k\2\2\u00e8"+
		"\u00e9\7p\2\2\u00e9\u00ea\7v\2\2\u00eaF\3\2\2\2\u00eb\u00ec\7r\2\2\u00ec"+
		"\u00ed\7t\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7v\2\2"+
		"\u00f0\u00f1\7n\2\2\u00f1\u00f2\7p\2\2\u00f2H\3\2\2\2\u00f3\u00f4\7v\2"+
		"\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7w\2\2\u00f6\u00f7\7g\2\2\u00f7J\3\2"+
		"\2\2\u00f8\u00f9\7h\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc"+
		"\7u\2\2\u00fc\u00fd\7g\2\2\u00fdL\3\2\2\2\u00fe\u0102\4\63;\2\u00ff\u0101"+
		"\4\62;\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0107\7\60"+
		"\2\2\u0106\u0108\4\62;\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u011c\3\2\2\2\u010b\u010c\7\62"+
		"\2\2\u010c\u010d\7\60\2\2\u010d\u0111\3\2\2\2\u010e\u0110\4\62;\2\u010f"+
		"\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0118\4\63;\2\u0115"+
		"\u0117\4\62;\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"\u00fe\3\2\2\2\u011b\u010b\3\2\2\2\u011cN\3\2\2\2\u011d\u011e\7\62\2\2"+
		"\u011e\u011f\7\60\2\2\u011f\u0121\3\2\2\2\u0120\u0122\7\62\2\2\u0121\u0120"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"P\3\2\2\2\u0125\u0129\4\63;\2\u0126\u0128\4\62;\2\u0127\u0126\3\2\2\2"+
		"\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012aR\3"+
		"\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7\62\2\2\u012dT\3\2\2\2\u012e\u0130"+
		"\7$\2\2\u012f\u0131\5[.\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7$"+
		"\2\2\u0135V\3\2\2\2\u0136\u0137\7)\2\2\u0137\u0138\5[.\2\u0138\u0139\7"+
		")\2\2\u0139X\3\2\2\2\u013a\u013c\t\4\2\2\u013b\u013a\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013eZ\3\2\2\2\u013f"+
		"\u0140\t\5\2\2\u0140\\\3\2\2\2\u0141\u0142\7=\2\2\u0142^\3\2\2\2\17\2"+
		"bjn\u0102\u0109\u0111\u0118\u011b\u0123\u0129\u0132\u013d\4\b\2\2\2\4"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}