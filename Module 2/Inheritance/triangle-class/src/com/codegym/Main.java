package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape mShape= new Shape("red");
        System.out.println(mShape.toString());
        Triangle mTriangle= new Triangle(3.4,9.0,6.0);
        mTriangle.getArea();
        mTriangle.getParameter();
        System.out.println(mTriangle.toString());

    }
}
