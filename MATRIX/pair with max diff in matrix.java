
https://www.geeksforgeeks.org/find-a-specific-pair-in-matrix/

//Find a specific pair in Matrix

time:o(n4)

class GFG
{
    
    static int findMaxValue(int N,int mat[][])
    {
        int maxValue = Integer.MIN_VALUE;
      
        
        for (int a = 0; a < N - 1; a++)
          for (int b = 0; b < N - 1; b++)
             for (int d = a + 1; d < N; d++)
               for (int e = b + 1; e < N; e++)
                  if (maxValue < (mat[d][e] - mat[a][b]))
                      maxValue = mat[d][e] - mat[a][b];
      
        return maxValue;
    }
      
   
    public static void main (String[] args)
    {
        int N = 5;
 
        int mat[][] = {
                      { 1, 2, -1, -4, -20 },
                      { -8, -3, 4, 2, 1 },
                      { 3, 8, 6, 1, 3 },
                      { -4, -1, 1, 7, -6 },
                      { 0, -4, 10, -5, 1 }
                   };
 
        System.out.print("Maximum Value is " +
                         findMaxValue(N,mat));
    }
}

***********************************************

time: o(n2)

static int findMaxValue(int N,int mat[][])
    {
      
        int maxValue = Integer.MIN_VALUE;
      
        
        int maxArr[][] = new int[N][N];
      
       
        maxArr[N-1][N-1] = mat[N-1][N-1];
      
 
        int maxv = mat[N-1][N-1];  // Initialize max
        for (int j = N - 2; j >= 0; j--)
        {
            if (mat[N-1][j] > maxv)
                maxv = mat[N - 1][j];
            maxArr[N-1][j] = maxv;
        }
      

        maxv = mat[N - 1][N - 1];  // Initialize max
        for (int i = N - 2; i >= 0; i--)
        {
            if (mat[i][N - 1] > maxv)
                maxv = mat[i][N - 1];
            maxArr[i][N - 1] = maxv;
        }
      
        
        for (int i = N-2; i >= 0; i--)
        {
            for (int j = N-2; j >= 0; j--)
            {
             
                if (maxArr[i+1][j+1] - mat[i][j] > maxValue)
                    maxValue = maxArr[i + 1][j + 1] - mat[i][j];
      
                
                maxArr[i][j] = Math.max(mat[i][j],
                                   Math.max(maxArr[i][j + 1],
                                       maxArr[i + 1][j]) );
            }
        }
      
        return maxValue;
    }