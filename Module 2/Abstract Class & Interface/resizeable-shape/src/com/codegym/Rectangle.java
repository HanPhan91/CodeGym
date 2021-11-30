package com.codegym;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + " Area= "
                + getArea()
                + " Perimeter= "
                + getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void Resize(double percent) {
        System.out.println("Rectangle after Resize: ");
        System.out.printf(" Area= %f \n", getArea()+ (getArea()*percent)/100);
        System.out.printf(" Perimeter= %f \n", getPerimeter()+ (getPerimeter()*percent)/100);
    }
}
