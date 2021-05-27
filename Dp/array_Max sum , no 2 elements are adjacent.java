https://practice.geeksforgeeks.org/problems/stickler-theif-1587115621/1

// Maximum sum such that no two elements are adjacent


class Solution
{
    
    public int FindMaxSum(int arr[], int n)
    {
      int incl = arr[0];
        int excl = 0;
        int excl_new;
        int i;
 
        for (i = 1; i < n; i++)
        {
            
            excl_new = (incl > excl) ? incl : excl;
 
            
            incl = excl + arr[i];
            excl = excl_new;
        }
 
    
        return ((incl > excl) ? incl : excl);
    }
}