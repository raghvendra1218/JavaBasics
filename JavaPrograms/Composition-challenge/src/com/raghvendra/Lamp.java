package com.raghvendra;

public class Lamp {
    private String model;
    private String manufacturer;
    private int numberOfBulbs;
    private String type;
    private Dimensons dimensons;

    public Lamp(String model, String manufacturer, int numberOfBulbs, String type, Dimensons dimensons) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.numberOfBulbs = numberOfBulbs;
        this.type = type;
        this.dimensons = dimensons;
    }

    public void switchOn () {
        System.out.println("Lamp is On.");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getNumberOfBulbs() {
        return numberOfBulbs;
    }

    public String getType() {
        return type;
    }

    public Dimensons getDimensons() {
        return dimensons;
    }
}
