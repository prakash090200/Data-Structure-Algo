https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1


class Solution
{   
    ArrayList<Integer> a=new ArrayList<>();
	ArrayList <Integer> printBoundary(Node node)
	{  
	    if (node == null)
            return a;
  
        a.add(node.data);
  
       
        printBoundaryLeft(node.left);
  
    
        printLeaves(node.left);
        printLeaves(node.right);
  
      
        printBoundaryRight(node.right);
        return a;
	    
	}    
	    

    void printLeaves(Node node)
    {
        if (node == null)
            return;
  
        printLeaves(node.left);
      
        if (node.left == null && node.right == null)
            a.add(node.data);
        printLeaves(node.right);
    }
  
 
    void printBoundaryLeft(Node node)
    {
        if (node == null)
            return;
  
        if (node.left != null) {
        
           a.add(node.data);
            printBoundaryLeft(node.left);
        }
        else if (node.right != null) {
            a.add(node.data);
            printBoundaryLeft(node.right);
        }
  

    }
  

    void printBoundaryRight(Node node)
    {
        if (node == null)
            return;
  
        if (node.right != null) {
           
            printBoundaryRight(node.right);
            a.add(node.data);
        }
        else if (node.left != null) {
            printBoundaryRight(node.left);
            a.add(node.data);
        }
      
    }
  

}
