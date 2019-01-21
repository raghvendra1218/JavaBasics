package com.raghvendra;

import java.util.Arrays;

import static java.lang.Math.log;

public class Main {

    public static void main(String[] args) {
        int [] unsortedArray = {17,87,6,22,3,41,13,54};
        MergeSort mergeSort = new MergeSort();
        System.out.println("Resultant Array: "+ Arrays.toString(mergeSort.mergeSort(unsortedArray)));
//        System.out.println("Log value: "+ (int)(log(unsortedArray.length)+1));
    }
}
