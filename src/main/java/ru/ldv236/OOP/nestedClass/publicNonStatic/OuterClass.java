package ru.ldv236.OOP.nestedClass.publicNonStatic;

public class OuterClass {
    private String instanceField = "Instance Field of OuterClass";

    // Публичный внутренний класс
    public class InnerClass {
        public void display() {
            // Доступ к нестатическим полям внешнего класса
            System.out.println("Accessing: " + instanceField);
        }
    }
}
// Внутренний класс имеет доступ ко всем полям и методам внешнего класса, включая приватные.
// Когда использовать: Внутренние классы удобны, когда требуется тесная связь с объектом внешнего класса
// и доступ к его нестатическим полям и методам.