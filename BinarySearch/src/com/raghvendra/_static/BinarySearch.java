package com.raghvendra._static;

import java.util.ArrayList;

public class BinarySearch {
    public boolean binarySearch(ArrayList<String> arrayList, String item){
        int low = 0;
        int high = arrayList.size() - 1;
//        int mid;

        while (low <= high) {
           int  mid = (low + high)/2;
            String midValue = arrayList.get(mid);
            int cmp = midValue.compareToIgnoreCase(item);

            if(cmp < 0) {
                low = mid + 1;
            } else if( cmp > 0){
                high = mid - 1;
            } else {
                System.out.println(item + " is present in the List.");
                return true;
            }
        }
        System.out.println(item+" is not in the List.");
        return false;
    }
}
