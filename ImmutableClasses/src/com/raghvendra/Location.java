package com.raghvendra;

import java.util.HashMap;
import java.util.Map;


//Strategy for defining Immutable classes
//1. Don't provide setter methods
//2. Make all fields private and final
//3. Don't allow subclasses to override methods, can be done either making entire class as final (so that it cannot be subclassed,
//   or making the methords and member variables as final, a more sophisticated way is to make the constructor private and construct instances in factory methods).
//4. If the instance fields includes references to mutable objects, don't allow those objects to be changed.



public class Location {
    private final int locationId;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationId, String description, Map<String, Integer> exits) {
        this.locationId = locationId;
        this.description = description;
//        this.exits = exits;  //this will allow the tmpexit Map to modify the exits Map here and it can modify the exits Map.
        // If null passed as argument, program will crash at run time , hence it is required to handle this null value by checking it.
        if(exits != null){
            this.exits = new HashMap<String, Integer>(exits); // this will prevent the above modification in the existing Map.
        } else {
            this.exits = new HashMap<String, Integer>();
        }
        this.exits.put("Q",0);  //Adding the ability to quit for each room/entry/Location
    }


    public void addExit(String direction, int location){
        exits.put(direction,location);
    }

    public int getLocationId() {
        return locationId;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
