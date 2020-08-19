package com.orlov;

public class Main {

    public static void main(String[] args) {
//        "4.2 + 2 * 3 / 3 - 6.1"
        try {
            new Calculator().calculate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
