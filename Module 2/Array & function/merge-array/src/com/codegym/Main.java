package com.codegym;

public class Main {

    public static void main(String[] args) {
	    int[] arr1= new int[]{1,2,3,4};
        int[] arr2= new int[]{5,6,7,8,9};
        int[] arr3= mergeArray(arr1, arr2);
        System.out.println("Array 1: ");
        showArray(arr1);
        System.out.println("Array 2: ");
        showArray(arr2);
        System.out.println("Merge array: ");
        showArray(arr3);
    }

    private static void showArray(int[] array) {
        for (int items:array) {
            System.out.print(items);
            System.out.print(" ");
        }
        System.out.println(" ");
    }

    private static int[] mergeArray(int[] array1, int[] array2) {
        int[] array3= new int[array1.length+ array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i]= array1[i];
        }
        int index= array1.length;
        for (int i= 0; i< array2.length; i++){
            array3[index]= array2[i];
            index++;
        }
        return array3;
    }
}
