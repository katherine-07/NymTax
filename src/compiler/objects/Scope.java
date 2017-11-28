package compiler.objects;


import java.util.Set;

public interface Scope{

    public static final int
        TYPE_FUNCTION   = -1,
        TYPE_MAIN       = -2;


    String getIdentifier();

    Scope getParentScope();

    void declare(Symbol symbol);

    void initialize(Symbol symbol, Object value);

    Symbol lookup(String id);

    Symbol localLookup(String id);

    Object getInitializedSymbols();

    boolean isInitialized(String id);
}