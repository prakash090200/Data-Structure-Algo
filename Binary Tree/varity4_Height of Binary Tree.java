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

*************************************
best****

class Solution {
    int maxlen= Integer.MIN_VALUE;
    int height(Node node) 
    {
        check(node,0);
        return maxlen;
    }
    public void check(Node node,int len){
        if (node == null) {
            
            if (maxlen < len) 
                maxlen = len;
                  return;
        }
          
        check(node.left,len+1);
          
        check(node.right,len+1);
    
}
}
