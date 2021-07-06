https://www.geeksforgeeks.org/counting-inversions/


//// count inversion in an array

time comp: o(n2)
space- o(1)

class Test {
   
    static int getInvCount(int [] arr,int n)
    {
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j])
                    inv_count++;
 
        return inv_count;
    }
 
*****************************************************
time complexity - O(nlogn)
space- o(n)

class Solution
{
 
    static long inversionCount(long arr[], long n)
    {
        long temp[] = new long[(int)n]; 
        return _mergeSort(arr, temp, 0, n - 1); 
    }
    
    static long _mergeSort(long arr[], long temp[], long left, long right)
    {
        long mid, count = 0; 
        if (left<right) { 
       
            mid = (right + left) / 2; 
  
          
        count += _mergeSort(arr, temp, left, mid); 
        count += _mergeSort(arr, temp, mid + 1, right); 
  
        
        count += merge(arr, temp, left, mid+1, right); 
        } 
        return count; 
    }
  
    static long merge(long arr[], long temp[], long left,
    long mid, long right) 
    { 
        long i, j, k; 
        long inv_count = 0; 
  
        i = left; 
        j = mid; 
        k = left;
        while ((i <= mid - 1) && (j <= right)) { 
            if (arr[(int)i] <= arr[(int)j]) { 
                temp[(int)k++] = arr[(int)i++]; 
            } 
            else { 
                temp[(int)k++] = arr[(int)j++]; 
  
            
                inv_count = inv_count + (mid - i); 
            } 
        } 
  
 
        while (i <= mid - 1) 
            temp[(int)k++] = arr[(int)i++]; 
  
    
        while (j <= right) 
            temp[(int)k++] = arr[(int)j++]; 
  
      
        for (i = left; i <= right; i++) 
            arr[(int)i] = temp[(int)i]; 
  
        return inv_count; 
    }
}
s