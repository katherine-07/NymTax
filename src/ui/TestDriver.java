package ui;

import antlr4.generate.NymtaxLexer;
import antlr4.generate.NymtaxParser;
import compiler.execution.BooleanExpression;
import compiler.execution.ExecutionManager;
import compiler.objects.Function;
import compiler.objects.Scope;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Scanner;

public class TestDriver {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Function scope = new Function("main", null,null, null);
        ExecutionManager a = ExecutionManager.getInstance();

        while(true){
            System.out.print("enter expression");

            String string = s.nextLine();
            NymtaxLexer lexer = new NymtaxLexer(CharStreams.fromString(string));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            NymtaxParser parser = new NymtaxParser(tokens);

            a.visit(parser.program());

            System.out.println(a);
        }

    }
}
