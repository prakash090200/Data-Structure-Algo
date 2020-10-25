
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
