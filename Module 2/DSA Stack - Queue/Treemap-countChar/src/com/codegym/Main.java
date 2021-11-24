package com.codegym;

import java.lang.annotation.ElementType;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TreeMap<Character, Integer> treeMap =new TreeMap<>();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input String: ");
        String str= scanner.nextLine();
        int value = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!treeMap.containsKey(str.charAt(i))){
                treeMap.put(str.charAt(i),1);
            }
            else {
                value = treeMap.get(str.charAt(i));
                treeMap.replace(str.charAt(i), ++value);
            }
        }
        System.out.println("Count character: ");
        for (Character name: treeMap.keySet()) {
            System.out.println(name+ ": "+ treeMap.get(name));
        }
    }
}
