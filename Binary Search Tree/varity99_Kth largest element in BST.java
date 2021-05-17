
https://practice.geeksforgeeks.org/problems/kth-largest-element-in-bst/1

//Kth largest element in BST

class Solution
{
    
    public int kthLargest(Node root,int k)
    {
        List<Integer> ret = new LinkedList<>();
        inorderTraversalWithK(root, ret, k);
        return ret.get(k - 1);
    }

    private void inorderTraversalWithK(Node root, List<Integer> out, int k) {
        if (root == null || out.size() >= k) {
            return;
        }
        if (root.left == null && root.right == null) {
            out.add(root.data);
        } 
        
        else {
             inorderTraversalWithK(root.right, out, k);
            out.add(root.data);
            inorderTraversalWithK(root.left, out, k);
           
        }
        
        
    }
}