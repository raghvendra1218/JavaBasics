package com.raghvendra;

import java.util.Scanner;

public class X {
    private int x = 0;

//    public X(int x) {
//        this.x = x;
//    }
    // Using scanner instance here


    public X(Scanner x) {
        System.out.println("Enter a number: ");
        this.x = x.nextInt();
    }

    public void x(){
        for(int x = 0; x <12; x++){
            System.out.println(x+ " times "+ this.x + " is "+ this.x * x);
        }
    }
}
