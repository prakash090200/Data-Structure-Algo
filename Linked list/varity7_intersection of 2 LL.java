https://leetcode.com/problems/intersection-of-two-linked-lists/submissions/

////Intersection Point in Y Shapped Linked Lists 


//best**
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA,temp2=headB;
        while(temp1!=null||temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1==null?headB:temp1.next;
            temp2=temp2==null?headA:temp2.next;
        }
        return null;
        
        
    }
}

*************************************************************************
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int c1=len(headA);
        int c2=len(headB);
        int d=0;
        if(c1>c2){
            d=c1-c2;
            while(d-- >0)
            headA=headA.next;
        }
        else{
            d=c2-c1;
            while(d-- >0)
            headB=headB.next;
        }
        while(headA!=null && headB!=null){
            if(headA==headB)
            return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return null;
         
         
         
	}
	static int len(ListNode a){
	    int count=0;
	    while(a!=null){
	        count++;
	        a=a.next;
	    }
	    return count;
	}
        
    
}