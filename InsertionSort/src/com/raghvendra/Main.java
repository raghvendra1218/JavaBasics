package com.raghvendra;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] unsortedArray = {5,8,1,3,9,6};
        Insertion insertion = new Insertion();
        System.out.println("Resultant Array: "+ Arrays.toString(insertion.insertionSort(unsortedArray)));
    }
}
