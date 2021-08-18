https://leetcode.com/problems/distinct-subsequences/

//115. Distinct Subsequences


public int numDistinct(String A, String B)
    {
        if(A.length() < B.length())
            return 0;
         int n1=A.length();
         int n2=B.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
		
	 
		 
		
        for(int i = 0; i <= A.length(); i++)
            dp[i][0] = 1;

       
        for(int i = 1; i <= A.length(); i++)
        {
            for(int j = 1; j <= B.length(); j++)
            {
                if(A.charAt(i-1) == B.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];

                else
                    dp[i][j] = dp[i-1][j];
            }
        }

        return dp[n1][n2];
    }