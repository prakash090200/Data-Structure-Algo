https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

///236. Lowest Common Ancestor of a Binary Tree


class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
      if(root==null) return null;
      if(root.val==p.val || root.val==q.val) return root;
        
       TreeNode l= lowestCommonAncestor(root.left, p,q);
       TreeNode r=lowestCommonAncestor(root.right,p,q);
        if(l!=null && r!=null) return root;
        return (l!=null)?l:r;
    }
}