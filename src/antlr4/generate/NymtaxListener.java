// Generated from C:/Users/Luisa Gilig/Documents/GitHub/NymTax/src/NymtaxParser\Nymtax.g4 by ANTLR 4.7
package antlr4.generate;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NymtaxParser}.
 */
public interface NymtaxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(NymtaxParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(NymtaxParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(NymtaxParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(NymtaxParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#list_var}.
	 * @param ctx the parse tree
	 */
	void enterList_var(NymtaxParser.List_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#list_var}.
	 * @param ctx the parse tree
	 */
	void exitList_var(NymtaxParser.List_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#list_var_name}.
	 * @param ctx the parse tree
	 */
	void enterList_var_name(NymtaxParser.List_var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#list_var_name}.
	 * @param ctx the parse tree
	 */
	void exitList_var_name(NymtaxParser.List_var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#const_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConst_declaration(NymtaxParser.Const_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#const_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConst_declaration(NymtaxParser.Const_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(NymtaxParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(NymtaxParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#list_statement}.
	 * @param ctx the parse tree
	 */
	void enterList_statement(NymtaxParser.List_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#list_statement}.
	 * @param ctx the parse tree
	 */
	void exitList_statement(NymtaxParser.List_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NymtaxParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NymtaxParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#function_call_stat}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call_stat(NymtaxParser.Function_call_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#function_call_stat}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call_stat(NymtaxParser.Function_call_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#list_parameter}.
	 * @param ctx the parse tree
	 */
	void enterList_parameter(NymtaxParser.List_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#list_parameter}.
	 * @param ctx the parse tree
	 */
	void exitList_parameter(NymtaxParser.List_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#send_statement}.
	 * @param ctx the parse tree
	 */
	void enterSend_statement(NymtaxParser.Send_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#send_statement}.
	 * @param ctx the parse tree
	 */
	void exitSend_statement(NymtaxParser.Send_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(NymtaxParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(NymtaxParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void enterString_expression(NymtaxParser.String_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void exitString_expression(NymtaxParser.String_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#numerical_expression}.
	 * @param ctx the parse tree
	 */
	void enterNumerical_expression(NymtaxParser.Numerical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#numerical_expression}.
	 * @param ctx the parse tree
	 */
	void exitNumerical_expression(NymtaxParser.Numerical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(NymtaxParser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(NymtaxParser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#boolean_logic}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_logic(NymtaxParser.Boolean_logicContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#boolean_logic}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_logic(NymtaxParser.Boolean_logicContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#relation_ops}.
	 * @param ctx the parse tree
	 */
	void enterRelation_ops(NymtaxParser.Relation_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#relation_ops}.
	 * @param ctx the parse tree
	 */
	void exitRelation_ops(NymtaxParser.Relation_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#list_assign}.
	 * @param ctx the parse tree
	 */
	void enterList_assign(NymtaxParser.List_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#list_assign}.
	 * @param ctx the parse tree
	 */
	void exitList_assign(NymtaxParser.List_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(NymtaxParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(NymtaxParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void enterWrite_statement(NymtaxParser.Write_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#write_statement}.
	 * @param ctx the parse tree
	 */
	void exitWrite_statement(NymtaxParser.Write_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#write_list}.
	 * @param ctx the parse tree
	 */
	void enterWrite_list(NymtaxParser.Write_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#write_list}.
	 * @param ctx the parse tree
	 */
	void exitWrite_list(NymtaxParser.Write_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void enterRead_statement(NymtaxParser.Read_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#read_statement}.
	 * @param ctx the parse tree
	 */
	void exitRead_statement(NymtaxParser.Read_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#input_data_type}.
	 * @param ctx the parse tree
	 */
	void enterInput_data_type(NymtaxParser.Input_data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#input_data_type}.
	 * @param ctx the parse tree
	 */
	void exitInput_data_type(NymtaxParser.Input_data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#input_var_name}.
	 * @param ctx the parse tree
	 */
	void enterInput_var_name(NymtaxParser.Input_var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#input_var_name}.
	 * @param ctx the parse tree
	 */
	void exitInput_var_name(NymtaxParser.Input_var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#when_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhen_statement(NymtaxParser.When_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#when_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhen_statement(NymtaxParser.When_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#otherwise_when_statement}.
	 * @param ctx the parse tree
	 */
	void enterOtherwise_when_statement(NymtaxParser.Otherwise_when_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#otherwise_when_statement}.
	 * @param ctx the parse tree
	 */
	void exitOtherwise_when_statement(NymtaxParser.Otherwise_when_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#condition_statement}.
	 * @param ctx the parse tree
	 */
	void enterCondition_statement(NymtaxParser.Condition_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#condition_statement}.
	 * @param ctx the parse tree
	 */
	void exitCondition_statement(NymtaxParser.Condition_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#list_event}.
	 * @param ctx the parse tree
	 */
	void enterList_event(NymtaxParser.List_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#list_event}.
	 * @param ctx the parse tree
	 */
	void exitList_event(NymtaxParser.List_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void enterBase_statement(NymtaxParser.Base_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void exitBase_statement(NymtaxParser.Base_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#loop_every_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_every_statement(NymtaxParser.Loop_every_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#loop_every_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_every_statement(NymtaxParser.Loop_every_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#loop_throughout_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_throughout_statement(NymtaxParser.Loop_throughout_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#loop_throughout_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_throughout_statement(NymtaxParser.Loop_throughout_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#loop_do_throughout_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_do_throughout_statement(NymtaxParser.Loop_do_throughout_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#loop_do_throughout_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_do_throughout_statement(NymtaxParser.Loop_do_throughout_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#list_func_declaration}.
	 * @param ctx the parse tree
	 */
	void enterList_func_declaration(NymtaxParser.List_func_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#list_func_declaration}.
	 * @param ctx the parse tree
	 */
	void exitList_func_declaration(NymtaxParser.List_func_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#func_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunc_declaration(NymtaxParser.Func_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#func_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunc_declaration(NymtaxParser.Func_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#func_with_send}.
	 * @param ctx the parse tree
	 */
	void enterFunc_with_send(NymtaxParser.Func_with_sendContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#func_with_send}.
	 * @param ctx the parse tree
	 */
	void exitFunc_with_send(NymtaxParser.Func_with_sendContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#func_without_send}.
	 * @param ctx the parse tree
	 */
	void enterFunc_without_send(NymtaxParser.Func_without_sendContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#func_without_send}.
	 * @param ctx the parse tree
	 */
	void exitFunc_without_send(NymtaxParser.Func_without_sendContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(NymtaxParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(NymtaxParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link NymtaxParser#func_main}.
	 * @param ctx the parse tree
	 */
	void enterFunc_main(NymtaxParser.Func_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link NymtaxParser#func_main}.
	 * @param ctx the parse tree
	 */
	void exitFunc_main(NymtaxParser.Func_mainContext ctx);
}