package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MoveablePoint n= new MoveablePoint(3,4,10,20);
        System.out.println(n.toString());
        System.out.println();
        n.move();
        System.out.println(n.toString());
    }
}
