https://leetcode.com/problems/balance-a-binary-search-tree/submissions/

//Balance a Binary Search Tree


class Solution {
    List<TreeNode> ls=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
     inorder_traversal(root); 
     return helper_balancedBST(ls,0,ls.size()-1);
    }
    public void inorder_traversal(TreeNode root){
        if(root==null)
            return;
        inorder_traversal(root.left);
        ls.add(root);
        inorder_traversal(root.right);
    }
    public TreeNode helper_balancedBST(List<TreeNode> nums,int start,int end){
        if(start>end)
            return null;
        int mid=(start+end)/2;
        TreeNode root=nums.get(mid);
        root.left=helper_balancedBST(nums,start,mid-1);
        root.right=helper_balancedBST(nums,mid+1,end);
        return root;
    }
}