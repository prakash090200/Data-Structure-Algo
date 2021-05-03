https://leetcode.com/problems/largest-rectangle-in-histogram/submissions/
//Largest Rectangle in Histogram


class Solution {
    public int largestRectangleArea(int[] heights) {
        
        if (heights.length == 0) {
            return 0;
        }
        
        if (heights.length == 1) {
            return heights[0];
        }
        
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        
        int top;
        int area;
        int maxArea = -1;
        
        int i = 0;
        
        while (i < n) {
            
            if (stack.empty() || heights[stack.peek()] <= heights[i]) {
                stack.push(i++);
            } else {
                top = stack.pop();
                
                if (stack.isEmpty()) {
                    area = heights[top] * i;
                } else {
                    area = heights[top] * (i - stack.peek() - 1);
                }
                
                maxArea = Math.max(maxArea, area);
            }
        }
        
        while (!stack.isEmpty()) {
            
            top = stack.pop();
                
            if (stack.isEmpty()) {
                area = heights[top] * i;
            } else {
                area = heights[top] * (i - stack.peek() - 1);
            }
                
            maxArea = Math.max(maxArea, area);            
        }
        
        
        return maxArea;
    }
}

***************************************************

class Solution {
    public int largestRectangleArea(int[] heights) {
        int []right=gright(heights);
        int []left=gleft(heights);
        int maxx=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            maxx=(int)Math.max(heights[i]*(right[i]-left[i]-1),maxx);
        }
        return maxx;
    }
    public static int []  gright(int [] arr){
        int n=arr.length;
        int []right=new int[n];
        Stack<int[]> s=new Stack<>();
        right[n-1]=n;
        s.push(new int[]{arr[n-1],n-1});
        for(int i=n-2;i>=0;i--){
        while(!s.isEmpty() && s.peek()[0]>=arr[i])
            s.pop();
         right[i]=(s.isEmpty())?n:s.peek()[1];
            s.push(new int[]{arr[i],i});
            }
        
        return right;
    }
    public static int []  gleft(int [] arr){
        int n=arr.length;
        int []left=new int[n];
        Stack<int[]> s=new Stack<>();
        s.push(new int[]{arr[0],0});
        left[0]=-1;
        for(int i=1;i<n;i++){
        while(!s.isEmpty() && s.peek()[0]>=arr[i])
            s.pop();
         left[i]=(s.isEmpty())?-1:s.peek()[1];
            s.push(new int[]{arr[i],i});
            }
          
        return left;
    }
}