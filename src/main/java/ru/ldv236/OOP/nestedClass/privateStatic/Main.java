package ru.ldv236.OOP.nestedClass.privateStatic;

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.usePrivateNested();
    }
}
// Приватный статический вложенный класс доступен только внутри внешнего класса.
// Когда использовать: Приватные статические вложенные классы используются как вспомогательные классы,
// если требуется скрыть их реализацию от других классов.