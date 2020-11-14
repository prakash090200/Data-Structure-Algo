 ////Delete without head pointer 

class GfG
{
    void deleteNode(Node node)
    {
        if(node==null) return;
        if(node.next!=null){
            node.data=node.next.data;
            node.next=node.next.next;
        }
       
        
    }
}