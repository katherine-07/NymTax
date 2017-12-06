package antlr4.custom;

import antlr4.generate.NymtaxListener;
import antlr4.generate.NymtaxParser;
import antlr4.generate.NymtaxParser.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.log4j.Logger;


public class DetectionNymtaxWalker implements NymtaxListener{


	final static Logger logger = Logger.getLogger(DetectionNymtaxWalker.class);
	
	int output = 0;
	
	
	public int getOutput() {
		return output;
	}

	public void setOutput(int output) {
		this.output = output;
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
//		if(output == 0)
//			logger.info("[INFO] Entering every rule..");

	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
//		if(output == 0)
//			logger.info("[INFO] Exiting every rule..");
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
	
	}


	@Override
	public void visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
//		if(output == 0)
//			logger.info("[INFO] "+node.getText());
	}

	@Override
	public void enterProgram(ProgramContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0) {
			logger.info("[INFO] --- START PROGRAM --- ");
			logger.info("[INFO] Starting statement: " + ctx.getText());
		}
	}

	@Override
	public void exitProgram(ProgramContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] --- END PROGRAM --- ");
	}

	@Override
	public void enterData_type(NymtaxParser.Data_typeContext ctx) {

		if(output == 0)
			logger.info("[INFO] Data type declaration");
	}

	@Override
	public void exitData_type(NymtaxParser.Data_typeContext ctx) {

	}

    @Override
    public void enterVar_dec_ident(Var_dec_identContext ctx) {

    }

    @Override
    public void exitVar_dec_ident(Var_dec_identContext ctx) {

    }

    @Override
    public void enterVar_dec_expr(Var_dec_exprContext ctx) {

    }

    @Override
    public void exitVar_dec_expr(Var_dec_exprContext ctx) {

    }

    @Override
    public void enterVar_dec_var(NymtaxParser.Var_dec_varContext ctx) {

    }

    @Override
    public void exitVar_dec_var(NymtaxParser.Var_dec_varContext ctx) {

    }

    @Override
    public void enterVar_dec_const(NymtaxParser.Var_dec_constContext ctx) {

    }

    @Override
    public void exitVar_dec_const(NymtaxParser.Var_dec_constContext ctx) {

    }

    @Override
    public void enterVar_array_init(NymtaxParser.Var_array_initContext ctx) {

    }

    @Override
    public void exitVar_array_init(NymtaxParser.Var_array_initContext ctx) {

    }

    @Override
	public void enterList_var(List_varContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0) {
			logger.info("[INFO] VARIABLE LIST.");
			logger.info("[INFO] Variable found: " + ctx.getText());
		}
	}

	@Override
	public void exitList_var(List_varContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] END OF VARIABLE LIST ");
	}

	@Override
	public void enterConst_declaration(Const_declarationContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0) {
			logger.info("[INFO] CONSTANT DECLARATIONS ");
			logger.info("[INFO] Constant found:  " + ctx.getText());
		}
	}

	@Override
	public void exitConst_declaration(Const_declarationContext ctx) {
		// TODO Auto-generated method stub
//		if(output == 0)
//			logger.info("[INFO] --- END CONST DECLARATION ---");
	}

	@Override
	public void enterConstant(ConstantContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Constant found: " + ctx.getText());
	}

	@Override
	public void exitConstant(ConstantContext ctx) {
		// TODO Auto-generated method stub
//		if(output == 0)
//			logger.info("[INFO] Exiting constant.");
	}

    @Override
    public void enterArray_initialization(NymtaxParser.Array_initializationContext ctx) {

    }

    @Override
    public void exitArray_initialization(NymtaxParser.Array_initializationContext ctx) {

    }

    @Override
    public void enterArray_call(Array_callContext ctx) {

    }

    @Override
    public void exitArray_call(Array_callContext ctx) {

    }

    @Override
    public void enterArray_length(Array_lengthContext ctx) {

    }

    @Override
    public void exitArray_length(Array_lengthContext ctx) {

    }

    @Override
    public void enterArray_assign(Array_assignContext ctx) {

    }

    @Override
    public void exitArray_assign(Array_assignContext ctx) {

    }

    @Override
	public void enterList_statement(List_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] LIST OF STATEMENTS ");
	}

	@Override
	public void exitList_statement(List_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] END OF STATEMENTS");
	}

    @Override
    public void enterStatement_var_dec(NymtaxParser.Statement_var_decContext ctx) {

    }

    @Override
    public void exitStatement_var_dec(NymtaxParser.Statement_var_decContext ctx) {

    }

    @Override
    public void enterStatement_assign(NymtaxParser.Statement_assignContext ctx) {

    }

    @Override
    public void exitStatement_assign(NymtaxParser.Statement_assignContext ctx) {

    }

    @Override
    public void enterStatement_arrAssign(Statement_arrAssignContext ctx) {

    }

    @Override
    public void exitStatement_arrAssign(Statement_arrAssignContext ctx) {

    }

    @Override
    public void enterStatement_func_call(NymtaxParser.Statement_func_callContext ctx) {

    }

    @Override
    public void exitStatement_func_call(NymtaxParser.Statement_func_callContext ctx) {

    }

    @Override
    public void enterStatement_when(NymtaxParser.Statement_whenContext ctx) {

    }

    @Override
    public void exitStatement_when(NymtaxParser.Statement_whenContext ctx) {

    }

    @Override
    public void enterStatement_condition(NymtaxParser.Statement_conditionContext ctx) {

    }

    @Override
    public void exitStatement_condition(NymtaxParser.Statement_conditionContext ctx) {

    }

    @Override
    public void enterStatement_loop_every(NymtaxParser.Statement_loop_everyContext ctx) {

    }

    @Override
    public void exitStatement_loop_every(NymtaxParser.Statement_loop_everyContext ctx) {

    }

    @Override
    public void enterStatement_loop_throughout(NymtaxParser.Statement_loop_throughoutContext ctx) {

    }

    @Override
    public void exitStatement_loop_throughout(NymtaxParser.Statement_loop_throughoutContext ctx) {

    }

    @Override
    public void enterStatement_loop_doThroughout(NymtaxParser.Statement_loop_doThroughoutContext ctx) {

    }

    @Override
    public void exitStatement_loop_doThroughout(NymtaxParser.Statement_loop_doThroughoutContext ctx) {

    }

    @Override
    public void enterStatement_send(NymtaxParser.Statement_sendContext ctx) {

    }

    @Override
    public void exitStatement_send(NymtaxParser.Statement_sendContext ctx) {

    }

    @Override
    public void enterStatement_write(NymtaxParser.Statement_writeContext ctx) {

    }

    @Override
    public void exitStatement_write(NymtaxParser.Statement_writeContext ctx) {

    }

    @Override
    public void enterStatement_read(NymtaxParser.Statement_readContext ctx) {

    }

    @Override
    public void exitStatement_read(NymtaxParser.Statement_readContext ctx) {

    }

    @Override
    public void enterStatement_getArrLen(Statement_getArrLenContext ctx) {

    }

    @Override
    public void exitStatement_getArrLen(Statement_getArrLenContext ctx) {

    }

    @Override
    public void enterStatement_stop(NymtaxParser.Statement_stopContext ctx) {

    }

    @Override
    public void exitStatement_stop(NymtaxParser.Statement_stopContext ctx) {

    }

    @Override
    public void enterStatement_proceed(NymtaxParser.Statement_proceedContext ctx) {

    }

    @Override
    public void exitStatement_proceed(NymtaxParser.Statement_proceedContext ctx) {

    }

    @Override
	public void enterFunction_call_stat(Function_call_statContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0) {
			logger.info("[INFO] FUNCTION CALL ");
			logger.info("[INFO] Function found: " + ctx.getText());
		}
	}

	@Override
	public void exitFunction_call_stat(Function_call_statContext ctx) {
		// TODO Auto-generated method stub
//		if(output == 0)
//			logger.info("[INFO] Exiting function call.");
	}

	@Override
	public void enterList_parameter(List_parameterContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] PARAMETER LIST ");
	}

	@Override
	public void exitList_parameter(List_parameterContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] END OF PARAMETER LIST");
	}

    @Override
    public void enterSend_const(Send_constContext ctx) {

    }

    @Override
    public void exitSend_const(Send_constContext ctx) {

    }

    @Override
    public void enterSend_variable(Send_variableContext ctx) {

    }

    @Override
    public void exitSend_variable(Send_variableContext ctx) {

    }

    @Override
    public void enterSend_expr(Send_exprContext ctx) {

    }

    @Override
    public void exitSend_expr(Send_exprContext ctx) {

    }


    @Override
    public void enterVisit_stringexpr(Visit_stringexprContext ctx) {

    }

    @Override
    public void exitVisit_stringexpr(Visit_stringexprContext ctx) {

    }

    @Override
    public void enterVisit_numexpr(Visit_numexprContext ctx) {

    }

    @Override
    public void exitVisit_numexpr(Visit_numexprContext ctx) {

    }

    @Override
    public void enterVisit_boolexpr(Visit_boolexprContext ctx) {

    }

    @Override
    public void exitVisit_boolexpr(Visit_boolexprContext ctx) {

    }

    @Override
    public void enterVisit_func_call(Visit_func_callContext ctx) {

    }

    @Override
    public void exitVisit_func_call(Visit_func_callContext ctx) {

    }

    @Override
    public void enterVisit_array_call(Visit_array_callContext ctx) {

    }

    @Override
    public void exitVisit_array_call(Visit_array_callContext ctx) {

    }

    @Override
    public void enterString_add(String_addContext ctx) {

    }

    @Override
    public void exitString_add(String_addContext ctx) {

    }

    @Override
    public void enterString_var(String_varContext ctx) {

    }

    @Override
    public void exitString_var(String_varContext ctx) {

    }

    @Override
    public void enterString_const(String_constContext ctx) {

    }

    @Override
    public void exitString_const(String_constContext ctx) {

    }

    @Override
    public void enterNumerical_val(NymtaxParser.Numerical_valContext ctx) {

    }

    @Override
    public void exitNumerical_val(NymtaxParser.Numerical_valContext ctx) {

    }

    @Override
    public void enterNumerical_AS(NymtaxParser.Numerical_ASContext ctx) {

    }

    @Override
    public void exitNumerical_AS(NymtaxParser.Numerical_ASContext ctx) {

    }

    @Override
    public void enterNumerical_MDM(NymtaxParser.Numerical_MDMContext ctx) {

    }

    @Override
    public void exitNumerical_MDM(NymtaxParser.Numerical_MDMContext ctx) {

    }

    @Override
    public void enterNumerical_paren(NymtaxParser.Numerical_parenContext ctx) {

    }

    @Override
    public void exitNumerical_paren(NymtaxParser.Numerical_parenContext ctx) {

    }

    @Override
    public void enterNumerical_array(Numerical_arrayContext ctx) {

    }

    @Override
    public void exitNumerical_array(Numerical_arrayContext ctx) {

    }

    @Override
    public void enterNumerical_negparen(NymtaxParser.Numerical_negparenContext ctx) {

    }

    @Override
    public void exitNumerical_negparen(NymtaxParser.Numerical_negparenContext ctx) {

    }

    @Override
    public void enterBoolean_and(NymtaxParser.Boolean_andContext ctx) {

    }

    @Override
    public void exitBoolean_and(NymtaxParser.Boolean_andContext ctx) {

    }

    @Override
    public void enterBoolean_call(Boolean_callContext ctx) {

    }

    @Override
    public void exitBoolean_call(Boolean_callContext ctx) {

    }

    @Override
    public void enterBoolean_log(NymtaxParser.Boolean_logContext ctx) {

    }

    @Override
    public void exitBoolean_log(NymtaxParser.Boolean_logContext ctx) {

    }

    @Override
    public void enterBoolean_or(NymtaxParser.Boolean_orContext ctx) {

    }

    @Override
    public void exitBoolean_or(NymtaxParser.Boolean_orContext ctx) {

    }

    @Override
    public void enterBoolean_array(Boolean_arrayContext ctx) {

    }

    @Override
    public void exitBoolean_array(Boolean_arrayContext ctx) {

    }

    @Override
    public void enterBoolean_paren(NymtaxParser.Boolean_parenContext ctx) {

    }

    @Override
    public void exitBoolean_paren(NymtaxParser.Boolean_parenContext ctx) {

    }

    @Override
    public void enterBoolean_not(NymtaxParser.Boolean_notContext ctx) {

    }

    @Override
    public void exitBoolean_not(NymtaxParser.Boolean_notContext ctx) {

    }

    @Override
    public void enterBoolean_term(NymtaxParser.Boolean_termContext ctx) {

    }

    @Override
    public void exitBoolean_term(NymtaxParser.Boolean_termContext ctx) {

    }

    @Override
    public void enterBoolean_variable(NymtaxParser.Boolean_variableContext ctx) {

    }

    @Override
    public void exitBoolean_variable(NymtaxParser.Boolean_variableContext ctx) {

    }

    @Override
    public void enterBoolean_equality(NymtaxParser.Boolean_equalityContext ctx) {

    }

    @Override
    public void exitBoolean_equality(NymtaxParser.Boolean_equalityContext ctx) {

    }

    @Override
    public void enterBoolean_false(NymtaxParser.Boolean_falseContext ctx) {

    }

    @Override
    public void exitBoolean_false(NymtaxParser.Boolean_falseContext ctx) {

    }

    @Override
    public void enterBoolean_numerical(NymtaxParser.Boolean_numericalContext ctx) {

    }

    @Override
    public void exitBoolean_numerical(NymtaxParser.Boolean_numericalContext ctx) {

    }

    @Override
    public void enterBoolean_true(NymtaxParser.Boolean_trueContext ctx) {

    }

    @Override
    public void exitBoolean_true(NymtaxParser.Boolean_trueContext ctx) {

    }

    @Override
    public void enterBoolean_string(NymtaxParser.Boolean_stringContext ctx) {

    }

    @Override
    public void exitBoolean_string(NymtaxParser.Boolean_stringContext ctx) {

    }

    @Override
    public void enterAssign_variable(NymtaxParser.Assign_variableContext ctx) {

    }

    @Override
    public void exitAssign_variable(NymtaxParser.Assign_variableContext ctx) {

    }

    @Override
    public void enterAssign_constant(NymtaxParser.Assign_constantContext ctx) {

    }

    @Override
    public void exitAssign_constant(NymtaxParser.Assign_constantContext ctx) {

    }

    @Override
    public void enterAssign_expression(Assign_expressionContext ctx) {

    }

    @Override
    public void exitAssign_expression(Assign_expressionContext ctx) {

    }


    @Override
	public void enterWrite_statement(Write_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] WRITE statement found: " +ctx.getText());
	}

	@Override
	public void exitWrite_statement(Write_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0);
		//	logger.info("[INFO] Last of the WRITE statements.");
	}

	@Override
	public void enterWrite_list(Write_listContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] WRITE STATEMENTS ");
	}

	@Override
	public void exitWrite_list(Write_listContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] END OF WRITE STATEMENTS.");
	}

	@Override
	public void enterRead_statement(Read_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] READ STATEMENTS");
	}

	@Override
	public void exitRead_statement(Read_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] END OF READ STATEMENTS.");
	}


    @Override
    public void enterConditional_if(NymtaxParser.Conditional_ifContext ctx) {

    }

    @Override
    public void exitConditional_if(NymtaxParser.Conditional_ifContext ctx) {

    }

    @Override
    public void enterConditional_ifelse(NymtaxParser.Conditional_ifelseContext ctx) {

    }

    @Override
    public void exitConditional_ifelse(NymtaxParser.Conditional_ifelseContext ctx) {

    }

    @Override
    public void enterOtherwise_when(Otherwise_whenContext ctx) {

    }

    @Override
    public void exitOtherwise_when(Otherwise_whenContext ctx) {

    }

    @Override
    public void enterOtherwise_when_mult(Otherwise_when_multContext ctx) {

    }

    @Override
    public void exitOtherwise_when_mult(Otherwise_when_multContext ctx) {

    }

    @Override
    public void enterOtherwise(OtherwiseContext ctx) {

    }

    @Override
    public void exitOtherwise(OtherwiseContext ctx) {

    }

    @Override
    public void enterConditional_switch_expr(Conditional_switch_exprContext ctx) {

    }

    @Override
    public void exitConditional_switch_expr(Conditional_switch_exprContext ctx) {

    }

    @Override
    public void enterConditional_switch_variable(Conditional_switch_variableContext ctx) {

    }

    @Override
    public void exitConditional_switch_variable(Conditional_switch_variableContext ctx) {

    }

    @Override
    public void enterList_event(List_eventContext ctx) {

    }

    @Override
    public void exitList_event(List_eventContext ctx) {

    }

    @Override
    public void enterBase_statement(Base_statementContext ctx) {

    }

    @Override
    public void exitBase_statement(Base_statementContext ctx) {

    }

    public void enterOtherwise_when_statement(Otherwise_when_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0) {
			logger.info("[INFO] OTHERWISE-WHEN statement found: " +ctx.getText());
			logger.info("[INFO] Entering OTHERWISE-WHEN statement.");
		}
	}

    @Override
    public void enterLoop_for(NymtaxParser.Loop_forContext ctx) {

    }

    @Override
    public void exitLoop_for(NymtaxParser.Loop_forContext ctx) {

    }

    @Override
    public void enterLoop_while(NymtaxParser.Loop_whileContext ctx) {

    }

    @Override
    public void exitLoop_while(NymtaxParser.Loop_whileContext ctx) {

    }

    @Override
    public void enterLoop_dowhile(NymtaxParser.Loop_dowhileContext ctx) {

    }

    @Override
    public void exitLoop_dowhile(NymtaxParser.Loop_dowhileContext ctx) {

    }

    @Override
	public void enterList_func_declaration(List_func_declarationContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] FUNCTION DECLARATION ");
	}

	@Override
	public void exitList_func_declaration(List_func_declarationContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] END OF FUNCTION DECLARATION LIST ");
	}

    @Override
    public void enterFunc_dec_send(NymtaxParser.Func_dec_sendContext ctx) {

    }

    @Override
    public void exitFunc_dec_send(NymtaxParser.Func_dec_sendContext ctx) {

    }

    @Override
    public void enterFunc_dec_none(NymtaxParser.Func_dec_noneContext ctx) {

    }

    @Override
    public void exitFunc_dec_none(NymtaxParser.Func_dec_noneContext ctx) {

    }

    @Override
	public void enterFunc_with_send(Func_with_sendContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0) {
			logger.info("[INFO] Function with SEND found: " + ctx.getText());
			logger.info("[INFO] Entering function.");
		}
	}

	@Override
	public void exitFunc_with_send(Func_with_sendContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0) {
			logger.info("[INFO] SEND statement found: " + ctx.getText());
			logger.info("[INFO] Exiting function.");
		}
	}

	@Override
	public void enterFunc_without_send(Func_without_sendContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0) {
			logger.info("[INFO] Function without SEND found: " +ctx.getText());
			logger.info("[INFO] Entering function without SEND.");
		}
	}

	@Override
	public void exitFunc_without_send(Func_without_sendContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting function without SEND.");
	}

	@Override
	public void enterFunc_body(Func_bodyContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering function body.");
	}

	@Override
	public void exitFunc_body(Func_bodyContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting function body.");
	}

	@Override
	public void enterFunc_main(Func_mainContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0) {
			logger.info("[INFO] RUN MAIN function found: " +ctx.getText());
			logger.info("[INFO] Entering main function.");
		}
	}

	@Override
	public void exitFunc_main(Func_mainContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting main function.");
	}

	@Override
	public void enterList_constants(List_constantsContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] CONSTANT LIST");
	}

	@Override
	public void exitList_constants(List_constantsContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] END OF CONSTANT LIST");
	}

}
