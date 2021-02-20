https://leetcode.com/problems/trapping-rain-water/submissions/

https://www.geeksforgeeks.org/trapping-rain-water/

time:O(N)
SPACE:O(1)


class Solution {
    public int trap(int[] arr) {
        int low=0;
        int high=arr.length-1;
        int left=0;
        int right=0;
        int res=0;
        while(low<high){
            if(arr[low]<arr[high]){
                if(arr[low]>left)
                    left=arr[low];
                else
                    res+=left-arr[low];
        
                low++;
            }
            else{
                if(arr[high]>right)
                    right=arr[high];
                else
                    res+=right-arr[high];
                high--;
            }
        }
        return res;
    }
}