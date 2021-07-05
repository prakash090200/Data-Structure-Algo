https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/submissions/
/////Design an algorithm to find the maximum profit. You may complete at most two transactions.



class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int fb = Integer.MIN_VALUE;
        int fs = 0;
        int sb = Integer.MIN_VALUE;
        int ss = 0;
        for (int i=0; i<prices.length; i++){
            fb = Math.max(fb, -prices[i]);
            fs = Math.max(fs, fb+prices[i]);
            sb = Math.max(sb, fs - prices[i]);
            ss = Math.max(ss, sb+prices[i]);
        }
        return ss;
    }
}
*****************************************
DP**


public int maxProfit(int[] prices) {
       if(prices.length ==0)
            return 0;
       int k=2;   // atmost 2 transaction givrn
       int dp[][] = new int[k + 1][prices.length];
		for (int i = 1; i < dp.length; i++) {
			int maxDiff = -prices[0];
			for (int j = 1; j < dp[0].length; j++) {
				maxDiff = Math.max(maxDiff, dp[i - 1][j - 1] - prices[j - 1]);
				dp[i][j] = Math.max(dp[i][j - 1], prices[j] + maxDiff);
			}
		}
		return dp[k][prices.length - 1];
    }