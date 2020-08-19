package com.orlov;

public class IllegalOperationException extends Exception {
    public IllegalOperationException(String message) {
        super(message);
        System.out.println(message);
    }
}
