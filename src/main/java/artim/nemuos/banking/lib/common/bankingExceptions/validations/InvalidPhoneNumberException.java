package artim.nemuos.banking.lib.common.bankingExceptions.validations;

public class InvalidPhoneNumberException extends RuntimeException{
    public InvalidPhoneNumberException() {
        super("Invalid Phone number Exception");
    }
    public InvalidPhoneNumberException(String message) {
        super("Invalid Phone number Exception: "+message);
    }
}
