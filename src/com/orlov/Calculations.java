package com.orlov;

import java.util.Stack;

public class Calculations {

    public double calculationResult(String postFixExpression) throws IllegalOperationException {
        String[] splitedExpression = postFixExpression.split(" ");
        Stack<Double> stackOfOperands = new Stack<>();

        for (String s : splitedExpression) {
            if (s.matches(".*\\d.*")) {
                stackOfOperands.push(Double.parseDouble(s));
            } else {
                double d;
                switch (s) {
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

    private double division(double d1, double d2) throws IllegalOperationException {
        if (d1 == 0) {
            throw new IllegalOperationException("Division by 0 is forbidden");
        }
        return d2 / d1;
    }

    private double multiplication(double d1, double d2) {
        return d1 * d2;
    }
}
