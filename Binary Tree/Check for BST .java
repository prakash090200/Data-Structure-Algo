https://leetcode.com/problems/validate-binary-search-tree/
https://practice.geeksforgeeks.org/problems/check-for-bst/1#
//// Check for BST

public class Solution{
    boolean isBST(Node root)
        {
            return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        }
        
        
    boolean check(Node root,int min,int max){
        if(root==null)
            return true;
            
        boolean flag=false;
        if(root.data>min && root.data<max){
           
          if(check(root.left,min,root.data) && check(root.right,root.data,max))
           flag=true;
         
         }
    
    return flag;
   }
}


