package compiler.exceptions;

public class DataMismatchException extends Exception {

    private String message;

    public DataMismatchException(){
        this.message = "Data Mismatch Found!";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
