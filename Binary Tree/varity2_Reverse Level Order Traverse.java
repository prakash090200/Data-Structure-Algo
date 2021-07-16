https://leetcode.com/problems/binary-tree-level-order-traversal-ii/submissions/


// FOr interview - using STACK AND QUEUE

TIME : O(N)
SPACE :O(N)

class BinaryTree 
{
    Node root;
 
    void reverseLevelOrder(Node node) 
    {
        Stack<Node> S = new Stack();
        Queue<Node> Q = new LinkedList();
        Q.add(node);
   
        while (!Q.isEmpty()) 
        {
           
            node = Q.peek();
            Q.remove();
            S.push(node);
   
          
            if (node.right != null)
               
                Q.add(node.right); 
                  
            
            if (node.left != null)
                Q.add(node.left);
        }
   
        
        while (!S.empty()) 
        {
            node = S.peek();
            System.out.print(node.data + " ");
            S.pop();
        }
    }


***********************************************************


class Solution {
    List<List<Integer>> retVal = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
  
        levelOrderBottom(root,0);
         Collections.reverse(retVal);
        return retVal;
        
    }
	
    public void levelOrderBottom(TreeNode root, int level){
        if(root==null) return; 
        if(retVal.size()==level){ 
            retVal.add(new ArrayList<Integer>());
        }
        retVal.get(level).add(root.val); 
        levelOrderBottom(root.left,level+1);
        levelOrderBottom(root.right,level+1);
        return;
    
    }

}
