package com.orlov;

public class Calculator {
    public void calculate(){
        String userExpression = new ConsoleOperations().getUserInput("Enter expression to calculate: ");
        System.out.println(new Calculations().calculationResult(new Parsing().getPostfixExpression(userExpression)));
    }
}
