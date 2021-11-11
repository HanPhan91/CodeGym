package com.codegym;

public class Circle {
    private int radius;
    private String color;

    public Circle() {
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }
    public String toString(){
        return ("Radius: " + radius + " , Color: " + color + " , Area: "+ getArea());
    }
}
