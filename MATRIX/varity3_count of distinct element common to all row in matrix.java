
https://practice.geeksforgeeks.org/problems/find-distinct-elements2054/1#

////count of all the distinct elements common to all rows of the matrix

class Solution{
    static int distinct(int mat[][], int n)
    {
        Map<Integer,Integer> mp = new HashMap<>();
        int count=0;
     
    // initalize 1st row elements with value 1
    int N=mat[0].length;
    int M=mat.length;
    for (int j = 0; j < N; j++)
        mp.put(mat[0][j],1);
         
    // traverse the matrix
    for (int i = 1; i < M; i++)
    {
        for (int j = 0; j < N; j++)
        {
           
            if (mp.get(mat[i][j]) != null && mp.get(mat[i][j]) == i)
            {
                
                mp.put(mat[i][j], i + 1);
 
                if (i == M - 1)
                count++;
                    
            }
        }
        }
        return count;
    }
}
