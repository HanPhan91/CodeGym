package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] list = {1, 5, 6, 12, 1, 7, 0};
        insertSort(list);
        for (int item:list) {
            System.out.print(item+ " ");
        }

    }

    public static void insertSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int current = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > current; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = current;
        }
    }
}