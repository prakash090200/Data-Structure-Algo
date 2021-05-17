
https://practice.geeksforgeeks.org/problems/check-whether-bst-contains-dead-end/1#

//Check whether BST contains Dead End



class GFG
{
    public static boolean isDeadEnd(Node root)
    {
       return deadEnd(root, 1, Integer.MAX_VALUE);
    }
    static boolean deadEnd(Node root, int min, int max){
   
    if (root==null)
        return false;
  
   
    if (min == max)
        return true;
  
    
    return deadEnd(root.left, min, root.data - 1)||
                deadEnd(root.right, root.data + 1, max);
     }
}