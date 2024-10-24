package ru.tasks.Java;

public class IndexFirstOccurrencyString {
    static String haystack = "sadbutsad";
    static String haystack2 = "a";
    static String needle = "tsad";
    static String needle2 = "a";

    public static void main(String[] args) {
        System.out.println(strStr(haystack, needle));
        System.out.println(strStr(haystack2, needle2));
    }

    public static int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.startsWith(needle, i)) {
                return i;
            }
        }
        return -1;
    }
}