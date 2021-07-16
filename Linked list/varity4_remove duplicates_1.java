
https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/


class Solution {
   public ListNode deleteDuplicates(ListNode head) {
    ListNode current = head;
    while (current != null && current.next != null) {
        if (current.next.val == current.val) {
            current.next = current.next.next;
        } else {
            current = current.next;
        }
    }
    return head;
}
}
**************************************
class Solution {
   public ListNode deleteDuplicates(ListNode head) {
    ListNode cur= head;
       ListNode prev=null;
       HashSet<Integer> h=new HashSet<>();
    while(cur!=null){
        int value=cur.val;
        if(h.contains(value))
            prev.next=cur.next;
        else{
            h.add(cur.val);
            prev=cur;
        }
        cur=cur.next;
   }
    return head;
}
}