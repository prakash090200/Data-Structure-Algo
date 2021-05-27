https://leetcode.com/problems/regular-expression-matching/submissions/


//Regular Expression Matching


class Solution {
    public boolean isMatch(String s, String p) {
	int m = p.length(), n = s.length();
	boolean[][] dp = new boolean[m + 1][n + 1];
	dp[0][0] = true;
	for (int i = 1; i <= m; i++) {
		char c = p.charAt(i - 1);            
		if (i == m || p.charAt(i) != '*') {  
			for (int j = 1; j <= n; j++) {
				if (c == '.' || c == s.charAt(j - 1)) { 
					dp[i][j] = dp[i - 1][j - 1];
				}
			}
		} else { 
			for (int j = 0; j <= n; j++) {   
			
				dp[i + 1][j] = dp[i - 1][j]; 
				if (j > 0 && (c == '.' || c == s.charAt(j - 1))) {
					dp[i + 1][j] |= dp[i - 1][j - 1]; 
					dp[i + 1][j] |= dp[i + 1][j - 1];  
				}
			}
			i++; 
		}
	}
	return dp[m][n];        
}
}