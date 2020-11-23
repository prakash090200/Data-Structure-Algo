/// Stack using two queues

class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {   int ans=-1;
        int count=q1.size();
        
	    while(!q1.isEmpty() && count>1){
	        q2.add(q1.remove());
	        count--;
	       
	    }
	    if(!q1.isEmpty())
	    ans=q1.remove();
	    while(!q2.isEmpty()){
	        q1.add(q2.remove());
	    }
	    return ans;
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
	   q1.add(a);	
    }
}

