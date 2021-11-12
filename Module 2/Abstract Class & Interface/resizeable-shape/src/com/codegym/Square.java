package com.codegym;

public class Square extends Shape {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "A Square with size= "
                + getSide()
                + " Area= "
                + getArea()
                + " Perimeter= "
                + getPerimeter()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void Resize(double percent) {
        System.out.println("Square after Resize: ");
        System.out.printf(" Area= %f \n", getArea()+ (getArea()*percent)/100);
        System.out.printf(" Perimeter= %f \n", getPerimeter()+ (getPerimeter()*percent)/100);
    }
}
