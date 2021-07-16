///Nth node from end of linked list 


1st approach

class GfG
{
    
    int getNthFromLast(Node head, int n)
    { 
       Node h=reverse(head);
       int count=0;
       Node prev=null;
       while(h!=null && count++<n){
           prev=h;
          h=h.next;
       }
       if(n>count)
       return -1;
       else
       return prev.data;
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
**********************************************************


class GfG
{
   
    int getNthFromLast(Node head, int k)
    {
    
        Node cur=head;

        int count=0;
        while(cur!=null){
            count++;
            
            cur=cur.next;
         }
        if(count<k) return -1;
        count-=k;
       
        cur=head;
        int i=0;
        while(i++<count && cur!=null){
            cur=cur.next;
        }
        return cur.data;	
    }
}

