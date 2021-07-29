https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1#

time: o(n+e)
space: o(n)+o(n)+o(n+e)

class Solution
{
    Function to return Breadth First Traversal of given graph.
    public ArrayListInteger bfsOfGraph(int v,ArrayListArrayListInteger adj)
    {  
        ArrayListInteger ans=new ArrayList();
        boolean [] vis=new boolean[v];
        for(int i=0;i1;i++){
            if(!vis[i]){
                QueueInteger q=new LinkedList();
                q.add(i);
                vis[i]=true;
              while(!q.isEmpty()){
                  int cur=q.poll();
                  ans.add(cur);
                  for(int itadj.get(cur)){
                      if(!vis[it]){
                          q.add(it);
                          vis[it]=true;
                      }
                  }
              }
            }
        }
        return ans;
    }
}