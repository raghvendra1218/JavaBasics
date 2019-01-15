package com.raghvendra;

public class Main {

    public static void main(String[] args) {
	    String numberAsString = "2018";
        System.out.println("numer as a string: " + numberAsString);
        int number = Integer.parseInt(numberAsString);
        System.out.println("Number: " + number);
        numberAsString += 1;
        number +=1;
        System.out.println("numer as a string after operation: " + numberAsString);
        System.out.println("Number after operation: " + number);

        String dnumberAsString = "2018.125";
        System.out.println("numer as a string: " + dnumberAsString);
        double dnumber = Double.parseDouble(dnumberAsString);
        System.out.println("Number: " + dnumber);
        dnumberAsString += 1;
        dnumber +=1;
        System.out.println("numer as a string after operation: " + dnumberAsString);
        System.out.println("Number after operation: " + dnumber);
    }
}
