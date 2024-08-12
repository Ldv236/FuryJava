package ru.LeetCode.Java;

import java.util.Arrays;
import java.util.List;

public class ValidAnagram {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        String s1 = "rat";
        String t1 = "car";

        System.out.println(isAnagram2(s, t));
        System.out.println(isAnagram2(s1, t1));
    }

    //it's work, but return "Time Limit Exceeded" on LeetCode, sadly
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        outer:
        for (int i = 0; i < charS.length; i++) {
            for (int j = 0; j < charT.length; j++) {
                if (charS[i] == charT[j]) {
                    charS[i] = charT[j] = ' ';
                    continue outer;
                }
            }
            return false;
        }

        return true;
    }

    public static boolean isAnagram2(String s, String t) {

        if(s.length() != t.length()) {
            return false;
        }

        int[] countChars = new int[26];

        for(int i = 0; i < s.length(); i++) {
            countChars[s.charAt(i) - 'a']++;
            countChars[t.charAt(i) - 'a']--;
        }

        for(int i:countChars){
            if(i != 0) {
                return false;
            }
        }

        return true;
    }
}
