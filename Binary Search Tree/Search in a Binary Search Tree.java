https://leetcode.com/problems/search-in-a-binary-search-tree/submissions/

//700. Search in a Binary Search Tree


class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return root;
        if(root.val==val) return root;
        if(root.val>val)
        return searchBST(root.left,val);
        else
        return searchBST(root.right,val);
        
    }
}