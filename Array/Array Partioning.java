https://leetcode.com/problems/array-partition-i/

// Array Partition I

class Solution {
public int arrayPairSum(int[] nums) {

   Arrays.sort(nums);
   int sum=0;
   for(int i=0;i<nums.length;i+=2)  sum=sum+nums[i];
    return sum; 
}
}