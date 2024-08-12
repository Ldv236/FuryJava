package ru.LeetCode.Java;

public class lengthOfLastWord {
    static String str1 = "Hello World";
    static String str2 = "   fly me   to   the moon  ";
    static String str3 = "luffy is still joyboy";


    public static void main(String[] args) {
        System.out.println(findLengthOfLastWord(str1));
        System.out.println(findLengthOfLastWord(str2));
        System.out.println(findLengthOfLastWord(str3));
    }

    public static int findLengthOfLastWord(String s) {
        int k = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                k++;
            } else if (k > 0 && s.charAt(i) == ' ') {
                return k;
            }
        }
        return k;
    }
}