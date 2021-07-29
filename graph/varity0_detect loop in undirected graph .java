
//using DFS
class Solution
{
    
    public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj)
    {   
        boolean []vis=new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i])
                if(dfs(i,-1,vis,adj))
                return true;
        
        }
        return false;
    }
    public boolean dfs(int i,int p,boolean [] vis, ArrayList<ArrayList<Integer>> adj){
         
          vis[i]=true;
          
              
              for(int it:adj.get(i)){
                  if(!vis[it]){
                      if(dfs(it,i,vis,adj))
                      return true;
                     
                  }
                  else if(it!=p) return true;
              }
          
          return false;
    }
    
}


*****************************************

//using BFS

class Solution
{
    
    public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj)
    {   
        boolean []vis=new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i])
                if(bfs(i,vis,adj))
                return true;
                
        
                
            
        }
        return false;
    }
    public boolean bfs(int i,boolean [] vis, ArrayList<ArrayList<Integer>> adj){
          Queue<abc> q=new LinkedList<>();
          q.add(new abc(i,-1));
          vis[i]=true;
          while(!q.isEmpty()){
              int fir=q.peek().fir;
              int sec=q.peek().sec;
              q.poll();
              for(int it:adj.get(fir)){
                  if(!vis[it]){
                      q.add(new abc(it,fir));
                      vis[it]=true;
                  }
                  else if(it!=sec) return true;
              }
          }
          return false;
    }
    
}

class abc{
    int fir;
    int sec;
    abc(int f,int s){
        fir=f;
        sec=s;
    }
}