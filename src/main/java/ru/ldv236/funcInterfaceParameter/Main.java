package ru.ldv236.funcInterfaceParameter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        User user = new User("Вася");

        //печатаем имя пользователя
        processUser(user, u -> System.out.println(u.getName()));
        //изменяем имя пользователя
        processUser(user, u -> u.setName("Петя"));
        processUser(user, u -> System.out.println(u.getName()));

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        // Вызов метода с лямбда-выражением
        processElements(numbers, element -> System.out.println(element));

        List<String> words = List.of("Java", "Spring", "Boot");
        // Вызов метода с лямбда-выражением
        List<Integer> lengths = transformList(words, word -> word.length());
        System.out.println(lengths);

        List<String> names = List.of("Anna", "Bob", "Charlie", "Diana");
        // Вызов метода с лямбда-выражением
        List<String> shortNames = filterList(names, name -> name.length() <= 4);
        System.out.println(shortNames);

        // Вызов метода с лямбда-выражением, Supplier
        Supplier<String> stringSupplier = () -> "Java Ninja";
        String result = processSupplier(stringSupplier);
        System.out.println(result); // Выведет "Java Ninja"
    }

    static void processUser(User user, Consumer<User> userConsumer) {
        userConsumer.accept(user); // Применяем consumer к объекту user
    }
    // Метод, принимающий Consumer в качестве параметра
    public static void processElements(Iterable<Integer> list, Consumer<Integer> consumer) {
        for (Integer element : list) {
            consumer.accept(element);
        }
    }
    // Метод, принимающий Function в качестве параметра
    public static <T, R> List<R> transformList(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T element : list) {
            result.add(function.apply(element));
        }
        return result;
    }

    // Метод, принимающий Predicate в качестве параметра
    public static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }

    // Метод, принимающий Supplier в качестве параметра
    public static <T> T processSupplier(Supplier<T> supplier) {
        return supplier.get(); // Вызов метода get() у реализации Supplier
    }
}