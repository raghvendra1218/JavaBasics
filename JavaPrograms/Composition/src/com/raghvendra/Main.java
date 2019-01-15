package com.raghvendra;

//Composition is a "Has-A" relationship, while Inheritance is a "IS-A" realtionship.

public class Main {

    public static void main(String[] args) {

        Case thecase = new Case("220B","Mercury", "220V", new Dimensions(12,10,23));
        Monitor theMonitor = new Monitor("345TRAQ", "Asus", 3,new Resolution(2540,1440));
        Motherboard themotherboard = new Motherboard("P4","Intel","4","3","Mercury");
        PC pc = new PC(thecase,theMonitor,themotherboard);
//        pc.getTheMonitor().drawPixelAt(1500,1200,"Red");
//        pc.getTheMotherboard().loadProgram("Windows 1.0.0");
//        pc.getTheCase().pressPower();
        pc.powerUp();
    }
}
