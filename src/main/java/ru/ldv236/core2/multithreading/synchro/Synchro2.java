package ru.ldv236.core2.multithreading.synchro;

public class Synchro2 {

//    Когда один поток выполняет метод increment или getCount, он захватывает
//    блокировку (lock) на объект lock. Пока эта блокировка удерживается,
//    другой поток не сможет войти ни в increment, ни в getCount,
//    так как они тоже требуют блокировки на этом объекте.
    private Object lock = new Object();
    private int count = 0;

    public void increment() {
        synchronized (lock) {
            count++;
        }
    }

    public int getCount() {
        synchronized (lock) {
            return count;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Synchro2 synchro = new Synchro2();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchro.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchro.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("count = " + synchro.getCount());
    }
}
// Если нужно только защитить increment (запись) и разрешить одновременное
// выполнение getCount (чтение), можно использовать ReentrantReadWriteLock,
// где getCount использует readLock, а increment — writeLock.
// Это позволит нескольким потокам одновременно читать значение, пока оно не изменяется.
