 https://www.geeksforgeeks.org/count-subsequences-product-less-k/


//Count all subsequences having product less than K


public static int productSubSeqCount(ArrayList<Integer> arr,int k)
    {
        int n = arr.size();
        int dp[][]=new int[k + 1][n + 1];
          
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
          
                
                dp[i][j] = dp[i][j - 1];
          
                
                if (arr.get(j-1) <= i && arr.get(j-1) > 0)
      
                    
                    dp[i][j] += dp[i/arr.get(j - 1)][j - 1] + 1;
            }
        }
        return dp[k][n];
    }