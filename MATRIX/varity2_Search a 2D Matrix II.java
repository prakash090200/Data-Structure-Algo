https://leetcode.com/problems/search-a-2d-matrix-ii/submissions/

https://www.youtube.com/watch?v=VS0BcOiKaGI&ab_channel=AdityaVerma

//Search a 2D Matrix II



class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        
        int rows=mat.length;
        int col=mat[0].length;
       int i=0;
        int j=col-1;
        while (i<rows && j>=0)
        {
            
            if (mat[i][j] == x)
              return true;
            
            if (mat[i][j] > x)
                j--;
            else 
                i++;
        }
        return false;
        
    }
}
