https://leetcode.com/problems/reverse-linked-list-ii/

////92. Reverse Linked List II

class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int count = 0;
        ListNode current = head;
        ListNode lastNode = null;
        
        if(m == 1)
            return reverseLinkList(head,n+1-m);
        
        while(current!=null){
            count ++;
            if(count == m){
                lastNode.next = reverseLinkList(current,n+1-m);
            }
            lastNode = current;
            current = current.next;
        }
        return head;
    }
    
    public ListNode reverseLinkList(ListNode head,int n){
        
        
        ListNode prev=null;
        ListNode next=null;
        ListNode current = head;
        
        int count = 0;
        while(count++<n && current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
           
        }
        head.next = current;
        return prev;
    }
}