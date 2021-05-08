https://leetcode.com/problems/search-a-2d-matrix/submissions/

//Search a 2D Matrix


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

**********************************

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