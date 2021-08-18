https://leetcode.com/problems/populating-next-right-pointers-in-each-node/

//Populating Next Right Pointers in Each Node

class Solution {
    public Node connect(Node root) {
        Node right = null;
        iterateTree(root, right);
        return root;
    }
    
    public void iterateTree(Node root, Node right){
        if(root == null)
            return;
        root.next = right;
        if(root.left != null && root.right != null)
            iterateTree(root.left, root.right);
        else
            iterateTree(root.left, null);
        if(root.right != null && root.next != null && root.next.left!=null)
            iterateTree(root.right, root.next.left);
        else
            iterateTree(root.right, null);
    }
}

*******************************************************88

class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        Queue<Node> q =  new LinkedList();
        q.add(root);
        while(!q.isEmpty()) {
            int count = q.size();
            for(int i = 0; i<count; i++) {

                Node curr = q.poll();
                
                if(i == count-1)
                    curr.next = null;
                else
                    curr.next = q.peek();
                
                if(curr.left!=null)
                    q.add(curr.left);
                
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
        return root;
    }
}