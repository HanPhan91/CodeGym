package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shape[] shape= new Shape[3];
        shape[0]= new Circle(40);
        shape[1]= new Square(20);
        shape[2]= new Rectangle(50, 20);
        shape[0].Resize(Math.round(Math.random()* 100));
        shape[1].Resize(Math.round(Math.random()* 100));
        shape[2].Resize(Math.round(Math.random()* 100));

    }
}
