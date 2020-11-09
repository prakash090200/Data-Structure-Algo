/// Array Subset of another array 

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
		    int n1=sc.nextInt();
		    int n2=sc.nextInt();
		    //int [] a1=new int[n1];
		    int [] a2=new int[n2];
		    HashMap<Integer,Integer> h=new HashMap<>();
		    for(int i=0;i<n1;i++)
		     h.put(sc.nextInt(),0);
		     for(int i=0;i<n2;i++)
		     a2[i]=sc.nextInt();
		     boolean flag=true;
		     for(int i=0;i<n2;i++){
		         if(!h.containsKey(a2[i]))
		             flag=false;
		        
		     }
		     if(!flag)
		     System.out.println("No");
		     else
		     System.out.println("Yes");
		}
	}
}