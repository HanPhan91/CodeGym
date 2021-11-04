package com.codegym;

import java.util.Scanner;

public class ConvertCurrency {

    public static void main(String[] args) {
	// write your code here
        float money;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter USD: ");
        money= scanner.nextFloat();
        System.out.println(money+ " USD= "+ money*23000 + "VND");
    }
}
