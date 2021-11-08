package com.codegym;

public class PrimeSmaller100 {

    public static void main(String[] args) {
	// write your code here
        boolean check= true;
        for (int i=2; i <= 100; i++){
            for (int j=2; j<i; j++){
                if (i%j ==0){
                    check= false;
                    break;
                }
                else
                    check= true;
            }
            if (check){
                System.out.println(i+ " la so nguyen to");
            }
        }
    }
}
