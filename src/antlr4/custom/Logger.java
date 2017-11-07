package antlr4.custom;

import java.util.ArrayList;

public class Logger {
    private static Logger ourInstance = new Logger();
    private ArrayList<String> errors = new ArrayList<String>();

    public static Logger getInstance() {
        return ourInstance;
    }

    private Logger() {
    }

    public void addLog(String s){
        errors.add(s);
    }
}
