package com.orlov;

import java.util.Scanner;

public class ConsoleOperations {

    public String getUserInput(String requestToUser) {
        System.out.print(requestToUser);
        Scanner scanner = new Scanner(System.in);
        String userExpression = scanner.nextLine();
        scanner.close();
        return userExpression;
    }
    public void showTheAnswer(double answer){
        System.out.println("The answer is: " + answer);
    }
}
