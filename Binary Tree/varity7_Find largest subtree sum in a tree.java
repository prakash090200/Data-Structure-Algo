https://www.geeksforgeeks.org/find-largest-subtree-sum-tree/

https://www.codingninjas.com/codestudio/problems/largest-sub-tree-sum_920400?leftPanelTab=1

//Largest sub-tree sum

public class Solution {
    public static int subtreeSum(TreeNode<Integer> root, int [] maxSum) {
        if (root == null) 
           return 0;
        


        int curSum = subtreeSum(root.left, maxSum) + subtreeSum(root.right, maxSum) + root.data;
        maxSum[0]=Math.max(curSum,maxSum[0]);
        
        return curSum;
    }

    public static int largestSubtreeSum(TreeNode<Integer> root) {
        int[] maxSum = new int[1];
        maxSum[0] = Integer.MIN_VALUE;

        subtreeSum(root, maxSum);

        return maxSum[0];
    }
}