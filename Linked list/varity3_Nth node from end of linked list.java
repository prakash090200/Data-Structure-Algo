///Nth node from end of linked list 

class GfG
{
    
    int getNthFromLast(Node head, int k)
    {
    	if(head==null) return -1;
        Node cur=head;
      int count=0;
        while(cur!=null){
            count++;
            if(count==k)
                temp1=cur;
            cur=cur.next;
         }
        
        count-=k;
        if(count<=-1) return -1;
        cur=head;
        int i=0;
        while(i++<count && cur!=null){
            cur=cur.next;
        }
        return cur.data;	
    }
}
