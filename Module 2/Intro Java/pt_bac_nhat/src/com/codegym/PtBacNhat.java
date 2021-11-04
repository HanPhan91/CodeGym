package com.codegym;

import java.util.Scanner;

public class PtBacNhat {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Giai pt bac nhat");
        System.out.println("Co dang: a*x + b = 0");
        Scanner scanner = new Scanner(System.in);
        float a,b;
        System.out.println("Nhap vao a: ");
        a = scanner.nextFloat();
        System.out.println("Nhap vao b: ");
        b = scanner.nextFloat();
        if (a == 0){
            if (b == 0){
                System.out.println("Phuong trinh vo so nghiem");
            }
            else{
                System.out.println("Phuong trinh co vo so nghiem");
            }
        }
        else {
            System.out.println("Phuong trinh co nghiem: " + -b/a);
        }
    }
}
