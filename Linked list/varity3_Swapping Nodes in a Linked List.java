https://leetcode.com/problems/swapping-nodes-in-a-linked-list/
///Swapping Nodes in a Linked List

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null) return null;
        ListNode cur=head;
        int n=0;
        ListNode temp1=null;
        int temp2=0;
        int count=0;
        while(cur!=null){
            count++;
            if(count==k)
                temp1=cur;
            cur=cur.next;
         }
        
        count-=k;
        cur=head;
        int i=0;
        while(i++<count && cur!=null){
            cur=cur.next;
        }
        temp2=cur.val;
       
        cur.val=temp1.val;
        temp1.val=temp2;
        return head;
        
    }
}