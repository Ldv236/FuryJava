package ru.tasks.Java;

import java.math.BigInteger;

// LeetCode66 PlusOne
//int[] digits = new int[]{9,8,7,6,5,4,3,2,1,0};
//sol.plusOne(digits);

public class PlusOne {

    public int[] plusOne(int[] digits) {

        String strAll = "";
        String strAdd = "";
        String strIncr = "";

        for (int i = 0; i < digits.length; i++) {
            strAdd = Integer.toString(digits[i]);
            strAll = strAll + strAdd; //one of the available options
        }

        BigInteger bigInt = new BigInteger(strAll);

        BigInteger one = new BigInteger("1");
        bigInt = bigInt.add(one);
        strIncr = bigInt.toString();

        int[] result = new int[strIncr.length()];

        for (int i = 0; i < strIncr.length(); i++) {
            result[i] = Integer.parseInt(strIncr.substring(i, i + 1));
        }

        return result;
    }

    public int[] plusOne2(int[] digits) { //genius solution fro this task ever!!!

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
