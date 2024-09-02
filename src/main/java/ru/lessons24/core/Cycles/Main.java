package ru.lessons24.core.Cycles;

public class Main {
    public static void main(String[] args) {
        // For loop example
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Итерация № " + i);
        }

        // While loop example
        System.out.println("\nWhile loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Итерация № " + j);
            j++;
        }

        // Do-while loop example
        System.out.println("\nDo-while loop:");
        int k = 1;
        do {
            System.out.println("Iteration " + k);
            k++;
        } while (k <= 5);

        boolean flag = true;
        while (flag) {
            System.out.println("Итерация № " + j);
            j++;
            if (j > 10) {
                flag = false;
                System.out.println("Выход из цикла");
            }
        }

        // Nested loop example
        System.out.println("\nNested loop ");
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                System.out.println(a + " " + b);
                if (a == b) {
                    System.out.println("совпадение");
                }
            }
        }

        // Loop with break example
        System.out.println("\nLoop with break:");
        for (int m = 1; m <= 10; m++) {
            if (m == 6) {
                System.out.println("Breaking loop at iteration " + m);
                break;
            }
            System.out.println("Iteration " + m);
        }
        // Loop with continue example
        System.out.println("\nLoop with continue:");
        for (int n = 1; n <= 10; n++) {
            if (n % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println("Iteration " + n);
        }



        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println("Итерация № " + i);
        }

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Итерация № " + i);
        }

        byte b = 0;
//        while (true) {
//            System.out.println("Byte value: " + b);
//            b++; // Инкрементируем переменную b
//
//            // Задержка в 50 миллисекунд
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//                System.out.println("Thread interrupted: " + e.getMessage());
//            }
//        }
    }
}
