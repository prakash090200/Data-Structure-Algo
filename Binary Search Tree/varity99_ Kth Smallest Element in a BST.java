https://leetcode.com/problems/kth-smallest-element-in-a-bst/

// Kth Smallest Element in a BST

TIME:O(N)
SPACE: O(N)


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
***********************************************************************
// MORRIS INORDER TRAVERSAL APPROACH **

TIME:O(N)
SPACE: O(1)  ****

class Solution {
    public int kthSmallest(TreeNode root, int k) {
       
        int ksmall=0;
        int count=0;
        TreeNode pre;
 
        TreeNode current = root;
        while (current != null)
        {
            if (current.left == null)
            {
                count++;
                if(count==k)
                    ksmall=current.val;
                current = current.right;
            }
            else {
                
                pre = current.left;
                while (pre.right != null
                       && pre.right != current)
                    pre = pre.right;
 
          
                if (pre.right == null) {
                    pre.right = current;
                    current = current.left;
                }
 
                
                else
                {
                    pre.right = null;
                    count++;
                   if(count==k)
                    ksmall=current.val;
                    current = current.right;
                } 
 
            } 
        }
        return ksmall;
    }
}