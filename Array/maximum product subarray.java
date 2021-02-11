
https://leetcode.com/problems/maximum-product-subarray/

class Solution {
     public int maxProduct(int[] nums) {

        if (nums == null || nums.length == 0) return 0;

        int [] maxSubarray = new int[nums.length];
        int [] minSubarray = new int[nums.length];

        int max = Integer.MIN_VALUE;

        maxSubarray[0] = nums[0];
        minSubarray[0] = nums[0];
        for (int i = 1; i < nums.length; i++ ){

            if (nums[i] * minSubarray[i-1] < nums[i]) {
                minSubarray[i] = nums[i] * minSubarray[i-1];
            } else {
                minSubarray[i] = nums[i];
            }

            if (nums[i] * maxSubarray[i-1] < minSubarray[i]) {
                minSubarray[i] = nums[i] * maxSubarray[i-1];
            }

            if ( nums[i] * maxSubarray[i-1] > nums[i]) {
                maxSubarray[i] = nums[i] * maxSubarray[i-1];
            } else {
                maxSubarray[i] = nums[i];
            }

            if (nums[i] * minSubarray[i-1] > maxSubarray[i]) {
                maxSubarray[i] = nums[i] * minSubarray[i-1];
            }

        }

        for (int i = 0; i < nums.length; i++){
            if (maxSubarray[i] > max) {
                max = maxSubarray[i];
            }

            if (minSubarray[i] > max) {
                max = minSubarray[i];
            }
        }
        return max;
    }

}