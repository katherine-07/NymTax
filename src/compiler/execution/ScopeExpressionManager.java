package compiler.execution;

import antlr4.generate.NymtaxBaseVisitor;
import antlr4.generate.NymtaxParser;
import compiler.exceptions.VariableNotFoundException;
import compiler.objects.Function;
import compiler.objects.Scope;
import compiler.objects.Symbol;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;

public class ScopeExpressionManager extends NymtaxBaseVisitor {


    public ScopeExpressionManager(){
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
        Function scope_ = ExecutionManager.getInstance().getCurrentFunc();
        String datatype = ctx.data_type().getText();
        String id = ctx.IDENTIFIER().getText();
        String value = ctx.constant().getText();
        Symbol constant = new Symbol(id, datatype, false, false);
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
        Function scope_ = ExecutionManager.getInstance().getCurrentFunc();
        String dataType = ctx.func_with_send().data_type().getText();
        String id = ctx.func_with_send().function_call_stat().IDENTIFIER().getText();


        Function func = new Function(id, scope_, ctx.func_with_send().func_body(), dataType, false);

        NymtaxParser.List_parameterContext parameters = ctx.func_with_send().function_call_stat().list_parameter();
        if(parameters != null)
            for(int i=0; i<parameters.list_var().size(); i++){
                Boolean isArray = parameters.list_var(i).RBRACK() != null;

                func.addParameter(parameters.IDENTIFIER(i).getText(), parameters.list_var(i).getText(), isArray);
            }

        scope_.declare(func);

        return true;
    }

    @Override
    public Object visitFunc_dec_none(NymtaxParser.Func_dec_noneContext ctx) {
        Function scope_ = ExecutionManager.getInstance().getCurrentFunc();
        String dataType = "VOID";
        String id = ctx.func_without_send().function_call_stat().IDENTIFIER().getText();

        Function func = new Function(id, scope_, ctx.func_without_send().func_body(), dataType, false);


        NymtaxParser.List_parameterContext parameters = ctx.func_without_send().function_call_stat().list_parameter();

        if(parameters != null)
        for(int i=0; i<parameters.list_var().size(); i++){
            Symbol param = new Symbol(parameters.IDENTIFIER(i).getText(), parameters.list_var(i).getText(), true, false);
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
        Function scope_ = ExecutionManager.getInstance().getCurrentFunc();
        String id = ctx.IDENTIFIER().getText();
        String constant = ctx.constant().getText();

        Symbol var = scope_.lookup(id);

        if(var==null){
            //TODO: throw error variable not found;
            try {
                throw new VariableNotFoundException();
            } catch (VariableNotFoundException e) {
                e.printStackTrace();
            }
        }else{
            Symbol value = new Symbol("t", var.getDataType(),false, false );
            value = constantAssignment(value, constant);
            switch(ctx.op.getType()){
                case NymtaxParser.ASSIGN:
                    if(var.getDataType().equals(value.getDataType())) {
                        var.setValue(
                                value.getValue()
                        );
                    }else{
                        //TODO ERROR
                        System.out.println("ERROR: Datatype mismatch.");
                    }
                    break;
                case NymtaxParser.ADD_ASSIGN:
                    if(value.getDataType().equals(Symbol.TYPE_INT) && var.getDataType().equals(Symbol.TYPE_INT) ){
                        Integer a = (Integer) value.getValue();
                        Integer b = (Integer) var.getValue();

                        var.setValue(a+b);
                    }else if(value.getDataType().equals(Symbol.TYPE_FLO) && var.getDataType().equals(Symbol.TYPE_FLO) ){
                        Float a = (Float) value.getValue();
                        Float b = (Float) var.getValue();

                        var.setValue(a+b);
                    }else if(value.getDataType().equals(Symbol.TYPE_STRNG) && var.getDataType().equals(Symbol.TYPE_STRNG) ){
                        String a = (String) value.getValue();
                        String b = (String) var.getValue();

                        var.setValue(a+b);
                    }else if(value.getDataType().equals(Symbol.TYPE_CHR) && var.getDataType().equals(Symbol.TYPE_CHR) ){
                        Character a = (Character) value.getValue();
                        Character b = (Character) var.getValue();

                        var.setValue(a+b);
                    }else {
                        System.out.println("ERROR: Operation error");
                    }
                    break;
                case NymtaxParser.SUB_ASSIGN:
                    if(value.getDataType().equals(Symbol.TYPE_INT) && var.getDataType().equals(Symbol.TYPE_INT) ){
                        Integer a = (Integer) value.getValue();
                        Integer b = (Integer) var.getValue();

                        var.setValue(a-b);
                    }else if(value.getDataType().equals(Symbol.TYPE_FLO) && var.getDataType().equals(Symbol.TYPE_FLO) ){
                        Float a = (Float) value.getValue();
                        Float b = (Float) var.getValue();

                        var.setValue(a-b);
                    }else if(value.getDataType().equals(Symbol.TYPE_CHR) && var.getDataType().equals(Symbol.TYPE_CHR) ){
                        Character a = (Character) value.getValue();
                        Character b = (Character) var.getValue();

                        var.setValue(a-b);
                    }else {
                        System.out.println("ERROR: Operation error");
                    }
                    break;
                case NymtaxParser.MUL_ASSIGN:
                    if(value.getDataType().equals(Symbol.TYPE_INT) && var.getDataType().equals(Symbol.TYPE_INT) ){
                        Integer a = (Integer) value.getValue();
                        Integer b = (Integer) var.getValue();

                        var.setValue(a*b);
                    }else if(value.getDataType().equals(Symbol.TYPE_FLO) && var.getDataType().equals(Symbol.TYPE_FLO) ){
                        Float a = (Float) value.getValue();
                        Float b = (Float) var.getValue();

                        var.setValue(a*b);
                    }else if(value.getDataType().equals(Symbol.TYPE_CHR) && var.getDataType().equals(Symbol.TYPE_CHR) ){
                        Character a = (Character) value.getValue();
                        Character b = (Character) var.getValue();

                        var.setValue(a*b);
                    }else {
                        System.out.println("ERROR: Operation error");
                    }
                    break;
                case NymtaxParser.DIV_ASSIGN:
                    if(value.getDataType().equals(Symbol.TYPE_INT) && var.getDataType().equals(Symbol.TYPE_INT) ){
                        Integer a = (Integer) value.getValue();
                        Integer b = (Integer) var.getValue();

                        var.setValue(a/b);
                    }else if(value.getDataType().equals(Symbol.TYPE_FLO) && var.getDataType().equals(Symbol.TYPE_FLO) ){
                        Float a = (Float) value.getValue();
                        Float b = (Float) var.getValue();

                        var.setValue(a/b);
                    }else if(value.getDataType().equals(Symbol.TYPE_CHR) && var.getDataType().equals(Symbol.TYPE_CHR) ){
                        Character a = (Character) value.getValue();
                        Character b = (Character) var.getValue();

                        var.setValue(a/b);
                    }else {
                        System.out.println("ERROR: Operation error");
                    }
                    break;
                default:
                    System.out.println("ERROR: Unknown assignment operation");
            }


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
        Function scope_ = ExecutionManager.getInstance().getCurrentFunc();
        String id = ctx.IDENTIFIER().getText();

        Symbol var = scope_.lookup(id);

        if(var==null){
            //TODO: throw error variable not found;
            try {
                throw new VariableNotFoundException();
            } catch (VariableNotFoundException e) {
                e.printStackTrace();
            }
        }else{
            Object expression = ExecutionManager.getInstance().visit(ctx.expression());
            Symbol value = new Symbol("t", var.getDataType(),false, false );
            value.setValue(expression);
            switch(ctx.op.getType()){
                case NymtaxParser.ASSIGN:
                    if(var.getDataType().equals(value.getDataType())) {
                        var.setValue(
                                value.getValue()
                        );
                    }else{
                        //TODO ERROR
                        System.out.println("ERROR: Datatype mismatch.");
                    }
                    break;
                case NymtaxParser.ADD_ASSIGN:
                    if(value.getDataType().equals(Symbol.TYPE_INT) && var.getDataType().equals(Symbol.TYPE_INT) ){
                        Number a = (Number) value.getValue();
                        Number b = (Number) var.getValue();

                        var.setValue(a.intValue()+b.intValue());
                    }else if(value.getDataType().equals(Symbol.TYPE_FLO) && var.getDataType().equals(Symbol.TYPE_FLO) ){
                        Number a = (Number) value.getValue();
                        Number b = (Number) var.getValue();

                        var.setValue(a.floatValue()+b.floatValue());
                    }else if(value.getDataType().equals(Symbol.TYPE_STRNG) && var.getDataType().equals(Symbol.TYPE_STRNG) ){
                        String a = (String) value.getValue();
                        String b = (String) var.getValue();

                        var.setValue(a+b);
                    }else if(value.getDataType().equals(Symbol.TYPE_CHR) && var.getDataType().equals(Symbol.TYPE_CHR) ){
                        Character a = (Character) value.getValue();
                        Character b = (Character) var.getValue();

                        var.setValue(a+b);
                    }else {
                        System.out.println("ERROR: Operation error");
                    }
                    break;
                case NymtaxParser.SUB_ASSIGN:
                    if(value.getDataType().equals(Symbol.TYPE_INT) && var.getDataType().equals(Symbol.TYPE_INT) ){
                        Number a = (Number) value.getValue();
                        Number b = (Number) var.getValue();

                        var.setValue(a.intValue()-b.intValue());
                    }else if(value.getDataType().equals(Symbol.TYPE_FLO) && var.getDataType().equals(Symbol.TYPE_FLO) ){
                        Number a = (Number) value.getValue();
                        Number b = (Number) var.getValue();

                        var.setValue(a.floatValue()-b.floatValue());
                    }else if(value.getDataType().equals(Symbol.TYPE_CHR) && var.getDataType().equals(Symbol.TYPE_CHR) ){
                        Character a = (Character) value.getValue();
                        Character b = (Character) var.getValue();

                        var.setValue(a-b);
                    }else {
                        System.out.println("ERROR: Operation error");
                    }
                    break;
                case NymtaxParser.MUL_ASSIGN:
                    if(value.getDataType().equals(Symbol.TYPE_INT) && var.getDataType().equals(Symbol.TYPE_INT) ){
                        Number a = (Number) value.getValue();
                        Number b = (Number) var.getValue();

                        var.setValue(a.intValue()*b.intValue());
                    }else if(value.getDataType().equals(Symbol.TYPE_FLO) && var.getDataType().equals(Symbol.TYPE_FLO) ){
                        Number a = (Number) value.getValue();
                        Number b = (Number) var.getValue();

                        var.setValue(a.floatValue()*b.floatValue());
                    }else if(value.getDataType().equals(Symbol.TYPE_CHR) && var.getDataType().equals(Symbol.TYPE_CHR) ){
                        Character a = (Character) value.getValue();
                        Character b = (Character) var.getValue();

                        var.setValue(a*b);
                    }else {
                        System.out.println("ERROR: Operation error");
                    }
                    break;
                case NymtaxParser.DIV_ASSIGN:
                    if(value.getDataType().equals(Symbol.TYPE_INT) && var.getDataType().equals(Symbol.TYPE_INT) ){
                        Number a = (Number) value.getValue();
                        Number b = (Number) var.getValue();

                        var.setValue(a.intValue()/b.intValue());
                    }else if(value.getDataType().equals(Symbol.TYPE_FLO) && var.getDataType().equals(Symbol.TYPE_FLO) ){
                        Number a = (Number) value.getValue();
                        Number b = (Number) var.getValue();

                        var.setValue(a.floatValue()/b.floatValue());
                    }else if(value.getDataType().equals(Symbol.TYPE_CHR) && var.getDataType().equals(Symbol.TYPE_CHR) ){
                        Character a = (Character) value.getValue();
                        Character b = (Character) var.getValue();

                        var.setValue(a/b);
                    }else {
                        System.out.println("ERROR: Operation error");
                    }
                    break;
                default:
                    System.out.println("ERROR: Unknown assignment operation");
            }


        }

        return true;
    }

    public Object assignExpression(Symbol symbol, Object expressionReturn ){

        switch(symbol.getDataType()){
            case Symbol.TYPE_INT:
                if(expressionReturn instanceof  Float){
                    Float ex = (Float) expressionReturn;
                    int a = ex.intValue();
                    return a;
                }else if (expressionReturn instanceof  Integer) {
                    return expressionReturn;
                }else{
                    System.out.println("ERROR : datatype mismatch - Integer not found");
                    return 0;
                }
            case Symbol.TYPE_FLO:
                if(expressionReturn instanceof  Float){
                    return expressionReturn;
                } else {
                    //TODO: error data type mismatch
                    System.out.println("ERROR : datatype mismatch - Float not found");
                    return 0.0;
                }
            case Symbol.TYPE_CHR:
                if(expressionReturn instanceof Character){
                    return expressionReturn;
                }else{
                    //TODO: error data type mismatch

                    System.out.println("ERROR : datatype mismatch - Char not found");
                    return '0';
                }
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
                    return expressionReturn;
                }else{
                    //TODO: error data type mismatch
                    System.out.println("ERROR : datatype mismatch - Boolean not found");
                    return false;
                }
        }
        return null;
    }

    @Override
    public Object visitVar_dec_expr(NymtaxParser.Var_dec_exprContext ctx) {
        Function scope_ = ExecutionManager.getInstance().getCurrentFunc();

        String dataType = ctx.data_type().getText();
        String id = ctx.IDENTIFIER().getText();
        Symbol var;
        var = new Symbol(id, dataType, false, false);

        scope_.declare(var);

        Object expression = ExecutionManager.getInstance().visit(ctx.expression());

        Symbol value = new Symbol("value", dataType, false, false);
        value.setValue(assignExpression(var, expression));


        switch(ctx.op.getType()){
            case NymtaxParser.ASSIGN:
                if(var.getDataType().equals(value.getDataType())) {
                    var.setValue(
                            value.getValue()
                    );
                }else{
                    //TODO ERROR
                    System.out.println("ERROR: Datatype mismatch.");
                }
                break;
            case NymtaxParser.ADD_ASSIGN:
                if(value.getDataType().equals(Symbol.TYPE_INT) && var.getDataType().equals(Symbol.TYPE_INT) ){
                    Integer a = (Integer) value.getValue();
                    Integer b = (Integer) var.getValue();

                    var.setValue(a+b);
                }else if(value.getDataType().equals(Symbol.TYPE_FLO) && var.getDataType().equals(Symbol.TYPE_FLO) ){
                    Float a = (Float) value.getValue();
                    Float b = (Float) var.getValue();

                    var.setValue(a+b);
                }else if(value.getDataType().equals(Symbol.TYPE_STRNG) && var.getDataType().equals(Symbol.TYPE_STRNG) ){
                    String a = (String) value.getValue();
                    String b = (String) var.getValue();

                    var.setValue(a+b);
                }else if(value.getDataType().equals(Symbol.TYPE_CHR) && var.getDataType().equals(Symbol.TYPE_CHR) ){
                    Character a = (Character) value.getValue();
                    Character b = (Character) var.getValue();

                    var.setValue(a+b);
                }else {
                    System.out.println("ERROR: Operation error");
                }
                break;
            case NymtaxParser.SUB_ASSIGN:
                if(value.getDataType().equals(Symbol.TYPE_INT) && var.getDataType().equals(Symbol.TYPE_INT) ){
                    Integer a = (Integer) value.getValue();
                    Integer b = (Integer) var.getValue();

                    var.setValue(a-b);
                }else if(value.getDataType().equals(Symbol.TYPE_FLO) && var.getDataType().equals(Symbol.TYPE_FLO) ){
                    Float a = (Float) value.getValue();
                    Float b = (Float) var.getValue();

                    var.setValue(a-b);
                }else if(value.getDataType().equals(Symbol.TYPE_CHR) && var.getDataType().equals(Symbol.TYPE_CHR) ){
                    Character a = (Character) value.getValue();
                    Character b = (Character) var.getValue();

                    var.setValue(a-b);
                }else {
                    System.out.println("ERROR: Operation error");
                }
                break;
            case NymtaxParser.MUL_ASSIGN:
                if(value.getDataType().equals(Symbol.TYPE_INT) && var.getDataType().equals(Symbol.TYPE_INT) ){
                    Integer a = (Integer) value.getValue();
                    Integer b = (Integer) var.getValue();

                    var.setValue(a*b);
                }else if(value.getDataType().equals(Symbol.TYPE_FLO) && var.getDataType().equals(Symbol.TYPE_FLO) ){
                    Float a = (Float) value.getValue();
                    Float b = (Float) var.getValue();

                    var.setValue(a*b);
                }else if(value.getDataType().equals(Symbol.TYPE_CHR) && var.getDataType().equals(Symbol.TYPE_CHR) ){
                    Character a = (Character) value.getValue();
                    Character b = (Character) var.getValue();

                    var.setValue(a*b);
                }else {
                    System.out.println("ERROR: Operation error");
                }
                break;
            case NymtaxParser.DIV_ASSIGN:
                if(value.getDataType().equals(Symbol.TYPE_INT) && var.getDataType().equals(Symbol.TYPE_INT) ){
                    Integer a = (Integer) value.getValue();
                    Integer b = (Integer) var.getValue();

                    var.setValue(a/b);
                }else if(value.getDataType().equals(Symbol.TYPE_FLO) && var.getDataType().equals(Symbol.TYPE_FLO) ){
                    Float a = (Float) value.getValue();
                    Float b = (Float) var.getValue();

                    var.setValue(a/b);
                }else if(value.getDataType().equals(Symbol.TYPE_CHR) && var.getDataType().equals(Symbol.TYPE_CHR) ){
                    Character a = (Character) value.getValue();
                    Character b = (Character) var.getValue();

                    var.setValue(a/b);
                }else {
                    System.out.println("ERROR: Operation error");
                }
                break;
            default:
                System.out.println("ERROR: Unknown assignment operation");
        }

        scope_.initialize(id, var.getValue());

        return true;
    }

    @Override
    public Object visitVar_dec_ident(NymtaxParser.Var_dec_identContext ctx) {
        Function scope_ = ExecutionManager.getInstance().getCurrentFunc();

        String dataType = ctx.data_type().getText();
        String id = ctx.IDENTIFIER(0).getText();
        Symbol var;


        var = new Symbol(id, dataType, false, false);

        scope_.declare(var);

        Symbol value = scope_.lookup(id);

        switch(ctx.op.getType()){
            case NymtaxParser.ASSIGN:
                if(var.getDataType().equals(value.getDataType())) {
                    var.setValue(
                            value.getValue()
                    );
                }else{
                    //TODO ERROR
                    System.out.println("ERROR: Datatype mismatch.");
                }
                break;
            case NymtaxParser.ADD_ASSIGN:
                if(value.getDataType().equals(Symbol.TYPE_INT) && var.getDataType().equals(Symbol.TYPE_INT) ){
                    Integer a = (Integer) value.getValue();
                    Integer b = (Integer) var.getValue();

                    var.setValue(a+b);
                }else if(value.getDataType().equals(Symbol.TYPE_FLO) && var.getDataType().equals(Symbol.TYPE_FLO) ){
                    Float a = (Float) value.getValue();
                    Float b = (Float) var.getValue();

                    var.setValue(a+b);
                }else if(value.getDataType().equals(Symbol.TYPE_STRNG) && var.getDataType().equals(Symbol.TYPE_STRNG) ){
                    String a = (String) value.getValue();
                    String b = (String) var.getValue();

                    var.setValue(a+b);
                }else if(value.getDataType().equals(Symbol.TYPE_CHR) && var.getDataType().equals(Symbol.TYPE_CHR) ){
                    Character a = (Character) value.getValue();
                    Character b = (Character) var.getValue();

                    var.setValue(a+b);
                }else {
                    System.out.println("ERROR: Operation error");
                }
                break;
            case NymtaxParser.SUB_ASSIGN:
                if(value.getDataType().equals(Symbol.TYPE_INT) && var.getDataType().equals(Symbol.TYPE_INT) ){
                    Integer a = (Integer) value.getValue();
                    Integer b = (Integer) var.getValue();

                    var.setValue(a-b);
                }else if(value.getDataType().equals(Symbol.TYPE_FLO) && var.getDataType().equals(Symbol.TYPE_FLO) ){
                    Float a = (Float) value.getValue();
                    Float b = (Float) var.getValue();

                    var.setValue(a-b);
                }else if(value.getDataType().equals(Symbol.TYPE_CHR) && var.getDataType().equals(Symbol.TYPE_CHR) ){
                    Character a = (Character) value.getValue();
                    Character b = (Character) var.getValue();

                    var.setValue(a-b);
                }else {
                    System.out.println("ERROR: Operation error");
                }
                break;
            case NymtaxParser.MUL_ASSIGN:
                if(value.getDataType().equals(Symbol.TYPE_INT) && var.getDataType().equals(Symbol.TYPE_INT) ){
                    Integer a = (Integer) value.getValue();
                    Integer b = (Integer) var.getValue();

                    var.setValue(a*b);
                }else if(value.getDataType().equals(Symbol.TYPE_FLO) && var.getDataType().equals(Symbol.TYPE_FLO) ){
                    Float a = (Float) value.getValue();
                    Float b = (Float) var.getValue();

                    var.setValue(a*b);
                }else if(value.getDataType().equals(Symbol.TYPE_CHR) && var.getDataType().equals(Symbol.TYPE_CHR) ){
                    Character a = (Character) value.getValue();
                    Character b = (Character) var.getValue();

                    var.setValue(a*b);
                }else {
                    System.out.println("ERROR: Operation error");
                }
                break;
            case NymtaxParser.DIV_ASSIGN:
                if(value.getDataType().equals(Symbol.TYPE_INT) && var.getDataType().equals(Symbol.TYPE_INT) ){
                    Integer a = (Integer) value.getValue();
                    Integer b = (Integer) var.getValue();

                    var.setValue(a/b);
                }else if(value.getDataType().equals(Symbol.TYPE_FLO) && var.getDataType().equals(Symbol.TYPE_FLO) ){
                    Float a = (Float) value.getValue();
                    Float b = (Float) var.getValue();

                    var.setValue(a/b);
                }else if(value.getDataType().equals(Symbol.TYPE_CHR) && var.getDataType().equals(Symbol.TYPE_CHR) ){
                    Character a = (Character) value.getValue();
                    Character b = (Character) var.getValue();

                    var.setValue(a/b);
                }else {
                    System.out.println("ERROR: Operation error");
                }
                break;
            default:
                System.out.println("ERROR: Unknown assignment operation");
        }

        scope_.initialize(id, var.getValue());

        return true;
    }


    @Override
    public Object visitVar_dec_var(NymtaxParser.Var_dec_varContext ctx) {
        Function scope_ = ExecutionManager.getInstance().getCurrentFunc();

        String dataType = ctx.data_type().getText();
        String id = ctx.IDENTIFIER().getText();
        Symbol var;
        var = new Symbol(id, dataType, false, false);

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
        return visit(ctx.array_initialization());
    }

    @Override
    public Object visitArray_initialization(NymtaxParser.Array_initializationContext ctx) {
        String id = ctx.IDENTIFIER().getText();
        Symbol symbol = new Symbol(id, ctx.data_type(0).getText(),false, true );
        int i = Integer.parseInt(ctx.NUMBER().getText());
        symbol.setArraySize(i);
        ExecutionManager.getInstance().getCurrentFunc().declare(symbol);
        return true;
    }

    @Override
    public Object visitArray_assign(NymtaxParser.Array_assignContext ctx) {
        String id = ctx.array_call().IDENTIFIER().getText();
        int index = Integer.parseInt(ctx.array_call().NUMBER().getText());

        Symbol symbol = ExecutionManager.getInstance().getCurrentFunc().lookup(id);
        Object value;

        if(symbol.isArray() && symbol.getArraySize() > index){
            value = assignExpression(
                    symbol,
                    ExecutionManager.getInstance().visit(ctx.expression())
            );
            ArrayList a = (ArrayList) symbol.getValue();
            a.set(index, value);
        }


        return super.visitArray_assign(ctx);
    }

    @Override
    public Object visitVisit_array_call(NymtaxParser.Visit_array_callContext ctx) {
        return visit(ctx.array_call());
    }

    @Override
    public Object visitArray_call(NymtaxParser.Array_callContext ctx) {
        Object value = null;

        String id = ctx.IDENTIFIER().getText();
        int i = Integer.parseInt(ctx.NUMBER().getText());

        Symbol symbol = ExecutionManager.getInstance().getCurrentFunc().lookup(id);

        if(symbol.isArray() && symbol.getArraySize() > i){
            value = ((ArrayList)symbol.getValue()).get(i);
        }

        return value;
    }
}
