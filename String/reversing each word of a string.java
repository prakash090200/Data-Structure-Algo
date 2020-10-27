/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(bf.readLine());
		while(t-->0){
		    String s=bf.readLine();
		    String ss[]=s.split("[.]");
		    for(int i=ss.length-1;i>0;i--){
		        System.out.print(ss[i]+".");
		        
		    }
		    System.out.println(ss[0]);
		}
	}
}