package compiler.objects;


import java.util.Set;

public interface Scope{

    String getIdentifier();

    Scope getParentScope();

    void declare(Symbol symbol);

    void initialize(Symbol symbol, Object value);

    Symbol lookup(String id);

    Symbol localLookup(String id);

    Object getInitializedSymbols();

    boolean isInitialized(String id);
}