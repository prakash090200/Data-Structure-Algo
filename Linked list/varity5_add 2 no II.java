https://leetcode.com/problems/add-two-numbers-ii/
/// 445. Add Two Numbers II

class Solution {
    public static int carry=0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=cal(reverse(l1),reverse(l2));
        return reverse(ans);
    }
    
    public static ListNode cal(ListNode l1, ListNode l2){
        if(l1==null && l2==null){
        if(carry==0) 
            return null;
         
    }
    int res=0;
    if(l1!=null){
        res+=l1.val;
        l1=l1.next;
    }
    if(l2!=null){
        res+=l2.val;
        l2=l2.next;
    }
    res+=carry;
    if(res>=10){
        carry = 1;
        res = res%10;
    }
    else{
        carry=0;
    }
    ListNode head = new ListNode(res);
    head.next=cal(l1,l2);
    return head;
    }
    public static ListNode reverse(ListNode l){
        ListNode prev=null;
        ListNode cur=l;
        ListNode next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
}