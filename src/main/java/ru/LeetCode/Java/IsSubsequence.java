package ru.LeetCode.Java;

public class IsSubsequence {

    public static void main(String[] args) {

        String s = "abc";
        String t = "ahbgdc";

        String s1 = "bb";
        String t1 = "ahbgdc";

        System.out.println(isSubsequence(s, t));
        System.out.println(isSubsequence(s1, t1));
    }

    //it's work, but return "Time Limit Exceeded" on LeetCode, sadly
    public static boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }

        int sLength = s.length();
        int tLength = t.length();
        int sPointer = 0;
        int tPointer = 0;

        while (tPointer < tLength) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                if (++ sPointer == sLength) return true;
            }
            tPointer ++;
        }
        return false;
    }
}
