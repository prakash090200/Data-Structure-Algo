// easy way 
import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry;

class GFG {
	public static void main (String[] args) {
			Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n1=in.nextInt();
		    int []a= new int[n1];
		    int l;
		    for( l=0;l<n1;l++)
		        a[l]=in.nextInt();
		    TreeMap<Integer,Integer> map=new TreeMap();
		    for( l=0;l<n1;l++)
		    if(!map.containsKey(a[l]))
		        map.put(a[l],1);
		    else
		        map.put(a[l],map.get(a[l])+1);
		    while(n1!=0)
		    {
		       
		    int max_count = 0, res = -1; 
          
            for(Entry<Integer, Integer> val : map.entrySet()) 
             { 
                  if (max_count < val.getValue()) 
                { 
                res = val.getKey(); 
                max_count = val.getValue();
                
                } 
             } 
            for(int k=0;k<max_count;k++)
                    System.out.print(res+" ");
            n1=n1-1;
            map.remove(res);
		    }
		
                System.out.println("");
		    }
	}
}

**********************************************************************************8
// using Arraylist with objects in hashmap 
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static class Node{
        int no,cnt;
        Node(int n,int c){
            no=n;
            cnt=c;
        }
    }
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int n=sc.nextInt();
	        int arr[]=new int[n];
	        for(int i=0;i<n;i++)
	        arr[i]=sc.nextInt();
	        HashMap<Integer,Integer> hm=new HashMap<>();
	        for(int num:arr){
	            if(!hm.containsKey(num))
	            hm.put(num,1);
	            else
	            hm.put(num,hm.get(num)+1);
	        }
/// Very imp
	        ArrayList<Node> al=new ArrayList<>();
	        for(Map.Entry<Integer,Integer> me:hm.entrySet())
	        al.add(new Node(me.getKey(),me.getValue()));
	        Collections.sort(al,new Comparator<Node>(){
	            public int compare(Node a,Node b){
	                if(a.cnt!=b.cnt)
	                return b.cnt-a.cnt;
	                return a.no-b.no;
	            }
	        });
	        for(Node nd:al){
	            int n1=nd.no,n2=nd.cnt;
	            for(int i=0;i<n2;i++)
	            System.out.print(n1+" ");
	        }
	        System.out.println();
	    }
	}
}

// using treemap and treeset as value in hashmap
***********************************************************************
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    while(t>0){
	        int n=s.nextInt();
	        int arr[]=new int[n];
	        int max=0;
	        for(int i=0;i<n;i++){
	            arr[i]=s.nextInt();
	            max=(arr[i]>max)?arr[i]:max;
	            
	        }
	        // System.out.println("curr max "+max);
	        int freq[]=new int[max+1];
	        for(int i=0;i<n;i++){
	            freq[arr[i]]++;
	        }
	        TreeMap<Integer,TreeSet<Integer>> m=new TreeMap<>();
	        for(int i=1;i<freq.length;i++){
	            if(freq[i]!=0 && m.containsKey(freq[i])){
                    TreeSet<Integer>temp=m.get(freq[i]);
                    temp.add(i);
                    m.put(freq[i],temp);
	            }
	            else {
	                TreeSet <Integer> temp=new TreeSet<>();
	                temp.add(i);
	                m.put(freq[i],temp);
	            }
            }
           for(int i:m.descendingKeySet()){
               if(i!=0)
               for(int j:m.get(i)) {
                   for(int f=i;f>0;f--)
                   System.out.print(j+" ");
               }
           }System.out.println();
           
            t--;
	    }
	}


    
}
