https://www.geeksforgeeks.org/count-pairs-array-whose-sum-less-x/

//Count pairs in a sorted array whose sum is less than x
Difficulty Level : Easy

static int findPairs(int arr[], int n, int x)
    {
         
        int l = 0, r = n - 1;
        int result = 0;
     
        while (l < r)
        {
             
            
            if (arr[l] + arr[r] < x)
            {
                result += (r - l);
                l++;
            }
     
            
            else
                r--;
        }
     
        return result;
    }