https://leetcode.com/problems/copy-list-with-random-pointer/


////Copy List with Random Pointer

//BEST**
// Time - O(N)
// Space - O(1)

class Solution {
    public Node copyRandomList(Node head) {
        
        if (head == null) return null;
        Node curr = head;
        
        
        while (curr != null){
            
            Node next = curr.next;
            Node random = curr.random;
            
            curr.next = new Node(curr.val,next,random);
            
            curr = curr.next.next;
        }
               
      
        Node newHead = head.next;
        
        
        curr = head;
        while (curr != null){
            
            
            Node next = curr.next;
            
            if(next.random != null)
                next.random=next.random.next;
            
            curr = curr.next.next;
        }
        
        
        curr = head;
        while (curr != null){
           
            Node copy = curr.next;
            curr.next = copy.next;
           
            if(copy.next != null)
                copy.next=curr.next.next;
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
        
        Node copy = new Node(-1);
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