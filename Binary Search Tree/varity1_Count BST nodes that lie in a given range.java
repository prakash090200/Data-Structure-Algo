https://practice.geeksforgeeks.org/problems/count-bst-nodes-that-lie-in-a-given-range/1

// Count BST nodes that lie in a given range



class Tree
{   
    int count=0;
   
    int getCount(Node root,int l, int h)
    {
        trimBST(root,l,h);
        return count;
    }
    public Node trimBST(Node root, int low, int high) {
    if (root == null) return null;
    if (root.data<low) return trimBST(root.right, low, high);
    if (root.data>high)return trimBST(root.left, low, high);
    root.left = trimBST(root.left, low, high);
    root.right =trimBST(root.right, low, high);
    count++;
    return root;
}
}