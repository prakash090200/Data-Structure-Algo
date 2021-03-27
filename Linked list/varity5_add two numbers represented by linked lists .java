https://leetcode.com/problems/add-two-numbers/

////Add two numbers represented by linked lists

class Solution {
    public static int carry=0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
    if(l1==null && l2==null){
        if(carry==0) 
            return null;
         else
        return  new ListNode(carry);
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
    res = res+ carry;
    if(res>=10){
        carry = 1;
        res = res%10;
    }
    else{
        carry=0;
    }
    ListNode head = new ListNode(res);
    head.next = addTwoNumbers(l1,l2);
    return head;
}
}