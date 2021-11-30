package com.codegym;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int i;
        boolean isprime= true;
        for(i=2; i<number; i++){
            if(number % i ==0){
                isprime= false;
                break;
            }
        }
        if (isprime){
            System.out.println(number+ " is prime number");
        }
        else {
            System.out.println(number+ " not prime number");
        }
    }
}
