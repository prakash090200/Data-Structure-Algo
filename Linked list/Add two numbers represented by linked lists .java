////Add two numbers represented by linked lists

class Solution{
    static Node addLists(Node first, Node second){
        Node rev1=reverse(first);
        Node rev2=reverse(second);
        int c=0,sum=0;
        Node head=null;
        Node tail=null;
        while(rev1!=null && rev2!=null){
            sum=rev1.data+rev2.data+c;
            Node temp=new Node(sum%10);
            c=sum/10;
            if(head==null){
             head=temp;
             tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            rev1=rev1.next;
            rev2=rev2.next;
            
        }
        while(rev1!=null){
          sum=rev1.data+c;
          Node temp=new Node(sum%10);
            c=sum/10;
            tail.next=temp;
            tail=temp;
            rev1=rev1.next;
          
        }
        while(rev2!=null){
            sum=rev2.data+c;
          Node temp=new Node(sum%10);
            c=sum/10;
            tail.next=temp;
            tail=temp;
            rev2=rev2.next;
        }
        if(c>0){
            Node t=new Node(c);
            tail.next=t;
            tail=t;
        }
        Node h=reverse(head);
        return h;
        
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