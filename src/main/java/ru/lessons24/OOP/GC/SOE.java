package ru.lessons24.OOP.GC;

public class SOE {
    public static void main(String[] args) {
        recursiveMethod(1);
    }

    public static void recursiveMethod(int inputParameter) {
        System.out.println(inputParameter);
        inputParameter++;

        recursiveMethod(inputParameter);
    }
}
