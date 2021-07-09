https://practice.geeksforgeeks.org/problems/get-minimum-element-from-stack/1#

////Get minimum element from stack 

// push => 2*(incoming ele)-MinElemengt;
//pop=> 2*(minelement)-stack.peek();


class GfG
{
    int minEle;
    Stack<Integer> s=new Stack<>();

 
    int getMin()
    {
	if(s.isEmpty())
	return -1;
	else 
	return minEle;
    }
    
    /*returns poped element from stack*/
    int pop()
    {  
        int ans=-1;
	    if(s.isEmpty()){
	        return ans;
	    }
	    else{
	        if(s.peek() > minEle)
	        ans=s.pop();
	        else{
	            ans=minEle;
	            minEle=2*minEle-s.peek();
	           s.pop();
	        }
	   }
	   return ans;
    }

    /*push element x into the stack*/
    void push(int x)
    {
	if(s.isEmpty()){
	s.push(x);
	minEle=x;
	}
	else{
	    if(x >= minEle){
	       s.push(x);    
	    }
	    else{
	        s.push(2*x-minEle);
	        minEle=x;
	    }
	}
    }	
}

