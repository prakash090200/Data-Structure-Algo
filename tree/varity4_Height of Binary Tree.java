https://leetcode.com/problems/maximum-depth-of-binary-tree/submissions/


///Height of Binary Tree 

class Solution {
    public int maxDepth(TreeNode root) {
        TreeNode temp=root;

        if(root==null)
        return 0;

        int lheight=maxDepth(temp.left);
        int rheight=maxDepth(temp.right);

        return (Math.max(lheight, rheight) + 1);
    }
}