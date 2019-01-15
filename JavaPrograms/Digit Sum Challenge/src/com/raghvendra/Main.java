package com.raghvendra;

public class Main {

    public static void main(String[] args) {
//        int sum = sumDigits(9);
        System.out.println("Sum of Digits: " + sumDigits(125));
    }
    public static int sumDigits(int num) {
        if(num < 10) {
            return -1;
        } else {
            int sum = 0;
            while(num > 0) {
                int digit = num %10;
                sum  = sum + digit;
                num = num/10;
            }
            return sum;
        }
    }
}
