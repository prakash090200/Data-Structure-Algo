https://leetcode.com/problems/largest-rectangle-in-histogram/submissions/

//Largest Rectangle in Histogram


class Solution {
    public int largestRectangleArea(int[] heights) {
        int []right=gright(heights);
        int []left=gleft(heights);
        int maxx=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            maxx=Math.max(heights[i]*(right[i]-left[i]-1),maxx);
        }
        return maxx;
    }
    public static int []  gright(int [] arr){
       Stack<Integer> s=new Stack<>();
        int [] r=new int[arr.length];
          Arrays.fill(r,arr.length);
        for(int i=0;i<arr.length;i++){
        while(!s.isEmpty() && arr[i]<arr[s.peek()])
            r[s.pop()]=i;
            s.push(i);
            }
        return r;
    }
    public static int []  gleft(int [] arr){
         Stack<Integer> s=new Stack<>();
      
        int [] l=new int[arr.length];
          Arrays.fill(l,-1);
        for(int i=arr.length-1;i>=0;i--){
        while(!s.isEmpty() && arr[i]<arr[s.peek()])
            l[s.pop()]=i;
            s.push(i);
            }
        return l;
    }
}