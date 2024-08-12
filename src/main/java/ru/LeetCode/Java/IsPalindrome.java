package ru.LeetCode.Java;

public class IsPalindrome {

    public boolean isPalindrome(int x) { //принимает число, определяет симметричное оно или нет
        String s = String.valueOf(x);
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
