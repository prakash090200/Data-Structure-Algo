https://www.geeksforgeeks.org/matrix-chain-multiplication-dp-8/


//MCM with memoization


class GFG
{
 
  static int[][] dp = new int[100][100];
  static int matrixChainMemoised(int[] p, int i, int j)
  {
    if (i == j) 
    {
      return 0;
    }
    if (dp[i][j] != -1) 
    {
      return dp[i][j];
    }
    dp[i][j] = Integer.MAX_VALUE;
    for (int k = i; k < j; k++) 
    {
      dp[i][j] = Math.min(
        dp[i][j], matrixChainMemoised(p, i, k)
        + matrixChainMemoised(p, k + 1, j)
        + p[i - 1] * p[k] * p[j]);
    }
    return dp[i][j];
  }
 

  public static void main (String[] args)
  {
 
    int arr[] = { 1, 2, 3, 4 };
    int n= arr.length;
 
    for (int[] row : dp)
      Arrays.fill(row, -1);
 
    System.out.println("Minimum number of multiplications is " + matrixChainMemoised(arr,1,n-1);
  }
}

**********************************************************************


static int MatrixChainOrder(int p[], int n)
{
 
    int [][]dp=new int[n][n];

    for (int i=1; i<n; i++)
        dp[i][i] = 0;

    for (int L=1; L<n-1; L++)
    for (int i=1; i<n-L; i++)    
        dp[i][i+L] = Math.min(dp[i+1][i+L] + p[i-1]*p[i]*p[i+L],
                    dp[i][i+L-1] + p[i-1]*p[i+L-1]*p[i+L]);    
     
    return dp[1][n-1];
}
