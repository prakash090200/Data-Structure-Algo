https://practice.geeksforgeeks.org/problems/queue-using-two-stacks/1#

//https://www.youtube.com/watch?v=xSa0sD-RqMg&ab_channel=TECHDOSE

//// Queue using two Stacks 



--> push or enqueue  o(1)
--> pop or dequeue   o(n)
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

******************************************************

//best**

o(1) --> pop
o(1) --> push

class MyQueue {
Stack<Integer> s1;
Stack<Integer> s2;
int front;
    
    /** Initialize your data structure here. */
    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if (s1.isEmpty())
        front = x;
        s1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
       if (s2.isEmpty()) {
        while (!s1.isEmpty())
            s2.push(s1.pop());
    }
         return  s2.pop();           
  
    }
    
    /** Get the front element. */
    public int peek() {
        if (!s2.isEmpty()) 
            return s2.peek();
    
        return front;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
         return s1.isEmpty() && s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */