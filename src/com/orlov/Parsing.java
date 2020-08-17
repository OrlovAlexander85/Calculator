package com.orlov;

import java.util.Stack;

public class Parsing {
    public String getPostfixExpression(String inFixExpression) {
        StringBuilder postFixExpression = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < inFixExpression.length(); i++) {
            char c = inFixExpression.charAt(i);
            if (Character.isDigit(c) || '.' == c) {
                postFixExpression.append(c);
            } else if(c !=' '){
                postFixExpression.append(' ');
                while (!stack.isEmpty() && Precedence(c) <= Precedence(stack.peek())) {
                    postFixExpression.append(stack.pop());
                    postFixExpression.append(' ');
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            postFixExpression.append(' ');
            postFixExpression.append(stack.pop());
        }
        System.out.println(postFixExpression.toString());
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
