https://practice.geeksforgeeks.org/problems/word-wrap1646/1


class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int n=sc.nextInt();
	        int[] a=new int[n+1];
	        for(int i=1;i<=n;i++)
	            a[i]=sc.nextInt();
	        int w=sc.nextInt();
	        int[][] dp=new int[n+1][n+1];
	        for(int i=1;i<=n;i++){
	            int sum=0;
	            for(int j=i;j<=n;j++){
	                sum+=a[j];
	                if(j!=i) sum++;
	                if(j==n && w-sum>0)
	                    dp[i][j]=0;
	                else if(sum<=w)  
	                    dp[i][j]=(int)Math.pow(w-sum,2);
	                else
	                    dp[i][j]=Integer.MAX_VALUE;
	            }
	        }
	        int[] l=new int[n+1],p=new int[n+1];
	        Arrays.fill(l,Integer.MAX_VALUE);
	        l[0]=0;
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                if(dp[j][i]!=Integer.MAX_VALUE && l[i]>l[j-1]+dp[j][i]){
	                    l[i]=l[j-1]+dp[j][i];
	                    p[i]=j;
	                }
	            }
	        }
            print(p,n);    
            System.out.println();
	    }
	 }
	 
	 public static void print(int p[], int n){
	     if(p[n]==1)
	        System.out.print(p[n]+" "+n + " ");
	     else{
	         print(p,p[n]-1);
	         System.out.print(p[n]+" "+n+" ");
	     }
	 }
}