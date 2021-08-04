https://leetcode.com/problems/sort-list/


class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode mid=middle(head);
        ListNode nhead=mid.next;
        mid.next=null;
        ListNode l=sortList(head);
        ListNode r=sortList(nhead);
        return merge(l,r);
        
    }
    public ListNode merge(ListNode l,ListNode r){
        ListNode temp=new ListNode(-1);
        ListNode res=temp;
           while(l!=null && r!=null){
               if(l.val<=r.val){
                   temp.next=l;
                   temp=temp.next;
                   l=l.next;
               }
               else{
                   temp.next=r;
                   r=r.next;
                   temp=temp.next;
               }
               
           }
        while(l!=null){
                   temp.next=l;
                   l=l.next;
                   temp=temp.next;
               }
               while(r!=null){
                   temp.next=r;
                    r=r.next;
                   temp=temp.next;
               }
         return res.next;
    }
    public ListNode middle(ListNode head){
        if(head==null) return null;
        ListNode fir=head;
        ListNode sec=fir;
        while(fir.next!=null && fir.next.next!=null){
            fir=fir.next.next;
            sec=sec.next;
        }
        return sec;
        
    }
}