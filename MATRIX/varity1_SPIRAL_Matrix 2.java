https://leetcode.com/problems/spiral-matrix-ii/

//Spiral Matrix II


class Solution {
    public int[][] generateMatrix(int n) {
        int mat[][] = new int [n][n];
        
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        
        int c = 0;
        
        while (top <= bottom){
            for (int i = left; i <=right; i++){
                mat[top][i] = ++c;
            }
            top++;
            
            for (int i = top; i <= bottom; i++){
                mat[i][right] = ++c;
            }
            right--;
            
            for (int i = right; i >= left; i--){
                mat[bottom][i] = ++c;
            }
            bottom--;
            
            for (int i = bottom; i >= top; i--){
                mat[i][left] = ++c;
            }
            left++;
        }
        
        return mat;
    }
}