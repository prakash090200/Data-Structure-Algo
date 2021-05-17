
https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/

TIME  :  O(n)
SPACE :  O(n)

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> ll=new ArrayList<>();
          if (root==null) return ll;
            check(root,ll);
        return ll;
        
    }
    public void check(TreeNode root,List<Integer> ll){
        if(root==null) return;
          check(root.left,ll);
       
        
            check(root.right,ll);
        ll.add(root.val);
    }           
}

*************************************************************
ITERATIVE APPROACH**

// Iterative function to perform postorder traversal on the tree

class Main
{
    
    public static void postorderIterative(Node root)
    {
        
        Stack<Node> stack = new Stack();
        stack.push(root);
    
        
        Stack<Integer> out = new Stack();
    
        
        while (!stack.empty())
        {
            
            Node curr = stack.pop();
            out.push(curr.data);
    
            
            if (curr.left != null) {
                stack.push(curr.left);
            }
    
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }
    
        
        while (!out.empty()) {
            System.out.print(out.pop() + " ");
        }
    }
 
    public static void main(String[] args)
    {
        
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
        
 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
 
        postorderIterative(root);
    }
}