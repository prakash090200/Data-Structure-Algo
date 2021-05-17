https://practice.geeksforgeeks.org/problems/transform-to-sum-tree/1

// Convert a given tree to its Sum Tree

class Solution{
    public void toSumTree(Node root){
         int ans=find(root);
    }
    public int find(Node node){
        if (node == null)
            return 0;
   
       
        int old_val = node.data;
        node.data = find(node.left) + find(node.right);
        return node.data + old_val;
    }
}