package com.codegym;

import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap so tien cho vay: ");
        double money= scanner.nextDouble();
        System.out.println("Nhap lai suat: ");
        float laisuat= scanner.nextFloat();
        System.out.println("Nhap so thang cho vay: ");
        byte month= scanner.nextByte();
        double interest_money=0.0d;
        byte i;
        for (i=1;i<= month;i++){
            interest_money+= money * (laisuat / 100)/12 * month;
        }
        System.out.println("Tien lai phai tra: " + Math.round(interest_money));
        System.out.println("Tong tien la: "+ Math.round(money+interest_money));
    }
}
