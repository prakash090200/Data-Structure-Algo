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
             
       
        if (a == null || b == null) 
        return false;
        
       return (a.data == b.data
                    && identical(a.left, b.right)
                    && identical(a.right, b.left));
  
   
       
    }
  
}

