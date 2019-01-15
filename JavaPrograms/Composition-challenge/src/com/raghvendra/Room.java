package com.raghvendra;

public class Room {
    private Bed theBed;
    private Lamp theLamp;
    private Furniture theFurniture;

    public Room(Bed theBed, Lamp theLamp, Furniture theFurniture) {
        this.theBed = theBed;
        this.theLamp = theLamp;
        this.theFurniture = theFurniture;
    }

    public void EnterRoom() {
        theFurniture.arranged(4);
        theLamp.switchOn();
        PeopleOnBed(2);
    }

    public void PeopleOnBed(int num) {
        theBed.SleepingOnBed(num);
    }
}
