package ru.LeetCode.Java;

import java.util.Arrays;

public class UniqueElementsInFirstSortArray {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 3};
        int[] array2 = {1, 2, 4};
        System.out.println(Arrays.toString(findUniqueElements(array1, array2)));
    }

    public static int[] findUniqueElements(int[] array1, int[] array2) {
        int[] tempResult = new int[array1.length];
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
                tempResult[resultIndex++] = array1[left++];
            }
        }

        while (left < array1.length) {
            tempResult[resultIndex++] = array1[left++];
        }
        return Arrays.copyOfRange(tempResult, 0, resultIndex);
    }
}
