package com.sevcikon;

import java.util.HashMap;
import java.util.Map;

public class Locations {
    private final Map<String, Integer> exits;
    private final String description;
    private final int locationID;

    public Locations(int locationID,String description, Map<String, Integer> exits ) {
        this.description = description;
        this.locationID = locationID;
        this.exits = exits;
        this.exits.put("Q",0);
    }

//    public void addExit(String[] direction, int location){
//        exits.put(direction, location);
//    }

    public int getLocationID() {
        return locationID;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }

    public String getDescription() {
        return description;
    }
}
