
https://leetcode.com/problems/implement-stack-using-queues/submissions/


/// Stack using two queues
class MyStack {

   private Queue<Integer> q1;
private Queue<Integer> q2;
private int top;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
        top=-1;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        top = x;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
         while (q1.size() > 1) {
             top=q1.poll();
             q2.add(top);
    }
        
    int ans=q1.remove();
   while(!q2.isEmpty())
       q1.add(q2.poll());
        
        
        return ans;
    }
    
    /** Get the top element. */
    public int top() {
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}
