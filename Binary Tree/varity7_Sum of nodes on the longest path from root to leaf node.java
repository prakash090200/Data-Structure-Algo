https://practice.geeksforgeeks.org/problems/sum-of-the-longest-bloodline-of-a-tree/1#
https://www.geeksforgeeks.org/sum-nodes-longest-path-root-leaf-node/

// Sum of the Longest Bloodline of a Tree (Sum of nodes on the longest path from root to leaf node)


class Solution
{   
       int maxsum = Integer.MIN_VALUE;
       int maxlen = Integer.MIN_VALUE;
    
    int sumOfLongRootToLeafPath(Node root)
    {
       
        if (root == null)
            return 0;
        
        check(root, 0, 0);
        return maxsum;
    }


    public void check(Node root, int sum, int len)
    {
        if (root == null) {
            
            if (maxlen < len) {
                maxlen = len;
                maxsum = sum;
            } 
            else if (maxlen == len && maxsum < sum)
                maxsum = sum;
            return;
            
        }
          
        check(root.left, sum + root.data,len + 1);
          
        check(root.right, sum + root.data,len + 1);
        
    }
}
