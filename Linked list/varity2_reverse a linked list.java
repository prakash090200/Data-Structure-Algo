
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
        /*If head is initially null OR list is empty*/
        if (head == null)
            return head;
        /* If last node mark it head*/
        if (curr.next == null) {
            head = curr;
 
            /* Update next to prev node */
            curr.next = prev;
 
            return head;
        }
 
        /* Save curr->next node for recursive call */
        Node next1 = curr.next;
 
        /* and update next ..*/
        curr.next = prev;
 
        reverseUtil(next1, curr);
        return head;
    }