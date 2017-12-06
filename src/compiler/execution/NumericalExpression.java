package compiler.execution;

import antlr4.custom.ThrowingErrorListener;
import compiler.objects.Function;
import compiler.objects.Symbol;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr4.generate.NymtaxParser;
import antlr4.generate.NymtaxVisitor;
import antlr4.generate.NymtaxBaseVisitor;
import antlr4.generate.NymtaxLexer;


import java.util.ArrayList;
import java.util.Arrays;

public class NumericalExpression extends NymtaxBaseVisitor{

    private NymtaxLexer lexer;
    private CommonTokenStream tokens;
    private NymtaxParser parser;
    private ParseTree tree;

    public Function getScope_() {
        return scope_;
    }

    public void setScope_(Function scope_) {
        this.scope_ = scope_;
    }

    private Function scope_;

    public Float solve(String expression) throws ParseCancellationException {

        lexer = new NymtaxLexer(CharStreams.fromString(expression));
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

        tokens = new CommonTokenStream(lexer);

        parser = new NymtaxParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(ThrowingErrorListener.INSTANCE);

        try {
            tree = parser.program();

            TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
            viewer.setScale(2);
            viewer.open();

            return (Float) visit(tree);
        } catch (ParseCancellationException e) {
            throw e;
        }
    }

    @Override
    public Object visitNumerical_paren(NymtaxParser.Numerical_parenContext ctx) {
        return visit(ctx.numerical_expression());
    }

    @Override
    public Float visitNumerical_AS(NymtaxParser.Numerical_ASContext ctx) {
        Number leftNum = (Number) visit(ctx.numerical_expression(0));
        Number rightNum = (Number) visit(ctx.numerical_expression(1));

        if(leftNum == null || rightNum == null){
            return null;
        } else {
            switch (ctx.op.getType()) {
                case NymtaxParser.ADD:
                    return leftNum.floatValue() + rightNum.floatValue();
                case NymtaxParser.SUB:
                    return leftNum.floatValue() - rightNum.floatValue();
            }
            return null;
        }
    }

    @Override
    public Float visitNumerical_MDM(NymtaxParser.Numerical_MDMContext ctx) {
        Number leftNum = (Number) visit(ctx.numerical_expression(0));
        Number rightNum = (Number) visit(ctx.numerical_expression(1));

        if(leftNum == null || rightNum == null){
            return null;
        }
        else {
            switch (ctx.op.getType()) {
                case NymtaxParser.DIV:
                    return leftNum.floatValue() / rightNum.floatValue();
                case NymtaxParser.MOD:
                    return leftNum.floatValue() % rightNum.floatValue();
                case NymtaxParser.MUL:
                    return leftNum.floatValue() * rightNum.floatValue();
            }

            return null;
        }
    }

    @Override
    public Object visitNumerical_negparen(NymtaxParser.Numerical_negparenContext ctx) {
        return  -1 * ( (Float) visit(ctx.numerical_expression()));
    }

    @Override
    public Object visitNumerical_val(NymtaxParser.Numerical_valContext ctx) {
        switch (ctx.value.getType()){
            case NymtaxParser.IDENTIFIER:
                String id = ctx.value.getText();
                Symbol value = ExecutionManager.getInstance().getCurrentFunc().lookup(id);
                if(value.getDataType().equals(Symbol.TYPE_FLO) || value.getDataType().equals(Symbol.TYPE_INT)){
                    return value.getValue();
                }
                break;
            case NymtaxParser.INTEGER:
                //Fallthrough
            case NymtaxParser.FLOAT:
                return Float.valueOf(ctx.value.getText());
        }
        return null;
    }

    @Override
    public Object visitNumerical_array(NymtaxParser.Numerical_arrayContext ctx) {
        String id = ctx.array_call().IDENTIFIER().getText();
        Integer index = Integer.parseInt(
                ctx.array_call().NUMBER().getText()
        );
        ExecutionManager m =ExecutionManager.getInstance();

        Symbol arr = m.getCurrentFunc().lookup(id);

        if(id != null && arr.isArray()){
            return ((ArrayList)arr.getValue()).get(index);
        }else{
            System.out.println("ERROR: numerical array not found");
            return null;
        }
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        return null;
    }
}
