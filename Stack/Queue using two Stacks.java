https://practice.geeksforgeeks.org/problems/queue-using-two-stacks/1#

//// Queue using two Stacks 

class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    
    void Push(int x)
    {
	   s1.push(x);
    }
	
    
    
    int Pop()
    {   int val=-1;
        while(!s1.empty()){
            s2.push(s1.pop());
        }
        if(!s2.isEmpty())
         val=s2.pop();
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return val;
    }
	   
    }
