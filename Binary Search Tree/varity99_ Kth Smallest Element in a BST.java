https://leetcode.com/problems/kth-smallest-element-in-a-bst/

// Kth Smallest Element in a BST




class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ret = new LinkedList<>();
        inorderTraversalWithK(root, ret, k);
        return ret.get(k - 1);
    }

    private void inorderTraversalWithK(TreeNode root, List<Integer> out, int k) {
        if (root == null || out.size() >= k) {
            return;
        }
        if (root.left == null && root.right == null) {
            out.add(root.val);
        } else {
            inorderTraversalWithK(root.left, out, k);
            out.add(root.val);
            inorderTraversalWithK(root.right, out, k);
        }
    }
}