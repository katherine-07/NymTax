package compiler.execution;

import antlr4.generate.NymtaxBaseVisitor;
import antlr4.generate.NymtaxParser;
import compiler.exceptions.VariableNotFoundException;
import compiler.objects.Function;
import compiler.objects.Scope;
import compiler.objects.Symbol;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public class ConditionalExpression extends NymtaxBaseVisitor {

    BooleanExpression booleanExpression;
    ExecutionManager manager = ExecutionManager.getInstance();

    public ConditionalExpression()
    {
        booleanExpression = new BooleanExpression();
    }

    @Override
    public Object visitConditional_if(NymtaxParser.Conditional_ifContext ctx) {

        Boolean a = (Boolean) booleanExpression.visit(ctx.boolean_expression());

        if(a){
            Function scopeIf = new Function("if", manager.getCurrentFunc(), ctx,null);
            manager.setCurrentFunc(scopeIf);
            manager.visit(ctx.list_statement());

            manager.setCurrentFunc(scopeIf.getParentScope());
        }

        return true;
    }

    @Override
    public Object visitConditional_ifelse(NymtaxParser.Conditional_ifelseContext ctx) {

        Boolean a = (Boolean) booleanExpression.visit(ctx.boolean_expression());

        if(a){
            Function scopeIf = new Function("if", manager.getCurrentFunc(), ctx,null);
        }
        else{
            Function scopeElse = new Function("else", manager.getCurrentFunc(), ctx,null);
        }

        return super.visitConditional_ifelse(ctx);
    }

    @Override
    public Object visitConditional_switch_expr(NymtaxParser.Conditional_switch_exprContext ctx) {

        Function scopeSwitch = new Function("switchExpr", manager.getCurrentFunc(), null, null);
        manager.setCurrentFunc(scopeSwitch);
        Object value = manager.visit(ctx.expression());

        scopeSwitch.declare(new Symbol("switch", null, false));
        scopeSwitch.initialize("switch", value);

        Integer caseIndex = (Integer) visit(ctx.list_event());

        if(caseIndex == null){
            scopeSwitch.setCtx(ctx.base_statement().list_statement());
        }

        manager.visit(manager.getCurrentFunc().getContex());


        manager.setCurrentFunc(scopeSwitch.getParentScope());
        return true;
    }

    @Override
    public Object visitConditional_switch_variable(NymtaxParser.Conditional_switch_variableContext ctx) {
        Function scopeSwitch = new Function("switchExpr", manager.getCurrentFunc(), null, null);
        manager.setCurrentFunc(scopeSwitch);
        Object value = scopeSwitch.lookup(ctx.IDENTIFIER().getText());

        if(value != null) {
            scopeSwitch.declare(new Symbol("switch", null, false));
            scopeSwitch.initialize("switch", value);

            Integer caseIndex = (Integer) visit(ctx.list_event());

            if (caseIndex == null) {
                scopeSwitch.setCtx(ctx.base_statement().list_statement());
            }

            manager.visit(manager.getCurrentFunc().getContex());


            manager.setCurrentFunc(scopeSwitch.getParentScope());
            return true;
        }else{
            System.out.println("ERROR: Variable not found - switch statement");
            return false;
        }
    }

    @Override
    public Integer visitList_event(NymtaxParser.List_eventContext ctx) {
        Integer caseIndex = null;

        List<NymtaxParser.ExpressionContext> expressions = ctx.expression();
        Object var = manager.getCurrentFunc().lookup("switch");
        for(int i=0 ; i<expressions.size(); i++){
            Object val = manager.visit(expressions.get(i));
            if(var.equals(val)){
                manager
                        .getCurrentFunc()
                        .setCtx(ctx.list_statement(i));
                return i;
            }
        }


        return caseIndex;
    }
}
