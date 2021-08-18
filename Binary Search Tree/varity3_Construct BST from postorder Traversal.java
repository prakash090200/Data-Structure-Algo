https://practice.geeksforgeeks.org/problems/construct-bst-from-post-order/1

//Construct BST from Postorder

O(N2)
O(N)

class GFG
{
    public static Node constructTree(int post[],int n)
    {
       Node root=new Node(post[n-1]);
        for(int i=0;i<n-1;i++)
            createNode(root,post[i]);
        return root;
    }
    public static Node createNode(Node node, int data)
    {
        if (node == null)
            node = new Node(data);
 
        if (node.data > data)
            node.left = createNode(node.left, data);
        if (node.data < data)
            node.right = createNode(node.right, data);
 
        return node;
    }
}

****************************************************************
O(N)
O(N)

class GFG
{  static int c=0;
    public static Node constructTree(int post[],int n)
    {  
       
       
       c=n-1;
        return bst(post,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
     static Node bst(int[] pre,int min,int max) {
         
       
       if(c<0) return null;
        Node node=null;
        int key=pre[c];
        
        if(key>min && key<max){  
            c--;
           
            node = new Node(key);
                           
            node.right=bst(pre,key,max);
            node.left=bst(pre,min,key);
          
        }
       
        return node;
    }
     
}
