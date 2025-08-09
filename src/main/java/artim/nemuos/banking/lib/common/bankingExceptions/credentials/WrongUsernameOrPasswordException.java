package artim.nemuos.banking.lib.common.bankingExceptions.credentials;

public class WrongUsernameOrPasswordException extends RuntimeException{
    public WrongUsernameOrPasswordException() {
        super("Username or Password is wrong");
    }
    public WrongUsernameOrPasswordException(String message) {
        super("Username or Password is wrong:"+message);
    }
}
