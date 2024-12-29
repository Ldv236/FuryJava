package ru.ldv236.core2.enums.abstractMethod;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // отдельно каждый вызываем
        double result = Operation.ADDITION.apply(5, 2);
        System.out.println(result);

        result = Operation.SUBSTRACTION.apply(5, 2);
        System.out.println(result);

        result = Operation.MULTIPLICATION.apply(5, 2);
        System.out.println(result);

        result = Operation.DIVISION.apply(5, 2);
        System.out.println(result);

        // в список можно сложить
        List<Operation> operations = new ArrayList<>();
        operations.add(Operation.ADDITION);
        operations.add(Operation.SUBSTRACTION);
        operations.add(Operation.MULTIPLICATION);
        operations.add(Operation.DIVISION);
        // пройти по листу и сохранить результаты в новый лист (с помощью лямбды, например)
        List<Double> results = new ArrayList<>();
        operations.forEach(o -> results.add(o.apply(6, 4)));
        System.out.println(results);



        // ПАТТЕРН СТРАТЕГИЯ - ИСПОЛЬЗУЕТСЯ СЕМЕЙСТВО АЛГОРИТМОВ
        int operationType = 3; // это типа значение извне в рантайме - например, из консоли
        // по простому - через свитч (но не соблюдается принцип открытости-закрытости)
         result = switch (operationType) {
            case 1 -> Operation.ADDITION.apply(5, 2);
            case 2 -> Operation.MULTIPLICATION.apply(5, 2);
            case 3 -> Operation.DIVISION.apply(5, 2);
            case 4 -> Operation.SUBSTRACTION.apply(5, 2);
            default -> throw new IllegalStateException("Unexpected value: " + operationType);
        };

        System.out.println(result);

        // по-нормальному - с помощью мапы
        Map<Character, Operation> map = new HashMap<>();
        // так лучше, но OCP все равно нарушен!
//        map.put('+', Operation.ADDITION);
//        map.put('-', Operation.SUBSTRACTION);
//        map.put('*', Operation.MULTIPLICATION);
//        map.put('/', Operation.DIVISION);

        // поэтому добавляем в энам сами символы (или какое-то другое значение для идентификации)
        // и проходимся по значениям энама, длобавляя все в мапу
        for (Operation value : Operation.values()) {
            map.put(value.getSymbol(), value);
        }

        System.out.println("Применяем мапу (паттерн стратегия + принцип OCP)");
        Scanner sc = new Scanner(System.in);
        char symbol = sc.nextLine().charAt(0); // тоже извне в рантайме
        // теперь добавляем новую операцию в энам и вуаля - работает сразу, здесь ничего менять не надо
        result = map.get(symbol).apply(5, 2);
        System.out.println(result);
    }
}
