package com.codegym;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    final Scanner scanner = new Scanner(System.in);
    final IdProductServices services = new ProductService();

    public void showProduct() {
        List<Product> products = services.getProduct();
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public void add(){

    }
}
