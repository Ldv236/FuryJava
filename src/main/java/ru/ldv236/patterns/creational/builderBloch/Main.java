package ru.ldv236.patterns.creational.builderBloch;

public class Main {
    public static void main(String[] args) {

        ProductPackaging packaging = new ProductPackaging
                .Builder(10.0, 5.0, 20.0) // обязательные параметры
                .calories(250)   // необязательные параметры
                .weight(100)     // необязательные параметры
                .build();

        System.out.println(packaging);
    }
}
// Объяснение реализации:
// Обязательные параметры proteins, fats, carbs передаются
// в конструктор Builder и инициализируются через его поля.
// Необязательные параметры задаются с помощью методов
// calories() и weight(), возвращающих this для удобного
// построения цепочки вызовов.
// Метод build() вызывает приватный конструктор ProductPackaging,
// передавая объект Builder для создания конечного объекта.
// Приватный конструктор ProductPackaging инициализирует
// все поля с помощью значений из Builder.
// Такой подход позволяет гибко создавать объекты с большим
// количеством параметров, при этом оставаясь удобным и легко читаемым.