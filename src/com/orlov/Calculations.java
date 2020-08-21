package com.orlov;

import java.util.Stack;

public class Calculations {
    Stack<Double> stackOfOperands = new Stack<>();

    public double calculationResult(String postFixExpression) throws IllegalOperationException {
        String[] splitedExpression = postFixExpression.split(" ");


        for (String s : splitedExpression) {
            if (s.matches(".*\\d.*")) {
                pushIntoStack(Double.parseDouble(s));
            } else {
                double d;
                switch (s) {
                    case "+":
                        d = addition(getOperand(), getOperand());
                        pushIntoStack(d);
                        break;
                    case "-":
                        d = addition(getOperand(), -getOperand());
                        pushIntoStack(d);
                        break;
                    case "/":
                        d = division(getOperand(), getOperand());
                        pushIntoStack(d);
                        break;
                    case "*":
                        d = multiplication(getOperand(), getOperand());
                        pushIntoStack(d);
                        break;
                }
            }
        }
        return getOperand();
    }

    private void pushIntoStack(double d) {
        stackOfOperands.push(d);
    }

    private double addition(double d1, double d2) {
        return d1 + d2;
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

    private double getOperand() {
        return stackOfOperands.pop();
    }
}

