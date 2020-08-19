package com.orlov;

public class IncorrectInputException extends Exception {
    public IncorrectInputException(String message) {
        super(message);
        System.out.println(message);
    }
}
