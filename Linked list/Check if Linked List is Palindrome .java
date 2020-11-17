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

