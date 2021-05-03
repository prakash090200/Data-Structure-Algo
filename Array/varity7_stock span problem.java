//Stock span problem
https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1#


Approach 1: o(n)

class Solution{
    public static int[] calculateSpan(int price[], int n)
    {
       Stack<Integer> s=new Stack<>();
       int ans[]=new int[n];
       ans[0]=1;
       s.push(0);
       for(int i=1;i<n;i++){
           while(!s.isEmpty() && price[s.peek()] <=price[i])
           s.pop();
           
           ans[i]=(s.isEmpty())?(i+1):(i-s.peek());
           s.push(i);
       }
     return ans;
      
    }
}


****************************************************************
Approach 2:o(n) 

class Solution{

public static int[] calculateSpan(int price[], int n)
    {
        int [] ans=new int[n];
        Stack<int[]> s=new Stack<>();
        ans[0]=1;
        s.push(new int[]{price[0],0});
        
        for(int i=1;i<n;i++){
            while(!s.isEmpty() && s.peek()[0]<=price[i])
            s.pop();
            ans[i]=(s.isEmpty())?i+1:i-s.peek()[1];
            s.push(new int[]{price[i],i});
        }
       
        return ans;
    }
    
}
*****************************************************************

https://leetcode.com/problems/online-stock-span/

/////901. Online Stock Span

class StockSpanner {

    Stack<int[]> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {

        int span = 1;

        while(!stack.isEmpty() && stack.peek()[0] <= price){
            span += stack.pop()[1];
        }
 
        stack.add(new int[]{price, span});
        return span;
    }
}