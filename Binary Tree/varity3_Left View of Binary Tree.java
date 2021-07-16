///Left View of Binary Tree 

https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1

TIME:  O(N)
SPACE: O(N)

BEST**

class Solution {
    List<Integer> ans = new ArrayList<Integer>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return ans;
      
        fun(root,0);
        return ans;
    }
    public void fun(TreeNode tree, int depth){
        if(tree==null){
            return;
        }
        if(depth==ans.size()) ans.add(tree.val);
        if(tree.left!=null) fun(tree.left,depth+1);
        if(tree.right!=null) fun(tree.right,depth+1); 
        
    }
}
**********************************
class Tree
{
    ArrayList<Integer> leftView(Node root)
    {
      ArrayList<Integer> a=new ArrayList<>();
      Node temp=root;
      if(temp==null)
      return a;
      
      a.add(temp.data);
      
      while(temp.left!=null){
          a.add(temp.left.data);
          temp=temp.left;
      }
      if(temp.right!=null)
        a.addAll(leftView(temp.right));
      return a;
    }
    
}