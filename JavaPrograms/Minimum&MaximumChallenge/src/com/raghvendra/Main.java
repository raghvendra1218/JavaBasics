package com.raghvendra;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maximumNum = -2147483648; //Integer.MIN_VALUE;
        int minimumNum = 2147483647; //Integer.MAX_VALUE;
        int maximumNum = 0;
        int minimumNum = 0;
        boolean flag = true; // used to set the numbers to min and max equal to the user input for the first time
        while (true) {
            System.out.println("Enter number: ");
            boolean isInt = scanner.hasNextInt();
            if(isInt) {
                int num = scanner.nextInt();
                if(flag) {
                    flag = false;
                    maximumNum = num;
                    minimumNum = num;
                }
                if(num > maximumNum) {
                    maximumNum = num;
                }
                if(num < minimumNum) {
                    minimumNum = num;
                }
            } else {
                break;
            }
            scanner.nextLine(); // handle end of line (enter key)
        }
        System.out.println("Maximum Number : " + maximumNum);
        System.out.println("Minimum Number : " + minimumNum);
        scanner.close();
    }
}
