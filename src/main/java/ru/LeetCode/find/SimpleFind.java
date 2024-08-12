package ru.LeetCode.find;

import java.util.Arrays;
import java.util.Random;

public class SimpleFind {
    public static void main(String[] args) {

        Random random = new Random();
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target1 = 8;
        String str1 = "";
        System.out.println(linearContains(nums1, target1));


        int[] genArr1 = new int[10_000_000];
        for (int i = 0; i < genArr1.length; i++) {
            genArr1[i] = i;
        }
        int[] genArr2 = Arrays.copyOf(genArr1, 10_000_000);

        long start1 = System.currentTimeMillis();
        System.out.println(linearFindIndex(genArr1, 9_999_888));
        System.out.println(System.currentTimeMillis() - start1);

        long start2 = System.currentTimeMillis();
        System.out.println(binaryFindIndex(genArr2, 9_999_888));
        System.out.println(System.currentTimeMillis() - start2);
    }

    public static boolean linearContains(int[] arr, int element) {
        for (int i : arr) {
            if (i == element) {
                return true;
            }
        }
        return false;
    }

    public static int linearFindIndex(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static int binaryFindIndex(int[] arr, int element) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (element == arr[mid]) {
                return mid; //true
            }

            if (element < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1; //false
    }
}