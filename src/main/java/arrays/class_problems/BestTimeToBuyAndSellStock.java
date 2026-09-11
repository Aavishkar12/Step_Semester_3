package arrays.class_problems;

import java.util.Arrays;

/**
 * Week 4 - S4 - Practice Problem L2: Best Time to Buy and Sell Stock
 *
 * One pass: keep the lowest price seen so far and the best profit "if sold today".
 * Time O(n), space O(1).
 */
public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[][] inputs = {{7, 1, 5, 3, 6, 4}, {7, 6, 4, 3, 1}};
        for (int[] prices : inputs) {
            System.out.println("prices = " + Arrays.toString(prices) + " -> " + maxProfit(prices));
        }
    }
}
