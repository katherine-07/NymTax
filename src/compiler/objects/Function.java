package compiler.objects;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.*;

public class Function extends Symbol implements Scope {

    private List<String> parameterIds;
    private HashMap<String, Symbol> symbols;
    private HashMap<String, Function> functions;
    private Function parent;
    private ParserRuleContext ctx;
    private Symbol sendSymbol;

    private String sendType;

    public Function(String id, Function parent, ParserRuleContext ctx, String sendType){
        super(id, Scope.TYPE_FUNCTION, true);
        symbols = new HashMap<>();
        functions = new HashMap<>();
        parameterIds = new ArrayList<>();

        sendSymbol = new Symbol("send", sendType, false);
        sendSymbol.setValue(null);
        this.parent = parent;
        this.ctx = ctx;
        this.sendType = sendType;
    }

    public Symbol getSendSymbol() {
        return sendSymbol;
    }

    public void setSendSymbol(Symbol sendSymbol) {
        this.sendSymbol = sendSymbol;
    }

    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType;
    }



    public ParserRuleContext getContex() {
        return ctx;
    }

    public void addParameter(String id, String dataType){
        parameterIds.add(id);
        Symbol param = new Symbol(id, dataType, false);
        declare(param);
    }

    public void initializeParameter(List<Object> params){
        if(parameterIds.size() == params.size()){
            for(int i=0; i<parameterIds.size(); i++){
                this.lookup(parameterIds.get(i)).setValue(params.get(i));
            }
        }else{
            //TODO: throw parameter mismatch exception
        }

    }

    public String getIdentifier(){
        return identifier;
    }

    public Function getParentScope(){
        return parent;
    }

    public void declare(Symbol symbol){
        if(!symbols.containsKey(symbol.getIdentifier())){
            symbols.put(symbol.getIdentifier(), symbol);
        }else{
            //TODO: ERROR throw variable already declared exception
            System.out.print("ERROR VARIABLE ALRDY DEC");
        }
    }

    public void declare(Function function){
        if(!functions.containsKey(function.getIdentifier())){
            functions.put(function.getIdentifier(), function);
        }else{
            //TODO: ERROR throw variable already declared exception
            System.out.print("ERROR VARIABLE ALRDY DEC");
        }
    }

    public void initialize(String id, Object value){

        if(symbols.containsKey(id)){
            Symbol symbol = lookup(id);
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


    public Symbol lookupFunc(String id){
        if(functions.containsKey(id)){
            return functions.get(id);
        }else if(parent != null){
            return parent.lookup(id);
        }else{
            return null;
        }
    }

    public Function localLookupFunc(String id){
        if(functions.containsKey(id)){
            return functions.get(id);
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
