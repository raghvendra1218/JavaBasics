package com.raghvendra;

//Time complexity O(n^2)
//Space complexity O(1)

public class Bubble {
    public int[] bubbleSort(int[] arr){
        for(int k = 0; k < arr.length-1; k++) {
            for(int i =0, j=1; j < arr.length-k; i++, j++){
                int temp = arr[i];                          // temp = 5,
                if(arr[i] > arr[j]){                        //
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
