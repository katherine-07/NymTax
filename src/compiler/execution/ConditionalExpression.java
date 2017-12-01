package compiler.execution;

import antlr4.generate.NymtaxBaseVisitor;
import antlr4.generate.NymtaxParser;
import compiler.objects.Function;
import compiler.objects.Scope;

public class ConditionalExpression extends NymtaxBaseVisitor {

    public Function getScope_() {
        return scope_;
    }

    public void setScope_(Function scope_) {
        this.scope_ = scope_;
    }

    private Function scope_;

    BooleanExpression booleanExpression;

    public ConditionalExpression(Function scope)
    {
        scope_ = scope;
        booleanExpression = new BooleanExpression();
    }

    @Override
    public Object visitConditional_if(NymtaxParser.Conditional_ifContext ctx) {

        Boolean a = (Boolean) booleanExpression.visit(ctx.boolean_expression());

        if(a){
            Function scopeIf = new Function("if", scope_, ctx,null);
            ExecutionManager.getInstance().setCurrentFunc(scopeIf);
            ExecutionManager.getInstance().visit(ctx.list_statement());

            ExecutionManager.getInstance().setCurrentFunc(scopeIf.getParentScope());
        }

        return super.visitConditional_if(ctx);
    }

    @Override
    public Object visitConditional_ifelse(NymtaxParser.Conditional_ifelseContext ctx) {

        Boolean a = (Boolean) booleanExpression.visit(ctx.boolean_expression());

        if(a){
            Function scopeIf = new Function("if", scope_, ctx,null);
        }
        else{
            Function scopeElse = new Function("else", scope_, ctx,null);
        }

        return super.visitConditional_ifelse(ctx);
    }

    @Override
    public Object visitConditional_switch(NymtaxParser.Conditional_switchContext ctx) {


        return super.visitConditional_switch(ctx);
    }

}
