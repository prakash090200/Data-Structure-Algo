///First non-repeating character in a stream 

class GFG {
	public static void main (String[] args) throws IOException{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int test=Integer.parseInt(br.readLine());
	    while(test-->0)
	    {
	        int n=Integer.parseInt(br.readLine());
	        Queue<Character> q = new LinkedList<Character>();
	        String a[]=br.readLine().split(" ");
	        int freq[]=new int[26];
	        q.add(a[0].charAt(0));
	        freq[q.peek()-'a']++;
	        System.out.print(q.peek()+" ");
	        for(int i=1;i<n;i++)
	        {
	            char ch=a[i].charAt(0);
	            q.add(ch);
	            freq[ch-'a']++;
	            while(!q.isEmpty())
	            {
	                if(freq[q.peek()-'a']>1)
	                {
	                    q.remove();
	                }
	                else
	                    break;
	            }
	            if(q.isEmpty())
	            {
	                System.out.print("-1 ");
	            }
	            else
	            {
	                System.out.print(q.peek()+" ");
	            }
	        }
	        System.out.println();
	    }
	}
}