https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1#


///// Bottom View of Binary Tree


TIME:  O(nlogn)
SPACE: O(N)

BEST**

class Tree
{
    
    public ArrayList <Integer> bottomView(Node root)
    {
         class QueueObj {
            Node node;
            int hd;
 
            QueueObj(Node node, int hd)
            {
                this.node = node;
                this.hd = hd;
            }
        }
        Queue<QueueObj> q = new LinkedList<QueueObj>();
        Map<Integer, Node>h= new TreeMap<Integer, Node>();
        ArrayList<Integer> a=new ArrayList<>();
 
        if (root == null) {
            return new ArrayList<>();
        }
        else {
            q.add(new QueueObj(root, 0));
        }
 
       
        while (!q.isEmpty()) {
            QueueObj tmpNode = q.poll();
           
                h.put(tmpNode.hd, tmpNode.node);
            
 
            if (tmpNode.node.left != null) {
                q.add(new QueueObj(tmpNode.node.left,
                                   tmpNode.hd - 1));
            }
            if (tmpNode.node.right != null) {
                q.add(new QueueObj(tmpNode.node.right,
                                   tmpNode.hd + 1));
            }
        }
        for(Node v:h.values())
       a.add(v.data);
       return a;
    }
}

*************************************************************
class Tree
{
    public ArrayList <Integer> bottomView(Node root)
    {   
       ArrayList<Integer> a=new ArrayList<>();
       TreeMap<Integer,Integer> h=new TreeMap<>();
       root.hd=0;
       Queue<Node> q=new LinkedList<>();
       q.add(root);
       
       while(!q.isEmpty()){
           Node curr=q.remove();
           int hd=curr.hd;
           h.put(hd,curr.data);
           if(curr.left!=null){
               curr.left.hd=hd-1;
               q.add(curr.left);
           }
           if(curr.right!=null){
               curr.right.hd=hd+1;
               q.add(curr.right);
           }
           
       }
       for(int v:h.values())
       a.add(v);
       return a;
    }
}

