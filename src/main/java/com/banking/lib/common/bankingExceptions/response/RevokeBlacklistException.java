package com.banking.lib.common.bankingExceptions.response;

public class RevokeBlacklistException extends RuntimeException{
    public RevokeBlacklistException() {
        super("Blacklist Revoking failed");
    }

    public RevokeBlacklistException(String message) {
        super("Blacklist Revoking failed: "+message);
    }
}
