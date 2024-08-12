package ru.LeetCode.Java;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums1 = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums2 = new int[]{1, 1};
        int[] nums3 = new int[]{1, 2};
        int[] nums4 = new int[]{1, 1, 2};
        int[] nums5 = new int[]{-3,-1,0,0};
        removeDuplicatesMy(nums4);
        removeDuplicatesOther(nums4);
    }

    public static int removeDuplicatesMy(int[] nums) {
        int l = nums.length;
        if (l == 0) return 0; //if array is empty
        if (l == 1) return 1; //if array contain 1 item
        if (l > 1) { //if all items of array equals
            for (int i = 0; i < l - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    if (i == l-2) {
                        return 1;
                    }
                }
                else {break;}
            }
        }
        //int k1 = 0;
        int k2 = l;
        //int k3 = 0;

        for (int i = 0; i < l - 1; i++) {
            //k1 = i + 1;
            if (nums[i] == nums[i + 1]) {
                k2--;
                for (int j = i + 1; j < l - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[l - 1] = nums[l - 1] - 1;
                //if (i > 0) {i--; }
                i--;
            }
            else if (nums[i] > nums[i + 1])  {
                //k3 = i + 1;
                break;
            }
        }
        return k2;
    }

    public static int removeDuplicatesOther(int[] nums) {
        if(nums.length == 0)
            return 0;

        int addIndex = 1; //index that unique characters will be inserted at

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] < nums[i + 1]){ //if true, num[i + 1] is a new unique number
                nums[addIndex] = nums[i + 1];
                addIndex++;
            }
        }
        return addIndex;
    }
}
