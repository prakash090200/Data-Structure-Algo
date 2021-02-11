///// https://leetcode.com/problems/jump-game-iii/submissions/

class Solution {
    public boolean canReach(int[] arr, int start) {
        int n=arr.length;
       if(start<0 || start>=n || arr[start]<0) 
           return false;
         if(arr[start]==0)
             return true;
          
            arr[start]*=-1;   ////// very IP
          
            int right=start-arr[start];
            int left=start+arr[start];
            
                return  canReach(arr,left) ||canReach(arr,right); 

       
    }
   
}