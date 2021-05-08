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
                add[j]=add[j]+(int)(matrix[i][j]-'0');
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