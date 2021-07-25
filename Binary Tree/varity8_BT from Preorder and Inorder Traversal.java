
https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

//105. Construct Binary Tree from Preorder and Inorder Traversal
https://www.youtube.com/watch?v=uI77Ij5Kiic&t=186s&ab_channel=GateSmashers
https://www.youtube.com/watch?v=s5XRtcud35E&ab_channel=Jenny%27slecturesCS%2FITNET%26JRF

*********************
Time: O(N2)  -> WITHOUT USING HASHMAP(NEED EXTRA O(n) for searching in array)
https://www.geeksforgeeks.org/construct-tree-from-given-inorder-and-preorder-traversal/
***********************

TIME: O(N) --> USING HASPMAP(reduce time for searching)
SPACE : O(N)


class Solution {
    HashMap<Integer,Integer> map=new HashMap<>();
    int preIndex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        for(int i = 0 ; i<inorder.length ; i++){
            map.put(inorder[i],i);
        }
        TreeNode root = helper(preorder,0,preorder.length-1);
        return root;
    }
    
    public TreeNode helper(int[] preorder, int left, int right){
        if(left>right) return null;
        
        int val = preorder[preIndex++];
        TreeNode root = new TreeNode(val);
        
        root.left = helper(preorder,left,map.get(val)-1);
        root.right = helper(preorder,map.get(val)+1,right);
        
        return root;
        
    }

}