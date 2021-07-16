https://leetcode.com/problems/copy-list-with-random-pointer/

https://www.youtube.com/watch?v=VNf6VynfpdM&ab_channel=takeUforward

////Copy List with Random Pointer

//BEST**
// Time - O(N)
// Space - O(1)

class Solution {
    public Node copyRandomList(Node head) {
        
        if (head == null) return null;
        Node curr = head;
        
        
        while (curr != null){
            
            curr.next = new Node(curr.val,curr.next,curr.random);
            
            curr = curr.next.next;
        }
               
      
        Node newHead = head.next;
        
        
        curr = head;
        while (curr != null){
         
            if(curr.next.random != null)
                curr.next.random=curr.random.next;
            
            curr = curr.next.next;
        }
        
        
        curr = head;
        
        while (curr != null){
           
            Node copy=curr.next;
            curr.next = copy.next;
           
            if(copy.next != null)
                copy.next=copy.next.next;
            
            curr = curr.next;
        }
        
        return newHead;
    }
}

**********************************************************8




// Time - O(N)
// Space - O(N)
class Solution {
    public Node copyRandomList(Node head) {
        
        Node copy = new Node(0);
        Node node = copy;
        Map<Node, Node> map = new HashMap<>();
        
        while (head != null) {
            node.next = new Node(head.val);
            node.next.random = head.random;
            map.put(head, node.next);
            head = head.next;
            node = node.next;
        }
        
        node = copy.next;
        
        while (node != null) {
            node.random = map.get(node.random);
            node = node.next;
        }
        
        return copy.next;
    }
}