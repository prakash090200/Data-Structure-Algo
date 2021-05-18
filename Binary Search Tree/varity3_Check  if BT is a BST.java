
https://practice.geeksforgeeks.org/problems/check-for-bst/1#
https://leetcode.com/problems/validate-binary-search-tree/submissions/

//Check for BST

class Solution {
    TreeNode prev;
    public boolean isValidBST(TreeNode root) {
        if (root == null)
            return true;
        if(!isValidBST(root.left))
            return false;
        if (prev != null && prev.val >= root.val)
            return false;
        prev = root;
        if (!isValidBST(root.right))
            return false;
        return true;    
    }
}

***********************************************************

https://leetcode.com/problems/validate-binary-search-tree/submissions/


class Solution {
    public boolean isValidBST(TreeNode root) {
        return isBSTUtil(root, Long.MIN_VALUE,
                               Long.MAX_VALUE);
    }
 
    
    boolean isBSTUtil(TreeNode node, long min, long max)
    {
        
        if (node == null)
            return true;
 
        
        if (node.val <= min || node.val >= max)
            return false;
 
        
        return (isBSTUtil(node.left, min, node.val) &&
                isBSTUtil(node.right, node.val, max));
    }
}

********************************************************

public class Solution
{
    boolean isBST(Node root)  {
        return isBSTUtil(root, Integer.MIN_VALUE,
                               Integer.MAX_VALUE);
    }
 
    
    boolean isBSTUtil(Node node, int min, int max)
    {
        
        if (node == null)
            return true;
 
        
        if (node.data < min || node.data > max)
            return false;
 
        
        return (isBSTUtil(node.left, min, node.data-1) &&
                isBSTUtil(node.right, node.data+1, max));
    }
}