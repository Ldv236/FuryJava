package ru.lessons24.Collections2.FunctionalsInterfaces;

import java.util.function.*;

public class FuncInterfacesDemo {
    public static void main(String[] args) {

        Predicate<String> isShortName = name -> name.length() <= 3;
        System.out.println(isShortName.test("Bob")); // true
        System.out.println(isShortName.test("Alexander")); // false

        Consumer<String> printUpperCase = name -> System.out.println(name.toUpperCase());
        printUpperCase.accept("Hello"); // HELLO

        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.get()); // Выведет случайное число

        Function<String, Integer> stringLength = str -> str.length();
        System.out.println(stringLength.apply("Java")); // 4

        Function<String, String> stringUpper = str -> str.toUpperCase();
        System.out.println(stringUpper.apply("Java")); // 4

        // Еще один пример - конкатенация строки и числа
        BiFunction<String, Integer, String> concat = (str, num) -> {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < num; i++) {
                sb.append(str).append(" ");
            }
            return sb.toString();
        };

        System.out.println(concat.apply("Lambda", 10)); // Output: The answer is 42
    }
}
