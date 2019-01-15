package com.raghvendra;

public class Main {

    public static void main(String[] args) {
	    int startNumber = 4;
	    int finishNumber = 24;
	    int counter = 0;
	    while(startNumber <= finishNumber) {
	        startNumber++;
	        if(!isEven(startNumber)) {
	            continue;
            }
            System.out.println(startNumber);
            counter++;
	        if(counter == 5) {
	            break;
            }
        }
        System.out.println("Total count of even Numbers: " + counter);
    }
    public static boolean isEven(int num) {
        if(num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
