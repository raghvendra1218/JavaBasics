package com.raghvendra;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is Pecking.");
    }

    @Override
    public void breathe() {
        System.out.println(getName()+ " is napping.");
    }
}
