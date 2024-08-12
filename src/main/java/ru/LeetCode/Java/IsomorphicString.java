package ru.LeetCode.Java;

import java.util.HashMap;

public class IsomorphicString {

    public static void main(String[] args) {

        String s = "egg";
        String t = "add";

        String s1 = "paper";
        String t1 = "title";

        String s2 = "badc";
        String t2 = "baba";

        System.out.println(isIsomorphic(s, t));
        System.out.println(isIsomorphic(s1, t1));
        System.out.println(isIsomorphic(s2, t2));
    }

    //it's work, but return "Time Limit Exceeded" on LeetCode, sadly
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int steps = s.length();
        HashMap<Character, Character> match = new HashMap<>();

        for (int i = 0; i < steps; i++) {
            if (!match.containsKey(s.charAt(i))) {
                if (match.containsValue(t.charAt(i))) return false;
                match.put(s.charAt(i), t.charAt(i));
            } else if (match.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
