package com.raghvendra;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println();
//        int [] inputArr = new int[5];
        int [] inputArr = {1,2,3,4,5};
        int [] reverseArray = new int[inputArr.length];
        for(int i =0, j = reverseArray.length - 1; i<inputArr.length; i++, j--) {
            reverseArray[i] = inputArr[j];
        }
        for (int element:
             reverseArray) {
            System.out.println(element);
        }
    }
}
