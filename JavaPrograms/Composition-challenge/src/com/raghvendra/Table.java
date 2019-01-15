package com.raghvendra;

public class Table {
    private String type;
    private String manufacturer;
    private int number;
    private Dimensons dimensons;
    private String texture;

    public Table(String type, String manufacturer, int number, Dimensons dimensons, String texture) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.number = number;
        this.dimensons = dimensons;
        this.texture = texture;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getNumber() {
        return number;
    }

    public Dimensons getDimensons() {
        return dimensons;
    }

    public String getTexture() {
        return texture;
    }
}
