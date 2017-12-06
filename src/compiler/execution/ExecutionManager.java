package compiler.execution;

import antlr4.generate.NymtaxBaseVisitor;
import antlr4.generate.NymtaxParser;
import antlr4.generate.NymtaxParser.StatementContext;
import compiler.exceptions.VariableNotFoundException;
import compiler.objects.Function;
import compiler.objects.Symbol;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ExecutionManager extends NymtaxBaseVisitor{

    private static ExecutionManager instance = null;

    private HashMap<String, Function> globalFunctions;
    private Function mainFunction;

    private Function currentFunc=null;
    private ScopeExpressionManager scopeExpressionManager;
    private BooleanExpression booleanExpression;
    private NumericalExpression numericalExpression;
    private StringExpression stringExpression;
    private ConditionalExpression conditionalExpression;
    Scanner s = new Scanner(System.in);

    private ExecutionManager(){
        scopeExpressionManager = new ScopeExpressionManager();
        booleanExpression = new BooleanExpression();
        numericalExpression = new NumericalExpression();
        conditionalExpression = new ConditionalExpression();
        stringExpression = new StringExpression();
        newProgram();
    }

    public void newProgram(){
        mainFunction = new Function("ROOT", null, null, "VOID", false);
        globalFunctions = new HashMap<String, Function>();
        currentFunc = mainFunction;
    }
    public static ExecutionManager getInstance() {

        if(instance==null){
            instance = new ExecutionManager();
        }

        return instance;
    }

    public Function getCurrentFunc() {
        return currentFunc;
    }

    public void setCurrentFunc(Function currentFunc) {
        this.currentFunc = currentFunc;
    }

    @Override
    public Object visitProgram(NymtaxParser.ProgramContext ctx) {
        NymtaxParser.List_constantsContext listConstants = ctx.list_constants();
        NymtaxParser.List_func_declarationContext listFuncDec = ctx.list_func_declaration();


        if(listConstants != null) {
            scopeExpressionManager.visit(listConstants);
        }

        if(listFuncDec != null) {
            scopeExpressionManager.visit(listFuncDec);
        }


        currentFunc = new Function("RUN MAIN", mainFunction, ctx.func_main().func_body(), "VOID", false);
        visit(ctx.func_main().func_body());

        //TODO
        return true;
    }

    @Override
    public Object visitFunc_body(NymtaxParser.Func_bodyContext ctx) {
        visit(ctx.list_statement());

        return currentFunc.getSendSymbol().getValue();
    }

    @Override
    public Object visitList_statement(NymtaxParser.List_statementContext ctx) {
        List<StatementContext> statements = ctx.statement();

        for(int i=0; i<statements.size(); i++){
            visit(statements.get(i));
        }
        return true;
    }

    @Override
    public Object visitStatement_var_dec(NymtaxParser.Statement_var_decContext ctx) {
        scopeExpressionManager.visit(ctx.var_declaration());
        return null;
    }

    @Override
    public Object visitStatement_assign(NymtaxParser.Statement_assignContext ctx) {
        scopeExpressionManager.visit(ctx.assign());
        return true;
    }

    @Override
    public Object visitStatement_send(NymtaxParser.Statement_sendContext ctx) {
        visit(ctx.send_statement());
        return currentFunc.getSendSymbol();
    }

    @Override
    public Object visitSend_const(NymtaxParser.Send_constContext ctx) {
        String constant = ctx.constant().getText();
        Symbol symbol = currentFunc.getSendSymbol();
        symbol = scopeExpressionManager.constantAssignment(symbol, constant);
        currentFunc.setSendSymbol(symbol);
        return symbol.getValue();
    }

    @Override
    public Object visitVisit_stringexpr(NymtaxParser.Visit_stringexprContext ctx) {
        return stringExpression.visit(ctx.string_expression());
    }

    @Override
    public Object visitSend_variable(NymtaxParser.Send_variableContext ctx) {
        Symbol symbol = currentFunc.getSendSymbol();
        String id = ctx.IDENTIFIER().getText();
        Symbol send = currentFunc.lookup(id);

        if(send.getDataType().equals(currentFunc.getSendType())) {
            symbol.setValue(send.getValue());
        }else{
            symbol.setValue(null);
            //TODO: error mismatch datatype

            System.out.println("ERROR: SEND datatype mismatch - "+currentFunc.getSendSymbol()+" not found.");
        }

        currentFunc.setSendSymbol(symbol);
        return symbol.getValue();
    }

    @Override
    public Object visitSend_expr(NymtaxParser.Send_exprContext ctx) {
        Object expression = visit(ctx.expression());

        Symbol symbol = currentFunc.getSendSymbol();

        symbol.setValue(scopeExpressionManager.assignExpression(symbol, expression));
        currentFunc.setSendSymbol(symbol);
        return symbol.getValue();
    }

    @Override
    public Object visitStatement_func_call(NymtaxParser.Statement_func_callContext ctx) {

        Object send = visit(ctx.function_call_stat());

        return send;
    }

    @Override
    public Object visitFunction_call_stat(NymtaxParser.Function_call_statContext ctx) {
        String id = ctx.IDENTIFIER().getText();

        Function func = currentFunc.lookupFunc(id);

        List<Object> paramValues = new ArrayList<>();
        List<TerminalNode> params = new ArrayList<>();

        if(ctx.list_parameter() != null){
            params = ctx.list_parameter().IDENTIFIER();
        }

        for(int i=0; i<params.size(); i++){
            Object val = currentFunc.lookup(params.get(i).getText()).getValue();
            paramValues.add(val);
        }

        currentFunc = new Function(func.getIdentifier(), currentFunc, func.getContex(), func.getSendType(), func.getSendSymbol().isArray());

        if(ctx.list_parameter() != null) {
            currentFunc.initializeParameter(paramValues);
        }
         visit(currentFunc.getContex());
        Object sendValue = currentFunc.getSendSymbol().getValue();
        currentFunc = currentFunc.getParentScope();
        return sendValue;
    }

    @Override
    public Object visitStatement_getArrLen(NymtaxParser.Statement_getArrLenContext ctx) {
        return visit(ctx.array_length());
    }

    @Override
    public Integer visitArray_length(NymtaxParser.Array_lengthContext ctx) {
        Integer length = 0;

        String id = ctx.IDENTIFIER().getText();

        Symbol a = currentFunc.lookup(id);
        if(a.isArray()){
            length = a.getArraySize();
        }

        return length;
    }

    @Override
    public Object visitStatement_when(NymtaxParser.Statement_whenContext ctx) {
        return conditionalExpression.visit(ctx.when_statement());
    }

    @Override
    public Object visitStatement_write(NymtaxParser.Statement_writeContext ctx) {
        visit(ctx.write_statement());
        return true;
    }

    @Override
    public Object visitWrite_statement(NymtaxParser.Write_statementContext ctx) {

        List<ParseTree> tree = ctx.write_list().children;
        System.out.print("CONSOLE: ");
        int j = 0;
        for (ParseTree t: tree
                ) {
            char[] a = t.getText().toCharArray();

            if(a.length>0 && a[0]=='\"' && a[a.length-1]=='\"'){
                if(a.length>2){
                    for(int i=1; i<a.length-1; i++){
                        System.out.print(a[i]);
                    }
                }

            // Array
            }else if(a.length >= 4 && a[1] == '['){

                System.out.print(visit(ctx.write_list().expression(j)));
                j++ ;
            }else if(currentFunc.isDeclared(t.getText())){
                Symbol s = currentFunc.lookup(t.getText());
                System.out.print(s.getValue());
            }else{

                System.out.print(visit(ctx.write_list().expression(j)));
                j++ ;
            }
        }

        System.out.println();
        return true;
    }

    @Override
    public Object visitStatement_read(NymtaxParser.Statement_readContext ctx) {
        return visit(ctx.read_statement());
    }

    @Override
    public Object visitStatement_loop_throughout(NymtaxParser.Statement_loop_throughoutContext ctx) {
        return conditionalExpression.visit(ctx);
    }

    @Override
    public Object visitStatement_loop_doThroughout(NymtaxParser.Statement_loop_doThroughoutContext ctx) {
        return conditionalExpression.visit(ctx);
    }

    @Override
    public Object visitStatement_loop_every(NymtaxParser.Statement_loop_everyContext ctx) {
        return conditionalExpression.visit(ctx);
    }

    @Override
    public Object visitRead_statement(NymtaxParser.Read_statementContext ctx) {
        int type = ctx.input.getType();
        String id = ctx.IDENTIFIER().getText();
        Symbol symbol = currentFunc.lookup(id);
        System.out.print("CONSOLE: ");
        if(symbol!=null) {
            switch (type) {
                case NymtaxParser.INT:
                    symbol.setValue(s.nextInt());
                    s.nextLine();
                    break;
                case NymtaxParser.FLO:
                    symbol.setValue(s.nextFloat());
                    s.nextLine();
                    break;
                case NymtaxParser.STRNG:
                    symbol.setValue(s.next());
                    s.nextLine();
                    break;

            }
        }else{
            System.out.println("ERROR: Variable not found in read statement");
        }

        return symbol.getValue();
    }

    @Override
    public Object visitVisit_array_call(NymtaxParser.Visit_array_callContext ctx) {
        return scopeExpressionManager.visit(ctx);
    }

    @Override
    public Object visitStatement_arrAssign(NymtaxParser.Statement_arrAssignContext ctx) {
        return scopeExpressionManager.visit(ctx.array_assign());
    }

    @Override
    public Object visitVisit_boolexpr(NymtaxParser.Visit_boolexprContext ctx) {
        return booleanExpression.visit(ctx.boolean_expression());
    }

    @Override
    public Object visitVisit_numexpr(NymtaxParser.Visit_numexprContext ctx) {
        return numericalExpression.visit(ctx.numerical_expression());
    }
}
