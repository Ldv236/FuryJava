package ru.ldv236.OOP.staticKeyword;

public class Entity {
    // Статическое поле для хранения общего количества объектов
    private static int count = 0;

    // Поле для хранения id каждого объекта
    private int id;

    // Статический блок инициализации
    static {
        System.out.println("Static initialization block executed.");
        count = 100; // Начальное значение для count
    }

    // Нестатический блок инициализации
    {
        System.out.println("Instance initialization block executed.");
        id = -1; // Устанавливаем значение id перед вызовом конструктора
    }

    // Конструктор класса
    public Entity() {
        count++; // Увеличиваем значение статического поля при создании нового объекта
        id = count; // Присваиваем уникальный id объекту
        System.out.println("Constructor executed.");
    }

    // Статический метод для получения общего количества объектов
    public static int getCount() {
        return count;
    }

    // Метод для получения id объекта
    public int getId() {
        return id;
    }
}
