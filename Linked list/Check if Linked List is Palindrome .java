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
class Palindrome
{
    
    boolean isPalindrome(Node head) 
    {
       boolean flag=true;;
       Node fir=head;
       Node sec=head;
       Node temp=null;
       while(fir.next!=null && fir.next.next!=null){
           fir=fir.next.next;
           temp=sec;
           sec=sec.next;
       }
      if(fir!=null)
      sec=sec.next;
      Node head2=reverse(sec);
      while(head!=sec.next && head2!=null){
          if(head.data==head2.data){
              head=head.next;
              head2=head2.next;
          }
          else
          flag=false;
      }
      return flag;
    }
    static Node reverse(Node head){
        Node cur=head;
        Node prev=null;
        Node nex=null;
        while(cur!=null){
            nex=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nex;
        }
        return prev;
    } 
}