package ru.LeetCode.Java;

import java.util.Arrays;

public class MergeSortedArray {

    static int[] nums1 = {1,2,3,0,0,0};
    static int m = 3;
    static int[] nums2 = {2,5,6};
    static int n = 3;
    static int[] nums12 = {1};
    static int m2 = 1;
    static int[] nums22 = {};
    static int n2 = 0;
    static int[] nums13 = {0};
    static int m3 = 0;
    static int[] nums23 = {1};
    static int n3 = 1;

    public static void main(String[] args) {
        merge(nums1, m, nums2,n);
        merge(nums12, m2, nums22,n2);
        merge(nums13, m3, nums23,n3);
    }

    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
