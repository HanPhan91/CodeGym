package com.codegym;


import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {
	// write your code here
        float weight;
        float height;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Vui long nhap can nang (kg): ");
        weight = scanner.nextFloat();
        System.out.println("Vui long nhap chieu cao (m): ");
        height= scanner.nextFloat();
        float bmi= weight / (height * height);
        System.out.println("Chi so BMI cua ban la: " + bmi);
        if (bmi < 18.5){
            System.out.println("Underweight");
        }
        else if (bmi >= 18.5 && bmi < 25.0){
            System.out.println("Normal");
        }
        else if (bmi >= 25.0 && bmi < 30.0){
            System.out.println("Overweight");
        }
        else
            System.out.println("Obese");
    }
}
