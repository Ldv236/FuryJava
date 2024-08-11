package ru.ldv236.lesson7ManageCycles;

public class Main {
    public static void main(String[] args) {
        loop1();
        loop11();
        loop2();
        loop3();
    }

    static void loop1() {
        System.out.println("цикл с break");
        // Внешний цикл
        for (int i = 1; i < 5; i++) {
            // Внутренний цикл
            for (int j = 1; j < 5; j++) {
                if (i == j) {
                    // Выход из внутреннего цикла при четном i
                    break;
                }
                System.out.println("i: " + i + ", j:" + j);
            }
        }
    }

    static void loop11() {
        System.out.println("цикл с continue mark - результат тот же");
        // Внешний цикл
        mark:
        for (int i = 1; i < 5; i++) {
            // Внутренний цикл
            for (int j = 1; j < 5; j++) {
                if (i == j) {
                    // Выход из внутреннего цикла при четном i
                    continue mark;
                }
                System.out.println("i: " + i + ", j:" + j);
            }
        }
    }

    static void loop2() {
        System.out.println("цикл с continue");
        // Внешний цикл
        for (int i = 1; i < 5; i++) {
            // Внутренний цикл
            for (int j = 1; j < 5; j++) {
                if (i == j) {
                    // пропуск только этой итерации внутреннего цикла, но он продолжается дальше
                    continue;
                }
                System.out.println("i: " + i + ", j:" + j);
            }
        }
    }

    static void loop3() {
        System.out.println("цикл с continue mark в котором есть смысл");
        // Внешний цикл
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 3; k++) {
                    if (k == j && j == i) {
                        System.out.println("Пропуск: i = " + i + ", j = " + j + ", k = " + k);
                        System.out.println("переход сразу к следующему i, минуя следующие j среднего цикла");
                        continue outerLoop; // Пропустить текущую итерацию внутреннего и среднего циклов
                    }
                    System.out.println("i = " + i + ", j = " + j + ", k = " + k);
                }
            }
        }
    }
}