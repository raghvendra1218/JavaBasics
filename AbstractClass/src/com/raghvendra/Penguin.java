package com.raghvendra;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println(getName()+" is Nibbling the fish");
    }

    @Override
    public void breathe() {
//        super.breathe();
        System.out.println("breathe in and breathe out, loop");
    }

    @Override
    public void fly() {
        System.out.println("I am not very good at this, Can I go to swim instead?");
    }
}
