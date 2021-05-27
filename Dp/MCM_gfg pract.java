https://practice.geeksforgeeks.org/problems/matrix-chain-multiplication0303/1#

//Matrix Chain Multiplication


class Solution{
    static int matrixMultiplication(int n, int p[])
    {
        int m[][] = new int[n][n];
        
        for( int d = 2; d<=n; d++){
            for( int i =1; i <= (n - d); i++){
                int j = i+d-1;
                m[i][j] = Integer.MAX_VALUE;
                if (j == n) 
                    continue; 
                m[i][j] = Integer.MAX_VALUE; 
                for (int k = i; k <= j - 1; k++)  
                { 
                    // q = cost/scalar multiplications 
                    int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j]; 
                    
                    if (q < m[i][j]) 
                        m[i][j] = q; 
                } 
            }
        }
        return m[1][n-1];
    }
}