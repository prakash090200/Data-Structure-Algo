https://leetcode.com/problems/unique-paths/submissions/

//62. Unique Paths


class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n ; j++){
                if(i == 0 || j == 0)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        return dp[m-1][n-1];
    }
}


**************************************************************
class Solution {
    public int uniquePaths(int m, int n) {
        Integer[][] mem = new Integer[m+1][n+1];
         int count = countWays(m,n,mem);
        return count;
    }
    
    private static int countWays(int m, int n,Integer[][]mem) {
        int count=0;
        if(m==1||n==1)
        {
            return 1;
        }
        if(mem[m][n]!=null)
        {
            return mem[m][n];
        }
        count+=countWays(m,n-1,mem);
        count+=countWays(m-1,n,mem);
        mem[m][n]=count;
        return mem[m][n];

    }
}