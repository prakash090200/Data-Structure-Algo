https://practice.geeksforgeeks.org/problems/sum-tree/1

// Check whether it is a Sum Tree or not.

class Solution
{
	boolean isSumTree(Node node)
	{
         int ls,rs;
       
        
        if(node == null || (node.left == null && node.right == null))
        {
            return true;
        }
       
        
        ls = sum(node.left);
        rs = sum(node.right);
       
       
return ((node.data == ls + rs) && isSumTree(node.left)==true && isSumTree(node.right)==true);
            
	}



	static int sum(Node node){
        if(node == null)
        {
            return 0;
        }
        return (sum(node.left) + node.data+sum(node.right));
        }
     
}