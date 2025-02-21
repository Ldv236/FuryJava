package ru.ldv236.Collections2.StreamToMaps;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Kitty> books = List.of(
                new Kitty(1, "Barsik", 2020),
                new Kitty(2, "Murka", 2019),
                new Kitty(3, "Pushok", 2018),
                new Kitty(4, "Godzilla", 2018)
        );

        Map<Integer, Kitty> booksById = books.stream()
                .collect(Collectors.toMap(
                        Kitty::getId,      // Функция, отвечающая за ключ
//                        kitty -> kitty      // Функция, отвечающая за значение
                        Function.identity()
                ));
        System.out.println(booksById);


        Map<String, Kitty> booksByYear = books.stream()
                .collect(Collectors.toMap(
                        Kitty::getName,
                        kitty -> kitty,
                        // (oldValue, newValue) -> oldValue  оставляем первую книгу
                        (oldValue, newValue) -> newValue,     // оставляем последнюю книгу
//                        LinkedHashMap::new
                        TreeMap::new
                ));
        System.out.println(booksByYear);


        Map<Integer, Kitty> booksByYearWithNull = books.stream()
                .collect(Collectors.toMap(
                        Kitty::getYear,
                        book -> book,
                        (oldValue, newValue) -> null
                ));
        System.out.println(booksByYearWithNull);


        Map<Integer, List<Kitty>> groupedByYear = books.stream()
                .collect(Collectors.groupingBy(
                        Kitty::getYear/*,
                        Collectors.toList()*/
                ));
        System.out.println(groupedByYear);


        Map<Integer, Set<Kitty>> groupedByYear2 = books.stream()
                .collect(Collectors.groupingBy(
                        Kitty::getYear,
                        Collectors.toSet()
                ));
        System.out.println(groupedByYear);


        Map<Integer, Set<Kitty>> groupedByYearLinked = books.stream()
                .collect(Collectors.groupingBy(
                        Kitty::getYear,
                        LinkedHashMap::new,       // Конкретная реализация мапы
                        Collectors.toSet()
                ));
        System.out.println(groupedByYearLinked);



        Map<Integer, Set<String>> titlesByYear = books.stream()
                .collect(Collectors.groupingBy(
                        Kitty::getYear,
                        Collectors.mapping(
                                Kitty::getName,  // берём только название
                                Collectors.toSet()
                        )
                ));
        System.out.println(titlesByYear);



        Map<Boolean, List<Kitty>> partitionedByYear = books.stream()
                .collect(Collectors.partitioningBy(
                        kitty -> kitty.getYear() >= 2010
                ));
        System.out.println(partitionedByYear);
    }
}
