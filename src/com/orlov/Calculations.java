package com.orlov;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Calculations {

    public double calculationResult(String postFixExpression) {
        String[] splitedExpression = postFixExpression.split(" ");
        Stack<Double> stackOfOperands = new Stack<>();

        for (int i = 0; i < splitedExpression.length; i++) {
            if (splitedExpression[i].matches(".*\\d.*")) {
                stackOfOperands.push(Double.parseDouble(splitedExpression[i]));
            } else {
                double d;
                switch (splitedExpression[i]) {
                    case "+":
                        d = addition(stackOfOperands.pop(), stackOfOperands.pop());
                        stackOfOperands.push(d);
                        break;
                    case "-":
                        d = subtraction(stackOfOperands.pop(), stackOfOperands.pop());
                        stackOfOperands.push(d);
                        break;
                    case "/":
                        d = division(stackOfOperands.pop(), stackOfOperands.pop());
                        stackOfOperands.push(d);
                        break;
                    case "*":
                        d = multiplication(stackOfOperands.pop(), stackOfOperands.pop());
                        stackOfOperands.push(d);
                        break;
                }
            }
        }
        return stackOfOperands.pop();
    }

    private double addition(double d1, double d2) {
        return d1 + d2;
    }

    private double subtraction(double d1, double d2) {
        return d2 - d1;
    }

    private double division(double d1, double d2) {
        return d2 / d1;
    }

    private double multiplication(double d1, double d2) {
        return d1 * d2;
    }
}
