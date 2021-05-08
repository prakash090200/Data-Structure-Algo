https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/submissions/

utube   ---- > https://www.youtube.com/watch?v=dpsp1hP6P-U&t=479s&ab_channel=ArtificialMinds

/// Kth smallest element in a row-cpumn wise sorted matrix

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int r = matrix.length, c = matrix[0].length;
        int low = matrix[0][0], high = matrix[r - 1][c - 1];
        while (low < high) {
            int mid = (high - low) / 2 + low;
            int count = 0; 
            int j = c - 1;
            
            for (int i = 0; i < r; i++) {
               
                while (j >= 0 && matrix[i][j] >mid)
                    j--;
                count += j + 1;
            }
           
            if (count < k)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}