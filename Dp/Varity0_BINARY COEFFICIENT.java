https://practice.geeksforgeeks.org/problems/ncr1019/1

//BINARY COEFFICIENT

class Solution{
    static int nCr(int n, int k)
    {
       int dp[][] = new int[n+1][k+1];
        int mod = 1000000007;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=Math.min(i,k);j++)
            {
                if(j == 0 || i == j)
                    dp[i][j] = 1%mod;
                else
                    dp[i][j] = (dp[i-1][j-1]+dp[i-1][j])%mod;
            }
        }
        return dp[n][k];
}
}

*********************************

public static BigInteger nCr(long n, long k){
        if(k>n)
            return new BigInteger("0");
        
        long z=Math.min(n-k,k);
        BigInteger c=new BigInteger("1");
        for(long i=0;i<z;i++){
            c=c.multiply(new BigInteger(""+(n-i)));
            c=c.divide(new BigInteger(""+(i+1)));
        }
        return c;
    }