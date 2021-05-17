
https://leetcode.com/problems/range-sum-of-bst/submissions/

//Range Sum of BST


class Solution {
    public int rangeSumBST(TreeNode node, int low, int high) {
      if(node == null)
            return 0;
 
        
        if(node.val >= low && node.val <= high)
            return node.val + rangeSumBST(node.left, low, high)+
                rangeSumBST(node.right, low, high);
                 
        
        else if(node.val < low)
            return rangeSumBST(node.right, low, high);
         
        
        else
            return rangeSumBST(node.left, low, high);  
    }
}