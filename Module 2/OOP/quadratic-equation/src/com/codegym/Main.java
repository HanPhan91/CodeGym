package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter a: ");
        a = scanner.nextDouble();
        System.out.println("Enter b: ");
        b = scanner.nextDouble();
        System.out.println("Enter c: ");
        c = scanner.nextDouble();
        QuadraticEquation equation= new QuadraticEquation();
        equation.setNumber(a,b,c);
        double delta = equation.getDiscriminant();
        System.out.println("Delta= " + delta);
        if (delta > 0) {
            System.out.println("Root 1 = "+ equation.getRoot1());
            System.out.println("Root 2 = "+ equation.getRoot2());
        }
        else if (delta == 0 ){
            System.out.println("Root 1 = "+ equation.getDoubleRoot());
        }
        else {
            System.out.println("The equation has no roots");
        }
    }
}
