package antlr4.custom;

import antlr4.generate.NymtaxListener;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.log4j.Logger;

import antlr4.generate.NymtaxParser.AssignContext;
import antlr4.generate.NymtaxParser.Base_statementContext;
import antlr4.generate.NymtaxParser.Bool_termContext;
import antlr4.generate.NymtaxParser.Boolean_expressionContext;
import antlr4.generate.NymtaxParser.Boolean_logicContext;
import antlr4.generate.NymtaxParser.Condition_statementContext;
import antlr4.generate.NymtaxParser.Const_declarationContext;
import antlr4.generate.NymtaxParser.ConstantContext;
import antlr4.generate.NymtaxParser.ExpressionContext;
import antlr4.generate.NymtaxParser.Func_bodyContext;
import antlr4.generate.NymtaxParser.Func_declarationContext;
import antlr4.generate.NymtaxParser.Func_mainContext;
import antlr4.generate.NymtaxParser.Func_with_sendContext;
import antlr4.generate.NymtaxParser.Func_without_sendContext;
import antlr4.generate.NymtaxParser.Function_call_statContext;
import antlr4.generate.NymtaxParser.Input_IDENTIFIERContext;
import antlr4.generate.NymtaxParser.Input_data_typeContext;
import antlr4.generate.NymtaxParser.List_constantsContext;
import antlr4.generate.NymtaxParser.List_eventContext;
import antlr4.generate.NymtaxParser.List_func_declarationContext;
import antlr4.generate.NymtaxParser.List_parameterContext;
import antlr4.generate.NymtaxParser.List_statementContext;
import antlr4.generate.NymtaxParser.List_varContext;
import antlr4.generate.NymtaxParser.Loop_do_throughout_statementContext;
import antlr4.generate.NymtaxParser.Loop_every_statementContext;
import antlr4.generate.NymtaxParser.Loop_throughout_statementContext;
import antlr4.generate.NymtaxParser.Numerical_expressionContext;
import antlr4.generate.NymtaxParser.Otherwise_when_statementContext;
import antlr4.generate.NymtaxParser.ProgramContext;
import antlr4.generate.NymtaxParser.Read_statementContext;
import antlr4.generate.NymtaxParser.Relation_opsContext;
import antlr4.generate.NymtaxParser.Send_statementContext;
import antlr4.generate.NymtaxParser.StatementContext;
import antlr4.generate.NymtaxParser.String_expressionContext;
import antlr4.generate.NymtaxParser.Var_declarationContext;
import antlr4.generate.NymtaxParser.When_statementContext;
import antlr4.generate.NymtaxParser.Write_listContext;
import antlr4.generate.NymtaxParser.Write_statementContext;


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
		if(output == 0)
			logger.info("[INFO] Entering every rule..");
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting every rule..");
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		logger.info("[ERROR] " + node.getText());
		
	}


	@Override
	public void visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Visiting Terminal Node.");
	}

	@Override
	public void enterProgram(ProgramContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering program.");
	}

	@Override
	public void exitProgram(ProgramContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting program.");
	}

	@Override
	public void enterVar_declaration(Var_declarationContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering variable declaration.");
		
	}

	@Override
	public void exitVar_declaration(Var_declarationContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting variable declaration.");
		
	}

	@Override
	public void enterList_var(List_varContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering list of variables.");
	}

	@Override
	public void exitList_var(List_varContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting list of variables.");
	}

	@Override
	public void enterConst_declaration(Const_declarationContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering constant declaration..");
	}

	@Override
	public void exitConst_declaration(Const_declarationContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting constant declaration.");
	}

	@Override
	public void enterConstant(ConstantContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering constant.");
	}

	@Override
	public void exitConstant(ConstantContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting constant.");
	}

	@Override
	public void enterList_statement(List_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering list of statements.");
	}

	@Override
	public void exitList_statement(List_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting list of statements.");
	}

	@Override
	public void enterStatement(StatementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering statement.");
	}

	@Override
	public void exitStatement(StatementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting statement.");
	}

	@Override
	public void enterFunction_call_stat(Function_call_statContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering function call.");
	}	

	@Override
	public void exitFunction_call_stat(Function_call_statContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting function call.");
	}

	@Override
	public void enterList_parameter(List_parameterContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering parameter list.");
	}

	@Override
	public void exitList_parameter(List_parameterContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting parameter list.");
	}

	@Override
	public void enterSend_statement(Send_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering send statement.");
	}

	@Override
	public void exitSend_statement(Send_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting send statement.");
	}

	@Override
	public void enterExpression(ExpressionContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering expression.");
	}

	@Override
	public void exitExpression(ExpressionContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting expression.");
	}

	@Override
	public void enterString_expression(String_expressionContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering string expression.");
	}

	@Override
	public void exitString_expression(String_expressionContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting string expression.");
	}

	@Override
	public void enterNumerical_expression(Numerical_expressionContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering numerical expression.");
	}

	@Override
	public void exitNumerical_expression(Numerical_expressionContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting numerical expression.");
	}

	@Override
	public void enterBoolean_expression(Boolean_expressionContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering boolean expression.");
	}

	@Override
	public void exitBoolean_expression(Boolean_expressionContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting boolean expression.");
	}

	@Override
	public void enterBoolean_logic(Boolean_logicContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering boolean logic.");
	}

	@Override
	public void exitBoolean_logic(Boolean_logicContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting boolean logic.");
	}

	@Override
	public void enterRelation_ops(Relation_opsContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering relational operators.");
	}

	@Override
	public void exitRelation_ops(Relation_opsContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting relational operators.");
	}

	@Override
	public void enterAssign(AssignContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering assignment call.");
	}	

	@Override
	public void exitAssign(AssignContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting assignment call.");
	}

	@Override
	public void enterWrite_statement(Write_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering WRITE statement.");
	}

	@Override
	public void exitWrite_statement(Write_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting WRITE statement.");
	}

	@Override
	public void enterWrite_list(Write_listContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering WRITE list statement.");
	}

	@Override
	public void exitWrite_list(Write_listContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting WRITE list statement.");
	}

	@Override
	public void enterRead_statement(Read_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering READ statement.");
	}

	@Override
	public void exitRead_statement(Read_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting READ statement.");
	}

	@Override
	public void enterInput_data_type(Input_data_typeContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering input data type.");
	}

	@Override
	public void exitInput_data_type(Input_data_typeContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting input data type.");
	}

	@Override
	public void enterInput_IDENTIFIER(Input_IDENTIFIERContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering input identifier.");
	}

	@Override
	public void exitInput_IDENTIFIER(Input_IDENTIFIERContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting input identifier.");
	}

	@Override
	public void enterWhen_statement(When_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering WHEN statement.");
	}

	@Override
	public void exitWhen_statement(When_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting WHEN statement.");
	}

	@Override
	public void enterOtherwise_when_statement(Otherwise_when_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering OTHERWISE-WHEN statement.");
	}

	@Override
	public void exitOtherwise_when_statement(Otherwise_when_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting OTHERWISE-WHEN statement.");
	}

	@Override
	public void enterCondition_statement(Condition_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering CONDITION statement.");
	}

	@Override
	public void exitCondition_statement(Condition_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting CONDITION statement.");
	}

	@Override
	public void enterList_event(List_eventContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering event list.");
	}

	@Override
	public void exitList_event(List_eventContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting event list.");
	}

	@Override
	public void enterBase_statement(Base_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering base statement.");
	}

	@Override
	public void exitBase_statement(Base_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting base statement.");
	}

	@Override
	public void enterLoop_every_statement(Loop_every_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering LOOP-EVERY statement.");
	}

	@Override
	public void exitLoop_every_statement(Loop_every_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting LOOP-EVERY statement.");
	}

	@Override
	public void enterLoop_throughout_statement(Loop_throughout_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering LOOP-THROUGHOUT statement.");
	}

	@Override
	public void exitLoop_throughout_statement(Loop_throughout_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting LOOP-THROUGHOUT statement.");
	}

	@Override
	public void enterLoop_do_throughout_statement(Loop_do_throughout_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering LOOP-DO-THROUGHOUT statement.");
	}

	@Override
	public void exitLoop_do_throughout_statement(Loop_do_throughout_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting LOOP-DO-THROUGHOUT statement.");
	}

	@Override
	public void enterList_func_declaration(List_func_declarationContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering declaration function list.");
	}

	@Override
	public void exitList_func_declaration(List_func_declarationContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting declaration function list.");
	}

	@Override
	public void enterFunc_declaration(Func_declarationContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering declaration function.");
	}

	@Override
	public void exitFunc_declaration(Func_declarationContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting declaration function.");
	}

	@Override
	public void enterFunc_with_send(Func_with_sendContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering function with send.");
	}

	@Override
	public void exitFunc_with_send(Func_with_sendContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting function with send.");
	}

	@Override
	public void enterFunc_without_send(Func_without_sendContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering function without send.");
	}

	@Override
	public void exitFunc_without_send(Func_without_sendContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting function without send.");
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
		if(output == 0)
			logger.info("[INFO] Entering main function.");
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
			logger.info("[INFO] Entering constant list.");
	}

	@Override
	public void exitList_constants(List_constantsContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting constant list.");
	}

	@Override
	public void enterBool_term(Bool_termContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Entering boolean term.");
	}

	@Override
	public void exitBool_term(Bool_termContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Exiting boolean term.");
	}

}
