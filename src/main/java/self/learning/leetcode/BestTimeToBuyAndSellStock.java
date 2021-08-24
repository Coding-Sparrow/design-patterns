package self.learning.leetcode;

/**
 * Kadane algorithm
 * Time Complexity O(n)
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int stocksPrices[] = new int[]{7,1,5,3,6,4};
        int maxProfit = maxProfit(stocksPrices);
        System.out.println("Maximum profit : "+maxProfit);
        int stocksPrices2[] = new int[]{7,1,5,2,3,6,4,9};
        int maxProfit2 = maxProfit(stocksPrices2);
        System.out.println("Max Profit 2 : "+maxProfit2);
    }

    private static int maxProfit(int[] stocksPrices) {
        int minimum = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int day = 0;day < stocksPrices.length;day++){
            minimum = Math.min(minimum,stocksPrices[day]);
            maxProfit = Math.max(stocksPrices[day]-minimum,maxProfit);
        }
        return maxProfit;
    }
}
