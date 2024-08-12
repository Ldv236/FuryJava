package ru.LeetCode.Java;


public class RemoveElement {

    static int[] arr= {3,2,2,3};
    static int val = 3;

    static int[] arr2= {0,1,2,2,3,0,4,2};
    static int val2 = 2;

    static int res;

    public static void main(String[] args) {
        res = removeElement(arr, val);
        res = removeElement(arr2, val2);
        res = removeElementOther(arr, val);
        res = removeElementOther(arr2, val2);
    }

    public static int removeElement(int[] nums, int val) {
        int k = nums.length;
        int temp;
        int gap = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                temp = nums[nums.length - gap];
                nums[nums.length - gap] = nums[i] ;
                nums[i] = temp;
                k--;
                gap++;
                if (nums[i] == val) {
                    i--;
                }
            }
            if (nums.length - gap == i) {
                return  k;
            }
        }
        return k;
    }


    public static int removeElementOther(int[] nums, int val) {
        int i = 0;
        for (int n : nums)
            if (n != val)
                nums[i++] = n;
        return i;
    }
}
