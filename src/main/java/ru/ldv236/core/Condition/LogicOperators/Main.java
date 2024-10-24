package ru.ldv236.core.Condition.LogicOperators;

public class Main {
    public static void main(String[] args) {
        // Переменные для операторов сравнения
        int money = 100;
        int price = 50;

        // Операторы сравнения
        System.out.println("Операторы сравнения: money = " + money + ", price = " + price);

        if (money == price) {
            System.out.println("У вас ровно столько денег, сколько стоит товар.");
        } else if (money < price) {
            System.out.println("У вас недостаточно денег для покупки.");
        } else if (money > price) {
            System.out.println("У вас достаточно денег для покупки.");
        }

        if (money != price) {
            System.out.println("Сумма денег отличается от цены товара.");
        }

        if (money >= price) {
            System.out.println("У вас достаточно или больше денег для покупки.");
        }

        if (money <= price) {
            System.out.println("У вас недостаточно или ровно столько денег, сколько стоит товар.");
        }

        // Переменные для логических операторов
        boolean isCold = true;
        boolean isShine = false;
        // Логические операторы
        System.out.println("\nЛогические операторы: isCold = " + isCold + ", isShine = " + isShine);


        if (isCold && isShine) {
            System.out.println("Сегодня холодно и солнечно.");
        } else if (isCold || isShine) {
            System.out.println("Сегодня либо холодно, либо солнечно.");
        } else if (!isCold) {
            System.out.println("Сегодня не холодно.");
        }

        if (isCold && !isShine) {
            System.out.println("Сегодня холодно, но не солнечно.");
        } else if (!isCold && isShine) {
            System.out.println("Сегодня не холодно и солнечно");
        }

        // Используем тернарный оператор
        String purchaseMessage = (money >= price) ? "Достаточно денег" : "Недостаточно денег";
        System.out.println(purchaseMessage);

        String weatherMessage = (isCold) ? "Сегодня холодно" : "Сегодня тепло";
        String weatherMessage2 = (isShine) ? "Сегодня солнечно" : "Сегодня облачно";
        System.out.println(weatherMessage + " " + weatherMessage2);





        // Операции сравнения
        int a = 10;
        int b = 5;

        boolean isEqual = (a == b);    // Равно
        boolean isNotEqual = (a != b); // Не равно
        boolean isGreater = (a > b);   // Больше
        boolean isLess = (a < b);      // Меньше
        boolean isGreaterOrEqual = (a >= b); // Больше или равно
        boolean isLessOrEqual = (a <= b);    // Меньше или равно

        System.out.println("Равно: " + isEqual);
        System.out.println("Не равно: " + isNotEqual);
        System.out.println("Больше: " + isGreater);
        System.out.println("Меньше: " + isLess);
        System.out.println("Больше или равно: " + isGreaterOrEqual);
        System.out.println("Меньше или равно: " + isLessOrEqual);

        // Логические операции
        boolean p = true;
        boolean q = false;

        boolean and = p && q;   // Логическое И
        boolean or = p || q;    // Логическое ИЛИ
        boolean notP = !p;      // Логическое НЕ

        System.out.println("Логическое И: " + and);
        System.out.println("Логическое ИЛИ: " + or);
        System.out.println("Логическое НЕ: " + notP);

    }
}
