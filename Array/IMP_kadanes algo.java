https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1#

///  Kadane's Algorithm

class Solution{

    int maxSubarraySum(int nums[], int n){
        
        int max_so_far=nums[0];
        int maxx=nums[0];
        for(int i=1;i<n;i++){
            max_so_far+=nums[i];
            max_so_far=Math.max(nums[i],max_so_far);
            maxx=Math.max(max_so_far,maxx);
        }
    return maxx;
        
    }
    
}

