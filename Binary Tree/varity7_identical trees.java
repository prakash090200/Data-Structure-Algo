class GfG
{
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