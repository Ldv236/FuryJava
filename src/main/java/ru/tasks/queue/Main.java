package ru.tasks.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello LeetCode!");

        //методы для работы как со стеком - пуш в начало, поп из начала, пик смотрит из начала
        Deque<Character> stack = new ArrayDeque<>(); //также можно линкед лист
        stack.push('a');
        stack.push('b');
        stack.push('c');
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        //методы для работы как с очередью - оффер в конец, полл из начала, пик смотрит из начала
        Deque<Character> queue = new ArrayDeque<>(); //также можно линкед лист
        queue.offer('a');
        queue.offer('b');
        queue.offer('c');
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
    }
}