https://leetcode.com/problems/reverse-nodes-in-k-group/submissions/

25. Reverse Nodes in k-Group (note not to reverse element with count less than k)



class Solution {
  
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        int cnt=0;
        while(temp!=null && cnt++ <k)
            temp=temp.next;
        if(temp==null && cnt++<k)
            return head;
        else{
        ListNode prev=null;
        ListNode next=null;
        ListNode cur=head;
        int count=0;
        while(count++<k && cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
       
        head.next=(cur!=null)?reverseKGroup(cur,k):null;
        return prev;
        }
        
    }
}