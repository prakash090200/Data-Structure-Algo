https://www.geeksforgeeks.org/remove-duplicates-from-an-unsorted-linked-list/

static void removeDuplicate(node head) 
    {
      
        HashSet<Integer> hs = new HashSet<>();
     
   
        node current = head;
        node prev = null;
        while (current != null) 
        {
            int curval = current.val;
             
           
            if (hs.contains(curval)) {
                prev.next = current.next;
            } 
            else {
                hs.add(curval);
                prev = current;
                 }
            current = current.next;
        }
 
    }