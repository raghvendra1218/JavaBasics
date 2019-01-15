package com.raghvendra;

public class Main {

    public static void main(String[] args) {

        Bed theBed = new Bed("MainStays", "Iron frame",new Mattress("Memory Foam","Zinus",6), new Dimensons(23,12,5));
        Lamp theLamp = new Lamp("2345REW","Philips",1,"Automatic", new Dimensons(12,2,13));
        Furniture theFurniture = new Furniture(3,"IKEA", new Cushion("memory foam", "Zinus", new Dimensons(4,4,1),"Red", 4),
                                                new Table("Wooden","IKEA", 1,new Dimensons(10,5,5),"Plane"),
                                                new Sofa("Recliner", "IKEA", "Brown", new Dimensons(18,6,5),1));

        Room theRoom = new Room(theBed, theLamp, theFurniture);
        theRoom.EnterRoom();
    }


}
