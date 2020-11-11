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
        if(one.next!=null)  //// in case of even no of element this action will be performed 
        two=two.next;
        return two.data;
    }
}