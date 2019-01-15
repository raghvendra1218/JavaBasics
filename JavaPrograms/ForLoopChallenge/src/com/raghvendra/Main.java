package com.raghvendra;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        for(int i = 45; i <= 100; i++) {
            if(count >=3)break;
             boolean isPrime = isPrime(i);
             if(isPrime) {
                 System.out.println( i + " is a Prime number");
                 count += 1;
             }
        }
    }
    public static boolean isPrime(int num) {
        if(num == 1) {
            return false;
        }
        for(int i = 2; i <= (long) Math.sqrt(num); i++){
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
