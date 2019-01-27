package com.raghvendra;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationId;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationId, String description, Map<String, Integer> exits) {
        this.locationId = locationId;
        this.description = description;
//        this.exits = exits;  //this will allow the tmpexit Map to modify the exits Map here and it can modify the exits Map
        this.exits = new HashMap<String, Integer>(exits); // this will prevent the above modification in the existing Map.
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
