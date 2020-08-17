package com.orlov;

import com.sun.xml.internal.ws.util.StringUtils;

public class EntryValidator {
    public boolean isValidEntry(String expression) {
        if (expression.equals("")) {
            return false;
        } else {
            if (expression.matches("[0-9-./+* ]+")) {
                return true;
            } else {
                return false;
            }
        }
    }
}
