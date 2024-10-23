package ru.ldv236.collections.PriorityQueueForTopCache;

public class Main {
    public static void main(String[] args) {
//        есть поток данных, который отправляет нам по одному интеджеру,
//        надо написать два метода - первый принимает этот интеджер и где-то его хранит,
//        а второй в любой момент времени выводит 10 максимальных значений.
//        Ограничение - очень мало памяти

        TopTenNumbers topTen = new TopTenNumbers();

        // Добавляем числа в поток
        int[] inputStream = {5, 10, 20, 8, 50, 30, 22, 15, 60, 80, 2, 90, 45, 55};
        for (int number : inputStream) {
            topTen.addNumber(number);
        }

        // Выводим текущие 10 максимальных значений
        System.out.println("Текущие 10 максимальных значений: " + topTen.getTopTen());
    }
}
