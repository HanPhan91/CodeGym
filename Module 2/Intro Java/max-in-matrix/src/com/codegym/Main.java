package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.println("Enter x: ");
        x = scanner.nextInt();
        System.out.println("Enter y: ");
        y = scanner.nextInt();
        int[][] matrix = initMatrix(x, y);
        showMatrix(matrix);
        int[] arrayMax;
        arrayMax= maxMatrix(matrix);
        showArray(arrayMax);
    }

    private static void showArray(int[] max) {
        System.out.println("Max element: " + max[0]);
        System.out.printf("At index: [%d][%d]", max[1], max[2]);
    }

    private static int[] maxMatrix(int[][] matrix) {
        int[] max = new int[3];
        max[0] =matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max[0] < matrix[i][j]) {
                    max[0] = matrix[i][j];
                    max[1] = i;
                    max[2] = j;
                }
            }
        }
        return max;
    }

    private static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

    private static int[][] initMatrix(int x, int y) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.printf("Enter element [%d][%d]: \n", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
}
