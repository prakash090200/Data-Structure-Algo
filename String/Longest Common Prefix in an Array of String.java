import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static String sol(String s1,String s2){
        String sk="";
        int min=Math.min(s1.length(),s2.length());
        for(int i=0;i<min;i++){
            if(s1.charAt(i)==s2.charAt(i))
            sk+=s1.charAt(i);
            else
            break;
        }
        return sk;
    }
    public static void solve(String[] ss, int n){
        String prefix=ss[0];
        for(int i=1;i<n;i++){
            prefix=sol(prefix,ss[i]);
        }
        if(prefix.length()==0)
        System.out.println(-1);
        else
        System.out.println(prefix);
    }
	public static void main (String[] args) throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(bf.readLine());
		while(t-->0){
		    int n=Integer.parseInt(bf.readLine());
		String s=bf.readLine();
		String [] ss=s.split("[ ]");
		solve(ss,n);
		}
		
	}
}