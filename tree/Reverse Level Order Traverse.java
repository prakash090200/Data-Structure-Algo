https://leetcode.com/problems/binary-tree-level-order-traversal-ii/submissions/

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