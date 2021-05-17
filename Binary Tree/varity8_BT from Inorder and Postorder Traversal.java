https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/

// Binary Tree from Inorder and Postorder Traversal
https://www.youtube.com/watch?v=uI77Ij5Kiic&t=186s&ab_channel=GateSmashers
https://www.youtube.com/watch?v=s5XRtcud35E&ab_channel=Jenny%27slecturesCS%2FITNET%26JRF

*********************
Time: O(N2)  -> WITHOUT USING HASHMAP(NEED EXTRA O(n) for searching in array)
https://www.geeksforgeeks.org/construct-a-binary-tree-from-postorder-and-inorder/
***********************

TIME: O(N) --> USING HASPMAP(reduce time for searching)
SPACE : O(N)

class Solution {
    HashMap<Integer,Integer> map;
    int postIndex ;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length-1;
        map = new HashMap<>();
        for(int i = 0 ; i<inorder.length ; i++){
            map.put(inorder[i],i);
        }
        TreeNode root = helper(postorder,0,postorder.length-1);
        return root;
    }
    
    public TreeNode helper(int[] postorder, int left, int right){
        if(left>right) return null;
        
        int val = postorder[postIndex--];
        TreeNode root = new TreeNode(val);
        root.right = helper(postorder,map.get(val)+1,right);
        root.left = helper(postorder,left,map.get(val)-1);
        
        return root;
        
    }
}