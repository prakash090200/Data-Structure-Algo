https://practice.geeksforgeeks.org/problems/construct-tree-from-preorder-traversal/1#

// Construct Tree from Preorder Traversal

class Solution{
    int index=0;
    Node constructTree(int n, int pre[], char preLN[]){
        if(index>=n)
	        return null;
	    Node node = new Node(pre[index]);
	    if(preLN[index++]=='N')
	    {
	        node.left = constructTree(n,pre,preLN);
	        node.right = constructTree(n,pre,preLN);
	    }
	    return node;
    }
}
