package antlr4.custom;

import antlr4.generate.NymtaxBaseListener;
import antlr4.generate.NymtaxBaseVisitor;
import antlr4.generate.NymtaxParser;

import java.util.Stack;

public class VariableListener extends NymtaxBaseListener {

    private Stack<Scope> scopes;

    public VariableListener() {
        scopes = new Stack<Scope>();
        scopes.push(new Scope(null));
    }

    @Override
    public void enterConst_declaration(NymtaxParser.Const_declarationContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        Scope scope = scopes.peek();

        if(checkVarName(varName)){
            System.out.println("ERROR variable "+varName+" exists.");

        }else{
            scope.add(varName);
            System.out.println("Added variable "+varName);

        }
    }

    @Override
    public void enterVar_declaration(NymtaxParser.Var_declarationContext ctx){
        if(ctx.const_declaration() == null) {
            String varName = ctx.IDENTIFIER(0).getText();
            Scope scope = scopes.peek();

            if (checkVarName(varName)) {
                System.out.println("ERROR variable " + varName + " exists.");

            } else {
                scope.add(varName);
                System.out.println("Added variable " + varName);

            }
        }
    }
    @Override public void enterFunc_main(NymtaxParser.Func_mainContext ctx) {
        scopes.push(new Scope(scopes.peek()));

    }
    @Override
    public void enterFunc_declaration(NymtaxParser.Func_declarationContext ctx) {
        scopes.push(new Scope(scopes.peek()));
    }


    @Override
    public void exitFunc_declaration(NymtaxParser.Func_declarationContext ctx) {
        scopes.pop();
    }

    private boolean checkVarName(String varName) {
        Scope scope = scopes.peek();
        if(scope.inScope(varName)) {
            return true;
        }
        else {
            return false;
        }
    }
}
