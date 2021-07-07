https://practice.geeksforgeeks.org/problems/minimum-swaps-required-to-bring-all-elements-less-than-or-equal-to-k-together4847/1#

/// Minimum swaps and K together

//sliding window approach
//catogory 1

class Complete{
 public static int minSwap (int arr[], int n, int k) {
        int good=0;
        int bad=0;
        
        for(int i=0;i<n;i++)   
        if(arr[i]<=k)
        good++;           // window size
      
        for(int i=0;i<good;i++)
        if(arr[i]>k)
        bad++;

        int ans=bad;
        int j=good;
        
       for(int i=0;i<(n-good);i++){
           if(arr[i]>k)
           bad--;
           if(arr[j++]>k)
           bad++;
           ans=Math.min(ans,bad);
           
       }  
     return ans;
    }  
}