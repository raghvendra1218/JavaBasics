package com.raghvendra;

//Time Complexity - O(n^2)
//Space Complexity - O(1)

public class Insertion {
    public int[] insertionSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1, k = i; k >= 0; j--, k--){
                if(arr[k] < arr[j]){
                    break;
                } else if(arr[k] > arr[j]) {
                    int temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
