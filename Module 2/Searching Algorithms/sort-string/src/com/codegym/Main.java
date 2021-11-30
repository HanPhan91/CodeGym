package com.codegym;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = scanner.nextLine();
        LinkedList<Character> list= new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            if (!list.contains(str.charAt(i))){
                list.add(str.charAt(i));
            }
        }
        list.sort((o1, o2) -> o1-o2);
        System.out.println(list);
    }
}
