
https://practice.geeksforgeeks.org/problems/populate-inorder-successor-for-all-nodes/1#

// Populate Inorder Successor for all nodes

class GFG
{  static Node prev=null;
    public static void populateNext(Node root)
    {
        if(root==null) return ;
        populateNext(root.left);
        if(prev!=null){
        prev.next=root;
        }
    
        prev=root;
        populateNext(root.right);
    }
}