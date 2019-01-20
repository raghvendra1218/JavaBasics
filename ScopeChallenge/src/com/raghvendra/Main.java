package com.raghvendra;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.println("Enter the number for times table: ");
//	    X x = new X(scanner.nextInt());
//        scanner.nextLine();
//	    x.x();

//        Using scanner variable as x
        X x = new X(new Scanner(System.in));
        x.x();
    }
}
