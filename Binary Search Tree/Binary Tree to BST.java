https://practice.geeksforgeeks.org/problems/binary-tree-to-bst/1

//Binary Tree to BST

TIME:O(NLOGN)
SPACE : O(N)

class Solution
{
    ArrayList<Integer> al=new ArrayList<>();
    int i=0;
    Node binaryTreeToBST(Node root)
    {
       inorder(root);
       Collections.sort(al);
       inorderinsert(root);
       return root;
    }
    void inorderinsert(Node root){
        if(root==null)return;
        inorderinsert(root.left);
        root.data=al.get(i++);
        inorderinsert(root.right);
    }
    void inorder(Node root){
        if(root==null)return;
        inorder(root.left);
        al.add(root.data);
        inorder(root.right);
    }
}
 