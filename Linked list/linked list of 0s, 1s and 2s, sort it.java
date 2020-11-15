//// linked list of 0s, 1s and 2s, sort it

class LinkedList
{
    static Node segregate(Node head)
    {
        Node a=new Node(0);
        Node b=new Node(0);
        Node c=new Node(0);
        Node aa=a;
        Node bb=b;
        Node cc=c;
        Node curr=head;
        while(curr!=null){
            if(curr.data==0){
                aa.next=curr;
                aa=aa.next;
                curr=curr.next;
            }
            else if(curr.data==1){
                bb.next=curr;
                bb=bb.next;
                curr=curr.next;
                
            }
            else if(curr.data==2){
                cc.next=curr;
                cc=cc.next;
                curr=curr.next;
            }
        }
       aa.next=(b.next!=null)?b.next:c.next;
       bb.next=c.next;
       cc.next=null;
       head=a.next;
       return head;
    }
}
