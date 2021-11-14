package com.codegym;

public class Siddeley extends Machine implements Flyable {
    private String manufacturer;

    public Siddeley() {
    }

    public Siddeley(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Siddeley(String name, String type, String manufacturer) {
        super(name, type);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Siddeley{ "
                + " manufacturer= " + manufacturer
                + " name = " + super.getName()
                + " type= " + super.getType()
                + "}";
    }

    @Override
    public void Move() {
        System.out.println("I'm a plane, i can Fly");
    }
}
