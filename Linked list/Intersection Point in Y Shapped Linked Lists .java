////Intersection Point in Y Shapped Linked Lists 

class Intersect
{
	int intersectPoint(Node headA, Node headB)
	{
        int c1=len(headA);
        int c2=len(headB);
        int d=0;
        if(c1>c2){
            d=c1-c2;
            while(d-- >0)
            headA=headA.next;
        }
        else{
            d=c2-c1;
            while(d-- >0)
            headB=headB.next;
        }
        while(headA!=null && headB!=null){
            if(headA==headB)
            return headA.data;
            headA=headA.next;
            headB=headB.next;
        }
        return -1;
         
         
         
	}
	static int len(Node a){
	    int count=1;
	    while(a!=null){
	        count++;
	        a=a.next;
	    }
	    return count;
	}
}