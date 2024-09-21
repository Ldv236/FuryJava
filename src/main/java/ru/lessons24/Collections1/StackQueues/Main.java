package ru.lessons24.Collections1.StackQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // === Работа с очередью (FIFO) для имен ===
//        LinkedList<String> nameQueue = new LinkedList<>();
        ArrayDeque<String> nameQueue = new ArrayDeque<>();

        // Добавление имен в конец очереди
        System.out.println("=== Очередь (FIFO) с именами ===");
        nameQueue.offer("Alice");
        System.out.println("После добавления Alice: " + nameQueue);

        nameQueue.offer("Bob");
        System.out.println("После добавления Bob: " + nameQueue);

        nameQueue.offer("Charlie");
        System.out.println("После добавления Charlie: " + nameQueue);

        // Удаление имен с начала очереди
        nameQueue.poll();
        System.out.println("После удаления первого элемента: " + nameQueue);

        nameQueue.poll();
        System.out.println("После удаления второго элемента: " + nameQueue);
        System.out.println(nameQueue.poll());
        System.out.println(nameQueue.poll());

        System.out.println(); // Пустая строка для разделения вывода

        // === Работа со стеком (LIFO) для чисел ===
        LinkedList<Integer> numberStack = new LinkedList<>();

        System.out.println("=== Стек (LIFO) с числами ===");

        // Добавление чисел в стек (в начало списка)
        numberStack.push(10);
        System.out.println("После добавления 10: " + numberStack);

        numberStack.push(20);
        System.out.println("После добавления 20: " + numberStack);

        numberStack.push(30);
        System.out.println("После добавления 30: " + numberStack);

        // Удаление чисел из стека (с начала списка) и пройти будагом
        while (!numberStack.isEmpty()) {
            System.out.print(numberStack.pop() + " ");
        }
        //поменять линкедЛист на эррейДекю и запустить заново
    }
}
