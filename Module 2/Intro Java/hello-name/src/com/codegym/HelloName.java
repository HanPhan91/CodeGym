package com.codegym;

import java.util.Scanner;

public class HelloName {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= scanner.nextLine();
        System.out.println("Hello "+ name);
    }
}
