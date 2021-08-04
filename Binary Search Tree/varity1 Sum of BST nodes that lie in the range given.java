
https://leetcode.com/problems/range-sum-of-bst/submissions/

//Range Sum of BST


class Solution {
    int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        trimBST(root,low,high);
        return sum;
    }
    public TreeNode trimBST(TreeNode root, int low, int high) {
    if (root == null) return null;
    if (root.val<low) return trimBST(root.right, low, high);
    if (root.val>high)return trimBST(root.left, low, high);
    root.left = trimBST(root.left, low, high);
    root.right =trimBST(root.right, low, high);
        sum+=root.val;
    return root;
}
}