package antlr4.custom;

import antlr4.generate.NymtaxListener;
import antlr4.generate.NymtaxParser;
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
	public void enterVar_declaration(Var_declarationContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0) {
			logger.info("[INFO] VARIABLE DECLARATION");
			logger.info("[INFO] Variable declaration found: " + ctx.getText());
		}
	}

	@Override
	public void exitVar_declaration(Var_declarationContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] END VARIABLE DECLARATION");
		
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
	public void enterStatement(StatementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] START STATEMENT");
	}

	@Override
	public void exitStatement(StatementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] END STATEMENT");
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
	public void enterSend_statement(Send_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Send statement found: "+ctx.getText());
	}

	@Override
	public void exitSend_statement(Send_statementContext ctx) {
		// TODO Auto-generated method stub
//		if(output == 0)
//			logger.info("[INFO] Exiting send statement.");
	}

	@Override
	public void enterExpression(ExpressionContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] EXPRESSION LIST");
	}

	@Override
	public void exitExpression(ExpressionContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] END OF EXPRESSIONS");
	}

	@Override
	public void enterString_expression(String_expressionContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] String expression found: "+ ctx.getText());
	}

	@Override
	public void exitString_expression(String_expressionContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Last of string expressions.");
	}

	@Override
	public void enterNumerical_expression(Numerical_expressionContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Numerical expression found: " + ctx.getText());
	}

	@Override
	public void exitNumerical_expression(Numerical_expressionContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Last of numerical expressions.");
	}

	@Override
	public void enterBoolean_expression(Boolean_expressionContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Boolean expression found: " + ctx.getText());
	}

	@Override
	public void exitBoolean_expression(Boolean_expressionContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Last of the boolean expressions.");
	}

	@Override
	public void enterBoolean_logic(Boolean_logicContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Boolean logic found: " +ctx.getText());
	}

	@Override
	public void exitBoolean_logic(Boolean_logicContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Last of boolean logic statements.");
	}

	@Override
	public void enterRelation_ops(Relation_opsContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Relational operation found: " +ctx.getText());
	}

	@Override
	public void exitRelation_ops(Relation_opsContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Last of relational operators.");
	}

	@Override
	public void enterAssign(AssignContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Assignment call found: " +ctx.getText());
	}	

	@Override
	public void exitAssign(AssignContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Last of assignment calls.");
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
	public void enterInput_data_type(Input_data_typeContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Input data type statement found: " +ctx.getText());
	}

	@Override
	public void exitInput_data_type(Input_data_typeContext ctx) {
		// TODO Auto-generated method stub
	//	if(output == 0);
	//		logger.info("[INFO] ");
	}

	@Override
	public void enterInput_IDENTIFIER(Input_IDENTIFIERContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Input identifier statement found: " +ctx.getText());
	}

	@Override
	public void exitInput_IDENTIFIER(Input_IDENTIFIERContext ctx) {
		// TODO Auto-generated method stub
	//	if(output == 0)
	//		logger.info("[INFO] ");
	}

	@Override
	public void enterWhen_statement(When_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0) {
			logger.info("[INFO] WHEN statement found: " +ctx.getText());
			logger.info("[INFO] Entering WHEN statement.");
		}
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
		if(output == 0) {
			logger.info("[INFO] OTHERWISE-WHEN statement found: " +ctx.getText());
			logger.info("[INFO] Entering OTHERWISE-WHEN statement.");
		}
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
			logger.info("[INFO] CONDITION statement found: " +ctx.getText());
	}

	@Override
	public void exitCondition_statement(Condition_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] End of CONDITION statement.");
	}

	@Override
	public void enterList_event(List_eventContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0) {
			logger.info("[INFO] Event list statement found: " +ctx.getText());
			logger.info("[INFO] Entering event list.");
		}
	}

	@Override
	public void exitList_event(List_eventContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] End of event list.");
	}

	@Override
	public void enterBase_statement(Base_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] BASE statement found:" +ctx.getText());
	}

	@Override
	public void exitBase_statement(Base_statementContext ctx) {
		// TODO Auto-generated method stub
	//	if(output == 0)
	//		logger.info("[INFO] Exiting base statement.");
	}

	@Override
	public void enterLoop_every_statement(Loop_every_statementContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0){
			logger.info("[INFO] LOOP-EVERY statement found: " +ctx.getText());
			logger.info("[INFO] Entering LOOP-EVERY statement.");
		}
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
		if(output == 0) {
			logger.info("[INFO] LOOP-THROUGHOUT statement found: " +ctx.getText());
			logger.info("[INFO] Entering LOOP-THROUGHOUT statement.");
		}
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
		if(output == 0) {
			logger.info("[INFO] LOOP-DO-THROUGHOUT statement found: " +ctx.getText());
			logger.info("[INFO] Entering LOOP-DO-THROUGHOUT statement.");
		}
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
			logger.info("[INFO] FUNCTION DECLARATION ");
	}

	@Override
	public void exitList_func_declaration(List_func_declarationContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] END OF FUNCTION DECLARATION LIST ");
	}

	@Override
	public void enterFunc_declaration(Func_declarationContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Declaration function found: " +ctx.getText());
	}

	@Override
	public void exitFunc_declaration(Func_declarationContext ctx) {
		// TODO Auto-generated method stub
	//	if(output == 0)
	//		logger.info("[INFO] Exiting declaration function.");
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

	@Override
	public void enterBool_term(Bool_termContext ctx) {
		// TODO Auto-generated method stub
		if(output == 0)
			logger.info("[INFO] Boolean term found: " +ctx.getText());
	}

	@Override
	public void exitBool_term(Bool_termContext ctx) {
		// TODO Auto-generated method stub
	//	if(output == 0)
	//		logger.info("[INFO] Exiting boolean term.");
	}

}
