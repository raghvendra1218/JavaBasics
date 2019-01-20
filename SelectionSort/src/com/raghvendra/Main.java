package com.raghvendra;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] unsortedArray = {7,8,5,4,9,2};
        Selection selection = new Selection();
        System.out.println("Resultant Array: "+ Arrays.toString(selection.selectionSort(unsortedArray)));
    }
}
