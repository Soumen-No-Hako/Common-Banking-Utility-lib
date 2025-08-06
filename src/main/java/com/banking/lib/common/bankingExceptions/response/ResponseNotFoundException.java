package com.banking.lib.common.bankingExceptions.response;

public class ResponseNotFoundException extends RuntimeException{
    public ResponseNotFoundException() {
        super("Response was not found");
    }

    public ResponseNotFoundException(String message) {
        super("Response was not found: "+message);
    }
}
