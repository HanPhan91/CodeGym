package com.codegym;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFALT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        elements = new Object[DEFALT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public int size() {
        return elements.length;
    }

    public void ensureCapacity(int minCapacity) {
        int size = size();
        int newSize = size * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        if (index < 0) {
            System.out.println("Index out of Array");
        }
        else if (index > size()) {
            ensureCapacity(size + 1);  // Increments modCount!!
            System.arraycopy(elements, index, elements, index + 1,size - index);
            elements[index] = element;
            size++;
        }
        else {
            System.arraycopy(elements, index, elements, index + 1,size - index);
            elements[index] = element;
            size++;
        }
    }

    public E get(int i) {
        if (i >= size() || i < 0) {
            System.out.println("Index out of Array");
        }
        return (E) elements[i];
    }

    public E clone(){
            MyList<?> v = new MyList<>();
            v.elements = Arrays.copyOf(elements, size);
            return (E) v;
    }
    public boolean add(E e) {
        ensureCapacity(size + 1);  // Increments modCount!!
        elements[size++] = e;
        return true;
    }
}
