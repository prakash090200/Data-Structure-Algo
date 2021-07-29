https://practice.geeksforgeeks.org/problems/maximum-sum-of-non-adjacent-nodes/1

https://www.youtube.com/watch?v=ZdIrKO7gqok&ab_channel=CodeLibrary

//Maximum sum of nodes in Binary tree such that no two are adjacent


with Dp*************
class GFG
{
    static Map<Node,Integer> h=new HashMap<>();
    static int getMaxSum(Node node)
    {
       if (node == null)
            return 0;
            
         if(h.containsKey(node))
            return h.get(node);
   
        
        int incl = node.data;
        if (node.left!=null)
            incl +=  getMaxSum(node.left.left) +
                    getMaxSum(node.left.right);
   
        
        if (node.right!=null)
            incl +=  getMaxSum(node.right.left) +
                    getMaxSum(node.right.right);
        
   
        
        int excl =  getMaxSum(node.left) +
                    getMaxSum(node.right);
   
       
      h.put(node,Math.max(incl, excl));
      return h.get(node);
       
        
    }
}

WITHOUT DP ***
******************************************************
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

