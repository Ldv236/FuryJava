package ru.LeetCode.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums1 = {2, 5, 3, 2, 9, 8};

        System.out.println(Arrays.toString(sortSelection(nums1)));
    }

    private static void swapElements(int[] arr, int indexA, int indexB) {
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }

    public static int[] sortSelection(int[] arr) {

            for (int i = 0; i < arr.length - 1; i++) {
                int minElementIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minElementIndex]) {
                        minElementIndex = j;
                    }
                }
                swapElements(arr, i, minElementIndex);
            }
        return arr;
    }
}