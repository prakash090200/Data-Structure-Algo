https://leetcode.com/problems/binary-tree-right-side-view/

// Binary Tree Right Side View


TIME:  O(N)
SPACE: O(N)

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
        if(tree.right!=null) fun(tree.right,depth+1); 
        if(tree.left!=null) fun(tree.left,depth+1);
    }
}