https://leetcode.com/problems/swap-nodes-in-pairs/
////Pairwise swap elements of a linked list 

class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        ListNode prev=null;
        ListNode nex=null;
    ListNode curr=head;
    int count=0;
    while(count++< 2 && curr!=null){
        nex=curr.next;
        curr.next=prev;
        prev=curr;
        curr=nex;
        
    }
    head.next=(curr!=null)?swapPairs(curr):null;
    return prev;
    }
}