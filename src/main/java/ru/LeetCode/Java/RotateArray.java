package ru.LeetCode.Java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{0,1,2,3,4,5};
        int[] nums2 = new int[]{0,1,2,3,4,5};
        int[] nums3 = new int[]{0,1,2,3,4,5};
        int k = 2;
        rotate(nums1, k);
        rotateInPlace(nums2, k);
        rotateSubArray(nums3, k);
    }
    public static void rotate(int[] nums, int k) {
        int size = nums.length;
        k = k % size;
        int[] source = nums.clone();
        for (int i = 0; i < size; i++, k++) {
            if (k < size) {
                nums[k] = source[i];
            } else {
                nums[k-size] = source[i];
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void rotateInPlace(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length-1);  // reverse the whole array
        reverse(nums, 0, k-1);  // reverse the first part
        reverse(nums, k, nums.length-1);  // reverse the second part

        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int tmp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = tmp;
        }
    }
    public static void rotateSubArray(int[] nums, int k) {
        int size = nums.length;
        k = size - k % size;
        int[] subarray1 = Arrays.copyOfRange(nums, 0, k);
        int[] subarray2 = Arrays.copyOfRange(nums, k, size);
        System.arraycopy(subarray2, 0, nums, 0, subarray2.length);
        System.arraycopy(subarray1, 0, nums, size - k, subarray1.length);

        System.out.println(Arrays.toString(nums));
    }
}