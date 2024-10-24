package ru.tasks.Java;

import java.util.HashMap;

public class WordPatterns {

    public static void main(String[] args) {

        String s = "abba";
        String t = "dog cat cat dog";

        String s1 = "abba";
        String t1 = "dog cat cat fish";

        String s2 = "abba";
        String t2 = "dog dog dog dog";

        System.out.println(wordPattern(s, t));
        System.out.println(wordPattern(s1, t1));
        System.out.println(wordPattern(s2, t2));
    }

    //it's work, but return "Time Limit Exceeded" on LeetCode, sadly
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        char[] chars = pattern.toCharArray();
        HashMap<Character, String> match = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            if (!match.containsKey(chars[i])) {
                if (match.containsValue(words[i])) return false;
                match.put(chars[i], words[i]);
            } else if (!match.get(chars[i]).equals(words[i])) {
                    return false;
            }
        }
        return true;
    }
}
