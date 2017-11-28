package antlr4.custom;

import antlr4.generate.NymtaxBaseVisitor;
import antlr4.generate.NymtaxParser;

public class BooleanExpression extends NymtaxBaseVisitor {

    @Override
    public Object visitBoolean_numerical(NymtaxParser.Boolean_numericalContext ctx) {

        //numerical expression.solve (left) + .solve(right)
        Float left = (Float) visit(ctx.numerical_expression(0));
        Float right = (Float) visit(ctx.numerical_expression(1));

        switch(ctx.op.getType()){
            case NymtaxParser.EQUAL:
                break;

        }
        return null;
    }
}
