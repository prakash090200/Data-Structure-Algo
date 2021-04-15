
https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1#
//  Next Greater Element

Approach 1: BRUTE FORCE O(n2)



Approach 2: O(n)

class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        long[] a=new long[n];
        Stack<Long> ss=new Stack<>();
        a[n-1]=-1;
        ss.push(arr[n-1]);
        
        
        for(int i=n-2;i>=0;i--){
            while( !ss.isEmpty() && arr[i]>ss.peek()){
                ss.pop();
            }
            a[i]=(!ss.isEmpty())?ss.peek():-1;
                
            
            ss.push(arr[i]);    
            
        }
        return a;
      
       
    } 
}