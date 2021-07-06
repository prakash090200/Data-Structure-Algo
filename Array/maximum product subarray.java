
https://leetcode.com/problems/maximum-product-subarray/

//Maximum Product Subarray

class Solution {
     public int maxProduct(int[] nums) {

        if (nums.length == 0) return 0;

        int [] maxs = new int[nums.length];
        int [] mins = new int[nums.length];

        int max = Integer.MIN_VALUE;

        maxs[0] = nums[0];
        mins[0] = nums[0];
        for (int i = 1; i < nums.length; i++ ){

            if (nums[i] * mins[i-1] < nums[i]) {
                mins[i] = nums[i] * mins[i-1];
            } else {
                mins[i] = nums[i];
            }

            if (nums[i] * maxs[i-1] < mins[i]) {
                mins[i] = nums[i] * maxs[i-1];
            }

            if ( nums[i] * maxs[i-1] > nums[i]) {
                maxs[i] = nums[i] * maxs[i-1];
            } else {
                maxs[i] = nums[i];
            }

            if (nums[i] * mins[i-1] > maxs[i]) {
                maxs[i] = nums[i] * mins[i-1];
            }

        }

        for (int i = 0; i < nums.length; i++){
            if (maxs[i] > max) 
                max = maxs[i];
        }
        return max;
    }

}
}