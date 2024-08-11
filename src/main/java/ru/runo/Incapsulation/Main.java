package ru.runo.Incapsulation;

public class Main {
    public static void main(String[] args) {
        // Создание объекта часов
        Clock clock = new Clock();
        //если будет конструктор с параметрами
//        Clock clock = new Clock(12, 20);

        // Чтение и вывод времени
        System.out.println("Current time: " + clock.getTime());

        // Установка времени
        clock.setHour(14);
        clock.setMinute(30);

        // Чтение и вывод времени
        System.out.println("Updated time: " + clock.getTime());

        // Попытка установить некорректное время (вызывает исключение)
        try {
            clock.setHour(25);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
