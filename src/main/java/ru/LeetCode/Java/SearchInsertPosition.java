package ru.LeetCode.Java;

public class SearchInsertPosition {
    static int[] nums1 = {1,3,5,6};
    static int target1 = 5;
    static int[] nums2 = {1,3,5,6};
    static int target2 = 2;
    static int[] nums3 = {1,3,5,6};
    static int target3 = 7;


    public static void main(String[] args) {
        System.out.println(searchInsert(nums1, target1));
        System.out.println(searchInsert(nums2, target2));
        System.out.println(searchInsert(nums3, target3));
    }

    public static int searchInsert(int[] nums, int target) {
        int i = 0;
        while (i < nums.length) {
            if (target == nums[i]) {
                break;
            } else if (target > nums[i]) {
                i++;
            } else if (target < nums[i]) {
                break;
            }
        }
        return i;
    }
}