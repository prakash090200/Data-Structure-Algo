
https://www.geeksforgeeks.org/check-if-two-trees-are-mirror/

//Check if two trees are Mirror

class BinaryTree
{
    Node a, b;
     
 
    boolean areMirror(Node a, Node b)
    {
     
        if (a == null && b == null)
            return true;
 
       
        if (a == null || b == null)
            return false;
 
        
        return a.data == b.data
                && areMirror(a.left, b.right)
                && areMirror(a.right, b.left);
    }