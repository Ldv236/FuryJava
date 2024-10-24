package ru.tasks.Java;

public class MinimumSizeSubarraySum {

    public static void main(String[] args) {

        int[] array1 = {2,3,1,2,4,3};
        int target1 = 7;
        int[] array2 = {1,4,4};
        int target2 = 4;
        int[] array3 = {1,1,1,1,1,1,1,1};
        int target3 = 11;

        System.out.println(solveN(target1, array1));
        System.out.println(solveN(target2, array2));
        System.out.println(solveN(target3, array3));
    }

    private static int solveN(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        while (r < nums.length) {
            while (r < nums.length && sum < target) {
                sum += nums[r];
                r++;
            }
            if (sum < target) break;

            while (l < r && sum >= target) {
                sum -= nums[l];
                l++;
            }
            minLen = Math.min(minLen, r - l + 1);
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static int minSubArrayLen(int target, int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int l = 0;
        int r = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        while (r < nums.length) {
            sum += nums[r];
            r++;

            while (sum >= target) {
                min = Math.min(min, r - l);
                sum -= nums[l];
                l++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
