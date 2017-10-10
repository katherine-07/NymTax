// Generated from Nymtax.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__38=1, T__37=2, T__36=3, T__35=4, T__34=5, T__33=6, T__32=7, T__31=8, 
		T__30=9, T__29=10, T__28=11, T__27=12, T__26=13, T__25=14, T__24=15, T__23=16, 
		T__22=17, T__21=18, T__20=19, T__19=20, T__18=21, T__17=22, T__16=23, 
		T__15=24, T__14=25, T__13=26, T__12=27, T__11=28, T__10=29, T__9=30, T__8=31, 
		T__7=32, T__6=33, T__5=34, T__4=35, T__3=36, T__2=37, T__1=38, T__0=39, 
		DATA_TYPE=40, IDENTIFIER=41, INTEGER=42, SIGN=43, FLOAT=44, CHAR=45, STRING=46, 
		NTERM=47, NFACTOR=48, ASCII=49, ASCII_CHARS=50, WS=51, LETTER_NUMBER=52, 
		LETTER=53, NUMBER=54;
	public static final String[] tokenNames = {
		"<INVALID>", "'READ'", "'EVENT'", "'THROUGHOUT'", "'CONDITION'", "'||'", 
		"'~~'", "';'", "'{'", "'<<'", "'>>'", "'>~'", "'&&'", "'}'", "'RUN MAIN'", 
		"'[]'", "'\"'", "'PROCEED'", "'DO'", "'SEND'", "'('", "'*'", "'BASE'", 
		"'VOID'", "'EVERY'", "'WHEN'", "'OTHERWISE WHEN'", "'STOP'", "':'", "'!~'", 
		"'~'", "'@'", "'!'", "'<~'", "'OTHERWISE'", "'%'", "')'", "'+'", "'WRITE'", 
		"'-'", "DATA_TYPE", "IDENTIFIER", "INTEGER", "SIGN", "FLOAT", "CHAR", 
		"STRING", "NTERM", "NFACTOR", "ASCII", "ASCII_CHARS", "WS", "LETTER_NUMBER", 
		"LETTER", "NUMBER"
	};
	public static final int
		RULE_program = 0, RULE_var_declaration = 1, RULE_list_var = 2, RULE_list_constants = 3, 
		RULE_const_declaration = 4, RULE_constant = 5, RULE_list_statement = 6, 
		RULE_statement = 7, RULE_function_call_stat = 8, RULE_list_parameter = 9, 
		RULE_send_statement = 10, RULE_expression = 11, RULE_string_expression = 12, 
		RULE_numerical_expression = 13, RULE_boolean_expression = 14, RULE_boolean_logic = 15, 
		RULE_bool_term = 16, RULE_relation_ops = 17, RULE_assign = 18, RULE_write_statement = 19, 
		RULE_write_list = 20, RULE_read_statement = 21, RULE_input_data_type = 22, 
		RULE_input_IDENTIFIER = 23, RULE_when_statement = 24, RULE_otherwise_when_statement = 25, 
		RULE_condition_statement = 26, RULE_list_event = 27, RULE_base_statement = 28, 
		RULE_loop_every_statement = 29, RULE_loop_throughout_statement = 30, RULE_loop_do_throughout_statement = 31, 
		RULE_list_func_declaration = 32, RULE_func_declaration = 33, RULE_func_with_send = 34, 
		RULE_func_without_send = 35, RULE_func_body = 36, RULE_func_main = 37;
	public static final String[] ruleNames = {
		"program", "var_declaration", "list_var", "list_constants", "const_declaration", 
		"constant", "list_statement", "statement", "function_call_stat", "list_parameter", 
		"send_statement", "expression", "string_expression", "numerical_expression", 
		"boolean_expression", "boolean_logic", "bool_term", "relation_ops", "assign", 
		"write_statement", "write_list", "read_statement", "input_data_type", 
		"input_IDENTIFIER", "when_statement", "otherwise_when_statement", "condition_statement", 
		"list_event", "base_statement", "loop_every_statement", "loop_throughout_statement", 
		"loop_do_throughout_statement", "list_func_declaration", "func_declaration", 
		"func_with_send", "func_without_send", "func_body", "func_main"
	};

	@Override
	public String getGrammarFileName() { return "Nymtax.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

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
		public List_func_declarationContext list_func_declaration() {
			return getRuleContext(List_func_declarationContext.class,0);
		}
		public List_constantsContext list_constants() {
			return getRuleContext(List_constantsContext.class,0);
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(76); list_constants();
				}
				break;
			}
			setState(80);
			_la = _input.LA(1);
			if (_la==T__16 || _la==DATA_TYPE) {
				{
				setState(79); list_func_declaration();
				}
			}

			setState(82); func_main();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NymtaxParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(NymtaxParser.IDENTIFIER); }
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
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_var_declaration);
		int _la;
		try {
			setState(91);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); list_var();
				setState(85); match(IDENTIFIER);
				setState(88);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(86); match(T__9);
					setState(87); match(IDENTIFIER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90); const_declaration();
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
		public TerminalNode DATA_TYPE() { return getToken(NymtaxParser.DATA_TYPE, 0); }
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
	}

	public final List_varContext list_var() throws RecognitionException {
		List_varContext _localctx = new List_varContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_list_var);
		try {
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93); match(DATA_TYPE);
				setState(94); match(T__24);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95); match(DATA_TYPE);
				setState(96); match(T__18);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97); match(DATA_TYPE);
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
		public Const_declarationContext const_declaration(int i) {
			return getRuleContext(Const_declarationContext.class,i);
		}
		public List<Const_declarationContext> const_declaration() {
			return getRuleContexts(Const_declarationContext.class);
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
	}

	public final List_constantsContext list_constants() throws RecognitionException {
		List_constantsContext _localctx = new List_constantsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list_constants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(100); const_declaration();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(103); 
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
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NymtaxParser.IDENTIFIER, 0); }
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
	}

	public final Const_declarationContext const_declaration() throws RecognitionException {
		Const_declarationContext _localctx = new Const_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_const_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); list_var();
			setState(106); match(IDENTIFIER);
			setState(107); match(T__9);
			setState(108); constant();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode STRING() { return getToken(NymtaxParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(NymtaxParser.CHAR, 0); }
		public TerminalNode FLOAT() { return getToken(NymtaxParser.FLOAT, 0); }
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
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOAT) | (1L << CHAR) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
		public List_statementContext list_statement() {
			return getRuleContext(List_statementContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
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
	}

	public final List_statementContext list_statement() throws RecognitionException {
		List_statementContext _localctx = new List_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_list_statement);
		int _la;
		try {
			setState(123);
			switch (_input.LA(1)) {
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); match(T__31);
				setState(113); list_statement();
				setState(114); match(T__26);
				}
				break;
			case T__36:
			case T__35:
			case T__22:
			case T__21:
			case T__20:
			case T__15:
			case T__14:
			case T__12:
			case DATA_TYPE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(116); statement();
					setState(117); match(T__32);
					}
					}
					setState(121); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__35) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__15) | (1L << T__14) | (1L << T__12) | (1L << DATA_TYPE) | (1L << IDENTIFIER))) != 0) );
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
		public Send_statementContext send_statement() {
			return getRuleContext(Send_statementContext.class,0);
		}
		public When_statementContext when_statement() {
			return getRuleContext(When_statementContext.class,0);
		}
		public Var_declarationContext var_declaration() {
			return getRuleContext(Var_declarationContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Function_call_statContext function_call_stat() {
			return getRuleContext(Function_call_statContext.class,0);
		}
		public Loop_throughout_statementContext loop_throughout_statement() {
			return getRuleContext(Loop_throughout_statementContext.class,0);
		}
		public Loop_every_statementContext loop_every_statement() {
			return getRuleContext(Loop_every_statementContext.class,0);
		}
		public Loop_do_throughout_statementContext loop_do_throughout_statement() {
			return getRuleContext(Loop_do_throughout_statementContext.class,0);
		}
		public Condition_statementContext condition_statement() {
			return getRuleContext(Condition_statementContext.class,0);
		}
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(136);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125); var_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126); assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127); function_call_stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128); when_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(129); condition_statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(130); loop_every_statement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(131); loop_throughout_statement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(132); loop_do_throughout_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(133); send_statement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(134); match(T__12);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(135); match(T__22);
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
		public List_parameterContext list_parameter() {
			return getRuleContext(List_parameterContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(NymtaxParser.IDENTIFIER, 0); }
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
	}

	public final Function_call_statContext function_call_stat() throws RecognitionException {
		Function_call_statContext _localctx = new Function_call_statContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_call_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(IDENTIFIER);
			setState(139); match(T__19);
			setState(141);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(140); list_parameter();
				}
			}

			setState(143); match(T__3);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NymtaxParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(NymtaxParser.IDENTIFIER); }
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
	}

	public final List_parameterContext list_parameter() throws RecognitionException {
		List_parameterContext _localctx = new List_parameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_list_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(IDENTIFIER);
			setState(152);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(146); match(T__32);
					setState(147); match(IDENTIFIER);
					}
					}
					setState(150); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__32 );
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
	}

	public final Send_statementContext send_statement() throws RecognitionException {
		Send_statementContext _localctx = new Send_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_send_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); match(T__20);
			setState(155); expression();
			}
		}
		catch (RecognitionException re) {
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
		public List_parameterContext list_parameter() {
			return getRuleContext(List_parameterContext.class,0);
		}
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Func_with_sendContext func_with_send() {
			return getRuleContext(Func_with_sendContext.class,0);
		}
		public Numerical_expressionContext numerical_expression() {
			return getRuleContext(Numerical_expressionContext.class,0);
		}
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157); string_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158); numerical_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(159); boolean_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160); func_with_send();
				setState(161); match(T__19);
				setState(162); list_parameter();
				setState(163); match(T__3);
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
		public String_expressionContext string_expression() {
			return getRuleContext(String_expressionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(NymtaxParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(NymtaxParser.IDENTIFIER, 0); }
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
	}

	public final String_expressionContext string_expression() throws RecognitionException {
		String_expressionContext _localctx = new String_expressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_string_expression);
		try {
			setState(175);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(167); match(T__2);
				setState(168); string_expression();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(169); match(T__7);
				setState(170); string_expression();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(171); match(T__0);
				setState(172); string_expression();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(173); match(IDENTIFIER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(174); match(STRING);
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
		public TerminalNode NTERM() { return getToken(NymtaxParser.NTERM, 0); }
		public Numerical_expressionContext numerical_expression() {
			return getRuleContext(Numerical_expressionContext.class,0);
		}
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
	}

	public final Numerical_expressionContext numerical_expression() throws RecognitionException {
		Numerical_expressionContext _localctx = new Numerical_expressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_numerical_expression);
		try {
			setState(182);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(177); match(T__2);
				setState(178); numerical_expression();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(179); match(T__0);
				setState(180); numerical_expression();
				}
				break;
			case NTERM:
				enterOuterAlt(_localctx, 3);
				{
				setState(181); match(NTERM);
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
		public List<String_expressionContext> string_expression() {
			return getRuleContexts(String_expressionContext.class);
		}
		public String_expressionContext string_expression(int i) {
			return getRuleContext(String_expressionContext.class,i);
		}
		public Relation_opsContext relation_ops() {
			return getRuleContext(Relation_opsContext.class,0);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Numerical_expressionContext numerical_expression(int i) {
			return getRuleContext(Numerical_expressionContext.class,i);
		}
		public Boolean_logicContext boolean_logic() {
			return getRuleContext(Boolean_logicContext.class,0);
		}
		public List<Numerical_expressionContext> numerical_expression() {
			return getRuleContexts(Numerical_expressionContext.class);
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
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_boolean_expression);
		try {
			setState(205);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184); numerical_expression();
				setState(185); relation_ops();
				setState(186); numerical_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188); string_expression();
				setState(189); match(T__33);
				setState(190); string_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(192); string_expression();
				setState(193); match(T__10);
				setState(194); string_expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196); boolean_logic();
				setState(197); match(T__33);
				setState(198); boolean_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(200); boolean_logic();
				setState(201); match(T__10);
				setState(202); boolean_expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(204); boolean_logic();
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
		public Boolean_logicContext boolean_logic() {
			return getRuleContext(Boolean_logicContext.class,0);
		}
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
	}

	public final Boolean_logicContext boolean_logic() throws RecognitionException {
		Boolean_logicContext _localctx = new Boolean_logicContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_boolean_logic);
		try {
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207); bool_term();
				setState(210);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(208); match(T__34);
					setState(209); boolean_logic();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212); bool_term();
				setState(215);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(213); match(T__27);
					setState(214); boolean_logic();
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
		public TerminalNode IDENTIFIER() { return getToken(NymtaxParser.IDENTIFIER, 0); }
		public Boolean_logicContext boolean_logic() {
			return getRuleContext(Boolean_logicContext.class,0);
		}
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
	}

	public final Bool_termContext bool_term() throws RecognitionException {
		Bool_termContext _localctx = new Bool_termContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bool_term);
		try {
			setState(226);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(219); match(T__19);
				setState(220); boolean_logic();
				setState(221); match(T__3);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(223); match(T__7);
				setState(224); boolean_logic();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(225); match(IDENTIFIER);
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
	}

	public final Relation_opsContext relation_ops() throws RecognitionException {
		Relation_opsContext _localctx = new Relation_opsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relation_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__30) | (1L << T__29) | (1L << T__28) | (1L << T__10) | (1L << T__6))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NymtaxParser.IDENTIFIER, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(NymtaxParser.IDENTIFIER); }
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
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assign);
		try {
			setState(236);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230); match(IDENTIFIER);
				setState(231); match(T__9);
				setState(232); match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233); match(IDENTIFIER);
				setState(234); match(T__9);
				setState(235); constant();
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
		public Write_listContext write_list() {
			return getRuleContext(Write_listContext.class,0);
		}
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
	}

	public final Write_statementContext write_statement() throws RecognitionException {
		Write_statementContext _localctx = new Write_statementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_write_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); match(T__1);
			setState(239); match(T__19);
			setState(240); write_list();
			setState(241); match(T__3);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IDENTIFIER(int i) {
			return getToken(NymtaxParser.IDENTIFIER, i);
		}
		public TerminalNode STRING() { return getToken(NymtaxParser.STRING, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(NymtaxParser.IDENTIFIER); }
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
	}

	public final Write_listContext write_list() throws RecognitionException {
		Write_listContext _localctx = new Write_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_write_list);
		try {
			int _alt;
			setState(261);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(243); match(IDENTIFIER);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(246); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(248); write_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249); match(T__23);
				setState(250); match(STRING);
				setState(252); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(251); match(T__23);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(254); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(256); write_list();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257); match(T__23);
				setState(258); match(STRING);
				setState(259); match(T__23);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(260); match(IDENTIFIER);
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
		public Input_IDENTIFIERContext input_IDENTIFIER() {
			return getRuleContext(Input_IDENTIFIERContext.class,0);
		}
		public Input_data_typeContext input_data_type() {
			return getRuleContext(Input_data_typeContext.class,0);
		}
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
	}

	public final Read_statementContext read_statement() throws RecognitionException {
		Read_statementContext _localctx = new Read_statementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_read_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(T__38);
			setState(264); match(T__19);
			setState(265); input_data_type();
			setState(266); match(T__9);
			setState(267); input_IDENTIFIER();
			setState(268); match(T__3);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode DATA_TYPE() { return getToken(NymtaxParser.DATA_TYPE, 0); }
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
	}

	public final Input_data_typeContext input_data_type() throws RecognitionException {
		Input_data_typeContext _localctx = new Input_data_typeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_input_data_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); match(T__4);
			setState(271); match(DATA_TYPE);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final Input_IDENTIFIERContext input_IDENTIFIER() throws RecognitionException {
		Input_IDENTIFIERContext _localctx = new Input_IDENTIFIERContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_input_IDENTIFIER);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); match(T__8);
			setState(274); match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
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
		public List<List_statementContext> list_statement() {
			return getRuleContexts(List_statementContext.class);
		}
		public List<Otherwise_when_statementContext> otherwise_when_statement() {
			return getRuleContexts(Otherwise_when_statementContext.class);
		}
		public List_statementContext list_statement(int i) {
			return getRuleContext(List_statementContext.class,i);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
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
	}

	public final When_statementContext when_statement() throws RecognitionException {
		When_statementContext _localctx = new When_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_when_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); match(T__14);
			setState(277); match(T__19);
			setState(278); boolean_expression();
			setState(279); match(T__3);
			setState(280); match(T__31);
			setState(282);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__35) | (1L << T__31) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__15) | (1L << T__14) | (1L << T__12) | (1L << DATA_TYPE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(281); list_statement();
				}
			}

			setState(284); match(T__26);
			setState(290);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(286); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(285); otherwise_when_statement();
					}
					}
					setState(288); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__13 );
				}
			}

			setState(298);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(292); match(T__5);
				setState(293); match(T__31);
				setState(295);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__35) | (1L << T__31) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__15) | (1L << T__14) | (1L << T__12) | (1L << DATA_TYPE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(294); list_statement();
					}
				}

				setState(297); match(T__26);
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
		public List_statementContext list_statement() {
			return getRuleContext(List_statementContext.class,0);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
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
	}

	public final Otherwise_when_statementContext otherwise_when_statement() throws RecognitionException {
		Otherwise_when_statementContext _localctx = new Otherwise_when_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_otherwise_when_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300); match(T__13);
			setState(301); match(T__19);
			setState(302); boolean_expression();
			setState(303); match(T__3);
			setState(304); match(T__31);
			setState(306);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__35) | (1L << T__31) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__15) | (1L << T__14) | (1L << T__12) | (1L << DATA_TYPE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(305); list_statement();
				}
			}

			setState(308); match(T__26);
			}
		}
		catch (RecognitionException re) {
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
		public Base_statementContext base_statement() {
			return getRuleContext(Base_statementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
	}

	public final Condition_statementContext condition_statement() throws RecognitionException {
		Condition_statementContext _localctx = new Condition_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_condition_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310); match(T__35);
			setState(311); match(T__19);
			setState(312); expression();
			setState(313); match(T__3);
			setState(314); match(T__31);
			setState(316);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(315); list_event();
				}
			}

			setState(318); base_statement();
			setState(319); match(T__26);
			}
		}
		catch (RecognitionException re) {
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
		public List<List_statementContext> list_statement() {
			return getRuleContexts(List_statementContext.class);
		}
		public List_statementContext list_statement(int i) {
			return getRuleContext(List_statementContext.class,i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
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
	}

	public final List_eventContext list_event() throws RecognitionException {
		List_eventContext _localctx = new List_eventContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_list_event);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(321); match(T__37);
				setState(322); expression();
				setState(323); match(T__11);
				setState(325);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__35) | (1L << T__31) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__15) | (1L << T__14) | (1L << T__12) | (1L << DATA_TYPE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(324); list_statement();
					}
				}

				}
				}
				setState(329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__37 );
			}
		}
		catch (RecognitionException re) {
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
	}

	public final Base_statementContext base_statement() throws RecognitionException {
		Base_statementContext _localctx = new Base_statementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_base_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); match(T__17);
			setState(332); match(T__11);
			setState(334);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__35) | (1L << T__31) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__15) | (1L << T__14) | (1L << T__12) | (1L << DATA_TYPE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(333); list_statement();
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
		public List_statementContext list_statement() {
			return getRuleContext(List_statementContext.class,0);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
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
	}

	public final Loop_every_statementContext loop_every_statement() throws RecognitionException {
		Loop_every_statementContext _localctx = new Loop_every_statementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_loop_every_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336); match(T__15);
			setState(337); match(T__19);
			setState(338); assign();
			setState(339); match(T__32);
			setState(340); boolean_expression();
			setState(341); match(T__32);
			setState(342); assign();
			setState(343); match(T__32);
			setState(344); match(T__3);
			setState(345); match(T__31);
			setState(347);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__35) | (1L << T__31) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__15) | (1L << T__14) | (1L << T__12) | (1L << DATA_TYPE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(346); list_statement();
				}
			}

			setState(349); match(T__26);
			}
		}
		catch (RecognitionException re) {
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
		public List_statementContext list_statement() {
			return getRuleContext(List_statementContext.class,0);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
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
	}

	public final Loop_throughout_statementContext loop_throughout_statement() throws RecognitionException {
		Loop_throughout_statementContext _localctx = new Loop_throughout_statementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_loop_throughout_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351); match(T__36);
			setState(352); match(T__19);
			setState(353); boolean_expression();
			setState(354); match(T__3);
			setState(355); match(T__31);
			setState(357);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__35) | (1L << T__31) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__15) | (1L << T__14) | (1L << T__12) | (1L << DATA_TYPE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(356); list_statement();
				}
			}

			setState(359); match(T__26);
			}
		}
		catch (RecognitionException re) {
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
		public List_statementContext list_statement() {
			return getRuleContext(List_statementContext.class,0);
		}
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
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
	}

	public final Loop_do_throughout_statementContext loop_do_throughout_statement() throws RecognitionException {
		Loop_do_throughout_statementContext _localctx = new Loop_do_throughout_statementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_loop_do_throughout_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361); match(T__21);
			setState(362); match(T__31);
			setState(364);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__35) | (1L << T__31) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__15) | (1L << T__14) | (1L << T__12) | (1L << DATA_TYPE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(363); list_statement();
				}
			}

			setState(366); match(T__26);
			setState(367); match(T__36);
			setState(368); match(T__19);
			setState(369); boolean_expression();
			setState(370); match(T__3);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final List_func_declarationContext list_func_declaration() throws RecognitionException {
		List_func_declarationContext _localctx = new List_func_declarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_list_func_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(372); func_declaration();
				}
				}
				setState(375); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__16 || _la==DATA_TYPE );
			}
		}
		catch (RecognitionException re) {
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
		public Func_without_sendContext func_without_send() {
			return getRuleContext(Func_without_sendContext.class,0);
		}
		public Func_with_sendContext func_with_send() {
			return getRuleContext(Func_with_sendContext.class,0);
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
	}

	public final Func_declarationContext func_declaration() throws RecognitionException {
		Func_declarationContext _localctx = new Func_declarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_func_declaration);
		try {
			setState(379);
			switch (_input.LA(1)) {
			case DATA_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(377); func_with_send();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(378); func_without_send();
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
		public Function_call_statContext function_call_stat() {
			return getRuleContext(Function_call_statContext.class,0);
		}
		public TerminalNode DATA_TYPE() { return getToken(NymtaxParser.DATA_TYPE, 0); }
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
	}

	public final Func_with_sendContext func_with_send() throws RecognitionException {
		Func_with_sendContext _localctx = new Func_with_sendContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_func_with_send);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381); match(DATA_TYPE);
			setState(382); function_call_stat();
			setState(383); func_body();
			}
		}
		catch (RecognitionException re) {
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
	}

	public final Func_without_sendContext func_without_send() throws RecognitionException {
		Func_without_sendContext _localctx = new Func_without_sendContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_func_without_send);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385); match(T__16);
			setState(386); function_call_stat();
			setState(387); func_body();
			}
		}
		catch (RecognitionException re) {
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
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_func_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389); match(T__31);
			setState(391);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__35) | (1L << T__31) | (1L << T__22) | (1L << T__21) | (1L << T__20) | (1L << T__15) | (1L << T__14) | (1L << T__12) | (1L << DATA_TYPE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(390); list_statement();
				}
			}

			setState(393); match(T__26);
			}
		}
		catch (RecognitionException re) {
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
	}

	public final Func_mainContext func_main() throws RecognitionException {
		Func_mainContext _localctx = new Func_mainContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_func_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395); match(T__25);
			setState(396); func_body();
			}
		}
		catch (RecognitionException re) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u0191\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\5\2P\n\2\3\2\5\2S\n\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\5\3[\n\3\3\3\5\3^\n\3\3\4\3\4\3\4\3\4\3\4\5\4"+
		"e\n\4\3\5\6\5h\n\5\r\5\16\5i\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\6\bz\n\b\r\b\16\b{\5\b~\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u008b\n\t\3\n\3\n\3\n\5\n\u0090\n\n\3\n\3\n\3\13"+
		"\3\13\3\13\6\13\u0097\n\13\r\13\16\13\u0098\5\13\u009b\n\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a8\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00b2\n\16\3\17\3\17\3\17\3\17\3\17\5\17\u00b9"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d0\n\20\3\21\3\21\3\21"+
		"\5\21\u00d5\n\21\3\21\3\21\3\21\5\21\u00da\n\21\5\21\u00dc\n\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e5\n\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00ef\n\24\3\25\3\25\3\25\3\25\3\25\3\26\6\26\u00f7"+
		"\n\26\r\26\16\26\u00f8\3\26\3\26\3\26\3\26\6\26\u00ff\n\26\r\26\16\26"+
		"\u0100\3\26\3\26\3\26\3\26\3\26\5\26\u0108\n\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\5\32\u011d\n\32\3\32\3\32\6\32\u0121\n\32\r\32\16\32\u0122\5\32\u0125"+
		"\n\32\3\32\3\32\3\32\5\32\u012a\n\32\3\32\5\32\u012d\n\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\5\33\u0135\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u013f\n\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\5\35\u0148\n"+
		"\35\6\35\u014a\n\35\r\35\16\35\u014b\3\36\3\36\3\36\5\36\u0151\n\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u015e\n\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \5 \u0168\n \3 \3 \3!\3!\3!\5!\u016f\n!\3"+
		"!\3!\3!\3!\3!\3!\3\"\6\"\u0178\n\"\r\"\16\"\u0179\3#\3#\5#\u017e\n#\3"+
		"$\3$\3$\3$\3%\3%\3%\3%\3&\3&\5&\u018a\n&\3&\3&\3\'\3\'\3\'\3\'\2\2(\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"\2\4\4\2,,.\60\6\2\b\b\13\r\37\37##\u01a9\2O\3\2\2\2\4]\3\2\2\2\6d\3\2"+
		"\2\2\bg\3\2\2\2\nk\3\2\2\2\fp\3\2\2\2\16}\3\2\2\2\20\u008a\3\2\2\2\22"+
		"\u008c\3\2\2\2\24\u0093\3\2\2\2\26\u009c\3\2\2\2\30\u00a7\3\2\2\2\32\u00b1"+
		"\3\2\2\2\34\u00b8\3\2\2\2\36\u00cf\3\2\2\2 \u00db\3\2\2\2\"\u00e4\3\2"+
		"\2\2$\u00e6\3\2\2\2&\u00ee\3\2\2\2(\u00f0\3\2\2\2*\u0107\3\2\2\2,\u0109"+
		"\3\2\2\2.\u0110\3\2\2\2\60\u0113\3\2\2\2\62\u0116\3\2\2\2\64\u012e\3\2"+
		"\2\2\66\u0138\3\2\2\28\u0149\3\2\2\2:\u014d\3\2\2\2<\u0152\3\2\2\2>\u0161"+
		"\3\2\2\2@\u016b\3\2\2\2B\u0177\3\2\2\2D\u017d\3\2\2\2F\u017f\3\2\2\2H"+
		"\u0183\3\2\2\2J\u0187\3\2\2\2L\u018d\3\2\2\2NP\5\b\5\2ON\3\2\2\2OP\3\2"+
		"\2\2PR\3\2\2\2QS\5B\"\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\5L\'\2U\3\3\2"+
		"\2\2VW\5\6\4\2WZ\7+\2\2XY\7 \2\2Y[\7+\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2"+
		"\2\\^\5\n\6\2]V\3\2\2\2]\\\3\2\2\2^\5\3\2\2\2_`\7*\2\2`e\7\21\2\2ab\7"+
		"*\2\2be\7\27\2\2ce\7*\2\2d_\3\2\2\2da\3\2\2\2dc\3\2\2\2e\7\3\2\2\2fh\5"+
		"\n\6\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\t\3\2\2\2kl\5\6\4\2lm"+
		"\7+\2\2mn\7 \2\2no\5\f\7\2o\13\3\2\2\2pq\t\2\2\2q\r\3\2\2\2rs\7\n\2\2"+
		"st\5\16\b\2tu\7\17\2\2u~\3\2\2\2vw\5\20\t\2wx\7\t\2\2xz\3\2\2\2yv\3\2"+
		"\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}r\3\2\2\2}y\3\2\2\2~\17\3"+
		"\2\2\2\177\u008b\5\4\3\2\u0080\u008b\5&\24\2\u0081\u008b\5\22\n\2\u0082"+
		"\u008b\5\62\32\2\u0083\u008b\5\66\34\2\u0084\u008b\5<\37\2\u0085\u008b"+
		"\5> \2\u0086\u008b\5@!\2\u0087\u008b\5\26\f\2\u0088\u008b\7\35\2\2\u0089"+
		"\u008b\7\23\2\2\u008a\177\3\2\2\2\u008a\u0080\3\2\2\2\u008a\u0081\3\2"+
		"\2\2\u008a\u0082\3\2\2\2\u008a\u0083\3\2\2\2\u008a\u0084\3\2\2\2\u008a"+
		"\u0085\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u0089\3\2\2\2\u008b\21\3\2\2\2\u008c\u008d\7+\2\2\u008d\u008f"+
		"\7\26\2\2\u008e\u0090\5\24\13\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2"+
		"\2\u0090\u0091\3\2\2\2\u0091\u0092\7&\2\2\u0092\23\3\2\2\2\u0093\u009a"+
		"\7+\2\2\u0094\u0095\7\t\2\2\u0095\u0097\7+\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2"+
		"\2\2\u009a\u0096\3\2\2\2\u009a\u009b\3\2\2\2\u009b\25\3\2\2\2\u009c\u009d"+
		"\7\25\2\2\u009d\u009e\5\30\r\2\u009e\27\3\2\2\2\u009f\u00a8\5\32\16\2"+
		"\u00a0\u00a8\5\34\17\2\u00a1\u00a8\5\36\20\2\u00a2\u00a3\5F$\2\u00a3\u00a4"+
		"\7\26\2\2\u00a4\u00a5\5\24\13\2\u00a5\u00a6\7&\2\2\u00a6\u00a8\3\2\2\2"+
		"\u00a7\u009f\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a2"+
		"\3\2\2\2\u00a8\31\3\2\2\2\u00a9\u00aa\7\'\2\2\u00aa\u00b2\5\32\16\2\u00ab"+
		"\u00ac\7\"\2\2\u00ac\u00b2\5\32\16\2\u00ad\u00ae\7)\2\2\u00ae\u00b2\5"+
		"\32\16\2\u00af\u00b2\7+\2\2\u00b0\u00b2\7\60\2\2\u00b1\u00a9\3\2\2\2\u00b1"+
		"\u00ab\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2"+
		"\2\2\u00b2\33\3\2\2\2\u00b3\u00b4\7\'\2\2\u00b4\u00b9\5\34\17\2\u00b5"+
		"\u00b6\7)\2\2\u00b6\u00b9\5\34\17\2\u00b7\u00b9\7\61\2\2\u00b8\u00b3\3"+
		"\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\35\3\2\2\2\u00ba"+
		"\u00bb\5\34\17\2\u00bb\u00bc\5$\23\2\u00bc\u00bd\5\34\17\2\u00bd\u00d0"+
		"\3\2\2\2\u00be\u00bf\5\32\16\2\u00bf\u00c0\7\b\2\2\u00c0\u00c1\5\32\16"+
		"\2\u00c1\u00d0\3\2\2\2\u00c2\u00c3\5\32\16\2\u00c3\u00c4\7\37\2\2\u00c4"+
		"\u00c5\5\32\16\2\u00c5\u00d0\3\2\2\2\u00c6\u00c7\5 \21\2\u00c7\u00c8\7"+
		"\b\2\2\u00c8\u00c9\5\36\20\2\u00c9\u00d0\3\2\2\2\u00ca\u00cb\5 \21\2\u00cb"+
		"\u00cc\7\37\2\2\u00cc\u00cd\5\36\20\2\u00cd\u00d0\3\2\2\2\u00ce\u00d0"+
		"\5 \21\2\u00cf\u00ba\3\2\2\2\u00cf\u00be\3\2\2\2\u00cf\u00c2\3\2\2\2\u00cf"+
		"\u00c6\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\37\3\2\2"+
		"\2\u00d1\u00d4\5\"\22\2\u00d2\u00d3\7\7\2\2\u00d3\u00d5\5 \21\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00dc\3\2\2\2\u00d6\u00d9\5\""+
		"\22\2\u00d7\u00d8\7\16\2\2\u00d8\u00da\5 \21\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d1\3\2\2\2\u00db\u00d6\3\2"+
		"\2\2\u00dc!\3\2\2\2\u00dd\u00de\7\26\2\2\u00de\u00df\5 \21\2\u00df\u00e0"+
		"\7&\2\2\u00e0\u00e5\3\2\2\2\u00e1\u00e2\7\"\2\2\u00e2\u00e5\5 \21\2\u00e3"+
		"\u00e5\7+\2\2\u00e4\u00dd\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e3\3\2"+
		"\2\2\u00e5#\3\2\2\2\u00e6\u00e7\t\3\2\2\u00e7%\3\2\2\2\u00e8\u00e9\7+"+
		"\2\2\u00e9\u00ea\7 \2\2\u00ea\u00ef\7+\2\2\u00eb\u00ec\7+\2\2\u00ec\u00ed"+
		"\7 \2\2\u00ed\u00ef\5\f\7\2\u00ee\u00e8\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef"+
		"\'\3\2\2\2\u00f0\u00f1\7(\2\2\u00f1\u00f2\7\26\2\2\u00f2\u00f3\5*\26\2"+
		"\u00f3\u00f4\7&\2\2\u00f4)\3\2\2\2\u00f5\u00f7\7+\2\2\u00f6\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u0108\5*\26\2\u00fb\u00fc\7\22\2\2\u00fc\u00fe\7"+
		"\60\2\2\u00fd\u00ff\7\22\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0108\5*"+
		"\26\2\u0103\u0104\7\22\2\2\u0104\u0105\7\60\2\2\u0105\u0108\7\22\2\2\u0106"+
		"\u0108\7+\2\2\u0107\u00f6\3\2\2\2\u0107\u00fb\3\2\2\2\u0107\u0103\3\2"+
		"\2\2\u0107\u0106\3\2\2\2\u0108+\3\2\2\2\u0109\u010a\7\3\2\2\u010a\u010b"+
		"\7\26\2\2\u010b\u010c\5.\30\2\u010c\u010d\7 \2\2\u010d\u010e\5\60\31\2"+
		"\u010e\u010f\7&\2\2\u010f-\3\2\2\2\u0110\u0111\7%\2\2\u0111\u0112\7*\2"+
		"\2\u0112/\3\2\2\2\u0113\u0114\7!\2\2\u0114\u0115\7+\2\2\u0115\61\3\2\2"+
		"\2\u0116\u0117\7\33\2\2\u0117\u0118\7\26\2\2\u0118\u0119\5\36\20\2\u0119"+
		"\u011a\7&\2\2\u011a\u011c\7\n\2\2\u011b\u011d\5\16\b\2\u011c\u011b\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0124\7\17\2\2\u011f"+
		"\u0121\5\64\33\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3"+
		"\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0120\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\u012c\3\2\2\2\u0126\u0127\7$\2\2\u0127\u0129\7\n"+
		"\2\2\u0128\u012a\5\16\b\2\u0129\u0128\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012d\7\17\2\2\u012c\u0126\3\2\2\2\u012c\u012d\3"+
		"\2\2\2\u012d\63\3\2\2\2\u012e\u012f\7\34\2\2\u012f\u0130\7\26\2\2\u0130"+
		"\u0131\5\36\20\2\u0131\u0132\7&\2\2\u0132\u0134\7\n\2\2\u0133\u0135\5"+
		"\16\b\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\7\17\2\2\u0137\65\3\2\2\2\u0138\u0139\7\6\2\2\u0139\u013a\7\26"+
		"\2\2\u013a\u013b\5\30\r\2\u013b\u013c\7&\2\2\u013c\u013e\7\n\2\2\u013d"+
		"\u013f\58\35\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0141\5:\36\2\u0141\u0142\7\17\2\2\u0142\67\3\2\2\2\u0143\u0144"+
		"\7\4\2\2\u0144\u0145\5\30\r\2\u0145\u0147\7\36\2\2\u0146\u0148\5\16\b"+
		"\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0143"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"9\3\2\2\2\u014d\u014e\7\30\2\2\u014e\u0150\7\36\2\2\u014f\u0151\5\16\b"+
		"\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151;\3\2\2\2\u0152\u0153"+
		"\7\32\2\2\u0153\u0154\7\26\2\2\u0154\u0155\5&\24\2\u0155\u0156\7\t\2\2"+
		"\u0156\u0157\5\36\20\2\u0157\u0158\7\t\2\2\u0158\u0159\5&\24\2\u0159\u015a"+
		"\7\t\2\2\u015a\u015b\7&\2\2\u015b\u015d\7\n\2\2\u015c\u015e\5\16\b\2\u015d"+
		"\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\7\17"+
		"\2\2\u0160=\3\2\2\2\u0161\u0162\7\5\2\2\u0162\u0163\7\26\2\2\u0163\u0164"+
		"\5\36\20\2\u0164\u0165\7&\2\2\u0165\u0167\7\n\2\2\u0166\u0168\5\16\b\2"+
		"\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a"+
		"\7\17\2\2\u016a?\3\2\2\2\u016b\u016c\7\24\2\2\u016c\u016e\7\n\2\2\u016d"+
		"\u016f\5\16\b\2\u016e\u016d\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\3"+
		"\2\2\2\u0170\u0171\7\17\2\2\u0171\u0172\7\5\2\2\u0172\u0173\7\26\2\2\u0173"+
		"\u0174\5\36\20\2\u0174\u0175\7&\2\2\u0175A\3\2\2\2\u0176\u0178\5D#\2\u0177"+
		"\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017aC\3\2\2\2\u017b\u017e\5F$\2\u017c\u017e\5H%\2\u017d\u017b\3"+
		"\2\2\2\u017d\u017c\3\2\2\2\u017eE\3\2\2\2\u017f\u0180\7*\2\2\u0180\u0181"+
		"\5\22\n\2\u0181\u0182\5J&\2\u0182G\3\2\2\2\u0183\u0184\7\31\2\2\u0184"+
		"\u0185\5\22\n\2\u0185\u0186\5J&\2\u0186I\3\2\2\2\u0187\u0189\7\n\2\2\u0188"+
		"\u018a\5\16\b\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3"+
		"\2\2\2\u018b\u018c\7\17\2\2\u018cK\3\2\2\2\u018d\u018e\7\20\2\2\u018e"+
		"\u018f\5J&\2\u018fM\3\2\2\2*ORZ]di{}\u008a\u008f\u0098\u009a\u00a7\u00b1"+
		"\u00b8\u00cf\u00d4\u00d9\u00db\u00e4\u00ee\u00f8\u0100\u0107\u011c\u0122"+
		"\u0124\u0129\u012c\u0134\u013e\u0147\u014b\u0150\u015d\u0167\u016e\u0179"+
		"\u017d\u0189";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}