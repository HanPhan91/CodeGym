package com.codegym;

public class FirstPrime {

    public static void main(String[] args) {
	// write your code here
        int count =0;
        boolean check= true;
        for (int i=2; count < 20; i++){
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
                count++;
                System.out.println(count);
            }
        }

    }
}
