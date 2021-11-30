package com.codegym;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue<Character> queue= new LinkedList<>();
        Stack<Character> stack= new Stack<>();
        boolean check= true;
        Scanner scanner= new Scanner(System.in);
        String str;
        System.out.println("Input String to check palindrome: ");
        str= scanner.nextLine();
        str= str.toLowerCase(Locale.ROOT);
        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));
            stack.push(str.charAt(i));
        }
        while (!stack.isEmpty() && !queue.isEmpty()){
            if (!stack.pop().equals(queue.poll())){
                check=false;
                break;
            }
        }
        if (check)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
