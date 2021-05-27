https://practice.geeksforgeeks.org/problems/friends-pairing-problem5425/1

// Friends Pairing Problem

class Solution
{
    public long countFriendsPairings(int n) 
    { 
      
        if(n<=2)
		{
			return n;
		}
		long[] dp=new long[n+1];
		dp[1]=1;
		dp[2]=2;
		long mod=1000000007;
		for(int i=3;i<n+1;i++)
		{
			dp[i]=(dp[i-1]+((i-1)*dp[i-2])%mod)%mod;
		}
		return dp[n];
    }
    
}    
 