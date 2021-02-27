///Nth node from end of linked list 

class GfG
{
    
    int getNthFromLast(Node head, int k)
    {
    	if(head==null) return -1;
        Node cur=head;
        int n=0;
        Node temp1=null;
        int temp2=0;
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
