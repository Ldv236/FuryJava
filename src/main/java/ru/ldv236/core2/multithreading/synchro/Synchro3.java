package ru.ldv236.core2.multithreading.synchro;

public class Synchro3 {
    //    1. Обозначить блок кода
    //В этом случае захватывается монитор объекта, указанного в скобках:
    private Object lock = new Object();

    public void smth() {
        synchronized (lock) {
            // критическая секция
        }
    }

    //    2. Добавить synchronized в сигнатуру метода
    public synchronized void getSize() {
        // критическая секция
    }

    //    В этом случае объектом синхронизации становится экземпляр класса,
    //    который вызвал синхронизированный метод. Пример выше равноценен следующему:
    public void getSize2() {
        synchronized (this) {
            // критическая секция
        }
    }

    //    3. Добавить synchronized в сигнатуру статического метода
    public static synchronized void getSize3() {
        // критическая секция
    }

    //    Блокировка в этом случае идёт по объекту Example.class. Код равноценен следующему:
    public static void getSize4() {
        synchronized (Synchro3.class) {
            // критическая секция
        }
    }
}

