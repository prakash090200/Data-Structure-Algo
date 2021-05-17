https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/submissions/

//Construct Binary Search Tree from Preorder Traversal

TIME: O(N2)
SPACE: O(N)

class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++)
            createNode(root,preorder[i]);
        return root;
    }
    public static TreeNode createNode(TreeNode node, int data)
    {
        if (node == null)
            node = new TreeNode(data);
 
        if (node.val > data)
            node.left = createNode(node.left, data);
        if (node.val < data)
            node.right = createNode(node.right, data);
 
        return node;
    }
}

***********************************************************

TIME:O(N)
SPACE:O(N)

class Solution {
    int c=0;
    public TreeNode bstFromPreorder(int[] pre) {
        return bst(pre,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    
    private TreeNode bst(int[] pre,int min,int max) {
        if(c==pre.length) {
            return null;
        }
        TreeNode node=null;
        int key=pre[c];
        if(key>min && key<max){   
            node = new TreeNode(key);
            c++;
            node.left=bst(pre,min,key);                 
            node.right=bst(pre,key,max); 
            
        }
        return node;
    }
    
}