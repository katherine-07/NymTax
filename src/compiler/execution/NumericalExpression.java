package compiler.execution;

import antlr4.custom.ThrowingErrorListener;
import compiler.objects.Function;
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
        Float leftNum = (Float) visit(ctx.numerical_expression(0));
        Float rightNum = (Float) visit(ctx.numerical_expression(1));

        if(leftNum == null || rightNum == null){
            return null;
        } else {
            switch (ctx.op.getType()) {
                case NymtaxParser.ADD:
                    return leftNum + rightNum;
                case NymtaxParser.SUB:
                    return leftNum - rightNum;
            }
            return null;
        }
    }

    @Override
    public Float visitNumerical_MDM(NymtaxParser.Numerical_MDMContext ctx) {
        Float leftNum = (Float) visit(ctx.numerical_expression(0));
        Float rightNum = (Float) visit(ctx.numerical_expression(1));

        if(leftNum == null || rightNum == null){
            return null;
        }
        else {
            switch (ctx.op.getType()) {
                case NymtaxParser.DIV:
                    return leftNum / rightNum;
                case NymtaxParser.MOD:
                    return leftNum % rightNum;
                case NymtaxParser.MUL:
                    return leftNum * rightNum;
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
        return Float.valueOf(ctx.NFACTOR().getText());
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        return null;
    }
}
