https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

//  Flatten Binary Tree to Linked List

BEST**

class Solution {
    private TreeNode tail = new TreeNode(-1);
    
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        
        tail.right = root;
        tail = root;
		
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        root.right = null;
		
        flatten(left);
        flatten(right);
    }
}

*****************************************************
class Solution {    
    public void flatten(TreeNode root){
        if(root ==null || (root.left == null && root.right == null)){
            return;
        }
        flatten(root.left);
        flatten(root.right);
        
        if(root.left != null) {
            TreeNode nextRight = getNextRight(root.left);
            nextRight.right = root.right;
            root.right = root.left;
            root.left = null;
        }        
    }
    
    public TreeNode getNextRight(TreeNode root) {
        TreeNode temp = root;
        while(temp.right != null) {
            temp = temp.right;
        }
        return temp;
    }
}