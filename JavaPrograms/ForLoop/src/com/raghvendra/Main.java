package com.raghvendra;

public class Main {
    private static final double PRINCIPLE_AMOUNT = 10000;
    public static void main(String[] args) {
        for(double i = 2.0 ; i < 9; i++) {
            double interest = 0;
            interest = calculateInterest(PRINCIPLE_AMOUNT, i);
            System.out.println(String.format("%.0f",PRINCIPLE_AMOUNT) + " at " + i + "% interest = " + String.format("%.2f",interest));
        }

    }
    public static double calculateInterest(double amount, double interestRate) {
        return (amount *(interestRate/100));
    }
}
