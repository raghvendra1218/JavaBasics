package com.raghvendra;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	    int[] myIntArr = getintegers(5);
        int[] mySortedArr = sortArray(myIntArr);
        printarray(mySortedArr);
    }

    public static int[] getintegers(int num) {
        System.out.println("Enter " + num + " integer values.\r");
        int [] myarr = new int[num];
        for (int i =0 ; i < myarr.length; i++) {
            myarr[i] = scanner.nextInt();
        }
        return myarr;
    }

    public static void printarray(int[] arr) {
        for(int i =0; i < arr.length; i++) {
            System.out.println("Element "+ i + "in the array is: "+ arr[i]);
        }
    }

    public static int[] sortArray(int[] arr) {
//        Arrays.sort(arr,0,arr.length);

//Unkown Sorting:
//        for(int i = 0; i < arr.length-1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[i]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }

//Selection Sort

        for(int i = 0; i < arr.length-1; i++) {
            int min = arr[i];
            int minIndex = i;
            for(int j = i+1 ; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[minIndex] = temp;
            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k] + ", ");
            }
            System.out.println("\n");
        }

// Bubble Sort
        for (int i =0; i <arr.length; i++) {

        }


        return arr;
    }
}
