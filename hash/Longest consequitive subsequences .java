/*package whatever //do not write package name here */

//Longest consecutive subsequence 
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
		    int n=sc.nextInt();
		   int maxlen=1;
		   int max=1;
		  ArrayList<Integer> a=new ArrayList<>();
		    for(int i=0;i<n;i++)
		        a.add(sc.nextInt());
		Collections.sort(a);
		    for(int i=1;i<a.size();i++){
		        if(a.get(i)==a.get(i-1)+1)
		        max++;
		        else if(a.get(i)==a.get(i-1))
		        continue;
		        else{
		            max=1;
		        }
		        if(max>maxlen)
		        maxlen=max;
		    }
		   System.out.println(maxlen);
		}
	}
}