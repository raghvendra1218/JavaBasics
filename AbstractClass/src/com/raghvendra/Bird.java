package com.raghvendra;

public abstract class Bird extends Animal implements CanFly {
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

    @Override
    public void fly() {
        System.out.println(getName()+ " is flapping it's wings");
    }
}
