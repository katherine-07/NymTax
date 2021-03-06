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
        globalFunctions = new HashMap<String, Function>();
        currentFunc = mainFunction;
    }
//
//    @Override public void enterVar_declaration(NymtaxParser.Var_declarationContext ctx) {
//        if(ctx.const_declaration() == null) {
//            String varName = ctx.IDENTIFIER(0).getText();
//
//            if (currentFunc.isDeclared(varName)) {
//                //TODO: ERROR variable already exists exception
//
//            } else {
//                int type = 0;
//                NymtaxParser.Data_typeContext dtCtx = ctx.list_var().data_type();
//                String INT = dtCtx.INT().getText();
//                String FLO = dtCtx.FLO().getText();
//                String CHR = dtCtx.CHR().getText();
//                String STR = dtCtx.STRNG().getText();
//
//                if(dtCtx.getText().equals(INT)){
//                    type = NymtaxParser.INT;
//                }else if(dtCtx.getText().equals(FLO)){
//                    type = NymtaxParser.FLO;
//                }else if(dtCtx.getText().equals(CHR)){
//                    type = NymtaxParser.CHR;
//                }else if(dtCtx.getText().equals(STR)){
//                    type = NymtaxParser.STRNG;
//                }
//
//                    Symbol newSymbol = new Symbol(varName, type, true);
//                currentFunc.declare(newSymbol);
//                if (ctx.IDENTIFIER(1) != null) {
//                    if(currentFunc.isDeclared(ctx.IDENTIFIER(1).getText())) {
//                        currentFunc.initialize(newSymbol, currentFunc.lookup(ctx.IDENTIFIER(1).getText()).getValue());
//                    }
//                    else{
//                        //TODO: ERROR no such variable exists exception
//                    }
//                }
//
//            }
//        }
//    }

    @Override public void enterConst_declaration(NymtaxParser.Const_declarationContext ctx) {
        String varName = ctx.IDENTIFIER().getText();

        if(currentFunc.isDeclared(varName)){
            //TODO: ERROR variable already exists exception

        }else{int type = 0;
            NymtaxParser.Data_typeContext dtCtx = ctx.data_type();
//            String INT = dtCtx.INT().getText();
//            String FLO = dtCtx.FLO().getText();
//            String CHR = dtCtx.CHR().getText();
//            String STR = dtCtx.STRNG().getText();
//
//            if(dtCtx.getText().equals(INT)){
//                type = NymtaxParser.INT;
//            }else if(dtCtx.getText().equals(FLO)){
//                type = NymtaxParser.FLO;
//            }else if(dtCtx.getText().equals(CHR)){
//                type = NymtaxParser.CHR;
//            }else if(dtCtx.getText().equals(STR)){
//                type = NymtaxParser.STRNG;
//            }

            Symbol newSymbol = new Symbol(varName, dtCtx.getText(), true, false);
            currentFunc.declare(newSymbol);
            if(ctx.constant() != null){
                currentFunc.initialize(newSymbol.getIdentifier(), ctx.constant().getText());
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
                System.out.print(s.getValue());
            }else{
                //TODO: Error - variable not found exception
            }
        }

        System.out.println();
    }

    @Override public void enterRead_statement(NymtaxParser.Read_statementContext ctx) { }

    @Override public void exitRead_statement(NymtaxParser.Read_statementContext ctx) { }
//
//    @Override public void enterWhen_statement(NymtaxParser.When_statementContext ctx) {
//        // WHEN( blah == blah )
//        if(ctx.boolean_expression().children.get(0) instanceof NymtaxParser.Numerical_expressionContext){
//
//        }
//
//        List<ParseTree> tree = ctx.boolean_expression().children;
//
//        if(tree.get(0) instanceof NymtaxParser.Numerical_expressionContext){
//                NymtaxParser.Numerical_expressionContext Num1 = (NymtaxParser.Numerical_expressionContext) tree.get(0);
//                NymtaxParser.Relation_opsContext relation = (NymtaxParser.Relation_opsContext) tree.get(1);
//                NymtaxParser.Numerical_expressionContext Num2 = (NymtaxParser.Numerical_expressionContext) tree.get(2);
//
//                if(relation.EQUAL() != null){
//
//                }else if (relation.NOTEQUAL() != null){
//
//                } else if (relation.GE() != null){
//
//                }
//        }
//
//
//
//    }


}
