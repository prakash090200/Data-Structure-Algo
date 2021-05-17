https://practice.geeksforgeeks.org/problems/insert-a-node-in-a-bst/1#

///Insert a node in a BST

TIME: O(Height od BST)
SPACE:O(Height od BST)


class Solution
{
    
    Node insert(Node root, int key)
    {
         if (root == null)
        {
            root = new Node(key);
            return root;
        }
 
        
        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);
 
        
        return root;
    }
}