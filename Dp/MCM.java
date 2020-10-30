//MCM with memoization
/*class Main{
    public static int solve(int [] arr, int i,int j){
        int [][] t=new int[i+1][j+1];
        for(int k=0;k<=i;k++){
            for(int h=j;h<=j;h++){
                t[k][h]=-1;
            }
        }
        int min=Integer.MAX_VALUE;
            if(i>=j)
                return 0;
            if(t[i][j]!=-1)
                return t[i][j];
            for(int k=i;k<j;k++){
            int temp_ans=solve(arr,i,k)+solve(arr,k+1,j)+(arr[i-1]*arr[k]*arr[j]);
            if(temp_ans<min)
                min=temp_ans;
        }
        return t[i][j]=min;
    }
    public static void main(String [] args){
        int [] arr={10,20,30,40,30};
        System.out.println(solve(arr,1,arr.length-1));
    }
}
