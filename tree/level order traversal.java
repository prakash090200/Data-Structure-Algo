https://leetcode.com/problems/binary-tree-level-order-traversal/


// long approach

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

****************************************************
