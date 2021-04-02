
https://practice.geeksforgeeks.org/problems/delete-nodes-having-greater-value-on-right/1

/// Delete nodes having greater value on right

class Solution
{
    Node compute(Node head)
    {
        Node rev=reverse(head);
        Node curr=rev,maxNode=rev;
        while(curr!=null&&curr.next!=null){
            if(curr.next.data<maxNode.data)
            curr.next=curr.next.next;
            else{
                curr=curr.next;
                maxNode=curr;
            }
        }
        return reverse(rev);
    }
    
    
    
    
    Node reverse(Node head){
        Node curr=head,prev=null,ahead=null;
        while(curr!=null){
            ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
        return prev;
    }
}
  