package artim.nemuos.banking.lib.common.bankingExceptions.request;

public class InvalidRequestMethodException extends RuntimeException{

    public InvalidRequestMethodException(String message) {
        super("Invalid Request Method Exception: "+message);
    }
}
