https://leetcode.com/problems/path-sum/

//112. Path Sum


class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        
        if(root.left == null && root.right == null  && targetSum==root.val)
            return true;
 return hasPathSum(root.left, targetSum - root.val)   ||
        hasPathSum(root.right, targetSum - root.val);
    }    
}