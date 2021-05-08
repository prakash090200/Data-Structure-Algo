https://leetcode.com/problems/spiral-matrix/


// 54. Spiral Matrix

class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> result = new ArrayList<>();
        int m = mat.length, n = mat[0].length, totalItems = m * n;
        int i = 0, j = 0, seen = -1000;
        while (result.size() < totalItems) {
            while (j < n && mat[i][j] != seen) { // right
                result.add(mat[i][j]);
                mat[i][j++] = seen;
            }
            j--; i++;
            while (i < m && mat[i][j] != seen) { // down
                result.add(mat[i][j]);
                mat[i++][j] = seen;
            }
            i--; j--;
            while (j >= 0 && mat[i][j] != seen) { // left
                result.add(mat[i][j]);
                mat[i][j--] = seen;
            }
            j++; i--;
            while (i >= 0 && mat[i][j] != seen) { // up
                result.add(mat[i][j]);
                mat[i--][j] = seen;
            }
            i++; j++;
        }

        return result;
    }
}