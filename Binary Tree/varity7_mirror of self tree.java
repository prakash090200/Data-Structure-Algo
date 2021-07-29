https://practice.geeksforgeeks.org/problems/symmetric-tree/1


BEST**
class GfG
{
  
    public static boolean isSymmetric(Node root)
    {
       if(root==null) return true;
       
        if(identical(root.left,root.right))
        return true;
            
            
        return false;
        
    }
   
   static  boolean identical(Node a, Node b)
    {
        
        if (a == null && b == null)
            return true;
             
       
        if (a != null && b != null)
            return (a.data == b.data
                    && identical(a.left, b.right)
                    && identical(a.right, b.left));
  
   
        return false;
    }
  
}

******************************************
class GfG
{
  
    public static boolean isSymmetric(Node root)
    {
       if(root==null) return true;
        root.right=check(root.right);
        if(identical(root.left,root.right))
        return true;
            
            
        return false;
        
    }
    public static Node  check(Node root){
        if(root==null) return null;
        Node left=check(root.left);
        Node right=check(root.right);
        
        root.left=right;
        root.right=left;
        return root;
        
    }
   static  boolean identical(Node a, Node b)
    {
        
        if (a == null && b == null)
            return true;
             
       
        if (a != null && b != null)
            return (a.data == b.data
                    && identical(a.left, b.left)
                    && identical(a.right, b.right));
  
   
        return false;
    }
  
}