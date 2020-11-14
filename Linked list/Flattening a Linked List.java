//Flattening a Linked List
class GfG
{  
    Node flatten(Node root)
    {  
        PriorityQueue<Node> pq=new PriorityQueue<>(new Comparator<Node>(){
             public int compare(Node a,Node b){
                 return a.data-b.data;
             }
            
        });
        
    Node temp=root;
    Node innerll=null;
    while(temp!=null){
        innerll=temp;
        while(innerll!=null){
            pq.add(innerll);
            innerll=innerll.bottom;
        }
        temp=temp.next;
    }
Node head=null;
Node tail=null;
while(!pq.isEmpty()){
    Node te=pq.remove();
    if(head==null){
        head=te;
        tail=te;
    }
    else{
        tail.bottom=te;
        tail=te;
    }
}
return head;
    }
}