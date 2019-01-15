package com.raghvendra;

import static com.raghvendra.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {
    public int sum(int[] arr) {
        int sum = 0;
        for(int a: arr) {
            sum +=a;
        }
        System.out.println("Sum of the elements of array: " + sum);
        return sum;
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i <10; i++) {
                System.out.println(ANSI_BLUE + "This another thread will die when it hits 10: " +i);
                sleep(1000);
            }
            int[] arr = {1,2,3,4,5,6,7,8};
            sum(arr);
        } catch(Exception err) {
            System.out.println(ANSI_BLUE + "Thread was interruoted : "+ err.getMessage());
        }
        System.out.println(ANSI_BLUE + "Another Thread Died");
    }
}
