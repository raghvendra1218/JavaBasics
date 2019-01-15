package com.raghvendra;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the count of integers : ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] myIntArray = readIntegers(count);
        int minimum = findMin(myIntArray);
        System.out.println("Minimum element in the array is: " + minimum);
    }

    public static int[] readIntegers(int count) {
        System.out.println("Enter "+ count + " integers.");
        int[] myArr = new int[count];
        for(int i=0; i <myArr.length; i++) {
            myArr[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return myArr;
    }

    public static int findMin(int[] myIntArray) {

//        Arrays.sort(myIntArray,0, myIntArray.length);
        int minimum = myIntArray[0];
        for(int i = 1; i <myIntArray.length; i++) {
            if(myIntArray[i] < minimum) {
                minimum = myIntArray[i];
            }
        }
        return minimum;
    }
}
