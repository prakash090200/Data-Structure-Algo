https://leetcode.com/problems/maximum-binary-tree/submissions/

//Maximum Binary Tree


class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return getMaxTree(nums, 0, nums.length-1);
    }
    
    private TreeNode getMaxTree(int[] nums, int left, int right){
        if(left > right){
            return null;
        }
        
        int maxIndex = getMaxIndex(nums, left, right);
        TreeNode root = new TreeNode(nums[maxIndex]);
        root.left = getMaxTree(nums, left, maxIndex-1);
        root.right = getMaxTree(nums, maxIndex+1, right);
        
        return root;
    }
    
    private int getMaxIndex(int[] nums, int start, int end){
        int max = nums[start], maxIndex = start;
        
        for(int i = start; i <= end; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
        }
        
        return maxIndex;
    }
}