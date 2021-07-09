https://leetcode.com/problems/spiral-matrix-iii/submissions/

// Spiral Matrix III

class Solution {
 
    
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
      
        int[] dirRow = new int[]{0, 1, 0, -1};
        int[] dirCol = new int[]{1, 0, -1, 0};
        
        int[][] result = new int[R*C][2];
        result[0] = new int[]{r0, c0};
       
        int count = 1, k = 1;
        
        while (count != R*C) {
            
            int dir = (k - 1) % 4;
            
            int step = k % 2 == 0 ? k / 2 : (k + 1) / 2;
            
            for (int i = 0; i < step; i++) {
                r0 += dirRow[dir];
                c0 += dirCol[dir];
      
                if (r0 < R && c0 < C && r0 >= 0 && c0 >= 0) {
                    result[count] = new int[]{r0, c0};
                    count++;
                }
            }
            k++;
        }
        
        return result;
    }
}