package ru.runo.Condition.LogicOperators;

public class Main {
    public static void main(String[] args) {
        // Переменные для операторов сравнения
        int money = 100;
        int price = 50;

        // Операторы сравнения
        System.out.println("Операторы сравнения: money = " + money + ", price = " + price);

        if (money > price) {
            System.out.println("У вас достаточно денег для покупки.");
        } else if (money < price) {
            System.out.println("У вас недостаточно денег для покупки.");
        } else if (money == price) {
            System.out.println("У вас ровно столько денег, сколько стоит товар.");
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
    }
}
