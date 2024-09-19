package ru.lessons24.Collections2.FunctionalsInterfaces;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Анна", "Елена", "Жан", "Дмитрий"};

        // Comparator с использованием анонимного класса
        Comparator<String> anonComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        };
        Arrays.sort(names, anonComparator);
        System.out.println("Sorted with anonymous class: " + Arrays.toString(names));

        // Comparator с использованием лямбда-выражения
//        Comparator<String> lambdaComparator = (s1, s2) -> s1.length() - s2.length();
        Comparator<String> lambdaComparator = Comparator.comparingInt(String::length);
//        Comparator<String> lambdaComparator = (s1, s2) -> s2.length() - s1.length();
        Arrays.sort(names, lambdaComparator);
        System.out.println("Sorted with lambda: " + Arrays.toString(names));

        // Или вообще с использованием лямбда напрямую в вызове метода
        Arrays.sort(names, (s1, s2) -> s2.length() - s1.length());
        System.out.println("Sorted with lambda directly in method call: " + Arrays.toString(names));
    }
}
