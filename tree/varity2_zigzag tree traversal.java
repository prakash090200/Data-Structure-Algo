https://practice.geeksforgeeks.org/problems/zigzag-tree-traversal/1#


class GFG {
ArrayList<Integer> zigZagTraversal(Node root) {
	    
ArrayList<Integer> a=new ArrayList<>();
	  if (root == null) 
            return a;
    
 
    
    Stack<Node> currentLevel = new Stack<>();
    Stack<Node> nextLevel = new Stack<>();
 
    
    currentLevel.push(root);
    boolean leftToRight = true;
 
    
    while (!currentLevel.isEmpty()) {
    Node node = currentLevel.pop();
     
    
    a.add(node.data);
 
    
    if (leftToRight) {
        if (node.left != null) {
        nextLevel.push(node.left);
        }
         
        if (node.right != null) {
        nextLevel.push(node.right);
        }
    }
    else {
        if (node.right != null) {
        nextLevel.push(node.right);
        }
         
        if (node.left != null) {
        nextLevel.push(node.left);
        }
    }
 
    if (currentLevel.isEmpty()) {
        leftToRight = !leftToRight;
        Stack<Node> temp = currentLevel;
        currentLevel = nextLevel;
        nextLevel = temp;
    }
    }
return a;
}
}

****************************************************************

https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/


class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       List<List<Integer>> result = new LinkedList<>();
    if(root == null) return result;
    
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);        
    boolean leftToRight = true;
    
    while(!q.isEmpty()){
        
        int size = q.size();
       List<Integer> current = new ArrayList<>();
        
        for(int i=0; i<size; i++){
                            
            TreeNode top = q.poll();
            
            if(top.left != null){
                q.add(top.left);
            }
            
            if(top.right != null){
                q.add(top.right);
            }
            
            if(leftToRight){
                current.add(top.val);
            }else{
                current.add(0,top.val);
            }                
        }
        
        leftToRight = !leftToRight;
        result.add(current);
    }
    return result;
}
}