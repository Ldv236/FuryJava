package ru.ldv236.Collections2.streamExample;

import java.util.Comparator;
import java.util.List;

public class StreamOrderOfOperation {
    public static void main(String[] args) {

        final List<String> test = List.of("raz", "dva", "tri");

        //first example
        test.stream()
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.length() <= 3;
                })
                .map(s1 -> {
                    System.out.println("map: " + s1);
                    return s1.toUpperCase();
                })
                .forEach(x -> {
                    System.out.println("forEach: " + x);
                });
        System.out.println("------------------------");

        //second example
        test.stream()
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.length() <= 3;
                })
                .map(s1 -> {
                    System.out.println("map: " + s1);
                    return s1.toUpperCase();
                })
                .sorted(Comparator.reverseOrder())
                .forEach(x -> {
                    System.out.println("forEach: " + x);
                });
    }
}
