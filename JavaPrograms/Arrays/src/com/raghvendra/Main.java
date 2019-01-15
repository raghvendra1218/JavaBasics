package com.raghvendra;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//	    int [] myIntArray = new int[15],  myintArray2 = new int[10];
        int [] myIntArray = getValues(5);
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Element " + i + " typed value is: " + myIntArray[i]);
        }
        System.out.println("Average calculated for the array of " + myIntArray.length + " numbers is: " + getaverage(myIntArray));
    }

    public static int[] getValues(int num) {
        System.out.println("Enter " + num + " integer values.\r");
        int [] myarr = new int[num];
        for (int i = 0; i < myarr.length; i++) {
            myarr[i] = scanner.nextInt();
        }
        return myarr;
    }

    public static double getaverage(int[] arr) {
        int sum = 0;
        for(int i=0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double)sum/(double) arr.length;
    }
}
