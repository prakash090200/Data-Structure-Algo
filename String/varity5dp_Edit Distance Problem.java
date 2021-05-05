https://leetcode.com/problems/edit-distance/

// Edit Distance

import static java.lang.Math.min;

class Solution {
    public int minDistance(String s1, String s2) {
        int dp[][] = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0) dp[i][j] = j;
                else if (j == 0) dp[i][j] = i;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1];
                else dp[i][j] = 1 + min(dp[i - 1][j - 1], min(dp[i][j - 1], dp[i - 1][j]));
            }
        }
        return dp[s1.length()][s2.length()];
    }
}

****************************************************************

class Solution {
  public int minDistance(String word1, String word2) {
    int n = word1.length();
    int m = word2.length();
    int[][] minDist = new int[n+1][m+1];
    for (int i=1; i<=n; i++) {
      minDist[i][0] = i;
    }
    for (int j=1; j<=m; j++) {
      minDist[0][j] = j;
    }
    for (int i=1; i<=n; i++) {
      for (int j=1; j<=m; j++) {
        if (word1.charAt(i-1) != word2.charAt(j-1)) {
          minDist[i][j] = Math.min(
            Math.min(minDist[i-1][j], minDist[i][j-1]),
            minDist[i-1][j-1]) + 1;
        } else {
          minDist[i][j] = Math.min(
            Math.min(minDist[i-1][j]+1, minDist[i][j-1])+1,
            minDist[i-1][j-1]);
        }
      }
    }
    return minDist[n][m];
  }
}
