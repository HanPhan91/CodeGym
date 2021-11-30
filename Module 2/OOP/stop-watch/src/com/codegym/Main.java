package com.codegym;


public class Main {

    public static void main(String[] args) {
	// write your code here
        StopWatch watch= new StopWatch();
        watch.start();
        long[] arr= initNumber();
//        arr= sortNumber(arr);
        watch.stop();
        System.out.println("Complete in " + watch.getElapsedTime() + " milisecond");
    }
    public static long[] initNumber(){
        long[] array= new long[100000];
        for (int i = 0; i < 100000; i++) {
            array[i]= Math.round(Math.random()* 100000);
        }
        return array;
    }
    public static long[] sortNumber(long[] array){
        long temp;
        for (int i = 0; i < array.length-1 ; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i]> array[j]){
                    temp= array[i];
                    array[i]= array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
}
