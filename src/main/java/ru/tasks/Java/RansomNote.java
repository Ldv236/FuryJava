package ru.tasks.Java;

import java.util.HashMap;

public class RansomNote {

    public static void main(String[] args) {

        String s = "aa";
        String t = "ab";

        String s1 = "aa";
        String t1 = "aab";

        System.out.println(canConstruct(s, t));
        System.out.println(canConstruct(s1, t1));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] hash = new int[26];
        for (char c : magazine.toCharArray())
            ++hash[c - 'a'];
        for (char c : ransomNote.toCharArray())
            if (--hash[c - 'a'] < 0)
                return false;
        return true;
    }

    public static boolean canConstructHashMap(String ransomNote, String magazine) {
        HashMap<Character, Integer> chars = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            if (!chars.containsKey(magazine.charAt(i))) {
                chars.put(magazine.charAt(i), 1);
            } else {
                chars.put(magazine.charAt(i), chars.get(magazine.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (!chars.containsKey(ransomNote.charAt(i))) return false;
            else {
                chars.put(ransomNote.charAt(i), chars.get(ransomNote.charAt(i)) - 1);
                if (chars.get(ransomNote.charAt(i)) < 0) return false;
            }
        }
        return true;
    }
}
