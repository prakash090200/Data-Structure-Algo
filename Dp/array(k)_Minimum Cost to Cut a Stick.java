
https://leetcode.com/problems/minimum-cost-to-cut-a-stick/submissions/

//Minimum Cost to Cut a Stick


class Solution {
    public int minCost(int n, int[] cuts) {
        Arrays.sort(cuts);
        int[] A = new int[cuts.length + 2];
        A[0] = 0;
        A[cuts.length + 1] = n;
        int start = 0;
        while (start < cuts.length) {
            A[start+1] = cuts[start++];
        }
        int len = A.length;
        int[][] dp = new int[len][len];
        for (int i = 0; i < len - 1; i++) {
            dp[i][i + 1] = 0;
        }
        for (int size = 2; size < len; size++) {
            for (int i = 0; i + size < len; i++) {
                int j = i + size;
                int min = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; k++) {
                 min = Math.min(min, dp[i][k] + dp[k][j] + A[j] - A[i]);
                }
                dp[i][j] = min;
            }
        }
        return dp[0][len - 1];
    }
}