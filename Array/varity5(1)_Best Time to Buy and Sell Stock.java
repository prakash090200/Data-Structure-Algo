
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
            maxvalue=Math.max(maxvalue,prices[i]-min);
            
        
        }
        return maxvalue;
    }
}

***************************************************
OR

class Solution {
    public int maxProfit(int[] prices) {
     if(prices.length<1) return 0;
        int min=Integer.MIN_VALUE;
        int maxvalue=0;
        
        for(int i=0;i<prices.length;i++){
        min=Math.max(min,-prices[i]);
        maxvalue=Math.max(maxvalue,min+prices[i]);
            
        
        }
        return maxvalue;
    }
}