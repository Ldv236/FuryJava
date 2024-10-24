package ru.tasks.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums1 = {2, 5, 3, 2, 9, 8};

        System.out.println(Arrays.toString(sortBubble(nums1)));
    }

    private static void swapElements(int[] arr, int indexA, int indexB) {
        int tmp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = tmp;
    }

    public static int[] sortBubble(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapElements(arr, j, j + 1);
                }
            }
        }
        return arr;
    }
}