package compiler.objects;


import java.util.Set;

public interface Scope{

    public static final String
        TYPE_FUNCTION   = "FUNCTION",
        TYPE_MAIN       = "RUN MAIN";


    String getIdentifier();

    Scope getParentScope();

    void declare(Symbol symbol);

    void initialize(Symbol symbol, Object value);

    Symbol lookup(String id);

    Symbol localLookup(String id);

    Object getInitializedSymbols();

    boolean isInitialized(String id);
}