
https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1#

//Detect cycle in a directed graph

class Solution 
{
    
    public boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj)
    {
        int ver[]=new int[v];
        int ver1[]=new int[v];
        for(int i=0;i<v;i++){
            if(ver[i]==0)
            if(dfs(i,ver,ver1,adj))
              return true;
        }
        return false;
    }
    public boolean dfs(int i,int[] ver,int [] ver1,ArrayList<ArrayList<Integer>> adj){
          
          ver[i]=1;
          ver1[i]=1;
          for(int it:adj.get(i)){
              if(ver[it]==0)
                  if(dfs(it,ver,ver1,adj)) 
                  return true;
              
              else if(ver[it]==1 && ver1[it]==1)
              return true;
          }
          ver1[i]=0;
          return false;
    }
}