/// Quick Sort on Linked List 

https://practice.geeksforgeeks.org/problems/quick-sort-on-linked-list/1#




class GfG
{
    public static Node quickSort(Node head){
        
        Node temp=new Node(0);
        temp.next=head;
        if(head!=null){
            qsort(temp,null);
        }
        return temp.next;
        
        
    }
   static void qsort(Node temp, Node tail) {
        Node pivot = partition(temp,tail);
        if(temp.next!=pivot){
            qsort(temp,pivot);
        }
        if(pivot.next!=tail){
            qsort(pivot,tail);
        }
    }
    
    static Node partition(Node dummyNode, Node tail) {
         Node pivot = dummyNode.next;
         Node fastPre = dummyNode.next;
         
         while(fastPre.next != tail){
             if(fastPre.next.data<pivot.data){
                 Node tmp = fastPre.next;
                 fastPre.next = tmp.next;
                 
                 tmp.next = dummyNode.next;
                 dummyNode.next=tmp;
             }else{
                 fastPre=fastPre.next;
             }
         }
         return pivot;
    }
    
    
}