package com.raghvendra;

public class Bed {
    private String model;
    private String type;
    private Mattress mattress;
    private Dimensons dimensons;

    public Bed(String model, String type, Mattress mattress, Dimensons dimensons) {
        this.model = model;
        this.type = type;
        this.mattress = mattress;
        this.dimensons = dimensons;
    }

    public void SleepingOnBed(int headCount) {
        System.out.println(headCount +" Persons sleeping on the Bed.");
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public Mattress getMattress() {
        return mattress;
    }

    public Dimensons getDimensons() {
        return dimensons;
    }
}
