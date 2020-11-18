
///Pairwise swap elements of a linked list 

class Solution {
    
    public Node pairwiseSwap(Node head)
    {
       Node prev=null;
        Node nex=null;
    Node curr=head;
    int count=0;
    while(count < 2 && curr!=null){
        nex=curr.next;
        curr.next=prev;
        prev=curr;
        curr=nex;
        count++;
    }
    head.next=(curr!=null)?pairwiseSwap(nex):null;
    return prev;
        
    }
    
}