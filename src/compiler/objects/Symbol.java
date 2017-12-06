package compiler.objects;

import com.ibm.icu.text.ArabicShaping;

import java.util.ArrayList;

//  class to store variables and functions
public class Symbol {
    protected String identifier;
    protected String dataType;
    protected boolean isField;

    public boolean isArray() {
        return isArray;
    }

    protected boolean isArray;
    protected boolean isInitialized;

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
        value = new ArrayList();
        ArrayList temp = (ArrayList) value;

        for(int i=0; i<arraySize; i++){
            temp.add(0);
        }
    }

    protected int arraySize;

    public static final String TYPE_INT     = "INTEGER";
    public static final String TYPE_FLO     = "FLOAT";
    public static final String TYPE_CHR     = "CHAR";
    public static final String TYPE_STRNG   = "STRING";
    public static final String TYPE_BOOL    = "BOOLEAN";
    public static final String TYPE_ARR     = "ARRAY";


    public static final String BOOL_TRUE    = "true";
    public static final String BOOL_FALSE   = "false";

    public boolean isInitialized() {
        return isInitialized;
    }

    public Object getValue() {
        return value;
    }

    protected Object value;

    public Symbol(String id, String type, boolean isField, boolean isArray){
        identifier = id;
        dataType = type;
        this.isField = isField;
        isInitialized = false;
        this.isArray = isArray;
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
