https://leetcode.com/problems/maximum-sum-bst-in-binary-tree/submissions/

//Maximum Sum BST in Binary Tree


class Solution {
    int max = 0;
    public int maxSumBST(TreeNode root) {
        post(root);
        return max;
    }
    public int[] post(TreeNode root) {
        //int[]res = {min, max, sum}
        if (root == null) return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        int[] left = post(root.left);
        int[] right = post(root.right);
        if (root.val > left[1] && root.val < right[0]) {
            int[] res = new int[3];
            res[0] = Math.min(left[0], root.val);
            res[1] = Math.max(right[1], root.val);
            res[2] = root.val + left[2] + right[2];
            max = Math.max(max, res[2]);
            return res;
        }
        
        return new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE, 0};
    }
}

********************************************************************************

class Solution {
    int max = 0;
    public int maxSumBST(TreeNode root) {
        postOrderTraversal(root);
        return max;
    }
    
    public Node postOrderTraversal(TreeNode root){
        if(root == null){
            return null;
        }
        
        Node left = postOrderTraversal(root.left);
        Node right = postOrderTraversal(root.right);
        if(left == null && right ==null){
            return new Node(root.val, root.val, root.val, true);
        }
        Node node = new Node();
        node.min = Math.min(root.val, left != null? left.min: root.val);
        node.max = Math.min(root.val, right != null? right.max: root.val);
        node.sum = root.val + (left != null? left.sum: 0) + (right != null? right.sum: 0);
        boolean bst = true;
        if(left != null){
            bst = bst && left.bst && left.max < root.val;
        }
        if(bst && right != null){
            bst = bst && right.bst && right.min > root.val;
        }
        
        node.bst = bst;
        
        if(left != null && left.bst){
            max = Math.max(max, left.sum);
        }
        if(right != null && right.bst){
            max = Math.max(max, right.sum);
        }
        if(node.bst){
            max = Math.max(max, node.sum);
        }
        return node;
        
    }
    
    class Node{
        int min;
        int max;
        int sum;
        boolean bst;
        public Node(){
            
        }
        public Node(int min, int max, int sum, boolean bst){
            this.min = min;
            this.max = max;
            this.sum = sum;
            this.bst = bst;
        }
    }
}