package com.raghvendra._static;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Varanasi");
        cities.add("Gurugram");
        cities.add("Rohtak");
        cities.add("Jaipur");
        cities.add("Jhansi");
        cities.add("Nighasan");
        cities.add("Lucknow");
        cities.add("Delhi");
        Collections.sort(cities);   // This step is important, binary search works only for sorted list.
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.binarySearch(cities, "jaipur");
        binarySearch.binarySearch(cities, "lolo");
        binarySearch.binarySearch(cities, "ddd");
    }
}
