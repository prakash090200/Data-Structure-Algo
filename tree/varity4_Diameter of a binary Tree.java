https://leetcode.com/problems/diameter-of-binary-tree/

The diameter of a binary tree is the length of the longest path between any two nodes in a tree. 
This path may or may not pass through the root.

The length of a path between two nodes is represented by the number of edges between them.

class Solution {
   int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null )return 0;
        height(root);
        return ans;
    }
    
    public int height(TreeNode root){
        
        if(root==null)return 0;
        
        int L=height(root.left);
        int R=height(root.right);

        //ans signfies(no. of nodes farthest apart) or the DIAMETER

        ans=Math.max(ans,L+R);

        //height of the tree is max of LST & RST +1

        return 1+Math.max(L,R);
    }
}