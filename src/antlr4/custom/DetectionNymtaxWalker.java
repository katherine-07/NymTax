package antlr4.custom;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr4.generate.NymtaxBaseListener;
import antlr4.generate.NymtaxParser;


public class DetectionNymtaxWalker extends NymtaxBaseListener{


	@Override public void enterProgram(NymtaxParser.ProgramContext ctx) { 
		System.out.println("[ENTERED PROGRAM]");
	}

	@Override public void exitProgram(NymtaxParser.ProgramContext ctx) { }

	@Override public void enterVar_declaration(NymtaxParser.Var_declarationContext ctx) { }
	
	 
	 

	 
	@Override public void exitVar_declaration(NymtaxParser.Var_declarationContext ctx) { }
	
	 
	 

	 
	@Override public void enterList_var(NymtaxParser.List_varContext ctx) { }
	
	 
	 

	 
	@Override public void exitList_var(NymtaxParser.List_varContext ctx) { }
	
	 
	 

	 
	@Override public void enterList_var_name(NymtaxParser.List_var_nameContext ctx) { }
	
	 
	 

	 
	@Override public void exitList_var_name(NymtaxParser.List_var_nameContext ctx) { }
	
	 
	 

	 
	@Override public void enterConst_declaration(NymtaxParser.Const_declarationContext ctx) { }
	
	 
	 

	 
	@Override public void exitConst_declaration(NymtaxParser.Const_declarationContext ctx) { }
	
	 
	 

	 
	@Override public void enterConstant(NymtaxParser.ConstantContext ctx) { }
	
	 
	 

	 
	@Override public void exitConstant(NymtaxParser.ConstantContext ctx) { }
	
	 
	 

	 
	@Override public void enterList_statement(NymtaxParser.List_statementContext ctx) { }
	
	 
	 

	 
	@Override public void exitList_statement(NymtaxParser.List_statementContext ctx) { }
	
	 
	 

	 
	@Override public void enterStatement(NymtaxParser.StatementContext ctx) { }
	
	 
	 

	 
	@Override public void exitStatement(NymtaxParser.StatementContext ctx) { }
	
	 
	 

	 
	@Override public void enterFunction_call_stat(NymtaxParser.Function_call_statContext ctx) { }
	
	 
	 

	 
	@Override public void exitFunction_call_stat(NymtaxParser.Function_call_statContext ctx) { }
	
	 
	 

	 
	@Override public void enterList_parameter(NymtaxParser.List_parameterContext ctx) { }
	
	 
	 

	 
	@Override public void exitList_parameter(NymtaxParser.List_parameterContext ctx) { }
	
	 
	 

	 
	@Override public void enterSend_statement(NymtaxParser.Send_statementContext ctx) { }
	
	 
	 

	 
	@Override public void exitSend_statement(NymtaxParser.Send_statementContext ctx) { }
	
	 
	 

	 
	@Override public void enterExpression(NymtaxParser.ExpressionContext ctx) { }
	
	 
	 

	 
	@Override public void exitExpression(NymtaxParser.ExpressionContext ctx) { }
	
	 
	 

	 
	@Override public void enterString_expression(NymtaxParser.String_expressionContext ctx) { }
	
	 
	 

	 
	@Override public void exitString_expression(NymtaxParser.String_expressionContext ctx) { }
	
	 
	 

	 
	@Override public void enterNumerical_expression(NymtaxParser.Numerical_expressionContext ctx) { }
	
	 
	 

	 
	@Override public void exitNumerical_expression(NymtaxParser.Numerical_expressionContext ctx) { }
	
	 
	 

	 
	@Override public void enterBoolean_expression(NymtaxParser.Boolean_expressionContext ctx) { }
	
	 
	 

	 
	@Override public void exitBoolean_expression(NymtaxParser.Boolean_expressionContext ctx) { }
	
	 
	 

	 
	@Override public void enterBoolean_logic(NymtaxParser.Boolean_logicContext ctx) { }
	
	 
	 

	 
	@Override public void exitBoolean_logic(NymtaxParser.Boolean_logicContext ctx) { }
	
	 
	 

	 
	@Override public void enterRelation_ops(NymtaxParser.Relation_opsContext ctx) { }
	
	 
	 

	 
	@Override public void exitRelation_ops(NymtaxParser.Relation_opsContext ctx) { }
	
	 
	 

	 
	@Override public void enterList_assign(NymtaxParser.List_assignContext ctx) { }
	
	 
	 

	 
	@Override public void exitList_assign(NymtaxParser.List_assignContext ctx) { }
	
	 
	 

	 
	@Override public void enterAssign(NymtaxParser.AssignContext ctx) { }
	
	 
	 

	 
	@Override public void exitAssign(NymtaxParser.AssignContext ctx) { }
	
	 
	 

	 
	@Override public void enterWrite_statement(NymtaxParser.Write_statementContext ctx) { }
	
	 
	 

	 
	@Override public void exitWrite_statement(NymtaxParser.Write_statementContext ctx) { }
	
	 
	 

	 
	@Override public void enterWrite_list(NymtaxParser.Write_listContext ctx) { }
	
	 
	 

	 
	@Override public void exitWrite_list(NymtaxParser.Write_listContext ctx) { }
	
	 
	 

	 
	@Override public void enterRead_statement(NymtaxParser.Read_statementContext ctx) { }
	
	 
	 

	 
	@Override public void exitRead_statement(NymtaxParser.Read_statementContext ctx) { }





	@Override public void enterInput_data_type(NymtaxParser.Input_data_typeContext ctx) { }





	@Override public void exitInput_data_type(NymtaxParser.Input_data_typeContext ctx) { }


	 

	 
	@Override public void enterInput_var_name(NymtaxParser.Input_var_nameContext ctx) { }
	
	 
	 

	 
	@Override public void exitInput_var_name(NymtaxParser.Input_var_nameContext ctx) { }
	
	 
	 

	 
	@Override public void enterWhen_statement(NymtaxParser.When_statementContext ctx) { }
	
	 
	 

	 
	@Override public void exitWhen_statement(NymtaxParser.When_statementContext ctx) { }
	
	 
	 

	 
	@Override public void enterOtherwise_when_statement(NymtaxParser.Otherwise_when_statementContext ctx) { }
	
	 
	 

	 
	@Override public void exitOtherwise_when_statement(NymtaxParser.Otherwise_when_statementContext ctx) { }
	
	 
	 

	 
	@Override public void enterCondition_statement(NymtaxParser.Condition_statementContext ctx) { }
	
	 
	 

	 
	@Override public void exitCondition_statement(NymtaxParser.Condition_statementContext ctx) { }
	
	 
	 

	 
	@Override public void enterList_event(NymtaxParser.List_eventContext ctx) { }
	
	 
	 

	 
	@Override public void exitList_event(NymtaxParser.List_eventContext ctx) { }
	
	 
	 

	 
	@Override public void enterBase_statement(NymtaxParser.Base_statementContext ctx) { }
	
	 
	 

	 
	@Override public void exitBase_statement(NymtaxParser.Base_statementContext ctx) { }
	
	 
	 

	 
	@Override public void enterLoop_every_statement(NymtaxParser.Loop_every_statementContext ctx) { }
	
	@Override public void exitLoop_every_statement(NymtaxParser.Loop_every_statementContext ctx) { }
	
	@Override public void enterLoop_throughout_statement(NymtaxParser.Loop_throughout_statementContext ctx) { }
	
	@Override public void exitLoop_throughout_statement(NymtaxParser.Loop_throughout_statementContext ctx) { }
	
	@Override public void enterLoop_do_throughout_statement(NymtaxParser.Loop_do_throughout_statementContext ctx) { }
	
	@Override public void exitLoop_do_throughout_statement(NymtaxParser.Loop_do_throughout_statementContext ctx) { }
	
	@Override public void enterList_func_declaration(NymtaxParser.List_func_declarationContext ctx) { }
	
	@Override public void exitList_func_declaration(NymtaxParser.List_func_declarationContext ctx) { }
	
	@Override public void enterFunc_declaration(NymtaxParser.Func_declarationContext ctx) { }
	
	@Override public void exitFunc_declaration(NymtaxParser.Func_declarationContext ctx) { }
	
	@Override public void enterFunc_with_send(NymtaxParser.Func_with_sendContext ctx) { }
	
	@Override public void exitFunc_with_send(NymtaxParser.Func_with_sendContext ctx) { }
	
	@Override public void enterFunc_without_send(NymtaxParser.Func_without_sendContext ctx) { }
	
	@Override public void exitFunc_without_send(NymtaxParser.Func_without_sendContext ctx) { }
	
	@Override public void enterFunc_body(NymtaxParser.Func_bodyContext ctx) { }
	
	@Override public void exitFunc_body(NymtaxParser.Func_bodyContext ctx) { }
	
	@Override public void enterFunc_main(NymtaxParser.Func_mainContext ctx) { }
	
	@Override public void exitFunc_main(NymtaxParser.Func_mainContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	
	@Override public void visitTerminal(TerminalNode node) { }
	
	@Override public void visitErrorNode(ErrorNode node) {
		System.out.println("[FOUND ERROR]");
	}
}
