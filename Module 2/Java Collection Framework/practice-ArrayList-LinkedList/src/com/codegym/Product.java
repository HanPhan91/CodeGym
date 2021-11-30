package com.codegym;

public class Product{
    private int id;
    private static int count= 0;
    private String name;
    private double price = 0.0d;

    public Product(String name, double price) {
        count++;
        this.name = name;
        this.price = price;
        this.id = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: '" + name + ", Price: " + price;
    }
}
