package com.raghvendra;

public class Main {

    public static void main(String[] args) {
	    String myString = "This is my String";
        System.out.println(myString);
        String lastString  = "10";
        int myInt = 20;
        String finalValue = myInt + lastString + myInt;
        String final_final_val = finalValue + lastString + lastString ;
        System.out.println("Value: " + final_final_val);
    }
}
