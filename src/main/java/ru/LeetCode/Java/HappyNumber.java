package ru.LeetCode.Java;

public class HappyNumber {

    static int steps = 0;
    public static void main(String[] args) {

        int n1 = 19;
        int n2 = 2;

        steps = 0;
        System.out.println(isHappy(n1));
        steps = 0;
        System.out.println(isHappy(n2));
    }

    public static boolean isHappy(int n) {
        if (steps++ > 20) return false;
        double num;
        int sum = 0;
        char[] chars = Integer.toString(n).toCharArray();
        for (char ch : chars) {
            num = Character.getNumericValue(ch);
            num *= num;
            sum += num;
        }
        if (sum == 1) return true;
        else isHappy(sum);

        return false;
    }
}
