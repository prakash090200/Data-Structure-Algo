https://leetcode.com/problems/delete-node-in-a-bst/submissions

//Delete Node in a BST



class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return root;
        
        if(root.val>key)
            root.left=deleteNode(root.left,key);
        else if(root.val<key)
            root.right=deleteNode(root.right,key);
        else{
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            
             else{  
                 root.val=minele(root.right);
                root.right=deleteNode(root.right,root.val);
             }
            
        }
        return root;
    }
     public int minele(TreeNode ele){
         int min=ele.val;
      
         
         while(ele.left!=null){
             
             ele=ele.left;
         }
         return ele.val;
     }
}