package compiler.execution;

import antlr4.generate.NymtaxBaseVisitor;
import antlr4.generate.NymtaxParser;
import antlr4.generate.NymtaxParser.StatementContext;
import compiler.objects.Function;
import compiler.objects.Symbol;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExecutionManager extends NymtaxBaseVisitor{

    private static ExecutionManager instance = null;

    private HashMap<String, Function> globalFunctions;
    private Function mainFunction;

    public Function getCurrentFunc() {
        return currentFunc;
    }

    public void setCurrentFunc(Function currentFunc) {
        this.currentFunc = currentFunc;
    }

    private Function currentFunc;
    private ScopeExpressionManager scopeExpressionManager;
    private BooleanExpression booleanExpression;
    private NumericalExpression numericalExpression;

    private ExecutionManager(){
        mainFunction = new Function("RUN MAIN", null, null, "VOID");
        globalFunctions = new HashMap<String, Function>();
        currentFunc = mainFunction;

        scopeExpressionManager = new ScopeExpressionManager(currentFunc);
        booleanExpression = new BooleanExpression(currentFunc);
        numericalExpression = new NumericalExpression();
    }

    public static ExecutionManager getInstance() {
        if(instance==null){
            instance = new ExecutionManager();
        }

        return instance;
    }

    @Override
    public Object visitProgram(NymtaxParser.ProgramContext ctx) {
        NymtaxParser.List_constantsContext listConstants = ctx.list_constants();
        NymtaxParser.List_func_declarationContext listFuncDec = ctx.list_func_declaration();

        scopeExpressionManager.setScope_(currentFunc);

        if(listConstants != null) {
            scopeExpressionManager.visit(listConstants);
        }

        if(listFuncDec != null) {
            scopeExpressionManager.visit(listFuncDec);
        }

        currentFunc = scopeExpressionManager.getScope_();

        visit(ctx.func_main().func_body());

        //TODO
        return true;
    }

    @Override
    public Object visitFunc_body(NymtaxParser.Func_bodyContext ctx) {
        visit(ctx.list_statement());

        return true;
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
        scopeExpressionManager.setScope_(currentFunc);
        scopeExpressionManager.visit(ctx.var_declaration());
        return null;
    }

    @Override
    public Object visitStatement_assign(NymtaxParser.Statement_assignContext ctx) {
        scopeExpressionManager.setScope_(currentFunc);
        scopeExpressionManager.visit(ctx.assign());
        return true;
    }

    @Override
    public Object visitFunction_call_stat(NymtaxParser.Function_call_statContext ctx) {
        String id = ctx.IDENTIFIER().getText();

        Function func = currentFunc.localLookupFunc(id);

        List<Object> paramValues = new ArrayList<>();
        List<TerminalNode> params = new ArrayList<>();

        if(ctx.list_parameter() != null){
            params = ctx.list_parameter().IDENTIFIER();
        }

        for(int i=0; i<params.size(); i++){
            Object val = currentFunc.lookup(params.get(i).getText()).getValue();
            paramValues.add(val);
        }

        currentFunc = func;

        if(ctx.list_parameter() != null) {
            currentFunc.initializeParameter(paramValues);
        }
        return visit(currentFunc.getContex());
    }

    @Override
    public Object visitStatement_when(NymtaxParser.Statement_whenContext ctx) {
        return super.visitStatement_when(ctx);
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
        for (ParseTree t: tree
                ) {
            char[] a = t.getText().toCharArray();
            if(a.length>0 && a[0]=='\"' && a[a.length-1]=='\"'){
                if(a.length>2){
                    for(int i=1; i<a.length-1; i++){
                        System.out.print(a[i]);
                    }
                }
            }else if(currentFunc.isDeclared(t.getText())){
                Symbol s = currentFunc.lookup(t.getText());
                System.out.print(s.getValue());
            }else{
                //TODO: Error - variable not found exception
            }
        }

        System.out.println();
        return true;
    }

    @Override
    public Object visitVisit_boolexpr(NymtaxParser.Visit_boolexprContext ctx) {
        booleanExpression.setScope_(currentFunc);
        return booleanExpression.visit(ctx.boolean_expression());
    }

    @Override
    public Object visitVisit_numexpr(NymtaxParser.Visit_numexprContext ctx) {
        return numericalExpression.visit(ctx.numerical_expression());
    }
}
