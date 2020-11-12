
//// Remove loop in Linked List 

class solver
{
    public static void removeLoop(Node head){
        
        Node fir=head;
        HashMap<Node,Integer> h=new HashMap<>();
        while(fir!=null){
            if(h.get(fir.next)!=null){
                fir.next=null;
                break;
            }
            h.put(fir,fir.data);
            fir=fir.next;
        }
        
        
    }
}