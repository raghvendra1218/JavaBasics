package com.raghvendra;

public class Main {

    public static void main(String[] args) {
	    int count = 1;
        while(count !=6) {
            System.out.println(count);
            count++;
        }
        System.out.println("****");
        int step = 1;
        while(true) {
            if(step ==6){
                break;
            }
            System.out.println(step);
            step++;
        }
        System.out.println("####");
        int flag = 1;
        do {
            System.out.println(flag);
            flag++;
        } while(flag !=6);
    }
}
