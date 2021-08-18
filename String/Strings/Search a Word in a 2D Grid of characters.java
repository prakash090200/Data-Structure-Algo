https://practice.geeksforgeeks.org/problems/find-the-string-in-grid0111/1
/// Search a word in a 2d grid character


class Solution
{
    public int[][] searchWord(char[][] grid, String word)
    {   
        int n=grid.length;
        int m=grid[0].length;
        ArrayList<int[]> aa=new ArrayList<>();
         StringBuilder sb = new StringBuilder();
		    boolean flag = true;
		    for(int i=0;i<n;i++){
		        for(int j=0;j<m;j++){
		            if(search(grid,i,j,word)){
		                aa.add(new int[]{i,j});
		                flag = false;
		            }
		        }
		    }
		    int [][]ans=new int[aa.size()][2];
		    for(int i=0;i<aa.size();i++)
		    for(int j=0;j<2;j++)
		    ans[i][j]=aa.get(i)[j];
		   return ans;
		    
	}


static int[] x = {0,0,1,1,1,-1,-1,-1};
	static int[] y = {1,-1,0,1,-1,0,1,-1};
	
	static boolean search(char[][] arr,int row,int col,String str){
	    if(arr[row][col]!=str.charAt(0)){
	        return false;
	    }
	    int len = str.length();
	    for(int dir=0;dir<8;dir++){
	        int xx = row+x[dir]; int yy = col+y[dir];
	        int i;
	        for(i=1;i<len;i++){
	            if(xx<0 || xx>=arr.length || yy<0 || yy>=arr[0].length){
	                break;
	            }
	            if(arr[xx][yy]!=str.charAt(i)){
	                break;
	            }
	            xx+=x[dir]; yy+=y[dir];
	        }
	        if(i==len){
	            return true;
	        }
	        
	    }
	    return false;
	    
	}
}
