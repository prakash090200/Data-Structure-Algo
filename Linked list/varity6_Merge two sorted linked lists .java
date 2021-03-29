https://leetcode.com/problems/merge-two-sorted-lists/submissions/

///// Merge two sorted linked lists 

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp=new ListNode(0);
        ListNode  res=temp;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                temp.next=l1;
                temp=l1;
                l1=l1.next;
            }
            else{
                temp.next=l2;
                temp=l2;
                l2=l2.next;
            }
        }
            if(l1!=null) temp.next=l1;
            else
                temp.next=l2;
            
        
        return res.next;
    }
}