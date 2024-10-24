package ru.ldv236.OOP.GC;

public class OOM {
    public static void main(String[] args) {
        // начать с 100 элементов, на 2млрд уже ООМ
        int[] largeArray = new int[1_000_000_000];

        System.out.println("Создан массив с размером " + largeArray.length);
    }
}
