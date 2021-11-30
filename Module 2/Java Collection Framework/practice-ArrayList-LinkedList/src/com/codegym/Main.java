package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Product product1 = new Product("TraiCay", 56.9);
        Product product2 = new Product("Sua", 25000);
        ProductManager lists = new ProductManager();
//        lists.addProduct(product1);
//        lists.addProduct(product2);
        lists.showProduct();
//        System.out.println(lists.getList());
        // Hien thi list sau khi them vao
//        if (!lists.removeProduct(1)){
//            System.out.println("Ko co sp nay");
//        }
//        else System.out.println("da xoa");
//        System.out.println(lists.getList());
        //Hien thi list sau khi xoa
//        lists.sort();
//        System.out.println(lists.getList());
        //Hien thi list sau khi sap xep theo gia

    }
}
