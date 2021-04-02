Check If Circular Linked List
https://practice.geeksforgeeks.org/problems/circular-linked-list/1


class GfG
{
    boolean isCircular(Node head)
    
    {
        if(head==null || head.next==head) return true;
       Node temp=head;
       Node cur=head;
       while(cur.next!=head ){
           cur=cur.next;
           if(cur==null)
           break;
       }
       if(cur==null)
       return false;
       else
       return true;
    }
}