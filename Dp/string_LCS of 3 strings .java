https://practice.geeksforgeeks.org/problems/lcs-of-three-strings0028/1


// LCS of three strings 

class Solution 
{ 
    int LCSof3(String X, String Y, String Z, int n1, int n2, int n3) 
    { 
         int[][][] L = new int[n1+1][n2+1][n3+1];
      
       
        for (int i=0; i<=n1; i++)
        {
            for (int j=0; j<=n2; j++)
            {
                for (int k=0; k<=n3; k++)
                {
                    if (i == 0 || j == 0||k==0)
                        L[i][j][k] = 0;
      
                    else if (X.charAt(i - 1) == Y.charAt(j - 1)
                                && X.charAt(i - 1)==Z.charAt(k - 1))
                        L[i][j][k] = L[i-1][j-1][k-1] + 1;
      
                    else
                        L[i][j][k] = Math.max(Math.max(L[i-1][j][k],L[i][j-1][k]),L[i][j][k-1]);
                }
            }
        }
      
        
        return L[n1][n2][n3];
    }
} 