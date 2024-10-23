package ru.ldv236.patterns.behevioral.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class NativeJavaIterator {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Moscow", "Paris", "NYC");

        Iterator<String> iterator = data.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}