package com.raghvendra;

public class Sofa {

    private String type;
    private String manufacturer;
    private String color;
    private Dimensons dimensons;
    private int number;

    public Sofa(String type, String manufacturer, String color, Dimensons dimensons, int number) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.color = color;
        this.dimensons = dimensons;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    public Dimensons getDimensons() {
        return dimensons;
    }

    public int getNumber() {
        return number;
    }
}
