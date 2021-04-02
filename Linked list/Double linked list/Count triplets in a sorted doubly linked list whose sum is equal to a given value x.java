https://www.geeksforgeeks.org/count-triplets-sorted-doubly-linked-list-whose-sum-equal-given-value-x/

/////Count triplets in a sorted doubly linked list whose sum is equal to a given value x




static int countPairs(Node first, Node second, int value)
{
    int count = 0;
  

    while (first != null && second != null &&
           first != second && second.next != first) {
  
        
        if ((first.data + second.data) == value) {
  
          
            count++;
  
        
            first = first.next;
  
      
            second = second.prev;
        }
  

        else if ((first.data + second.data) > value)
            second = second.prev;
  
       
        else
            first = first.next;
    }
  

    return count;
}
  

static int countTriplets(Node head, int x)
{

    if (head == null)
        return 0;
  
    Node current, first, last;
    int count = 0;
  
   
    last = head;
    while (last.next != null)
        last = last.next;
  

    for (current = head; current != null; current = current.next) {

        first = current.next;
  

        count += countPairs(first, last, x - current.data);
    }
  
s
    return count;
}
  