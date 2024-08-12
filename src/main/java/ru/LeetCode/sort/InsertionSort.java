package ru.LeetCode.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums1 = {2, 5, 3, 2, 9, 8};

        System.out.println(Arrays.toString(sortInsertion(nums1)));
    }

    public static int[] sortInsertion(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] >= temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
        return arr;
    }
}