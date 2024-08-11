package ru.ldv236.lesson3ArraysMethods;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        processArray();
        int calc;
        calc = calculate(2, 5);
        print(calc);

        String name = "Anna";
        greet(name);

        int[] arrWithData = {4, 2, 7, 9, 7};

        int resultSum = sumArrayValue(arrWithData);
        System.out.println(resultSum);

        int resultSumAndMultiply = sumArrayValue(arrWithData, 2);
        System.out.println(resultSumAndMultiply);

        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(doLogicAnd(bool1, bool2));
        System.out.println(doLogicOr(bool1, bool2));

        if (bool1 || bool2) {
            
        }
    }

    static void processArray() {
        int[] arr;
        arr = new int[5];
        arr[0] = 2;
        arr[1] = 2;
        arr[2] = 2;
        arr[3] = 2;
        arr[4] = 2;

        int[] arr2 = new int[10];
        System.out.println(arr2.length);

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i;
//            System.out.print(arr2[i]);
        }

        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr2));

        int[] arrWithData = {4, 2, 7, 9, 7};
        arrWithData[4] = 8;
        System.out.println(Arrays.toString(arrWithData));

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        String[] names = {"Denis", "Sergey", "Anya"};

        int[] array = {4, 2, 7, 9, 7, 7};
        System.out.println(Arrays.toString(array));

        int[] newArray = new int[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);
        System.out.println(Arrays.toString(newArray));

        int[] newArray2 = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.toString(newArray2));
    }

    static int calculate(int a, int b) {
        int result = a + b;
        return result;
    }

    static void print(int num) {
        System.out.println(num);
        greet(Integer.toString(num));
    }

    static void greet(String hi) {
        System.out.println("Привет, " + hi);
    }

//    static int sum;
    static int sumArrayValue(int[] intArray) {
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
        }
        return sum;
    }

    static int sumArrayValue(int[] intArray, int multiply) {
        //DRY - don't repeat yourself
        int sum = sumArrayValue(intArray);
        return sum * multiply;
    }

    static boolean doLogicAnd(boolean bool1, boolean bool2) {
        return bool1 && bool2;
    }

    static boolean doLogicOr(boolean bool1, boolean bool2) {
        return bool1 || bool2;
    }
}