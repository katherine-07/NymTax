package antlr4.custom;

import antlr4.generate.NymtaxBaseListener;
import antlr4.generate.NymtaxParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class NymtaxWalker extends NymtaxBaseListener {


    @Override public void enterVar_declaration(NymtaxParser.Var_declarationContext ctx) { }

    @Override public void exitVar_declaration(NymtaxParser.Var_declarationContext ctx) { }

    @Override public void enterConst_declaration(NymtaxParser.Const_declarationContext ctx) { }

    @Override public void exitConst_declaration(NymtaxParser.Const_declarationContext ctx) { }

    @Override public void enterFunction_call_stat(NymtaxParser.Function_call_statContext ctx) { }

    @Override public void exitFunction_call_stat(NymtaxParser.Function_call_statContext ctx) { }

    @Override public void enterSend_statement(NymtaxParser.Send_statementContext ctx) { }

    @Override public void exitSend_statement(NymtaxParser.Send_statementContext ctx) { }

    @Override public void enterAssign(NymtaxParser.AssignContext ctx) { }

    @Override public void enterWrite_statement(NymtaxParser.Write_statementContext ctx) { }

    @Override public void exitWrite_statement(NymtaxParser.Write_statementContext ctx) { }

    @Override public void enterRead_statement(NymtaxParser.Read_statementContext ctx) { }

    @Override public void exitRead_statement(NymtaxParser.Read_statementContext ctx) { }

    @Override public void enterWhen_statement(NymtaxParser.When_statementContext ctx) { }

    @Override public void exitWhen_statement(NymtaxParser.When_statementContext ctx) { }

    @Override public void enterOtherwise_when_statement(NymtaxParser.Otherwise_when_statementContext ctx) { }

    @Override public void exitOtherwise_when_statement(NymtaxParser.Otherwise_when_statementContext ctx) { }

    @Override public void enterCondition_statement(NymtaxParser.Condition_statementContext ctx) { }

    @Override public void exitCondition_statement(NymtaxParser.Condition_statementContext ctx) { }

    @Override public void enterLoop_every_statement(NymtaxParser.Loop_every_statementContext ctx) { }

    @Override public void exitLoop_every_statement(NymtaxParser.Loop_every_statementContext ctx) { }

    @Override public void enterLoop_throughout_statement(NymtaxParser.Loop_throughout_statementContext ctx) { }

    @Override public void exitLoop_throughout_statement(NymtaxParser.Loop_throughout_statementContext ctx) { }

    @Override public void enterLoop_do_throughout_statement(NymtaxParser.Loop_do_throughout_statementContext ctx) { }

    @Override public void exitLoop_do_throughout_statement(NymtaxParser.Loop_do_throughout_statementContext ctx) { }

    @Override public void enterFunc_declaration(NymtaxParser.Func_declarationContext ctx) { }

    @Override public void exitFunc_declaration(NymtaxParser.Func_declarationContext ctx) { }

}
