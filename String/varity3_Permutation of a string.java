https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1

////All possible Permutations of a given string 

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){	
		    String s=sc.next();
		    char [] c=s.toCharArray();
		    Arrays.sort(c);
		     s=new String(c);
		    solve("",s);
		    System.out.println();
		}
}
public static void solve(String prefix, String s){
    int n=s.length();
    if(n==0)
    System.out.print(prefix+" ");
    else
    for(int i=0;i<n;i++){
        solve(prefix+s.charAt(i),s.substring(0,i)+s.substring(i+1,n));
    }
}
}