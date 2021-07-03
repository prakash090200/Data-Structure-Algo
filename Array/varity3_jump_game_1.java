https://leetcode.com/problems/jump-game/

// jump game 1

//o(n)
class Solution {
    public boolean canJump(int[] nums) {
        int max_reach=0;
        for(int i=0;i<nums.length;i++){
            if(max_reach<i) return false;
            max_reach=Math.max(max_reach,i+nums[i]);
            
        }
        return true;
    }
}


********************
//  <o(n)

class Solution {
    public boolean canJump(int[] nums) {
        int max_reach=0;
        for(int i=0;i<nums.length;i++){
            if(max_reach<i) return false;
            max_reach=Math.max(max_reach,i+nums[i]);
            if(max_reach>nums.length-1)
                return true;
            
            
        }
        return true;
    }
}