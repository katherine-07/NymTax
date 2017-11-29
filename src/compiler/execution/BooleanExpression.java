package compiler.execution;

import antlr4.generate.NymtaxBaseVisitor;
import antlr4.generate.NymtaxParser;
import compiler.exceptions.DataMismatchException;
import compiler.exceptions.VariableNotFoundException;
import compiler.objects.Scope;
import compiler.objects.Symbol;

public class BooleanExpression extends NymtaxBaseVisitor {

    public Scope getScope_() {
        return scope_;
    }

    public void setScope_(Scope scope_) {
        this.scope_ = scope_;
    }

    private Scope scope_;

    public BooleanExpression(Scope scope){
        scope_ = scope;
    }

    /// boolean_expression
    @Override
    public Boolean visitBoolean_or(NymtaxParser.Boolean_orContext ctx) {
        Boolean left = (Boolean) visit(ctx.boolean_expression(0));
        Boolean right = (Boolean) visit(ctx.boolean_expression(1));

        return left || right;
    }

    @Override
    public Boolean visitBoolean_and(NymtaxParser.Boolean_andContext ctx) {
        Boolean left = (Boolean) visit(ctx.boolean_expression(0));
        Boolean right = (Boolean) visit(ctx.boolean_expression(1));

        return left && right;
    }

    @Override
    public Boolean visitBoolean_log(NymtaxParser.Boolean_logContext ctx) {
        return (Boolean) visit(ctx.boolean_logic());
    }

    //boolean logic
    @Override
    public Boolean visitBoolean_paren(NymtaxParser.Boolean_parenContext ctx) {
        return (Boolean) visit(ctx.boolean_expression());
    }

    @Override
    public Boolean visitBoolean_not(NymtaxParser.Boolean_notContext ctx) {
        return !((Boolean) visit(ctx.boolean_expression()));
    }

    @Override
    public Object visitBoolean_term(NymtaxParser.Boolean_termContext ctx) {
        return visit(ctx.bool_term());
    }

    //bool term
    @Override
    public Boolean visitBoolean_numerical(NymtaxParser.Boolean_numericalContext ctx) {

        //numerical expression.solve (left) + .solve(right)
        Float left = (Float) visit(ctx.numerical_expression(0));
        Float right = (Float) visit(ctx.numerical_expression(1));

        switch(ctx.op.getType()){
            case NymtaxParser.EQUAL:
                return left == right;

            case NymtaxParser.NOTEQUAL:
                return left != right;

            case NymtaxParser.GT:
                return left > right;

            case NymtaxParser.LT:
                return left < right;

            case NymtaxParser.GE:
                return left >= right;

            case NymtaxParser.LE:
                return left <= right;

            default:
                return null;
        }
    }

    @Override
    public Boolean visitBoolean_string(NymtaxParser.Boolean_stringContext ctx) {

        //string expression.solve (left) + .solve(right)
        String left = (String) visit(ctx.string_expression(0));
        String right = (String) visit(ctx.string_expression(1));

        boolean isEqual = left.equals(right);

        switch(ctx.op.getType()){
            case NymtaxParser.EQUAL:
                return isEqual;
            case NymtaxParser.NOTEQUAL:
                return !isEqual;
            default:
                return null;
        }
    }

    @Override
    public Boolean visitBoolean_equality(NymtaxParser.Boolean_equalityContext ctx) {
        Boolean left = (Boolean) visit(ctx.bool_term(0));
        Boolean right = (Boolean) visit(ctx.bool_term(1));

        boolean isEqual = left == right;

        switch(ctx.op.getType()){
            case NymtaxParser.EQUAL:
                return isEqual;
            case NymtaxParser.NOTEQUAL:
                return !isEqual;
            default:
                return null;
        }
    }

    @Override
    public Boolean visitBoolean_variable(NymtaxParser.Boolean_variableContext ctx){
        String varName = ctx.IDENTIFIER().toString();

        Symbol variable = scope_.lookup(varName);
        if(variable == null){
            //TODO: throw error variable not found error
            try {
                throw new VariableNotFoundException();
            } catch (VariableNotFoundException e) {
                e.printStackTrace();
            }
            return null;
        } else{
            String dataType = variable.getDataType();
            switch(dataType){
                case "INTEGER":
                    //Fallthrough
                case "FLOAT":
                    return (Float)variable.getValue() != 0 ;
                default:
                    //TODO: throw error data mismatch error
                    try {
                        throw new DataMismatchException();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    return null;
            }
        }

    }

    @Override
    public Boolean visitBoolean_true(NymtaxParser.Boolean_trueContext ctx) {
        return true;
    }

    @Override
    public Boolean visitBoolean_false(NymtaxParser.Boolean_falseContext ctx) {
        return false;
    }
}
