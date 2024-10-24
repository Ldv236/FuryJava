package ru.ldv236.Collections1.ListsAndIterators;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        // Добавление элементов
        Car carLada = new Car("Lada");
        cars.add(carLada);

        cars.add(new Car("Ford"));
        cars.add(new Car("Toyota"));
        System.out.println(cars);

        Car[] carsArray = cars.toArray(new Car[cars.size()]);
        System.out.println(Arrays.toString(carsArray));

        // Получение элемента по индексу
        System.out.println("Элемент по индексу 1: " + cars.get(1));

        // Изменение элемента
        cars.set(1, new Car("Kamaz"));
        System.out.println("Обновленный список: " + cars);

        // Удаление элемента
        cars.remove(new Car("Lada"));
        // после этого идем в Кар и пишем иквалс и опять удаляем
        System.out.println("После удаления объекта: " + cars);
        cars.remove(0);
        System.out.println("После удаления по индексу 0: " + cars);

        // Поиск индекса элемента
        int index = cars.indexOf(new Car("Lada"));
        System.out.println("Индекс Lada: " + index);

        index = cars.indexOf(new Car("Toyota"));
        System.out.println("Индекс Toyota: " + index);

        cars.add(0, new Car("Kamaz"));
        cars.add(0, new Car("Ford"));

        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car of index " + i + ": " + cars.get(i));
        }

        for (Car car : cars) {
            System.out.print(car + " ");
        }
        System.out.println();

        // после добавления в класс Кар списка
        carLada.addDriver("Ivan");
        carLada.addDriver("Petr");
        System.out.println(carLada.getDrivers());
    }
}
