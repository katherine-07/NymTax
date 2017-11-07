// Generated from G:/git-oxygen/Nymtax/src/NymtaxParser\Nymtax.g4 by ANTLR 4.7
package antlr4.generate;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NymtaxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RUN_MAIN=1, WHEN=2, OTHERWISE=3, EVERY=4, THROUGHOUT=5, CONDITION=6, EVENT=7, 
		BASE=8, DO=9, SEND=10, WRITE=11, READ=12, STOP=13, PROCEED=14, INT=15, 
		FLO=16, CHR=17, STRNG=18, VOID=19, NULL=20, LPAREN=21, RPAREN=22, LBRACE=23, 
		RBRACE=24, LBRACK=25, RBRACK=26, SEMI=27, COMMA=28, DOT=29, ASSIGN=30, 
		GT=31, LT=32, NOT=33, TILDE=34, QUESTION=35, COLON=36, EQUAL=37, LE=38, 
		GE=39, NOTEQUAL=40, AND=41, OR=42, INC=43, DEC=44, ADD=45, SUB=46, MUL=47, 
		DIV=48, BITAND=49, BITOR=50, CARET=51, MOD=52, AT_SIGN=53, ADD_ASSIGN=54, 
		SUB_ASSIGN=55, MUL_ASSIGN=56, DIV_ASSIGN=57, AND_ASSIGN=58, OR_ASSIGN=59, 
		XOR_ASSIGN=60, MOD_ASSIGN=61, LSHIFT=62, LSHIFT_ASSIGN=63, RSHIFT=64, 
		RSHIFT_ASSIGN=65, URSHIFT_ASSIGN=66, IDENTIFIER=67, INTEGER=68, SIGN=69, 
		FLOAT=70, CHAR=71, STRING=72, NTERM=73, NFACTOR=74, ASCII=75, ASCII_CHARS=76, 
		WS=77, LETTER_NUMBER=78, LETTER=79, NUMBER=80;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"RUN_MAIN", "WHEN", "OTHERWISE", "EVERY", "THROUGHOUT", "CONDITION", "EVENT", 
		"BASE", "DO", "SEND", "WRITE", "READ", "STOP", "PROCEED", "INT", "FLO", 
		"CHR", "STRNG", "VOID", "NULL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "NOT", 
		"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
		"MOD", "AT_SIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT", "LSHIFT_ASSIGN", 
		"RSHIFT", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "IDENTIFIER", "INTEGER", 
		"SIGN", "FLOAT", "CHAR", "STRING", "NTERM", "NFACTOR", "ASCII", "ASCII_CHARS", 
		"WS", "LETTER_NUMBER", "LETTER", "NUMBER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'RUN MAIN'", "'WHEN'", "'OTHERWISE'", "'EVERY'", "'THROUGHOUT'", 
		"'CONDITION'", "'EVENT'", "'BASE'", "'DO'", "'SEND'", "'WRITE'", "'READ'", 
		"'STOP'", "'PROCEED'", "'INTEGER'", "'FLOAT'", "'CHAR'", "'STRING'", "'VOID'", 
		"'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
		"'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", 
		"'|'", "'^'", "'%'", "'@'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
		"'^='", "'%='", "'<<'", "'<<='", "'>>'", "'>>='", "'>>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "RUN_MAIN", "WHEN", "OTHERWISE", "EVERY", "THROUGHOUT", "CONDITION", 
		"EVENT", "BASE", "DO", "SEND", "WRITE", "READ", "STOP", "PROCEED", "INT", 
		"FLO", "CHR", "STRNG", "VOID", "NULL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "NOT", 
		"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
		"MOD", "AT_SIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT", "LSHIFT_ASSIGN", 
		"RSHIFT", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "IDENTIFIER", "INTEGER", 
		"SIGN", "FLOAT", "CHAR", "STRING", "NTERM", "NFACTOR", "ASCII", "ASCII_CHARS", 
		"WS", "LETTER_NUMBER", "LETTER", "NUMBER"
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


	public NymtaxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Nymtax.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2R\u01e4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&"+
		"\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-"+
		"\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<"+
		"\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3C"+
		"\3C\3C\3C\3C\3D\3D\3D\6D\u019e\nD\rD\16D\u019f\5D\u01a2\nD\3E\3E\3E\3"+
		"F\3F\5F\u01a9\nF\3G\3G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\3J\3J\3J\5J\u01c4\nJ\3K\3K\3K\3K\5K\u01ca\nK\3L\3L\5L\u01ce"+
		"\nL\3M\6M\u01d1\nM\rM\16M\u01d2\3N\6N\u01d6\nN\rN\16N\u01d7\3N\3N\3O\3"+
		"O\5O\u01de\nO\3P\5P\u01e1\nP\3Q\3Q\2\2R\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097"+
		"M\u0099N\u009bO\u009dP\u009fQ\u00a1R\3\2\6\6\2#\61<B]b}\u0081\5\2\n\f"+
		"\16\17\"\"\4\2C\\c|\3\2\62;\2\u01f0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\3\u00a3\3\2\2"+
		"\2\5\u00ac\3\2\2\2\7\u00b1\3\2\2\2\t\u00bb\3\2\2\2\13\u00c1\3\2\2\2\r"+
		"\u00cc\3\2\2\2\17\u00d6\3\2\2\2\21\u00dc\3\2\2\2\23\u00e1\3\2\2\2\25\u00e4"+
		"\3\2\2\2\27\u00e9\3\2\2\2\31\u00ef\3\2\2\2\33\u00f4\3\2\2\2\35\u00f9\3"+
		"\2\2\2\37\u0101\3\2\2\2!\u0109\3\2\2\2#\u010f\3\2\2\2%\u0114\3\2\2\2\'"+
		"\u011b\3\2\2\2)\u0120\3\2\2\2+\u0125\3\2\2\2-\u0127\3\2\2\2/\u0129\3\2"+
		"\2\2\61\u012b\3\2\2\2\63\u012d\3\2\2\2\65\u012f\3\2\2\2\67\u0131\3\2\2"+
		"\29\u0133\3\2\2\2;\u0135\3\2\2\2=\u0137\3\2\2\2?\u0139\3\2\2\2A\u013b"+
		"\3\2\2\2C\u013d\3\2\2\2E\u013f\3\2\2\2G\u0141\3\2\2\2I\u0143\3\2\2\2K"+
		"\u0145\3\2\2\2M\u0148\3\2\2\2O\u014b\3\2\2\2Q\u014e\3\2\2\2S\u0151\3\2"+
		"\2\2U\u0154\3\2\2\2W\u0157\3\2\2\2Y\u015a\3\2\2\2[\u015d\3\2\2\2]\u015f"+
		"\3\2\2\2_\u0161\3\2\2\2a\u0163\3\2\2\2c\u0165\3\2\2\2e\u0167\3\2\2\2g"+
		"\u0169\3\2\2\2i\u016b\3\2\2\2k\u016d\3\2\2\2m\u016f\3\2\2\2o\u0172\3\2"+
		"\2\2q\u0175\3\2\2\2s\u0178\3\2\2\2u\u017b\3\2\2\2w\u017e\3\2\2\2y\u0181"+
		"\3\2\2\2{\u0184\3\2\2\2}\u0187\3\2\2\2\177\u018a\3\2\2\2\u0081\u018e\3"+
		"\2\2\2\u0083\u0191\3\2\2\2\u0085\u0195\3\2\2\2\u0087\u01a1\3\2\2\2\u0089"+
		"\u01a3\3\2\2\2\u008b\u01a8\3\2\2\2\u008d\u01aa\3\2\2\2\u008f\u01ae\3\2"+
		"\2\2\u0091\u01b2\3\2\2\2\u0093\u01c3\3\2\2\2\u0095\u01c9\3\2\2\2\u0097"+
		"\u01cd\3\2\2\2\u0099\u01d0\3\2\2\2\u009b\u01d5\3\2\2\2\u009d\u01dd\3\2"+
		"\2\2\u009f\u01e0\3\2\2\2\u00a1\u01e2\3\2\2\2\u00a3\u00a4\7T\2\2\u00a4"+
		"\u00a5\7W\2\2\u00a5\u00a6\7P\2\2\u00a6\u00a7\7\"\2\2\u00a7\u00a8\7O\2"+
		"\2\u00a8\u00a9\7C\2\2\u00a9\u00aa\7K\2\2\u00aa\u00ab\7P\2\2\u00ab\4\3"+
		"\2\2\2\u00ac\u00ad\7Y\2\2\u00ad\u00ae\7J\2\2\u00ae\u00af\7G\2\2\u00af"+
		"\u00b0\7P\2\2\u00b0\6\3\2\2\2\u00b1\u00b2\7Q\2\2\u00b2\u00b3\7V\2\2\u00b3"+
		"\u00b4\7J\2\2\u00b4\u00b5\7G\2\2\u00b5\u00b6\7T\2\2\u00b6\u00b7\7Y\2\2"+
		"\u00b7\u00b8\7K\2\2\u00b8\u00b9\7U\2\2\u00b9\u00ba\7G\2\2\u00ba\b\3\2"+
		"\2\2\u00bb\u00bc\7G\2\2\u00bc\u00bd\7X\2\2\u00bd\u00be\7G\2\2\u00be\u00bf"+
		"\7T\2\2\u00bf\u00c0\7[\2\2\u00c0\n\3\2\2\2\u00c1\u00c2\7V\2\2\u00c2\u00c3"+
		"\7J\2\2\u00c3\u00c4\7T\2\2\u00c4\u00c5\7Q\2\2\u00c5\u00c6\7W\2\2\u00c6"+
		"\u00c7\7I\2\2\u00c7\u00c8\7J\2\2\u00c8\u00c9\7Q\2\2\u00c9\u00ca\7W\2\2"+
		"\u00ca\u00cb\7V\2\2\u00cb\f\3\2\2\2\u00cc\u00cd\7E\2\2\u00cd\u00ce\7Q"+
		"\2\2\u00ce\u00cf\7P\2\2\u00cf\u00d0\7F\2\2\u00d0\u00d1\7K\2\2\u00d1\u00d2"+
		"\7V\2\2\u00d2\u00d3\7K\2\2\u00d3\u00d4\7Q\2\2\u00d4\u00d5\7P\2\2\u00d5"+
		"\16\3\2\2\2\u00d6\u00d7\7G\2\2\u00d7\u00d8\7X\2\2\u00d8\u00d9\7G\2\2\u00d9"+
		"\u00da\7P\2\2\u00da\u00db\7V\2\2\u00db\20\3\2\2\2\u00dc\u00dd\7D\2\2\u00dd"+
		"\u00de\7C\2\2\u00de\u00df\7U\2\2\u00df\u00e0\7G\2\2\u00e0\22\3\2\2\2\u00e1"+
		"\u00e2\7F\2\2\u00e2\u00e3\7Q\2\2\u00e3\24\3\2\2\2\u00e4\u00e5\7U\2\2\u00e5"+
		"\u00e6\7G\2\2\u00e6\u00e7\7P\2\2\u00e7\u00e8\7F\2\2\u00e8\26\3\2\2\2\u00e9"+
		"\u00ea\7Y\2\2\u00ea\u00eb\7T\2\2\u00eb\u00ec\7K\2\2\u00ec\u00ed\7V\2\2"+
		"\u00ed\u00ee\7G\2\2\u00ee\30\3\2\2\2\u00ef\u00f0\7T\2\2\u00f0\u00f1\7"+
		"G\2\2\u00f1\u00f2\7C\2\2\u00f2\u00f3\7F\2\2\u00f3\32\3\2\2\2\u00f4\u00f5"+
		"\7U\2\2\u00f5\u00f6\7V\2\2\u00f6\u00f7\7Q\2\2\u00f7\u00f8\7R\2\2\u00f8"+
		"\34\3\2\2\2\u00f9\u00fa\7R\2\2\u00fa\u00fb\7T\2\2\u00fb\u00fc\7Q\2\2\u00fc"+
		"\u00fd\7E\2\2\u00fd\u00fe\7G\2\2\u00fe\u00ff\7G\2\2\u00ff\u0100\7F\2\2"+
		"\u0100\36\3\2\2\2\u0101\u0102\7K\2\2\u0102\u0103\7P\2\2\u0103\u0104\7"+
		"V\2\2\u0104\u0105\7G\2\2\u0105\u0106\7I\2\2\u0106\u0107\7G\2\2\u0107\u0108"+
		"\7T\2\2\u0108 \3\2\2\2\u0109\u010a\7H\2\2\u010a\u010b\7N\2\2\u010b\u010c"+
		"\7Q\2\2\u010c\u010d\7C\2\2\u010d\u010e\7V\2\2\u010e\"\3\2\2\2\u010f\u0110"+
		"\7E\2\2\u0110\u0111\7J\2\2\u0111\u0112\7C\2\2\u0112\u0113\7T\2\2\u0113"+
		"$\3\2\2\2\u0114\u0115\7U\2\2\u0115\u0116\7V\2\2\u0116\u0117\7T\2\2\u0117"+
		"\u0118\7K\2\2\u0118\u0119\7P\2\2\u0119\u011a\7I\2\2\u011a&\3\2\2\2\u011b"+
		"\u011c\7X\2\2\u011c\u011d\7Q\2\2\u011d\u011e\7K\2\2\u011e\u011f\7F\2\2"+
		"\u011f(\3\2\2\2\u0120\u0121\7p\2\2\u0121\u0122\7w\2\2\u0122\u0123\7n\2"+
		"\2\u0123\u0124\7n\2\2\u0124*\3\2\2\2\u0125\u0126\7*\2\2\u0126,\3\2\2\2"+
		"\u0127\u0128\7+\2\2\u0128.\3\2\2\2\u0129\u012a\7}\2\2\u012a\60\3\2\2\2"+
		"\u012b\u012c\7\177\2\2\u012c\62\3\2\2\2\u012d\u012e\7]\2\2\u012e\64\3"+
		"\2\2\2\u012f\u0130\7_\2\2\u0130\66\3\2\2\2\u0131\u0132\7=\2\2\u01328\3"+
		"\2\2\2\u0133\u0134\7.\2\2\u0134:\3\2\2\2\u0135\u0136\7\60\2\2\u0136<\3"+
		"\2\2\2\u0137\u0138\7?\2\2\u0138>\3\2\2\2\u0139\u013a\7@\2\2\u013a@\3\2"+
		"\2\2\u013b\u013c\7>\2\2\u013cB\3\2\2\2\u013d\u013e\7#\2\2\u013eD\3\2\2"+
		"\2\u013f\u0140\7\u0080\2\2\u0140F\3\2\2\2\u0141\u0142\7A\2\2\u0142H\3"+
		"\2\2\2\u0143\u0144\7<\2\2\u0144J\3\2\2\2\u0145\u0146\7?\2\2\u0146\u0147"+
		"\7?\2\2\u0147L\3\2\2\2\u0148\u0149\7>\2\2\u0149\u014a\7?\2\2\u014aN\3"+
		"\2\2\2\u014b\u014c\7@\2\2\u014c\u014d\7?\2\2\u014dP\3\2\2\2\u014e\u014f"+
		"\7#\2\2\u014f\u0150\7?\2\2\u0150R\3\2\2\2\u0151\u0152\7(\2\2\u0152\u0153"+
		"\7(\2\2\u0153T\3\2\2\2\u0154\u0155\7~\2\2\u0155\u0156\7~\2\2\u0156V\3"+
		"\2\2\2\u0157\u0158\7-\2\2\u0158\u0159\7-\2\2\u0159X\3\2\2\2\u015a\u015b"+
		"\7/\2\2\u015b\u015c\7/\2\2\u015cZ\3\2\2\2\u015d\u015e\7-\2\2\u015e\\\3"+
		"\2\2\2\u015f\u0160\7/\2\2\u0160^\3\2\2\2\u0161\u0162\7,\2\2\u0162`\3\2"+
		"\2\2\u0163\u0164\7\61\2\2\u0164b\3\2\2\2\u0165\u0166\7(\2\2\u0166d\3\2"+
		"\2\2\u0167\u0168\7~\2\2\u0168f\3\2\2\2\u0169\u016a\7`\2\2\u016ah\3\2\2"+
		"\2\u016b\u016c\7\'\2\2\u016cj\3\2\2\2\u016d\u016e\7B\2\2\u016el\3\2\2"+
		"\2\u016f\u0170\7-\2\2\u0170\u0171\7?\2\2\u0171n\3\2\2\2\u0172\u0173\7"+
		"/\2\2\u0173\u0174\7?\2\2\u0174p\3\2\2\2\u0175\u0176\7,\2\2\u0176\u0177"+
		"\7?\2\2\u0177r\3\2\2\2\u0178\u0179\7\61\2\2\u0179\u017a\7?\2\2\u017at"+
		"\3\2\2\2\u017b\u017c\7(\2\2\u017c\u017d\7?\2\2\u017dv\3\2\2\2\u017e\u017f"+
		"\7~\2\2\u017f\u0180\7?\2\2\u0180x\3\2\2\2\u0181\u0182\7`\2\2\u0182\u0183"+
		"\7?\2\2\u0183z\3\2\2\2\u0184\u0185\7\'\2\2\u0185\u0186\7?\2\2\u0186|\3"+
		"\2\2\2\u0187\u0188\7>\2\2\u0188\u0189\7>\2\2\u0189~\3\2\2\2\u018a\u018b"+
		"\7>\2\2\u018b\u018c\7>\2\2\u018c\u018d\7?\2\2\u018d\u0080\3\2\2\2\u018e"+
		"\u018f\7@\2\2\u018f\u0190\7@\2\2\u0190\u0082\3\2\2\2\u0191\u0192\7@\2"+
		"\2\u0192\u0193\7@\2\2\u0193\u0194\7?\2\2\u0194\u0084\3\2\2\2\u0195\u0196"+
		"\7@\2\2\u0196\u0197\7@\2\2\u0197\u0198\7@\2\2\u0198\u0199\7?\2\2\u0199"+
		"\u0086\3\2\2\2\u019a\u01a2\5\u009fP\2\u019b\u019d\5\u009fP\2\u019c\u019e"+
		"\5\u009dO\2\u019d\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u019d\3\2\2"+
		"\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019a\3\2\2\2\u01a1\u019b"+
		"\3\2\2\2\u01a2\u0088\3\2\2\2\u01a3\u01a4\5\u008bF\2\u01a4\u01a5\5\u00a1"+
		"Q\2\u01a5\u008a\3\2\2\2\u01a6\u01a9\5[.\2\u01a7\u01a9\5]/\2\u01a8\u01a6"+
		"\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9\u008c\3\2\2\2\u01aa\u01ab\5\u00a1Q"+
		"\2\u01ab\u01ac\5;\36\2\u01ac\u01ad\5\u00a1Q\2\u01ad\u008e\3\2\2\2\u01ae"+
		"\u01af\5g\64\2\u01af\u01b0\5\u0097L\2\u01b0\u01b1\5g\64\2\u01b1\u0090"+
		"\3\2\2\2\u01b2\u01b3\7$\2\2\u01b3\u01b4\5\u0099M\2\u01b4\u01b5\7$\2\2"+
		"\u01b5\u0092\3\2\2\2\u01b6\u01b7\5\u0095K\2\u01b7\u01b8\7,\2\2\u01b8\u01b9"+
		"\5\u0093J\2\u01b9\u01c4\3\2\2\2\u01ba\u01bb\5\u0095K\2\u01bb\u01bc\7\61"+
		"\2\2\u01bc\u01bd\5\u0093J\2\u01bd\u01c4\3\2\2\2\u01be\u01bf\5\u0095K\2"+
		"\u01bf\u01c0\7\'\2\2\u01c0\u01c1\5\u0093J\2\u01c1\u01c4\3\2\2\2\u01c2"+
		"\u01c4\5\u0095K\2\u01c3\u01b6\3\2\2\2\u01c3\u01ba\3\2\2\2\u01c3\u01be"+
		"\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4\u0094\3\2\2\2\u01c5\u01ca\5\u008fH"+
		"\2\u01c6\u01ca\5\u0089E\2\u01c7\u01ca\5\u008dG\2\u01c8\u01ca\5\u0087D"+
		"\2\u01c9\u01c5\3\2\2\2\u01c9\u01c6\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01c8"+
		"\3\2\2\2\u01ca\u0096\3\2\2\2\u01cb\u01ce\5\u009dO\2\u01cc\u01ce\t\2\2"+
		"\2\u01cd\u01cb\3\2\2\2\u01cd\u01cc\3\2\2\2\u01ce\u0098\3\2\2\2\u01cf\u01d1"+
		"\5\u0097L\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d0\3\2\2"+
		"\2\u01d2\u01d3\3\2\2\2\u01d3\u009a\3\2\2\2\u01d4\u01d6\t\3\2\2\u01d5\u01d4"+
		"\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01da\bN\2\2\u01da\u009c\3\2\2\2\u01db\u01de\5\u00a1"+
		"Q\2\u01dc\u01de\5\u009fP\2\u01dd\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01de"+
		"\u009e\3\2\2\2\u01df\u01e1\t\4\2\2\u01e0\u01df\3\2\2\2\u01e1\u00a0\3\2"+
		"\2\2\u01e2\u01e3\t\5\2\2\u01e3\u00a2\3\2\2\2\r\2\u019f\u01a1\u01a8\u01c3"+
		"\u01c9\u01cd\u01d2\u01d7\u01dd\u01e0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}