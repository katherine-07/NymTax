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

    public ConditionalExpression()
    {
        booleanExpression = new BooleanExpression();
    }

    @Override
    public Object visitConditional_if(NymtaxParser.Conditional_ifContext ctx) {

        ExecutionManager manager = ExecutionManager.getInstance();
        Boolean a = (Boolean) booleanExpression.visit(ctx.boolean_expression());

        if(a){
            Function scopeIf = new Function("if", manager.getCurrentFunc(), ctx.list_statement(),null, false);
            manager.setCurrentFunc(scopeIf);
            manager.visit(ctx.list_statement());

            manager.setCurrentFunc(scopeIf.getParentScope());
        }

        return true;
    }

    @Override
    public Object visitConditional_ifelse(NymtaxParser.Conditional_ifelseContext ctx) {

        ExecutionManager manager = ExecutionManager.getInstance();
        Boolean a = (Boolean) booleanExpression.visit(ctx.boolean_expression());

        if(a){
            Function scopeIf = new Function("if", manager.getCurrentFunc(), ctx.list_statement(),null, false);
            manager.setCurrentFunc(scopeIf);
            manager.visit(ctx.list_statement());

            manager.setCurrentFunc(scopeIf.getParentScope());
        }
        else{
            Function scopeElse = new Function("else", manager.getCurrentFunc(), ctx,null, false);
            visit(ctx.otherwise_when_statement());
        }

        return true;
    }

    @Override
    public Object visitOtherwise_when(NymtaxParser.Otherwise_whenContext ctx) {

        ExecutionManager manager = ExecutionManager.getInstance();
        Boolean a = (Boolean) booleanExpression.visit(ctx.boolean_expression());

        if(a){
            Function scopeIf = new Function("elseif", manager.getCurrentFunc(), ctx.list_statement(),null, false);
            manager.setCurrentFunc(scopeIf);
            manager.visit(ctx.list_statement());

            manager.setCurrentFunc(scopeIf.getParentScope());
        }

        return true;
    }

    @Override
    public Object visitOtherwise_when_mult(NymtaxParser.Otherwise_when_multContext ctx) {

        ExecutionManager manager = ExecutionManager.getInstance();
        Boolean a = (Boolean) booleanExpression.visit(ctx.boolean_expression());

        if(a){
            Function scopeIf = new Function("elseif", manager.getCurrentFunc(), ctx.list_statement(),null, false);
            manager.setCurrentFunc(scopeIf);
            manager.visit(ctx.list_statement());

            manager.setCurrentFunc(scopeIf.getParentScope());
        }else{
            visit(ctx.otherwise_when_statement());
        }
        return true;
    }

    @Override
    public Object visitOtherwise(NymtaxParser.OtherwiseContext ctx) {
        ExecutionManager manager = ExecutionManager.getInstance();
        Function scopeIf = new Function("else", manager.getCurrentFunc(), ctx.list_statement(),null, false);
        manager.setCurrentFunc(scopeIf);
        manager.visit(ctx.list_statement());

        manager.setCurrentFunc(scopeIf.getParentScope());
        return true;
    }

    @Override
    public Object visitConditional_switch_expr(NymtaxParser.Conditional_switch_exprContext ctx) {
        ExecutionManager manager = ExecutionManager.getInstance();

        Function scopeSwitch = new Function("switchExpr", manager.getCurrentFunc(), null, null, false);
        manager.setCurrentFunc(scopeSwitch);
        Object value = manager.visit(ctx.expression());

        scopeSwitch.declare(new Symbol("switch", null, false, false));
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
        ExecutionManager manager = ExecutionManager.getInstance();
        Function scopeSwitch = new Function("switchExpr", manager.getCurrentFunc(), null, null, false);
        manager.setCurrentFunc(scopeSwitch);
        Object value = scopeSwitch.lookup(ctx.IDENTIFIER().getText());

        if(value != null) {
            scopeSwitch.declare(new Symbol("switch", null, false, false));
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
        ExecutionManager manager = ExecutionManager.getInstance();
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

    @Override
    public Object visitLoop_while(NymtaxParser.Loop_whileContext ctx) {
        ExecutionManager manager = ExecutionManager.getInstance();
        Boolean a = (Boolean) booleanExpression.visit(ctx.boolean_expression());

        Function scopeIf = new Function("while", manager.getCurrentFunc(), ctx.list_statement(),null, false);
        while(a){
            manager.setCurrentFunc(scopeIf);
            manager.visit(ctx.list_statement());

            a = (Boolean) booleanExpression.visit(ctx.boolean_expression());
        }

        manager.setCurrentFunc(scopeIf.getParentScope());
        return true;
    }

    @Override
    public Object visitLoop_dowhile(NymtaxParser.Loop_dowhileContext ctx) {
        ExecutionManager manager = ExecutionManager.getInstance();
        Boolean a ;
        Function scopeIf = new Function("dowhile", manager.getCurrentFunc(), ctx.list_statement(),null, false);

        do{
            manager.setCurrentFunc(scopeIf);
            manager.visit(ctx.list_statement());

            a = (Boolean) booleanExpression.visit(ctx.boolean_expression());
        }while(a);

        manager.setCurrentFunc(scopeIf.getParentScope());
        return true;
    }

    @Override
    public Object visitLoop_for(NymtaxParser.Loop_forContext ctx) {
        ExecutionManager manager = ExecutionManager.getInstance();
        Boolean a ;
        (new ScopeExpressionManager()).visit(ctx.assign(0));

        a = (Boolean) booleanExpression.visit(ctx.boolean_expression());
        while(a){

            Function scopeIf = new Function("for", manager.getCurrentFunc(), ctx.list_statement(),null, false);

            manager.setCurrentFunc(scopeIf);
            manager.visit(ctx.list_statement());

            (new ScopeExpressionManager()).visit(ctx.assign(1));
            a = (Boolean) booleanExpression.visit(ctx.boolean_expression());
            manager.setCurrentFunc(scopeIf.getParentScope());
        };

        return true;
    }
}
