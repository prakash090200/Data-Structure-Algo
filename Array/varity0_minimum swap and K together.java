https://practice.geeksforgeeks.org/problems/minimum-swaps-required-to-bring-all-elements-less-than-or-equal-to-k-together4847/1

/// Minimum swaps and K together

//sliding window approach

class Complete{
 public static int minSwap (int arr[], int n, int k) {
        int good=0;
        int bad=0;
        
        for(int i=0;i<n;i++)
        if(arr[i]<=k)
        good++;
        
        for(int i=0;i<good;i++)
        if(arr[i]>k)
        bad++;
        
        int ans=bad;
        int i=0;
        int j=good;
        
        while(j<n){
            if(arr[i]>k)
            bad--;
            if(arr[j]>k)
            bad++;
            ans=Math.min(bad,ans);
            i++;
            j++;
        }
       
       return ans;
    }
    
    
}
