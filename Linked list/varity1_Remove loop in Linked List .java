https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1#

//// Remove loop in Linked List 

class solver
{
    public static void removeLoop(Node head){
        
        Node fir=head;
        HashMap<Node,Integer> h=new HashMap<>();
        while(fir!=null){
            if(h.containsKey(fir.next)){
                fir.next=null;
                break;
            }
            h.put(fir,fir.data);
            fir=fir.next;
        }
        
        
    }
}


**************************************************************
/// best 

class solver
{                                              
    public static void removeLoop(Node head){
        Node slow=head,fast=head;
        
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)
            break;
            
        }
        if(slow==fast){
        slow=head;
        if(fast==head){
            while(fast.next!=slow)
            fast=fast.next;
        }
        else{
            while(fast.next!=slow.next){
                slow=slow.next;
                fast=fast.next;
            }
        }
        fast.next=null;
       } 
    }
}