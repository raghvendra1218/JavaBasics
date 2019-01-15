package com.raghvendra;

import java.util.Scanner;

public class Main {
    public static final String INVALID_MESSAGE = "Try a valid integer.";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfNumber = 0;
        int sum = 0;
        while(countOfNumber != 10) {
            System.out.println("Enter Number #"+(countOfNumber +1) + ": ");
            boolean isNumberInt = scanner.hasNextInt();
            if(isNumberInt) {
                int num = scanner.nextInt();
                sum = sum + num;
                countOfNumber++;
            } else {
                System.out.println(INVALID_MESSAGE);
            }

            scanner.nextLine(); //handle end  of line (enter key)
        }
        scanner.nextLine(); //handle end  of line (enter key)
        scanner.close();
    }
}
