package com.collections.CustomArrayList;

public interface CustomList<E> extends Iterable<E> {

    boolean add(E e);

    E get(int index);

    int size();

    void update(int index, E e);

    void delete(int index);

}
