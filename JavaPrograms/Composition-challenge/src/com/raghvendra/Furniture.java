package com.raghvendra;

public class Furniture {

    private int number;
    private String manufacturer;
    private Cushion cushion;
    private Table table;
    private Sofa sofa;

    public Furniture(int number, String manufacturer, Cushion cushion, Table table, Sofa sofa) {
        this.number = number;
        this.manufacturer = manufacturer;
        this.cushion = cushion;
        this.table = table;
        this.sofa = sofa;
    }

    public void arranged (int number) {
        if(number > 0 ) {
            System.out.println(number + " Furnitures are present");
        } else {
            System.out.println("Room is without furniture.");
        }
    }

    public int getNumber() {
        return number;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Cushion getCushion() {
        return cushion;
    }

    public Table getTable() {
        return table;
    }

    public Sofa getSofa() {
        return sofa;
    }
}
