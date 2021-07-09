https://leetcode.com/problems/search-a-2d-matrix/submissions/

//Search a 2D Matrix


BEST**

class Solution {
   public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1; 
        
        while(i <matrix.length && j>=0){
            if(matrix[i][j]== target) return true;
            else if(matrix[i][j] > target) j--;
            else i++;
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