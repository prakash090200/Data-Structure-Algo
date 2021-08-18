https://leetcode.com/problems/edit-distance/

//Edit Distance

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
          minDist[i][j] = minDist[i-1][j-1];
        }
      }
    }
    return minDist[n][m];
  }
}
