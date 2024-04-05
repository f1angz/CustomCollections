package com.collections.CustomArrayList;

import java.util.Iterator;
import java.util.Arrays;

public class CustomArrayList<E> implements CustomList<E> {

    private E[] values;
    private int size = 0;

    public CustomArrayList() {
        values = (E[]) new Object[0];
    }

    @Override
    public boolean add(E e) {
        if (size == values.length) {
            increase();
        }
        values[size] = e;
        size++;
        return true;
    }

    @Override
    public void delete(int index) {
        E[] temp = values;
        values = (E[]) new Object[temp.length - 1];
        System.arraycopy(temp, 0, values, 0, index);
        int amountElementAfterIndex = temp.length - index - 1;
        System.arraycopy(temp, index + 1, values, index, amountElementAfterIndex);
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new CustomArrayListIterator<E>(values);
    }

    private void increase() {
        values = Arrays.copyOf(values, size + 1);
    }
}
