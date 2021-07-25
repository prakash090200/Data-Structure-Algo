https://practice.geeksforgeeks.org/problems/max-and-min-element-in-binary-tree/1#

///Max and min element in Binary Tree 


class Solution{
    static int minn;
    static int maxx;
    public static int findMax(Node root){
        minn=Integer.MAX_VALUE;
        maxx=Integer.MIN_VALUE;
        inorder(root);
        return maxx;
    }
    public static int findMin(Node root){
        
        return minn;
    }
    public static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
       minn=Math.min(minn,root.data);
       maxx=Math.max(maxx,root.data);
       
           
        inorder(root.right);
        
    }
}