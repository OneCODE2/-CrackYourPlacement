class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}


there is dp approah as well

class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int dp0 = 0;          // max profit if we don't hold stock
        int dp1 = -prices[0]; // max profit if we hold stock

        for (int i = 1; i < prices.length; i++) {
            int newDp0 = Math.max(dp0, dp1 + prices[i]);
            int newDp1 = Math.max(dp1, dp0 - prices[i]);
            dp0 = newDp0;
            dp1 = newDp1;
        }

        return dp0;
    }
}
