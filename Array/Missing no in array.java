
// Missing number in array 

class Solution {
    int MissingNumber(int a[], int n) {
       
            int sum=0;
            for(int i=0;i<n-1;i++)
                sum+=a[i];
            
            int diff=(n*(n+1))/2-sum;
            return diff;
        
    }
}