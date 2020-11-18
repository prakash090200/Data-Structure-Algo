/////First element to occur k times 

class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(sc.readLine());
	    while(t-- >0){
	        int ans=-1;
	        String s1[]=sc.readLine().split(" ");
	   int n=Integer.parseInt(s1[0]);
	   int k=Integer.parseInt(s1[1]);
	   String s2[]=sc.readLine().split(" ");
		LinkedHashMap<Integer,Integer> h=new LinkedHashMap<>();
		int [] a=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=Integer.parseInt(s2[i]);
	        if(!h.containsKey(a[i]))
		    h.put(a[i],1);
		    else
		    h.put(a[i],h.get(a[i])+1);
		}
		for(int i:h.keySet()){
		    if(h.get(i)==k){
		        ans=i;
		        break;
		    }
		}
		System.out.println(ans);
		
	    }
	}
	
}