package com.raghvendra._static;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] unsortedArray = {12,45,67,89,104,23,66,1,0,27};
	    QuickSort qs = new QuickSort();
        System.out.println("Resultant Array: "+ Arrays.toString(qs.quickSort(unsortedArray, 0, 9)));
    }
}
