
https://practice.geeksforgeeks.org/problems/does-robot-moves-circular/0#

////Does robot moves circular 

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
		    String s=sc.next().toUpperCase().trim();
		    int x=0;
		    int y=0;
		    int N=0;
		    int W=3;
		    int E=1;
		    int S=2;
		    int dir=N;
		    for(int i=0;i<s.length();i++){
		        char c=s.charAt(i);
		        
		        if(c=='R')
		            dir=(int)(dir+1)%4;
		           
		        
		        else if(c=='L')
		            dir=(int)(4+dir-1)%4;
		           
		        
		        else if(c=='G'){
		      
		            if(dir==N)
		                y=y+1;
		                
		            
		            if(dir==W)
		                x=x-1;
		                
		            
		            if(dir==S)
		                y=y-1;
		                	            
		            if(dir==E)
		                x=x+1;
		               
		        } 
		            
		        }
		        if(x==0 && y==0)
		        System.out.println("Circular");
		        else
		        System.out.println("Not Circular");
		        
		    
		}
	}
}