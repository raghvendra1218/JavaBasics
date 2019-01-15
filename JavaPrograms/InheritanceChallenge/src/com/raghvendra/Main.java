package com.raghvendra;

public class Main {

    public static void main(String[] args) {
        Porsche porsche = new Porsche(36);
        porsche.steer(45);
        porsche.accelerate(30);
        porsche.accelerate(20);
        porsche.steer(-34);
        porsche.accelerate(-23);
    }
}
