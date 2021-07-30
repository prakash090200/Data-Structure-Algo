https://leetcode.com/problems/is-graph-bipartite/submissions/


//using BFS

class Solution{
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n];
          Arrays.fill(colors,-1);
        
        for (int i = 0; i < n; i++) {
            if (colors[i] == -1) { 
                Queue<Integer> q = new LinkedList<>();
                colors[i] = 1;
                q.add(i);
                
                while (!q.isEmpty()) {
                    int cur = q.poll(); 

                    for (int x : graph[cur]) {
                        if (colors[x] == -1) {
                            colors[x] = 1-colors[cur]; 
                            q.add(x);
                        } else if (colors[x] == colors[cur])
                            return false;
                    }
                }

            }
        }
        return true;
    }
}
********************************************************

class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
    
        return check(graph,n);
        
        
    }
    public boolean check(int [][]graph,int n){
        int [] color=new int[n];
        Arrays.fill(color,-1);
        
        for(int i=0;i<n;i++){
            if(color[i]==-1){     
                if(!bfs(i,graph,n,color))
                    return false;
            }
        }
        return true;
    }
    public boolean bfs(int i,int [][] graph,int n,int [] color){
        Queue<Integer> q=new LinkedList<>();
        
        color[i]=1;
        q.add(i);
        while(!q.isEmpty()){
            int k=q.poll();
            for(int j:graph[k]){
                if(color[j]==-1){
                   color[j]=1-color[k];
                   q.add(j);
                }
                if(color[j]==color[k]) 
                   return false;
            }
        }
        return true;
    }
}



********************************************************
//using DFS

class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
    
        return check(graph,n);
        
        
    }
    public boolean check(int [][]graph,int n){
        int [] color=new int[n];
        Arrays.fill(color,-1);
        
        for(int i=0;i<n;i++){
            if(color[i]==-1){     
                if(!bfs(i,graph,n,color))
                    return false;
            }
        }
        return true;
    }
    public boolean bfs(int i,int [][] graph,int n,int [] color){
        
        if(color[i]==-1)
        color[i]=1;
            
            for(int j:graph[i]){
                if(color[j]==-1){
                   color[j]=1-color[i];
                    if(!bfs(j,graph,n,color)) return false;
                }
                if(color[j]==color[i]) return false;
            }
        
        return true;
    }
}

