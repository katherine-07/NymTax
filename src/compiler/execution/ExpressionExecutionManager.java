package compiler.execution;

import antlr4.generate.NymtaxBaseVisitor;
import antlr4.generate.NymtaxParser;

public class ExpressionExecutionManager extends NymtaxBaseVisitor{
    private ExpressionExecutionManager instance = null;
    private BooleanExpression booleanExpression;
    private NumericalExpression numericalExpression;

    private ExpressionExecutionManager(){
        booleanExpression = new BooleanExpression(null);
        numericalExpression = new NumericalExpression();
    }

    public ExpressionExecutionManager getInstance() {
        if(instance == null){
            instance = new ExpressionExecutionManager();
        }
        return instance;
    }

    @Override
    public Object visitVisit_boolexpr(NymtaxParser.Visit_boolexprContext ctx) {
        return booleanExpression.visit(ctx);
    }

    @Override
    public Object visitVisit_numexpr(NymtaxParser.Visit_numexprContext ctx) {
        return numericalExpression.visit(ctx);
    }
}
