package ru.lessons24.Condition.IfElse;

public class Main {
    public static void main(String[] args) {

        boolean isCold = false;

        if (isCold) {
            System.out.println("Шапка");
        } else { //сначала без элс
            //сначала ничего не делаем, а потом
            System.out.println("Надо надеть кепку");
        }

        isCold = false;
        boolean isShine = false;
        //вложенный иф
        if (isCold) {
            System.out.println("Надо надеть шапку");
        } else {
            if (isShine) {
                System.out.println("Надо надеть кепку");
            } else {
                System.out.println("Головной убор не нужен");
            }
        }
        //выносим в элс-иф-элс
        if (isCold) {
            System.out.println("Надо надеть шапку");
        } else if (isShine) {
            System.out.println("Надо надеть кепку");
        } else {
            System.out.println("Головной убор не нужен");
        }
    }
}

