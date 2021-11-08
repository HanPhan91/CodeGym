package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str= "Hello world";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter char to find: ");
        char charFind = scanner.next().charAt(0);
        findInString(str, charFind);
    }

    private static void findInString(String str, char charFind) {
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == charFind)
                count++;
        }
        System.out.printf("%s show %d times", charFind,count);
    }
}
