package ui;

import antlr4.generate.NymtaxLexer;
import antlr4.generate.NymtaxParser;
import compiler.execution.BooleanExpression;
import compiler.objects.Function;
import compiler.objects.Scope;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Scanner;

public class TestDriver {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Function scope = new Function("main", null,null);
        BooleanExpression bool = new BooleanExpression(scope);

        while(true){
            System.out.print("enter expression");

            String string = s.nextLine();
            NymtaxLexer lexer = new NymtaxLexer(CharStreams.fromString(string));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            NymtaxParser parser = new NymtaxParser(tokens);


            Boolean a = (Boolean)bool.visit(parser.boolean_expression());

            System.out.println(a);
        }

    }
}
