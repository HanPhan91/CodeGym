package com.codegym;

public class Circle extends Shape{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + " Area= "
                + getArea()
                + " Perimeter= "
                + getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void Resize(double percent) {
        System.out.println("Circle after Resize: ");
        System.out.printf(" Area= %f \n", getArea()+ (getArea()*percent)/100);
        System.out.printf(" Perimeter= %f \n", getPerimeter()+ (getPerimeter()*percent)/100);
    }
}
