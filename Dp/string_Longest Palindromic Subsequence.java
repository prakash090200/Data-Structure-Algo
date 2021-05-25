https://leetcode.com/problems/longest-palindromic-subsequence/

// Longest Palindromic Subsequence


class Solution {
    public int longestPalindromeSubseq(String s1){
        String s2=new StringBuffer(s1).reverse().toString();
    int n=s1.length();
    int m=s2.length();
         int [][] dp=new int[m+1][n+1];
       
    for(int i=1;i<n+1;i++)
        for(int j=1;j<m+1;j++){
            if(s1.charAt(i-1)==s2.charAt(j-1))
                dp[i][j]=1+dp[i-1][j-1];
            else{
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
}