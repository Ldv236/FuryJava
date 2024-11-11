package ru.ldv236.core2.multithreading.base;

public class threads3Interrupt {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        try {
            Thread.sleep(500); // Подождем 3 секунды
//            Thread.sleep(3000); // Подождем 3 секунды
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " - прерываем поток " + myThread.getName());
        myThread.interrupt(); // Прерываем поток
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        int count = 0;
        while (!isInterrupted()) { // Проверяем, не был ли поток прерван
            System.out.println(Thread.currentThread().getName() + " работает..." + count++);
            // сначала без слипа - смотрим как прервется цикл
            //потом добавляем слип и ловим интерраптЭксепшн
//            try {
//                Thread.sleep(1000); // Поток засыпает на 1 секунду
//            } catch (InterruptedException e) {
//                System.out.println("Поток был прерван во время сна."); // но чтобы он реально прервался надо либо брейк, либо интеррапт еще раз
////                break; // Прерываем цикл, если поток прерывается во время сна
////                Thread.currentThread().interrupt();
//            }

        }
        System.out.println("Поток завершен.");
    }
}