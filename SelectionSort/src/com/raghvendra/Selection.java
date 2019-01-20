package com.raghvendra;

//Time Complexity: O(n^2)
//Space Complexity: O(1)

public class Selection {
    public int[] selectionSort(int[] arr){
        for(int i =0 ; i<arr.length-1; i++){
            int minValue = arr[i];
            int index = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < minValue){
                    minValue = arr[j];
                    index = j;
                }
            }
            if(index != i){
                int temp = arr[i];
                arr[i] = minValue;
                arr[index] = temp;
            }
        }
        return arr;
    }
}
