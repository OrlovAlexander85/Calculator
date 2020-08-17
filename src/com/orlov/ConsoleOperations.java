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
}
