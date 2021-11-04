package com.codegym;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Nhap nam can tinh: ");
        Scanner scanner= new Scanner(System.in);
        int year;
        year= scanner.nextInt();
        String mess= "Nam " + year + " la nam nhuan";
        if (year % 4 == 0 && year % 100 != 0){
            System.out.println(mess);
        }
        else if (year % 100 == 0 && year % 400 ==0){
            System.out.println(mess);
        }
        else {
            System.out.println("Nam "+ year + " khong phai nam nhuan");
        }
    }
}
