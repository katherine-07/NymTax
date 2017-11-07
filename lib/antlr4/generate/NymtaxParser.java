// Generated from G:/git-oxygen/Nymtax/src/NymtaxParser\Nymtax.g4 by ANTLR 4.7
package antlr4.generate;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NymtaxParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_data_type = 1, RULE_var_declaration = 2, RULE_list_var = 3, 
		RULE_list_constants = 4, RULE_const_declaration = 5, RULE_constant = 6, 
		RULE_list_statement = 7, RULE_statement = 8, RULE_function_call_stat = 9, 
		RULE_list_parameter = 10, RULE_send_statement = 11, RULE_expression = 12, 
		RULE_string_expression = 13, RULE_numerical_expression = 14, RULE_boolean_expression = 15, 
		RULE_boolean_logic = 16, RULE_bool_term = 17, RULE_relation_ops = 18, 
		RULE_assign = 19, RULE_write_statement = 20, RULE_write_list = 21, RULE_read_statement = 22, 
		RULE_input_data_type = 23, RULE_input_IDENTIFIER = 24, RULE_when_statement = 25, 
		RULE_otherwise_when_statement = 26, RULE_condition_statement = 27, RULE_list_event = 28, 
		RULE_base_statement = 29, RULE_loop_every_statement = 30, RULE_loop_throughout_statement = 31, 
		RULE_loop_do_throughout_statement = 32, RULE_list_func_declaration = 33, 
		RULE_func_declaration = 34, RULE_func_with_send = 35, RULE_func_without_send = 36, 
		RULE_func_body = 37, RULE_func_main = 38;
	public static final String[] ruleNames = {
		"program", "data_type", "var_declaration", "list_var", "list_constants", 
		"const_declaration", "constant", "list_statement", "statement", "function_call_stat", 
		"list_parameter", "send_statement", "expression", "string_expression", 
		"numerical_expression", "boolean_expression", "boolean_logic", "bool_term", 
		"relation_ops", "assign", "write_statement", "write_list", "read_statement", 
		"input_data_type", "input_IDENTIFIER", "when_statement", "otherwise_when_statement", 
		"condition_statement", "list_event", "base_statement", "loop_every_statement", 
		"loop_throughout_statement", "loop_do_throughout_statement", "list_func_declaration", 
		"func_declaration", "func_with_send", "func_without_send", "func_body", 
		"func_main"
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

	@Override
	public String getGrammarFileName() { return "Nymtax.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NymtaxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Func_mainContext func_main() {
			return getRuleContext(Func_mainContext.class,0);
		}
		public List_constantsContext list_constants() {
			return getRuleContext(List_constantsContext.class,0);
		}
		public List_func_declarationContext list_func_declaration() {
			return getRuleContext(List_func_declarationContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(78);
				list_constants();
				}
				break;
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLO) | (1L << CHR) | (1L << STRNG) | (1L << VOID))) != 0)) {
				{
				setState(81);
				list_func_declaration();
				}
			}

			setState(84);
			func_main();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(NymtaxParser.INT, 0); }
		public TerminalNode FLO() { return getToken(NymtaxParser.FLO, 0); }
		public TerminalNode CHR() { return getToken(NymtaxParser.CHR, 0); }
		public TerminalNode STRNG() { return getToken(NymtaxParser.STRNG, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLO) | (1L << CHR) | (1L << STRNG))) != 0)) ) {
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

	public static class Var_declarationContext extends ParserRuleContext {
		public List_varContext list_var() {
			return getRuleContext(List_varContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(NymtaxParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NymtaxParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(NymtaxParser.ASSIGN, 0); }
		public Const_declarationContext const_declaration() {
			return getRuleContext(Const_declarationContext.class,0);
		}
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterVar_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitVar_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitVar_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var_declaration);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				list_var();
				setState(89);
				match(IDENTIFIER);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(90);
					match(ASSIGN);
					setState(91);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				const_declaration();
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

	public static class List_varContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(NymtaxParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(NymtaxParser.RBRACK, 0); }
		public TerminalNode MUL() { return getToken(NymtaxParser.MUL, 0); }
		public List_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterList_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitList_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitList_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_varContext list_var() throws RecognitionException {
		List_varContext _localctx = new List_varContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list_var);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				data_type();
				setState(98);
				match(LBRACK);
				setState(99);
				match(RBRACK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				data_type();
				setState(102);
				match(MUL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				data_type();
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

	public static class List_constantsContext extends ParserRuleContext {
		public List<Const_declarationContext> const_declaration() {
			return getRuleContexts(Const_declarationContext.class);
		}
		public Const_declarationContext const_declaration(int i) {
			return getRuleContext(Const_declarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(NymtaxParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(NymtaxParser.SEMI, i);
		}
		public List_constantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_constants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterList_constants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitList_constants(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitList_constants(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_constantsContext list_constants() throws RecognitionException {
		List_constantsContext _localctx = new List_constantsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list_constants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(107);
					const_declaration();
					setState(108);
					match(SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(112); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Const_declarationContext extends ParserRuleContext {
		public List_varContext list_var() {
			return getRuleContext(List_varContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NymtaxParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(NymtaxParser.ASSIGN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Const_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterConst_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitConst_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitConst_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_declarationContext const_declaration() throws RecognitionException {
		Const_declarationContext _localctx = new Const_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_const_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			list_var();
			setState(115);
			match(IDENTIFIER);
			setState(116);
			match(ASSIGN);
			setState(117);
			constant();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(NymtaxParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(NymtaxParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(NymtaxParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(NymtaxParser.STRING, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (INTEGER - 68)) | (1L << (FLOAT - 68)) | (1L << (CHAR - 68)) | (1L << (STRING - 68)))) != 0)) ) {
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

	public static class List_statementContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(NymtaxParser.LBRACE, 0); }
		public List_statementContext list_statement() {
			return getRuleContext(List_statementContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(NymtaxParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(NymtaxParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(NymtaxParser.SEMI, i);
		}
		public List_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterList_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitList_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitList_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_statementContext list_statement() throws RecognitionException {
		List_statementContext _localctx = new List_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_list_statement);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(LBRACE);
				setState(122);
				list_statement();
				setState(123);
				match(RBRACE);
				}
				break;
			case WHEN:
			case EVERY:
			case THROUGHOUT:
			case CONDITION:
			case DO:
			case SEND:
			case WRITE:
			case READ:
			case STOP:
			case PROCEED:
			case INT:
			case FLO:
			case CHR:
			case STRNG:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(125);
					statement();
					setState(126);
					match(SEMI);
					}
					}
					setState(130); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHEN) | (1L << EVERY) | (1L << THROUGHOUT) | (1L << CONDITION) | (1L << DO) | (1L << SEND) | (1L << WRITE) | (1L << READ) | (1L << STOP) | (1L << PROCEED) | (1L << INT) | (1L << FLO) | (1L << CHR) | (1L << STRNG))) != 0) || _la==IDENTIFIER );
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

	public static class StatementContext extends ParserRuleContext {
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Function_call_statContext function_call_stat() {
			return getRuleContext(Function_call_statContext.class,0);
		}
		public When_statementContext when_statement() {
			return getRuleContext(When_statementContext.class,0);
		}
		public Condition_statementContext condition_statement() {
			return getRuleContext(Condition_statementContext.class,0);
		}
		public Loop_every_statementContext loop_every_statement() {
			return getRuleContext(Loop_every_statementContext.class,0);
		}
		public Loop_throughout_statementContext loop_throughout_statement() {
			return getRuleContext(Loop_throughout_statementContext.class,0);
		}
		public Loop_do_throughout_statementContext loop_do_throughout_statement() {
			return getRuleContext(Loop_do_throughout_statementContext.class,0);
		}
		public Send_statementContext send_statement() {
			return getRuleContext(Send_statementContext.class,0);
		}
		public Write_statementContext write_statement() {
			return getRuleContext(Write_statementContext.class,0);
		}
		public Read_statementContext read_statement() {
			return getRuleContext(Read_statementContext.class,0);
		}
		public TerminalNode STOP() { return getToken(NymtaxParser.STOP, 0); }
		public TerminalNode PROCEED() { return getToken(NymtaxParser.PROCEED, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				var_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				function_call_stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				when_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(138);
				condition_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				loop_every_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
				loop_throughout_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(141);
				loop_do_throughout_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(142);
				send_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(143);
				write_statement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(144);
				read_statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(145);
				match(STOP);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(146);
				match(PROCEED);
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

	public static class Function_call_statContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(NymtaxParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(NymtaxParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(NymtaxParser.RPAREN, 0); }
		public List_parameterContext list_parameter() {
			return getRuleContext(List_parameterContext.class,0);
		}
		public Function_call_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterFunction_call_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitFunction_call_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitFunction_call_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_statContext function_call_stat() throws RecognitionException {
		Function_call_statContext _localctx = new Function_call_statContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_call_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(IDENTIFIER);
			setState(150);
			match(LPAREN);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(151);
				list_parameter();
				}
			}

			setState(154);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_parameterContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(NymtaxParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NymtaxParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NymtaxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NymtaxParser.COMMA, i);
		}
		public List_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterList_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitList_parameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitList_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_parameterContext list_parameter() throws RecognitionException {
		List_parameterContext _localctx = new List_parameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_list_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(IDENTIFIER);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(157);
					match(COMMA);
					setState(158);
					match(IDENTIFIER);
					}
					}
					setState(161); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
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

	public static class Send_statementContext extends ParserRuleContext {
		public TerminalNode SEND() { return getToken(NymtaxParser.SEND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Send_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_send_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterSend_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitSend_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitSend_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Send_statementContext send_statement() throws RecognitionException {
		Send_statementContext _localctx = new Send_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_send_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(SEND);
			setState(166);
			expression();
			}
		}
		catch (RecognitionException re) {
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
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public Numerical_expressionContext numerical_expression() {
			return getRuleContext(Numerical_expressionContext.class,0);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Func_with_sendContext func_with_send() {
			return getRuleContext(Func_with_sendContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(NymtaxParser.LPAREN, 0); }
		public List_parameterContext list_parameter() {
			return getRuleContext(List_parameterContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NymtaxParser.RPAREN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				string_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				numerical_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				boolean_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				func_with_send();
				setState(172);
				match(LPAREN);
				setState(173);
				list_parameter();
				setState(174);
				match(RPAREN);
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

	public static class String_expressionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(NymtaxParser.ADD, 0); }
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(NymtaxParser.NOT, 0); }
		public TerminalNode SUB() { return getToken(NymtaxParser.SUB, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NymtaxParser.IDENTIFIER, 0); }
		public TerminalNode STRING() { return getToken(NymtaxParser.STRING, 0); }
		public String_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterString_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitString_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitString_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_expressionContext string_expression() throws RecognitionException {
		String_expressionContext _localctx = new String_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_string_expression);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(ADD);
				setState(179);
				string_expression();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(NOT);
				setState(181);
				string_expression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				match(SUB);
				setState(183);
				string_expression();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(184);
				match(IDENTIFIER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				match(STRING);
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

	public static class Numerical_expressionContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(NymtaxParser.ADD, 0); }
		public Numerical_expressionContext numerical_expression() {
			return getRuleContext(Numerical_expressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(NymtaxParser.SUB, 0); }
		public TerminalNode NTERM() { return getToken(NymtaxParser.NTERM, 0); }
		public Numerical_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numerical_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterNumerical_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitNumerical_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitNumerical_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numerical_expressionContext numerical_expression() throws RecognitionException {
		Numerical_expressionContext _localctx = new Numerical_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_numerical_expression);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(ADD);
				setState(189);
				numerical_expression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(SUB);
				setState(191);
				numerical_expression();
				}
				break;
			case NTERM:
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(NTERM);
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

	public static class Boolean_expressionContext extends ParserRuleContext {
		public List<Numerical_expressionContext> numerical_expression() {
			return getRuleContexts(Numerical_expressionContext.class);
		}
		public Numerical_expressionContext numerical_expression(int i) {
			return getRuleContext(Numerical_expressionContext.class,i);
		}
		public Relation_opsContext relation_ops() {
			return getRuleContext(Relation_opsContext.class,0);
		}
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(NymtaxParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(NymtaxParser.NOTEQUAL, 0); }
		public Boolean_logicContext boolean_logic() {
			return getRuleContext(Boolean_logicContext.class,0);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterBoolean_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitBoolean_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitBoolean_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_boolean_expression);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				numerical_expression();
				setState(196);
				relation_ops();
				setState(197);
				numerical_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				string_expression();
				setState(200);
				match(EQUAL);
				setState(201);
				string_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				string_expression();
				setState(204);
				match(NOTEQUAL);
				setState(205);
				string_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				boolean_logic();
				setState(208);
				match(EQUAL);
				setState(209);
				boolean_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(211);
				boolean_logic();
				setState(212);
				match(NOTEQUAL);
				setState(213);
				boolean_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(215);
				boolean_logic();
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

	public static class Boolean_logicContext extends ParserRuleContext {
		public Bool_termContext bool_term() {
			return getRuleContext(Bool_termContext.class,0);
		}
		public TerminalNode OR() { return getToken(NymtaxParser.OR, 0); }
		public Boolean_logicContext boolean_logic() {
			return getRuleContext(Boolean_logicContext.class,0);
		}
		public TerminalNode AND() { return getToken(NymtaxParser.AND, 0); }
		public Boolean_logicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterBoolean_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitBoolean_logic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitBoolean_logic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_logicContext boolean_logic() throws RecognitionException {
		Boolean_logicContext _localctx = new Boolean_logicContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_boolean_logic);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				bool_term();
				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(219);
					match(OR);
					setState(220);
					boolean_logic();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				bool_term();
				setState(226);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(224);
					match(AND);
					setState(225);
					boolean_logic();
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

	public static class Bool_termContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(NymtaxParser.LPAREN, 0); }
		public Boolean_logicContext boolean_logic() {
			return getRuleContext(Boolean_logicContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NymtaxParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(NymtaxParser.NOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NymtaxParser.IDENTIFIER, 0); }
		public Bool_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterBool_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitBool_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitBool_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_termContext bool_term() throws RecognitionException {
		Bool_termContext _localctx = new Bool_termContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bool_term);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(LPAREN);
				setState(231);
				boolean_logic();
				setState(232);
				match(RPAREN);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				match(NOT);
				setState(235);
				boolean_logic();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(IDENTIFIER);
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

	public static class Relation_opsContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(NymtaxParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(NymtaxParser.NOTEQUAL, 0); }
		public TerminalNode LE() { return getToken(NymtaxParser.LE, 0); }
		public TerminalNode GE() { return getToken(NymtaxParser.GE, 0); }
		public TerminalNode GT() { return getToken(NymtaxParser.GT, 0); }
		public TerminalNode LT() { return getToken(NymtaxParser.LT, 0); }
		public Relation_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterRelation_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitRelation_ops(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitRelation_ops(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_opsContext relation_ops() throws RecognitionException {
		Relation_opsContext _localctx = new Relation_opsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relation_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << EQUAL) | (1L << LE) | (1L << GE) | (1L << NOTEQUAL))) != 0)) ) {
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

	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(NymtaxParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NymtaxParser.IDENTIFIER, i);
		}
		public TerminalNode ASSIGN() { return getToken(NymtaxParser.ASSIGN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assign);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(IDENTIFIER);
				setState(242);
				match(ASSIGN);
				setState(243);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(IDENTIFIER);
				setState(245);
				match(ASSIGN);
				setState(246);
				constant();
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

	public static class Write_statementContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(NymtaxParser.WRITE, 0); }
		public TerminalNode LPAREN() { return getToken(NymtaxParser.LPAREN, 0); }
		public Write_listContext write_list() {
			return getRuleContext(Write_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NymtaxParser.RPAREN, 0); }
		public Write_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterWrite_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitWrite_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitWrite_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_statementContext write_statement() throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(WRITE);
			setState(250);
			match(LPAREN);
			setState(251);
			write_list();
			setState(252);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Write_listContext extends ParserRuleContext {
		public Write_listContext write_list() {
			return getRuleContext(Write_listContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(NymtaxParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NymtaxParser.IDENTIFIER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(NymtaxParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(NymtaxParser.STRING, i);
		}
		public Write_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterWrite_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitWrite_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitWrite_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_listContext write_list() throws RecognitionException {
		Write_listContext _localctx = new Write_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_write_list);
		try {
			int _alt;
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(254);
						match(IDENTIFIER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(257); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(259);
				write_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(260);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(263); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(265);
				write_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				match(IDENTIFIER);
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

	public static class Read_statementContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(NymtaxParser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(NymtaxParser.LPAREN, 0); }
		public Input_data_typeContext input_data_type() {
			return getRuleContext(Input_data_typeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(NymtaxParser.COMMA, 0); }
		public Input_IDENTIFIERContext input_IDENTIFIER() {
			return getRuleContext(Input_IDENTIFIERContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NymtaxParser.RPAREN, 0); }
		public Read_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterRead_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitRead_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitRead_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(READ);
			setState(271);
			match(LPAREN);
			setState(272);
			input_data_type();
			setState(273);
			match(COMMA);
			setState(274);
			input_IDENTIFIER();
			setState(275);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Input_data_typeContext extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(NymtaxParser.MOD, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Input_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterInput_data_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitInput_data_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitInput_data_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_data_typeContext input_data_type() throws RecognitionException {
		Input_data_typeContext _localctx = new Input_data_typeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_input_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(MOD);
			setState(278);
			data_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Input_IDENTIFIERContext extends ParserRuleContext {
		public TerminalNode AT_SIGN() { return getToken(NymtaxParser.AT_SIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NymtaxParser.IDENTIFIER, 0); }
		public Input_IDENTIFIERContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_IDENTIFIER; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterInput_IDENTIFIER(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitInput_IDENTIFIER(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitInput_IDENTIFIER(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_IDENTIFIERContext input_IDENTIFIER() throws RecognitionException {
		Input_IDENTIFIERContext _localctx = new Input_IDENTIFIERContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_input_IDENTIFIER);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(AT_SIGN);
			setState(281);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class When_statementContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(NymtaxParser.WHEN, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(NymtaxParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(NymtaxParser.LPAREN, i);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(NymtaxParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(NymtaxParser.RPAREN, i);
		}
		public TerminalNode LBRACE() { return getToken(NymtaxParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(NymtaxParser.RBRACE, 0); }
		public List<List_statementContext> list_statement() {
			return getRuleContexts(List_statementContext.class);
		}
		public List_statementContext list_statement(int i) {
			return getRuleContext(List_statementContext.class,i);
		}
		public TerminalNode OTHERWISE() { return getToken(NymtaxParser.OTHERWISE, 0); }
		public List<Otherwise_when_statementContext> otherwise_when_statement() {
			return getRuleContexts(Otherwise_when_statementContext.class);
		}
		public Otherwise_when_statementContext otherwise_when_statement(int i) {
			return getRuleContext(Otherwise_when_statementContext.class,i);
		}
		public When_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterWhen_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitWhen_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitWhen_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final When_statementContext when_statement() throws RecognitionException {
		When_statementContext _localctx = new When_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_when_statement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(WHEN);
			setState(284);
			match(LPAREN);
			setState(285);
			boolean_expression();
			setState(286);
			match(RPAREN);
			setState(287);
			match(LBRACE);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHEN) | (1L << EVERY) | (1L << THROUGHOUT) | (1L << CONDITION) | (1L << DO) | (1L << SEND) | (1L << WRITE) | (1L << READ) | (1L << STOP) | (1L << PROCEED) | (1L << INT) | (1L << FLO) | (1L << CHR) | (1L << STRNG) | (1L << LBRACE))) != 0) || _la==IDENTIFIER) {
				{
				setState(288);
				list_statement();
				}
			}

			setState(291);
			match(RBRACE);
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(293); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(292);
						otherwise_when_statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(295); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OTHERWISE) {
				{
				setState(299);
				match(OTHERWISE);
				setState(300);
				match(LPAREN);
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHEN) | (1L << EVERY) | (1L << THROUGHOUT) | (1L << CONDITION) | (1L << DO) | (1L << SEND) | (1L << WRITE) | (1L << READ) | (1L << STOP) | (1L << PROCEED) | (1L << INT) | (1L << FLO) | (1L << CHR) | (1L << STRNG) | (1L << LBRACE))) != 0) || _la==IDENTIFIER) {
					{
					setState(301);
					list_statement();
					}
				}

				setState(304);
				match(RPAREN);
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

	public static class Otherwise_when_statementContext extends ParserRuleContext {
		public TerminalNode OTHERWISE() { return getToken(NymtaxParser.OTHERWISE, 0); }
		public TerminalNode WHEN() { return getToken(NymtaxParser.WHEN, 0); }
		public TerminalNode LPAREN() { return getToken(NymtaxParser.LPAREN, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NymtaxParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(NymtaxParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(NymtaxParser.RBRACE, 0); }
		public List_statementContext list_statement() {
			return getRuleContext(List_statementContext.class,0);
		}
		public Otherwise_when_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherwise_when_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterOtherwise_when_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitOtherwise_when_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitOtherwise_when_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Otherwise_when_statementContext otherwise_when_statement() throws RecognitionException {
		Otherwise_when_statementContext _localctx = new Otherwise_when_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_otherwise_when_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(OTHERWISE);
			setState(308);
			match(WHEN);
			setState(309);
			match(LPAREN);
			setState(310);
			boolean_expression();
			setState(311);
			match(RPAREN);
			setState(312);
			match(LBRACE);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHEN) | (1L << EVERY) | (1L << THROUGHOUT) | (1L << CONDITION) | (1L << DO) | (1L << SEND) | (1L << WRITE) | (1L << READ) | (1L << STOP) | (1L << PROCEED) | (1L << INT) | (1L << FLO) | (1L << CHR) | (1L << STRNG) | (1L << LBRACE))) != 0) || _la==IDENTIFIER) {
				{
				setState(313);
				list_statement();
				}
			}

			setState(316);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_statementContext extends ParserRuleContext {
		public TerminalNode CONDITION() { return getToken(NymtaxParser.CONDITION, 0); }
		public TerminalNode LPAREN() { return getToken(NymtaxParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NymtaxParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(NymtaxParser.LBRACE, 0); }
		public Base_statementContext base_statement() {
			return getRuleContext(Base_statementContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(NymtaxParser.RBRACE, 0); }
		public List_eventContext list_event() {
			return getRuleContext(List_eventContext.class,0);
		}
		public Condition_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterCondition_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitCondition_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitCondition_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_statementContext condition_statement() throws RecognitionException {
		Condition_statementContext _localctx = new Condition_statementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_condition_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(CONDITION);
			setState(319);
			match(LPAREN);
			setState(320);
			expression();
			setState(321);
			match(RPAREN);
			setState(322);
			match(LBRACE);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EVENT) {
				{
				setState(323);
				list_event();
				}
			}

			setState(326);
			base_statement();
			setState(327);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_eventContext extends ParserRuleContext {
		public List<TerminalNode> EVENT() { return getTokens(NymtaxParser.EVENT); }
		public TerminalNode EVENT(int i) {
			return getToken(NymtaxParser.EVENT, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(NymtaxParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(NymtaxParser.COLON, i);
		}
		public List<List_statementContext> list_statement() {
			return getRuleContexts(List_statementContext.class);
		}
		public List_statementContext list_statement(int i) {
			return getRuleContext(List_statementContext.class,i);
		}
		public List_eventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterList_event(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitList_event(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitList_event(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_eventContext list_event() throws RecognitionException {
		List_eventContext _localctx = new List_eventContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_list_event);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(329);
				match(EVENT);
				setState(330);
				expression();
				setState(331);
				match(COLON);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHEN) | (1L << EVERY) | (1L << THROUGHOUT) | (1L << CONDITION) | (1L << DO) | (1L << SEND) | (1L << WRITE) | (1L << READ) | (1L << STOP) | (1L << PROCEED) | (1L << INT) | (1L << FLO) | (1L << CHR) | (1L << STRNG) | (1L << LBRACE))) != 0) || _la==IDENTIFIER) {
					{
					setState(332);
					list_statement();
					}
				}

				}
				}
				setState(337); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==EVENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Base_statementContext extends ParserRuleContext {
		public TerminalNode BASE() { return getToken(NymtaxParser.BASE, 0); }
		public TerminalNode COLON() { return getToken(NymtaxParser.COLON, 0); }
		public List_statementContext list_statement() {
			return getRuleContext(List_statementContext.class,0);
		}
		public Base_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterBase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitBase_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitBase_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Base_statementContext base_statement() throws RecognitionException {
		Base_statementContext _localctx = new Base_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_base_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(BASE);
			setState(340);
			match(COLON);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHEN) | (1L << EVERY) | (1L << THROUGHOUT) | (1L << CONDITION) | (1L << DO) | (1L << SEND) | (1L << WRITE) | (1L << READ) | (1L << STOP) | (1L << PROCEED) | (1L << INT) | (1L << FLO) | (1L << CHR) | (1L << STRNG) | (1L << LBRACE))) != 0) || _la==IDENTIFIER) {
				{
				setState(341);
				list_statement();
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

	public static class Loop_every_statementContext extends ParserRuleContext {
		public TerminalNode EVERY() { return getToken(NymtaxParser.EVERY, 0); }
		public TerminalNode LPAREN() { return getToken(NymtaxParser.LPAREN, 0); }
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NymtaxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NymtaxParser.COMMA, i);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NymtaxParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(NymtaxParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(NymtaxParser.RBRACE, 0); }
		public List_statementContext list_statement() {
			return getRuleContext(List_statementContext.class,0);
		}
		public Loop_every_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_every_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterLoop_every_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitLoop_every_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitLoop_every_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_every_statementContext loop_every_statement() throws RecognitionException {
		Loop_every_statementContext _localctx = new Loop_every_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_loop_every_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(EVERY);
			setState(345);
			match(LPAREN);
			setState(346);
			assign();
			setState(347);
			match(COMMA);
			setState(348);
			boolean_expression();
			setState(349);
			match(COMMA);
			setState(350);
			assign();
			setState(351);
			match(RPAREN);
			setState(352);
			match(LBRACE);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHEN) | (1L << EVERY) | (1L << THROUGHOUT) | (1L << CONDITION) | (1L << DO) | (1L << SEND) | (1L << WRITE) | (1L << READ) | (1L << STOP) | (1L << PROCEED) | (1L << INT) | (1L << FLO) | (1L << CHR) | (1L << STRNG) | (1L << LBRACE))) != 0) || _la==IDENTIFIER) {
				{
				setState(353);
				list_statement();
				}
			}

			setState(356);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_throughout_statementContext extends ParserRuleContext {
		public TerminalNode THROUGHOUT() { return getToken(NymtaxParser.THROUGHOUT, 0); }
		public TerminalNode LPAREN() { return getToken(NymtaxParser.LPAREN, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NymtaxParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(NymtaxParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(NymtaxParser.RBRACE, 0); }
		public List_statementContext list_statement() {
			return getRuleContext(List_statementContext.class,0);
		}
		public Loop_throughout_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_throughout_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterLoop_throughout_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitLoop_throughout_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitLoop_throughout_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_throughout_statementContext loop_throughout_statement() throws RecognitionException {
		Loop_throughout_statementContext _localctx = new Loop_throughout_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_loop_throughout_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(THROUGHOUT);
			setState(359);
			match(LPAREN);
			setState(360);
			boolean_expression();
			setState(361);
			match(RPAREN);
			setState(362);
			match(LBRACE);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHEN) | (1L << EVERY) | (1L << THROUGHOUT) | (1L << CONDITION) | (1L << DO) | (1L << SEND) | (1L << WRITE) | (1L << READ) | (1L << STOP) | (1L << PROCEED) | (1L << INT) | (1L << FLO) | (1L << CHR) | (1L << STRNG) | (1L << LBRACE))) != 0) || _la==IDENTIFIER) {
				{
				setState(363);
				list_statement();
				}
			}

			setState(366);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_do_throughout_statementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(NymtaxParser.DO, 0); }
		public TerminalNode LBRACE() { return getToken(NymtaxParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(NymtaxParser.RBRACE, 0); }
		public TerminalNode THROUGHOUT() { return getToken(NymtaxParser.THROUGHOUT, 0); }
		public TerminalNode LPAREN() { return getToken(NymtaxParser.LPAREN, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(NymtaxParser.RPAREN, 0); }
		public List_statementContext list_statement() {
			return getRuleContext(List_statementContext.class,0);
		}
		public Loop_do_throughout_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_do_throughout_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterLoop_do_throughout_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitLoop_do_throughout_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitLoop_do_throughout_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_do_throughout_statementContext loop_do_throughout_statement() throws RecognitionException {
		Loop_do_throughout_statementContext _localctx = new Loop_do_throughout_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_loop_do_throughout_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(DO);
			setState(369);
			match(LBRACE);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHEN) | (1L << EVERY) | (1L << THROUGHOUT) | (1L << CONDITION) | (1L << DO) | (1L << SEND) | (1L << WRITE) | (1L << READ) | (1L << STOP) | (1L << PROCEED) | (1L << INT) | (1L << FLO) | (1L << CHR) | (1L << STRNG) | (1L << LBRACE))) != 0) || _la==IDENTIFIER) {
				{
				setState(370);
				list_statement();
				}
			}

			setState(373);
			match(RBRACE);
			setState(374);
			match(THROUGHOUT);
			setState(375);
			match(LPAREN);
			setState(376);
			boolean_expression();
			setState(377);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_func_declarationContext extends ParserRuleContext {
		public List<Func_declarationContext> func_declaration() {
			return getRuleContexts(Func_declarationContext.class);
		}
		public Func_declarationContext func_declaration(int i) {
			return getRuleContext(Func_declarationContext.class,i);
		}
		public List_func_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_func_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterList_func_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitList_func_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitList_func_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_func_declarationContext list_func_declaration() throws RecognitionException {
		List_func_declarationContext _localctx = new List_func_declarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_list_func_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(379);
				func_declaration();
				}
				}
				setState(382); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << FLO) | (1L << CHR) | (1L << STRNG) | (1L << VOID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_declarationContext extends ParserRuleContext {
		public Func_with_sendContext func_with_send() {
			return getRuleContext(Func_with_sendContext.class,0);
		}
		public Func_without_sendContext func_without_send() {
			return getRuleContext(Func_without_sendContext.class,0);
		}
		public Func_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterFunc_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitFunc_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitFunc_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_declarationContext func_declaration() throws RecognitionException {
		Func_declarationContext _localctx = new Func_declarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_func_declaration);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLO:
			case CHR:
			case STRNG:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				func_with_send();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				func_without_send();
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

	public static class Func_with_sendContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Function_call_statContext function_call_stat() {
			return getRuleContext(Function_call_statContext.class,0);
		}
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public Func_with_sendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_with_send; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterFunc_with_send(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitFunc_with_send(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitFunc_with_send(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_with_sendContext func_with_send() throws RecognitionException {
		Func_with_sendContext _localctx = new Func_with_sendContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_func_with_send);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			data_type();
			setState(389);
			function_call_stat();
			setState(390);
			func_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_without_sendContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(NymtaxParser.VOID, 0); }
		public Function_call_statContext function_call_stat() {
			return getRuleContext(Function_call_statContext.class,0);
		}
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public Func_without_sendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_without_send; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterFunc_without_send(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitFunc_without_send(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitFunc_without_send(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_without_sendContext func_without_send() throws RecognitionException {
		Func_without_sendContext _localctx = new Func_without_sendContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_func_without_send);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(VOID);
			setState(393);
			function_call_stat();
			setState(394);
			func_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_bodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(NymtaxParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(NymtaxParser.RBRACE, 0); }
		public List_statementContext list_statement() {
			return getRuleContext(List_statementContext.class,0);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterFunc_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitFunc_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitFunc_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_func_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(LBRACE);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHEN) | (1L << EVERY) | (1L << THROUGHOUT) | (1L << CONDITION) | (1L << DO) | (1L << SEND) | (1L << WRITE) | (1L << READ) | (1L << STOP) | (1L << PROCEED) | (1L << INT) | (1L << FLO) | (1L << CHR) | (1L << STRNG) | (1L << LBRACE))) != 0) || _la==IDENTIFIER) {
				{
				setState(397);
				list_statement();
				}
			}

			setState(400);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_mainContext extends ParserRuleContext {
		public TerminalNode RUN_MAIN() { return getToken(NymtaxParser.RUN_MAIN, 0); }
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public Func_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).enterFunc_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NymtaxListener ) ((NymtaxListener)listener).exitFunc_main(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NymtaxVisitor ) return ((NymtaxVisitor<? extends T>)visitor).visitFunc_main(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_mainContext func_main() throws RecognitionException {
		Func_mainContext _localctx = new Func_mainContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_func_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(RUN_MAIN);
			setState(403);
			func_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3R\u0198\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\5\2R\n\2\3\2\5\2"+
		"U\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4_\n\4\3\4\5\4b\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5l\n\5\3\6\3\6\3\6\6\6q\n\6\r\6\16\6r\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u0083\n\t\r\t\16"+
		"\t\u0084\5\t\u0087\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u0096\n\n\3\13\3\13\3\13\5\13\u009b\n\13\3\13\3\13\3\f\3\f\3"+
		"\f\6\f\u00a2\n\f\r\f\16\f\u00a3\5\f\u00a6\n\f\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b3\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00bd\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u00c4\n"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00db\n\21\3\22\3\22\3\22"+
		"\5\22\u00e0\n\22\3\22\3\22\3\22\5\22\u00e5\n\22\5\22\u00e7\n\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f0\n\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u00fa\n\25\3\26\3\26\3\26\3\26\3\26\3\27\6\27\u0102"+
		"\n\27\r\27\16\27\u0103\3\27\3\27\6\27\u0108\n\27\r\27\16\27\u0109\3\27"+
		"\3\27\3\27\5\27\u010f\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0124\n\33\3\33"+
		"\3\33\6\33\u0128\n\33\r\33\16\33\u0129\5\33\u012c\n\33\3\33\3\33\3\33"+
		"\5\33\u0131\n\33\3\33\5\33\u0134\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\5\34\u013d\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0147"+
		"\n\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0150\n\36\6\36\u0152\n"+
		"\36\r\36\16\36\u0153\3\37\3\37\3\37\5\37\u0159\n\37\3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \5 \u0165\n \3 \3 \3!\3!\3!\3!\3!\3!\5!\u016f\n!\3!\3!\3\""+
		"\3\"\3\"\5\"\u0176\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\6#\u017f\n#\r#\16#\u0180"+
		"\3$\3$\5$\u0185\n$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\5\'\u0191\n\'\3\'\3"+
		"\'\3(\3(\3(\3(\2\2)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLN\2\5\3\2\21\24\4\2FFHJ\4\2!\"\'*\2\u01b1\2Q\3\2\2"+
		"\2\4X\3\2\2\2\6a\3\2\2\2\bk\3\2\2\2\np\3\2\2\2\ft\3\2\2\2\16y\3\2\2\2"+
		"\20\u0086\3\2\2\2\22\u0095\3\2\2\2\24\u0097\3\2\2\2\26\u009e\3\2\2\2\30"+
		"\u00a7\3\2\2\2\32\u00b2\3\2\2\2\34\u00bc\3\2\2\2\36\u00c3\3\2\2\2 \u00da"+
		"\3\2\2\2\"\u00e6\3\2\2\2$\u00ef\3\2\2\2&\u00f1\3\2\2\2(\u00f9\3\2\2\2"+
		"*\u00fb\3\2\2\2,\u010e\3\2\2\2.\u0110\3\2\2\2\60\u0117\3\2\2\2\62\u011a"+
		"\3\2\2\2\64\u011d\3\2\2\2\66\u0135\3\2\2\28\u0140\3\2\2\2:\u0151\3\2\2"+
		"\2<\u0155\3\2\2\2>\u015a\3\2\2\2@\u0168\3\2\2\2B\u0172\3\2\2\2D\u017e"+
		"\3\2\2\2F\u0184\3\2\2\2H\u0186\3\2\2\2J\u018a\3\2\2\2L\u018e\3\2\2\2N"+
		"\u0194\3\2\2\2PR\5\n\6\2QP\3\2\2\2QR\3\2\2\2RT\3\2\2\2SU\5D#\2TS\3\2\2"+
		"\2TU\3\2\2\2UV\3\2\2\2VW\5N(\2W\3\3\2\2\2XY\t\2\2\2Y\5\3\2\2\2Z[\5\b\5"+
		"\2[^\7E\2\2\\]\7 \2\2]_\7E\2\2^\\\3\2\2\2^_\3\2\2\2_b\3\2\2\2`b\5\f\7"+
		"\2aZ\3\2\2\2a`\3\2\2\2b\7\3\2\2\2cd\5\4\3\2de\7\33\2\2ef\7\34\2\2fl\3"+
		"\2\2\2gh\5\4\3\2hi\7\61\2\2il\3\2\2\2jl\5\4\3\2kc\3\2\2\2kg\3\2\2\2kj"+
		"\3\2\2\2l\t\3\2\2\2mn\5\f\7\2no\7\35\2\2oq\3\2\2\2pm\3\2\2\2qr\3\2\2\2"+
		"rp\3\2\2\2rs\3\2\2\2s\13\3\2\2\2tu\5\b\5\2uv\7E\2\2vw\7 \2\2wx\5\16\b"+
		"\2x\r\3\2\2\2yz\t\3\2\2z\17\3\2\2\2{|\7\31\2\2|}\5\20\t\2}~\7\32\2\2~"+
		"\u0087\3\2\2\2\177\u0080\5\22\n\2\u0080\u0081\7\35\2\2\u0081\u0083\3\2"+
		"\2\2\u0082\177\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085"+
		"\3\2\2\2\u0085\u0087\3\2\2\2\u0086{\3\2\2\2\u0086\u0082\3\2\2\2\u0087"+
		"\21\3\2\2\2\u0088\u0096\5\6\4\2\u0089\u0096\5(\25\2\u008a\u0096\5\24\13"+
		"\2\u008b\u0096\5\64\33\2\u008c\u0096\58\35\2\u008d\u0096\5> \2\u008e\u0096"+
		"\5@!\2\u008f\u0096\5B\"\2\u0090\u0096\5\30\r\2\u0091\u0096\5*\26\2\u0092"+
		"\u0096\5.\30\2\u0093\u0096\7\17\2\2\u0094\u0096\7\20\2\2\u0095\u0088\3"+
		"\2\2\2\u0095\u0089\3\2\2\2\u0095\u008a\3\2\2\2\u0095\u008b\3\2\2\2\u0095"+
		"\u008c\3\2\2\2\u0095\u008d\3\2\2\2\u0095\u008e\3\2\2\2\u0095\u008f\3\2"+
		"\2\2\u0095\u0090\3\2\2\2\u0095\u0091\3\2\2\2\u0095\u0092\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\23\3\2\2\2\u0097\u0098\7E\2\2"+
		"\u0098\u009a\7\27\2\2\u0099\u009b\5\26\f\2\u009a\u0099\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\30\2\2\u009d\25\3\2\2\2\u009e"+
		"\u00a5\7E\2\2\u009f\u00a0\7\36\2\2\u00a0\u00a2\7E\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\27\3\2\2"+
		"\2\u00a7\u00a8\7\f\2\2\u00a8\u00a9\5\32\16\2\u00a9\31\3\2\2\2\u00aa\u00b3"+
		"\5\34\17\2\u00ab\u00b3\5\36\20\2\u00ac\u00b3\5 \21\2\u00ad\u00ae\5H%\2"+
		"\u00ae\u00af\7\27\2\2\u00af\u00b0\5\26\f\2\u00b0\u00b1\7\30\2\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2\u00ac\3\2"+
		"\2\2\u00b2\u00ad\3\2\2\2\u00b3\33\3\2\2\2\u00b4\u00b5\7/\2\2\u00b5\u00bd"+
		"\5\34\17\2\u00b6\u00b7\7#\2\2\u00b7\u00bd\5\34\17\2\u00b8\u00b9\7\60\2"+
		"\2\u00b9\u00bd\5\34\17\2\u00ba\u00bd\7E\2\2\u00bb\u00bd\7J\2\2\u00bc\u00b4"+
		"\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\35\3\2\2\2\u00be\u00bf\7/\2\2\u00bf\u00c4\5\36\20"+
		"\2\u00c0\u00c1\7\60\2\2\u00c1\u00c4\5\36\20\2\u00c2\u00c4\7K\2\2\u00c3"+
		"\u00be\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\37\3\2\2"+
		"\2\u00c5\u00c6\5\36\20\2\u00c6\u00c7\5&\24\2\u00c7\u00c8\5\36\20\2\u00c8"+
		"\u00db\3\2\2\2\u00c9\u00ca\5\34\17\2\u00ca\u00cb\7\'\2\2\u00cb\u00cc\5"+
		"\34\17\2\u00cc\u00db\3\2\2\2\u00cd\u00ce\5\34\17\2\u00ce\u00cf\7*\2\2"+
		"\u00cf\u00d0\5\34\17\2\u00d0\u00db\3\2\2\2\u00d1\u00d2\5\"\22\2\u00d2"+
		"\u00d3\7\'\2\2\u00d3\u00d4\5 \21\2\u00d4\u00db\3\2\2\2\u00d5\u00d6\5\""+
		"\22\2\u00d6\u00d7\7*\2\2\u00d7\u00d8\5 \21\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00db\5\"\22\2\u00da\u00c5\3\2\2\2\u00da\u00c9\3\2\2\2\u00da\u00cd\3"+
		"\2\2\2\u00da\u00d1\3\2\2\2\u00da\u00d5\3\2\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"!\3\2\2\2\u00dc\u00df\5$\23\2\u00dd\u00de\7,\2\2\u00de\u00e0\5\"\22\2"+
		"\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e7\3\2\2\2\u00e1\u00e4"+
		"\5$\23\2\u00e2\u00e3\7+\2\2\u00e3\u00e5\5\"\22\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00dc\3\2\2\2\u00e6\u00e1\3\2"+
		"\2\2\u00e7#\3\2\2\2\u00e8\u00e9\7\27\2\2\u00e9\u00ea\5\"\22\2\u00ea\u00eb"+
		"\7\30\2\2\u00eb\u00f0\3\2\2\2\u00ec\u00ed\7#\2\2\u00ed\u00f0\5\"\22\2"+
		"\u00ee\u00f0\7E\2\2\u00ef\u00e8\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ee"+
		"\3\2\2\2\u00f0%\3\2\2\2\u00f1\u00f2\t\4\2\2\u00f2\'\3\2\2\2\u00f3\u00f4"+
		"\7E\2\2\u00f4\u00f5\7 \2\2\u00f5\u00fa\7E\2\2\u00f6\u00f7\7E\2\2\u00f7"+
		"\u00f8\7 \2\2\u00f8\u00fa\5\16\b\2\u00f9\u00f3\3\2\2\2\u00f9\u00f6\3\2"+
		"\2\2\u00fa)\3\2\2\2\u00fb\u00fc\7\r\2\2\u00fc\u00fd\7\27\2\2\u00fd\u00fe"+
		"\5,\27\2\u00fe\u00ff\7\30\2\2\u00ff+\3\2\2\2\u0100\u0102\7E\2\2\u0101"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u010f\5,\27\2\u0106\u0108\7J\2\2\u0107"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u010f\5,\27\2\u010c\u010f\7J\2\2\u010d"+
		"\u010f\7E\2\2\u010e\u0101\3\2\2\2\u010e\u0107\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010d\3\2\2\2\u010f-\3\2\2\2\u0110\u0111\7\16\2\2\u0111\u0112"+
		"\7\27\2\2\u0112\u0113\5\60\31\2\u0113\u0114\7\36\2\2\u0114\u0115\5\62"+
		"\32\2\u0115\u0116\7\30\2\2\u0116/\3\2\2\2\u0117\u0118\7\66\2\2\u0118\u0119"+
		"\5\4\3\2\u0119\61\3\2\2\2\u011a\u011b\7\67\2\2\u011b\u011c\7E\2\2\u011c"+
		"\63\3\2\2\2\u011d\u011e\7\4\2\2\u011e\u011f\7\27\2\2\u011f\u0120\5 \21"+
		"\2\u0120\u0121\7\30\2\2\u0121\u0123\7\31\2\2\u0122\u0124\5\20\t\2\u0123"+
		"\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u012b\7\32"+
		"\2\2\u0126\u0128\5\66\34\2\u0127\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0127\3\2"+
		"\2\2\u012b\u012c\3\2\2\2\u012c\u0133\3\2\2\2\u012d\u012e\7\5\2\2\u012e"+
		"\u0130\7\27\2\2\u012f\u0131\5\20\t\2\u0130\u012f\3\2\2\2\u0130\u0131\3"+
		"\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\7\30\2\2\u0133\u012d\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\65\3\2\2\2\u0135\u0136\7\5\2\2\u0136\u0137\7\4\2"+
		"\2\u0137\u0138\7\27\2\2\u0138\u0139\5 \21\2\u0139\u013a\7\30\2\2\u013a"+
		"\u013c\7\31\2\2\u013b\u013d\5\20\t\2\u013c\u013b\3\2\2\2\u013c\u013d\3"+
		"\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\7\32\2\2\u013f\67\3\2\2\2\u0140"+
		"\u0141\7\b\2\2\u0141\u0142\7\27\2\2\u0142\u0143\5\32\16\2\u0143\u0144"+
		"\7\30\2\2\u0144\u0146\7\31\2\2\u0145\u0147\5:\36\2\u0146\u0145\3\2\2\2"+
		"\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\5<\37\2\u0149\u014a"+
		"\7\32\2\2\u014a9\3\2\2\2\u014b\u014c\7\t\2\2\u014c\u014d\5\32\16\2\u014d"+
		"\u014f\7&\2\2\u014e\u0150\5\20\t\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0152\3\2\2\2\u0151\u014b\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154;\3\2\2\2\u0155\u0156\7\n\2\2"+
		"\u0156\u0158\7&\2\2\u0157\u0159\5\20\t\2\u0158\u0157\3\2\2\2\u0158\u0159"+
		"\3\2\2\2\u0159=\3\2\2\2\u015a\u015b\7\6\2\2\u015b\u015c\7\27\2\2\u015c"+
		"\u015d\5(\25\2\u015d\u015e\7\36\2\2\u015e\u015f\5 \21\2\u015f\u0160\7"+
		"\36\2\2\u0160\u0161\5(\25\2\u0161\u0162\7\30\2\2\u0162\u0164\7\31\2\2"+
		"\u0163\u0165\5\20\t\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0167\7\32\2\2\u0167?\3\2\2\2\u0168\u0169\7\7\2\2\u0169"+
		"\u016a\7\27\2\2\u016a\u016b\5 \21\2\u016b\u016c\7\30\2\2\u016c\u016e\7"+
		"\31\2\2\u016d\u016f\5\20\t\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0171\7\32\2\2\u0171A\3\2\2\2\u0172\u0173\7\13\2"+
		"\2\u0173\u0175\7\31\2\2\u0174\u0176\5\20\t\2\u0175\u0174\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\7\32\2\2\u0178\u0179\7"+
		"\7\2\2\u0179\u017a\7\27\2\2\u017a\u017b\5 \21\2\u017b\u017c\7\30\2\2\u017c"+
		"C\3\2\2\2\u017d\u017f\5F$\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181E\3\2\2\2\u0182\u0185\5H%\2\u0183"+
		"\u0185\5J&\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185G\3\2\2\2\u0186"+
		"\u0187\5\4\3\2\u0187\u0188\5\24\13\2\u0188\u0189\5L\'\2\u0189I\3\2\2\2"+
		"\u018a\u018b\7\25\2\2\u018b\u018c\5\24\13\2\u018c\u018d\5L\'\2\u018dK"+
		"\3\2\2\2\u018e\u0190\7\31\2\2\u018f\u0191\5\20\t\2\u0190\u018f\3\2\2\2"+
		"\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\7\32\2\2\u0193M\3"+
		"\2\2\2\u0194\u0195\7\3\2\2\u0195\u0196\5L\'\2\u0196O\3\2\2\2*QT^akr\u0084"+
		"\u0086\u0095\u009a\u00a3\u00a5\u00b2\u00bc\u00c3\u00da\u00df\u00e4\u00e6"+
		"\u00ef\u00f9\u0103\u0109\u010e\u0123\u0129\u012b\u0130\u0133\u013c\u0146"+
		"\u014f\u0153\u0158\u0164\u016e\u0175\u0180\u0184\u0190";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}