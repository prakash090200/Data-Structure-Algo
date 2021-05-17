https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

///Lowest Common Ancestor of a Binary Search Tree

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while ( root != null ) {
            
            if ( p.val == root.val || q.val == root.val ) {
                return root;
            }
            
            if ( p.val < root.val && q.val < root.val ) {
                root = root.left;
            }
            
            else if ( p.val > root.val && q.val > root.val ) {
                root = root.right;
            }
          
            else if ( (p.val < root.val && q.val > root.val ) ||
                    (p.val > root.val && q.val < root.val ) ) {
                return root;
            }
        }
        return root;
    }
}

***************************************************


class Solution {
    TreeNode l,r;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
      if(root.val==p.val || root.val==q.val) return root;
       
       if(p.val<root.val || q.val<root.val)
       l= lowestCommonAncestor(root.left, p,q);
        else
        r=lowestCommonAncestor(root.right,p,q);
        if(l!=null && r!=null) return root;
        return (l!=null)?l:r;
    }
    
}



