https://practice.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

// Chocolate Distribution Problem
// sliding window

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
		    int n=sc.nextInt();
		    int []arr=new int[n];
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    int k=sc.nextInt();
		    Arrays.sort(arr);
		    int res=Integer.MAX_VALUE;
		 
		    for(int i=0;i<=(n-k);i++){
		        res=Math.min(res,arr[i+k-1]-arr[i]);
		        
		    }
		    System.out.println(res);
		}
	}
}

**************************************
class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        long res=Long.MAX_VALUE;
         Collections.sort(a);
         for(int i=0;i<=(a.size()-m);i++){
             res=Math.min(res,a.get(i+(int)m-1)-a.get(i));
         }
         return res;
         
         
    }
}