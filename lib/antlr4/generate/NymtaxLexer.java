// Generated from C:/Users/Luisa Gilig/Documents/GitHub/NymTax/src/NymtaxParser\Nymtax.g4 by ANTLR 4.7
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
		FLO=16, CHR=17, STRNG=18, STRING=19, VOID=20, NULL=21, LPAREN=22, RPAREN=23, 
		LBRACE=24, RBRACE=25, LBRACK=26, RBRACK=27, SEMI=28, COMMA=29, DOT=30, 
		QUOTE=31, ASSIGN=32, GT=33, LT=34, NOT=35, TILDE=36, QUESTION=37, COLON=38, 
		EQUAL=39, LE=40, GE=41, NOTEQUAL=42, AND=43, OR=44, INC=45, DEC=46, ADD=47, 
		SUB=48, MUL=49, DIV=50, BITAND=51, BITOR=52, CARET=53, MOD=54, AT_SIGN=55, 
		ADD_ASSIGN=56, SUB_ASSIGN=57, MUL_ASSIGN=58, DIV_ASSIGN=59, AND_ASSIGN=60, 
		OR_ASSIGN=61, XOR_ASSIGN=62, MOD_ASSIGN=63, LSHIFT=64, LSHIFT_ASSIGN=65, 
		RSHIFT=66, RSHIFT_ASSIGN=67, URSHIFT_ASSIGN=68, NEW=69, NFACTOR=70, IDENTIFIER=71, 
		INTEGER=72, SIGN=73, FLOAT=74, CHAR=75, ASCII=76, ASCII_CHARS=77, WS=78, 
		LETTER_NUMBER=79, LETTER=80, NUMBER=81;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"RUN_MAIN", "WHEN", "OTHERWISE", "EVERY", "THROUGHOUT", "CONDITION", "EVENT", 
		"BASE", "DO", "SEND", "WRITE", "READ", "STOP", "PROCEED", "INT", "FLO", 
		"CHR", "STRNG", "STRING", "StringCharacters", "StringCharacter", "EscapeSequence", 
		"VOID", "NULL", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT", "QUOTE", "ASSIGN", "GT", "LT", "NOT", "TILDE", 
		"QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", 
		"DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", 
		"AT_SIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT", "LSHIFT_ASSIGN", "RSHIFT", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "NEW", "NFACTOR", "IDENTIFIER", "INTEGER", 
		"SIGN", "FLOAT", "CHAR", "ASCII", "ASCII_CHARS", "WS", "LETTER_NUMBER", 
		"LETTER", "NUMBER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'RUN MAIN'", "'WHEN'", "'OTHERWISE'", "'EVERY'", "'THROUGHOUT'", 
		"'CONDITION'", "'EVENT'", "'BASE'", "'DO'", "'SEND'", "'WRITE'", "'READ'", 
		"'STOP'", "'PROCEED'", "'INTEGER'", "'FLOAT'", "'CHAR'", "'STRING'", null, 
		"'VOID'", "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
		"'.'", "'\"'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", 
		"'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", 
		"'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'@'", "'+='", "'-='", "'*='", 
		"'/='", "'&='", "'|='", "'^='", "'%='", "'<<'", "'<<='", "'>>'", "'>>='", 
		"'>>>='", "'NEW'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "RUN_MAIN", "WHEN", "OTHERWISE", "EVERY", "THROUGHOUT", "CONDITION", 
		"EVENT", "BASE", "DO", "SEND", "WRITE", "READ", "STOP", "PROCEED", "INT", 
		"FLO", "CHR", "STRNG", "STRING", "VOID", "NULL", "LPAREN", "RPAREN", "LBRACE", 
		"RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "QUOTE", "ASSIGN", 
		"GT", "LT", "NOT", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", 
		"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", 
		"BITOR", "CARET", "MOD", "AT_SIGN", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
		"DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT", 
		"LSHIFT_ASSIGN", "RSHIFT", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "NEW", "NFACTOR", 
		"IDENTIFIER", "INTEGER", "SIGN", "FLOAT", "CHAR", "ASCII", "ASCII_CHARS", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2S\u01f1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u0126\n\24\3\24"+
		"\3\24\3\25\6\25\u012b\n\25\r\25\16\25\u012c\3\26\3\26\5\26\u0131\n\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3"+
		",\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3"+
		":\3:\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3"+
		"B\3B\3C\3C\3C\3D\3D\3D\3E\3E\3E\3E\3F\3F\3F\3G\3G\3G\3G\3H\3H\3H\3H\3"+
		"H\3I\3I\3I\3I\3J\3J\3J\3J\5J\u01bf\nJ\3K\3K\3K\6K\u01c4\nK\rK\16K\u01c5"+
		"\5K\u01c8\nK\3L\3L\3L\3M\3M\5M\u01cf\nM\3N\3N\3N\3N\3O\3O\3O\3O\3P\3P"+
		"\5P\u01db\nP\3Q\6Q\u01de\nQ\rQ\16Q\u01df\3R\6R\u01e3\nR\rR\16R\u01e4\3"+
		"R\3R\3S\3S\5S\u01eb\nS\3T\5T\u01ee\nT\3U\3U\2\2V\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\2+\2-\2/\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A\37C E!G\"I#K$M"+
		"%O&Q\'S(U)W*Y+[,]-_.a/c\60e\61g\62i\63k\64m\65o\66q\67s8u9w:y;{<}=\177"+
		">\u0081?\u0083@\u0085A\u0087B\u0089C\u008bD\u008dE\u008fF\u0091G\u0093"+
		"H\u0095I\u0097J\u0099K\u009bL\u009dM\u009fN\u00a1O\u00a3P\u00a5Q\u00a7"+
		"R\u00a9S\3\2\b\4\2$$^^\n\2$$))^^ddhhppttvv\6\2#\61<B]b}\u0081\5\2\13\f"+
		"\16\17\"\"\4\2C\\c|\3\2\62;\2\u01fa\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2/\3\2"+
		"\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2"+
		";\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3"+
		"\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2"+
		"\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2"+
		"a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3"+
		"\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2"+
		"\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2"+
		"\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d"+
		"\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2"+
		"\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f"+
		"\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2"+
		"\2\2\u00a9\3\2\2\2\3\u00ab\3\2\2\2\5\u00b4\3\2\2\2\7\u00b9\3\2\2\2\t\u00c3"+
		"\3\2\2\2\13\u00c9\3\2\2\2\r\u00d4\3\2\2\2\17\u00de\3\2\2\2\21\u00e4\3"+
		"\2\2\2\23\u00e9\3\2\2\2\25\u00ec\3\2\2\2\27\u00f1\3\2\2\2\31\u00f7\3\2"+
		"\2\2\33\u00fc\3\2\2\2\35\u0101\3\2\2\2\37\u0109\3\2\2\2!\u0111\3\2\2\2"+
		"#\u0117\3\2\2\2%\u011c\3\2\2\2\'\u0123\3\2\2\2)\u012a\3\2\2\2+\u0130\3"+
		"\2\2\2-\u0132\3\2\2\2/\u0135\3\2\2\2\61\u013a\3\2\2\2\63\u013f\3\2\2\2"+
		"\65\u0141\3\2\2\2\67\u0143\3\2\2\29\u0145\3\2\2\2;\u0147\3\2\2\2=\u0149"+
		"\3\2\2\2?\u014b\3\2\2\2A\u014d\3\2\2\2C\u014f\3\2\2\2E\u0151\3\2\2\2G"+
		"\u0153\3\2\2\2I\u0155\3\2\2\2K\u0157\3\2\2\2M\u0159\3\2\2\2O\u015b\3\2"+
		"\2\2Q\u015d\3\2\2\2S\u015f\3\2\2\2U\u0161\3\2\2\2W\u0164\3\2\2\2Y\u0167"+
		"\3\2\2\2[\u016a\3\2\2\2]\u016d\3\2\2\2_\u0170\3\2\2\2a\u0173\3\2\2\2c"+
		"\u0176\3\2\2\2e\u0179\3\2\2\2g\u017b\3\2\2\2i\u017d\3\2\2\2k\u017f\3\2"+
		"\2\2m\u0181\3\2\2\2o\u0183\3\2\2\2q\u0185\3\2\2\2s\u0187\3\2\2\2u\u0189"+
		"\3\2\2\2w\u018b\3\2\2\2y\u018e\3\2\2\2{\u0191\3\2\2\2}\u0194\3\2\2\2\177"+
		"\u0197\3\2\2\2\u0081\u019a\3\2\2\2\u0083\u019d\3\2\2\2\u0085\u01a0\3\2"+
		"\2\2\u0087\u01a3\3\2\2\2\u0089\u01a6\3\2\2\2\u008b\u01aa\3\2\2\2\u008d"+
		"\u01ad\3\2\2\2\u008f\u01b1\3\2\2\2\u0091\u01b6\3\2\2\2\u0093\u01be\3\2"+
		"\2\2\u0095\u01c7\3\2\2\2\u0097\u01c9\3\2\2\2\u0099\u01ce\3\2\2\2\u009b"+
		"\u01d0\3\2\2\2\u009d\u01d4\3\2\2\2\u009f\u01da\3\2\2\2\u00a1\u01dd\3\2"+
		"\2\2\u00a3\u01e2\3\2\2\2\u00a5\u01ea\3\2\2\2\u00a7\u01ed\3\2\2\2\u00a9"+
		"\u01ef\3\2\2\2\u00ab\u00ac\7T\2\2\u00ac\u00ad\7W\2\2\u00ad\u00ae\7P\2"+
		"\2\u00ae\u00af\7\"\2\2\u00af\u00b0\7O\2\2\u00b0\u00b1\7C\2\2\u00b1\u00b2"+
		"\7K\2\2\u00b2\u00b3\7P\2\2\u00b3\4\3\2\2\2\u00b4\u00b5\7Y\2\2\u00b5\u00b6"+
		"\7J\2\2\u00b6\u00b7\7G\2\2\u00b7\u00b8\7P\2\2\u00b8\6\3\2\2\2\u00b9\u00ba"+
		"\7Q\2\2\u00ba\u00bb\7V\2\2\u00bb\u00bc\7J\2\2\u00bc\u00bd\7G\2\2\u00bd"+
		"\u00be\7T\2\2\u00be\u00bf\7Y\2\2\u00bf\u00c0\7K\2\2\u00c0\u00c1\7U\2\2"+
		"\u00c1\u00c2\7G\2\2\u00c2\b\3\2\2\2\u00c3\u00c4\7G\2\2\u00c4\u00c5\7X"+
		"\2\2\u00c5\u00c6\7G\2\2\u00c6\u00c7\7T\2\2\u00c7\u00c8\7[\2\2\u00c8\n"+
		"\3\2\2\2\u00c9\u00ca\7V\2\2\u00ca\u00cb\7J\2\2\u00cb\u00cc\7T\2\2\u00cc"+
		"\u00cd\7Q\2\2\u00cd\u00ce\7W\2\2\u00ce\u00cf\7I\2\2\u00cf\u00d0\7J\2\2"+
		"\u00d0\u00d1\7Q\2\2\u00d1\u00d2\7W\2\2\u00d2\u00d3\7V\2\2\u00d3\f\3\2"+
		"\2\2\u00d4\u00d5\7E\2\2\u00d5\u00d6\7Q\2\2\u00d6\u00d7\7P\2\2\u00d7\u00d8"+
		"\7F\2\2\u00d8\u00d9\7K\2\2\u00d9\u00da\7V\2\2\u00da\u00db\7K\2\2\u00db"+
		"\u00dc\7Q\2\2\u00dc\u00dd\7P\2\2\u00dd\16\3\2\2\2\u00de\u00df\7G\2\2\u00df"+
		"\u00e0\7X\2\2\u00e0\u00e1\7G\2\2\u00e1\u00e2\7P\2\2\u00e2\u00e3\7V\2\2"+
		"\u00e3\20\3\2\2\2\u00e4\u00e5\7D\2\2\u00e5\u00e6\7C\2\2\u00e6\u00e7\7"+
		"U\2\2\u00e7\u00e8\7G\2\2\u00e8\22\3\2\2\2\u00e9\u00ea\7F\2\2\u00ea\u00eb"+
		"\7Q\2\2\u00eb\24\3\2\2\2\u00ec\u00ed\7U\2\2\u00ed\u00ee\7G\2\2\u00ee\u00ef"+
		"\7P\2\2\u00ef\u00f0\7F\2\2\u00f0\26\3\2\2\2\u00f1\u00f2\7Y\2\2\u00f2\u00f3"+
		"\7T\2\2\u00f3\u00f4\7K\2\2\u00f4\u00f5\7V\2\2\u00f5\u00f6\7G\2\2\u00f6"+
		"\30\3\2\2\2\u00f7\u00f8\7T\2\2\u00f8\u00f9\7G\2\2\u00f9\u00fa\7C\2\2\u00fa"+
		"\u00fb\7F\2\2\u00fb\32\3\2\2\2\u00fc\u00fd\7U\2\2\u00fd\u00fe\7V\2\2\u00fe"+
		"\u00ff\7Q\2\2\u00ff\u0100\7R\2\2\u0100\34\3\2\2\2\u0101\u0102\7R\2\2\u0102"+
		"\u0103\7T\2\2\u0103\u0104\7Q\2\2\u0104\u0105\7E\2\2\u0105\u0106\7G\2\2"+
		"\u0106\u0107\7G\2\2\u0107\u0108\7F\2\2\u0108\36\3\2\2\2\u0109\u010a\7"+
		"K\2\2\u010a\u010b\7P\2\2\u010b\u010c\7V\2\2\u010c\u010d\7G\2\2\u010d\u010e"+
		"\7I\2\2\u010e\u010f\7G\2\2\u010f\u0110\7T\2\2\u0110 \3\2\2\2\u0111\u0112"+
		"\7H\2\2\u0112\u0113\7N\2\2\u0113\u0114\7Q\2\2\u0114\u0115\7C\2\2\u0115"+
		"\u0116\7V\2\2\u0116\"\3\2\2\2\u0117\u0118\7E\2\2\u0118\u0119\7J\2\2\u0119"+
		"\u011a\7C\2\2\u011a\u011b\7T\2\2\u011b$\3\2\2\2\u011c\u011d\7U\2\2\u011d"+
		"\u011e\7V\2\2\u011e\u011f\7T\2\2\u011f\u0120\7K\2\2\u0120\u0121\7P\2\2"+
		"\u0121\u0122\7I\2\2\u0122&\3\2\2\2\u0123\u0125\5E#\2\u0124\u0126\5)\25"+
		"\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128"+
		"\5E#\2\u0128(\3\2\2\2\u0129\u012b\5+\26\2\u012a\u0129\3\2\2\2\u012b\u012c"+
		"\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d*\3\2\2\2\u012e"+
		"\u0131\n\2\2\2\u012f\u0131\5-\27\2\u0130\u012e\3\2\2\2\u0130\u012f\3\2"+
		"\2\2\u0131,\3\2\2\2\u0132\u0133\7^\2\2\u0133\u0134\t\3\2\2\u0134.\3\2"+
		"\2\2\u0135\u0136\7X\2\2\u0136\u0137\7Q\2\2\u0137\u0138\7K\2\2\u0138\u0139"+
		"\7F\2\2\u0139\60\3\2\2\2\u013a\u013b\7p\2\2\u013b\u013c\7w\2\2\u013c\u013d"+
		"\7n\2\2\u013d\u013e\7n\2\2\u013e\62\3\2\2\2\u013f\u0140\7*\2\2\u0140\64"+
		"\3\2\2\2\u0141\u0142\7+\2\2\u0142\66\3\2\2\2\u0143\u0144\7}\2\2\u0144"+
		"8\3\2\2\2\u0145\u0146\7\177\2\2\u0146:\3\2\2\2\u0147\u0148\7]\2\2\u0148"+
		"<\3\2\2\2\u0149\u014a\7_\2\2\u014a>\3\2\2\2\u014b\u014c\7=\2\2\u014c@"+
		"\3\2\2\2\u014d\u014e\7.\2\2\u014eB\3\2\2\2\u014f\u0150\7\60\2\2\u0150"+
		"D\3\2\2\2\u0151\u0152\7$\2\2\u0152F\3\2\2\2\u0153\u0154\7?\2\2\u0154H"+
		"\3\2\2\2\u0155\u0156\7@\2\2\u0156J\3\2\2\2\u0157\u0158\7>\2\2\u0158L\3"+
		"\2\2\2\u0159\u015a\7#\2\2\u015aN\3\2\2\2\u015b\u015c\7\u0080\2\2\u015c"+
		"P\3\2\2\2\u015d\u015e\7A\2\2\u015eR\3\2\2\2\u015f\u0160\7<\2\2\u0160T"+
		"\3\2\2\2\u0161\u0162\7?\2\2\u0162\u0163\7?\2\2\u0163V\3\2\2\2\u0164\u0165"+
		"\7>\2\2\u0165\u0166\7?\2\2\u0166X\3\2\2\2\u0167\u0168\7@\2\2\u0168\u0169"+
		"\7?\2\2\u0169Z\3\2\2\2\u016a\u016b\7#\2\2\u016b\u016c\7?\2\2\u016c\\\3"+
		"\2\2\2\u016d\u016e\7(\2\2\u016e\u016f\7(\2\2\u016f^\3\2\2\2\u0170\u0171"+
		"\7~\2\2\u0171\u0172\7~\2\2\u0172`\3\2\2\2\u0173\u0174\7-\2\2\u0174\u0175"+
		"\7-\2\2\u0175b\3\2\2\2\u0176\u0177\7/\2\2\u0177\u0178\7/\2\2\u0178d\3"+
		"\2\2\2\u0179\u017a\7-\2\2\u017af\3\2\2\2\u017b\u017c\7/\2\2\u017ch\3\2"+
		"\2\2\u017d\u017e\7,\2\2\u017ej\3\2\2\2\u017f\u0180\7\61\2\2\u0180l\3\2"+
		"\2\2\u0181\u0182\7(\2\2\u0182n\3\2\2\2\u0183\u0184\7~\2\2\u0184p\3\2\2"+
		"\2\u0185\u0186\7`\2\2\u0186r\3\2\2\2\u0187\u0188\7\'\2\2\u0188t\3\2\2"+
		"\2\u0189\u018a\7B\2\2\u018av\3\2\2\2\u018b\u018c\7-\2\2\u018c\u018d\7"+
		"?\2\2\u018dx\3\2\2\2\u018e\u018f\7/\2\2\u018f\u0190\7?\2\2\u0190z\3\2"+
		"\2\2\u0191\u0192\7,\2\2\u0192\u0193\7?\2\2\u0193|\3\2\2\2\u0194\u0195"+
		"\7\61\2\2\u0195\u0196\7?\2\2\u0196~\3\2\2\2\u0197\u0198\7(\2\2\u0198\u0199"+
		"\7?\2\2\u0199\u0080\3\2\2\2\u019a\u019b\7~\2\2\u019b\u019c\7?\2\2\u019c"+
		"\u0082\3\2\2\2\u019d\u019e\7`\2\2\u019e\u019f\7?\2\2\u019f\u0084\3\2\2"+
		"\2\u01a0\u01a1\7\'\2\2\u01a1\u01a2\7?\2\2\u01a2\u0086\3\2\2\2\u01a3\u01a4"+
		"\7>\2\2\u01a4\u01a5\7>\2\2\u01a5\u0088\3\2\2\2\u01a6\u01a7\7>\2\2\u01a7"+
		"\u01a8\7>\2\2\u01a8\u01a9\7?\2\2\u01a9\u008a\3\2\2\2\u01aa\u01ab\7@\2"+
		"\2\u01ab\u01ac\7@\2\2\u01ac\u008c\3\2\2\2\u01ad\u01ae\7@\2\2\u01ae\u01af"+
		"\7@\2\2\u01af\u01b0\7?\2\2\u01b0\u008e\3\2\2\2\u01b1\u01b2\7@\2\2\u01b2"+
		"\u01b3\7@\2\2\u01b3\u01b4\7@\2\2\u01b4\u01b5\7?\2\2\u01b5\u0090\3\2\2"+
		"\2\u01b6\u01b7\7P\2\2\u01b7\u01b8\7G\2\2\u01b8\u01b9\7Y\2\2\u01b9\u0092"+
		"\3\2\2\2\u01ba\u01bf\5\u009dO\2\u01bb\u01bf\5\u0097L\2\u01bc\u01bf\5\u009b"+
		"N\2\u01bd\u01bf\5\u0095K\2\u01be\u01ba\3\2\2\2\u01be\u01bb\3\2\2\2\u01be"+
		"\u01bc\3\2\2\2\u01be\u01bd\3\2\2\2\u01bf\u0094\3\2\2\2\u01c0\u01c8\5\u00a7"+
		"T\2\u01c1\u01c3\5\u00a7T\2\u01c2\u01c4\5\u00a5S\2\u01c3\u01c2\3\2\2\2"+
		"\u01c4\u01c5\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8"+
		"\3\2\2\2\u01c7\u01c0\3\2\2\2\u01c7\u01c1\3\2\2\2\u01c8\u0096\3\2\2\2\u01c9"+
		"\u01ca\5\u0099M\2\u01ca\u01cb\5\u00a9U\2\u01cb\u0098\3\2\2\2\u01cc\u01cf"+
		"\5e\63\2\u01cd\u01cf\5g\64\2\u01ce\u01cc\3\2\2\2\u01ce\u01cd\3\2\2\2\u01cf"+
		"\u009a\3\2\2\2\u01d0\u01d1\5\u00a9U\2\u01d1\u01d2\5C\"\2\u01d2\u01d3\5"+
		"\u00a9U\2\u01d3\u009c\3\2\2\2\u01d4\u01d5\5q9\2\u01d5\u01d6\5\u009fP\2"+
		"\u01d6\u01d7\5q9\2\u01d7\u009e\3\2\2\2\u01d8\u01db\5\u00a5S\2\u01d9\u01db"+
		"\t\4\2\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01db\u00a0\3\2\2\2\u01dc"+
		"\u01de\5\u009fP\2\u01dd\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01dd"+
		"\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u00a2\3\2\2\2\u01e1\u01e3\t\5\2\2\u01e2"+
		"\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2"+
		"\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\bR\2\2\u01e7\u00a4\3\2\2\2\u01e8"+
		"\u01eb\5\u00a9U\2\u01e9\u01eb\5\u00a7T\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9"+
		"\3\2\2\2\u01eb\u00a6\3\2\2\2\u01ec\u01ee\t\6\2\2\u01ed\u01ec\3\2\2\2\u01ee"+
		"\u00a8\3\2\2\2\u01ef\u01f0\t\7\2\2\u01f0\u00aa\3\2\2\2\17\2\u0125\u012c"+
		"\u0130\u01be\u01c5\u01c7\u01ce\u01da\u01df\u01e4\u01ea\u01ed\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}