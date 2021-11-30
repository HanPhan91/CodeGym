package com.codegym;

import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // write your code here
        reverseInt();
        reverseString();

    }

    public static void reverseInt() {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println("Elements on Array: ");
        for (Integer items : arr) {
            System.out.println(items);
            stack.push(items);
        }
        arr.clear();
        System.out.println("Array after clear: ");
        System.out.println(arr.size());
        while (!stack.isEmpty()) {
            arr.add(stack.pop());
        }
        System.out.println("Elements on Array after Add: ");
        for (Integer items : arr) {
            System.out.println(items);
        }
    }


    public static void reverseString(){
        Stack<Character> wStack = new Stack<>();
        String mWord= "ABCDE";
        System.out.println("String : "+ mWord);
        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(mWord.charAt(i));
        }
        mWord= "";
        while (!wStack.isEmpty()){
            mWord+= wStack.pop();
        }
        System.out.println("String after reverse: "+ mWord);
    }
}
