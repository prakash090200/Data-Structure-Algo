https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

//  Flatten Binary Tree to Linked List

BEST**

class Solution {
    private TreeNode tail = new TreeNode(-1);
    
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        
        tail.right = root;
        tail = root;
		
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        root.right = null;
		
        flatten(left);
        flatten(right);
    }
}

*****************************************************
public static void inorder(TreeNode<Integer> root, ArrayList<Integer> inorderArray)
    {
        if (root == null)
        {
            return;
        }

        inorder(root.left, inorderArray);

        // Add current node data to array
        inorderArray.add(root.data);

        // Recur for right sub-tree
        inorder(root.right, inorderArray);
    }

    public static TreeNode<Integer> flatten(TreeNode<Integer> root)
    {

        if (root == null)
        {
            return root;
        }

        // Array to store inorder traversal
        ArrayList<Integer> inorderArray = new ArrayList<Integer>();

        inorder(root, inorderArray);

        // Create a pointer called newRoot, and store the first value of the array in it.
        TreeNode<Integer> newRoot = new TreeNode<Integer>(inorderArray.get(0));

        // Create a pointer called curr and store the newRoot in it.
        TreeNode<Integer> curr = newRoot;

        for (int i = 1; i < inorderArray.size(); i++)
        {

            // Create a new node.
            TreeNode<Integer> temp = new TreeNode<Integer>(inorderArray.get(i));

            // Make the left child of curr as NULL and right child as the temp. And make curr = temp.
            curr.left = null;
            curr.right = temp;
            curr = temp;
        }

        // Make both the left and the right child of the last node as NULL.
        curr.left = null;
        curr.right = null;

        return newRoot;
    }