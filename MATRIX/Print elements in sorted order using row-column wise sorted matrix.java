https://www.geeksforgeeks.org/print-elements-sorted-order-row-column-wise-sorted-matrix/


///Print elements in sorted order using row-column wise sorted matrix


class GFG
{
    static final int INF = Integer.MAX_VALUE;
    static final int N = 4;
 

    static void youngify(int mat[][], int i, int j)
    {
        
        int downVal = (i + 1 < N) ?
                    mat[i + 1][j] : INF;
        int rightVal = (j + 1 < N) ?
                     mat[i][j + 1] : INF;
 
        if (downVal == INF && rightVal == INF)
        {
            return;
        }
 
      
        if (downVal < rightVal)
        {
            mat[i][j] = downVal;
            mat[i + 1][j] = INF;
            youngify(mat, i + 1, j);
        }
        else
        {
            mat[i][j] = rightVal;
            mat[i][j + 1] = INF;
            youngify(mat, i, j + 1);
        }
    }
 

    static int extractMin(int mat[][])
    {
        int ret = mat[0][0];
        mat[0][0] = INF;
        youngify(mat, 0, 0);
        return ret;
    }
 
  
    static void printSorted(int mat[][])
    {
        System.out.println("Elements of matrix in sorted order n");
        for (int i = 0; i < N * N; i++)
        {
            System.out.print(extractMin(mat) + " ");
        }
    }
 

    public static void main(String args[])
    {
        int mat[][] = {{10, 20, 30, 40},
                       {15, 25, 35, 45},
                       {27, 29, 37, 48},
                       {32, 33, 39, 50}};
        printSorted(mat);
    }
}