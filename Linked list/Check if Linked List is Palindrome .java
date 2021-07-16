// Check if Linked List is Palindrome

class Palindrome
{
    boolean isPalindrome(Node head) 
    {
        //ArrayList<Integer> a=new ArrayList<Integer>();
        String s="";
     
     Node h=head;
     while(h!=null){
         s+=h.data;
         h=h.next;
     }
     if(s.equals(new StringBuffer(s).reverse().toString()))
     return true;
     else
     return false;
     
     
        
    }    
}

*************************************************************
class Solution {
    public boolean isPalindrome(ListNode head) {
       if(head!=null && head.next==null)
            return true;
       boolean flag=true;;
       ListNode fir=head;
       ListNode sec=head;
       
       while(fir.next!=null && fir.next.next!=null){
           fir=fir.next.next;
          
           sec=sec.next;
       }
      if(fir!=null)
      sec=sec.next;
      ListNode head2=reverse(sec);
      while(head!=sec && head2!=null){
          if(head.val==head2.val){
              head=head.next;
              head2=head2.next;
          }
          else{
          flag=false;
              break;
          }
      }
      return flag;
    }
    static ListNode reverse(ListNode head){
        ListNode cur=head;
        ListNode prev=null;
        ListNode nex=null;
        while(cur!=null){
            nex=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nex;
        }
        return prev;
    }

}