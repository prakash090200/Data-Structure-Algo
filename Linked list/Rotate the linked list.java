
/// rotate the linked list
class Rotate{
    
    public Node rotate(Node head, int k) {
       Node temp=head;
       Node prev=null;
       for(int i=0;i<k;i++){
           prev=temp;
           temp=temp.next;
       }
       if(temp==null)return head;
       Node newhead=temp;
       
       while(newhead.next!=null)
       newhead=newhead.next;
       newhead.next=head;
       prev.next=null;
       return temp;
    }        
}