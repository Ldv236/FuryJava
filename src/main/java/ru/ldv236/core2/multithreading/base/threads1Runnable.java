package ru.ldv236.core2.multithreading.base;

public class threads1Runnable {
    public static void main(String[] args) throws InterruptedException {

        Runnable task1 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("task1 - " + i);
            }
            String currentThreadName = Thread.currentThread().getName();
            System.out.println(currentThreadName);
        };

        Runnable task2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("task2 -       " + i);
            }
            String currentThreadName = Thread.currentThread().getName();
            System.out.println(currentThreadName);
        };

        Thread threadForTask1 = new Thread(task1);
//        threadForTask1.setName("threadForTask1");

        Thread threadForTask2 = new Thread(task2);
//        threadForTask2.setName("threadForTask2");

        threadForTask1.start();
//        threadForTask1.join(); // нужно будет добавить эксепшн в сигнатуру (или обернуть в трай)
//        но тогда потоки встают в очередь (если первый заджойнить или оба)
        threadForTask2.start();
        threadForTask2.join(); // а вот если сначала запустить оба, а потом один заджойнить, то они друг другу не мешают

        // написали в самом конце программы, но имя мейн видим в самом начале - нужен метод джойн
        String currentThreadName = Thread.currentThread().getName();
        System.out.println(currentThreadName);
    }
}
