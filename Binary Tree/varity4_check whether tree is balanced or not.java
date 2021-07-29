https://leetcode.com/problems/balanced-binary-tree/

Given a binary tree, find if it is height balanced or not. 
A tree is height balanced if difference between heights of left and right subtrees is not more than one for all nodes of tree.


class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;

   
    return (Math.abs(height(root.left)-height(root.right)) <= 1) && 
            isBalanced(root.left) && isBalanced(root.right));

        return false;
    }
    public int height(TreeNode root) {
        if(root == null)
            return 0;
        int left = height(root.left);
        int right = height(root.right);
        return (Math.max(left, right) + 1);
    }
}