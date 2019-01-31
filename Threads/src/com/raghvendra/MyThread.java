package com.raghvendra;

public class MyThread extends Thread{
    public void run() {
        System.out.println("My Thread is running");
        System.out.println(Thread.currentThread().getName());
    }
}
