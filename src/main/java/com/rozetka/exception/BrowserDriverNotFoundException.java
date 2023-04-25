package com.rozetka.exception;

public class BrowserDriverNotFoundException extends Exception {

    public BrowserDriverNotFoundException(String browserName) {
        super(String.format("Browser [%s] not found: ", browserName));
    }
}
