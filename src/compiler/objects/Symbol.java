package compiler.objects;

//  class to store variables and functions
public class Symbol {
    protected String identifier;
    protected int dataType;
    protected boolean isField;
    protected boolean isInitialized;

    public boolean isInitialized() {
        return isInitialized;
    }

    public Object getValue() {
        return value;
    }

    protected Object value;

    public Symbol(String id, int type, boolean isField){
        identifier = id;
        dataType = type;
        this.isField = isField;
        isInitialized = false;
    }

    public void setValue(Object val){
        value = val;
        isInitialized = true;
    }

    public String getIdentifier() {
        return identifier;
    }

    public int getDataType() {
        return dataType;
    }

    public boolean isField() {
        return isField;
    }

}
