package ru.LeetCode.Java;

import java.util.Arrays;

public class MajorityElement {

    static int[] nums1 = {3,2,3};
    static int[] nums2 = {2,2,1,1,1,2,2};
    static int[] nums3 = {1};

    public static void main(String[] args) {
        System.out.println(majorityElement(nums1));
        System.out.println(majorityElement(nums2));
        System.out.println(majorityElement(nums3));
    }

    public static int majorityElement(int[] nums) {
        if (nums.length < 3) {
            return nums[0];
        }

        Arrays.sort(nums);
        int half = nums.length / 2;
        int count = 1;
        int res = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
                if (count > half) {
                    res = nums[i];
                }
            } else { count = 1; }
        }
        return res;
    }
}
