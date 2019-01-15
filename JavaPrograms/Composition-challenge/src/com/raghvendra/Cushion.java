package com.raghvendra;

public class Cushion {
    private String type;
    private String manufacturer;
    private Dimensons dimension;
    private String color;
    private int number;

    public Cushion(String type, String manufacturer, Dimensons dimension, String color, int number) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.dimension = dimension;
        this.color = color;
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensons getDimension() {
        return dimension;
    }

    public String getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }
}
