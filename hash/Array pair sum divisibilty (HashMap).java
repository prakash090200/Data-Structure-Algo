import java.lang.*;
import java.io.*;



class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    int k=sc.nextInt();
		    System.out.println(apsd(arr,n,k)?"True":"False");
		}
	}
	static boolean apsd(int arr[],int n,int k){
	    if(n%2==1)
	    return false;
	    HashMap<Integer,Integer> hm=new HashMap<>();
	    for(int i=0;i<n;i++){
	        int rem=arr[i]%k;
	        if(!hm.containsKey(rem))
	        hm.put(rem,1);
	        else
	        hm.put(rem,hm.get(rem)+1);
	    }
	    for(int i=0;i<n;i++){
	        int rem=arr[i]%k;
	        if(2*rem==k&&hm.get(rem) % 2 == 1)
	        return false;
	        else if (hm.get(k - rem) != hm.get(rem)&&rem!=0) 
            return false;
	    }
	    return true;
	}
}