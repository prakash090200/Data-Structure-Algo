class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far=nums[0];
        int maxx=nums[0];
        for(int i=1;i<nums.length;i++){
            max_so_far=Math.max(nums[i],max_so_far+nums[i]);
            if(max_so_far>maxx)
                maxx=max_so_far;
        }
    return maxx;
    }
}