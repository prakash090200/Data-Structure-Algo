https://leetcode.com/problems/spiral-matrix-iii/submissions/

// Spiral Matrix III

class Solution {
    /*  Time Complexity: the worse condition is when the starting point
        is in the south-east corner of the grid, which requires the function
        to traveal through (2max(R,C)) ^ 2 points thus the TM would be 
        O((max(R, C)^2)). Space complexity would be O(R*C)*/
    
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
      
        int[] dirRow = new int[]{0, 1, 0, -1};
        int[] dirCol = new int[]{1, 0, -1, 0};
        
        int[][] result = new int[R*C][2];
        result[0] = new int[]{r0, c0};

        // use count to keep track of number of nodes that have been found
        // use k to keep track of direction and steps

        int count = 1, k = 1;
        
        while (count != R*C) {
           
            int dir = (k - 1) % 4;
      
            int step = k % 2 == 0 ? k / 2 : (k + 1) / 2;
            
           
            for (int i = 0; i < step; i++) {
                r0 += dirRow[dir];
                c0 += dirCol[dir];

                // check for the bound, if within the bound
                // then add them into the result array

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