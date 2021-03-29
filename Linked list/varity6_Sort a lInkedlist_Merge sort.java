https://leetcode.com/problems/sort-list/


class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode mid=middle(head);
         ListNode midn=mid.next;
        mid.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(midn);
        return (merge(left,right));
   
    }
    public ListNode merge(ListNode a,ListNode b){
        ListNode temp=new ListNode(0);
        ListNode res=temp;
        while(a!=null && b!=null){
            if(a.val<b.val){
                temp.next=a;
                temp=a;
                a=a.next;
            }
        else{
              temp.next=b;
                temp=b;  
            b=b.next;
            }
            
        }
        if(a!=null) temp.next=a;
        else
            temp.next=b;
        return res.next;
    }
    public ListNode middle(ListNode m){
        
        ListNode fir=m;
        ListNode sec=m;
        while(fir!=null && fir.next!=null && fir.next.next!=null){
            fir=fir.next.next;
            sec=sec.next;
        }
         return sec;
    }
}