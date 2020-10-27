
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
		while(t-- >0){
		    String s1=sc.next();
		    char []c1=s1.toCharArray();
		    String s2=sc.next();
		    char []c2=s2.toCharArray();
		    Arrays.sort(c1);
		    Arrays.sort(c2);
		    s1=new String(c1);
		    s2=new String(c2);
		    if(s1.equalsIgnoreCase(s2))
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		    
		}
	}
}