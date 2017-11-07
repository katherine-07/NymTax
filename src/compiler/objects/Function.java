package compiler.objects;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Function extends Symbol implements Scope {

    private HashMap<String, Symbol> symbols;
    private Scope parent;
    private ParserRuleContext ctx;

    public Function(String id, Scope parent, ParserRuleContext ctx){
        super(id, "func", true);
        symbols = new HashMap<String, Symbol>();
        this.parent = parent;
        this.ctx = ctx;
    }

    public Symbol getSendSymbol() {
        return sendSymbol;
    }

    public void setSendSymbol(Symbol sendSymbol) {
        this.sendSymbol = sendSymbol;
    }

    private Symbol sendSymbol;


    public ParserRuleContext getContex() {
        return ctx;
    }


    public String getIdentifier(){
        return identifier;
    }

    public Scope getParentScope(){
        return parent;
    }

    public void declare(Symbol symbol){
        if(!symbols.containsKey(symbol.getIdentifier())){
            symbols.put(symbol.getIdentifier(), symbol);
        }else{
            //TODO: ERROR throw variable already declared exception
        }
    }

    public void initialize(Symbol symbol, Object value){
        if(symbols.containsKey(symbol.getIdentifier())){
            symbols.get(symbol.getIdentifier()).setValue(value);
        }else{
            //TODO: ERROR throw variable not found exception
        }
    }

    public Symbol lookup(String id){
        if(symbols.containsKey(id)){
            return symbols.get(id);
        }else if(parent != null){
            return parent.lookup(id);
        }else{
            return null;
        }
    }

    public Symbol localLookup(String id){
        if(symbols.containsKey(id)){
            return symbols.get(id);
        }else{
            return null;
        }
    }

    public HashMap<String, Symbol> getInitializedSymbols(){
        HashMap<String, Symbol> set = new HashMap<String, Symbol>();
        symbols.forEach((s, symbol) -> {
            if(symbol.isInitialized){
                set.put(s, symbol);
            }
        });

        return set;
    }

    public boolean isDeclared(String id){
        return this.lookup(id)!=null;
    }

    public boolean isInitialized(String id){
        return symbols.containsKey(id);
    }

}
