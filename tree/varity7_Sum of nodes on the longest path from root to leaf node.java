https://practice.geeksforgeeks.org/problems/sum-of-the-longest-bloodline-of-a-tree/1#
https://www.geeksforgeeks.org/sum-nodes-longest-path-root-leaf-node/

// Sum of the Longest Bloodline of a Tree (Sum of nodes on the longest path from root to leaf node)


class Res{
int maxsum;
int maxlen;
}

class GfG
{
    
    int sumOfLongRootToLeafPath(Node root)
    {
       
        if (root == null)
            return 0;
        Res ms=new Res();
        Res ml=new Res();
       
        ms.maxsum = Integer.MIN_VALUE;
        ml.maxlen = 0;
       
        sumOfLongRootToLeafPathUtil(root, 0, 0,ms,ml);
       
    
        return ms.maxsum;
    }

    public void sumOfLongRootToLeafPathUtil(Node root, int sum, int len, Res ms, Res ml)
    {
        if (root == null) {
            
            if (ml.maxlen < len) {
                ml.maxlen = len;
                ms.maxsum = sum;
            } 
            else if (ml.maxlen == len && ms.maxsum < sum)
                ms.maxsum = sum;
            return;
        }
          
          
       
        sumOfLongRootToLeafPathUtil(root.left, sum + root.data,
                                len + 1,ms,ml);
          
        sumOfLongRootToLeafPathUtil(root.right, sum + root.data,
                                len + 1,ms,ml);
        
    }
}
