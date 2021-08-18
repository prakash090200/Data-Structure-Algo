https://leetcode.com/problems/maximal-rectangle/submissions/

////85. Maximal Rectangle in a binary matrix


class Solution {
    public int maximalRectangle(char[][] matrix) {
             int n=matrix.length;
        
       int m=(n!=0)?matrix[0].length:0;
        int []add=new int[m];
        int max=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<matrix[i].length;j++){
                if((int)(matrix[i][j]-'0')==0)
                    add[j]=0;
                    
                else
                add[j]=add[j]+(matrix[i][j]-'0');
            }
            
           max=Math.max(largestRectangleArea(add),max);  
            
        }
        return max;
    }
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