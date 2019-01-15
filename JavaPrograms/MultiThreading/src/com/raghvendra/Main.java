package com.raghvendra;

import static com.raghvendra.ThreadColor.ANSI_GREEN;
import static com.raghvendra.ThreadColor.ANSI_PURPLE;
import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {
        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        //Anonymous class thread
        new Thread(() -> {
            try {
                for(int i = 0; i<=5; i++) {
                    System.out.println(ANSI_PURPLE + "Anonymous class thread will die in: " + i);
                    sleep(1000);
                }
            } catch (Exception err) {
                System.out.println(ANSI_PURPLE + "Anonymous class Thread interrupted: " + err.getMessage());
            }
            System.out.println(ANSI_PURPLE +  "Anonymous class thread died.");
        }).start();

        try {
            while(anotherThread.isAlive()) {
                System.out.println(ANSI_GREEN + "We are in the main Thread.");
                System.out.println(ANSI_GREEN + "Main Thread will die once another thread dies.");
                sleep(2000);
            }
        } catch(Exception err) {
            System.out.println(ANSI_GREEN+ "Main Thread interrupted: "+ err.getMessage());
        }
        System.out.println(ANSI_GREEN+ "Main thread died.");
    }
}
