
https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/

class Solution {
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
          if (root==null) return ll;
            check(root,ll);
        return ll;
        
    }
    public void check(TreeNode root,List<Integer> ll){
        if(root==null) return;
          check(root.left,ll);
       ll.add(root.val);
        
            check(root.right,ll);
    }           
}

*****************************************************************

ITERATIVE APPROACH******
 // Iterative function to perform inorder traversal on the tree

class Main
{
   
    public static void inorderIterative(Node root)
    {
        
        Stack<Node> stack = new Stack();
    
        Node curr = root;
    
        
        while (!stack.empty() || curr != null)
        {
            
            if (curr != null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            else {
                
                curr = stack.pop();
                System.out.print(curr.data + " ");
    
                curr = curr.right;
            }
        }
    }
 
    public static void main(String[] args)
    {
        /* Construct the following tree
                   1
                 /   \
                /     \
               2       3
              /      /   \
             /      /     \
            4      5       6
                  / \
                 /   \
                7     8
        */
 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
 
        inorderIterative(root);
    }
}
