
https://leetcode.com/problems/binary-tree-level-order-traversal/

// BEST**

class Solution {
    List<List<Integer>> retVal = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        levelOrderAux(root,0);
        return retVal;
        
    }
	
    public void levelOrderAux(TreeNode root, int level){
        if(root==null) return; 
        if(retVal.size()==level){ 
            retVal.add(new ArrayList<Integer>());
        }
        retVal.get(level).add(root.val); 
        levelOrderAux(root.left,level+1);
        levelOrderAux(root.right,level+1);
        return;
    }
}

*************************************************************

// long approach but imp for interview

Time->O(n^2)
Space -> O(n)

class Solution {
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
         int h = height(root);
        int i;
        for (i=1; i<=h; i++){
        ans.add(new answer().call(root,i));
    
        }
         return ans;  
     }
 
   
    int height(TreeNode root)
    {
        if (root == null)
           return 0;
        else
        {
            
            int lheight = height(root.left);
            int rheight = height(root.right);
             
          
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1);
        }
    }
}
class answer{
 
   List<Integer> l=new ArrayList<>();
    void printGivenLevel (TreeNode root ,int level)
    {
        
        if (root == null)
            return;
        if (level == 1)
            l.add(root.val);
        else if (level > 1)
        {
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
        
    }
    List<Integer> call(TreeNode root ,int level){
        printGivenLevel(root,level);
        return l;
    }
    
}

***************************************************************
/// ITERATIVE METHOD USING QUEUE

Time->O(n)
Space -> O(n)


class BinaryTree { 
Node root;
void printLevelOrder()
    {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
 
           
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");
 

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

