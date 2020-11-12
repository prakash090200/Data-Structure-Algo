// Detect Loop in linked list

class Solution {
    public static boolean detectLoop(Node head){
     Node first=head;
     Node second=head;
     boolean val=false;
     while(first!=null && first.next!=null){
         first=first.next.next;
         second=second.next;
         if(first==second){      //// Additional part rest same as middle element of linked list
           val=true;
           break;
         }
     }
     return val;
     
    }
}