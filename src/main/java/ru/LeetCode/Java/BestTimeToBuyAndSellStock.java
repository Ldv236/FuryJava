package ru.LeetCode.Java;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {

        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {3,7,2,3,5,4};
        int[] prices3 = {7,6,4,3,1};

        System.out.println(maxProfit(prices1));
        System.out.println(maxProfit(prices2));
        System.out.println(maxProfit(prices3));
    }

    public static int bestProfitMy(int[] prices) {
        int profit = 0;
        int dif = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                dif = prices[j] - prices[i];
                if (profit < dif) {
                    profit = dif;
                }
            }
        }
        return profit;
    }

    public static int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
}
