package ru.ldv236.patterns.structured.decorator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] arguments) {
        List<String> list = new ArrayList<>();
        List<String> decorated = Collections.checkedList(list, String.class);
        decorated.add("2");
        list.add("3");
        System.out.println(decorated);


        /*Давай рассмотрим классический пример с кофейней, где к базовому напитку можно добавлять
        различные добавки (молоко, сахар, шоколад и так далее), каждая из которых изменяет стоимость и описание напитка.*/

        Beverage beverage = new Coffee();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        /*В этом примере мы создаем Coffee и Tea, а затем добавляем к Tea молоко и сахар, используя декораторы.
                Каждый декоратор добавляет свою функциональность (и стоимость) к базовому напитку,
                позволяя комбинировать добавки динамически.*/
        Beverage teaWithMilkAndSugar = new Tea();
        teaWithMilkAndSugar = new Milk(teaWithMilkAndSugar);
        teaWithMilkAndSugar = new Sugar(teaWithMilkAndSugar);
        System.out.println(teaWithMilkAndSugar.getDescription() + " $" + teaWithMilkAndSugar.cost());
    }
}
