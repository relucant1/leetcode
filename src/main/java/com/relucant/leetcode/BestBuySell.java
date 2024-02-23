package com.relucant.leetcode;

/**
 * BestBuySell
 */
public class BestBuySell {

    public static void main(String[] args) {
        int array[] = {7,1,3,6,5,4,2,44};
        System.out.println(bruteArg(array));

    }

    public static int bruteArg(int[] array){
        int bestProfit = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                int temp = array[j]-array[i];
                if(temp>bestProfit){
                    bestProfit=temp;
                }
            }
        }
        return bestProfit;
    }
}