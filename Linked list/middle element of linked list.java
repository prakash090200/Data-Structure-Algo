// Middle element of linked list

class Solution
{
    int getMiddle(Node head)
    {
        Node one =head;
        Node two =head;
        while(one.next!=null && one.next.next!=null){
            one=one.next.next;
            two=two.next;
        }
        if(one.next!=null)  
        two=two.next;
        return two.data;
    }
}