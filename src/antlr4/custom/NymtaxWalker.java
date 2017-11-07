package antlr4.custom;

import antlr4.generate.NymtaxBaseListener;
import antlr4.generate.NymtaxParser;
import compiler.objects.Function;
import compiler.objects.Scope;
import compiler.objects.Symbol;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class NymtaxWalker extends NymtaxBaseListener {


    private HashMap<String, Function> globalFunctions;
    private Function mainFunction;
    private Function currentFunc;

    public NymtaxWalker(){
        mainFunction = new Function("RUN MAIN", null, null);
        globalFunctions = new HashMap<String, Function>();
        currentFunc = mainFunction;
    }

    @Override public void enterVar_declaration(NymtaxParser.Var_declarationContext ctx) {
        if(ctx.const_declaration() == null) {
            String varName = ctx.IDENTIFIER(0).getText();

            if (currentFunc.isDeclared(varName)) {
                //TODO: ERROR variable already exists exception

            } else {
                Symbol newSymbol = new Symbol(varName, ctx.list_var().data_type().getText(), true);
                currentFunc.declare(newSymbol);
                if (ctx.IDENTIFIER(1) != null) {
                    if(currentFunc.isDeclared(ctx.IDENTIFIER(1).getText())) {
                        currentFunc.initialize(newSymbol, currentFunc.lookup(ctx.IDENTIFIER(1).getText()).getValue());
                    }
                    else{
                        //TODO: ERROR no such variable exists exception
                    }
                }

            }
        }
    }

    @Override public void exitVar_declaration(NymtaxParser.Var_declarationContext ctx) { }

    @Override public void enterConst_declaration(NymtaxParser.Const_declarationContext ctx) {
        String varName = ctx.IDENTIFIER().getText();

        if(currentFunc.isDeclared(varName)){
            //TODO: ERROR variable already exists exception

        }else{
            Symbol newSymbol = new Symbol(varName, ctx.list_var().data_type().getText(), true);
            currentFunc.declare(newSymbol);
            if(ctx.constant() != null){
                currentFunc.initialize(newSymbol, ctx.constant().getText());
            }

        }
    }

    @Override public void exitConst_declaration(NymtaxParser.Const_declarationContext ctx) { }

    @Override public void enterFunction_call_stat(NymtaxParser.Function_call_statContext ctx) {
        String funcName = ctx.IDENTIFIER().getText();
        if(globalFunctions.containsKey(funcName)){
            //change current function
            currentFunc = globalFunctions.get(funcName);
        }else{
            //TODO: ERROR function not found exception
        }
    }

    @Override public void exitFunction_call_stat(NymtaxParser.Function_call_statContext ctx) {
        //resolve function content
    }

    @Override public void enterSend_statement(NymtaxParser.Send_statementContext ctx) { }

    @Override public void exitSend_statement(NymtaxParser.Send_statementContext ctx) { }

    @Override public void enterWrite_statement(NymtaxParser.Write_statementContext ctx) { }

    @Override public void exitWrite_statement(NymtaxParser.Write_statementContext ctx) {
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
                System.out.print(s.getValue().toString());
            }else{
                //TODO: Error - variable not found exception
            }
        }


    }

    @Override public void enterRead_statement(NymtaxParser.Read_statementContext ctx) { }

    @Override public void exitRead_statement(NymtaxParser.Read_statementContext ctx) { }

    @Override public void enterWhen_statement(NymtaxParser.When_statementContext ctx) { }

    @Override public void exitWhen_statement(NymtaxParser.When_statementContext ctx) { }

    @Override public void enterOtherwise_when_statement(NymtaxParser.Otherwise_when_statementContext ctx) { }

    @Override public void exitOtherwise_when_statement(NymtaxParser.Otherwise_when_statementContext ctx) { }

    @Override public void enterCondition_statement(NymtaxParser.Condition_statementContext ctx) { }

    @Override public void exitCondition_statement(NymtaxParser.Condition_statementContext ctx) { }

    @Override public void enterLoop_every_statement(NymtaxParser.Loop_every_statementContext ctx) { }

    @Override public void exitLoop_every_statement(NymtaxParser.Loop_every_statementContext ctx) { }

    @Override public void enterLoop_throughout_statement(NymtaxParser.Loop_throughout_statementContext ctx) { }

    @Override public void exitLoop_throughout_statement(NymtaxParser.Loop_throughout_statementContext ctx) { }

    @Override public void enterLoop_do_throughout_statement(NymtaxParser.Loop_do_throughout_statementContext ctx) { }

    @Override public void exitLoop_do_throughout_statement(NymtaxParser.Loop_do_throughout_statementContext ctx) { }

    @Override public void enterFunc_declaration(NymtaxParser.Func_declarationContext ctx) { }

    @Override public void exitFunc_declaration(NymtaxParser.Func_declarationContext ctx) { }

}
