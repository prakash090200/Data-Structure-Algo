  static boolean isSafe( int maze[][], int i, int j) 
    { 
        return (i < N && j < N && maze[i][j] == 1); 
    } 
  
    static boolean solveMaze(int maze[][]) 
    { 
        int sol[][] = new int[N][N]; 
  
        if (solveMazeRec(maze, 0, 0, sol) == false) { 
            System.out.print("Solution doesn't exist"); 
            return false; 
        } 
  
        printSolution(sol); 
        return true; 
    } 
  
    static boolean solveMazeRec(int maze[][], int i, int j, int sol[][]) 
    {  
        if (i == N - 1 && j == N - 1 && maze[i][j] == 1) { 
            sol[i][j] = 1; 
            return true; 
        } 
  
        if (isSafe(maze, i, j) == true) {  
            sol[i][j] = 1; 
  
            if (solveMazeRec(maze, i + 1, j, sol)) 
                return true; 
  
            if (solveMazeRec(maze, i, j + 1, sol)) 
                return true; 
   
            sol[i][j] = 0; 
        } 
  
        return false; 
    } 
    
    public static void main(String args[])
    {
        int maze[][] = { { 1, 0, 0, 0 }, 
                         { 1, 1, 0, 1 }, 
                         { 0, 1, 0, 0 }, 
                         { 1, 1, 1, 1 } }; 
  
        N = maze.length; 
        solveMaze(maze); 
    }
}