https://leetcode.com/problems/word-search/submissions/




class Solution {
    public boolean exist(char[][] board, String word) {
        
        for(int x = 0; x < board.length; x++){
		    for(int y = 0; y < board[0].length; y++){
				//start from every cell, 
				//if any of found the word in the grid, return true
                if(exist(board, x, y, word, 0)) return true;
            }
        }
        
		//if not found
        return false;
    }
    
    public boolean exist(char[][] board, int x, int y, String word, int wordIndex){

        if(wordIndex == word.length()) return true;
        
		//check boundary of grid
        if( x < 0 || x >= board.length ||  y < 0 ||  y >= board[0].length) return false;
		
		char currCellChar =  board[x][y];
		
		//check currently, this cell is being used for dfs
		if(currCellChar == '$') return false;
		 
		 //check cell char is equal to  current char of word
		if(currCellChar != word.charAt(wordIndex)) return false;
        
		//mark this cell as used
        board[x][y] = '$';
        
        boolean isExist = exist(board, x + 1, y, word, wordIndex + 1) ||    // direction UP 
			exist(board, x - 1, y, word, wordIndex + 1) ||    // direction DOWN
			exist(board, x, y + 1, word, wordIndex + 1) ||   // direction RIGHT
		exist(board, x, y - 1, word, wordIndex + 1);     // direction LEFT
            

	//for the backtracking, try different possibilty,  now unmark this cell as free, 	
        board[x][y] = currCellChar;
        
        return isExist;
    }
    
}