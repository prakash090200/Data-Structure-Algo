https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

//Convert Sorted Array to Binary Search Tree

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
   public TreeNode helper(int[] nums,int start,int end){
        if(start>end)
            return null;
        int mid=(start+end)/2;
        TreeNode root=new TreeNode(nums[mid]);
       root.left=helper(nums,start,mid-1);
       root.right=helper(nums,mid+1,end);
       return root;
    }
}