https://practice.geeksforgeeks.org/problems/construct-bst-from-post-order/1

//Construct BST from Postorder

class GFG
{
    public static Node constructTree(int post[],int n)
    {
       Node root=new Node(post[n-1]);
        for(int i=0;i<n-1;i++)
            createNode(root,post[i]);
        return root;
    }
    public static Node createNode(Node node, int data)
    {
        if (node == null)
            node = new Node(data);
 
        if (node.data > data)
            node.left = createNode(node.left, data);
        if (node.data < data)
            node.right = createNode(node.right, data);
 
        return node;
    }
}
