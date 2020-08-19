package com.orlov;

import java.util.Stack;

public class Parsing {
    public String getPostfixExpression(String inFixExpression) throws IncorrectInputException {
        StringBuilder postFixExpression = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        boolean isPreviousCharOperator = false;
        if (!Character.isDigit(inFixExpression.charAt(0))){
            throw new IncorrectInputException("Expression should start from a number");
        }
        for (int i = 0; i < inFixExpression.length(); i++) {
            char c = inFixExpression.charAt(i);
            if (Character.isDigit(c) || '.' == c) {
                postFixExpression.append(c);
                isPreviousCharOperator = false;
            } else if(c !=' '){
                if (isPreviousCharOperator){
                    throw new IncorrectInputException("Two operators in a row are not allowed");
                }
                postFixExpression.append(' ');
                while (!stack.isEmpty() && Precedence(c) <= Precedence(stack.peek())) {
                    postFixExpression.append(stack.pop());
                    postFixExpression.append(' ');
                }
                stack.push(c);
                isPreviousCharOperator = true;
            }
        }
        while (!stack.isEmpty()) {
            postFixExpression.append(' ');
            postFixExpression.append(stack.pop());
        }
        return postFixExpression.toString();
    }

    static int Precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }
}
