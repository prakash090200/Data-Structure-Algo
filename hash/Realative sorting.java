/*package whatever //do not write package name here */

//Relative Sorting
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
		   int a1[]=new int[n1];
		   int a2[]=new int[n2];
		   for(int i=0;i<n1;i++)
		   a1[i]=sc.nextInt();
		   for(int i=0;i<n2;i++)
		   a2[i]=sc.nextInt();
		   solve(a1,a2,n1,n2);
		   System.out.println();
		}
	}
	public static void solve(int [] a1,int [] a2, int n1,int n2){
	    LinkedHashMap<Integer,Integer> lh=new LinkedHashMap<>();
	    ArrayList<Integer> a=new ArrayList<>();
	    for(int i:a2)
	    lh.put(i,0);
	    for(int i:a1){
	        if(lh.containsKey(i))
	        lh.put(i,lh.get(i)+1);
	        else
	        a.add(i);
	    }
	    for(Map.Entry<Integer,Integer>m:lh.entrySet()){
	        int b1=m.getKey();
	        int b2=m.getValue();
	        for(int i=0;i<b2;i++)
	        System.out.print(b1+" ");
	    }
	    Collections.sort(a);
	    for(int i:a)
	    System.out.print(i+" ");
	}
}