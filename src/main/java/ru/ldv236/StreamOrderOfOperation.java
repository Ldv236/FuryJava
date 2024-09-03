package ru.ldv236;

import java.util.Comparator;
import java.util.List;

public class StreamOrderOfOperation {
    public static void main(String[] args) {

        final List<String> test = List.of("one", "two", "three");

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
