https://practice.geeksforgeeks.org/problems/smallest-number-on-left3403/1

https://www.hackerearth.com/practice/data-structures/stacks/basics-of-stacks/practice-problems/algorithm/nearest-smaller-element-929558b4/


///Smallest number on left

class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        List<Integer> l=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        l.add(-1);
        s.push(a[0]);
        for(int i=1;i<n;i++){
            while(!s.isEmpty() && s.peek()>=a[i])
            s.pop();
            
            l.add((s.isEmpty())?-1:s.peek());
            s.push(a[i]);
        }
        return l;
    }
}