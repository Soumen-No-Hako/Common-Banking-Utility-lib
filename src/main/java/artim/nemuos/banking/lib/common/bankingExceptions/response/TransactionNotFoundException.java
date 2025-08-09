package artim.nemuos.banking.lib.common.bankingExceptions.response;

public class TransactionNotFoundException extends RuntimeException{
    public TransactionNotFoundException() {
        super("Transaction Not found from the request");
    }

    public TransactionNotFoundException(String message) {
        super("Transaction Not found from the request: "+message);
    }
}
