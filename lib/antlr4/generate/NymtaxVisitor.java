// Generated from G:/git-oxygen/Nymtax/src/NymtaxParser\Nymtax.g4 by ANTLR 4.7
package antlr4.generate;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NymtaxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NymtaxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(NymtaxParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(NymtaxParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaration(NymtaxParser.Var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#list_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_var(NymtaxParser.List_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#list_constants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_constants(NymtaxParser.List_constantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#const_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_declaration(NymtaxParser.Const_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(NymtaxParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#list_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_statement(NymtaxParser.List_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(NymtaxParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#function_call_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_stat(NymtaxParser.Function_call_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#list_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_parameter(NymtaxParser.List_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#send_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSend_statement(NymtaxParser.Send_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(NymtaxParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#string_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_expression(NymtaxParser.String_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#numerical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumerical_expression(NymtaxParser.Numerical_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_expression(NymtaxParser.Boolean_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#boolean_logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_logic(NymtaxParser.Boolean_logicContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#bool_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_term(NymtaxParser.Bool_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#relation_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_ops(NymtaxParser.Relation_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(NymtaxParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#write_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_statement(NymtaxParser.Write_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#write_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_list(NymtaxParser.Write_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#read_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_statement(NymtaxParser.Read_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#input_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_data_type(NymtaxParser.Input_data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#input_IDENTIFIER}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_IDENTIFIER(NymtaxParser.Input_IDENTIFIERContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#when_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_statement(NymtaxParser.When_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#otherwise_when_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherwise_when_statement(NymtaxParser.Otherwise_when_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#condition_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_statement(NymtaxParser.Condition_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#list_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_event(NymtaxParser.List_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#base_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_statement(NymtaxParser.Base_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#loop_every_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_every_statement(NymtaxParser.Loop_every_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#loop_throughout_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_throughout_statement(NymtaxParser.Loop_throughout_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#loop_do_throughout_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_do_throughout_statement(NymtaxParser.Loop_do_throughout_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#list_func_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_func_declaration(NymtaxParser.List_func_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#func_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_declaration(NymtaxParser.Func_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#func_with_send}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_with_send(NymtaxParser.Func_with_sendContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#func_without_send}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_without_send(NymtaxParser.Func_without_sendContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body(NymtaxParser.Func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link NymtaxParser#func_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_main(NymtaxParser.Func_mainContext ctx);
}