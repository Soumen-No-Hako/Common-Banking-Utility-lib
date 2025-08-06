package com.banking.lib.common.bankingExceptions.credentials;

public class BadPatternException extends RuntimeException{
    public BadPatternException()
    {
        super("Bad pattern exception");
    }
    public BadPatternException(String message)
    {
        super("Bad pattern exception: "+message);
    }
}
