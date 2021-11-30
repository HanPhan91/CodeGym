package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int n;
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter size array: ");
//        n = scanner.nextInt();
        int[] arr = new int[]{1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
        System.out.println("Array: ");
        showArray(arr);
        int index;
        int number;
        System.out.println("Enter index insert: ");
        index = scanner.nextInt();
        if (index <= -1 || index > arr.length-1) {
            System.out.println("Cannot insert");
        } else {
            System.out.println("Enter number insert: ");
            number = scanner.nextInt();
            arr = insertArray(arr, index, number);
            showArray(arr);
        }
    }

    private static int[] insertArray(int[] array, int index, int number) {
        for (int i = array.length - 1; i >= index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = number;
        return array;
    }

    private static void showArray(int[] array) {
        for (int items : array) {
            System.out.print(items);
            System.out.print(" ");
        }
        System.out.println("");
    }

//    private static int[] initArray(int n) {
//        Scanner scanner = new Scanner(System.in);
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter element " + i);
//            array[i] = scanner.nextInt();
//        }
//        return array;
//    }
}
