package com.raghvendra;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer p1 = new Printer(20,300,true);
        Printer p2 = new Printer(20,300,false);
        p1.fillToner(30);
        p1.printPage(20);
        p1.printPage(30);
        p2.printPage(30);
    }
}
