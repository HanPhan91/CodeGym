package com.codegym;

import javafx.scene.transform.Scale;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Stack<Integer> stack = new Stack<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number Decimal: ");
        int number= scanner.nextInt();
        scanner.nextLine();

        while (number!=0){
            int du= number %2;
            number = number/2;
            stack.push(du);
        }
        System.out.println("Convert to Binary: ");
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
