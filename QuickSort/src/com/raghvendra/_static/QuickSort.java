package com.raghvendra._static;

public class QuickSort {
    public int[] quickSort(int arr[], int startIndex, int endIndex){
        if(startIndex < endIndex) {
            int partitionIndex = Partition(arr, startIndex, endIndex);
            quickSort(arr, startIndex, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, endIndex);
        }
        return arr;
    }

    private int Partition(int[] arr, int startIndex, int endIndex){
        int pivot = arr[endIndex];
        int partitionIndex = startIndex;
        int temp = 0;
        int temp1 = 0;
        for(int i = startIndex; i<endIndex; i++){
            if(arr[i] <= pivot){
//                swap(arr[i], arr[partitionIndex]);
                temp = arr[i];
                arr[i] = arr[partitionIndex];
                arr[partitionIndex] = temp;
                partitionIndex++;

            }
        }
        temp1 = arr[partitionIndex];
        arr[partitionIndex] = arr[endIndex];
        arr[endIndex] = temp1;
//        swap(arr[partitionIndex], arr[endIndex]);
        return partitionIndex;
    }

    private void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
