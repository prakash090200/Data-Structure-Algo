https://leetcode.com/problems/longest-continuous-increasing-subsequence/submissions/

//Longest Continuous Increasing Subsequence

//Time: O(N)
//Space: O(1)

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxCount = 1;
        int count = 1;
        for (int i=1; i<nums.length; i++) {
            if (nums[i]>nums[i-1]) {
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else {
                count = 1;
            }
        }
        return maxCount;
    }
}
