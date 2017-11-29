package compiler.objects;

//  class to store variables and functions
public class Symbol {
    protected String identifier;
    protected String dataType;
    protected boolean isField;
    protected boolean isInitialized;

    public boolean isInitialized() {
        return isInitialized;
    }

    public Object getValue() {
        return value;
    }

    protected Object value;

    public Symbol(String id, String type, boolean isField){
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

    public String getDataType() {
        return dataType;
    }

    public boolean isField() {
        return isField;
    }

}
