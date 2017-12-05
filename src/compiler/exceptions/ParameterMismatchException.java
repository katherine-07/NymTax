package compiler.exceptions;

public class ParameterMismatchException extends Exception{

    private String message;

    public ParameterMismatchException(){
        this.message = "Parameter Mismatch Found!";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
