https://leetcode.com/problems/jump-game-ii/


/// Minimum no of jump to reach end of array
// jump game 2

class Solution {
    public int jump(int[] nums) {
        int count = 0, end = 0, maxFar = nums[0];
        for ( int i = 0; i< nums.length-1; i++ ) {
            maxFar = Math.max(i + nums[i], maxFar);
            if ( i == end ) {
                ++count;
                end = maxFar;
            }
        }
        return count;
    }
}
