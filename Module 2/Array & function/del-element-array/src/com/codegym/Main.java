package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array: ");
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + i);
            arr[i] = scanner.nextInt();
        }
        int number = findNumber();
        int index = findIndex(arr, number);
        if (index != -1) {
            arr = delElement(arr, index);
        } else
            System.out.println(number + " not found");
        System.out.println("New array: ");
        showArray(arr);
    }

    private static void showArray(int[] array) {
        for (int items: array){
            System.out.print(items);
            System.out.print(" ");
        }
    }

    public static int[] delElement(int[] array, int index) {
        for (int i = index; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1]=0;
        return array;
    }

    private static int findNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number need to find: ");
        return scanner.nextInt();
    }

    public static int findIndex(int[] array, int number) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number)
                index = i;
        }
        return index;
    }
}
