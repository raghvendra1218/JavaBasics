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
    public void optimizeBubbleSort(int array[]) {
        int count = 0;  //counts the total comparisons 
        for (int i = 0; i < array.length; i++) {
            count = 0;

            for (int j = 0; j < array.length - 1; j++) {
            
                if (array[j] > array[j + 1]) {
                    count++;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                if (j == array.length - 2 && count == 0) 
                    return; //if while iterating the whole array no comparison is made than array is sorted so return

                     }

             }
    }
    
}
