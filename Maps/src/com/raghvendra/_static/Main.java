package com.raghvendra._static;

import java.util.HashMap;
import java.util.Map;

//Java Maps cannot have duplicate keys and each can map to a single value.
//If you try to insert value for same key, then value will get overwrite for that key.
//In order to know if the value is assigned to particular key is by doing sout it will return null if no value has been assigned to a particular key.
//We can also use method containsKey to check if the key already exists in the Map or not.
//putIfAbsent :  that will add to the map if the key is not already present, but it is intended to prevent concurrency issues, so that one thread does not add to the map
//only for that entry to be overwritten by another thread, so it does not help in null case, becoz it will overwrite the keys with null values.
//There is no gaurantee in ordering in Hash Map, values are not returned in the way they are added to default Hash Maps.

public class Main {

    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();
        if(languages.containsKey("Java")) {
            System.out.println("Java key is already there");
        } else {
            languages.put("Java", "a compiled high-level, object-oriented, platform independent language.");
            System.out.println("Java Key added successfully");
        }
        languages.put("Python", "an interpreted, object-oriented, high level programming language with dynamic semantics");
        languages.put("Algol","An algorithmic language");
        languages.put("Basic", "Beginners all purpose symbolic instruction code.");
        System.out.println(languages.put("Lisp", "There in lies madness"));
        if(languages.containsKey("Java")) {
            System.out.println("Java key is already there");
        } else {
            System.out.println("Key Java added successfully");
        }
//        System.out.println(languages.get("Java"));
        System.out.println("===========================================");
        //Remove items from Map. It returns true or false depending on the value successfully removed or not.
//        languages.remove("Lisp");  //remove entry from a map when a key match is found.
        if(languages.remove("Algol","a family of algorithmic languages")) { //removing an entry if a particular key/value pair exists
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed. key/value pair not found");
        }
        //Replace method
        System.out.println((languages.replace("Lisp","functional programming language with imperative features."))); //returns the previous value
//        System.out.println(languages.replace("Scala", "This will not be added in the list"));
        if(languages.replace("Lisp","functional programming language with imperative features.","Replaced value of Lisp")){     //returns boolean value
            System.out.println("Lisp Replaced");
        } else {
            System.out.println("Lisp not replaced");
        }
        //Traverse Map entries through keys
        System.out.println("===========================================");
        for(String key : languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }


    }
}
