package com.codegym;

public class Cylinder extends Circle{
    private int height;

    public Cylinder() {
    }

    public Cylinder(int radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(super.getRadius(),2) * height;
    }
    public String toString(){
        return ("Radius: " + super.getRadius() + " , Color: " + super.getColor() + " , Volume: "+ getVolume());
    }

}

