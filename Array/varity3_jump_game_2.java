/// Minimum no of ump to reach end of array

class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int max_reach=nums[0];
        int step=nums[0];
        int jump=1;
        if(n==1)
            return 0;
        
        for(int i=1;i<n;i++){
            if(i==n-1) return jump;
            max_reach=Math.max(max_reach,i+nums[i]);
            step--;
            if(step==0){
                jump++;
                step=max_reach-i;
             }
            if(i>max_reach) return -1;
            
        }
        return jump;
    }
}