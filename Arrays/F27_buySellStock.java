import java.util.*;
/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day. 
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day 
 * in the future to sell that stock. Return the maximum profit you can achieve from this transaction. 
 * If you cannot achieve any profit, return 0.
 */
public class F27_buySellStock {
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices) {
        int[] prefixMin = new int[prices.length];
        prefixMin[0] = prices[0];
        for(int i=1; i<prices.length; i++) {
            prefixMin[i] = Math.min(prefixMin[i-1], prices[i]);
        }

        int profit = prices[prices.length-1] - prefixMin[prices.length-1];

        for(int i=prices.length-2; i>=0; i--) {
            profit = Math.max(profit, prices[i]- prefixMin[i] );
        }

        return profit;
    } 
}