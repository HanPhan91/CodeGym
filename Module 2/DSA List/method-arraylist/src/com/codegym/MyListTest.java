package com.codegym;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> arr = new MyList<Integer>();
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
//        arr.add(6,70);
//        arr.add(7,80);
//        arr.add(8,90);
//        arr.add(9,100);
        arr.add(12,600);
        for (int i = 0; i < arr.elements.length; i++) {
            System.out.println(arr.get(i));
        }


    }

}
