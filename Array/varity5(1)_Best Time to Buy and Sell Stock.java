
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

// Best Time to Buy and Sell Stock (1)

class Solution {
    public int maxProfit(int[] prices) {
     if(prices.length<1) return 0;
        int min=Integer.MAX_VALUE;
        int maxvalue=0;
        
        for(int i=0;i<prices.length;i++){
        if(prices[i]<min)
            min=prices[i];
        else if(prices[i]-min>maxvalue)
            maxvalue=prices[i]-min;
            
        
        }
        return maxvalue;
    }
}