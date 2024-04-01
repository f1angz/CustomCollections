package com.collections;

public class CustomList <T> {
    private Object[] objects;
    private int size;

    CustomList(int size) {
        this.objects = (T[]) new Object[size];
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void add (T element) {
        objects[size++] = element;
    }
}
