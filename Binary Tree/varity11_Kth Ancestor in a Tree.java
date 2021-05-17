https://practice.geeksforgeeks.org/problems/kth-ancestor-in-a-tree/1

///Kth Ancestor in a Tree


class Tree
{
    public int kthAncestor(Node root, int k, int node_val)
    {
        int ancestors[] = new int[10000 + 1];
 
 
    generateArray(root,ancestors);
 
   
    int count = 0;
 
    while (node_val!=-1)
    {
        node_val = ancestors[node_val];
        count++;
 
        if(count==k)
            break;
    }
 
  
    return node_val;
    }
    
    static void generateArray(Node root, int ancestors[])
{
    
    ancestors[root.data] = -1;
 
    
    Queue<Node> q = new LinkedList<Node> ();
    q.add(root);
 
    while(!q.isEmpty())
    {
        Node temp = q.peek();
        q.remove();
 
        if (temp.left != null)
        {
            ancestors[temp.left.data] = temp.data;
            q.add(temp.left);
        }
 
        if (temp.right != null)
        {
            ancestors[temp.right.data] = temp.data;
            q.add(temp.right);
        }
    }
}
}


***************************************************************************
https://leetcode.com/problems/kth-ancestor-of-a-tree-node/submissions/

/// LEETCODE


class TreeAncestor {
    int[] parent;
    int[] height;
    public TreeAncestor(int n, int[] parent) {
        this.parent = parent;
        this.height = new int[n];
        for(int i =1; i<parent.length; ++i) {
            fillHeight(i);
        }
    }
    
    public int getKthAncestor(int node, int k) {
        if(height[node] < k) return -1;
        int count = 0;
 
    while (node!=-1)
    {
        node = parent[node];
        count++;
 
        if(count==k)
            break;
    }
        return node;
    }
    
    private int fillHeight(int node) {
        if ((node == 0) || (height[node]!=0)) return height[node];
        height[node] = fillHeight(parent[node]) + 1;
        return height[node];
    }
}