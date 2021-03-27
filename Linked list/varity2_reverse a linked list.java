 
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
*******************************************
or 
RECURSION:

Node reverseUtil(Node curr, Node prev)
    {
  
        if (head == null)
            return head;
      
        if (curr.next == null) {
            head = curr;
 
            curr.next = prev;
 
            return head;
        }
 
     
        Node next1 = curr.next;
 
      
        curr.next = prev;
 
        reverseUtil(next1, curr);
        return head;
    }