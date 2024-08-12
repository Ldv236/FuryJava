package ru.LeetCode;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
        long i = list.stream().filter(x -> (x % 2 == 0 && x > 0)).count();
        System.out.println(i);

        Set<Character> set = new HashSet<>();
        set.size();
        set.remove('a');
        String s = "asdfghjklzxcvbnm";
        System.out.println(s.charAt(0));

        String numStr = String.valueOf(123456);
        List<Integer> digits = new ArrayList<>();
        for (char c : numStr.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.add(c - '0'); // '0' имеет ASCII значение 48
            }
        }
        System.out.println(digits);
    }
}
