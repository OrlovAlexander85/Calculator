package com.orlov;

public class EntryValidator {
    public boolean isValidEntry(String expression) {
        if (expression.equals("")) {
            return false;
        } else {
            return expression.matches("[0-9-./+* ]+");
        }
    }
}
