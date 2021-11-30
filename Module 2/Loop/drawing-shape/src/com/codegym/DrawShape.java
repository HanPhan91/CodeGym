package com.codegym;

import java.util.Scanner;

public class DrawShape {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int number=-1;
        while (number != 0){
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter Number: ");
            number= scanner.nextInt();
            switch (number){
                case 1:
                    for (int i=1; i<= 3; i++){
                        for (int j=1; j<=7; j++){
                            System.out.print("*");
                            System.out.print(" ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i=1; i<=5; i++){
                        for (int j=1; j <i; j++){
                            System.out.print("*");
                            System.out.print(" ");
                        }
                        System.out.println("*");
                    }
                    break;
                case 3:
                    for (int i=5; i>=1; i--){
                        for (int j=1; j<i; j++){
                            System.out.print("*");
                            System.out.print(" ");
                        }
                        System.out.println("*");
                    }
                    break;
                case 4:
                    number = 0;
                    break;
                default:
                    System.out.println("Enter number 1-4");
                    break;
            }

        }
    }
}
