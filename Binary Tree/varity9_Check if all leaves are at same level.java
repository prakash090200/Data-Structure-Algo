https://practice.geeksforgeeks.org/problems/leaf-at-same-level/1

/// Check if all leaves are at same level

class Solution
{  
    int leave=0;
    boolean check(Node root)
    {
        return checkUtil(root,0);
    }
	boolean checkUtil(Node node, int level)
    {
        
        if (node == null)
            return true;
             
       
        if (node.left == null && node.right == null)
        {
           
            if (leave == 0)
            {
               
                leave = level;
                return true;
            }
  
            
            return (level == leave);
        }
  
        
        return checkUtil(node.left, level + 1) && checkUtil(node.right, level + 1);
    }	
    
}
