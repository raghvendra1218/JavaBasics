package com.raghvendra;

import com.series.Series;

public class Main {

    public static void main(String[] args) {
//        Test nSum
	    for (int i =0; i<=10; i++){
            System.out.println(Series.nSum(i));
        }

//        Test factorial
        for(int i =0; i<=10; i++){
            System.out.println(Series.factorial(i));
        }

        //Test fibonacci
        for(int i =0; i<=10; i++){
            System.out.println(Series.fibonacci(i));
        }
    }
}
