package ru.LeetCode.Java;

import java.util.*;

public class FindAllNumbersDisappearedinArray {

    static int[] nums1 = {4,3,2,7,8,2,3,1};
    static int[] nums2 = {1,1};
    static int[] nums3 = {10,2,5,10,9,1,1,4,3,7};

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(nums1));
        System.out.println(findDisappearedNumbers(nums2));
        System.out.println(findDisappearedNumbers(nums3));

        System.out.println(findDisappearedNumbers2(nums1));
        System.out.println(findDisappearedNumbers2(nums2));
        System.out.println(findDisappearedNumbers2(nums3));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> array = new ArrayList<>();
        int n = nums.length;

        for (int i = 1; i <= n; i++) {
            array.add(i);
        }

        for (int i = 0; i < nums.length; i++) {
            array.remove(Integer.valueOf(nums[i]));
        }

        return array;
    }

    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> array = new ArrayList<>();
        int n = nums.length;

        nums = Arrays.stream(nums).sorted().toArray();

        int addIndex = 1; //index that unique characters will be inserted at
        for(int i = 0; i < n - 1; i++) {
            if(nums[i] < nums[i + 1]){ //if true, num[i + 1] is a new unique number
                nums[addIndex] = nums[i + 1];
                addIndex++;
            }
        }

        for (int i = 0, j = 1; (i < n && j <= n); j++) {
            if (nums[i] == j) {
                i++;
            } else {
                array.add(j);
            }
        }
        return array;
    }
}
