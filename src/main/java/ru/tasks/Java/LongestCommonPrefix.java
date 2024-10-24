package ru.tasks.Java;

public class LongestCommonPrefix {

//        String[] strs = {"car","car","car"};
//        sol.longestCommonPrefix(strs);

    public String longestCommonPrefix(String[] strs) {  //принимает массив строк, возвращает максимальный префикс или же пустоту

        String prefix1;
        String prefix2;
        boolean equalPrefix = true;
        int countChar = 0;
        int minLength = strs[0].length();

        for (String j: strs) {
            minLength = Math.min(j.length(), minLength);
        }

        while (equalPrefix && (minLength > countChar)) {
            countChar++;

            for (int i = 0; i < strs.length - 1; i++) {
                prefix1 = strs[i].substring(0, countChar);
                prefix2 = strs[i + 1].substring(0, countChar);

                if (!prefix1.equals(prefix2)) {
                    equalPrefix = false;
                    countChar--;
                    break;
                }
            }
        }
        return strs[0].substring(0, countChar);
    }

}
