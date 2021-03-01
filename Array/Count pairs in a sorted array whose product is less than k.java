////// Count pairs in a sorted array whose product is less than k

https://www.geeksforgeeks.org/count-pairs-in-a-sorted-array-whose-product-is-less-than-k/


static int fun(int A[],  
               int n, int k) 
{ 
    int count = 0; 
    int i = 0; 
    int j = n - 1; 

    while (i < j)  
    { 
  
     
        if (A[i] * A[j] < k)  
        { 
            count += (j - i); 
            i++; 
        } 
  
       
        else 
        { 
            j--; 
        } 
    } 

    return count; 
} 