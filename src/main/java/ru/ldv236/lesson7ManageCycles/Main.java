package ru.ldv236.lesson7ManageCycles;

public class Main {
    public static void main(String[] args) {
        loop1();
        System.out.println();
        loop2();
        System.out.println();
        loop3();
        System.out.println();
        loop4();
        System.out.println();
        loop5();
    }

    static void loop1() {
        System.out.println("цикл с break");
        // Внешний цикл
        for (int i = 1; i < 5; i++) {
            // Внутренний цикл
            for (int j = 1; j < 5; j++) {
                if (i == j) {
                    // Выход из внутреннего цикла при четном i
                    System.out.println("брейк во вложенном цикле, т.к. i == j == " + i);
                    break;
                }
                System.out.println("i: " + i + ", j:" + j);
            }
        }
    }

    static void loop2() {
        System.out.println("цикл с continue mark - результат тот же");
        // Внешний цикл
        mark:
        for (int i = 1; i < 5; i++) {
            // Внутренний цикл
            for (int j = 1; j < 5; j++) {
                if (i == j) {
                    // Выход из внутреннего цикла при четном i
                    System.out.println("continue mark во вложенном цикле, т.к. i == j == " + i);
                    continue mark;
                }
                System.out.println("i: " + i + ", j:" + j);
            }
        }
    }

    static void loop3() {
        System.out.println("цикл с continue");
        // Внешний цикл
        for (int i = 1; i < 5; i++) {
            // Внутренний цикл
            for (int j = 1; j < 5; j++) {
                if (i == j) {
                    // пропуск только этой итерации внутреннего цикла, но он продолжается дальше
                    System.out.println("continue во вложенном цикле, т.к. i == j == " + i);
                    continue;
                }
                System.out.println("i: " + i + ", j:" + j);
            }
        }
    }

    static void loop4() {
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

    static void loop5() {
        System.out.println("тройной цикл с break");
        // Внешний цикл
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 3; k++) {
                    if (k == j && j == i) {
                        System.out.println("i = " + i + ", j = " + j + ", k = " + k + " - break");
//                        continue outerLoop; // Пропустить текущую итерацию внутреннего и среднего циклов
                        break;
                    }
                    System.out.println("i = " + i + ", j = " + j + ", k = " + k);
                }
            }
        }
    }
}