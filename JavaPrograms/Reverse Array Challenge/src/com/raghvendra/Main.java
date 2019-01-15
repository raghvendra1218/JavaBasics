package com.raghvendra;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the count of elements for array to be formed: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] myIntArray = inputArray(count);
        System.out.println("Original Array: " + Arrays.toString(myIntArray));
        reversearr(myIntArray);
    }

    public static int[] inputArray(int count) {
        System.out.println("Enter "+ count+ " Integers.");
        int[] myArray = new int[count];
        for(int i = 0; i< myArray.length; i++) {
            myArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return myArray;
    }

    public static void reversearr(int[] arr) {
        reverse(arr);
    }

    public static int[] reverse(int[] arr) {
//        int [] modifyArr = arr;
        int [] modifyArr = Arrays.copyOf(arr,arr.length); //Copies the entire array in the new array hence arr will remain same and there will be no modifications reflected in it.
        for(int i = 0, j = modifyArr.length-1; i < (modifyArr.length)/2; i++, j--) {
            int temp = modifyArr[i];
            modifyArr[i] = modifyArr[j];
            modifyArr[j] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(modifyArr));
        System.out.println("Original/Passed Array: " + Arrays.toString(arr));  // print statement to check if the passed array has been modified or not.
        return modifyArr;
    }
}
