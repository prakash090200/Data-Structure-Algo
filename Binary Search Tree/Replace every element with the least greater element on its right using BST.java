https://www.geeksforgeeks.org/replace-every-element-with-the-least-greater-element-on-its-right/#:~:text=A%20naive%20method%20is%20to,element%20found%20by%20inner%20loop.

////Replace every element with the least greater element on its right using BST**

Time: o(n2)

static Node root;
static Node succ;
 

BinarySearchTree()
{
    root = null;
    succ = null;
}
 

Node insert(Node node, int data)
{
     

    if (node == null)
    {
        node = new Node(data);
    }
 

    if (data < node.data)
    {
        succ = node;
        node.left = insert(node.left, data);
    }
 

    else if (data > node.data)
        node.right = insert(node.right, data);
         
    return node;
}
 

static void replace(int arr[], int n)
{
    BinarySearchTree tree = new BinarySearchTree();
 

    for(int i = n - 1; i >= 0; i--)
    {
        succ = null;

        root = tree.insert(root, arr[i]);

        if (succ != null)
            arr[i] = succ.data;

        else
            arr[i] = -1;
    }
}