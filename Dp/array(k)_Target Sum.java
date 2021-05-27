// https://leetcode.com/problems/target-sum/submissions/

// Target Sum

class Solution {
    public int findTargetSumWays(int[] nums, int S) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        
        if(sum<S || (S+sum)%2 !=0)
            return 0;
        
        int s=(sum+S)/2;
        int len=nums.length;
        int [][] dp=new int[len+1][s+1];
        for(int i=0;i<s+1;i++)
            dp[0][i]=0;
        for(int i=0;i<len+1;i++)
            dp[i][0]=1;
            
        for(int i=1;i<len+1;i++){
          for(int j=0;j<s+1;j++){
              
              if(nums[i-1]<=j)
                 dp[i][j]=dp[i-1][j-nums[i-1]] + dp[i-1][j];
              else
                  dp[i][j]=dp[i-1][j];
              
          }  
            
            
          }
        return dp[len][s];
        
        
    }
}