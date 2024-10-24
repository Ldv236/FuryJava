package ru.ldv236.core.lesson4RecursBoxingTime;

import java.util.Objects;
import java.util.Random;

public class Lesson4 {

    public static void main(String[] args) {
//        recurs(1);
//        System.out.println(factorialRecursion(26));
//        System.out.println(factorialLoop(5));
//        overFlow();

//        Integer i = 682;
//        Double d = 2.33;
//        Boolean b = false;
//
//        String si = i.toString();
//        System.out.println("si - " + si);
//
//        String sd = d.toString();
//        System.out.println(sd);
//
//        String sb = b.toString();
//        System.out.println(sb);

//        String stringNumber = "123456";
////        stringNumber++;
//        Integer intFromString = Integer.parseInt(stringNumber);
//        intFromString++;
//        System.out.println(intFromString);

//        System.out.println(boxing(128));
//        Integer i = 682;
//        System.out.println(unboxing(i));

//        castTypes();
//        System.out.println(fibonacciRecursion(10));
//        System.out.println(fibonacciLoop(10));

//        int number1 = 10;
//        int number2 = number1;
//        Integer numberWrapper1 = number1;
//        Integer numberWrapper2 = number2;
//        System.out.println(numberWrapper1 == numberWrapper2);
//        System.out.println(Objects.equals(numberWrapper1, numberWrapper2));

        timePrim(100_000_000);
        timeWrap(100_000_000);

        Long min = Long.MIN_VALUE;
        System.out.println(min - 1);
        Long max = Long.MAX_VALUE;
        System.out.println(max + 1);

    }

    static void timePrim(int count) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();

        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += i;
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Время выполнения операции: " + duration + " миллисекунд");
    }

    static void timeWrap(int count) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();

        Integer sum = 0;
        for (int i = 0; i < count; i++) {
            sum += i;
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Время выполнения операции: " + duration + " миллисекунд");
    }

    static void recurs(int num) {
        System.out.println(num);
        num++;
        recurs(num);
    }

    static long factorialRecursion(long n) {
        if (n == 0) {
            return 1;
        } else {
            long result = factorialRecursion(n - 1);
            return n * result;
        }
    }

    static long factorialLoop(long n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    static void overFlow() {
        Integer i = Integer.MAX_VALUE; //snake_case   camelCase
        System.out.println(i);
        i++;
        System.out.println(i);
    }

    static Integer boxing(int number) {
        Integer boxedNumberAuto = number;
        Integer boxedNumber = Integer.valueOf(number);
        System.out.println(number == boxedNumberAuto);
        System.out.println(number == boxedNumber);
        System.out.println(boxedNumberAuto == boxedNumber);
        System.out.println(Objects.equals(boxedNumberAuto, boxedNumber));

        return boxedNumber;
    }

    static int unboxing(Integer boxedNumber) {
//        int numberAuto = boxedNumber;
        int number = boxedNumber.intValue();
        return number;
    }

    static void castTypes() {
        int x = 10;
        double y = x;
        System.out.println("x - " + x + ", y - " + y);

        double x2 = 10.9;
        int y2 = (int) x2;
        System.out.println("x2 - " + x2 + ", y2 - " + y2);

        int x3 = 1000;
        byte y3 = (byte) x3;
        System.out.println("x3 - " + x3 + ", y3 - " + y3);
    }

    static long fibonacciRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    static long fibonacciLoop(int n) {
        if (n <= 1) {
            return n;
        }

        long fib = 1;
        long prevFib = 1;

        for (int i = 2; i < n; i++) {
            long temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }
}