package ru.LeetCode.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task99 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("name3");
        names.add("name1");
        names.add("name2");
        names.add("name4");

        names = names.stream()
                .map(n -> n.substring(1))
                .sorted()
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
