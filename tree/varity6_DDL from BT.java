https://practice.geeksforgeeks.org/problems/binary-tree-to-dll/1#


class Solution
{
    
    Node bToDLL(Node root)
    {
     List<Integer> a=inorderTraversal(root);
     
    Node ans= make(a);
   
     return ans;
    }
    public Node make(List<Integer>a){
        Node head=null;
        Node tail=null;
        for(int i=0;i<a.size();i++){
             Node cur=new Node(a.get(i));
             
            if(head==null){
               
            
                head=cur;
                tail=cur;
            }
            else{
                tail.right=cur;
                cur.left=tail;
                tail=cur;
            }
        }
        return head;
        
    }
    public List<Integer> inorderTraversal(Node root) {
        List<Integer> ll=new ArrayList<>();
          if (root==null) return ll;
            check(root,ll);
        return ll;
        
    }
    public void check(Node root,List<Integer> ll){
        if(root==null) return;
          check(root.left,ll);
       ll.add(root.data);
        
            check(root.right,ll);
    }        
}