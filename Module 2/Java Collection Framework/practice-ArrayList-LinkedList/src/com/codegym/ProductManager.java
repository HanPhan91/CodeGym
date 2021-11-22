package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager{
    private ArrayList<Product> arrayList;

    public ProductManager() {
        arrayList = new ArrayList<Product>();
    }

    public boolean addProduct(Product product) {
        arrayList.add(product);
        return true;
    }

    public Product findProduct(int id) {
        for (Product product : arrayList) {
            if (product.getId() == id)
                return product;
        }
        return null;
    }

    public boolean removeProduct(int id) {
        for (Product product : arrayList) {
            if (product.getId() == id) {
                arrayList.remove(product);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Product> getList() {
        return arrayList;
    }
    public void sort() {
        IdComparator idComparator = new IdComparator();
        Collections.sort(arrayList, idComparator);
    }
}





