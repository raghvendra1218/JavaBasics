package com.raghvendra;

public class Main {

    public static void main(String[] args) {
	// without using Encapsulation
//        Player player = new Player();
//        player.health = 100;
//        player.name = "Raghav";
//        player.weapon = "Sword";
//
//        player.loseHealth(20);
//        System.out.println("Remaining Health: " + player.getHealth());
//        player.health = 200; // should not happen
//        player.loseHealth(100);
//        System.out.println("Remaining Health: " + player.getHealth());

        // with using Encapsulation

        EnhancedPlayer player1 = new EnhancedPlayer("Raghav", 520, "Swaord");
        System.out.println("Initial Health: "+ player1.getHealth());
        player1.loseHealth(20);
        System.out.println("Remaining Health: "+ player1.getHealth());

    }
}
