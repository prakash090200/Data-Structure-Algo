https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/submissions/

https://www.youtube.com/watch?v=R6-PnHODewY&ab_channel=AlgorithmsMadeEasy



class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    
        ListNode dummy = new ListNode(0, head);

      
        ListNode prev = dummy;
        
        while (head != null) {
       
            if (head.next != null && head.val == head.next.val) {
             
                while (head.next != null && head.val == head.next.val) 
                    head = head.next;    
                
   
                prev.next = head.next;     
            
            } 
            
            else 
                prev = prev.next;    
            
            head = head.next;
            
            
        }  
        return dummy.next;
    }
}