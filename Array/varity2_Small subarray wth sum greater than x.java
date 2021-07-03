https://practice.geeksforgeeks.org/problems/smallest-subarray-with-sum-greater-than-x5651/1

////Smallest subarray with sum greater than x 

//best
class Solution {

    public static int sb(int arr[], int n, int x) {
        
        int sum=0;
        int count=Integer.MAX_VALUE;
        
       int i=0;
	    for(int j=0;j<n;j++){
	        sum+=arr[j];
	        while(sum>x){
	        count=Math.min(count,j-i+1);
	        sum-=arr[i++];
	        }
	        
	    }
      
        return count;
    }
}


***************************************
class Compute {

    public static long sb(long a[], long n, long x) {
        long start=0;
        long sum=0;
        long end=0;
        long count=n;
        
        while(end<n){
             while(sum<=x && end<n){
            sum+=a[(int)end];
                 end++;
             }
            
            while(sum>x && start<n){
              count=Math.min(end-start,count);  
            sum-=a[(int)start];
            start++;
            }
            
        }
        return count;
    }
}

