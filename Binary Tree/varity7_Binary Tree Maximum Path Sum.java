https://leetcode.com/problems/binary-tree-maximum-path-sum/

// Binary Tree Maximum Path Sum


class Solution {
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        calculateSum(root);
        return maxSum;
    }
    
    private int calculateSum(TreeNode root){        
        if(root == null) return 0;
        int leftSum = Math.max(0, calculateSum(root.left));
        int rightSum = Math.max(0, calculateSum(root.right));
        maxSum = Math.max(maxSum, leftSum + rightSum + root.val);
        return Math.max(leftSum, rightSum) + root.val;
    }
}