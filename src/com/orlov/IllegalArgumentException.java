package com.orlov;

public class IllegalArgumentException extends Exception {
    public IllegalArgumentException(String message) {
        super(message);
        System.out.println(message);
    }
}
