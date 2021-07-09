//Stock span problem
https://practice.geeksforgeeks.org/problems/stock-span-problem-1587115621/1#


Approach 1: o(n)

class Solution{
    public static int[] calculateSpan(int price[], int n)
    {
       Stack<Integer> s=new Stack<>();
       int ans[]=new int[n];
       
       for(int i=0;i<n;i++){
           while(!s.isEmpty() && price[i] >=price[s.peek()] )
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
        
        
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && price[i]>=s.peek()[0])
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

        while(!stack.isEmpty() && price>=stack.peek()[0]){
            span += stack.pop()[1];
        }
 
        stack.add(new int[]{price, span});
        return span;
    }
}
