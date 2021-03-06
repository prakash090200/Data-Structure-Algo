https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1

////Add 1 to a number represented as linked list 

class Solution
{  
    public static int calcarry(Node head){
        if(head==null) return 1;
        int res=head.data+calcarry(head.next);
        head.data=res%10;
        return res/10;
    }
    public static Node addOne(Node head) 
    { 
        int carry=calcarry(head);
        
        if(carry >0){
           Node c=new Node(carry);
            c.next=head;
            return c;
        }
        return head;
    }
}
