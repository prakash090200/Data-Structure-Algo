https://practice.geeksforgeeks.org/problems/longest-subsequence-such-that-difference-between-adjacents-is-one4724/1



//longest-subsequence-such-that-difference-between-adjacents-is-one




class Solution{
    static int longestSubsequence(int n, int arr[])
    {
       int dp[] = new int[n];
        for (int i = 0; i< n; i++)
            dp[i] = 1;
 
        
        for (int i = 1; i < n; i++)
        {
            
            for (int j = 0; j < i; j++)
            {
                
                if ((arr[i] == arr[j] + 1) ||
                    (arr[i] == arr[j] - 1))
 
                dp[i] = Math.max(dp[i], dp[j]+1);
            }
        }
 
        
        int result = 1;
        for (int i = 0 ; i < n ; i++)
            if (result < dp[i])
                result = dp[i];
        return result;
    }
}