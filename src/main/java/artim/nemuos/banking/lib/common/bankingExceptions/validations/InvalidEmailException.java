package artim.nemuos.banking.lib.common.bankingExceptions.validations;

public class InvalidEmailException extends RuntimeException{
    public InvalidEmailException() {
        super("Invalid Email Exception");
    }
    public InvalidEmailException(String message) {
        super("Invalid Email Exception: "+message);
    }
}
