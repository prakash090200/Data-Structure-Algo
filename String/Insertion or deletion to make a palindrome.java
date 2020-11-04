/*package whatever //do not write package name here */

// insertion or deletion to make a palindrome(dp)(lsc)

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
		    String s1=sc.next();
		    solve(s1,new StringBuffer(s1).reverse().toString(),s1.length());
		    
		}
	}
	public static void  solve(String s1,String s2,int n){
	    //int n=s1.length();
	    int [][]dp=new int[n+1][n+1];
	    for(int i=0;i<=n;i++)
	    dp[0][i]=0;
	    
	    for(int i=0;i<=n;i++)
	    dp[i][0]=0;
	    
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n;j++){
	            if(s1.charAt(i-1)==s2.charAt(j-1))
	            dp[i][j]= 1+dp[i-1][j-1];
	            else
	            dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
	        }
	    }
	    System.out.println(s1.length()-dp[n][n]);
	}
}