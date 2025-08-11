package artim.nemuos.banking.lib.common.bankingExceptions.propertyException;

public class UnableToGetPropertyException extends RuntimeException{
    public UnableToGetPropertyException(String message) {
        super("Unable to get Property: "+message);
    }
}
