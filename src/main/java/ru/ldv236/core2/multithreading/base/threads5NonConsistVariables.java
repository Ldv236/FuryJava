package ru.ldv236.core2.multithreading.base;

public class threads5NonConsistVariables {
//    Проблема № 1: несогласованные переменные
//    Допустим, двум потокам доступна точка с координатами (0,0).
//    Один поток хочет поменять координаты на (100,100), другой - вывести координаты в консоль
//
//    Мы ожидаем увидеть в консоли либо (0,0), либо (100, 100) в зависимости от того,
//    какой поток выполнится быстрее.
//
//    Но если нам не повезёт с таймингом, второй поток напечатает координаты (100, 0).
//    Такой точки не существует сейчас в системе, и это значение некорректно.
    public static void main(String[] args) {
        Point p = new Point(0, 0);

        Thread t1 = new Thread(() -> {
            p.x = 100;
            try {
                Thread.sleep(50); // + try-catch
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            p.y = 100;
        });

        Thread t2 = new Thread(() -> {
            System.out.println(p);
        });

        t1.start();
        t2.start();
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}