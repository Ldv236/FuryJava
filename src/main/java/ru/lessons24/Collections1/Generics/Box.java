package ru.lessons24.Collections1.Generics;

import java.util.Arrays;

public class Box<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public Box(int size) {
        this.array = (T[]) new Object[size];
    }

    // Метод для установки значения в массив
    public void set(int index, T value) {
        array[index] = value;
    }

    // Метод для получения значения из массива
    public T get(int index) {
        return array[index];
    }

    public T[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return "Box contains: " + Arrays.toString(array);
    }
}