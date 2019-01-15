package com.raghvendra;

import java.util.Scanner;

public class Main {
    public static final String INVALID_MESSAGE = "Invalid Year of birth, try Again";

    public static void main(String[] args) {
	    Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter your year of Birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();         //handle next Line character (Enter key)
            System.out.println("Enter your Name: ");
            String name = scanner.nextLine();
            int age = 2018 - yearOfBirth;
            if (age >=0 && age < 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println(INVALID_MESSAGE);
            }
        } else {
            System.out.println(INVALID_MESSAGE);
        }


        scanner.close();
    }
}
