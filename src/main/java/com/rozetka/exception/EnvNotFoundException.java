package com.rozetka.exception;

public class EnvNotFoundException extends Exception {

    public EnvNotFoundException(String env) {
        super(String.format("Environment [%s] not found: ", env));
    }
}
