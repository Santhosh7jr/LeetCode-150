package ArraynSring.bestTimeToBuyandSellStock121_07;

import java.util.Arrays;

class TestCase{
    int prices[];
    int n;
    public TestCase(int[] prices){
        this.prices=prices;
    }
}

public class Solution {

    public static void main(String[] args) {
        TestCase testCase1=new TestCase(new int[] {7,1,5,3,6,4});
        TestCase testCase2=new TestCase(new int[] {7,6,4,3,1});

        System.out.println("TestCase1 Result: " + maxProfit(testCase1.prices));

        System.out.println("TestCase2 Result: " + maxProfit(testCase2.prices));

    }

    public static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            int tempProfit = prices[i] - minPrice;
            minPrice = Math.min(minPrice, prices[i]);
            profit = Math.max(profit, tempProfit);
        }

        return profit;

    }

}
