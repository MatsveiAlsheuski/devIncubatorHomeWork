package module13ArrayList;

import java.util.*;

public class MyArrayList<T> implements List<T> {
    // массив елементов
    private Object[] elements;
    // сколько елементов в данный момент
    // Пояснение: массив может быть на 16 елементов, но в него добавили только 3 елемента
    // соответственно size будет равен 3
    private int size;

    // переменная, которая показывает в какой индекс добавлять новый елемент
    private int index;

    private static final int DEFAULT_CAPACITY = 16;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        elements = new Object[capacity];
    }

    @Override
    public boolean add(T value) {
        if (index == elements.length)
            growArray();
        elements[index] = value;
        index++;
        size++;
        return true;
    }

    public void add(int index, T value) {
        checkIndex(index);
        if (index == elements.length)
            growArray();
        System.arraycopy(elements, index, elements, index + 1, this.index - index);
        elements[index] = value;
        this.index++;
        size++;
    }

    // увеличить массив если в нем закончилось место
    private void growArray() {
        Object[] newArray = new Object[elements.length * 2];
        System.arraycopy(elements, 0, newArray, 0, index - 1);
        elements = newArray;
    }

    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.index)
            throw new IllegalArgumentException();
    }

    public int size() {
        return size;
    }

    // если елемента который равен value не будет, то вернуть -1

    public T remove(int index) {
        checkIndex(index);
        System.arraycopy(elements, index + 1, elements, index, this.index - index);
        size--;
        this.index--;

        return (T) elements[index];
    }

    /**
     * Методы без реализации
     */
    @Override
    public int indexOf(Object o) {
        return 0;
    }


    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }


    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }


}


