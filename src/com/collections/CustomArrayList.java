package com.collections;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
public class CustomArrayList<E> extends AbstractList<E> {

    private Object[] objects;
    private int size = 0;

    public CustomArrayList (int initialSize){
        objects = (E[]) new Object[initialSize];
    }

    public CustomArrayList (){
        objects = (E[]) new Object[5];
    }

    @Override
    public E get(int index) {
        return (E) objects[index];
    }

    public boolean add(E element) {
        if (size == objects.length) {
            increase();
        }
        objects[size] = element;
        size++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        for (E element : collection) {
            add(element);
        }
        return true;
    }

    public void clear() {
        Arrays.fill(objects, null);
    }

    public void print() {
        for (Object element : objects) {
            if (element != null) {
                System.out.println(element);
            }
        }
    }

    public boolean contains(Object o) {
        for (Object element : objects) {
            if (element != null) {
                if (element.equals(o)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isEmpty() {
        int count = 0;
        for (Object object : objects) {
            if (object == null) {
                count++;
            }
        }
        return count == objects.length;
    }

    @Override
    public int size() {
        return this.size;
    }

    private void increase() {
        objects = Arrays.copyOf(objects, size + 2);
    }


}
