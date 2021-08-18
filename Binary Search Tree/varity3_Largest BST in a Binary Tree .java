https://practice.geeksforgeeks.org/problems/largest-bst/1

//Largest BST in a Binary Tree 


O(N 2)
o(n)


class Solution{
    
   
    static int largestBst(Node root)
    {
        if(root==null)return 0;
        
        if(bst(root,1,Integer.MAX_VALUE)) return size(root);
        
        return Math.max(largestBst(root.left),largestBst(root.right));
        
        
    }
    public static boolean bst(Node root,int min,int max){
         if(root==null) return true;
         
         if(root.data<min || root.data>max)
         return false;
         
         return (bst(root.left,min,root.data-1) && bst(root.right,root.data+1,max));
    }
    public static int size(Node root){
        if(root==null) return 0;
        
        return(size(root.left)+1+size(root.right));
    }
    
}

******************************************************************************************

O(N)
O(N)


class Solution{
  static int MAX = Integer.MAX_VALUE;
  static int MIN = Integer.MIN_VALUE;
 
  static class nodeInfo
  {
    int size; 
    int max; 
    int min; 
    int ans; 
    boolean isBST; 
 
    nodeInfo(){
        this.min=MIN;
        this.max=MAX;
    }   
 
    nodeInfo(int size, int max, int min,
             int ans, boolean isBST)
    {
      this.size = size;
      this.max = max;
      this.min = min;
      this.ans = ans;
      this.isBST = isBST;
    }
  }
 
  static nodeInfo largestBST(Node root)
  {
     
    
    if(root == null)
      return new nodeInfo(0, MIN, MAX, 0, true);
    if(root.left == null && root.right == null)
      return new nodeInfo(1, root.data, root.data, 1, true);
 
    
    nodeInfo left = largestBST(root.left);
    nodeInfo right = largestBST(root.right);
 
   
    nodeInfo returnInfo = new nodeInfo();
    returnInfo.size = 1 + left.size + right.size;
 
   
    if(left.isBST && right.isBST
       && left.max < root.data
       && right.min > root.data)
    {
      returnInfo.min = Math.min(Math.min(left.min, right.min), root.data);           
      returnInfo.max = Math.max(Math.max(left.max, right.max), root.data);
 
     
      returnInfo.ans = returnInfo.size;
      returnInfo.isBST = true;
      return returnInfo;
    }
 
    
    returnInfo.ans = Math.max(left.ans, right.ans);
    returnInfo.isBST = false;
    return returnInfo;
  }
 
 
  static int largestBst(Node root)
  {
    return largestBST(root).ans;
  }
  
    
    
}