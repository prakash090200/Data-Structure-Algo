/// Reverse a Doubly Linked List
https://practice.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1


public static Node reverseDLL(Node  head)
{
    Node cur=head;
    Node temp=null;
    while(cur!=null){
        temp=cur.prev;
        cur.prev=cur.next;
        cur.next=temp;
        cur=cur.prev;
        
    }
    if(temp!=null)
    head=temp.prev;
    return head;
}