https://practice.geeksforgeeks.org/problems/perfect-sum-problem5633/1#

//count of subset sum

class Solution{

	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    int [][]dp=new int[n+1][sum+1];
	   
        for(int i=0;i<=n;i++)
            dp[i][0]=1;
	   
	   for(int i=1;i<=n;i++){
	       for(int j=1;j<=sum;j++){
	           if(arr[i-1]<=j){
	               dp[i][j]=dp[i-1][j-arr[i-1]]%1000000007+dp[i-1][j]%1000000007;
	           }
	           else dp[i][j]=dp[i-1][j]%1000000007;
	       }
	   }
	   return dp[n][sum]%1000000007;
	} 
}