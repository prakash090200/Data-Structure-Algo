/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static ArrayList<ArrayList<Integer>> calculate(int a[], int n, int sum){
        ArrayList<ArrayList<Integer>>sol=new ArrayList<>();
	    ArrayList<Integer>temp=new ArrayList<>();
	    if(n<4)
	        return sol;
	    Arrays.sort(a);
	    int k,l;
	    for(int i=0;i<n-3;i++){
	        if(i!=0 && a[i]==a[i-1])
	          continue;
	        for(int j=i+1;j<n-2;j++){
	          if(j!=i+1 && a[j]==a[j-1])
	            continue;
	            k=j+1;
	            l=n-1;
	            while(l>k){
	                if((a[i]+a[j]+a[k]+a[l])==sum){
	                    temp=new ArrayList<>();
	                    temp.add(a[i]);temp.add(a[j]);temp.add(a[k]);temp.add(a[l]);
	                    k++;
	                    l--;
	                    sol.add(temp);
	                    while(k<l &&a[l]==a[l+1] )
	                        l--;
	 
	                    while(k<l &&a[k]==a[k-1])
	                        k++;
	                    
	                }
	                else if((a[i]+a[j]+a[k]+a[l])>sum)
	                    l--;
	                else
	                    k++;
	                
	            }
	        }
	    }
	    return sol;
	}
	public static void main (String[] args) {
	   Scanner s=new Scanner (System.in);
	   int t=s.nextInt();
	   while(t-- >0){
	       int n=s.nextInt();
	       int sum=s.nextInt();
	       int arr[]=new int[n];
	       for(int i=0;i<n;i++)
	         arr[i]=s.nextInt();
	         ArrayList<ArrayList<Integer>> aa=calculate(arr,n,sum);
	         if(aa.size()==0)
	         System.out.print(-1);
	         else{
	             for(int i=0;i<aa.size();i++){
	                 for(int j=0;j<aa.get(i).size();j++){
	                     System.out.print(aa.get(i).get(j)+" ");
	                     
	             }
	             System.out.print("$");
	         }
	  }
	  
	  System.out.println();
	}
}

}