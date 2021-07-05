https://leetcode.com/problems/roman-to-integer/

https://www.geeksforgeeks.org/converting-roman-numerals-decimal-lying-1-3999/

//Roman Number to Integer 
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int getval(char c){
        if(c=='I')
        return 1;
        else if(c=='V')
        return 5;
        else if(c=='X')
        return 10;
        else if(c=='L')
        return 50;
        else if(c=='C')
        return 100;
        else if(c=='D')
        return 500;
        else if (c=='M')
        return 1000;
        else
        return -1;
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0){
		    int res=0;
		    String s=sc.next();
		    for(int i=0;i<s.length();i++){
		        int r1=getval(s.charAt(i));
		        if(i+1<s.length()){
		        int r2=getval(s.charAt(i+1));
		        if(r1>=r2)
		        res+=r1;
		        else {
		        res+=r2-r1;
		        i++;
		        }
		        }
		        else{
		            res+=r1;
		            
		        }
		        
		    }
		    System.out.println(res);
		}
	}
}