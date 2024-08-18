package ru.LeetCode.Java;

import java.util.Arrays;

public class UniqueElementsInFirstSortArray {
    public static void main(String[] args) {
        int[] array1 = {2, 3, 3, 3, 5, 9};
        int[] array2 = {1, 1, 1, 3, 4};
        System.out.println(Arrays.toString(findUniqueElements(array1, array2)));
    }

    public static int[] findUniqueElements(int[] array1, int[] array2) {
        int[] result = new int[array1.length];
        int left = 0;
        int right = 0;
        int resultIndex = 0;

        while (left < array1.length && right < array2.length) {
            System.out.println("left: " + left + " right: " + right);
            System.out.println("left: " + array1[left] + " right: " + array2[right]);
            if (array1[left] == array2[right]) {
                left++;
//                right++; // не надо т.к. в первом массиве может быть подряд несколько одинаковых элементов,
//                которые совпадают с одиним элементом из второго
            } else if (array1[left] > array2[right]) {
                right++;
            } else {
                result[resultIndex++] = array1[left++];
            }
        }

        while (left < array1.length) {
            result[resultIndex++] = array1[left++];
        }
        return Arrays.copyOfRange(result, 0, resultIndex);
    }
}
