https://leetcode.com/problems/remove-nth-node-from-end-of-list/

19. Remove Nth Node From End of List

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
             return null;
        
        int count=0;
        ListNode cur=head;
        
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        
        count-=n;
        int k=0;
        cur=head;
        ListNode prev=null;
        while(k++<count &&cur!=null){
            prev=cur;
            cur=cur.next;
        }
        if(cur.next==null){
            if(prev==null)
                head=head.next;
            else
            prev.next=null;
        }
        else
            deleted(cur);
      
      return head;      
    }
    public void deleted(ListNode cur){
        if(cur==null)return ;
        if(cur.next!=null){
            cur.val=cur.next.val;
            cur.next=cur.next.next;
        }
       
    }
}