https://leetcode.com/problems/search-a-2d-matrix-ii/submissions/

https://www.youtube.com/watch?v=VS0BcOiKaGI&ab_channel=AdityaVerma

//Search a 2D Matrix II

BEST**

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

*********************************************
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i = 0; i < r; ++i)
            {
                  
             if(Arrays.binarySearch(matrix[i],target)>=0)
                 return true;
        }
        return false;
    }
}
************************************************
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0 ; i < m ; i++) {
            if(matrix[i][0] > target) return false;
            int low = 0;
            int high  = n - 1;
            
            while(low <= high ) {
                int mid = (high  + low ) / 2;
                if(matrix[i][mid] == target) return true;
                if(matrix[i][mid] > target)  high  = mid - 1;
                if(matrix[i][mid] < target)  low = mid + 1;
            }
        }
        return false;
    }
}