package com.codegym;

import javafx.scene.transform.Scale;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang: ");
        int size = scanner.nextInt();
        scanner.nextLine();
        int[] list = new int[size];
        System.out.println("Nhap mang: ");
        for (int i = 0; i < size; i++) {
            list[i] = scanner.nextInt();
            scanner.nextLine();
        }
        insertSort(list);
        for (int item : list) {
            System.out.print(item + " ");
        }
        clrs();
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

    public static void clrs() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}


