package antlr4.custom;

import antlr4.generate.NymtaxBaseListener;
import antlr4.generate.NymtaxParser;

public class NymtaxListener extends NymtaxBaseListener {
    @Override
    public void enterProgram(NymtaxParser.ProgramContext ctx) {
        super.enterProgram(ctx);
    }
}
