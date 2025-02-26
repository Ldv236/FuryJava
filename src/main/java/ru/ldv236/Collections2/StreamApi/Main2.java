package ru.ldv236.Collections2.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alexander", "Kate", "Bob", "John", "Any", "Ed");

        List<String> names2 = new ArrayList<>();
        names2.add("Alexander");
        names2.add("Kate");
        names2.add("Bob");
        names2.add("John");

        List<String> processedNames = names2.stream()
                .map(n -> n.replace("", " "))
                .collect(Collectors.toList());

        System.out.println(processedNames);


//        Set<String> nameSet = new HashSet<>(names2);
//
//
//
//
//        List<String> upperCaseNames = names.stream()
//                .map(s -> s.toUpperCase())
////                .map(String::toUpperCase)
//                .toList();
//        System.out.println("Uppercase names: " + upperCaseNames); // Output: [ALEXANDER, KATE, BOB]
    }
}
