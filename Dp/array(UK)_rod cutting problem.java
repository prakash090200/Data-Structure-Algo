https://practice.geeksforgeeks.org/problems/cutted-segments1642/1#

//Maximize The Cut Segments 


class Solution
{
    public int maximizeCuts(int n, int x, int y, int z)
    {
        int dp[] = new int[n+1];
        dp[0] = 0;
        int arr[] = new int[]{x,y,z};
        for(int j=0;j<3;j++) {
           
            for(int i=1;i<=n;i++)
            {
              
                if( i==arr[j] || ( i > arr[j] && dp[i-arr[j]] > 0 ) )
                    dp[i] = Math.max(dp[i-arr[j]]+1,dp[i]);
            }
        }
        
        return dp[n];
    }
}