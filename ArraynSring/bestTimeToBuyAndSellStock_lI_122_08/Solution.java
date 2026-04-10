package ArraynSring.bestTimeToBuyAndSellStock_lI_122_08;
import java.util.*;

class TestCase{
    int prices[];
    int n;
    public TestCase(int[] prices){
        this.prices=prices;
    }
}

public class Solution {

    public static void main(String[] args) {
        TestCase testCase1 = new TestCase(new int[]{7, 1, 5, 3, 6, 4});
        TestCase testCase2 = new TestCase(new int[]{1, 2, 3, 4, 5});
        TestCase testCase3 = new TestCase(new int[]{7, 6, 4, 3, 1});

        System.out.println("TestCase1 Result: " + maxProfit(testCase1.prices));

        System.out.println("TestCase2 Result: " + maxProfit(testCase2.prices));

        System.out.println("TestCase3 Result: " + maxProfit(testCase3.prices));

    }

    public static int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length + 1][2];

        for (int[] row : dp) Arrays.fill(row, -1);

        return getMaxProfit(prices, 0, 1, dp);
    }

    private static int getMaxProfit(int[] prices, int idx, int flag, int[][] dp) {

        if (idx == prices.length) return 0;

        if (dp[idx][flag] != -1) return dp[idx][flag];

        if (flag == 1) {
            dp[idx][flag] = Math.max(
                    -prices[idx] + getMaxProfit(prices, idx + 1, 0, dp),
                    getMaxProfit(prices, idx + 1, 1, dp)
            );
        } else {
            dp[idx][flag] = Math.max(
                    prices[idx] + getMaxProfit(prices, idx + 1, 1, dp),
                    getMaxProfit(prices, idx + 1, 0, dp)
            );
        }

        return dp[idx][flag];

    }
}