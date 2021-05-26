
https://leetcode.com/problems/partition-equal-subset-sum/

/// Partition Equal Subset Sum

class Solution {
    public static boolean solve(int [] nums, int sum){
        int n=nums.length;
        boolean [][]dp=new boolean[n+1][sum+1];
        dp[0][0]=true;
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                
                if(nums[i-1]<=j)
                  dp[i][j]=dp[i-1][j-nums[i-1]] || dp[i-1][j];
                else
                    dp[i][j]=dp[i-1][j];
                    
                }
            }
        return dp[n][sum];
  }
            
        
    
    public boolean canPartition(int[] nums) {
        int sum=0;
         for(int i=0;i<nums.length;i++)
             sum+=nums[i];
        if(sum%2!=0)
            return false;
        else
            return solve(nums,sum/2);
       
        
    }
}

***************************************************************

class Solution {
   
    public boolean canPartition(int[] nums) {
        int total = 0;
        
        for(int x : nums)
            total += x;
        
        if(total % 2 != 0)return false;
        
        int sum = total/2;
        
        boolean[] dp = new boolean[sum+1];
        
        dp[0] = true;

        for(int i=0;i<nums.length;i++){
            for(int j=sum;j>=nums[i];j--)
                if(!dp[j])
                    dp[j] = dp[j - nums[i]];
        }
        
        return dp[sum];
       
        
    }
}