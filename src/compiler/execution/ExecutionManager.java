package compiler.execution;

import antlr4.generate.NymtaxBaseVisitor;
import antlr4.generate.NymtaxParser;
import antlr4.generate.NymtaxParser.StatementContext;
import compiler.objects.Function;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExecutionManager extends NymtaxBaseVisitor{
    private HashMap<String, Function> globalFunctions;
    private Function mainFunction;
    private Function currentFunc;
    private ScopeExpressionManager scopeExpressionManager;

    public ExecutionManager(){
        mainFunction = new Function("RUN MAIN", null, null, "VOID");
        globalFunctions = new HashMap<String, Function>();
        currentFunc = mainFunction;

        scopeExpressionManager = new ScopeExpressionManager(currentFunc);
    }

    @Override
    public Object visitProgram(NymtaxParser.ProgramContext ctx) {
        NymtaxParser.List_constantsContext listConstants = ctx.list_constants();
        NymtaxParser.List_func_declarationContext listFuncDec = ctx.list_func_declaration();

        scopeExpressionManager.setScope_(currentFunc);

        scopeExpressionManager.visit(listConstants);
        scopeExpressionManager.visit(listFuncDec);

        currentFunc = scopeExpressionManager.getScope_();

        visit(ctx.func_main().func_body());

        return super.visitProgram(ctx);
    }

    @Override
    public Object visitFunc_body(NymtaxParser.Func_bodyContext ctx) {
        List<StatementContext> statements = ctx.list_statement().statement();

        for(int i=0; i<statements.size(); i++){
            visit(statements.get(i));
        }

        return super.visitFunc_body(ctx);
    }

    @Override
    public Object visitStatement_var_dec(NymtaxParser.Statement_var_decContext ctx) {
        scopeExpressionManager.setScope_(currentFunc);
        return scopeExpressionManager.visit(ctx.var_declaration());
    }

    @Override
    public Object visitStatement_assign(NymtaxParser.Statement_assignContext ctx) {
        scopeExpressionManager.setScope_(currentFunc);
        return scopeExpressionManager.visit(ctx.assign());
    }

    @Override
    public Object visitFunction_call_stat(NymtaxParser.Function_call_statContext ctx) {
        String id = ctx.IDENTIFIER().getText();

        Function func = currentFunc.localLookupFunc(id);

        List<Object> paramValues = new ArrayList<>();
        List<TerminalNode> params = ctx.list_parameter().IDENTIFIER();

        for(int i=0; i<params.size(); i++){
            Object val = currentFunc.lookup(params.get(i).getText()).getValue();
            paramValues.add(val);
        }

        currentFunc = func;
        currentFunc.initializeParameter(paramValues);

        return visit(currentFunc.getContex());
    }

    @Override
    public Object visitStatement_when(NymtaxParser.Statement_whenContext ctx) {
        return super.visitStatement_when(ctx);
    }
}
