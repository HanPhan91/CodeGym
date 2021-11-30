package com.codegym;

import java.util.Scanner;

public class ReadNumber {

    public static void main(String[] args) {
	// write your code here
        int number;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap so can doc: ");
        number= scanner.nextInt();
        if ( (number>=0) && (number <= 10) ){
            switch (number){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
            }
        }
        else if (number == 11){
            System.out.println("Eleven");
        }
        else if (number == 12){
            System.out.println("Twelve");
        }
        else if (number == 20){
            System.out.println("Twenty");
        }
        else if (number >=13 && number < 20){
            int ones= number - 10;
            switch (ones) {
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fiveteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
            }
        }
        else if (number > 20 && number < 100){
            int tens= number / 10;
            int ones= number % 10;
            switch (tens) {
                case 2:
                    System.out.print("Twenty ");
                    break;
                case 3:
                    System.out.print("Thirty ");
                    break;
                case 4:
                    System.out.print("Forty ");
                    break;
                case 5:
                    System.out.print("Fifty ");
                    break;
                case 6:
                    System.out.print("Sixty ");
                    break;
                case 7:
                    System.out.print("Seventy ");
                    break;
                case 8:
                    System.out.print("Eighty ");
                    break;
                case 9:
                    System.out.print("Ninety ");
                    break;
            }
            switch (ones) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven ");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
        }
        else if (number == 100){
            System.out.println("One hundred");
        }
        else if (number > 100){
            int ones= number % 10;
            int tens= (number % 100) / 10;
            int hundred= number / 100;
            switch (hundred) {
                case 1:
                    System.out.print("One hundred and ");
                    break;
                case 2:
                    System.out.print("Two hundred and ");
                    break;
                case 3:
                    System.out.print("Three hundred and ");
                    break;
                case 4:
                    System.out.print("Four hundred and ");
                    break;
                case 5:
                    System.out.print("Five hundred and ");
                    break;
                case 6:
                    System.out.print("Six hundred and ");
                    break;
                case 7:
                    System.out.print("Seven hundred and ");
                    break;
                case 8:
                    System.out.print("Eight hundred and ");
                    break;
                case 9:
                    System.out.print("Nine hundred and ");
                    break;
            }
            if (tens == 1){
                switch (ones) {
                    case 1:
                        System.out.println("Eleven");
                        break;
                    case 2:
                        System.out.println("Twelve");
                        break;
                    case 3:
                        System.out.println("Thirteen");
                        break;
                    case 4:
                        System.out.println("Fourteen");
                        break;
                    case 5:
                        System.out.println("Fiveteen");
                        break;
                    case 6:
                        System.out.println("Sixteen");
                        break;
                    case 7:
                        System.out.println("Seventeen");
                        break;
                    case 8:
                        System.out.println("Eighteen");
                        break;
                    case 9:
                        System.out.println("Nineteen");
                        break;
                }
            }
            else{
                switch (tens) {
                    case 2:
                        System.out.print("Twenty-");
                        break;
                    case 3:
                        System.out.print("Thirty-");
                        break;
                    case 4:
                        System.out.print("Forty-");
                        break;
                    case 5:
                        System.out.print("Fifty-");
                        break;
                    case 6:
                        System.out.print("Sixty ");
                        break;
                    case 7:
                        System.out.print("Seventy-");
                        break;
                    case 8:
                        System.out.print("Eighty-");
                        break;
                    case 9:
                        System.out.print("Ninety-");
                        break;
                }
                switch (ones) {
                    case 1:
                        System.out.print("one");
                        break;
                    case 2:
                        System.out.print("two");
                        break;
                    case 3:
                        System.out.print("three");
                        break;
                    case 4:
                        System.out.print("four");
                        break;
                    case 5:
                        System.out.print("five");
                        break;
                    case 6:
                        System.out.print("six");
                        break;
                    case 7:
                        System.out.print("seven");
                        break;
                    case 8:
                        System.out.print("eight");
                        break;
                    case 9:
                        System.out.print("nine");
                        break;
                }
            }

        }
    }
}
