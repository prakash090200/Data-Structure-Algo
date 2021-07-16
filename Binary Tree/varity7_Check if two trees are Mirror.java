
https://www.geeksforgeeks.org/check-if-two-trees-are-mirror/

//Check if two trees are Mirror

class BinaryTree
{
    Node a, b;
     
 
    boolean areMirror(Node a, Node b)
    {
     
        if (a == null && b == null)
            return true;
 
       
        if (a == null || b == null)
            return false;
 
        
        return a.data == b.data
                && areMirror(a.left, b.right)
                && areMirror(a.right, b.left);
    }

*****************************************************************
https://practice.geeksforgeeks.org/problems/check-mirror-in-n-ary-tree1528/1#



class Solution {
    static int checkMirrorTree(int n, int m, int[] a, int[] b) {
        
ArrayList<Stack<Integer>> ar=new ArrayList<>();
		    ArrayList<Queue<Integer>> br=new ArrayList<>();
		    for(int i=0;i<=n;i++)
		    {
		        ar.add(new Stack<Integer>());
		    }
		    for(int i=0;i<=n;i++)
		    {
		        br.add(new LinkedList<Integer>());
		    }
		    for(int i=0;i<2*m;i+=2)
		    {
		        ar.get(a[i]).add(a[i+1]);
		    }
		    for(int i=0;i<2*m;i+=2)
		    {
		        br.get(b[i]).add(b[i+1]);
		    }
		    int res=fun(ar,br);
		    return res;
		    
		}
	
	
	static int fun(ArrayList<Stack<Integer>> ar,ArrayList<Queue<Integer>> br)
    {
        int n=ar.size();
        int m=br.size();
        int i=1;
        Stack<Integer> st=new Stack<>();
        Queue<Integer> q=new LinkedList<>();
        while(i<n&&i<m)
        {
            st=ar.get(i);
            q=br.get(i);
            while(!st.isEmpty()&&!q.isEmpty())
            {
                if(st.peek()==q.peek())
                {
                    st.pop();
                    q.remove();
                }
                else
                {
                    return 0;
                }
            }
            if(!st.isEmpty()||!q.isEmpty())
            {
                return 0;
            }
            i++;
        }
        return 1;
    }
}



		   