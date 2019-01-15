package com.raghvendra;

public class PC {
    private Case theCase;
    private Monitor theMonitor;
    private Motherboard theMotherboard;

    public PC(Case theCase, Monitor theMonitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.theMonitor = theMonitor;
        this.theMotherboard = theMotherboard;
    }

    public void powerUp() {
        theCase.pressPower();
        drawLogo();
    }

    public void drawLogo() {
        theMonitor.drawPixelAt(23,34,"yellow");
    }

//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getTheMonitor() {
//        return theMonitor;
//    }
//
//    private Motherboard getTheMotherboard() {
//        return theMotherboard;
//    }
}
