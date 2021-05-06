https://leetcode.com/problems/count-different-palindromic-subsequences/
////Count Different Palindromic Subsequences


class Solution {
    public int countPalindromicSubsequences(String S) {
        int n = S.length();
        int[][] dp = new int[n][n];
        
        for(int gap=0; gap<n; gap++)
        {
            for(int left=0; left<n-gap; left++)
            {
                int right = left+gap;
                if(gap==0)
                {dp[left][right]=1;}
                else
                {
                    if(S.charAt(left)==S.charAt(right))
                    {
                        int lo = left+1;
                        int hi = right-1;
                        
                        while(lo<=hi && S.charAt(lo)!=S.charAt(left))
                        {lo++;}

                        while(lo<=hi && S.charAt(hi)!=S.charAt(left))
                        {hi--;}
                        
                        if(lo>hi)
                        {
                         dp[left][right] = dp[left+1][right-1]*2 + 2;   
                        }
                        else if(lo==hi)
                        {
                        dp[left][right] = dp[left+1][right-1]*2 + 1;       
                        }//aaa
                        else
                        {
                         dp[left][right] = dp[left+1][right-1]*2 - dp[lo+1][hi-1];  
                        }
                        
                    }
                    else
                    {dp[left][right] = dp[left][right-1] + dp[left+1][right] - dp[left+1][right-1];}
                              
                  dp[left][right] = dp[left][right] < 0 ? dp[left][right] + 1000000007 : dp[left][right] % 1000000007;           
                }
            }
        }
    return  dp[0][n-1];
    }                           
}