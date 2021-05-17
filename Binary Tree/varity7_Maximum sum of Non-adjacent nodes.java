https://practice.geeksforgeeks.org/problems/maximum-sum-of-non-adjacent-nodes/1

https://www.youtube.com/watch?v=ZdIrKO7gqok&ab_channel=CodeLibrary

//Maximum sum of nodes in Binary tree such that no two are adjacent


WITHOUT DP ***

class GFG
{
    
    static int getMaxSum(Node node)
    {
       if (node == null)
            return 0;
            
           
   
        
        int incl = node.data;
        if (node.left!=null)
            incl +=  getMaxSum(node.left.left) +
                    getMaxSum(node.left.right);
   
        
        if (node.right!=null)
            incl +=  getMaxSum(node.right.left) +
                    getMaxSum(node.right.right);
        
   
        
        int excl =  getMaxSum(node.left) +
                    getMaxSum(node.right);
   
       
      return Math.max(incl, excl);
   
       
        
    }
}

**********************************************

WITH DP**

class GFG
{
    
    static int getMaxSum(Node root)
    {
       if (root == null)
            return 0;
        HashMap<Node,Integer> mp=new HashMap<>();
        return maxsum(root, mp);
    }
     public static int maxsum(Node node, HashMap<Node,Integer> mp)
    {
        if (node == null)
            return 0;
   
        if(mp.containsKey(node))
            return mp.get(node);
   
        
        int incl = node.data;
        if (node.left!=null)
            incl += maxsum(node.left.left, mp) +
                   maxsum(node.left.right, mp);
   
        
        if (node.right!=null)
            incl += maxsum(node.right.left, mp) +
                   maxsum(node.right.right, mp);
        
   
        
        int excl = maxsum(node.left, mp) +
                   maxsum(node.right, mp);
   
       
        mp.put(node,Math.max(incl, excl));
   
        return mp.get(node);
    }
}