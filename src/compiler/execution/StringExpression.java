package compiler.execution;

import antlr4.generate.NymtaxBaseVisitor;
import antlr4.generate.NymtaxParser;
import compiler.exceptions.DataMismatchException;
import compiler.exceptions.VariableNotFoundException;
import compiler.objects.Symbol;

public class StringExpression extends NymtaxBaseVisitor {

    @Override
    public Object visitString_add(NymtaxParser.String_addContext ctx) {
        String stringLeft = (String) visit(ctx.string_expression(0));
        String stringRight = (String) visit(ctx.string_expression(1));

        String concatString = stringLeft.concat(stringRight);
        return concatString;
    }


    @Override
    public Object visitString_var(NymtaxParser.String_varContext ctx) {
        String varName = ctx.IDENTIFIER().toString();

        Symbol variable = ExecutionManager.getInstance().getCurrentFunc().lookup(varName);
        if(variable == null){
            try {
                throw new VariableNotFoundException();
            } catch (VariableNotFoundException e) {
                e.printStackTrace();
                System.out.println("Variable cannot be found.");
            }
            return null;
        } else{
            String dataType = variable.getDataType();

            if(dataType.equals(Symbol.TYPE_STRNG) ) {
                return (String) variable.getValue();
            }else{
                    try {
                        throw new DataMismatchException();
                    }catch (Exception e){
                        e.printStackTrace();
                        System.out.println("Data mismatch Found!");
                    }
                    return null;
            }
        }
    }

    @Override
    public Object visitString_const(NymtaxParser.String_constContext ctx) {
        String constant = ctx.getText();

        return constant.substring(1, constant.length()-1);

    }
}
