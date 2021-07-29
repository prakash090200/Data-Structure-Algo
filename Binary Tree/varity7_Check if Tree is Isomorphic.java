https://practice.geeksforgeeks.org/problems/check-if-tree-is-isomorphic/1

///Check if Tree is Isomorphic

TIME:  O(min(m,n))
class Solution  
{ 
   
    boolean isIsomorphic(Node a, Node b)  
    { 
          if (a == null && b == null)
            return true;
             
       
        if (a != null && b != null)
            return ((a.data == b.data
                    && isIsomorphic(a.left, b.left)
                    && isIsomorphic(a.right, b.right)) || (a.data == b.data
                    && isIsomorphic(a.left, b.right)
                    && isIsomorphic(a.right, b.left)));
  
   
        return false;
    }
    
}    
********************************************************
class Solution  
{ 
    boolean flag;
    boolean isIsomorphic(Node root1, Node root2)  
    { 
        flag=true; 
        inorder(root1,root2);
        if(!flag){
          flag=true;
        root2=invertTree(root2);
         inorder(root1,root2);
        }
         return flag;
         
    }

public Node invertTree(Node root) {
    if (root == null) 
        return null;
    
    Node right = invertTree(root.right);
    Node left = invertTree(root.left);
    root.left = right;
    root.right = left;
    return root;
}
public void inorder(Node root1, Node root2){
    if(root1==null || root2==null) return;
    
    inorder(root1.left,root2.left);
     
     if(root1.data!=root2.data) 
        flag=false;
    inorder(root1.right,root2.right);
    
}
}