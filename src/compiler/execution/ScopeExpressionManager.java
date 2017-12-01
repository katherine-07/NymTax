package compiler.execution;

import antlr4.generate.NymtaxBaseVisitor;
import antlr4.generate.NymtaxParser;
import compiler.exceptions.VariableNotFoundException;
import compiler.objects.Function;
import compiler.objects.Scope;
import compiler.objects.Symbol;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

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
        String value = ctx.constant().getText();
        Symbol constant = new Symbol(id, datatype, false);
        scope_.declare(constant);
        scope_.initialize(constant.getIdentifier(), value);

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
        if(parameters != null)
            for(int i=0; i<parameters.list_var().size(); i++){
                func.addParameter(parameters.IDENTIFIER(i).getText(), parameters.list_var(i).getText());
            }

        scope_.declare(func);

        return true;
    }

    @Override
    public Object visitFunc_dec_none(NymtaxParser.Func_dec_noneContext ctx) {
        String dataType = "VOID";
        String id = ctx.func_without_send().function_call_stat().IDENTIFIER().getText();

        Function func = new Function(id, scope_, ctx.func_without_send().func_body(), dataType);


        NymtaxParser.List_parameterContext parameters = ctx.func_without_send().function_call_stat().list_parameter();

        if(parameters != null)
        for(int i=0; i<parameters.list_var().size(); i++){
            Symbol param = new Symbol(parameters.IDENTIFIER(i).getText(), parameters.list_var(i).getText(), true);
            func.declare(param);
        }

        scope_.declare(func);

        return true;
    }
/*
    @Override
    public Object visitFunc_body(NymtaxParser.Func_bodyContext ctx) {
        return super.visitFunc_body(ctx);
    }
*/
    @Override
    public Object visitAssign_constant(NymtaxParser.Assign_constantContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        String constant = ctx.constant().getText();

        Symbol symbol = scope_.lookup(id);

        if(symbol==null){
            //TODO: throw error variable not found;
            try {
                throw new VariableNotFoundException();
            } catch (VariableNotFoundException e) {
                e.printStackTrace();
            }
        }else{
            symbol = constantAssignment(symbol, constant);
        }



        return true;
    }

    public Symbol constantAssignment(Symbol symbol, String constant){
        switch(symbol.getDataType()){
            case Symbol.TYPE_INT:
                try {
                    Integer temp = Integer.parseInt(constant);
                    symbol.setValue(temp);
                } catch (NumberFormatException ex) {
                    symbol.setValue(0);
                    System.out.println("ERROR : datatype mismatch - Integer not found");
                    //TODO: error data type mismatch
                }
                break;
            case Symbol.TYPE_FLO:
                try {
                    Float temp = Float.parseFloat(constant);
                    symbol.setValue(temp);
                } catch (NumberFormatException ex) {
                    symbol.setValue(0.0);
                    //TODO: error data type mismatch
                    System.out.println("ERROR : datatype mismatch - Float not found");
                }
                break;
            case Symbol.TYPE_CHR:
                if(constant.length() == 3 && constant.charAt(0) == '\''  && constant.charAt(2) == '\'' ){
                    symbol.setValue(constant.charAt(1));
                }else{
                    //TODO: error data type mismatch
                    System.out.println("ERROR : datatype mismatch - Char not found");
                }
                break;
            case Symbol.TYPE_STRNG:
                if(constant.length() >= 2
                        && constant.startsWith("\"")
                        && constant.endsWith("\"")){
                    symbol.setValue(constant.substring(1, constant.length()-2));
                }else{
                    //TODO: error data type mismatch
                    System.out.println("ERROR : datatype mismatch - String not found");
                }
                break;
            case Symbol.TYPE_BOOL:
                if(constant.equals(Symbol.BOOL_FALSE)){
                    symbol.setValue(false);
                } else if(constant.equals(Symbol.BOOL_TRUE)){
                    symbol.setValue(true);
                }else{
                    //TODO: error data type mismatch
                    System.out.println("ERROR : datatype mismatch - Boolean not found");
                }
                break;
        }

        return symbol;
    }

    @Override
    public Object visitAssign_expression(NymtaxParser.Assign_expressionContext ctx) {
        String id = ctx.IDENTIFIER().getText();

        Symbol symbol = scope_.lookup(id);

        if(symbol==null){
            //TODO: throw error variable not found;
            try {
                throw new VariableNotFoundException();
            } catch (VariableNotFoundException e) {
                e.printStackTrace();
            }
        }else{
            Object expression = ExecutionManager.getInstance().visit(ctx.expression());

            symbol = assignExpression(symbol, expression);

        }

        return true;
    }

    public Symbol assignExpression(Symbol symbol, Object expressionReturn ){

        switch(symbol.getDataType()){
            case Symbol.TYPE_INT:
                if(expressionReturn instanceof  Float){
                    Float ex = (Float) expressionReturn;
                    int a = ex.intValue();
                    symbol.setValue(a);
                }else if (expressionReturn instanceof  Integer) {
                    symbol.setValue(expressionReturn);
                }else{
                    symbol.setValue(0);
                    System.out.println("ERROR : datatype mismatch - Integer not found");
                }
                break;
            case Symbol.TYPE_FLO:
                if(expressionReturn instanceof  Float){
                    symbol.setValue(expressionReturn);
                } else {
                    symbol.setValue(0.0);
                    //TODO: error data type mismatch
                    System.out.println("ERROR : datatype mismatch - Float not found");
                }
                break;
            case Symbol.TYPE_CHR:
                if(expressionReturn instanceof Character){
                    symbol.setValue(expressionReturn);
                }else{
                    //TODO: error data type mismatch
                    symbol.setValue('0');
                    System.out.println("ERROR : datatype mismatch - Char not found");
                }
                break;
            case Symbol.TYPE_STRNG:
                if(expressionReturn instanceof String){
                    symbol.setValue(expressionReturn);
                }else{
                    //TODO: error data type mismatch
                    symbol.setValue("Default");
                    System.out.println("ERROR : datatype mismatch - String not found");
                }
                break;
            case Symbol.TYPE_BOOL:
                if(expressionReturn instanceof Boolean){
                    symbol.setValue(expressionReturn);
                }else{
                    //TODO: error data type mismatch
                    symbol.setValue(false);
                    System.out.println("ERROR : datatype mismatch - Boolean not found");
                }
                break;
        }
        return symbol;
    }

    @Override
    public Object visitVar_dec_expr(NymtaxParser.Var_dec_exprContext ctx) {

        String dataType = ctx.list_var().getText();
        String id = ctx.IDENTIFIER().getText();
        Symbol var;
        var = new Symbol(id, dataType, false);

        scope_.declare(var);

        Object expression = ExecutionManager.getInstance().visit(ctx.expression());

        assignExpression(var, expression);

        scope_.initialize(id, var.getValue());

        return true;
    }

    @Override
    public Object visitVar_dec_ident(NymtaxParser.Var_dec_identContext ctx) {

        String dataType = ctx.list_var().getText();
        String id = ctx.IDENTIFIER(0).getText();
        Symbol var;
        var = new Symbol(id, dataType, false);

        scope_.declare(var);

        scope_.lookup(id);

        var.setValue(id);

        scope_.initialize(id, var.getValue());

        return true;
    }

    @Override
    public Object visitVar_dec_var(NymtaxParser.Var_dec_varContext ctx) {

        String dataType = ctx.list_var().getText();
        String id = ctx.IDENTIFIER().getText();
        Symbol var;
        var = new Symbol(id, dataType, false);

        scope_.declare(var);

        return true;
    }



    @Override
    public Object visitVar_dec_const(NymtaxParser.Var_dec_constContext ctx) {
        visitConst_declaration(ctx.const_declaration());
        return true;
    }

    @Override
    public Object visitVar_array_init(NymtaxParser.Var_array_initContext ctx) {
        //TODO: array initialization
        return super.visitVar_array_init(ctx);
    }
}
