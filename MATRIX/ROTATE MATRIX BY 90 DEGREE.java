https://leetcode.com/problems/rotate-image/

https://leetcode.com/problems/rotate-image/discuss/1175774/JAVA-oror-Easy-oror-Transpose-oror-Readable-Solution

///// Rotate matrix by 90 degrees


class Solution {
  public void rotate(int[][] matrix) {
        
********* //1.Transpose

        for(int r=0;r<matrix.length;r++){
            for(int c=0;c<r;c++){
               int temp=matrix[r][c];
               matrix[r][c]=matrix[c][r];
               matrix[c][r]=temp;
            }
        }
        
       
        int fc=0;                      // fc: first column
        int lc=matrix[0].length-1;     //lc : last column
        
        while(fc<lc){
           //swap first column with last column
            for(int r=0;r<matrix.length;r++){
                 int temp=matrix[r][fc];
                 matrix[r][fc]=matrix[r][lc];
                 matrix[r][lc]=temp;
            }
            
            fc++;
            lc--;
        }
    }
}