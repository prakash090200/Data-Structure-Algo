https://practice.geeksforgeeks.org/problems/depth-first-traversal-for-a-graph/1#

time: o(n+e)
space: o(n+e)+o(n)

class Solution
{
    
    public ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj)
    {
       ArrayList<Integer> ans=new ArrayList<>();
       boolean [] vis=new boolean[v];
       for(int i=0;i<v;i++){
           if(!vis[i]){
               dfs(i,vis,adj,ans);
           }
       }
       return ans;
    }
    public void dfs(int i,boolean [] vis,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans){
        ans.add(i);
        vis[i]=true;
        for(int it:adj.get(i)){
            if(!vis[it]){
                dfs(it,vis,adj,ans);
            }
        }
    }
}