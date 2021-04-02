
https://practice.geeksforgeeks.org/problems/split-a-circular-linked-list-into-two-halves/1#

///Split a Circular Linked List into two halves

class gfg
{
        // Function  to split a circular LinkedList
	    void splitList(circular_LinkedList list)
        {
             
           Node s=list.head;
           Node f=list.head;
           while(f.next!=list.head && f.next.next!=list.head){
               f=f.next.next;
               s=s.next;
           }
           list.head1=list.head;
           list.head2=s.next;
           s.next=list.head;
           while(f.next!=list.head)
           f=f.next;
           
           f.next=list.head2;
           
            
             
             
	    }
}