package compiler.execution;

import antlr4.generate.NymtaxBaseVisitor;
import antlr4.generate.NymtaxParser;
import compiler.objects.Function;
import compiler.objects.Scope;
import compiler.objects.Symbol;

public class ScopeExpressionManager extends NymtaxBaseVisitor {


    public Function getScope_() {
        return scope_;
    }

    public void setScope_(Function scope_) {
        this.scope_ = scope_;
    }

    private Function scope_;

    public ScopeExpressionManager(Function scope){
        scope_ = scope;
    }


    @Override
    public Object visitList_constants(NymtaxParser.List_constantsContext ctx) {
        for(int i=0; i<ctx.const_declaration().size(); i++){
            visit(ctx.const_declaration(i));
        }
        return true;
    }

    @Override
    public Object visitConst_declaration(NymtaxParser.Const_declarationContext ctx) {
        String datatype = ctx.list_var().getText();
        String id = ctx.IDENTIFIER().getText();

        Symbol constant = new Symbol(id, datatype, false);
        scope_.declare(constant);

        return true;
    }

    @Override
    public Object visitList_func_declaration(NymtaxParser.List_func_declarationContext ctx) {
        for(int i=0; i<ctx.func_declaration().size(); i++){
            visit(ctx.func_declaration(i));
        }
        return true;
    }

    @Override
    public Object visitFunc_dec_send(NymtaxParser.Func_dec_sendContext ctx) {
        String dataType = ctx.func_with_send().data_type().getText();
        String id = ctx.func_with_send().function_call_stat().IDENTIFIER().getText();

        Function func = new Function(id, scope_, ctx.func_with_send().func_body(), dataType);

        NymtaxParser.List_parameterContext parameters = ctx.func_with_send().function_call_stat().list_parameter();
        for(int i=0; i<parameters.list_var().size(); i++){
            func.addParameter(parameters.IDENTIFIER(i).getText(), parameters.list_var(i).getText());
        }

        scope_.declare(func);

        return super.visitFunc_dec_send(ctx);
    }

    @Override
    public Object visitFunc_dec_none(NymtaxParser.Func_dec_noneContext ctx) {
        String dataType = "VOID";
        String id = ctx.func_without_send().function_call_stat().IDENTIFIER().getText();

        Function func = new Function(id, scope_, ctx.func_without_send().func_body(), dataType);


        NymtaxParser.List_parameterContext parameters = ctx.func_without_send().function_call_stat().list_parameter();
        for(int i=0; i<parameters.list_var().size(); i++){
            Symbol param = new Symbol(parameters.IDENTIFIER(i).getText(), parameters.list_var(i).getText(), true);
            func.declare(param);
        }

        scope_.declare(func);

        return super.visitFunc_dec_none(ctx);
    }

    @Override
    public Object visitFunc_body(NymtaxParser.Func_bodyContext ctx) {
        return super.visitFunc_body(ctx);
    }

    @Override
    public Object visitAssign_constant(NymtaxParser.Assign_constantContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        String constant = ctx.constant().getText();

        Symbol symbol = scope_.lookup(id);

        if(symbol==null){
            //TODO: throw error variable not found;
        }else{
            //TODO switch for datatypes?
            /*
            switch(symbol.getDataType()){
                case "INTEGER":
                    symbol.setValue(Integer.parseInt(constant));
                    break;
            }
            */

            symbol.setValue(constant);
        }



        return super.visitAssign_constant(ctx);
    }

    @Override
    public Object visitVar_dec_var(NymtaxParser.Var_dec_varContext ctx) {

        String dataType = ctx.list_var().getText();
        String id = ctx.IDENTIFIER(0).getText();
        String toAssign = null;
        if(ctx.IDENTIFIER().size() > 1) {
            toAssign = ctx.IDENTIFIER(1).getText();
        }

        Symbol var;
        var = new Symbol(id, dataType, false);
        if(toAssign!=null) {
            Symbol assign = scope_.lookup(toAssign);
            var.setValue(assign.getValue());
        }

        scope_.declare(var);

        return super.visitVar_dec_var(ctx);
    }

    @Override
    public Object visitVar_dec_const(NymtaxParser.Var_dec_constContext ctx) {
        return visitConst_declaration(ctx.const_declaration());
    }

    @Override
    public Object visitVar_array_init(NymtaxParser.Var_array_initContext ctx) {
        //TODO: array initialization
        return super.visitVar_array_init(ctx);
    }
}
