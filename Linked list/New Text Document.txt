///Nth node from end of linked list 

class GfG
{
    
    int getNthFromLast(Node head, int n)
    { 
       Node h=reverse(head);
       int count=0;
       Node temp=null;
       while(h!=null && countn){
           temp=h;
          count++;
          h=h.next;
       }
       if(ncount)
       return -1;
       else
       return temp.data;
    }
    static Node reverse(Node head){
        Node prev=null;
        Node nex=null;
        Node cur=head;
        while(cur!=null){
            nex=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nex;
        }
        return prev;
    }
}
