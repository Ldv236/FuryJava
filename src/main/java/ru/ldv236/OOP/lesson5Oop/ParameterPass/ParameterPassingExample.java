package ru.ldv236.OOP.lesson5Oop.ParameterPass;

public class ParameterPassingExample {
    public static void main(String[] args) {
        int value = 10;
        System.out.println("Before method call: " + value);

        // Передача параметра по значению
        passByValue(value);
        System.out.println("After passByValue method call: " + value);

        // Передача параметра по ссылке
        int[] array = {10};
        System.out.println("Before passByReference method call: " + array[0]);
        passByReference(array);
        System.out.println("After passByReference method call: " + array[0]);
    }

    // Метод, который принимает параметр по значению
    public static void passByValue(int value) {
        value = 20;
        System.out.println("Inside passByValue method: " + value);
    }

    // Метод, который принимает параметр по ссылке
    public static void passByReference(int[] array) {
        array[0] = 20;
        System.out.println("Inside passByReference method: " + array[0]);
    }
}
