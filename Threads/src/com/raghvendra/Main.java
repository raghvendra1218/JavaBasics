package com.raghvendra;

public class Main {

    public static void main(String[] args) {
	    MyThread t1 = new MyThread();
		t1.setName("myThread1");
	    t1.start();
//	    MyRunnableThread t2 = new MyRunnableThread();
		Thread t2 = new Thread(new MyRunnableThread(),"Thread runnable");
	    t2.run();
		System.out.println(t2.getName());
    }
}
