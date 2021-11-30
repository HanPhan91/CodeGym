package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.println("Enter size array: ");
        size = scanner.nextInt();
        int[] array = initArray(size);
        showArray(array);
        findMin(array);
    }

    private static void findMin(int[] array) {
        int min = array[0];
        for (int items:array) {
            min = min > items ? items : min;
        }
        System.out.println("Min in array: " + min);
    }

    private static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println(" ");
    }

    private static int[] initArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter value element " + i);
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
