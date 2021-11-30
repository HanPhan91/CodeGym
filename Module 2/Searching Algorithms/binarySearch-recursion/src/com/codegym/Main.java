package com.codegym;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array number: ");
        String str = scanner.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            int number = Integer.parseInt(String.valueOf(str.charAt(i)));
            list.add(number);
        }
        list.sort((o1, o2) -> o1-o2);
        System.out.println(list);
        System.out.println("Input number to search: ");
        int number= scanner.nextInt();
        scanner.nextLine();
        int result = searchBinary(list,0, list.size() ,number);
        if (result == -1){
            System.out.println("Not found");
        }
        else
            System.out.println("Found in index: "+ result);
    }

    public static int searchBinary(ArrayList<Integer> list, int low, int high, int number) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (list.get(mid) == number)
                return mid;
            if (list.get(mid) > number)
                return searchBinary(list, low, mid-1, number);
            return searchBinary(list, mid+1, high, number);
        }
        return -1;
    }
}

