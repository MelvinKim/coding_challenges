package com.company.dynamicProgramming.easy;

public class BestTimeToBuyAndSellStock {
    //Double for loop solution --> but FAILS when given a large input array
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int n = prices.length;

        for (int i=0; i < n-1; i++) {
            for (int j=i+1; j < n; j++) {
                if(prices[j] > prices[i]) {
                    int currentProfit = prices[j] - prices[i];

                    maxProfit = Math.max(currentProfit, maxProfit);
                }
            }
        }

        return maxProfit;
    }

    public static int maxProfitOptimal(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        //keep Track of the minimum value that we have seen so far
        int minValue = Integer.MAX_VALUE;


        for (int i=0; i < n; i++) {
            //update minValue
            if(prices[i] > minValue) {
                minValue = prices[i];
            } else if(prices[i] - minValue > maxProfit) {
                maxProfit = prices[i] - minValue;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {1,2,4,6,4,3,9,5,7,9,3,5,6,8,3,5,7,5,8,9,3,3,4,5,6,7,6,7,6,9};
        System.out.println("Max profit: " + maxProfit(prices));
    }
}
