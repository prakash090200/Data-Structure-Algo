https://practice.geeksforgeeks.org/problems/kth-ancestor-in-a-tree/1

///Kth Ancestor in a Tree

class Tree
{
    public int kthAncestor(Node root, int k, int node)
    {
        int ancestors[] = new int[10000 + 1];
 
 
    generateArray(root,ancestors);
 
   
    int count = 0;
 
    while (node!=-1)
    {
        node = ancestors[node];
        count++;
 
        if(count==k)
            break;
    }
 
  
    return node;
    }
    
    
    static void generateArray(Node root, int ancestors[]){
    
    ancestors[root.data] = -1;
 
    
    Queue<Node> q = new LinkedList<Node> ();
    q.add(root);
 
    while(!q.isEmpty())
    {
        Node temp = q.remove();
        
 
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
************************************************************
class Tree
{  
    int k;
    int ans=0;
    public int kthAncestor(Node root, int t, int node)
    {
        k=t;
        Node parent = check(root,node);
    if (parent != null)
        ans=-1;
        
        return ans;
    
    }
    
    public Node check(Node root,int node ){
    
    if (root == null)
        return null;
     
    if (root.data == node||
    (check(root.left, node)) != null ||
    (check(root.right,node)) != null)
    {
            if (k > 0)    
                k--;
             
            else if (k == 0)
            {
                ans=root.data;
                return null;
            }
            
            return root;
     }
    return null;
  }
}

**************************************************************


***************************************************************************
https://leetcode.com/problems/kth-ancestor-of-a-tree-node/submissions/

/// LEETCODE


best***
class TreeAncestor {
    int[][] dp ;
    public TreeAncestor(int n, int[] parent) {
        int log = (int)((Math.log(n)/Math.log(2)) + 1); 
        dp = new int[n][log];
        for(int i = 0;i<n;i++){
            dp[i][0] = parent[i];
        }
        for(int k = 1;k<log;k++){
            for(int i = 0;i<n;i++){
                if(dp[i][k-1] == -1)
                    dp[i][k] = -1;
                else 
                    dp[i][k] = dp[dp[i][k-1]][k-1]; 
            }
        }
    }
    
    public int getKthAncestor(int node, int k) {
		
        if(node == -1) return -1;
        int step = (int)(Math.log(k) / Math.log(2)); 
        if((1<<step) == k) return dp[node][step]; 
        return getKthAncestor(dp[node][step],k - (1<<step)); 
    }
}