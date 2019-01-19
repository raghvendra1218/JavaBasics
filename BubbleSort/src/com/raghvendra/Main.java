package com.raghvendra;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] unsortedArray = {5,8,1,6,9,2};
        Bubble bubble = new Bubble();
        System.out.println("Resultant Array: "+ Arrays.toString(bubble.bubbleSort(unsortedArray)));
    }
}
