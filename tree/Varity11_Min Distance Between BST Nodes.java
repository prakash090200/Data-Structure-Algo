https://leetcode.com/problems/minimum-distance-between-bst-nodes/
https://leetcode.com/problems/minimum-absolute-difference-in-bst/

// 783. Minimum Distance Between BST Nodes
//530. Minimum Absolute Difference in BST

class Solution {
    int ans = Integer.MAX_VALUE; 
    Integer pre = null; 
	
    public int minDiffInBST(TreeNode root) {
        if (root == null) return 0;
        inorder(root);
        return ans;        
    }
    
    private void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
		
        if (pre == null) { 
            pre = root.val;
        }
        else { 
            int curr = root.val;
            int diff = Math.abs(curr - pre);
            ans = Math.min(ans, diff);
            pre = curr;
        }
		
        inorder(root.right);
    }
}