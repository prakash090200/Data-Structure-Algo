https://leetcode.com/problems/longest-common-subsequence/submissions/

/// Longest Common Subsequence

TIME: O(N*M)
SPACE:O(N*M)

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
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
        return dp[s1][s2];
    }
}


*****************************************************************8
TIME: O(N*M)
SPACE:O(N)

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int s1=text1.length();
        int s2=text2.length();
        int bi=0;
        int dp[][]=new int[2][s2+1];
        for(int i=1;i<s1+1;i++){
            bi = i & 1;
        for(int j=1;j<s2+1;j++){
            if(text1.charAt(i-1)==text2.charAt(j-1))
                dp[bi][j]=1+dp[1-bi][j-1];
            else 
                dp[bi][j]=Math.max(dp[bi][j-1],dp[1-bi][j]);
        }
        }
        return dp[bi][s2];
    }
}