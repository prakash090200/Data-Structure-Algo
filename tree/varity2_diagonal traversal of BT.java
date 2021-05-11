https://practice.geeksforgeeks.org/problems/diagonal-traversal-of-binary-tree/1#

/// Diagonal Traversal of Binary Tree

class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
          
        ArrayList<Integer> res = new ArrayList<Integer>();
        Queue<Node> q = new LinkedList<>();
      
        q.add(root);
        while(q.size() != 0){
          
            Node u = q.poll();
          
            while(u != null) {
                res.add(u.data);
                if(u.left != null){
                    q.add(u.left);
                }
                u = u.right;
            }
        }
        return res;
}
}
