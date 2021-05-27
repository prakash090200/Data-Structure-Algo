https://practice.geeksforgeeks.org/problems/gold-mine-problem2608/1

//Gold Mine Problem 

class Solution{
    static int maxGold(int m, int n, int gold[][])
    {
      int goldTable[][] = new int[m][n];
         
        for(int[] rows:goldTable)
            Arrays.fill(rows, 0);
     
        for (int col = n-1; col >= 0; col--)
        {
            for (int row = 0; row < m; row++)
            {
                 
                
                int right = (col == n-1) ? 0
                        : goldTable[row][col+1];
     
              
                int right_up = (row == 0 ||
                               col == n-1) ? 0 :
                        goldTable[row-1][col+1];
     
             
                int right_down = (row == m-1
                            || col == n-1) ? 0 :
                          goldTable[row+1][col+1];
     
             
                goldTable[row][col] = gold[row][col]
                 + Math.max(right, Math.max(right_up,
                                       right_down));
                                                         
            }
        }
     
        
        int res = goldTable[0][0];
         
        for (int i = 1; i < m; i++)
            res = Math.max(res, goldTable[i][0]);
             
        return res;
    }
}