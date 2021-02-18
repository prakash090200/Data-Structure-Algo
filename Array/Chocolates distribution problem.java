/*package whatever //do not write package name here */

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
		    int [] a=new int[n];
		    for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();
		    Arrays.sort(a); 
		 
		    int min=Integer.MAX_VALUE;
		    int k=sc.nextInt();
		   
		    
		    for(int i=0;i<=n-k;i++)
		        res=Math.min(res,a[i+k-1]-a[i]);
		       
		    }
		    System.out.println(res);
		   
		}
	}
}