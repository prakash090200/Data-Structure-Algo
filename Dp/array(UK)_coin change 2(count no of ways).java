https://leetcode.com/problems/coin-change-2/

// Coin Change 2


class Solution {
    public int change(int sum, int[] nums) {
        int n=nums.length;
        int [][]dp=new int[n+1][sum+1];
        for(int i=0;i<sum+1;i++)
            dp[0][i]=0;
        for(int j=0;j<n+1;j++)
             dp[j][0]=1;
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                
                if(nums[i-1]<=j)
                  dp[i][j]=dp[i][j-nums[i-1]] + dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j];
                    
                }
            }
        return dp[n][sum];
    }
}