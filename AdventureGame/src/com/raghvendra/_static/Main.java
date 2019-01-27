package com.raghvendra._static;

import java.util.*;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	    locations.put(0, new Location(0,"You are sitting in front of computer learning Java"));
        locations.put(1, new Location(1,"You are standing at th end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3,"You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley besides a stream"));
        locations.put(5, new Location(5, "You are in a forest"));


        //Room one exits
        locations.get(1).addExit("W",2);
        locations.get(1).addExit("E",3);
        locations.get(1).addExit("S",4);
        locations.get(1).addExit("N",5);
//        locations.get(1).addExit("Q",0);  //initialised in the constructor

        //Room 2 exits
        locations.get(2).addExit("N",5);
//        locations.get(2).addExit("Q", 0);

        //Room 3 exits
        locations.get(3).addExit("W",1);
//        locations.get(3).addExit("Q",1);

        //Room 4 exits
        locations.get(4).addExit("N",1);
        locations.get(4).addExit("W",2);
//        locations.get(4).addExit("Q",0);

        //Room 5 exits
        locations.get(5).addExit("S",1);
        locations.get(5).addExit("W",2);
//        locations.get(5).addExit("Q",0);

        //Making a Map for storing the words/phrase for which actions needs to be taken
        Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");
        vocabulary.put("SOUTH", "S");


        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc == 0){
                break;
            } else {
                Map<String, Integer> exits = locations.get(loc).getExits();  //returns the copy, if we do make any changes here to map , it won't affect the Map exits in the location.
                System.out.print("Available exits are: ");
                for(String exit : exits.keySet()){
                    System.out.print(exit + ", ");
                }
                System.out.println();
                String direction = scanner.nextLine().toUpperCase();
                if(direction.length() > 1) {
//                    String s1 = "North";
//                    String s2 = "East";
//                    String s3 = "West";
//                    String s4 = "South";
                    String[] words = direction.split(" ");
                    for (String word : words) {
                        if (vocabulary.containsKey(word)) {
                            direction = vocabulary.get(word);
                            break;
                        }
                    }
                }
                if(exits.containsKey(direction)){
                    loc = exits.get(direction);
                } else {
                    System.out.println("You cannot go in that direction.");
                }
            }
        }
    }
}
