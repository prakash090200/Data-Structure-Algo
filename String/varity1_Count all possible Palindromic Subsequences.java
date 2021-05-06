https://practice.geeksforgeeks.org/problems/count-palindromic-subsequences/1

//Count all possible Palindromic Subsequences


class GfG
{   int countPS(String str)
    {
        int n = str.length();
        int[][] dp = new int[n][n];
        return countPalindromicSequence(str,0,n-1,dp);
    }
    public static int countPalindromicSequence(String str, int i, int j,int dp[][]){
        int n = str.length();
        for(int gap = 0;gap<n;gap++){
            for(i =0,j=gap;j<n;j++,i++){
                if(i==j){
                    dp[i][j] = 1;
                    continue;
                }
                int a = dp[i+1][j-1];
                int b = dp[i][j-1];
                int c = dp[i+1][j];

                if(str.charAt(i) == str.charAt(j)){
                    dp[i][j] = b+c+1;
                }
                else{
                    dp[i][j] = b+c-a;
                }
            }
        }
        return dp[0][n-1];
    }
    
}


************************************************************************

////// LONG TYPE IF ASKED THEN DO THE FOLLOWING (   long m=1000000007;and everywhere just replace long content with ( +m)%m;
class Solution
{
    long countPS(String str)
    {
       
     
        int n = str.length();
        long[][] dp = new long[n][n];
        return countPalindromicSequence(str,0,n-1,dp);
    }
    public static long countPalindromicSequence(String str, int i, int j,long dp[][]){
        int n = str.length();
        long m=1000000007;
        for(int gap = 0;gap<n;gap++){
            for(i =0,j=gap;j<n;j++,i++){
                if(i==j){
                    dp[i][j] = 1;
                    continue;
                }
                long a = (dp[i+1][j-1]+m)%m;
                long b = (dp[i][j-1]+m)%m;
                long c = (dp[i+1][j]+m)%m;

                if(str.charAt(i) == str.charAt(j)){
                    dp[i][j] = (b+c+1+m)%m;
                }
                else{
                    dp[i][j] = (b+c-a+m)%m;
                }
            }
        }
        return dp[0][n-1]%m;
   
    }
}