https://practice.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1#

// Intersection of two sorted Linked lists

class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        Node temp=new Node(0);
        Node res=temp;
        while(head1!=null && head2!=null){
            if(head1.data==head2.data){
                temp.next=head1;
                temp=head1;
                head1=head1.next;
                head2=head2.next;
            }
            else{
                if(head1.data<head2.data)
                    head1=head1.next;
                else
                head2=head2.next;
                
            }
        }
        return res.next;
    }
}