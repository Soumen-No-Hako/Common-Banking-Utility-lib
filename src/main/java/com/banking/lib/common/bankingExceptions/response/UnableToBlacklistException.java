package com.banking.lib.common.bankingExceptions.response;

public class UnableToBlacklistException extends RuntimeException{
    public UnableToBlacklistException() {
        super("Unable to Blacklist account");
    }

    public UnableToBlacklistException(String message) {
        super("Unable to Blacklist: "+message);
    }
}
