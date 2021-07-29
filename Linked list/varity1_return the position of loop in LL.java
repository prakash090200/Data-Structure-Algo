https://leetcode.com/problems/linked-list-cycle-ii/

142. Linked List Cycle II

public class Solution {
    public ListNode detectCycle(ListNode head) {
         ListNode fir=head;
        ListNode ans=null;
        HashMap<ListNode,Integer> h=new HashMap<>();
        while(fir!=null){
            if(h.get(fir.next)!=null){
                ans=fir.next;
                break;
            }
            h.put(fir,fir.val);
            fir=fir.next;
        }
        return ans;
        
    }
}
*********************************************************
//best**

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head,fast=head;
        ListNode sol=null;
        boolean flag=false;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
              flag=true;
            break;
            }
        }
        if(flag){
        slow=head;
        if(fast==head){
           sol=fast;
        }
        
        else{
            while(fast.next!=slow.next){
                slow=slow.next;
                fast=fast.next;
            }
             sol=fast.next;
        }
       
    }
        return sol;
}
}