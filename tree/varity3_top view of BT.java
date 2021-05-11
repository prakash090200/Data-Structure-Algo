https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1

https://www.geeksforgeeks.org/print-nodes-top-view-binary-tree/


TIME:  O(nlogn)
SPACE: O(N)

class Solution
{
 
    static ArrayList<Integer> topView(Node root)
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
            if (!h.containsKey(tmpNode.hd)) {
                h.put(tmpNode.hd, tmpNode.node);
            }
 
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