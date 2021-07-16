//Flattening a Linked List
https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1#


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



****************************************************************

// best

class GfG
{

  Node merge(Node a, Node b){
        Node temp=new Node(0);
        Node res=temp;
        while(a!=null && b!=null){
            if(a.data<b.data){
                temp.bottom=a;
                temp=temp.next;
                a=a.bottom;
            }
            else{
                temp.bottom=b;
                temp=temp.next;
                b=b.bottom;
            }
        }
        if(a!=null) 
        temp.bottom=a;
        else
        temp.bottom=b;
        
        return res.bottom;
    }
   Node flatten(Node root)
    {
	if(root==null || root.next==null)
	    return root;
	 
	root.next=flatten(root.next);
	
	root=merge(root,root.next);
	return root;
	
    }
}