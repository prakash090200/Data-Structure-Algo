https://leetcode.com/problems/is-subsequence/

//392. Is Subsequence

class Solution {
    public boolean isSubsequence(String text1, String text2) {
         int m=text1.length();
        int n=text2.length();
        int j = 0;

       
        for (int i = 0; i < n && j < m; i++)
            if (text1.charAt(j) == text2.charAt(i))
                j++;

      
        return (j == m);
    }
}
  
********************************************************************
class Solution {
    public boolean isSubsequence(String text1, String text2) {
        int s1=text1.length();
        int s2=text2.length();
        
        int dp[][]=new int[s1+1][s2+1];
        for(int i=1;i<s1+1;i++)
        for(int j=1;j<s2+1;j++){
            if(text1.charAt(i-1)==text2.charAt(j-1))
                dp[i][j]=1+dp[i-1][j-1];
            else 
                dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
        }
        return dp[s1][s2]==s1;
    }
}