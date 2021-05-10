https://leetcode.com/problems/binary-tree-preorder-traversal/submissions/

TIME  :  O(n)
SPACE :  O(n)


class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ll=new ArrayList<>();
          if (root==null) return ll;
            check(root,ll);
        return ll;
        
    }
    public void check(TreeNode root,List<Integer> ll){
        if(root==null) return;
          
       ll.add(root.val);
        check(root.left,ll);
            check(root.right,ll);
    }           
    }

*****************************************************************
ITERATIVE APPROACH**********************************

https://www.techiedelight.com/preorder-tree-traversal-iterative-recursive/

// Iterative function to perform preorder traversal on the tree

class Main
{
    
    public static void preorderIterative(Node root)
    {
        
        if (root == null) {
            return;
        }
    
        
        Stack<Node> stack = new Stack();
        stack.push(root);
    
        
        while (!stack.empty())
        {
            
            Node curr = stack.pop();
    
            System.out.print(curr.data + " ");
    
            
            if (curr.right != null) {
                stack.push(curr.right);
            }
    
           
            if (curr.left != null) {
                stack.push(curr.left);
            }
    
            
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
        */
 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
 
        preorderIterative(root);
    }
}