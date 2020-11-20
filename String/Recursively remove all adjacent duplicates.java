import java.util.*;
import java.lang.*;
import java.io.*;

////Recursively remove all adjacent duplicates 

class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(sc.readLine());
		while(t-- >0){
		    String s=sc.readLine();
		    System.out.println(solve(s));
		    
		}
	}
	public static String solve(String s){
	     char c='\0';
		    int c1='\0';
		    int key=0;
		    String str="";
		    int len=s.length();
		    for(int i=0;i<len-1;i++){
		        c=s.charAt(i);
		        c1=s.charAt(i+1);
		        if(c==c1){
		            while(i+1 <s.length() && s.charAt(i)==s.charAt(i+1)){
		                key=1;
		                i++;
		                continue;
		            }
		            
		        }
		        else
		          str+=c;
		        
		    }
		    
		   if(len>=2 && s.charAt(len-1)!=s.charAt(len-2))   //// very ip line
		   str+=s.charAt(len-1);
		   if(len==1)          ////// very imp line
		   str+=s.charAt(len-1);
		   
		   if(key==1)
		   str=solve(str);
		 
		  return str;
	}
}