package com.raghvendra;

import java.util.*;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Map<String, Integer> tmpExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0,"You are sitting in front of computer learning Java", tmpExit));
        tmpExit = new HashMap<String, Integer>();
        //Room one exits
        tmpExit.put("W",2);
        tmpExit.put("E",3);
        tmpExit.put("S",4);
        tmpExit.put("N",5);
//        tmpExit.put("Q",0);  //initialised in the constructor
        locations.put(1, new Location(1,"You are standing at th end of a road before a small brick building", tmpExit));

        //Room 2 exits
        tmpExit = new HashMap<String, Integer>();
        tmpExit.put("N",5);
//        tmpExit.put("Q", 0);
        locations.put(2, new Location(2, "You are at the top of a hill", tmpExit));

        //Room 3 exits
        tmpExit = new HashMap<String, Integer>();
        tmpExit.put("W",1);
//        tmpExit.put("Q",1);
        locations.put(3, new Location(3,"You are inside a building, a well house for a small spring", tmpExit));

        //Room 4 exits
        tmpExit = new HashMap<String, Integer>();
        tmpExit.put("N",1);
        tmpExit.put("W",2);
//        tmpExit.put("Q",0);
        locations.put(4, new Location(4, "You are in a valley besides a stream", tmpExit));

        //Room 5 exits
        tmpExit = new HashMap<String, Integer>();
        tmpExit.put("S",1);
        tmpExit.put("W",2);
//        tmpExit.put("Q",0);
        locations.put(5, new Location(5, "You are in a forest", tmpExit));

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
            tmpExit.remove("S"); //Line to remove the South key from the exit map, solution to avoid this is to send the copy of exits rather then reference to the existing Map in the Location class
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
