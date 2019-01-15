package com.raghvendra;

public class Mattress {
    private String type;
    private String manufacturer;
    private int height;

    public Mattress(String type, String manufacturer, int height) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getHeight() {
        return height;
    }
}
