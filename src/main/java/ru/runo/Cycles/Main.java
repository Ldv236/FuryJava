package ru.runo.Cycles;

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

        // Nested loop example (multiplication table)
        System.out.println("\nNested loop (Multiplication table):");
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 5; b++) {
                System.out.print(a * b + "\t");
            }
            System.out.println(); // New line after each row
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
    }
}
