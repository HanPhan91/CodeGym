package com.codegym;

public class McQueen extends Machine implements Runable {
    private String manufacturer;
    public McQueen() {
    }

    public McQueen(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public McQueen(String name, String type, String manufacturer) {
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
        return "McQueen{"
                + " manufacturer= " + manufacturer
                + " name = " + super.getName()
                + " type= " + super.getType()
                + "}";
    }

    @Override
    public void Move() {
        System.out.println("I'm a car, i can Run");
    }
}
