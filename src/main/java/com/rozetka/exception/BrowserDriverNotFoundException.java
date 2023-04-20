package com.rozetka.exception;

public class BrowserDriverNotFoundException extends Exception {

    public BrowserDriverNotFoundException(String browserName) {
        super("Browser not found: " + browserName);
    }
}
