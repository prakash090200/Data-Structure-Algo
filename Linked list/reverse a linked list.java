
/// Reverse a linked list
class ReverseLL
{
   
    Node reverseList(Node head)
    {
        Node prev=null;
        Node nex =null;
        Node curr=head;
        while(curr!=null){

            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        return prev;
        
    }
}
