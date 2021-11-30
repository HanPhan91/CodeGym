package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Management {
    List<Product> products= new ArrayList<>();
    String url = "product.csv";

    public Management() {
        List<Product> products = readFile(url);
    }

    public void showProduct() {
        if (products == null){
            System.out.println("List empty");
        }
        else {
            for (Product product : products) {
                System.out.println(product.toString());
            }
        }
    }

    public List<Product> addProduct() {
        products.add(new Product(1, "abc", "toyota", 24000));
        products.add(new Product(2, "civic", "honda", 50000));
        products.add(new Product(3, "ford", "ford", 30000));
        writeFile(products, url);
        return products;
    }

    public void writeFile(List<Product> products, String path) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<Product> readFile(String path) {
        List<Product> products = new ArrayList<>();
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
                return products= null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }
}
