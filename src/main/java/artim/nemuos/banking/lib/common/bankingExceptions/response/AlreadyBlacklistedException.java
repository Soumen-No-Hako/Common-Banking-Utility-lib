package artim.nemuos.banking.lib.common.bankingExceptions.response;

public class AlreadyBlacklistedException extends RuntimeException{
    public AlreadyBlacklistedException() {
        super("Account already Blacklisted");
    }

    public AlreadyBlacklistedException(String message) {
        super("Account Already Blacklisted: "+message);
    }
}
