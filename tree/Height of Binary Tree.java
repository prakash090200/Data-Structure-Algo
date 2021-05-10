https://leetcode.com/problems/maximum-depth-of-binary-tree/submissions/


///Height of Binary Tree 

class Solution {
    public int maxDepth(TreeNode root) {
        TreeNode temp=root;

        if(root==null)
        return 0;

        int lheight=maxDepth(temp.left);
        int rheight=maxDepth(temp.right);

        if(lheight>rheight)
        return lheight+1;
        else
        return rheight+1;
    }
}