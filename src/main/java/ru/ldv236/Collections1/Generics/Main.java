package ru.ldv236.Collections1.Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer number = 123;
        String name = "Alice";
        Car car = new Car("Lada");

        // Создание списка
        List list = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();

        list.add(number);
        list.add(name);
        list.add(car);
        list.add(100);
        list.add(8);

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
//            try {
//                sum += (int) list.get(i);
//            sum += list.get(i);
//            } catch (ClassCastException e) {
//                System.out.println("Ошибка приведения типов: " + e.getMessage());
//            }
        }
        System.out.println(sum);
        // Вывод всех элементов списка
        System.out.println("Содержимое списка (raw type): " + list);
    }
}
