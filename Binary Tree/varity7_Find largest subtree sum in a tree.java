https://www.geeksforgeeks.org/find-largest-subtree-sum-tree/


//Find largest subtree sum in a tree

static int findLargestSubtreeSumUtil(Node root,INT ans) 
{ 
    
    if (root == null)     
        return 0; 
      
   
    int currSum = root.key + 
    findLargestSubtreeSumUtil(root.left, ans) + 
    findLargestSubtreeSumUtil(root.right, ans); 
  
    ans.v = Math.max(ans.v, currSum); 
  
   
    return currSum; 
} 
  

static int findLargestSubtreeSum(Node root) 
{ 
    
    if (root == null)     
        return 0; 
      
    
    INT ans = new INT(-9999999); 
  
    findLargestSubtreeSumUtil(root, ans); 
  
    return ans.v; 
} 
  

public static void main(String args[])
{ 
    /* 
            1 
            / \ 
            /     \ 
        -2     3 
        / \     / \ 
        / \ / \ 
        4     5 -6     2 
    */
  
    Node root = newNode(1); 
    root.left = newNode(-2); 
    root.right = newNode(3); 
    root.left.left = newNode(4); 
    root.left.right = newNode(5); 
    root.right.left = newNode(-6); 
    root.right.right = newNode(2); 
  
    System.out.println(findLargestSubtreeSum(root)); 
} 
}