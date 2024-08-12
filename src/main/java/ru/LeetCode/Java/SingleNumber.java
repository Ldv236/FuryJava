package ru.LeetCode.Java;

import java.util.Arrays;

public class SingleNumber {

    static int[] nums1 = {2,2,1};
    static int[] nums2 = {4,1,2,1,2};
    static int[] nums3 = {1};

    public static void main(String[] args) {
        System.out.println(singleNumber2(nums1));
        System.out.println(singleNumber2(nums2));
        System.out.println(singleNumber2(nums3));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public static int singleNumber2(int[] nums) {
        int result = 0;
        for(int i : nums) {
            result ^= i;
        }
        return result;
    }
}
