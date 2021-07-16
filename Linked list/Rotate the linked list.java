https://leetcode.com/problems/rotate-list/submissions/
https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1



// anticlock wise

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        
        ListNode tail=head;
        int length=0;
        
        while(tail.next!=null){
            length++;
            tail=tail.next;
        }
        length++;
        
        tail.next=head;
        int rotate=length-(k%length);
        
        tail=head;
        while(rotate-->1){
            tail=tail.next;
        }
        head=tail.next;
        tail.next=null;
        
        return head;
    }
}

*********************************************************

// clockwise

class Solution{
    
    public Node rotate(Node head, int k) {
      if(head==null || head.next==null) return head;
        
        Node tail=head;
        int length=0;
        
        while(tail.next!=null){
            length++;
            tail=tail.next;
        }
        length++;
        
        tail.next=head;
        int rotate=k;
        
        tail=head;
        while(rotate-->1){
            tail=tail.next;
        }
        head=tail.next;
        tail.next=null;
        
        return head;
    }        
}

**********************************************************
/// rotate the linked list clockwise .

class Rotate{
    
    public Node rotate(Node head, int k) {
       Node temp=head;
       Node prev=null;
       for(int i=0;i<k;i++){
           prev=temp;
           temp=temp.next;
       }
       if(temp==null)return head;
       Node newhead=temp;
       
       while(newhead.next!=null)
       newhead=newhead.next;

       newhead.next=head;
       prev.next=null;
       return temp;
    }        
}

***************************************************
or
// best

// Anticlock wise

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode cur=head;
        int n=0;
        if(k==0 || head==null) return head;
        while(cur!=null){
            n++;
            cur=cur.next;
        }
        k=k%n;
         cur=head;
        ListNode temp=null;
        for(int i=0;i<n-k;i++){
            temp=cur;
            cur=cur.next;
        }
        if(cur==null) return head;
           
        ListNode newh=cur;
        while(newh.next!=null){
            newh=newh.next;
        }
        newh.next=head;
        temp.next=null;
        return cur;
        
    }
}

********************************************************