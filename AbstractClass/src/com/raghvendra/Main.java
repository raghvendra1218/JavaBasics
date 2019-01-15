package com.raghvendra;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog("Piloo");
        dog.eat();
        dog.breathe();

        System.out.println("============================");

        Parrot parrot = new Parrot("Indian Parakeet");
        parrot.eat();
        parrot.breathe();
        parrot.fly();

        System.out.println("============================");

        Penguin penguin = new Penguin("Emperor");
        penguin.eat();
        penguin.breathe();
        penguin.fly();
    }
}
