package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class ProductService implements IdProductServices{
    public final ArrayList<Product> products = new ArrayList<>();
    @Override
    public List<Product> getProduct() {
        return products;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public Product findProduct(String name) {
        return null;
    }

    @Override
    public void updateProduct(int id) {

    }

    @Override
    public void removeProduct(int id) {

    }

    @Override
    public void sortByDecs() {

    }

    @Override
    public void sortByAsc() {

    }
}
