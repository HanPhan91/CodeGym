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
        int cols;
        System.out.println("Enter cols to sum: ");
        cols=scanner.nextInt();
        sumColMatrix(cols,matrix);
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

    private static void sumColMatrix(int cols, int[][] matrix) {
        int sum=0;
        for (int i = 0; i < matrix[cols].length ; i++) {
             sum+= matrix[cols][i];
        }
        System.out.printf("Sum of colum %d : %d",cols,sum);
    }

    private static int[][] initMatrix(int x, int y) {
        Scanner scanner=new Scanner(System.in);
        int[][] matrix= new int[x][y];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("Enter element [%d][%d]: ",i,j);
                matrix[i][j]= scanner.nextInt();
            }
        }
        return matrix;
    }
}
