 https://www.geeksforgeeks.org/reverse-doubly-linked-list-groups-given-size/



static Node push(Node head, Node new_node) 
    { 
       
        new_node.prev = null; 
  
     
        new_node.next = head; 
  
       
        if (head != null) 
            head.prev = new_node; 
  
      
        head = new_node; 
        return head; 
    } 
  
  
static Node revListInGroupOfGivenSize(Node head, int k) 
    { 
        Node current = head; 
        Node next = null; 
        Node newHead = null; 
        int count = 0; 
  
      
        while (current != null && count < k) 
        { 
            next = current.next; 
            newHead = push(newHead, current); 
            current = next; 
            count++; 
        } 
  
       
        if (next != null) 
        { 
            head.next = revListInGroupOfGivenSize(next, k); 
            head.next.prev = head; 
        } 
  
     
        return newHead;



 
    }