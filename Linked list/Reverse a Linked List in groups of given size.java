
//// Reverse a Linked List in groups of given size.


class GfG
{
    public static Node reverse(Node node, int k)
    {
        Node prev=null;
        Node nex=null;
        Node curr=node;
        int count=0;
        while(count++<k && curr!=null){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        node.next=(curr!=null)?reverse(nex,k):null;
        return prev;
    }
}
