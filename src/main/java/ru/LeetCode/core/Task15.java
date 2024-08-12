package ru.LeetCode.core;

import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        int[] source = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(processArray(source)));
    }

    static private int[] processArray(int[] source) {
        int[] result = Arrays.copyOfRange(source, 3, Math.min(source.length, 8));
        for (int i = 0; i < result.length; i++) {
            if (result[i] % 2 == 0) {
                result[i]++;
            }
        }
        return result;
    }
}
