/*package whatever //do not write package name here */
//Subarray with given sum
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
		    int n=sc.nextInt();
		    int sum=sc.nextInt();
		    int start=0;
		    int end=0;
		    int [] a=new int[n+1];
		    int temp=0;
		    
		    for(int i=0;i<n;i++)
		    a[i]=sc.nextInt();
		    
		    label:
		    for(int i=0;i<n;i++){
		        temp=sum;
		        for(int j=i;j<n+1;j++){
		        if(temp>0){
		            
		        temp-=a[j];
		        }
		        
		        else if(temp==0){
		      //System.out.println(a[j]+"hey");
		            start=i+1;
		            end=j;
		            break label;
		        }
		        else
		      break;
		        
		    }
		}
		if(start==0 && end==0)
		System.out.println(-1);
		else
		System.out.println(start+" "+end);
	}
}
}