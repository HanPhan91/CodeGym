package com.codegym;

import java.util.Scanner;

public class DayOfMonth {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Nhap thang can dem so ngay: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + month + " co 31 ngay");
                break;
            case 2:
                System.out.println("Thang 2 co the co 28 - 29 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang "+ month + " co 30 ngay");
                break;
            default:
                System.out.println("Vui long nhap tu 1 den 12");
                break;
        }
    }
}
