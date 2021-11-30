package com.codegym;

import java.util.List;

public interface IdProductServices {
    List<Product> getProduct();
    public void add ();
    public Product findProduct(String name);
    public void updateProduct(int id);
    public void removeProduct(int id);
    public void sortByDecs();
    public void sortByAsc();
}
