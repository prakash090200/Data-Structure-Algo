https://leetcode.com/problems/wildcard-matching/




class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;
        for(int j = 1; j <= n; j++) dp[0][j]= (p.charAt(j-1)=='*') ? dp[0][j-1] : dp[0][j];
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(p.charAt(j-1) == '*') dp[i][j] = (dp[i-1][j] || dp[i][j-1]);
                else dp[i][j] = (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?') && dp[i-1][j-1];
            }
        }
        return dp[m][n];
    }
}

*******************************************************************************

BEST*****

class Solution {
    public boolean isMatch(String s, String p) {
     
        
        int length1 = s.length();
        int length2 = p.length();
        
        char [] pattern = p.toCharArray();
        
        int index = 0;
        boolean firstOrNot = true;
        for (int i=0; i<length2; i++) {
            if (pattern[i] == '*') {
                if (firstOrNot) {
                    pattern[index++] = pattern[i];
                    firstOrNot = false;
                }
            }
                else {
                    pattern[index++] = pattern[i];
                    firstOrNot = true;
                }
        }
        boolean [][] dp = new boolean[length1+1][index+1];
        if (index > 0  && pattern[0] == '*')
            dp[0][1] = true;
        
        dp[0][0] = true;
        for (int i=1; i<=length1; i++) {
            for (int j=1; j<=index; j++) {
                if (s.charAt(i-1) == pattern[j-1] || pattern[j-1] == '?') {
                    
                    dp[i][j] = dp[i-1][j-1];
                }
                else if (pattern[j-1] == '*') {
                    
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
            }
        }
        return dp[length1][index];
    }
}