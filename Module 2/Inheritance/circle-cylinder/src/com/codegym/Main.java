package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle mCircle= new Circle(10,"red");
        Circle nCircle= new Cylinder(40, "yellow", 40);
        System.out.println(mCircle.toString());
        System.out.println(nCircle.toString());
    }
}
