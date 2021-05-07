https://practice.geeksforgeeks.org/problems/count-occurences-of-a-given-word-in-a-2-d-array/1/#

//Count occurences of a given word in a 2-d array

class Solution
{
    public int findOccurrence(char mat[][], String target)
    {
         int found = 0;
         String str[]=new String[mat.length];
         for(int i=0;i<mat.length;i++){
              str[i]=new String(mat[i]);
         }
    int i,j;
 
    for(i = 0; i < mat.length; ++i)
    {
        for(j = 0; j < mat[0].length; ++j)
        {
            found += internalSearch(target, i,j, str,str.length - 1,mat[0].length - 1, 0);
        }
    }
    return found;
    }





static int internalSearch(String needle, int row,int col, String hay[], int row_max, int col_max,int xx)
{
    int found = 0;
     
    if (row >= 0 && row <= row_max && col >= 0 &&
        col <= col_max && xx < needle.length() &&
        needle.charAt(xx) == hay[row].charAt(col))
    {
        char match = needle.charAt(xx);
        xx += 1;
 
        hay[row] = hay[row].substring(0, col) + "0" +
                   hay[row].substring(col + 1);
 
        if (xx == needle.length())
        {
            found = 1;
        }
        else
        {
             
           
            found += internalSearch(needle, row,
                                    col + 1, hay,
                                    row_max, col_max,xx);
            found += internalSearch(needle, row, col - 1,
                                    hay, row_max, col_max,xx);
            found += internalSearch(needle, row + 1, col,
                                    hay, row_max, col_max,xx);
            found += internalSearch(needle, row - 1, col,
                                    hay, row_max, col_max,xx);
        }
         
        hay[row] = hay[row].substring(0, col) +
           match + hay[row].substring(col + 1);
    }
    return found;
}
}
 
