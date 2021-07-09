https://www.geeksforgeeks.org/common-elements-in-all-rows-of-a-given-matrix/


//Common elements in all rows of a given matrix

Approach 1:

o(m*n*log(n))  sorting the 2d array 
 + o(m*n) apply hashmap on sorted array and get common element

overall time: o(m*n*log(n)) 

*********************************************************************

Approach 2:
O(m*n)
--> single traversal of array
 
static void printCommonElements(int mat[][])
{
 
    Map<Integer,Integer> mp = new HashMap<>();
     
    // initalize 1st row elements with value 1
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
                    System.out.print(mat[i][j] + " ");
            }
        }
    }
}
 

public static void main(String[] args)
{
    int mat[][] =
    {
        {1, 2, 1, 4, 8},
        {3, 7, 8, 5, 1},
        {8, 7, 7, 3, 1},
        {8, 1, 2, 7, 9},
    };
 
    printCommonElements(mat);
}
