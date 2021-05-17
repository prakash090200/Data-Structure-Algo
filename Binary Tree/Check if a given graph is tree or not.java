https://www.geeksforgeeks.org/check-given-graph-tree/

//Check if a given graph is tree or not

class Graph 
{ 
    private int V; // No. of vertices 
    private LinkedList<Integer> adj[]; 
  
    
    Graph(int v) 
    { 
        V = v; 
        adj = new LinkedList[V]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList<Integer>(); 
    } 
  
    
    void addEdge(int v,int w) 
    { 
        adj[v].add(w); 
        adj[w].add(v); 
    } 
  
    
    boolean isCyclicUtil(int v, boolean visited[], int parent) 
    { 
       
        visited[v] = true; 
        Integer i; 
  
         
        Iterator<Integer> it = adj[v].iterator(); 
        while (it.hasNext()) 
        { 
            i = it.next(); 
  
            
            if (!visited[i]) 
            { 
                if (isCyclicUtil(i, visited, v)) 
                    return true; 
            } 
  
            else if (i != parent) 
            return true; 
        } 
        return false; 
    } 
  
     
    boolean isTree() 
    { 
        
        boolean visited[] = new boolean[V]; 
        for (int i = 0; i < V; i++) 
            visited[i] = false; 
  
        
        if (isCyclicUtil(0, visited, -1)) 
            return false; 
  
       
        for (int u = 0; u < V; u++) 
            if (!visited[u]) 
                return false; 
  
        return true; 
    } 
  
    
    public static void main(String args[]) 
    { 
        
        Graph g1 = new Graph(5); 
        g1.addEdge(1, 0); 
        g1.addEdge(0, 2); 
        g1.addEdge(0, 3); 
        g1.addEdge(3, 4); 
        if (g1.isTree()) 
            System.out.println("Graph is Tree"); 
        else
            System.out.println("Graph is not Tree"); 
  
        Graph g2 = new Graph(5); 
        g2.addEdge(1, 0); 
        g2.addEdge(0, 2); 
        g2.addEdge(2, 1); 
        g2.addEdge(0, 3); 
        g2.addEdge(3, 4); 
  
        if (g2.isTree()) 
            System.out.println("Graph is Tree"); 
        else
            System.out.println("Graph is not Tree"); 
  
    } 
} 