https://www.geeksforgeeks.org/find-common-element-rows-row-wise-sorted-matrix/

///// Find a common element in all rows of a given row-wise sorted matrix


class GFG
{
static int M = 4;
static int N = 5;

static int findCommon(int mat[][])
{

HashMap<Integer,Integer> cnt = new HashMap<>();
 
    int i, j;
 
    for (i = 0; i < M; i++)
    {
 
        
        if(cnt.containsKey(mat[i][0]))
        {
            cnt.put(mat[i][0],
            cnt.get(mat[i][0]) + 1);
        }
        else
        {
            cnt.put(mat[i][0], 1);
        }
 
       
        for (j = 1; j < N; j++)
        {
 

            if (mat[i][j] != mat[i][j - 1])
                if(cnt.containsKey(mat[i][j]))
                {
                    cnt.put(mat[i][j],
                    cnt.get(mat[i][j]) + 1);
                }
                else
                {
                    cnt.put(mat[i][j], 1);
                }
        }
    }
 

    for (Map.Entry<Integer,
                   Integer> ele : cnt.entrySet())
    {
        if (ele.getValue() == M)
            return ele.getKey();
    }
 

    return -1;
}
 



public static void main(String[] args)
{
    int mat[][] = {{ 1, 2, 3, 4, 5 },
                   { 2, 4, 5, 8, 10 },
                   { 3, 5, 7, 9, 11 },
                   { 1, 3, 5, 7, 9 }};
    int result = findCommon(mat);
    if (result == -1)
        System.out.println("No common element");
    else
        System.out.println("Common element is " + result);
    }
}