package com.raghvendra;

//Time complexity : O(nlogn)
//Space complexity: O(n) : is proportional to the number of elements in the list, becoz we are creating temporary arrays (of combined size of n).

public class MergeSort {
    public int[] mergeSort(int[] arr){
        int arrLength = arr.length;
        if(arrLength < 2) {     //Base condition, point to get out of the recursion
            return arr;
        } else {
            int mid = arrLength/2;
            int[] leftArray = new int[mid];
            int[] rightArray = new int[arrLength-mid];
            for(int i = 0 ; i < mid; i++){
                leftArray[i] = arr[i];
            }
            for(int i = mid; i < arrLength; i++){
                rightArray[i - mid] = arr[i];
            }
//            System.out.println(Arrays.toString(leftArray));
//            System.out.println(Arrays.toString(rightArray));
            mergeSort(leftArray);
            mergeSort(rightArray);
            arr = merge(leftArray,rightArray,arr);
        }
        return arr;
    }

    public int[] merge(int[] leftArray, int[] rightArray, int[]arr){
        int i,j,k;
        i=j=k=0;
        int leftArrayLength = leftArray.length;
        int rightArrayLength = rightArray.length;
//        System.out.println(leftArrayLength + " * "+ rightArrayLength);
        while(i < leftArrayLength && j < rightArrayLength){
            if(leftArray[i] < rightArray[j]){
                arr[k] = leftArray[i];
                i++;
//                k++;
            } else if(leftArray[i] > rightArray[j]){
                arr[k] = rightArray[j];
                j++;
//                k++;
            }
            k++;
        }

        //adding the remaining elements to the parent array
        while(i < leftArrayLength){
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while(j < rightArrayLength){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
        return arr;
    }
}
