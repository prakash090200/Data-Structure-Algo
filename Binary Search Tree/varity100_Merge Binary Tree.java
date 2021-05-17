https://leetcode.com/problems/merge-two-binary-trees/submissions/

//617. Merge Two Binary Trees

class Solution {
public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
    if (root1 == null && root2 != null) return root2;
    if (root2 == null && root1 != null)  return root1;
    if (root1==null && root2==null)    return null;
    TreeNode newroot = new TreeNode(root1.val+root2.val);       
    newroot.left = mergeTrees(root1.left, root2.left);
    newroot.right = mergeTrees(root1.right, root2.right);
    return newroot;
}
}