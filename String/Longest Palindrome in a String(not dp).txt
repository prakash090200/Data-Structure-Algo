import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
   public static void solve(String s, int n){
       int start=0;
       int low,high;
       int maxlen=0;
       for(int i=1;i<n;i++){
           low=i-1;
           high=i;
           while(low>=0 && high<n && s.charAt(low)==s.charAt(high)){
               if(high-low+1>maxlen){
                   start=low;
                   maxlen=high-low+1;
               }
               --low;
               ++high;
           }
           
           low=i-1;
           high=i+1;
           while(low>=0 && high<n && s.charAt(low)==s.charAt(high)){
               if(high-low+1>maxlen){
                   start=low;
                   maxlen=high-low+1;
               }
               --low;
               ++high;
           }
           
       }
       int end;
       if(maxlen==0)
       System.out.println(s.charAt(0));
       else{
       end=start+maxlen-1;
       //System.out.println(start+""+end);
       System.out.println(s.substring(start,end+1));
       }
       
   }
public static void main (String[] args) throws IOException{
BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
int t=Integer.parseInt(bf.readLine());
while(t-- >0){
String s=bf.readLine();
solve(s,s.length());
		    
   }
 }
}