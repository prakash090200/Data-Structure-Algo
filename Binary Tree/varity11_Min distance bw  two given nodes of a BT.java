https://practice.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1#

/// Min distance between two given nodes of a Binary Tree

class GfG {
    int findDist(Node root, int a, int b) {
           Node aa=new Node(a);
           Node bb=new Node(b);
           Node lca =lowestCommonAncestor(root, aa, bb);
 
        int d1 = findLevel(lca, a, 0);
        int d2 = findLevel(lca, b, 0);
 
        return d1 + d2;
      
    }
    public Node lowestCommonAncestor(Node root, Node p, Node q) 
    {
      if(root==null) return null;
      if(root.data==p.data || root.data==q.data) return root;
        
       Node l= lowestCommonAncestor(root.left, p,q);
       Node r=lowestCommonAncestor(root.right,p,q);
        if(l!=null && r!=null) return root;
        return (l!=null)?l:r;
    }
     public static int findLevel(Node root, int a, int level)
    {
        if (root == null)
            return 0;
        if (root.data == a)
            return level;
        int left = findLevel(root.left, a, level + 1);
        if (left == 0)
            return findLevel(root.right, a, level + 1);
        return left;
    }
}