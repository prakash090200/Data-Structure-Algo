https://leetcode.com/problems/longest-increasing-subsequence/
https://leetcode.com/problems/longest-increasing-subsequence/discuss/558027/Java-DP-Solution-%2B-BinarySearch-Solution-with-explanation

// Longest Increasing Subsequence

pure dp approach **

Time Complexity: O(n^2)
Space Complexity: O(n)


class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if(len == 0){
            return 0;
        }
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        int max = 1;
        for(int i = 0; i < len; i++){
            //find all previous numbers that are smaller than nums[i]
            for(int j = 0; j < i; j++){
                if(nums[j] >= nums[i]){
                    continue;
                }
                dp[i] = Math.max(dp[i], dp[j]+1);
                max = Math.max(dp[i], max);
            }
        }
        return max;
    }
}
*******************************************************************

//DP+ BINARY SEARCH APPROACH 

Time Complexity: O(n log n)
Space Complexity: O(n)
class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = 0;
        int[] dp = new int[nums.length];
        
        for(int num: nums){
            int index = Arrays.binarySearch(dp, 0, len, num);
            
            if(index < 0){
                index = -(index + 1);
            }
            dp[index] = num;
            if(index == len){
                ++len;
            }
        }
        return len;
    }
}