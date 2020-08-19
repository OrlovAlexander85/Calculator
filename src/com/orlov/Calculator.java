package com.orlov;

public class Calculator {
    public void calculate() throws IllegalArgumentException, IncorrectInputException, IllegalOperationException {
        String userExpression = new ConsoleOperations().getUserInput("Enter expression to calculate: ");
        if (!new EntryValidator().isValidEntry(userExpression)){
            throw new IllegalArgumentException("Expression can only contain numbers and operators");
        }
        new ConsoleOperations().showTheAnswer(new Calculations()
                .calculationResult(new Parsing().getPostfixExpression(userExpression)));
    }
}
