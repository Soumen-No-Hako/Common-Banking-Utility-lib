package artim.nemuos.banking.lib.common.bankingExceptions.request;

public class IncorrectWebAddressException extends RuntimeException{
    public IncorrectWebAddressException(String message) {
        super("Incorrect Webaddress Exception: "+message);
    }
    public IncorrectWebAddressException() {
        super("Incorrect Webaddress Exception: ");
    }

    public IncorrectWebAddressException(String webAddress, String message) {
        super("Incorrect Webaddress Exception: the web address "+webAddress+"is rejected : "+message);
    }
}
