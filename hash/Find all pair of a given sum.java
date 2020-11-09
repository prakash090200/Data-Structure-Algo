

/////Find all pairs with a given sum

import java.util.*;
import java.lang.*;
import java.io.*;


class Pair {
    int x;
    int y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class PairComparitor implements Comparator<Pair> {
    public int compare(Pair p1, Pair p2){
        return p1.x - p2.x;
    }
}

public class GfG { 
    
	public static void findPairs(int arr1[], int arr2[], int n, int m, int x) { 
        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>(); 
        TreeSet<Pair> pset = new TreeSet<Pair>(new PairComparitor());
        for (int i = 0; i < n; i ++)s.put(arr1[i], 0);
        for (int j = 0; j < m; j ++) 
            if (s.containsKey(x - arr2[j])) 
                pset.add(new Pair(x - arr2[j], arr2[j]));
        Iterator<Pair> it = pset.iterator();
        StringBuffer str = new StringBuffer();
        boolean flag=true;
        while(it.hasNext()){
            Pair p = it.next();
            str.append(p.x + " " + p.y);
            if(it.hasNext())str.append(", ");
            flag=false;
        }
        if(flag)str.append("-1");
        System.out.println(str);
    } 
    
	public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int m = Integer.parseInt(inputLine[1]);
		    int x = Integer.parseInt(inputLine[2]);
		    int[] arr1 = new int[n];
		    int[] arr2 = new int[m];
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++)arr1[i] = Integer.parseInt(inputLine[i]);
		    inputLine = br.readLine().trim().split(" ");
		    for(int i=0; i<m; i++)arr2[i] = Integer.parseInt(inputLine[i]);
		    findPairs(arr1, arr2, n, m, x);
		}
	}
}




