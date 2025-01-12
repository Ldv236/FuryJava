package ru.ldv236.core2.multithreading.base;

public class threads6LostUpdate {
//    Проблема №2: потерянный апдейт
//    Посмотрим на классический пример.
//    Два потока увеличивают значение счётчика 10 (1) тысяч раз.
//    В конце работы мы ожидаем, что в консоль напечатается 20000
    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                test.increment();
//                System.out.println(Thread.currentThread().getName() + ": " + i + " - " + test.getCount());
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                test.increment();
//                System.out.println(Thread.currentThread().getName() + ":   " + i + " - " + test.getCount());
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("count = " + test.getCount());
    }

    static class Test {
        private int count = 0;

        public void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }
}
