https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1#

https://www.youtube.com/watch?v=29uyA4F9t5I&ab_channel=ShashwatTiwari

//Minimize the Heights II

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
       
       int ans = arr[n-1] - arr[0];
       int smallest = arr[0]+k;
       int largest = arr[n-1]-k;
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
       
       for(int i=0;i<n-1;i++){
           
           
           min = Math.min(smallest,arr[i+1]-k);
           max  = Math.max(largest,arr[i]+k);
           if(min<0)
           continue;
           ans = Math.min(ans, max-min);
       }
       return ans;
    }
}
