https://practice.geeksforgeeks.org/problems/game-of-death-in-a-circle1840/1#

//Find the Safe Position
class Solution {
    static int safePos(int n, int k) {
        ArrayList<Integer> a = new ArrayList<Integer>();
		    for(int i=1;i<=n;i++)
		        a.add(i);
		    int i = 0;
		    while(a.size()!=1)
		    {
		        i = (i + k) % a.size() - 1;
		        if(i < 0) 
		           i = a.size()-1;
		        a.remove(i);
		    }
		   
		   return a.get(0); 
    }
}