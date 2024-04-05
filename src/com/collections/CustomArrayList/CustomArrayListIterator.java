package com.collections.CustomArrayList;

import java.util.Iterator;

public class CustomArrayListIterator<E> implements Iterator<E> {

    private int index = 0;
    E[] values;

    CustomArrayListIterator(E[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length && values[index] != null;
    }

    @Override
    public E next() {
        return values[index++];
    }
}
